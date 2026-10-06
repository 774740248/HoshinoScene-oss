package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v21 {
    public static final java.lang.String b = a.ii1.e("/data/system/orms", "/orms_core_config.xml");

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.charset.Charset f619a = java.nio.charset.StandardCharsets.UTF_8;

    public static java.lang.String b(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b2 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
    public static void c(org.w3c.dom.Element element) {
        org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
        int length = element.getAttributes().getLength();
        for (int i = 0; i < length; i++) {
            org.w3c.dom.Node item = attributes.item(i);
            java.lang.String nodeName = item.getNodeName();
            nodeName.getClass();
            char c = 65535;
            switch (nodeName.hashCode()) {
                case -2135856285:
                    if (nodeName.equals("maxCpuCore")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2135764420:
                    if (nodeName.equals("maxCpuFreq")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1449569371:
                    if (nodeName.equals("maxCpuCoreHigh")) {
                        c = 2;
                        break;
                    }
                    break;
                case -955112720:
                    if (nodeName.equals("cpuBouncingEnable")) {
                        c = 3;
                        break;
                    }
                    break;
                case -408809543:
                    if (nodeName.equals("minGpuCore")) {
                        c = 4;
                        break;
                    }
                    break;
                case -408717678:
                    if (nodeName.equals("minGpuFreq")) {
                        c = 5;
                        break;
                    }
                    break;
                case 336143029:
                    if (nodeName.equals("minCpuCore")) {
                        c = 6;
                        break;
                    }
                    break;
                case 336234894:
                    if (nodeName.equals("minCpuFreq")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1414158439:
                    if (nodeName.equals("maxGpuCore")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1414250304:
                    if (nodeName.equals("maxGpuFreq")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1785308670:
                    if (nodeName.equals("maxCpuFreqHigh")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                case 1:
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                case 7:
                case '\n':
                    item.setNodeValue("-1,-1,-1");
                    break;
                case 3:
                    item.setNodeValue("0");
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                case 5:
                case '\b':
                case '\t':
                    item.setNodeValue("-1");
                    break;
            }
        }
    }

    public static java.lang.String f() {
        java.lang.String str = "";
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update("ORMS".getBytes("UTF-8"));
            str = b(messageDigest.digest());
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (java.security.NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        return str.substring(0, 16);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|8|9|(8:12|(1:14)|15|16|(1:18)|19|20|10)|21|22|(4:26|27|(1:29)|30)|35|(1:37)(1:41)|38|39))|44|6|7|8|9|(1:10)|21|22|(5:24|26|27|(0)|30)|35|(0)(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0032, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:27:0x009b, B:29:0x00c3, B:30:0x00db), top: B:26:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v21.a():java.lang.String");
    }

    public final java.lang.String d(java.lang.String str) {
        byte[] bytes = f().getBytes();
        try {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(java.util.Base64.getMimeDecoder().decode(str));
            byte[] bArr = new byte[wrap.get()];
            wrap.get(bArr);
            byte[] bArr2 = new byte[wrap.remaining()];
            wrap.get(bArr2);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bytes, "AES"), new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(bArr2);
            java.util.Arrays.fill(bArr, (byte) 0);
            java.util.Arrays.fill(bArr2, (byte) 0);
            return new java.lang.String(doFinal, this.f619a);
        } catch (java.lang.Exception e) {
            throw new java.lang.Exception("could not decrypt", e);
        }
    }

    public final java.lang.String e(java.lang.String str) {
        byte[] bytes = f().getBytes();
        try {
            byte[] bArr = new byte[12];
            new java.security.SecureRandom().nextBytes(bArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, new javax.crypto.spec.SecretKeySpec(bytes, "AES"), new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(str.getBytes(this.f619a));
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(13 + doFinal.length);
            allocate.put((byte) 12);
            allocate.put(bArr);
            allocate.put(doFinal);
            return java.util.Base64.getEncoder().encodeToString(allocate.array());
        } catch (java.lang.Exception e) {
            throw new java.lang.Exception(e);
        }
    }
}
