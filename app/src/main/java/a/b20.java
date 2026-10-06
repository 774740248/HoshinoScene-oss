package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class b20 {
    public static java.lang.String A = "/data/adb/modules";
    public static int B = -1;
    public static boolean C;
    public static boolean D;
    public static a.hg1 l;
    public static long x;
    public static java.lang.reflect.Method y;
    public static int z;

    /* renamed from: a, reason: collision with root package name */
    public static final a.qm1 f30a = new a.qm1("NO_DECISION");
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final java.lang.Object[] f = new java.lang.Object[0];
    public static final a.py g = new a.py(1);
    public static final java.lang.String[] h = {"standard", "accelerate", "decelerate", "linear"};
    public static final a.oi0 i = new a.oi0(0);
    public static final a.qm1 j = new a.qm1("CONDITION_FALSE");
    public static final a.hg1 k = new a.hg1(null, null, null);
    public static final a.fa0 m = new a.fa0(23, (java.lang.Object) null);
    public static final byte[] n = {48, 49, 53, 0};
    public static final byte[] o = {48, 49, 48, 0};
    public static final byte[] p = {48, 48, 57, 0};
    public static final byte[] q = {48, 48, 53, 0};
    public static final byte[] r = {48, 48, 49, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 50, 0};
    public static final int[] u = {2130968825};
    public static final int[] v = {2130968832};
    public static final a.py w = new a.py(5);

    public static android.graphics.Bitmap A(android.graphics.Bitmap bitmap, int i2, int i3) {
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f2 = i2;
        float f3 = i3;
        if (f2 / f3 > 1.0f) {
            i3 = (int) (f2 / width);
        } else {
            i2 = (int) (f3 * width);
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        a.wv.v(createScaledBitmap, "createScaledBitmap(bitma…Width, finalHeight, true)");
        return createScaledBitmap;
    }

    public static a.nk0 A0(android.content.Context context, a.gk0 gk0Var, boolean z2, boolean z3) {
        int i2;
        a.ek0 ek0Var = gk0Var.K;
        int i3 = ek0Var == null ? 0 : ek0Var.h;
        if (z3) {
            if (z2) {
                if (ek0Var != null) {
                    i2 = ek0Var.f;
                }
                i2 = 0;
            } else {
                if (ek0Var != null) {
                    i2 = ek0Var.g;
                }
                i2 = 0;
            }
        } else if (z2) {
            if (ek0Var != null) {
                i2 = ek0Var.d;
            }
            i2 = 0;
        } else {
            if (ek0Var != null) {
                i2 = ek0Var.e;
            }
            i2 = 0;
        }
        gk0Var.O(0, 0, 0, 0);
        android.view.ViewGroup viewGroup = gk0Var.G;
        if (viewGroup != null && viewGroup.getTag(2131363361) != null) {
            gk0Var.G.setTag(2131363361, null);
        }
        android.view.ViewGroup viewGroup2 = gk0Var.G;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i2 == 0 && i3 != 0) {
            i2 = i3 != 4097 ? i3 != 4099 ? i3 != 8194 ? -1 : z2 ? 2130837507 : 2130837508 : z2 ? 2130837511 : 2130837512 : z2 ? 2130837513 : 2130837514;
        }
        if (i2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
            if (equals) {
                try {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation != null) {
                        return new a.nk0(loadAnimation);
                    }
                } catch (android.content.res.Resources.NotFoundException e2) {
                    throw e2;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            try {
                android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i2);
                if (loadAnimator != null) {
                    return new a.nk0(loadAnimator);
                }
            } catch (java.lang.RuntimeException e3) {
                if (equals) {
                    throw e3;
                }
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, i2);
                if (loadAnimation2 != null) {
                    return new a.nk0(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static void A1(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
        throw new java.lang.Exception("Value " + obj2 + " at " + obj + " of type " + obj2.getClass().getName() + " cannot be converted to " + str);
    }

    public static android.graphics.drawable.Drawable B(android.graphics.drawable.Drawable drawable, int i2, int i3) {
        if (drawable.getIntrinsicWidth() <= i2 && drawable.getIntrinsicHeight() <= i3) {
            return drawable;
        }
        android.graphics.Bitmap O = O(drawable);
        android.graphics.Bitmap A2 = O != null ? A(O, i2, i3) : null;
        return A2 != null ? new android.graphics.drawable.BitmapDrawable(A2) : drawable;
    }

    public static int B0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void B1(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.Exception("Value is null.");
        }
        throw new java.lang.Exception("Value " + obj + " of type " + obj.getClass().getName() + " cannot be converted to " + str);
    }

    public static int C(a.z91 z91Var, a.n31 n31Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.a aVar, boolean z2) {
        if (aVar.G() == 0 || z91Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return java.lang.Math.abs(androidx.recyclerview.widget.a.Q(view) - androidx.recyclerview.widget.a.Q(view2)) + 1;
        }
        return java.lang.Math.min(n31Var.j(), n31Var.d(view2) - n31Var.f(view));
    }

    public static android.graphics.Typeface C0(android.content.res.Configuration configuration, android.graphics.Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        android.graphics.Typeface create;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = android.graphics.Typeface.create(typeface, a.wv.y(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static android.view.ActionMode.Callback C1(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        return (android.os.Build.VERSION.SDK_INT > 27 || (callback instanceof a.ml1) || callback == null) ? callback : new a.ml1(callback, textView);
    }

    public static int D(a.z91 z91Var, a.n31 n31Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.a aVar, boolean z2, boolean z3) {
        if (aVar.G() == 0 || z91Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? java.lang.Math.max(0, (z91Var.b() - java.lang.Math.max(androidx.recyclerview.widget.a.Q(view), androidx.recyclerview.widget.a.Q(view2))) - 1) : java.lang.Math.max(0, java.lang.Math.min(androidx.recyclerview.widget.a.Q(view), androidx.recyclerview.widget.a.Q(view2)));
        if (z2) {
            return java.lang.Math.round((max * (java.lang.Math.abs(n31Var.d(view2) - n31Var.f(view)) / (java.lang.Math.abs(androidx.recyclerview.widget.a.Q(view) - androidx.recyclerview.widget.a.Q(view2)) + 1))) + (n31Var.i() - n31Var.f(view)));
        }
        return max;
    }

    public static final boolean D0() {
        if (!E0()) {
            return false;
        }
        if (a.wv.e(Z(), "magisk") && a.gy.n("/data/adb/modules_update/scene_systemless/module.prop")) {
            A = "/data/adb/modules_update";
            return true;
        }
        if (a.gy.n("/dev/scene/modules_tmp/scene_systemless/module.prop")) {
            A = "/dev/scene/modules_tmp";
            return true;
        }
        java.lang.String f0 = f0();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(f0);
        sb.append("module.prop");
        return a.gy.n(sb.toString());
    }

    public static void D1(java.lang.String str, java.lang.String str2) {
        if (!a.yi1.B2(str2, "/")) {
            str2 = a.ii1.e(f0(), str2);
        }
        a.gy.W(str2, str);
    }

    public static int E(a.z91 z91Var, a.n31 n31Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.a aVar, boolean z2) {
        if (aVar.G() == 0 || z91Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return z91Var.b();
        }
        return (int) (((n31Var.d(view2) - n31Var.f(view)) / (java.lang.Math.abs(androidx.recyclerview.widget.a.Q(view) - androidx.recyclerview.widget.a.Q(view2)) + 1)) * z91Var.b());
    }

    public static boolean E0() {
        if (B == -1) {
            java.lang.String q0 = a.wv.q0();
            if (q0 != null) {
                int hashCode = q0.hashCode();
                if (hashCode != -2028305842) {
                    if (hashCode != 96789) {
                        if (hashCode == 378773375 && q0.equals("KernelSU")) {
                            C = true;
                            B = 1;
                        }
                    } else if (q0.equals("apd")) {
                        D = true;
                        B = 1;
                    }
                } else if (q0.equals("MAGISK")) {
                    a.q10 q10Var = a.q10.f457a;
                    try {
                        B = java.lang.Integer.parseInt(a.q10.k(2000L, "magisk -V")) / 1000 >= 19 ? 1 : 0;
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            B = 0;
        }
        return B == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b2, code lost:
    
        if (r5 == null) goto L121;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x015b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E1(android.content.Context r19, a.dp r20, a.s71 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.E1(android.content.Context, a.dp, a.s71, boolean):void");
    }

    public static android.widget.ImageView.ScaleType F(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? android.widget.ImageView.ScaleType.CENTER : android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP : android.widget.ImageView.ScaleType.FIT_END : android.widget.ImageView.ScaleType.FIT_CENTER : android.widget.ImageView.ScaleType.FIT_START : android.widget.ImageView.ScaleType.FIT_XY;
    }

    public static java.util.ArrayList F0(java.lang.Object... objArr) {
        return objArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new a.fp(objArr, true));
    }

    public static void F1(java.io.ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.b20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a.b20] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, a.b20] */
    public static a.b20 G(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new a.a00();
        }
        return new a.qc1();
    }

    public static void G0(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException unused) {
        }
    }

    public static void G1(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        F1(byteArrayOutputStream, i2, 2);
    }

    public static a.fa0 H() {
        return new a.fa0(0, (java.lang.Object) null);
    }

    public static android.content.res.TypedArray H0(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        r(context, attributeSet, i2, i3);
        u(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static float H1() {
        return ((float) java.lang.Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final a.ac1 I(java.lang.Throwable th) {
        a.wv.w(th, "exception");
        return new a.ac1(th);
    }

    public static void I0(android.view.View view, android.view.inputmethod.EditorInfo editorInfo, android.view.inputmethod.InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
        }
    }

    public static boolean J(android.content.Context context, java.lang.String str) {
        android.graphics.Bitmap bitmap;
        try {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService("shortcut");
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (shortcutManager.isRequestPinShortcutSupported()) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
                intent.setClassName(context.getApplicationContext(), com.omarea.vtools.activities.ActivityQuickStart.class.getName());
                intent.putExtra("packageName", str);
                android.graphics.drawable.Drawable loadIcon = applicationInfo.loadIcon(packageManager);
                if (loadIcon instanceof android.graphics.drawable.BitmapDrawable) {
                    bitmap = ((android.graphics.drawable.BitmapDrawable) loadIcon).getBitmap();
                } else if (loadIcon instanceof android.graphics.drawable.AdaptiveIconDrawable) {
                    android.graphics.drawable.AdaptiveIconDrawable adaptiveIconDrawable = (android.graphics.drawable.AdaptiveIconDrawable) loadIcon;
                    android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{adaptiveIconDrawable.getBackground(), adaptiveIconDrawable.getForeground()});
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                    layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    layerDrawable.draw(canvas);
                    bitmap = createBitmap;
                } else {
                    bitmap = null;
                }
                android.content.pm.ShortcutInfo build = new android.content.pm.ShortcutInfo.Builder(context, str).setIcon(android.graphics.drawable.Icon.createWithBitmap(bitmap)).setShortLabel("*" + ((java.lang.Object) applicationInfo.loadLabel(packageManager))).setIntent(intent).setActivity(new android.content.ComponentName(context, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityQuickStart.class)).build();
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.omarea.scene_mode.ReceiverShortcut.class);
                intent2.setAction(context.getString(2131953335));
                intent2.putExtra("packageName", str);
                int i2 = z + 1;
                z = i2;
                android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, i2, intent2, 335544320);
                if (!shortcutManager.isRequestPinShortcutSupported()) {
                    return false;
                }
                java.util.Iterator<android.content.pm.ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        shortcutManager.requestPinShortcut(build, broadcast.getIntentSender());
                        break;
                    }
                    if (it.next().getId().equals(build.getId())) {
                        shortcutManager.updateShortcuts(new a.po0(build));
                        break;
                    }
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.String K() {
        int i2;
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile("/odm/etc/default_cloud.json", "r");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((int) randomAccessFile.length());
        byte[] bArr = new byte[8192];
        while (true) {
            int read = randomAccessFile.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        randomAccessFile.close();
        byte[] bArr2 = {72, 75, 73, 71, 73, 74, 72, 77, 73, 27, 73, 78, 73, 28, 73, 25, 72, 79, 73, 74, 73, 26, 72, 76, 72, 76, 73, 28, 77, 26, 73, 71};
        for (i2 = 0; i2 < 32; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ Byte.MAX_VALUE);
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(new java.lang.String(bArr2).getBytes("ASCII"), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, secretKeySpec);
        return new java.lang.String(cipher.doFinal(byteArray));
    }

    public static boolean L(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (java.io.File file2 : listFiles) {
            z2 = L(file2) && z2;
        }
        return z2;
    }

    public static final int M(android.content.Context context, float f2) {
        a.wv.w(context, "<this>");
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int N(android.view.View view, float f2) {
        a.wv.w(view, "<this>");
        android.content.Context context = view.getContext();
        a.wv.v(context, "context");
        return M(context, f2);
    }

    public static android.graphics.Bitmap O(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof android.graphics.drawable.AdaptiveIconDrawable)) {
            return null;
        }
        android.graphics.drawable.AdaptiveIconDrawable adaptiveIconDrawable = (android.graphics.drawable.AdaptiveIconDrawable) drawable;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(adaptiveIconDrawable.getMinimumWidth(), adaptiveIconDrawable.getMinimumHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static float O0(android.widget.EdgeEffect edgeEffect, float f2, float f3) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return a.ea0.c(edgeEffect, f2, f3);
        }
        a.da0.a(edgeEffect, f2, f3);
        return f2;
    }

    public static android.graphics.Bitmap P(android.graphics.Bitmap bitmap, int i2, boolean z2) {
        int[] iArr;
        int i3 = i2;
        android.graphics.Bitmap copy = z2 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i3 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i4 = width * height;
        int[] iArr2 = new int[i4];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[java.lang.Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * 256;
        int[] iArr7 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr7[i12] = i12 / i10;
        }
        int[][] iArr8 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i8, 3);
        int i13 = i3 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < height) {
            android.graphics.Bitmap bitmap2 = copy;
            int i17 = height;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = -i3;
            int i27 = 0;
            while (i26 <= i3) {
                int i28 = i6;
                int[] iArr9 = iArr6;
                int i29 = iArr2[java.lang.Math.min(i5, java.lang.Math.max(i26, 0)) + i15];
                int[] iArr10 = iArr8[i26 + i3];
                iArr10[0] = (i29 & 16711680) >> 16;
                iArr10[1] = (i29 & 65280) >> 8;
                iArr10[2] = i29 & 255;
                int abs = i13 - java.lang.Math.abs(i26);
                int i30 = iArr10[0];
                i27 += i30 * abs;
                int i31 = iArr10[1];
                i18 = (i31 * abs) + i18;
                int i32 = iArr10[2];
                i19 = (abs * i32) + i19;
                if (i26 > 0) {
                    i23 += i30;
                    i24 += i31;
                    i25 += i32;
                } else {
                    i20 += i30;
                    i21 += i31;
                    i22 += i32;
                }
                i26++;
                i6 = i28;
                iArr6 = iArr9;
            }
            int i33 = i6;
            int[] iArr11 = iArr6;
            int i34 = i3;
            int i35 = i27;
            int i36 = 0;
            while (i36 < width) {
                iArr3[i15] = iArr7[i35];
                iArr4[i15] = iArr7[i18];
                iArr5[i15] = iArr7[i19];
                int i37 = i35 - i20;
                int i38 = i18 - i21;
                int i39 = i19 - i22;
                int[] iArr12 = iArr8[((i34 - i3) + i8) % i8];
                int i40 = i20 - iArr12[0];
                int i41 = i21 - iArr12[1];
                int i42 = i22 - iArr12[2];
                if (i14 == 0) {
                    iArr = iArr7;
                    iArr11[i36] = java.lang.Math.min(i36 + i3 + 1, i5);
                } else {
                    iArr = iArr7;
                }
                int i43 = iArr2[i16 + iArr11[i36]];
                int i44 = (i43 & 16711680) >> 16;
                iArr12[0] = i44;
                int i45 = (i43 & 65280) >> 8;
                iArr12[1] = i45;
                int i46 = i43 & 255;
                iArr12[2] = i46;
                int i47 = i23 + i44;
                int i48 = i24 + i45;
                int i49 = i25 + i46;
                i35 = i37 + i47;
                i18 = i38 + i48;
                i19 = i39 + i49;
                i34 = (i34 + 1) % i8;
                int[] iArr13 = iArr8[i34 % i8];
                int i50 = iArr13[0];
                i20 = i40 + i50;
                int i51 = iArr13[1];
                i21 = i41 + i51;
                int i52 = iArr13[2];
                i22 = i42 + i52;
                i23 = i47 - i50;
                i24 = i48 - i51;
                i25 = i49 - i52;
                i15++;
                i36++;
                iArr7 = iArr;
            }
            i16 += width;
            i14++;
            copy = bitmap2;
            height = i17;
            i6 = i33;
            iArr6 = iArr11;
        }
        android.graphics.Bitmap bitmap3 = copy;
        int i53 = i6;
        int[] iArr14 = iArr6;
        int i54 = height;
        int[] iArr15 = iArr7;
        int i55 = 0;
        while (i55 < width) {
            int i56 = -i3;
            int i57 = i8;
            int[] iArr16 = iArr2;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = i56;
            int i66 = i56 * width;
            int i67 = 0;
            int i68 = 0;
            while (i65 <= i3) {
                int i69 = width;
                int max = java.lang.Math.max(0, i66) + i55;
                int[] iArr17 = iArr8[i65 + i3];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i13 - java.lang.Math.abs(i65);
                i67 = (iArr3[max] * abs2) + i67;
                i68 = (iArr4[max] * abs2) + i68;
                i58 = (iArr5[max] * abs2) + i58;
                if (i65 > 0) {
                    i62 += iArr17[0];
                    i63 += iArr17[1];
                    i64 += iArr17[2];
                } else {
                    i59 += iArr17[0];
                    i60 += iArr17[1];
                    i61 += iArr17[2];
                }
                int i70 = i53;
                if (i65 < i70) {
                    i66 += i69;
                }
                i65++;
                i53 = i70;
                width = i69;
            }
            int i71 = width;
            int i72 = i53;
            int i73 = i3;
            int i74 = i55;
            int i75 = i54;
            int i76 = 0;
            while (i76 < i75) {
                iArr16[i74] = (iArr16[i74] & (-16777216)) | (iArr15[i67] << 16) | (iArr15[i68] << 8) | iArr15[i58];
                int i77 = i67 - i59;
                int i78 = i68 - i60;
                int i79 = i58 - i61;
                int[] iArr18 = iArr8[((i73 - i3) + i57) % i57];
                int i80 = i59 - iArr18[0];
                int i81 = i60 - iArr18[1];
                int i82 = i61 - iArr18[2];
                if (i55 == 0) {
                    iArr14[i76] = java.lang.Math.min(i76 + i13, i72) * i71;
                }
                int i83 = iArr14[i76] + i55;
                int i84 = iArr3[i83];
                iArr18[0] = i84;
                int i85 = iArr4[i83];
                iArr18[1] = i85;
                int i86 = iArr5[i83];
                iArr18[2] = i86;
                int i87 = i62 + i84;
                int i88 = i63 + i85;
                int i89 = i64 + i86;
                i67 = i77 + i87;
                i68 = i78 + i88;
                i58 = i79 + i89;
                i73 = (i73 + 1) % i57;
                int[] iArr19 = iArr8[i73];
                int i90 = iArr19[0];
                i59 = i80 + i90;
                int i91 = iArr19[1];
                i60 = i81 + i91;
                int i92 = iArr19[2];
                i61 = i82 + i92;
                i62 = i87 - i90;
                i63 = i88 - i91;
                i64 = i89 - i92;
                i74 += i71;
                i76++;
                i3 = i2;
            }
            i55++;
            i3 = i2;
            i53 = i72;
            i54 = i75;
            i8 = i57;
            iArr2 = iArr16;
            width = i71;
        }
        int i93 = width;
        bitmap3.setPixels(iArr2, 0, i93, 0, 0, i93, i54);
        return bitmap3;
    }

    public static java.util.List P0(java.util.List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : y0(list.get(0)) : a.qb0.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (a.yi1.g2(r11, r1) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList Q(java.util.ArrayList r28, java.util.HashSet r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.Q(java.util.ArrayList, java.util.HashSet, java.lang.String):java.util.ArrayList");
    }

    public static a.yi0 Q0(android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), a.o81.b);
            java.lang.String string = obtainAttributes.getString(0);
            java.lang.String string2 = obtainAttributes.getString(4);
            java.lang.String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            java.lang.String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    o1(xmlResourceParser);
                }
                return new a.bj0(new a.ol(string, string2, string3, X0(resources, resourceId)), integer, integer2, string4);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        android.content.res.TypedArray obtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), a.o81.c);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        java.lang.String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        java.lang.String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            o1(xmlResourceParser);
                        }
                        arrayList.add(new a.aj0(i2, i4, resourceId2, string6, string5, z2));
                    } else {
                        o1(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new a.zi0((a.aj0[]) arrayList.toArray(new a.aj0[0]));
            }
        } else {
            o1(xmlResourceParser);
        }
        return null;
    }

    public static android.graphics.Bitmap R(android.graphics.Bitmap bitmap, java.lang.Float f2) {
        android.graphics.Rect rect;
        float width = bitmap.getWidth() / bitmap.getHeight();
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > f2.floatValue()) {
            width2 = (int) (f2.floatValue() * height);
        } else {
            height = (int) (width2 / f2.floatValue());
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
        float floatValue = f2.floatValue();
        if (width > floatValue) {
            float height2 = bitmap.getHeight() * floatValue;
            int round = java.lang.Math.round((bitmap.getWidth() - height2) / 2.0f);
            rect = new android.graphics.Rect(round, 0, java.lang.Math.round(height2) + round, bitmap.getHeight());
        } else {
            float width3 = bitmap.getWidth() / floatValue;
            int round2 = java.lang.Math.round((bitmap.getHeight() - width3) / 2.0f);
            rect = new android.graphics.Rect(0, round2, bitmap.getWidth(), java.lang.Math.round(width3) + round2);
        }
        new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, rect, new android.graphics.Rect(0, 0, width2, height), (android.graphics.Paint) null);
        return createBitmap;
    }

    public static void R0(android.content.Context context, java.lang.String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            java.io.FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    android.util.Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                android.util.Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (java.io.IOException unused2) {
            }
        } catch (java.io.FileNotFoundException unused3) {
            android.util.Log.w("AppLocalesStorageHelper", java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    public static boolean S(java.lang.String str, boolean z2) {
        a.cp cpVar = com.omarea.Scene.c;
        return a.fs1.D().getBoolean(str, z2);
    }

    public static java.lang.String S0(java.util.LinkedHashMap linkedHashMap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            sb.append("\n");
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static final android.widget.ListAdapter T(android.view.View view) {
        if (view instanceof com.omarea.common.ui.AdapterLinearLayout) {
            return ((com.omarea.common.ui.AdapterLinearLayout) view).getAdapter();
        }
        if (view instanceof android.widget.AbsListView) {
            return (android.widget.ListAdapter) ((android.widget.AbsListView) view).getAdapter();
        }
        return null;
    }

    public static android.graphics.Bitmap V(android.graphics.Bitmap bitmap) {
        java.lang.Float valueOf = java.lang.Float.valueOf(0.9f);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.set(new float[]{valueOf.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, valueOf.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, valueOf.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static java.lang.String V0(android.content.Context context, android.net.Uri uri, java.lang.String str) {
        android.database.Cursor cursor;
        java.lang.Throwable th;
        try {
            cursor = context.getContentResolver().query(uri, new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst() || cursor.isNull(0)) {
                        x(cursor);
                        return null;
                    }
                    java.lang.String string = cursor.getString(0);
                    x(cursor);
                    return string;
                } catch (java.lang.Exception e2) {
                    e = (float[][]) e2;
                    android.util.Log.w("DocumentFile", "Failed query: " + e);
                    x(cursor);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                x(cursor);
                throw th;
            }
        } catch (java.lang.Exception e3) {
            e = (float[][]) e3;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            cursor = null;
            th = th3;
            x(cursor);
            throw th;
        }
    }

    public static float W(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return a.ea0.b(edgeEffect);
        }
        return 0.0f;
    }

    public static byte[] W0(java.io.InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new java.lang.IllegalStateException(a.ii1.d("Not enough bytes to read: ", i2));
            }
            i3 += read;
        }
        return bArr;
    }

    public static final java.lang.Double[] X(a.lt0 lt0Var) {
        a.jt0 e2 = lt0Var.e("cpu_load");
        java.util.List list = e2.f269a;
        int size = list.size();
        java.lang.Double[] dArr = new java.lang.Double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = java.lang.Double.valueOf(0.0d);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            java.lang.Object a2 = e2.a(i3);
            java.lang.Double v1 = v1(a2);
            if (v1 == null) {
                A1(java.lang.Integer.valueOf(i3), a2, "double");
                throw null;
            }
            dArr[i3] = java.lang.Double.valueOf(v1.doubleValue());
        }
        return dArr;
    }

    public static java.util.List X0(android.content.res.Resources resources, int i2) {
        if (i2 == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (a.xi0.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static android.graphics.drawable.Drawable Y(android.content.Context context, int i2) {
        return a.lb1.c().f(context, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] Y0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.Y0(java.io.FileInputStream, int, int):byte[]");
    }

    public static java.lang.String Z() {
        return C ? "ksud" : D ? "apd" : "magisk";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r2.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Z0(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.Z0(android.content.Context):java.lang.String");
    }

    public static final void a(android.widget.TextView textView, java.lang.String str, a.qo0 qo0Var) {
        a.wv.w(textView, "<this>");
        a.wv.w(str, "text");
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.lang.CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            java.lang.CharSequence text2 = textView.getText();
            a.wv.v(text2, "this.text");
            if (!(text2 instanceof java.lang.String ? a.yi1.h2((java.lang.String) text2, "\n", false) : a.yi1.u2(text2, text2.length() - "\n".length(), "\n", 0, "\n".length(), false))) {
                textView.append("  ");
            }
        }
        int length = str.length();
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, length, 33);
        spannableString.setSpan(new a.el1(qo0Var), 0, length, 33);
        textView.append(spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.tk a0(android.content.Context r19, a.ol r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.a0(android.content.Context, a.ol):a.tk");
    }

    public static long a1(java.io.InputStream inputStream, int i2) {
        byte[] W0 = W0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (W0[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static void b(java.lang.Throwable th, java.lang.Throwable th2) {
        a.wv.w(th, "<this>");
        a.wv.w(th2, "exception");
        if (th != th2) {
            a.w51.f652a.a(th, th2);
        }
    }

    public static final java.lang.String b0(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static void b1(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = java.util.Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        java.lang.System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        a.i90.h(mutate, android.content.res.ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void c(android.widget.TextView textView, java.lang.String str) {
        a.wv.w(textView, "<this>");
        a.wv.w(str, "text");
        textView.post(new a.sc0(textView, str, 0));
    }

    public static final java.lang.Integer[] c0(a.lt0 lt0Var, java.lang.String str) {
        a.jt0 e2 = lt0Var.e(str);
        java.util.List list = e2.f269a;
        int size = list.size();
        java.lang.Integer[] numArr = new java.lang.Integer[size];
        for (int i2 = 0; i2 < size; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            numArr[i3] = java.lang.Integer.valueOf(e2.b(i3));
        }
        return numArr;
    }

    public static void c1(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService("shortcut");
            shortcutManager.removeDynamicShortcuts(new a.po0(str, 0));
            shortcutManager.disableShortcuts(new a.po0(str, 1));
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0262, code lost:
    
        if (r2.b == r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r4.b == r12) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0716 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(a.jx r37, a.zv0 r38, int r39) {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.d(a.jx, a.zv0, int):void");
    }

    public static int d0(java.util.List list) {
        a.wv.w(list, "<this>");
        return list.size() - 1;
    }

    public static boolean d1(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "orginPath");
        a.wv.w(str2, "newfile");
        if (!new java.io.File(str2).exists()) {
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("path-basic-info", str2, 10000L);
            if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                return false;
            }
        }
        java.lang.String g0 = g0(str);
        java.lang.String str3 = "mkdir -p \"" + new java.io.File(g0).getParent() + "\"\ncp \"" + str2 + "\" \"" + g0 + "\"\nchmod 777 \"" + g0 + "\"";
        a.wv.w(str3, "shell");
        a.q10 q10Var2 = a.q10.f457a;
        a.q10.l(str3);
        return true;
    }

    public static void e(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                a.i90.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = java.util.Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                java.lang.System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                a.i90.h(drawable, android.content.res.ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                a.i90.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final androidx.lifecycle.LifecycleCoroutineScopeImpl e0(a.mv0 mv0Var) {
        androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        a.gv0 lifecycle = mv0Var.getLifecycle();
        a.wv.w(lifecycle, "<this>");
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = lifecycle.f193a;
            lifecycleCoroutineScopeImpl = (androidx.lifecycle.LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                a.qt0 qt0Var = new a.qt0(null);
                a.u20 u20Var = a.z80.f728a;
                lifecycleCoroutineScopeImpl = new androidx.lifecycle.LifecycleCoroutineScopeImpl(lifecycle, qt0Var.c(((a.cr0) a.by0.f57a).h));
                while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                a.u20 u20Var2 = a.z80.f728a;
                a.wv.M0(lifecycleCoroutineScopeImpl, ((a.cr0) a.by0.f57a).h, new a.hv0(lifecycleCoroutineScopeImpl, null), 2);
                break loop0;
            }
            break;
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static void e1(java.lang.String str) {
        m1("random_id2", str);
    }

    public static java.util.ArrayList f(java.lang.Object... objArr) {
        return objArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new a.fp(objArr, true));
    }

    public static java.lang.String f0() {
        return A.concat("/scene_systemless/");
    }

    public static void f1(java.lang.String str) {
        m1("activate_v2_type", str);
    }

    public static final void g(a.zq1 zq1Var, a.id1 id1Var, a.gv0 gv0Var) {
        java.lang.Object obj;
        a.wv.w(id1Var, "registry");
        a.wv.w(gv0Var, "lifecycle");
        java.util.HashMap hashMap = zq1Var.f742a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = zq1Var.f742a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        b20 savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.e) {
            return;
        }
        savedStateHandleController.b((Throwable) gv0Var, id1Var);
        a.fv0 fv0Var = ((androidx.lifecycle.a) gv0Var).d;
        if (fv0Var == a.fv0.d || fv0Var.compareTo(a.fv0.f) >= 0) {
            id1Var.d();
        } else {
            gv0Var.a(new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1(gv0Var, id1Var));
        }
    }

    public static java.lang.String g0(java.lang.String str) {
        a.wv.w(str, "systemPath");
        java.lang.String substring = f0().substring(0, f0().length() - 1);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (a.yi1.B2(str, "/vendor") || a.yi1.B2(str, "/product")) {
            str = "/system".concat(str);
        }
        return a.ii1.e(substring, str);
    }

    public static final void g1(android.view.View view, android.widget.BaseAdapter baseAdapter) {
        if (view instanceof com.omarea.common.ui.AdapterLinearLayout) {
            ((com.omarea.common.ui.AdapterLinearLayout) view).setAdapter(baseAdapter);
        } else {
            if (!(view instanceof android.widget.AbsListView)) {
                throw new java.lang.IllegalArgumentException("不支持的列表容器: ".concat(view.getClass().getName()));
            }
            ((android.widget.AbsListView) view).setAdapter((android.widget.ListAdapter) baseAdapter);
        }
    }

    public static final a.yq1 h(int i2, a.gk0 gk0Var) {
        a.wv.w(gk0Var, "<this>");
        return new a.yq1(new a.jp1(i2, 1, gk0Var));
    }

    public static android.content.Intent h0(android.app.Activity activity) {
        android.content.Intent a2 = a.t11.a(activity);
        if (a2 != null) {
            return a2;
        }
        try {
            java.lang.String j0 = j0(activity, activity.getComponentName());
            if (j0 == null) {
                return null;
            }
            android.content.ComponentName componentName = new android.content.ComponentName(activity, j0);
            try {
                return j0(activity, componentName) == null ? android.content.Intent.makeMainActivity(componentName) : new android.content.Intent().setComponent(componentName);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + j0 + "' in manifest");
                return null;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public static void h1(android.widget.TextView textView, int i2) {
        a.wv.r(i2);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            a.ll1.c(textView, i2);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = a.hl1.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > java.lang.Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final a.yq1 i(android.app.Activity activity, int i2) {
        a.wv.w(activity, "<this>");
        return new a.yq1(new a.jp1(i2, 0, activity));
    }

    public static android.content.Intent i0(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String j0 = j0(context, componentName);
        if (j0 == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), j0);
        return j0(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static void i1(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean a2 = a.qp1.a(checkableImageButton);
        boolean z2 = onLongClickListener != null;
        boolean z3 = a2 || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        a.rp1.s(checkableImageButton, z3 ? 1 : 2);
    }

    public static final a.yq1 j(android.view.View view, int i2) {
        a.wv.w(view, "<this>");
        return new a.yq1(new a.jp1(i2, 2, view));
    }

    public static java.lang.String j0(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void j1(android.widget.TextView textView, int i2) {
        a.wv.r(i2);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = a.hl1.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > java.lang.Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static final void k(android.view.View view) {
        a.wv.w(view, "<this>");
        java.util.Iterator it = new a.rq1(3, new a.xq1(view, null)).iterator();
        while (it.hasNext()) {
            android.view.View view2 = (android.view.View) it.next();
            a.z51 z51Var = (a.z51) view2.getTag(2131362971);
            if (z51Var == null) {
                z51Var = new a.z51();
                view2.setTag(2131362971, z51Var);
            }
            java.util.ArrayList arrayList = z51Var.f724a;
            int d0 = d0(arrayList);
            if (-1 < d0) {
                a.ai1.t(arrayList.get(d0));
                throw null;
            }
        }
    }

    public static java.util.ArrayList k0(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (android.content.pm.ShortcutInfo shortcutInfo : ((android.content.pm.ShortcutManager) context.getSystemService("shortcut")).getPinnedShortcuts()) {
                java.lang.CharSequence shortLabel = shortcutInfo.getShortLabel();
                if (shortLabel != null && shortLabel.toString().startsWith("*")) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public static java.util.Set k1(java.lang.Object... objArr) {
        int length;
        int length2 = objArr.length;
        a.sb0 sb0Var = a.sb0.c;
        if (length2 <= 0 || (length = objArr.length) == 0) {
            return sb0Var;
        }
        if (length != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(B0(objArr.length));
            a.op.V1(linkedHashSet, objArr);
            return linkedHashSet;
        }
        java.util.Set singleton = java.util.Collections.singleton(objArr[0]);
        a.wv.v(singleton, "singleton(element)");
        return singleton;
    }

    public static byte[] l0(android.content.Context context, int i2) {
        a.wv.w(context, "context");
        java.io.InputStream openRawResource = context.getResources().openRawResource(i2);
        a.wv.v(openRawResource, "context.resources.openRawResource(id)");
        return a.wv.c1(openRawResource);
    }

    public static void l1(android.view.View view, a.gz0 gz0Var) {
        a.ma0 ma0Var = gz0Var.c.b;
        if (ma0Var == null || !ma0Var.f342a) {
            return;
        }
        float f2 = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            f2 += a.xp1.i((android.view.View) parent);
        }
        a.fz0 fz0Var = gz0Var.c;
        if (fz0Var.m != f2) {
            fz0Var.m = f2;
            gz0Var.o();
        }
    }

    public static java.lang.String m0(android.content.Context context, int i2) {
        a.wv.w(context, "context");
        try {
            byte[] l0 = l0(context, i2);
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            a.wv.v(defaultCharset, "defaultCharset()");
            java.lang.String str = new java.lang.String(l0, defaultCharset);
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
            a.wv.v(compile, "compile(pattern)");
            java.lang.String replaceAll = compile.matcher(str).replaceAll("\n");
            a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
            a.wv.v(compile2, "compile(pattern)");
            java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
            a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("\r");
            a.wv.v(compile3, "compile(pattern)");
            java.lang.String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("\n");
            a.wv.v(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll3;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static void m1(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.D().edit().remove(str).apply();
        } else {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.D().edit().putString(str, str2).apply();
        }
    }

    public static boolean n(android.content.Context context, android.net.Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        java.lang.String V0 = V0(context, uri, "mime_type");
        long j2 = 0;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new java.lang.String[]{"flags"}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    j2 = cursor.getLong(0);
                }
            } catch (java.lang.Exception e2) {
                android.util.Log.w("DocumentFile", "Failed query: " + e2);
            }
            int i2 = (int) j2;
            if (android.text.TextUtils.isEmpty(V0)) {
                return false;
            }
            if ((i2 & 4) != 0) {
                return true;
            }
            if (!"vnd.android.document/directory".equals(V0) || (i2 & 8) == 0) {
                return (android.text.TextUtils.isEmpty(V0) || (i2 & 2) == 0) ? false : true;
            }
            return true;
        } finally {
            x(cursor);
        }
    }

    public static android.os.IBinder n0(java.lang.String str) {
        return (android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getMethod("getService", java.lang.String.class).invoke(null, str);
    }

    public static void n1(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        a.wv.w(str, "prop");
        java.lang.String str3 = f0() + "system.prop";
        a.wv.w(str3, "path");
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d2 = a.nu0.d(str3);
        int length = d2.length() - 1;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            boolean z3 = a.wv.C(d2.charAt(!z2 ? i3 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i3++;
            } else {
                z2 = true;
            }
        }
        java.lang.String obj = d2.subSequence(i3, length + 1).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\n");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(obj, "input");
        a.yi1.w2(0);
        java.util.regex.Matcher matcher = compile.matcher(obj);
        if (matcher.find()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(10);
            int i4 = 0;
            do {
                arrayList.add(obj.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
            } while (matcher.find());
            arrayList.add(obj.subSequence(i4, obj.length()).toString());
            list = arrayList;
        } else {
            list = y0(obj.toString());
        }
        java.lang.String[] strArr = (java.lang.String[]) list.toArray(new java.lang.String[0]);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String concat = str.concat("=");
        if (str2 != null) {
            int length2 = strArr.length;
            boolean z4 = false;
            while (i2 < length2) {
                java.lang.String str4 = strArr[i2];
                if (a.yi1.B2(str4, concat)) {
                    arrayList2.add(concat.concat(str2));
                    z4 = true;
                } else {
                    arrayList2.add(str4);
                }
                i2++;
            }
            if (!z4) {
                arrayList2.add(str + "=" + str2);
            }
        } else {
            int length3 = strArr.length;
            boolean z5 = false;
            while (i2 < length3) {
                java.lang.String str5 = strArr[i2];
                if (a.yi1.B2(str5, concat)) {
                    arrayList2.add(str + "=" + str2);
                    z5 = true;
                } else {
                    arrayList2.add(str5);
                }
                i2++;
            }
            if (!z5) {
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            sb.append("\n");
        }
        java.lang.String e2 = a.ii1.e(f0(), "system.prop");
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "stringBuilder.toString()");
        a.gy.W(e2, sb2);
    }

    public static final java.lang.String o0(android.database.Cursor cursor, java.lang.String str) {
        java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        return string == null ? "" : string;
    }

    public static void o1(android.content.res.XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static a.s61 p0(android.widget.TextView textView) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new a.s61(a.ll1.b(textView));
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(textView.getPaint());
        android.text.TextDirectionHeuristic textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = a.jl1.a(textView);
        int d2 = a.jl1.d(textView);
        if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z2 = a.il1.b(textView) == 1;
                switch (a.il1.c(textView)) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LOCALE;
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                        break;
                    case 7:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = java.lang.Character.getDirectionality(a.ll1.a(a.kl1.a(a.il1.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
            }
        }
        return new a.s61(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void p1() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static java.util.ArrayList q0(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            android.view.View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (android.text.TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void q1(java.lang.Object obj) {
        if (obj instanceof a.ac1) {
            throw ((a.ac1) obj).c;
        }
    }

    public static void r(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.t81.F, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(2130969126, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                v(context, v, "Theme.MaterialComponents");
            }
        }
        v(context, u, "Theme.AppCompat");
    }

    public static java.util.HashSet r0(java.lang.Object... objArr) {
        java.util.HashSet hashSet = new java.util.HashSet(B0(objArr.length));
        a.op.V1(hashSet, objArr);
        return hashSet;
    }

    public static final java.lang.Object[] r1(java.util.Collection collection) {
        a.wv.w(collection, "collection");
        int size = collection.size();
        java.lang.Object[] objArr = f;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i4);
                a.wv.v(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i3);
                a.wv.v(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static void s(double d2) {
        if (java.lang.Double.isInfinite(d2) || java.lang.Double.isNaN(d2)) {
            throw new java.lang.Exception("Forbidden numeric value: " + d2);
        }
    }

    public static boolean s0(android.content.Context context) {
        java.io.InputStream open;
        a.wv.w(context, "context");
        java.lang.String str = a.pe0.f434a;
        if (a.yi1.B2("ksu.zip", "file:///android_asset/")) {
            android.content.res.AssetManager assets = context.getAssets();
            java.lang.String substring = "ksu.zip".substring(22);
            a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
            open = assets.open(substring);
        } else {
            open = context.getAssets().open("ksu.zip");
        }
        a.wv.v(open, "if (file.startsWith(\"fil…sets.open(file)\n        }");
        java.lang.String k2 = a.pe0.k(context, "ksu.zip", a.wv.c1(open));
        if (k2 == null || !t0(k2)) {
            return false;
        }
        A = "/data/adb/modules_update";
        boolean z2 = C;
        if (!z2 && !D) {
            return true;
        }
        java.lang.String h2 = a.ai1.h("/data/adb/", z2 ? "ksu" : D ? "ap" : "magisk", "/modules_update.img");
        if (!a.gy.n(h2)) {
            return true;
        }
        D1("", "update");
        java.lang.String str2 = "mkdir -p /dev/scene/modules_tmp\nmount -t ext4 --loop " + h2 + " /dev/scene/modules_tmp";
        a.wv.w(str2, "shell");
        a.q10 q10Var = a.q10.f457a;
        a.q10.l(str2);
        A = "/dev/scene/modules_tmp";
        return true;
    }

    public static final java.lang.Object[] s1(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        a.wv.w(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            a.wv.t(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (java.lang.Object[]) newInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i4);
                a.wv.v(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i3);
                a.wv.v(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static int t(android.content.Context context, java.lang.String str) {
        int c2;
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        java.lang.String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        java.lang.String d2 = a.vo.d(str);
        if (d2 != null) {
            if (packageName == null) {
                java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = android.os.Process.myUid();
            java.lang.String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !a.x21.a(packageName2, packageName)) {
                c2 = a.vo.c((android.app.AppOpsManager) a.vo.a(context, android.app.AppOpsManager.class), d2, packageName);
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.app.AppOpsManager c3 = a.wo.c(context);
                c2 = a.wo.a(c3, d2, android.os.Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = a.wo.a(c3, d2, myUid, a.wo.b(context));
                }
            } else {
                c2 = a.vo.c((android.app.AppOpsManager) a.vo.a(context, android.app.AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static boolean t0(java.lang.String str) {
        java.lang.Object r3 = null;
        java.lang.String str2;
        a.wv.w(str, "path");
        java.lang.String Z = Z();
        int hashCode = Z.hashCode();
        if (hashCode != -1081635250) {
            if (hashCode != 96789) {
                if (hashCode != 3301879 || !Z.equals("ksud")) {
                    return false;
                }
            } else if (!Z.equals("apd")) {
                return false;
            }
            str2 = "module install";
        } else {
            if (!Z.equals("magisk")) {
                return false;
            }
            str2 = "--install-module";
        }
        a.wv.w(Z() + " " + str2 + " '" + str + "' || echo error", "shell");
        a.q10 q10Var = a.q10.f457a;
        return !a.wv.e(a.q10.l(r3), "error");
    }

    public static java.lang.Boolean t1(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) obj;
        if ("true".equalsIgnoreCase(str)) {
            return java.lang.Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = a.t81.F
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b20.u(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static int u0(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return a.sv.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final java.lang.String u1(a.ey eyVar) {
        java.lang.Object I;
        if (eyVar instanceof a.w80) {
            return eyVar.toString();
        }
        try {
            I = eyVar + '@' + b0(eyVar);
        } catch (java.lang.Throwable th) {
            I = I(th);
        }
        if (a.bc1.a(I) != null) {
            I = eyVar.getClass().getName() + '@' + b0(eyVar);
        }
        return (java.lang.String) I;
    }

    public static void v(android.content.Context context, int[] iArr, java.lang.String str) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                throw new java.lang.IllegalArgumentException(a.ai1.h("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static byte[] v0(int i2) {
        return new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
    }

    public static java.lang.Double v1(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue());
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Double.valueOf((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final void w(a.d61 d61Var) {
        try {
            java.lang.reflect.Field declaredField = a.d61.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(d61Var);
            a.wv.t(obj, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuPopupHelper");
            a.e01 a2 = ((a.h01) obj).a();
            a.wv.v(a2, "helper.popup");
            java.lang.Object invoke = a2.getClass().getMethod("getListView", new java.lang.Class[0]).invoke(a2, new java.lang.Object[0]);
            a.wv.t(invoke, "null cannot be cast to non-null type android.widget.ListView");
            android.widget.ListView listView = (android.widget.ListView) invoke;
            listView.setBackgroundResource(2131231220);
            listView.setClipToOutline(true);
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean w0() {
        boolean isEnabled;
        try {
            if (y == null) {
                isEnabled = android.os.Trace.isEnabled();
                return isEnabled;
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        try {
            if (y == null) {
                x = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                y = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) y.invoke(null, java.lang.Long.valueOf(x))).booleanValue();
        } catch (java.lang.Exception e2) {
            if (!(e2 instanceof java.lang.reflect.InvocationTargetException)) {
                android.util.Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static java.lang.Integer w1(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (java.lang.Integer) obj;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf((int) java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static void x(android.database.Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (java.lang.RuntimeException e2) {
                throw e2;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static float x0(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) java.lang.Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static java.lang.Long x1(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf((long) java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.util.List y(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList == null) {
            return arrayList2;
        }
        if (arrayList2 == null) {
            return arrayList;
        }
        a.np npVar = new a.np(arrayList2.size() + arrayList.size());
        npVar.addAll(arrayList);
        npVar.addAll(arrayList2);
        return new java.util.ArrayList(npVar);
    }

    public static java.util.List y0(java.lang.Object obj) {
        java.util.List singletonList = java.util.Collections.singletonList(obj);
        a.wv.v(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final java.util.Map y1(java.util.LinkedHashMap linkedHashMap) {
        java.util.Map.Entry entry = (java.util.Map.Entry) linkedHashMap.entrySet().iterator().next();
        java.util.Map singletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        a.wv.v(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static byte[] z(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static java.util.List z0(java.lang.Object... objArr) {
        return objArr.length > 0 ? a.op.I1(objArr) : a.qb0.c;
    }

    public static boolean z1(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2) {
        java.lang.String str6;
        a.wv.w(activity, "context");
        a.wv.w(str, "toPath");
        a.wv.w(str2, "newFile");
        a.wv.w(str3, "packageName");
        if (!E0() || !a.gy.H(str2)) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("id", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("name", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("version", str5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i2);
        linkedHashMap.put("versionCode", sb.toString());
        linkedHashMap.put("author", "嘟嘟ski(SCENE)");
        linkedHashMap.put("description", "用于将第三方应用转换成系统应用的模块，由Scene创建并添加");
        java.lang.String S0 = S0(linkedHashMap);
        a.gy.h("/data/adb/modules/".concat(str3));
        if (C) {
            if (!D0()) {
                s0(activity);
            }
            str6 = "/dev/scene/modules_tmp";
            if (a.wv.e(A, "/dev/scene/modules_tmp")) {
                a.gy.h("/dev/scene/modules_tmp/".concat(str3));
                a.gy.W("/data/adb/modules/" + str3 + "/module.prop", S0);
                a.gy.W("/data/adb/modules/" + str3 + "/update", "");
                a.gy.W(str6 + "/" + str3 + "/module.prop", S0);
                if (!a.yi1.B2(str, "/vendor") || a.yi1.B2(str, "/product")) {
                    str = "/system".concat(str);
                }
                java.lang.String str7 = str6 + "/" + str3 + str;
                java.lang.String str8 = "mkdir -p '" + new java.io.File(str7).getParent() + "'\ncp -pdrf '" + str2 + "' '" + str7 + "'\nchmod -R 777 '" + str7 + "'";
                a.wv.w(str8, "shell");
                a.q10 q10Var = a.q10.f457a;
                a.q10.l(str8);
                a.gy.h(str7 + "/oat/arm/base.odex");
                a.gy.h(str7 + "/oat/arm64/base.odex");
                a.gy.h(str7 + "/oat/arm/base.art");
                a.gy.h(str7 + "/oat/arm64/base.art");
                return true;
            }
        }
        str6 = "/data/adb/modules";
        a.gy.W(str6 + "/" + str3 + "/module.prop", S0);
        if (!a.yi1.B2(str, "/vendor")) {
        }
        str = "/system".concat(str);
        java.lang.String str72 = str6 + "/" + str3 + str;
        java.lang.String str82 = "mkdir -p '" + new java.io.File(str72).getParent() + "'\ncp -pdrf '" + str2 + "' '" + str72 + "'\nchmod -R 777 '" + str72 + "'";
        a.wv.w(str82, "shell");
        a.q10 q10Var2 = a.q10.f457a;
        a.q10.l(str82);
        a.gy.h(str72 + "/oat/arm/base.odex");
        a.gy.h(str72 + "/oat/arm64/base.odex");
        a.gy.h(str72 + "/oat/arm/base.art");
        a.gy.h(str72 + "/oat/arm64/base.art");
        return true;
    }

    public abstract void J0(java.lang.Throwable th);

    public abstract void K0(int i2);

    public abstract void L0(android.graphics.Typeface typeface);

    public abstract void M0(android.graphics.Typeface typeface, boolean z2);

    public abstract void N0(a.ej1 ej1Var);

    public abstract void T0(a.p pVar, a.p pVar2);

    public abstract void U(float f2, float f3, a.gh1 gh1Var);

    public abstract void U0(a.p pVar, java.lang.Thread thread);

    public void l(int i2) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.tb1(i2, 0, this));
    }

    public void m(android.graphics.Typeface typeface) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.so(this, 1, typeface));
    }

    public abstract boolean o(a.q qVar, a.m mVar);

    public abstract boolean p(a.q qVar, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean q(a.q qVar, a.p pVar, a.p pVar2);
}
