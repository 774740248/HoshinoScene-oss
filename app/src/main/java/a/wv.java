package a;

import java.io.File;
import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wv {
    public static boolean H = false;
    public static java.lang.reflect.Method I = null;
    public static boolean J = false;
    public static java.lang.reflect.Field K = null;
    public static java.lang.String L = null;
    public static java.lang.String M = null;
    public static java.lang.String N = null;
    public static a.pm O = null;
    public static boolean P = false;
    public static java.lang.String Q = "";
    public static java.lang.String R = "";
    public static java.lang.String S = "";
    public static java.lang.String T = "";
    public static java.lang.String U = "";
    public static java.lang.String V = "";
    public static final int[] c = {android.R.attr.name, android.R.attr.tint, android.R.attr.height, android.R.attr.width, android.R.attr.alpha, android.R.attr.autoMirrored, android.R.attr.tintMode, android.R.attr.viewportWidth, android.R.attr.viewportHeight};
    public static final int[] d = {android.R.attr.name, android.R.attr.pivotX, android.R.attr.pivotY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.translateX, android.R.attr.translateY};
    public static int[] e = {android.R.attr.name, android.R.attr.fillColor, android.R.attr.pathData, android.R.attr.strokeColor, android.R.attr.strokeWidth, android.R.attr.trimPathStart, android.R.attr.trimPathEnd, android.R.attr.trimPathOffset, android.R.attr.strokeLineCap, android.R.attr.strokeLineJoin, android.R.attr.strokeMiterLimit, android.R.attr.strokeAlpha, android.R.attr.fillAlpha, android.R.attr.fillType};
    public static final int[] f = {android.R.attr.name, android.R.attr.pathData, android.R.attr.fillType};
    public static final int[] g = {android.R.attr.drawable};
    public static final int[] h = {android.R.attr.name, android.R.attr.animation};
    public static final java.lang.String[] i = {"/dev/block/bootdevice/by-name", "/dev/block/by-name", "/dev/block/platform/bootdevice/by-name"};
    public static final a.qm1 j = new a.qm1("RESUME_TOKEN");
    public static final int[] k = new int[0];
    public static final java.lang.Object[] l = new java.lang.Object[0];
    public static final a.qm1 m = new a.qm1("UNDEFINED");
    public static final a.qm1 n = new a.qm1("REUSABLE_CLAIMED");
    public static final a.qm1 o = new a.qm1("REMOVED_TASK");
    public static final a.qm1 p = new a.qm1("CLOSED_EMPTY");
    public static final a.qm1 q = new a.qm1("COMPLETING_ALREADY");
    public static final a.qm1 r = new a.qm1("COMPLETING_WAITING_CHILDREN");
    public static final a.qm1 s = new a.qm1("COMPLETING_RETRY");
    public static final a.qm1 t = new a.qm1("TOO_LATE_TO_CANCEL");
    public static final a.qm1 u = new a.qm1("SEALED");
    public static final a.mb0 v = new a.mb0(false);
    public static final a.mb0 w = new a.mb0(true);
    public static final int[] x = {android.R.attr.theme, 2130969655};
    public static final int[] y = {2130969314};
    public static final boolean[] z = new boolean[3];
    public static final byte[] A = {112, 114, 111, 0};
    public static final byte[] B = {112, 114, 109, 0};
    public static final a.gy C = new a.gy();
    public static final a.gy D = new a.gy();
    public static final a.gy E = new a.gy();
    public static final a.qm1 F = new a.qm1("NO_THREAD_ELEMENTS");
    public static final int[] G = {android.R.attr.stateListAnimator};

    public static void A(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean A0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (P) {
            return true;
        }
        if (str2 != null) {
            try {
                if (!str2.isEmpty()) {
                    R = new a.vc0(context).c(str2);
                }
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        java.lang.String substring = str.startsWith("file:///android_asset/") ? str.substring(22) : str;
        java.io.InputStream open = context.getAssets().open(substring);
        int available = open.available();
        byte[] bArr = new byte[available];
        open.read(bArr, 0, available);
        java.lang.String replaceAll = new java.lang.String(bArr, java.nio.charset.Charset.defaultCharset()).replaceAll("\r", "");
        java.util.HashMap f0 = f0(context);
        for (java.lang.String str3 : (Iterable<java.lang.String>) f0.keySet()) {
            java.lang.String str4 = (java.lang.String) f0.get(str3);
            if (str4 == null) {
                str4 = "";
            }
            replaceAll = replaceAll.replace("$({" + str3 + "})", str4);
        }
        java.lang.String d2 = a.pe0.d(context, substring);
        boolean i2 = a.pe0.i(context, substring, replaceAll.replace("$({EXECUTOR_PATH})", d2).getBytes(java.nio.charset.Charset.defaultCharset()));
        P = i2;
        if (i2) {
            Q = d2;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("kr-script-config", 0).edit();
        if (!str.equals("kr-script/executor.sh")) {
            edit.putString("executor", str);
        }
        if (str2 != null && !str2.equals("kr-script/toolkit")) {
            edit.putString("toolkitDir", str2);
        }
        edit.apply();
        return P;
    }

    public static void A1(java.lang.String str, java.lang.String str2) {
        w(str, "prop");
        a.q10 q10Var = a.q10.f457a;
        e(a.q10.L("set-prop", str + ":" + str2, null), "error");
    }

    public static float B(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static a.ey B0(a.ey eyVar) {
        w(eyVar, "<this>");
        a.fy fyVar = eyVar instanceof a.fy ? (a.fy) eyVar : null;
        if (fyVar == null) {
            return eyVar;
        }
        a.ey eyVar2 = fyVar.e;
        if (eyVar2 != null) {
            return eyVar2;
        }
        a.ty tyVar = fyVar.d;
        s(tyVar);
        a.hy hyVar = (a.hy) tyVar.g(a.gy.c);
        a.ey w80Var = hyVar != null ? new a.w80((a.xy) hyVar, fyVar) : fyVar;
        fyVar.e = w80Var;
        return w80Var;
    }

    public static void B1(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static int C(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static /* synthetic */ a.c90 C0(a.nt0 nt0Var, boolean z2, a.rt0 rt0Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((a.wt0) nt0Var).G(z2, (i2 & 2) != 0, rt0Var);
    }

    public static void C1(android.graphics.drawable.Drawable drawable, int i2) {
        a.i90.g(drawable, i2);
    }

    public static int D(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean D0(a.cz czVar) {
        a.nt0 nt0Var = (a.nt0) czVar.b().g(a.gy.f);
        if (nt0Var != null) {
            return nt0Var.a();
        }
        return true;
    }

    public static void D1(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        a.i90.h(drawable, colorStateList);
    }

    public static float[] E(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int min = java.lang.Math.min(i2, length);
        float[] fArr2 = new float[i2];
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static final boolean E0(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static void E1(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        a.i90.i(drawable, mode);
    }

    public static void F(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        w(outputStream, "out");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static boolean F0(int i2, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static final java.lang.Object F1(a.km1 km1Var, a.fp0 fp0Var) {
        java.lang.Object dwVar;
        java.lang.Object I2;
        km1Var.G(false, true, new a.e90(0, d0(km1Var.f.h()).b(km1Var.g, km1Var, km1Var.e)));
        try {
            k(fp0Var);
            dwVar = fp0Var.g(km1Var, km1Var);
        } catch (java.lang.Throwable th) {
            dwVar = new a.dw(th, false);
        }
        a.dz dzVar = a.dz.c;
        if (dwVar == dzVar || (I2 = km1Var.I(dwVar)) == r) {
            return dzVar;
        }
        if (I2 instanceof a.dw) {
            java.lang.Throwable th2 = ((a.dw) I2).f110a;
            if (!(th2 instanceof a.jm1)) {
                throw th2;
            }
            if (((a.jm1) th2).c != km1Var) {
                throw th2;
            }
            if (dwVar instanceof a.dw) {
                throw ((a.dw) dwVar).f110a;
            }
        } else {
            dwVar = P1(I2);
        }
        return dwVar;
    }

    public static boolean G(java.io.File file, android.content.res.Resources resources, int i2) {
        java.lang.Throwable th;
        java.io.InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean H2 = H(file, inputStream);
                A(inputStream);
                return H2;
            } catch (java.lang.Throwable th4) {
                th = th4;
                A(inputStream);
                throw th4;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean G0(int i2) {
        boolean z2;
        if (i2 != 0) {
            java.lang.ThreadLocal threadLocal = a.sv.f540a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = android.graphics.Color.red(i2);
            int green = android.graphics.Color.green(i2);
            int blue = android.graphics.Color.blue(i2);
            if (dArr.length != 3) {
                throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : java.lang.Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : java.lang.Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static void G1(a.fp0 fp0Var, a.f fVar, a.f fVar2) {
        try {
            t1(B0(K(fVar, fVar2, fp0Var)), a.no1.f387a, null);
        } catch (java.lang.Throwable th) {
            fVar2.j(a.b20.I(th));
            throw th;
        }
    }

    public static boolean H(java.io.File file, java.io.InputStream inputStream) {
        java.lang.Throwable th;
        java.io.IOException e = null;
        java.io.FileOutputStream fileOutputStream;
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    A(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            A(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            A(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean H0(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final java.lang.Object H1(a.mf1 mf1Var, a.mf1 mf1Var2, a.fp0 fp0Var) {
        java.lang.Object dwVar;
        java.lang.Object I2;
        try {
            k(fp0Var);
            dwVar = fp0Var.g(mf1Var2, mf1Var);
        } catch (java.lang.Throwable th) {
            dwVar = new a.dw(th, false);
        }
        a.dz dzVar = a.dz.c;
        if (dwVar == dzVar || (I2 = mf1Var.I(dwVar)) == r) {
            return dzVar;
        }
        if (I2 instanceof a.dw) {
            throw ((a.dw) I2).f110a;
        }
        return P1(I2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.si0, a.pa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.si0 I(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            a.g20 r0 = new a.g20
            r0.<init>()
            goto L11
        Lc:
            a.f20 r0 = new a.f20
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            u(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.s(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            a.ol r1 = new a.ol     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            a.si0 r5 = new a.si0
            a.ri0 r0 = new a.ri0
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.I(android.content.Context):a.si0");
    }

    public static boolean I0(android.view.View view) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        return a.sp1.d(view) == 1;
    }

    public static boolean I1(android.content.Context context) {
        w(context, "context");
        boolean z2 = false;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ProcessNameCache", 0);
        v(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        java.util.ArrayList d2 = new a.po(context, false).d(null, false);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        java.util.HashSet hashSet = new java.util.HashSet(d2.size());
        java.util.Iterator it = d2.iterator();
        while (it.hasNext()) {
            com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
            hashSet.add(appInfo.getPackageName());
            if (!e(all.get(appInfo.getPackageName()), appInfo.getAppName())) {
                edit.putString(appInfo.getPackageName(), appInfo.getAppName());
                z2 = true;
            }
        }
        for (java.lang.String str : all.keySet()) {
            v(str, "key");
            if (!a.yi1.f2(str, ':') && a.yi1.f2(str, '.') && !hashSet.contains(str)) {
                edit.remove(str);
                z2 = true;
            }
        }
        if (z2) {
            edit.apply();
        }
        return z2;
    }

    public static byte[] J(a.q30[] q30VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (a.q30 q30Var : q30VarArr) {
            i3 += ((((q30Var.g * 2) + 7) & (-8)) / 8) + (q30Var.e * 2) + X(q30Var.f460a, q30Var.b, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + q30Var.f;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i3);
        if (java.util.Arrays.equals(bArr, a.b20.p)) {
            int length = q30VarArr.length;
            while (i2 < length) {
                a.q30 q30Var2 = q30VarArr[i2];
                X1(byteArrayOutputStream, q30Var2, X(q30Var2.f460a, q30Var2.b, bArr));
                Z1(byteArrayOutputStream, q30Var2);
                W1(byteArrayOutputStream, q30Var2);
                Y1(byteArrayOutputStream, q30Var2);
                i2++;
            }
        } else {
            for (a.q30 q30Var3 : q30VarArr) {
                X1(byteArrayOutputStream, q30Var3, X(q30Var3.f460a, q30Var3.b, bArr));
            }
            int length2 = q30VarArr.length;
            while (i2 < length2) {
                a.q30 q30Var4 = q30VarArr[i2];
                Z1(byteArrayOutputStream, q30Var4);
                W1(byteArrayOutputStream, q30Var4);
                Y1(byteArrayOutputStream, q30Var4);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean J0(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final long J1(java.lang.String str, long j2, long j3, long j4) {
        java.lang.String str2;
        int i2 = a.wj1.f665a;
        try {
            str2 = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        java.lang.Long d2 = a.wi1.d2(str2);
        if (d2 == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = d2.longValue();
        if (j3 <= longValue && longValue <= j4) {
            return longValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a.ey K(java.lang.Object obj, a.ey eyVar, a.fp0 fp0Var) {
        w(fp0Var, "<this>");
        w(eyVar, "completion");
        if (fp0Var instanceof a.iq) {
            return ((a.iq) fp0Var).a(obj, eyVar);
        }
        a.ty h2 = eyVar.h();
        return h2 == a.ob0.c ? new a.vs0(obj, eyVar, fp0Var) : new a.ws0(eyVar, h2, fp0Var, obj);
    }

    public static boolean K0(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        for (java.lang.String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static int K1(java.lang.String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) J1(str, i2, i3, i4);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: NumberFormatException -> 0x00af, LOOP:3: B:29:0x006d->B:39:0x009b, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, a.s41] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, a.s41] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.s41[] L(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.L(java.lang.String):a.s41[]");
    }

    public static final boolean L0(char c2) {
        return java.lang.Character.isWhitespace(c2) || java.lang.Character.isSpaceChar(c2);
    }

    public static void L1(java.lang.Object obj, java.lang.String str) {
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException(a.ii1.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        w1(a.wv.class.getName(), classCastException);
        throw classCastException;
    }

    public static android.graphics.Path M(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        a.s41[] L2 = L(str);
        if (L2 == null) {
            return null;
        }
        try {
            a.s41.b(L2, path);
            return path;
        } catch (java.lang.RuntimeException e2) {
            throw new java.lang.RuntimeException(a.ai1.g("Error in parsing ", str), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.qi1, a.f] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static a.qi1 M0(a.cz czVar, a.xy xyVar, a.fp0 fp0Var, int i2) {
        a.ty tyVar = xyVar;
        if ((i2 & 1) != 0) {
            tyVar = a.ob0.c;
        }
        int i3 = (i2 & 2) != 0 ? 1 : 0;
        a.ty W = W(czVar.b(), tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i3 == 2 ? new a.zu0(W, fp0Var) : new a.e30(W, true);
        /* TODO: jadx type unresolved, defaulted to Object */
        av0Var.S(i3, av0Var, fp0Var);
        return (qi1) (av0Var);
    }

    public static void M1(java.lang.String str) {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(a.ai1.h("lateinit property ", str, " has not been initialized"));
        w1(a.wv.class.getName(), runtimeException);
        throw runtimeException;
    }

    public static final a.ad1 N(a.r11 r11Var) {
        a.gy gyVar = C;
        java.util.LinkedHashMap linkedHashMap = r11Var.f571a;
        a.kd1 kd1Var = (a.kd1) linkedHashMap.get(gyVar);
        if (kd1Var == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        a.fr1 fr1Var = (a.fr1) linkedHashMap.get(D);
        if (fr1Var == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        android.os.Bundle bundle = (android.os.Bundle) linkedHashMap.get(E);
        java.lang.String str = (java.lang.String) linkedHashMap.get(a.gy.k);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        a.hd1 b = kd1Var.getSavedStateRegistry().b();
        a.dd1 dd1Var = b instanceof a.dd1 ? (a.dd1) b : null;
        if (dd1Var == null) {
            throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        java.util.LinkedHashMap linkedHashMap2 = r0(fr1Var).d;
        a.ad1 ad1Var = (a.ad1) linkedHashMap2.get(str);
        if (ad1Var != null) {
            return ad1Var;
        }
        java.lang.Class[] clsArr = a.ad1.f;
        dd1Var.b();
        android.os.Bundle bundle2 = dd1Var.c;
        android.os.Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        android.os.Bundle bundle4 = dd1Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        android.os.Bundle bundle5 = dd1Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            dd1Var.c = null;
        }
        a.ad1 g2 = a.fa0.g(bundle3, bundle);
        linkedHashMap2.put(str, g2);
        return g2;
    }

    public static int N0(float f2, int i2, int i3) {
        return a.sv.b(a.sv.d(i3, java.lang.Math.round(android.graphics.Color.alpha(i3) * f2)), i2);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean N1(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a.q30[] q30VarArr) {
        java.util.ArrayList arrayList;
        int length;
        byte[] bArr2 = a.b20.n;
        int i2 = 0;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = a.b20.o;
            if (java.util.Arrays.equals(bArr, bArr3)) {
                byte[] J2 = J(q30VarArr, bArr3);
                a.b20.F1(byteArrayOutputStream, q30VarArr.length, 1);
                a.b20.F1(byteArrayOutputStream, J2.length, 4);
                byte[] z2 = a.b20.z(J2);
                a.b20.F1(byteArrayOutputStream, z2.length, 4);
                byteArrayOutputStream.write(z2);
                return true;
            }
            byte[] bArr4 = a.b20.q;
            if (java.util.Arrays.equals(bArr, bArr4)) {
                a.b20.F1(byteArrayOutputStream, q30VarArr.length, 1);
                for (a.q30 q30Var : q30VarArr) {
                    int size = q30Var.i.size() * 4;
                    java.lang.String X = X(q30Var.f460a, q30Var.b, bArr4);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    a.b20.G1(byteArrayOutputStream, X.getBytes(charset).length);
                    a.b20.G1(byteArrayOutputStream, q30Var.h.length);
                    a.b20.F1(byteArrayOutputStream, size, 4);
                    a.b20.F1(byteArrayOutputStream, q30Var.c, 4);
                    byteArrayOutputStream.write(X.getBytes(charset));
                    java.util.Iterator it = q30Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        a.b20.G1(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        a.b20.G1(byteArrayOutputStream, 0);
                    }
                    for (int i3 : q30Var.h) {
                        a.b20.G1(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = a.b20.p;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] J3 = J(q30VarArr, bArr5);
                a.b20.F1(byteArrayOutputStream, q30VarArr.length, 1);
                a.b20.F1(byteArrayOutputStream, J3.length, 4);
                byte[] z3 = a.b20.z(J3);
                a.b20.F1(byteArrayOutputStream, z3.length, 4);
                byteArrayOutputStream.write(z3);
                return true;
            }
            byte[] bArr6 = a.b20.r;
            if (!java.util.Arrays.equals(bArr, bArr6)) {
                return false;
            }
            a.b20.G1(byteArrayOutputStream, q30VarArr.length);
            for (a.q30 q30Var2 : q30VarArr) {
                java.lang.String X2 = X(q30Var2.f460a, q30Var2.b, bArr6);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                a.b20.G1(byteArrayOutputStream, X2.getBytes(charset2).length);
                java.util.TreeMap treeMap = q30Var2.i;
                a.b20.G1(byteArrayOutputStream, treeMap.size());
                a.b20.G1(byteArrayOutputStream, q30Var2.h.length);
                a.b20.F1(byteArrayOutputStream, q30Var2.c, 4);
                byteArrayOutputStream.write(X2.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    a.b20.G1(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i4 : q30Var2.h) {
                    a.b20.G1(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            a.b20.G1(byteArrayOutputStream2, q30VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (a.q30 q30Var3 : q30VarArr) {
                a.b20.F1(byteArrayOutputStream2, q30Var3.c, 4);
                a.b20.F1(byteArrayOutputStream2, q30Var3.d, 4);
                a.b20.F1(byteArrayOutputStream2, q30Var3.g, 4);
                java.lang.String X3 = X(q30Var3.f460a, q30Var3.b, bArr2);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = X3.getBytes(charset3).length;
                a.b20.G1(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(X3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            a.nu1 nu1Var = new a.nu1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(nu1Var);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i7 = 0;
            for (int i8 = 0; i8 < q30VarArr.length; i8++) {
                try {
                    a.q30 q30Var4 = q30VarArr[i8];
                    a.b20.G1(byteArrayOutputStream3, i8);
                    a.b20.G1(byteArrayOutputStream3, q30Var4.e);
                    i7 = i7 + 4 + (q30Var4.e * 2);
                    W1(byteArrayOutputStream3, q30Var4);
                } catch (java.lang.Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            a.nu1 nu1Var2 = new a.nu1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nu1Var2);
            byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < q30VarArr.length) {
                try {
                    a.q30 q30Var5 = q30VarArr[i9];
                    java.util.Iterator it3 = q30Var5.i.entrySet().iterator();
                    int i11 = i2;
                    while (it3.hasNext()) {
                        i11 |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                    try {
                        Y1(byteArrayOutputStream4, q30Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                        try {
                            Z1(byteArrayOutputStream4, q30Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            a.b20.G1(byteArrayOutputStream3, i9);
                            int length3 = byteArray3.length + i5 + byteArray4.length;
                            int i12 = i10 + 6;
                            java.util.ArrayList arrayList4 = arrayList3;
                            a.b20.F1(byteArrayOutputStream3, length3, 4);
                            a.b20.G1(byteArrayOutputStream3, i11);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i10 = i12 + length3;
                            i9++;
                            arrayList3 = arrayList4;
                            i2 = 0;
                            i5 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    byteArrayOutputStream3.close();
                }
            }
            java.util.ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
            }
            a.nu1 nu1Var3 = new a.nu1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(nu1Var3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            a.b20.F1(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                a.nu1 nu1Var4 = (a.nu1) arrayList2.get(i13);
                a.b20.F1(byteArrayOutputStream, a.ai1.a(nu1Var4.f396a), 4);
                a.b20.F1(byteArrayOutputStream, size2, 4);
                boolean z4 = nu1Var4.c;
                byte[] bArr7 = nu1Var4.b;
                if (z4) {
                    long length4 = bArr7.length;
                    byte[] z5 = a.b20.z(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(z5);
                    a.b20.F1(byteArrayOutputStream, z5.length, 4);
                    a.b20.F1(byteArrayOutputStream, length4, 4);
                    length = z5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    a.b20.F1(byteArrayOutputStream, bArr7.length, 4);
                    a.b20.F1(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i14));
            }
            return true;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String O(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = r9.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto La
        L8:
            r0 = r1
            goto L53
        La:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L42
            byte[] r2 = r9.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L42
            byte[] r0 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L42
            r2.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L42
            int r3 = r0.length     // Catch: java.security.NoSuchAlgorithmException -> L42
            r4 = 0
        L1f:
            if (r4 >= r3) goto L4a
            r5 = r0[r4]     // Catch: java.security.NoSuchAlgorithmException -> L42
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.security.NoSuchAlgorithmException -> L42
            int r6 = r5.length()     // Catch: java.security.NoSuchAlgorithmException -> L42
            r7 = 1
            if (r6 != r7) goto L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L42
            r6.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L42
            java.lang.String r7 = "0"
            r6.append(r7)     // Catch: java.security.NoSuchAlgorithmException -> L42
            r6.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L42
            java.lang.String r5 = r6.toString()     // Catch: java.security.NoSuchAlgorithmException -> L42
            goto L44
        L42:
            r0 = move-exception
            goto L4f
        L44:
            r2.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L42
            int r4 = r4 + 1
            goto L1f
        L4a:
            java.lang.String r0 = r2.toString()     // Catch: java.security.NoSuchAlgorithmException -> L42
            goto L53
        L4f:
            r0.printStackTrace()
            goto L8
        L53:
            java.lang.String r2 = "kr-script/cache/"
            java.lang.String r3 = ".sh"
            java.lang.String r0 = a.ai1.h(r2, r0, r3)
            boolean r2 = a.ai1.w(r0)
            if (r2 == 0) goto L62
            return r0
        L62:
            java.lang.String r2 = "#!/system/bin/sh\n\n"
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = "\n"
            java.lang.String r9 = r9.replaceAll(r2, r3)
            java.lang.String r2 = "\r\t"
            java.lang.String r4 = "\t"
            java.lang.String r9 = r9.replaceAll(r2, r4)
            java.lang.String r2 = "\r"
            java.lang.String r9 = r9.replaceAll(r2, r3)
            byte[] r9 = r9.getBytes()
            boolean r9 = a.pe0.i(r8, r0, r9)
            if (r9 == 0) goto L8d
            java.lang.String r8 = a.pe0.d(r8, r0)
            return r8
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.O(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int O0(int i2, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return java.lang.Math.max(0, i3 - i4);
    }

    public static java.lang.String O1(java.lang.String str) {
        w(str, "<this>");
        if (!(!a.yi1.o2("|"))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List b2 = a.sg1.b2(new a.hq0(a.yi1.s2(str, new java.lang.String[]{"\r\n", "\n", "\r"}, false, 0), new a.b10(14, str)));
        int length = str.length();
        b2.size();
        int d0 = a.b20.d0(b2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : b2) {
            int i3 = i2 + 1;
            java.lang.String str2 = null;
            if (i2 < 0) {
                a.b20.p1();
                throw null;
            }
            java.lang.String str3 = (java.lang.String) obj;
            if ((i2 != 0 && i2 != d0) || !a.yi1.o2(str3)) {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!L0(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && str3.startsWith("|", i4)) {
                    str2 = str3.substring("|".length() + i4);
                    v(str2, "this as java.lang.String).substring(startIndex)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        a.qv.i2(arrayList, sb, "\n", "", "", -1, "...", null);
        java.lang.String sb2 = sb.toString();
        v(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a.s41] */
    public static a.s41[] P(a.s41[] s41VarArr) {
        if (s41VarArr == null) {
            return null;
        }
        a.s41[] s41VarArr2 = new a.s41[s41VarArr.length];
        for (int i2 = 0; i2 < s41VarArr.length; i2++) {
            a.s41 s41Var = s41VarArr[i2];
            a.s41 obj = new a.s41();
            obj.f515a = s41Var.f515a;
            float[] fArr = s41Var.b;
            obj.b = E(fArr, fArr.length);
            s41VarArr2[i2] = obj;
        }
        return s41VarArr2;
    }

    public static int P0(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i4;
        }
        throw new java.lang.IllegalStateException(a.ii1.d("Unexpected flag: ", i2));
    }

    public static final java.lang.Object P1(java.lang.Object obj) {
        a.as0 as0Var;
        a.bs0 bs0Var = obj instanceof a.bs0 ? (a.bs0) obj : null;
        return (bs0Var == null || (as0Var = bs0Var.f51a) == null) ? obj : as0Var;
    }

    public static final java.lang.Object Q(long j2, a.ey eyVar) {
        a.no1 no1Var = a.no1.f387a;
        if (j2 <= 0) {
            return no1Var;
        }
        a.at atVar = new a.at(B0(eyVar));
        atVar.p();
        if (j2 < Long.MAX_VALUE) {
            d0(atVar.g).f(j2, atVar);
        }
        java.lang.Object o2 = atVar.o();
        return o2 == a.dz.c ? o2 : no1Var;
    }

    public static int Q0(int i2, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return java.lang.Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return java.lang.Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final java.lang.Object Q1(a.ty tyVar, java.lang.Object obj) {
        if (obj == null) {
            obj = tyVar.k(0, a.wl1.e);
            s(obj);
        }
        if (obj == null) {
            return F;
        }
        if (obj instanceof java.lang.Integer) {
            return tyVar.k(new a.zl1(tyVar, ((java.lang.Number) obj).intValue()), a.wl1.g);
        }
        a.ai1.t(obj);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.iq1, java.lang.Object] */
    public static boolean R(android.view.View view, android.view.KeyEvent keyEvent) {
        java.lang.ref.WeakReference weakReference;
        java.util.ArrayList arrayList;
        int size;
        int indexOfKey;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        java.util.ArrayList arrayList2 = a.iq1.d;
        a.iq1 iq1Var = (a.iq1) view.getTag(2131363251);
        a.iq1 iq1Var2 = iq1Var;
        if (iq1Var == null) {
            a.iq1 obj = new a.iq1();
            obj.f238a = null;
            obj.b = null;
            obj.c = null;
            view.setTag(2131363251, obj);
            iq1Var2 = obj;
        }
        java.lang.ref.WeakReference weakReference2 = iq1Var2.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        iq1Var2.c = new java.lang.ref.WeakReference(keyEvent);
        if (iq1Var2.b == null) {
            iq1Var2.b = new android.util.SparseArray();
        }
        android.util.SparseArray sparseArray = iq1Var2.b;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (java.lang.ref.WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (java.lang.ref.WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 == null || !a.up1.b(view2) || (arrayList = (java.util.ArrayList) view2.getTag(2131363252)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        a.ai1.t(arrayList.get(size));
        throw null;
    }

    public static a.ty R0(a.ry ryVar, a.sy syVar) {
        w(syVar, "key");
        return e(ryVar.getKey(), syVar) ? a.ob0.c : ryVar;
    }

    public static final a.lo1 R1(a.ey eyVar, a.ty tyVar, java.lang.Object obj) {
        a.lo1 lo1Var = null;
        if (!(eyVar instanceof a.ez)) {
            return null;
        }
        if (tyVar.g(a.mo1.c) != null) {
            a.ez ezVar = (a.ez) eyVar;
            while (true) {
                if ((ezVar instanceof a.x80) || (ezVar = ezVar.f()) == null) {
                    break;
                }
                if (ezVar instanceof a.lo1) {
                    lo1Var = (a.lo1) ezVar;
                    break;
                }
            }
            if (lo1Var != null) {
                lo1Var.U(tyVar, obj);
            }
        }
        return lo1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S(a.ou0 r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = a.wv.H
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            a.wv.I = r0     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            a.wv.H = r3
        L4c:
            java.lang.reflect.Method r0 = a.wv.I
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r0.invoke(r8, r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L5b
            goto L64
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L64
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = a.jq1.c(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = a.wv.J
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            a.wv.K = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            a.wv.J = r3
        L9a:
            java.lang.reflect.Field r7 = a.wv.K
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = a.jq1.c(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = a.jq1.c(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.S(a.ou0, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static java.nio.MappedByteBuffer S0(android.content.Context context, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor a2 = a.io1.a(context.getContentResolver(), uri, "r", null);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(a2.getFileDescriptor());
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a2.close();
                    return map;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    a2.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static final java.lang.Object S1(a.xy xyVar, a.fp0 fp0Var, a.ey eyVar) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        a.ty h2 = eyVar.h();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        xyVar.getClass();
        a.ty c2 = !java.lang.Boolean.valueOf(bool.booleanValue()).booleanValue() ? h2.c(xyVar) : W(h2, xyVar, false);
        a.nt0 nt0Var = (a.nt0) c2.g(a.gy.f);
        if (nt0Var != null && !nt0Var.a()) {
            throw ((a.wt0) nt0Var).w();
        }
        if (c2 == h2) {
            a.mf1 mf1Var = new a.mf1(eyVar, c2);
            return H1(mf1Var, mf1Var, fp0Var);
        }
        a.gy gyVar = a.gy.c;
        if (e(c2.g(gyVar), h2.g(gyVar))) {
            a.lo1 lo1Var = new a.lo1(eyVar, c2);
            a.ty tyVar = lo1Var.e;
            java.lang.Object Q1 = Q1(tyVar, null);
            try {
                return H1(lo1Var, lo1Var, fp0Var);
            } finally {
                r1(tyVar, Q1);
            }
        }
        a.mf1 mf1Var2 = new a.mf1(eyVar, c2);
        G1(fp0Var, mf1Var2, mf1Var2);
        do {
            atomicIntegerFieldUpdater = a.x80.g;
            int i2 = atomicIntegerFieldUpdater.get(mf1Var2);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended".toString());
                }
                java.lang.Object P1 = P1(mf1Var2.C());
                if (P1 instanceof a.dw) {
                    throw ((a.dw) P1).f110a;
                }
                return P1;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(mf1Var2, 0, 1));
        return a.dz.c;
    }

    public static float T(android.content.Context context, int i2) {
        return android.util.TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static java.lang.Process T0(java.lang.String str) {
        java.lang.Process l0 = l0("sh");
        java.lang.String format = java.lang.String.format(new java.lang.String(android.util.Base64.decode("c2VydmljZSBjYWxsIG1pdWkubXFzYXMuSU1RU05hdGl2ZSAyMSBpMzIgMSBzMTYgJ3NoJyBpMzIgMSBzMTYgJyVzJyBzMTYgJy9kYXRhL21xc2FzL2NhbGwubG9nJyBpMzIgNjAKc2xlZXAgMS41CmV4aXQgMApleGl0IDAK", 0)), str);
        java.io.OutputStream outputStream = l0.getOutputStream();
        outputStream.write("\n".getBytes());
        outputStream.write(format.getBytes());
        outputStream.write("\n".getBytes());
        outputStream.flush();
        return l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, a.ma1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T1(long r7, a.fp0 r9, a.ey r10) {
        /*
            boolean r0 = r10 instanceof a.lm1
            if (r0 == 0) goto L13
            r0 = r10
            a.lm1 r0 = (a.lm1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a.lm1 r0 = new a.lm1
            r0.<init>(r10)
        L18:
            a.ma1 r10 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            a.ma1 r7 = r0.f
            a.b20.q1(r10)     // Catch: a.jm1 -> L2a
            goto L58
        L2a:
            r8 = move-exception
            goto L5b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            a.b20.q1(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            a.ma1 r10 = new a.ma1
            r10.<init>()
            r0.getClass()     // Catch: a.jm1 -> L59
            r0.f = r10     // Catch: a.jm1 -> L59
            r0.h = r4     // Catch: a.jm1 -> L59
            a.km1 r2 = new a.km1     // Catch: a.jm1 -> L59
            r2.<init>(r7, r0)     // Catch: a.jm1 -> L59
            r10.c = r2     // Catch: a.jm1 -> L59
            java.lang.Object r10 = F1(r2, r9)     // Catch: a.jm1 -> L59
            if (r10 != r1) goto L58
            return r1
        L58:
            return r10
        L59:
            r8 = move-exception
            r7 = r10
        L5b:
            a.nt0 r9 = r8.c
            java.lang.Object r7 = r7.c
            if (r9 != r7) goto L62
            return r3
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.T1(long, a.fp0, a.ey):java.lang.Object");
    }

    public static final boolean U(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c2);
        char upperCase2 = java.lang.Character.toUpperCase(c3);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }

    public static android.content.res.TypedArray U0(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static android.content.Context U1(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof a.dy) && ((a.dy) context).f112a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        a.dy dyVar = new a.dy(context, resourceId);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, x);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            dyVar.getTheme().applyStyle(resourceId2, true);
        }
        return dyVar;
    }

    public static java.lang.String V(android.content.Context context, java.lang.String str, com.omarea.krscript.model.NodeInfoBase nodeInfoBase) {
        java.lang.String O2;
        if (!P) {
            z0(context);
        }
        if (str == null || str.isEmpty()) {
            return "";
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("file:///android_asset/")) {
            if (trim.startsWith("file:///android_asset/")) {
                trim = trim.substring(22);
            }
            O2 = a.pe0.j(context, trim, trim);
        } else {
            O2 = O(context, str);
        }
        if (!P) {
            z0(context);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n");
        if (nodeInfoBase == null || nodeInfoBase.getCurrentPageConfigPath().isEmpty()) {
            sb.append("export PAGE_CONFIG_DIR=''\nexport PAGE_CONFIG_FILE=''\nexport PAGE_WORK_DIR=''\nexport PAGE_WORK_DIR=''\n");
        } else {
            java.lang.String pageConfigDir = nodeInfoBase.getPageConfigDir();
            java.lang.String currentPageConfigPath = nodeInfoBase.getCurrentPageConfigPath();
            sb.append("export PAGE_CONFIG_DIR='");
            sb.append(pageConfigDir);
            sb.append("'\nexport PAGE_CONFIG_FILE='");
            sb.append(currentPageConfigPath);
            sb.append("'\n");
            if (currentPageConfigPath.startsWith("file:///android_asset/")) {
                sb.append("export PAGE_WORK_DIR='");
                sb.append(new a.vc0(context).d(pageConfigDir));
                sb.append("'\nexport PAGE_WORK_FILE='");
                sb.append(new a.vc0(context).d(currentPageConfigPath));
                sb.append("'\n");
            } else {
                sb.append("export PAGE_WORK_DIR='");
                sb.append(pageConfigDir);
                sb.append("'\nexport PAGE_WORK_FILE='");
                sb.append(currentPageConfigPath);
                sb.append("'\n");
            }
        }
        sb.append("\n\n");
        sb.append(Q + " \"" + O2 + "\"");
        java.lang.String sb2 = sb.toString();
        w(sb2, "shell");
        a.q10 q10Var = a.q10.f457a;
        return a.q10.l(sb2);
    }

    public static void V1(java.io.File file, byte[] bArr) {
        w(bArr, "array");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            z(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.ma1] */
    public static final a.ty W(a.ty tyVar, a.ty tyVar2, boolean z2) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        a.uy uyVar = a.uy.f;
        boolean booleanValue = ((java.lang.Boolean) tyVar.k(bool, uyVar)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) tyVar2.k(bool, uyVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return tyVar.c(tyVar2);
        }
        a.ma1 obj = new a.ma1();
        obj.c = tyVar2;
        a.ob0 ob0Var = a.ob0.c;
        a.ty tyVar3 = (a.ty) tyVar.k(ob0Var, new a.xi1(obj, z2, 2));
        if (booleanValue2) {
            obj.c = ((a.ty) obj.c).k(ob0Var, a.uy.e);
        }
        return tyVar3.c((a.ty) obj.c);
    }

    public static void W1(java.io.ByteArrayOutputStream byteArrayOutputStream, a.q30 q30Var) {
        int i2 = 0;
        for (int i3 : q30Var.h) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i3);
            a.b20.G1(byteArrayOutputStream, valueOf.intValue() - i2);
            i2 = valueOf.intValue();
        }
    }

    public static java.lang.String X(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = a.b20.r;
        boolean equals = java.util.Arrays.equals(bArr, bArr2);
        byte[] bArr3 = a.b20.q;
        java.lang.String str3 = (equals || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        return a.ai1.j(sb, (java.util.Arrays.equals(bArr, bArr2) || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static android.graphics.PorterDuff.Mode X0(int i2, android.graphics.PorterDuff.Mode mode) {
        if (i2 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void X1(java.io.ByteArrayOutputStream byteArrayOutputStream, a.q30 q30Var, java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        a.b20.G1(byteArrayOutputStream, str.getBytes(charset).length);
        a.b20.G1(byteArrayOutputStream, q30Var.e);
        a.b20.F1(byteArrayOutputStream, q30Var.f, 4);
        a.b20.F1(byteArrayOutputStream, q30Var.c, 4);
        a.b20.F1(byteArrayOutputStream, q30Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static a.ry Y(a.ry ryVar, a.sy syVar) {
        w(syVar, "key");
        if (e(ryVar.getKey(), syVar)) {
            return ryVar;
        }
        return null;
    }

    public static void Y0(android.animation.AnimatorSet animatorSet, java.util.ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i2);
            j2 = java.lang.Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void Y1(java.io.ByteArrayOutputStream byteArrayOutputStream, a.q30 q30Var) {
        byte[] bArr = new byte[(((q30Var.g * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) q30Var.i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            int i2 = intValue2 & 2;
            int i3 = q30Var.g;
            if (i2 != 0) {
                int P0 = P0(2, intValue, i3);
                int i4 = P0 / 8;
                bArr[i4] = (byte) ((1 << (P0 % 8)) | bArr[i4]);
            }
            if ((intValue2 & 4) != 0) {
                int P02 = P0(4, intValue, i3);
                int i5 = P02 / 8;
                bArr[i5] = (byte) ((1 << (P02 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static int Z(android.content.Context context, int i2, int i3) {
        android.util.TypedValue m1 = m1(context, i2);
        if (m1 == null) {
            return i3;
        }
        int i4 = m1.resourceId;
        if (i4 == 0) {
            return m1.data;
        }
        java.lang.Object obj = a.zx.f748a;
        return a.yx.a(context, i4);
    }

    public static a.ty Z0(a.ty tyVar, a.ty tyVar2) {
        w(tyVar2, "context");
        return tyVar2 == a.ob0.c ? tyVar : (a.ty) tyVar2.k(tyVar, a.tv.f);
    }

    public static void Z1(java.io.ByteArrayOutputStream byteArrayOutputStream, a.q30 q30Var) {
        int i2 = 0;
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) q30Var.i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                a.b20.G1(byteArrayOutputStream, intValue - i2);
                a.b20.G1(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static int a0(android.view.View view, int i2) {
        android.content.Context context = view.getContext();
        android.util.TypedValue q1 = q1(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = q1.resourceId;
        if (i3 == 0) {
            return q1.data;
        }
        java.lang.Object obj = a.zx.f748a;
        return a.yx.a(context, i3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.u01, a.kk1] */
    public static a.u01 a1(java.nio.MappedByteBuffer mappedByteBuffer) {
        long j2;
        java.nio.ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a.vu0 vu0Var = new a.vu0(duplicate);
        vu0Var.D(4);
        int i2 = ((java.nio.ByteBuffer) vu0Var.d).getShort() & 65535;
        if (i2 > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        vu0Var.D(6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = ((java.nio.ByteBuffer) vu0Var.d).getInt();
            vu0Var.D(4);
            j2 = vu0Var.C();
            vu0Var.D(4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            vu0Var.D((int) (j2 - ((java.nio.ByteBuffer) vu0Var.d).position()));
            vu0Var.D(12);
            long C2 = vu0Var.C();
            for (int i5 = 0; i5 < C2; i5++) {
                int i6 = ((java.nio.ByteBuffer) vu0Var.d).getInt();
                long C3 = vu0Var.C();
                vu0Var.C();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (C3 + j2));
                    a.u01 kk1Var = new a.u01();
                    duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    kk1Var.b = duplicate;
                    kk1Var.f295a = position;
                    int i7 = position - duplicate.getInt(position);
                    kk1Var.c = i7;
                    kk1Var.d = kk1Var.b.getShort(i7);
                    return kk1Var;
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    public static final a.ay b(a.ty tyVar) {
        if (tyVar.g(a.gy.f) == null) {
            tyVar = tyVar.c(new a.qt0(null));
        }
        return new a.ay(tyVar);
    }

    public static android.content.res.ColorStateList b0(android.content.Context context, a.nk nkVar, int i2) {
        int x2;
        android.content.res.ColorStateList b;
        return (!nkVar.C(i2) || (x2 = nkVar.x(i2, 0)) == 0 || (b = a.zx.b(context, x2)) == null) ? nkVar.i(i2) : b;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, a.rc0] */
    public static byte[] b1(java.io.File file) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.lang.OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                int read = fileInputStream.read(bArr, i4, i3);
                if (read < 0) {
                    break;
                }
                i3 -= read;
                i4 += read;
            }
            if (i3 > 0) {
                bArr = java.util.Arrays.copyOf(bArr, i4);
                v(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8193);
                    byteArrayOutputStream.write(read2);
                    F(fileInputStream, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size() + i2;
                    if (size < 0) {
                        throw new java.lang.OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a2 = byteArrayOutputStream.toByteArray();
                    bArr = java.util.Arrays.copyOf(bArr, size);
                    v(bArr, "copyOf(this, newSize)");
                    java.lang.System.arraycopy(a2, 0, bArr, i2, byteArrayOutputStream.size());
                }
            }
            z(fileInputStream, null);
            return bArr;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                z(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void c(java.lang.StringBuilder sb, java.lang.Object obj, a.bp0 bp0Var) {
        if (bp0Var != null) {
            sb.append((java.lang.CharSequence) bp0Var.i(obj));
            return;
        }
        if (obj == null || (obj instanceof java.lang.CharSequence)) {
            sb.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            sb.append(((java.lang.Character) obj).charValue());
        } else {
            sb.append((java.lang.CharSequence) java.lang.String.valueOf(obj));
        }
    }

    public static android.content.res.ColorStateList c0(android.content.Context context, android.content.res.TypedArray typedArray, int i2) {
        int resourceId;
        android.content.res.ColorStateList b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b = a.zx.b(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : b;
    }

    public static final byte[] c1(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        F(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        v(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static boolean d(java.lang.Float f2, java.lang.Float f3) {
        if (f2 == null) {
            if (f3 != null) {
                return false;
            }
        } else if (f3 == null || f2.floatValue() != f3.floatValue()) {
            return false;
        }
        return true;
    }

    public static final a.f30 d0(a.ty tyVar) {
        a.ry g2 = tyVar.g(a.gy.c);
        a.f30 f30Var = g2 instanceof a.f30 ? (a.f30) g2 : null;
        return f30Var == null ? a.i20.f224a : f30Var;
    }

    public static int[] d1(java.io.ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) a.b20.a1(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static android.graphics.drawable.Drawable e0(android.content.Context context, android.content.res.TypedArray typedArray, int i2) {
        int resourceId;
        android.graphics.drawable.Drawable Y;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (Y = a.b20.Y(context, resourceId)) == null) ? typedArray.getDrawable(i2) : Y;
    }

    public static a.q30[] e1(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a.q30[] q30VarArr) {
        byte[] bArr3 = a.b20.s;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, a.b20.t)) {
                throw new java.lang.IllegalStateException("Unsupported meta version");
            }
            int a1 = (int) a.b20.a1(fileInputStream, 2);
            byte[] Y0 = a.b20.Y0(fileInputStream, (int) a.b20.a1(fileInputStream, 4), (int) a.b20.a1(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new java.lang.IllegalStateException("Content found after the end of file");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(Y0);
            try {
                a.q30[] g1 = g1(byteArrayInputStream, bArr2, a1, q30VarArr);
                byteArrayInputStream.close();
                return g1;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(a.b20.n, bArr2)) {
            throw new java.lang.IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            throw new java.lang.IllegalStateException("Unsupported meta version");
        }
        int a12 = (int) a.b20.a1(fileInputStream, 1);
        byte[] Y02 = a.b20.Y0(fileInputStream, (int) a.b20.a1(fileInputStream, 4), (int) a.b20.a1(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(Y02);
        try {
            a.q30[] f1 = f1(byteArrayInputStream2, a12, q30VarArr);
            byteArrayInputStream2.close();
            return f1;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static java.util.Collection f(java.util.ArrayList arrayList) {
        if (!(arrayList instanceof a.du0) || (arrayList instanceof a.eu0)) {
            return arrayList;
        }
        L1(arrayList, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static java.util.HashMap f0(android.content.Context context) {
        int i2;
        long longVersionCode;
        int i3;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("TOOLKIT", R);
        if (a.b20.D0()) {
            java.lang.String concat = a.b20.A.concat("/scene_systemless/");
            if (concat.endsWith("/")) {
                concat = concat.substring(0, concat.length() - 1);
            }
            hashMap.put("MAGISK_PATH", concat);
        } else {
            hashMap.put("MAGISK_PATH", "");
        }
        java.lang.String c2 = a.pe0.c(context);
        if (c2.endsWith("/")) {
            c2 = c2.substring(0, c2.length() - 1);
        }
        hashMap.put("START_DIR", c2);
        if (a.b20.C) {
            hashMap.put("KSU", "true");
        }
        hashMap.put("TEMP_DIR", context.getCacheDir().getAbsolutePath());
        try {
            i2 = (int) ((android.os.UserManager) context.getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
        } catch (java.lang.Exception unused) {
            i2 = 0;
        }
        hashMap.put("ANDROID_UID", "" + i2);
        try {
            try {
                i3 = (int) ((android.os.UserManager) context.getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
            } catch (java.lang.Exception unused2) {
                i3 = 0;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("u");
            sb.append(i3);
            sb.append("_a");
            sb.append((android.os.Process.myUid() % 100000) - 10000);
            hashMap.put("APP_USER_ID", sb.toString());
        } catch (java.lang.Exception unused3) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
        int i4 = android.os.Build.VERSION.SDK_INT;
        sb2.append(i4);
        hashMap.put("ANDROID_SDK", sb2.toString());
        a.q10 q10Var = a.q10.f457a;
        hashMap.put("ROOT_PERMISSION", a.q10.t().equals("root") ? "true" : "false");
        hashMap.put("SDCARD_PATH", android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
        java.lang.String d2 = a.pe0.d(context, "busybox");
        if (new java.io.File(a.pe0.d(context, "busybox")).exists()) {
            hashMap.put("BUSYBOX", d2);
        } else {
            hashMap.put("BUSYBOX", "busybox");
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("PACKAGE_NAME", context.getPackageName());
            hashMap.put("PACKAGE_VERSION_NAME", packageInfo.versionName);
            if (i4 >= 28) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("");
                longVersionCode = packageInfo.getLongVersionCode();
                sb3.append(longVersionCode);
                hashMap.put("PACKAGE_VERSION_CODE", sb3.toString());
            } else {
                hashMap.put("PACKAGE_VERSION_CODE", "" + packageInfo.versionCode);
            }
        } catch (java.lang.Exception unused4) {
        }
        return hashMap;
    }

    public static a.q30[] f1(java.io.ByteArrayInputStream byteArrayInputStream, int i2, a.q30[] q30VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a.q30[0];
        }
        if (i2 != q30VarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a1 = (int) a.b20.a1(byteArrayInputStream, 2);
            iArr[i3] = (int) a.b20.a1(byteArrayInputStream, 2);
            strArr[i3] = new java.lang.String(a.b20.W0(byteArrayInputStream, a1), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            a.q30 q30Var = q30VarArr[i4];
            if (!q30Var.b.equals(strArr[i4])) {
                throw new java.lang.IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            q30Var.e = i5;
            q30Var.h = d1(byteArrayInputStream, i5);
        }
        return q30VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.f, a.e30] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static a.e30 g(a.cz czVar, a.k20 k20Var, a.fp0 fp0Var, int i2) {
        a.ty tyVar = k20Var;
        if ((i2 & 1) != 0) {
            tyVar = a.ob0.c;
        }
        int i3 = (i2 & 2) != 0 ? 1 : 0;
        a.ty W = W(czVar.b(), tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        java.lang.Object zu0Var = i3 == 2 ? new a.zu0(W, fp0Var) : new a.f(W, true);
        /* TODO: jadx type unresolved, defaulted to Object */
        zu0Var.S(i3, zu0Var, fp0Var);
        return (e30) (zu0Var);
    }

    public static java.lang.String g0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!P) {
            z0(context);
        }
        if (str == null || str.isEmpty()) {
            return "";
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("file:///android_asset/")) {
            if (trim.startsWith("file:///android_asset/")) {
                trim = trim.substring(22);
            }
            java.lang.String j2 = a.pe0.j(context, trim, trim);
            if (j2 != null) {
                str = j2;
            }
        } else {
            str = O(context, str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Q);
        sb.append(" \"");
        sb.append(str);
        sb.append("\" \"");
        return a.ai1.j(sb, str2, "\"");
    }

    public static a.q30[] g1(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, a.q30[] q30VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a.q30[0];
        }
        if (i2 != q30VarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            a.b20.a1(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(a.b20.W0(byteArrayInputStream, (int) a.b20.a1(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long a1 = a.b20.a1(byteArrayInputStream, 4);
            int a12 = (int) a.b20.a1(byteArrayInputStream, 2);
            a.q30 q30Var = null;
            if (q30VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= q30VarArr.length) {
                        break;
                    }
                    if (q30VarArr[i4].b.equals(substring)) {
                        q30Var = q30VarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (q30Var == null) {
                throw new java.lang.IllegalStateException("Missing profile key: ".concat(str));
            }
            q30Var.d = a1;
            int[] d1 = d1(byteArrayInputStream, a12);
            if (java.util.Arrays.equals(bArr, a.b20.r)) {
                q30Var.e = a12;
                q30Var.h = d1;
            }
        }
        return q30VarArr;
    }

    public static final void h(int i2, a.ka1 ka1Var, android.widget.ListView listView, int i3, a.ha1 ha1Var, a.fp0 fp0Var, int i4) {
        int i5;
        int firstVisiblePosition;
        android.view.View childAt;
        android.widget.CheckBox checkBox;
        if (i4 >= i2 && (i5 = i4 - i2) != ka1Var.c && (firstVisiblePosition = i4 - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount() && (childAt = listView.getChildAt(firstVisiblePosition)) != null && (checkBox = (android.widget.CheckBox) childAt.findViewById(i3)) != null && checkBox.getVisibility() == 0) {
            boolean isChecked = checkBox.isChecked();
            boolean z2 = ha1Var.c;
            if (isChecked != z2) {
                checkBox.setChecked(z2);
                listView.performHapticFeedback(4);
            }
            fp0Var.g(java.lang.Integer.valueOf(i5), java.lang.Boolean.valueOf(ha1Var.c));
            ka1Var.c = i5;
        }
    }

    public static final java.lang.Class h0(a.bu0 bu0Var) {
        w(bu0Var, "<this>");
        java.lang.Class a2 = ((a.av) bu0Var).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        java.lang.String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a2 : java.lang.Double.class;
            case 104431:
                return !name.equals("int") ? a2 : java.lang.Integer.class;
            case 3039496:
                return !name.equals("byte") ? a2 : java.lang.Byte.class;
            case 3052374:
                return !name.equals("char") ? a2 : java.lang.Character.class;
            case 3327612:
                return !name.equals("long") ? a2 : java.lang.Long.class;
            case 3625364:
                return !name.equals("void") ? a2 : java.lang.Void.class;
            case 64711720:
                return !name.equals("boolean") ? a2 : java.lang.Boolean.class;
            case 97526364:
                return !name.equals("float") ? a2 : java.lang.Float.class;
            case 109413500:
                return !name.equals("short") ? a2 : java.lang.Short.class;
            default:
                return a2;
        }
    }

    public static a.q30[] h1(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, a.b20.o)) {
            throw new java.lang.IllegalStateException("Unsupported version");
        }
        int a1 = (int) a.b20.a1(fileInputStream, 1);
        byte[] Y0 = a.b20.Y0(fileInputStream, (int) a.b20.a1(fileInputStream, 4), (int) a.b20.a1(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(Y0);
        try {
            a.q30[] k1 = k1(byteArrayInputStream, str, a1);
            byteArrayInputStream.close();
            return k1;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = O0(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = j(r9, r10, r11)
            boolean r1 = j(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = O0(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static float i0(java.lang.String[] strArr, int i2) {
        float parseFloat = java.lang.Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new java.lang.IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static java.lang.String i1(java.io.File file, java.nio.charset.Charset charset) {
        w(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        try {
            java.lang.String j1 = j1(inputStreamReader);
            z(inputStreamReader, null);
            return j1;
        } finally {
        }
    }

    public static boolean j(int i2, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static a.p4 j0(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i2) {
        a.p4 p4Var;
        if (x0(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new a.p4((android.graphics.Shader) null, (android.content.res.ColorStateList) null, typedValue.data);
            }
            try {
                p4Var = a.p4.g(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                p4Var = null;
            }
            if (p4Var != null) {
                return p4Var;
            }
        }
        return new a.p4((android.graphics.Shader) null, (android.content.res.ColorStateList) null, 0);
    }

    public static final java.lang.String j1(java.io.Reader reader) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        java.lang.String stringWriter2 = stringWriter.toString();
        v(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static void k(java.lang.Object obj) {
        if (obj != null) {
            if (obj instanceof a.np0) {
                if (obj instanceof a.op0) {
                    if (((a.op0) obj).d() == 2) {
                        return;
                    }
                } else if (!(obj instanceof a.qo0) && !(obj instanceof a.bp0) && (obj instanceof a.fp0)) {
                    return;
                }
            }
            L1(obj, "kotlin.jvm.functions.Function2");
            throw null;
        }
    }

    public static java.util.ArrayList k0() {
        java.lang.String str;
        java.lang.String[] strArr = i;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                str = null;
                break;
            }
            str = strArr[i2];
            w(str, "path");
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isDirectory()) {
                break;
            }
            a.q10 q10Var = a.q10.f457a;
            if (a.yi1.B2(a.q10.L("path-basic-info", str, 10000L), "dir")) {
                break;
            }
            i2++;
        }
        if (str != null) {
            return a.gy.I(str, false);
        }
        return null;
    }

    public static a.q30[] k1(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i2) {
        java.util.TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new a.q30[0];
        }
        a.q30[] q30VarArr = new a.q30[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a1 = (int) a.b20.a1(byteArrayInputStream, 2);
            int a12 = (int) a.b20.a1(byteArrayInputStream, 2);
            q30VarArr[i3] = new a.q30(str, new java.lang.String(a.b20.W0(byteArrayInputStream, a1), java.nio.charset.StandardCharsets.UTF_8), a.b20.a1(byteArrayInputStream, 4), a12, (int) a.b20.a1(byteArrayInputStream, 4), (int) a.b20.a1(byteArrayInputStream, 4), new int[a12], new java.util.TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            a.q30 q30Var = q30VarArr[i4];
            int available = byteArrayInputStream.available() - q30Var.f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = q30Var.i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) a.b20.a1(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(i5), 1);
                for (int a13 = (int) a.b20.a1(byteArrayInputStream, 2); a13 > 0; a13--) {
                    a.b20.a1(byteArrayInputStream, 2);
                    int a14 = (int) a.b20.a1(byteArrayInputStream, 1);
                    if (a14 != 6 && a14 != 7) {
                        while (a14 > 0) {
                            a.b20.a1(byteArrayInputStream, 1);
                            for (int a15 = (int) a.b20.a1(byteArrayInputStream, 1); a15 > 0; a15--) {
                                a.b20.a1(byteArrayInputStream, 2);
                            }
                            a14--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new java.lang.IllegalStateException("Read too much data during profile line parse");
            }
            q30Var.h = d1(byteArrayInputStream, q30Var.e);
            int i6 = q30Var.g;
            java.util.BitSet valueOf = java.util.BitSet.valueOf(a.b20.W0(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(P0(2, i7, i6)) ? 2 : 0;
                if (valueOf.get(P0(4, i7, i6))) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return q30VarArr;
    }

    public static int l(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static java.lang.Process l0(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = S;
        if (str3 == null || str3.isEmpty()) {
            str2 = null;
        } else {
            if (T.isEmpty()) {
                try {
                    java.lang.Process exec = java.lang.Runtime.getRuntime().exec("sh");
                    java.io.OutputStream outputStream = exec.getOutputStream();
                    outputStream.write("echo $PATH".getBytes());
                    outputStream.flush();
                    outputStream.close();
                    java.io.InputStream inputStream = exec.getInputStream();
                    byte[] bArr = new byte[16384];
                    int read = inputStream.read(bArr);
                    inputStream.close();
                    exec.destroy();
                    java.lang.String trim = new java.lang.String(bArr, 0, read).trim();
                    if (trim.length() <= 0) {
                        throw new java.lang.RuntimeException("未能获取到$PATH参数");
                    }
                    T = trim;
                } catch (java.lang.Exception unused) {
                    T = "/sbin:/system/sbin:/system/bin:/system/xbin:/odm/bin:/vendor/bin:/vendor/xbin";
                }
            }
            java.lang.String str4 = T;
            if (q0().equals("KernelSU") && !str4.contains(":/data/adb/ksu/bin")) {
                str4 = str4.concat(":/data/adb/ksu/bin");
            }
            str2 = "PATH=" + str4 + ":" + S;
        }
        java.lang.Process exec2 = java.lang.Runtime.getRuntime().exec(str);
        if (str2 != null) {
            java.io.OutputStream outputStream2 = exec2.getOutputStream();
            outputStream2.write("export ".getBytes());
            outputStream2.write(str2.getBytes());
            outputStream2.write("\n".getBytes());
            outputStream2.flush();
        }
        return exec2;
    }

    public static final java.lang.Object l1(java.lang.Object obj) {
        return obj instanceof a.dw ? a.b20.I(((a.dw) obj).f110a) : obj;
    }

    public static int m(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int m0(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static android.util.TypedValue m1(android.content.Context context, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean n(a.s41[] s41VarArr, a.s41[] s41VarArr2) {
        if (s41VarArr == null || s41VarArr2 == null || s41VarArr.length != s41VarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < s41VarArr.length; i2++) {
            a.s41 s41Var = s41VarArr[i2];
            char c2 = s41Var.f515a;
            a.s41 s41Var2 = s41VarArr2[i2];
            if (c2 != s41Var2.f515a || s41Var.b.length != s41Var2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String n0(java.lang.String str) {
        try {
            java.lang.String property = java.lang.System.getProperty(str);
            if (property != null && property.length() != 0) {
                return a.yi1.G2(property).toString();
            }
        } catch (java.lang.Exception unused) {
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L2 = a.q10.L("get-prop", str, null);
        return e(L2, "error") ? "" : a.yi1.G2(L2).toString();
    }

    public static boolean n1(int i2, android.content.Context context, boolean z2) {
        android.util.TypedValue m1 = m1(context, i2);
        return (m1 == null || m1.type != 18) ? z2 : m1.data != 0;
    }

    public static final void o(a.ty tyVar, java.util.concurrent.CancellationException cancellationException) {
        a.nt0 nt0Var = (a.nt0) tyVar.g(a.gy.f);
        if (nt0Var != null) {
            a.wt0 wt0Var = (a.wt0) nt0Var;
            if (cancellationException == null) {
                cancellationException = new a.ot0(wt0Var.r(), null, wt0Var);
            }
            wt0Var.p(cancellationException);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(2:6|7)|(6:9|10|11|(1:13)|15|(4:17|(1:19)(1:22)|20|21)(2:23|(2:25|26)(2:27|(2:29|30)(2:31|(2:33|34)(2:35|36)))))|39|10|11|(0)|15|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x001f, B:13:0x0027), top: B:10:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.pm o0() {
        /*
            java.lang.String r0 = "unknown"
            a.pm r1 = a.wv.O
            if (r1 == 0) goto L7
            return r1
        L7:
            a.pm r1 = new a.pm
            r2 = 28
            r3 = 0
            r1.<init>(r2, r3)
            a.wv.O = r1
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L1e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1e
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L2b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2b
            java.lang.String r0 = r2.toLowerCase()     // Catch: java.lang.Throwable -> L2b
        L2b:
            java.lang.String r2 = "huawei"
            java.lang.String[] r3 = new java.lang.String[]{r2}
            boolean r3 = K0(r1, r0, r3)
            if (r3 == 0) goto L59
            a.pm r0 = a.wv.O
            r0.d = r2
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = p0(r0)
            java.lang.String r1 = "_"
            java.lang.String[] r1 = r0.split(r1)
            int r2 = r1.length
            r3 = 1
            if (r2 <= r3) goto L52
            a.pm r0 = a.wv.O
            r1 = r1[r3]
            r0.e = r1
            goto L56
        L52:
            a.pm r1 = a.wv.O
            r1.e = r0
        L56:
            a.pm r0 = a.wv.O
            return r0
        L59:
            java.lang.String r2 = "vivo"
            java.lang.String[] r3 = new java.lang.String[]{r2}
            boolean r3 = K0(r1, r0, r3)
            if (r3 == 0) goto L74
            a.pm r0 = a.wv.O
            r0.d = r2
            java.lang.String r1 = "ro.vivo.os.build.display.id"
            java.lang.String r1 = p0(r1)
            r0.e = r1
            a.pm r0 = a.wv.O
            return r0
        L74:
            java.lang.String r2 = "xiaomi"
            java.lang.String[] r3 = new java.lang.String[]{r2}
            boolean r3 = K0(r1, r0, r3)
            if (r3 == 0) goto L8f
            a.pm r0 = a.wv.O
            r0.d = r2
            java.lang.String r1 = "ro.build.version.incremental"
            java.lang.String r1 = p0(r1)
            r0.e = r1
            a.pm r0 = a.wv.O
            return r0
        L8f:
            java.lang.String r2 = "oppo"
            java.lang.String[] r3 = new java.lang.String[]{r2}
            boolean r1 = K0(r1, r0, r3)
            if (r1 == 0) goto Laa
            a.pm r0 = a.wv.O
            r0.d = r2
            java.lang.String r1 = "ro.build.version.opporom"
            java.lang.String r1 = p0(r1)
            r0.e = r1
            a.pm r0 = a.wv.O
            return r0
        Laa:
            a.pm r1 = a.wv.O
            r1.d = r0
            java.lang.String r0 = ""
            java.lang.String r0 = p0(r0)
            r1.e = r0
            a.pm r0 = a.wv.O
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.o0():a.pm");
    }

    public static int o1(android.content.Context context, int i2, int i3) {
        android.util.TypedValue m1 = m1(context, i2);
        return (m1 == null || m1.type != 16) ? i3 : m1.data;
    }

    public static void p(a.nt0 nt0Var) {
        a.wt0 wt0Var = (a.wt0) nt0Var;
        wt0Var.getClass();
        wt0Var.p(new a.ot0(wt0Var.r(), null, wt0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #6 {all -> 0x00b6, blocks: (B:60:0x00aa, B:62:0x00b2), top: B:59:0x00aa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String p0(java.lang.String r6) {
        /*
            java.lang.String r0 = "getprop "
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L9c
            r1 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            if (r0 == 0) goto L31
            r3.close()     // Catch: java.io.IOException -> L47
            goto L47
        L31:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L46
        L35:
            r6 = move-exception
            r1 = r3
            goto L3b
        L38:
            r1 = r3
            goto L41
        L3a:
            r6 = move-exception
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r6
        L41:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L46
        L46:
            r0 = r2
        L47:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4f
        L4d:
            r2 = r0
            goto L9c
        L4f:
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Exception -> L6c
            r0.<init>()     // Catch: java.lang.Exception -> L6c
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L6c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L6c
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L6c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L6c
            r0.load(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = r0.getProperty(r6, r2)     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r0 = r2
        L6d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L74
            goto L4d
        L74:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 >= r3) goto L4d
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = "get"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L9c
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L9c
            r5 = 1
            r4[r5] = r0     // Catch: java.lang.Exception -> L9c
            java.lang.reflect.Method r0 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L9c
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r2}     // Catch: java.lang.Exception -> L9c
            java.lang.Object r6 = r0.invoke(r1, r6)     // Catch: java.lang.Exception -> L9c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L9c
            r2 = r6
        L9c:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto Laa
            boolean r6 = r2.equals(r0)
            if (r6 == 0) goto Lb6
        Laa:
            java.lang.String r6 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto Lb6
            java.lang.String r2 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto Lbd
            return r0
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wv.p0(java.lang.String):java.lang.String");
    }

    public static android.animation.TimeInterpolator p1(android.content.Context context, int i2, android.view.animation.Interpolator interpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String valueOf = java.lang.String.valueOf(typedValue.string);
        if (!J0(valueOf, "cubic-bezier") && !J0(valueOf, "path")) {
            return android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!J0(valueOf, "cubic-bezier")) {
            if (J0(valueOf, "path")) {
                return a.r41.c(M(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new java.lang.IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        java.lang.String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return a.r41.b(i0(split, 0), i0(split, 1), i0(split, 2), i0(split, 3));
        }
        throw new java.lang.IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static void q(java.lang.String str, boolean z2) {
        if (!z2) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static java.lang.String q0() {
        if (!U.isEmpty()) {
            return U;
        }
        if (V.equals("mqsas")) {
            U = "mqsas";
        } else if (V.equals("xsu")) {
            U = "xsu";
        } else {
            try {
                java.lang.Process exec = java.lang.Runtime.getRuntime().exec("su -v");
                java.io.OutputStream outputStream = exec.getOutputStream();
                outputStream.write("exit 0\nexit 0".getBytes());
                outputStream.flush();
                outputStream.close();
                java.io.InputStream inputStream = exec.getInputStream();
                byte[] bArr = new byte[1024];
                int read = inputStream.read(bArr);
                inputStream.close();
                exec.destroy();
                java.lang.String upperCase = new java.lang.String(bArr, 0, read).trim().toUpperCase();
                if (upperCase.contains("MAGISK")) {
                    U = "MAGISK";
                } else if (upperCase.contains("KERNELSU")) {
                    U = "KernelSU";
                } else if (upperCase.contains("APATCH")) {
                    U = "apd";
                }
            } catch (java.lang.Exception unused) {
            }
            if (U.isEmpty()) {
                U = "KernelSU";
            }
        }
        return U;
    }

    public static android.util.TypedValue q1(int i2, android.content.Context context, java.lang.String str) {
        android.util.TypedValue m1 = m1(context, i2);
        if (m1 != null) {
            return m1;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void r(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static final a.ed1 r0(a.fr1 fr1Var) {
        w(fr1Var, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.na1.f375a.getClass();
        java.lang.Class a2 = new a.bv(a.ed1.class).a();
        t(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new a.ar1(a2));
        a.ar1[] ar1VarArr = (a.ar1[]) arrayList.toArray(new a.ar1[0]);
        return (a.ed1) new a.nk(fr1Var, new a.is0((a.ar1[]) java.util.Arrays.copyOf(ar1VarArr, ar1VarArr.length))).f(a.ed1.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void r1(a.ty tyVar, java.lang.Object obj) {
        if (obj == F) {
            return;
        }
        if (!(obj instanceof a.zl1)) {
            java.lang.Object k2 = tyVar.k(null, a.wl1.f);
            t(k2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a.ai1.t(k2);
            throw null;
        }
        a.zl1 zl1Var = (a.zl1) obj;
        a.vl1[] vl1VarArr = zl1Var.b;
        int length = vl1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        a.vl1 vl1Var = vl1VarArr[length];
        s(null);
        java.lang.Object obj2 = zl1Var.f740a[length];
        throw null;
    }

    public static void s(java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        w1(a.wv.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static java.lang.String s0(boolean z2) {
        if (V.isEmpty() || z2) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.lang.String q0 = q0();
                if (q0.equals("MAGISK")) {
                    V = "magisk su -mm";
                } else if (q0.equals("KernelSU")) {
                    V = "su -M";
                } else {
                    V = "su";
                }
            } else {
                V = "su";
            }
        }
        return V;
    }

    public static final void s1(a.y80 y80Var, a.ey eyVar, boolean z2) {
        java.lang.Object g2 = y80Var.g();
        java.lang.Throwable c2 = y80Var.c(g2);
        java.lang.Object I2 = c2 != null ? a.b20.I(c2) : y80Var.d(g2);
        if (!z2) {
            eyVar.j(I2);
            return;
        }
        t(eyVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        a.w80 w80Var = (a.w80) eyVar;
        a.ey eyVar2 = w80Var.g;
        a.ty h2 = eyVar2.h();
        java.lang.Object Q1 = Q1(h2, w80Var.i);
        a.lo1 R1 = Q1 != F ? R1(eyVar2, h2, Q1) : null;
        try {
            eyVar2.j(I2);
        } finally {
            if (R1 == null || R1.T()) {
                r1(h2, Q1);
            }
        }
    }

    public static void t(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        w1(a.wv.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static java.io.File t0(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            java.io.File file = new java.io.File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final void t1(a.ey eyVar, java.lang.Object obj, a.bp0 bp0Var) {
        if (!(eyVar instanceof a.w80)) {
            eyVar.j(obj);
            return;
        }
        a.w80 w80Var = (a.w80) eyVar;
        java.lang.Throwable a2 = a.bc1.a(obj);
        java.lang.Object ewVar = a2 == null ? bp0Var != null ? new a.ew(obj, bp0Var) : obj : new a.dw(a2, false);
        a.ey eyVar2 = w80Var.g;
        eyVar2.h();
        a.xy xyVar = w80Var.f;
        if (xyVar.j()) {
            w80Var.h = ewVar;
            w80Var.e = 1;
            xyVar.h(eyVar2.h(), w80Var);
            return;
        }
        a.jc0 a3 = a.xl1.a();
        if (a3.e >= 4294967296L) {
            w80Var.h = ewVar;
            w80Var.e = 1;
            a.hp hpVar = a3.g;
            if (hpVar == null) {
                hpVar = new a.hp();
                a3.g = hpVar;
            }
            hpVar.addLast(w80Var);
            return;
        }
        a3.n(true);
        try {
            a.nt0 nt0Var = (a.nt0) eyVar2.h().g(a.gy.f);
            if (nt0Var == null || nt0Var.a()) {
                java.lang.Object obj2 = w80Var.i;
                a.ty h2 = eyVar2.h();
                java.lang.Object Q1 = Q1(h2, obj2);
                a.lo1 R1 = Q1 != F ? R1(eyVar2, h2, Q1) : null;
                try {
                    eyVar2.j(obj);
                } finally {
                    if (R1 == null || R1.T()) {
                        r1(h2, Q1);
                    }
                }
            } else {
                java.util.concurrent.CancellationException w2 = ((a.wt0) nt0Var).w();
                w80Var.a(ewVar, w2);
                w80Var.j(a.b20.I(w2));
            }
            do {
            } while (a3.p());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void u(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static java.util.ArrayList u0(java.util.HashMap hashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : (Iterable<java.lang.String>) hashMap.keySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(str + "='" + str2.replaceAll("'", "'\\\\''") + "'");
        }
        return arrayList;
    }

    public static int u1(float f2) {
        if (java.lang.Float.isNaN(f2)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f2);
    }

    public static void v(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str.concat(" must not be null"));
        w1(a.wv.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static final void v0(a.ty tyVar, java.lang.Throwable th) {
        try {
            a.yy yyVar = (a.yy) tyVar.g(a.gy.d);
            if (yyVar != null) {
                ((a.yk) yyVar).h(tyVar, th);
            } else {
                w0(tyVar, th);
            }
        } catch (java.lang.Throwable th2) {
            if (th != th2) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.b20.b(runtimeException, th);
                th = runtimeException;
            }
            w0(tyVar, th);
        }
    }

    public static java.lang.Object v1(a.fp0 fp0Var) {
        a.ob0 ob0Var = a.ob0.c;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        a.gy gyVar = a.gy.c;
        a.jc0 a2 = a.xl1.a();
        a.ty W = W(ob0Var, a2, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(gyVar) == null) {
            W = W.c(u20Var);
        }
        a.tr trVar = new a.tr(W, currentThread, a2);
        trVar.S(1, trVar, fp0Var);
        a.jc0 jc0Var = trVar.g;
        if (jc0Var != null) {
            int i2 = a.jc0.h;
            jc0Var.n(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long o2 = jc0Var != null ? jc0Var.o() : Long.MAX_VALUE;
                if (!(trVar.C() instanceof a.as0)) {
                    if (jc0Var != null) {
                        int i3 = a.jc0.h;
                        jc0Var.l(false);
                    }
                    java.lang.Object P1 = P1(trVar.C());
                    a.dw dwVar = P1 instanceof a.dw ? (a.dw) P1 : null;
                    if (dwVar == null) {
                        return P1;
                    }
                    throw dwVar.f110a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(trVar, o2);
            } catch (java.lang.Throwable th) {
                if (jc0Var != null) {
                    int i4 = a.jc0.h;
                    jc0Var.l(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        trVar.p(interruptedException);
        throw interruptedException;
    }

    public static void w(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = a.wv.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            w1(a.wv.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static final void w0(a.ty tyVar, java.lang.Throwable th) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = a.zy.f749a.iterator();
        while (it.hasNext()) {
            try {
                ((a.yk) ((a.yy) it.next())).h(tyVar, th);
            } catch (java.lang.Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a.b20.b(runtimeException, th);
                }
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a.b20.b(th, new a.r30(tyVar));
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static void w1(java.lang.String str, java.lang.RuntimeException runtimeException) {
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void x(int i2) {
        a.qs0 qs0Var = new a.qs0(2, 36, 1);
        if (2 > i2 || i2 > qs0Var.d) {
            throw new java.lang.IllegalArgumentException("radix " + i2 + " was not in valid range " + new a.qs0(2, 36, 1));
        }
    }

    public static boolean x0(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static java.lang.String x1(int i2) {
        switch (i2) {
            case 21:
                return "Android 5.0";
            case 22:
                return "Android 5.1";
            case 23:
                return "Android 6.0";
            case 24:
                return "Android 7.0";
            case 25:
                return "Android 7.1";
            case 26:
                return "Android 8.0";
            case 27:
                return "Android 8.1";
            case 28:
                return "Android 9";
            case 29:
                return "Android 10";
            case 30:
                return "Android 11";
            case 31:
                return "Android 12";
            case 32:
                return "Android 12L";
            case 33:
                return "Android 13";
            case 34:
                return "Android 14";
            case 35:
                return "Android 15";
            case 36:
                return "Android 16";
            case 37:
                return "Android 17";
            default:
                return a.ai1.e("SDK(", i2, ")");
        }
    }

    public static int y(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static int y0(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new java.lang.IllegalArgumentException(a.ii1.d("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    public static void y1(android.view.View view, float f2) {
        int integer = view.getResources().getInteger(2131427331);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, 2130969543, -2130969544}, android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static final void z(java.io.Closeable closeable, java.lang.Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                a.b20.b(th, th2);
            }
        }
    }

    public static void z0(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("kr-script-config", 0);
        A0(context, sharedPreferences.getString("executor", "kr-script/executor.sh"), sharedPreferences.getString("toolkitDir", "kr-script/toolkit"));
    }

    public static void z1(android.graphics.Outline outline, android.graphics.Path path) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i2 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public abstract android.view.View V0(int i2);

    public abstract boolean W0();
}
