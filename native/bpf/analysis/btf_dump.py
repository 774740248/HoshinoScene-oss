#!/usr/bin/env python3
"""Minimal BTF (BTF v1) parser for reversing BPF object files.

Decodes the .BTF section header, the string table, and all type records
(BTF_KIND_STRUCT/UNION members with bit offsets, INT, TYPEDEF, PTR, ARRAY,
FUNC_PROTO, VAR, DATASEC, etc.). This is used purely as evidence for the
source-recovery effort.
"""
import struct
import sys

BTF_KIND_UNKN = 0
BTF_KIND_INT = 1
BTF_KIND_PTR = 2
BTF_KIND_ARRAY = 3
BTF_KIND_STRUCT = 4
BTF_KIND_UNION = 5
BTF_KIND_ENUM = 6
BTF_KIND_FWD = 7
BTF_KIND_TYPEDEF = 8
BTF_KIND_VOLATILE = 9
BTF_KIND_CONST = 10
BTF_KIND_RESTRICT = 11
BTF_KIND_FUNC = 12
BTF_KIND_FUNC_PROTO = 13
BTF_KIND_VAR = 14
BTF_KIND_DATASEC = 15
BTF_KIND_FLOAT = 16
BTF_KIND_DECL_TAG = 17
BTF_KIND_TYPE_TAG = 18
BTF_KIND_ENUM64 = 19

KIND_NAMES = {
    0: "UNKN", 1: "INT", 2: "PTR", 3: "ARRAY", 4: "STRUCT", 5: "UNION",
    6: "ENUM", 7: "FWD", 8: "TYPEDEF", 9: "VOLATILE", 10: "CONST",
    11: "RESTRICT", 12: "FUNC", 13: "FUNC_PROTO", 14: "VAR", 15: "DATASEC",
    16: "FLOAT", 17: "DECL_TAG", 18: "TYPE_TAG", 19: "ENUM64",
}


def cstr(blob, off):
    end = blob.find(b"\x00", off)
    if end < 0:
        end = len(blob)
    return blob[off:end].decode("utf-8", "replace")


def parse(path):
    data = open(path, "rb").read()
    magic, version, flags, hdr_len = struct.unpack_from("<HBBI", data, 0)
    type_off, type_len, str_off, str_len = struct.unpack_from("<IIII", data, 8)
    print(f"# BTF magic=0x{magic:x} version={version} flags={flags} hdr_len={hdr_len}")
    print(f"# type_off={type_off} type_len={type_len} str_off={str_off} str_len={str_len}")
    blob = data[hdr_len + str_off: hdr_len + str_off + str_len]
    types = data[hdr_len + type_off: hdr_len + type_off + type_len]
    out = []
    pos = 0
    tid = 1
    n = len(types)
    while pos < n:
        name_off, info, size_type = struct.unpack_from("<III", types, pos)
        pos += 12
        kind = (info >> 24) & 0x1F
        vlen = info & 0xFFFF
        kflag = (info >> 31) & 1
        name = cstr(blob, name_off)
        line = [f"[{tid:3d}] {KIND_NAMES.get(kind, kind):9s} vlen={vlen:2d} kflag={kflag} '{name}' size_type={size_type}"]
        if kind in (BTF_KIND_STRUCT, BTF_KIND_UNION):
            for _ in range(vlen):
                m_name_off, m_type, m_off = struct.unpack_from("<III", types, pos)
                pos += 12
                mname = cstr(blob, m_name_off)
                bits = m_off & 0xFFFFFF
                bitf = m_off >> 24
                line.append(f"        .{mname}: type={m_type} bit_off={bits} ({bits//8}B) bits={bitf}")
        elif kind == BTF_KIND_INT:
            enc = struct.unpack_from("<I", types, pos)[0]
            pos += 4
            line.append(f"        encoding=0x{enc:x}")
        elif kind == BTF_KIND_ENUM:
            for _ in range(vlen):
                e_name_off, e_val = struct.unpack_from("<Ii", types, pos)
                pos += 8
                line.append(f"        {cstr(blob, e_name_off)} = {e_val}")
        elif kind == BTF_KIND_ENUM64:
            for _ in range(vlen):
                e_name_off, e_lo, e_hi = struct.unpack_from("<III", types, pos)
                pos += 12
                e_val = (e_hi << 32) | e_lo
                line.append(f"        {cstr(blob, e_name_off)} = {e_val}")
        elif kind == BTF_KIND_ARRAY:
            elem_type, index_type, nelems = struct.unpack_from("<III", types, pos)
            pos += 12
            line.append(f"        elem_type={elem_type} index_type={index_type} nelems={nelems}")
        elif kind == BTF_KIND_FUNC_PROTO:
            for _ in range(vlen):
                p_name_off, p_type = struct.unpack_from("<II", types, pos)
                pos += 8
                line.append(f"        param '{cstr(blob, p_name_off)}' type={p_type}")
        elif kind == BTF_KIND_VAR:
            linkage = struct.unpack_from("<I", types, pos)[0]
            pos += 4
            line.append(f"        linkage={linkage}")
        elif kind == BTF_KIND_DATASEC:
            for _ in range(vlen):
                v_type, v_off, v_size = struct.unpack_from("<III", types, pos)
                pos += 12
                line.append(f"        var_type={v_type} off={v_off} size={v_size}")
        elif kind == BTF_KIND_DECL_TAG:
            pos += 4
        out.append("\n".join(line))
        tid += 1
    print("\n".join(out))


if __name__ == "__main__":
    parse(sys.argv[1])
