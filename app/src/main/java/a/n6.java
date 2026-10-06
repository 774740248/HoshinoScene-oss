package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class n6 extends a.zx {
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(androidx.activity.ComponentActivity componentActivity, java.lang.String[] strArr, int i) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (android.text.TextUtils.isEmpty(strArr[i2])) {
                throw new java.lang.IllegalArgumentException(a.ai1.j(new java.lang.StringBuilder("Permission request for permissions "), java.util.Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (!a.es.a() && android.text.TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(java.lang.Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        java.lang.String[] strArr2 = size > 0 ? new java.lang.String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(java.lang.Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (componentActivity instanceof a.l6) {
            ((a.l6) componentActivity).validateRequestPermissionsRequestCode(i);
        }
        a.j6.b(componentActivity, strArr, i);
    }
}
