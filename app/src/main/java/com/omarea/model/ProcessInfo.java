package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ProcessInfo {
    public java.lang.String cGroup;
    public float cpu;
    public java.lang.String cpuSet;
    public java.lang.String cpusAllowed;
    public java.lang.String ctxtSwitches;
    public long mem;
    public java.lang.String name;
    public java.lang.String oomAdj;
    public java.lang.String oomScore;
    public java.lang.String oomScoreAdj;
    public int pid;
    public int ppid;
    public long res;
    public long rss;
    public long shr;
    public long swap;
    public java.lang.String user;
    public java.lang.String state = "";
    public java.lang.String command = "";
    public java.lang.String cmdline = "";
    public java.lang.String friendlyName = "";

    public float getCpu() {
        return this.cpu;
    }

    public java.lang.String getState() {
        java.lang.String str = this.state;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 68:
                if (str.equals("D")) {
                    c = 0;
                    break;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    c = 1;
                    break;
                }
                break;
            case 75:
                if (str.equals("K")) {
                    c = 2;
                    break;
                }
                break;
            case 80:
                if (str.equals("P")) {
                    c = 3;
                    break;
                }
                break;
            case 82:
                if (str.equals("R")) {
                    c = 4;
                    break;
                }
                break;
            case 83:
                if (str.equals("S")) {
                    c = 5;
                    break;
                }
                break;
            case 84:
                if (str.equals("T")) {
                    c = 6;
                    break;
                }
                break;
            case 87:
                if (str.equals("W")) {
                    c = 7;
                    break;
                }
                break;
            case 88:
                if (str.equals("X")) {
                    c = '\b';
                    break;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    c = '\t';
                    break;
                }
                break;
            case 116:
                if (str.equals("t")) {
                    c = '\n';
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return "D (device I/O)";
            case 1:
                return "I (idle)";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return "K (wakekill)";
            case 3:
                return "P (parked)";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return "R (running)";
            case 5:
                return "S (sleeping)";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return "T (stopped)";
            case 7:
                return "W (waking)";
            case '\b':
                return "X (dead)";
            case '\t':
                return "Z (zombie)";
            case '\n':
                return "t (trace stop)";
            case 11:
                return "x (dead)";
            default:
                return "Unknown";
        }
    }
}
