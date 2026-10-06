package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z1 extends java.util.HashMap {
    public final /* synthetic */ int c = 2;

    public z1() {
        put(20803, "Qualcomm");
        put(5045, "ARM");
        put(4112, "Imagination");
        put(4318, "NVIDIA");
        put(32902, "Intel");
        put(4098, "AMD");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        boolean containsKey;
        boolean containsKey2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        containsKey = super.containsKey(str);
                        break;
                    default:
                        containsKey = super.containsKey(str);
                        break;
                }
                return containsKey;
            case 1:
                if (!(obj instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str2 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        containsKey2 = super.containsKey(str2);
                        break;
                    default:
                        containsKey2 = super.containsKey(str2);
                        break;
                }
                return containsKey2;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        boolean containsValue;
        boolean containsValue2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        containsValue = super.containsValue(str);
                        break;
                    default:
                        containsValue = super.containsValue(str);
                        break;
                }
                return containsValue;
            case 1:
                if (!(obj instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str2 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        containsValue2 = super.containsValue(str2);
                        break;
                    default:
                        containsValue2 = super.containsValue(str2);
                        break;
                }
                return containsValue2;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.entrySet();
                    default:
                        return super.entrySet();
                }
            case 1:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.entrySet();
                    default:
                        return super.entrySet();
                }
            default:
                return super.entrySet();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String)) {
                    return null;
                }
                java.lang.String str3 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str = (java.lang.String) super.get(str3);
                        break;
                    default:
                        str = (java.lang.String) super.get(str3);
                        break;
                }
                return str;
            case 1:
                if (!(obj instanceof java.lang.String)) {
                    return null;
                }
                java.lang.String str4 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str2 = (java.lang.String) super.get(str4);
                        break;
                    default:
                        str2 = (java.lang.String) super.get(str4);
                        break;
                }
                return str2;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String)) {
                    return obj2;
                }
                java.lang.String str3 = (java.lang.String) obj;
                java.lang.String str4 = (java.lang.String) obj2;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str = (java.lang.String) super.getOrDefault(str3, str4);
                        break;
                    default:
                        str = (java.lang.String) super.getOrDefault(str3, str4);
                        break;
                }
                return str;
            case 1:
                if (!(obj instanceof java.lang.String)) {
                    return obj2;
                }
                java.lang.String str5 = (java.lang.String) obj;
                java.lang.String str6 = (java.lang.String) obj2;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str2 = (java.lang.String) super.getOrDefault(str5, str6);
                        break;
                    default:
                        str2 = (java.lang.String) super.getOrDefault(str5, str6);
                        break;
                }
                return str2;
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.keySet();
                    default:
                        return super.keySet();
                }
            case 1:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.keySet();
                    default:
                        return super.keySet();
                }
            default:
                return super.keySet();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String)) {
                    return null;
                }
                java.lang.String str3 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str = (java.lang.String) super.remove(str3);
                        break;
                    default:
                        str = (java.lang.String) super.remove(str3);
                        break;
                }
                return str;
            case 1:
                if (!(obj instanceof java.lang.String)) {
                    return null;
                }
                java.lang.String str4 = (java.lang.String) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        str2 = (java.lang.String) super.remove(str4);
                        break;
                    default:
                        str2 = (java.lang.String) super.remove(str4);
                        break;
                }
                return str2;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.size();
                    default:
                        return super.size();
                }
            case 1:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.size();
                    default:
                        return super.size();
                }
            default:
                return super.size();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection values() {
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.values();
                    default:
                        return super.values();
                }
            case 1:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return super.values();
                    default:
                        return super.values();
                }
            default:
                return super.values();
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        boolean remove;
        boolean remove2;
        int i = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.lang.String) || !(obj2 instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = (java.lang.String) obj2;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        remove = super.remove(str, str2);
                        break;
                    default:
                        remove = super.remove(str, str2);
                        break;
                }
                return remove;
            case 1:
                if (!(obj instanceof java.lang.String) || !(obj2 instanceof java.lang.String)) {
                    return false;
                }
                java.lang.String str3 = (java.lang.String) obj;
                java.lang.String str4 = (java.lang.String) obj2;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        remove2 = super.remove(str3, str4);
                        break;
                    default:
                        remove2 = super.remove(str3, str4);
                        break;
                }
                return remove2;
            default:
                return super.remove(obj, obj2);
        }
    }

    public z1(boolean z) {
        put("state", z ? "1" : "0");
    }

    public z1(java.lang.String str) {
        put("state", str);
    }
}
