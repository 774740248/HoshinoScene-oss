package a;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class fa0 implements a.n01, a.s71, a.cr1 {
    public static a.fa0 d;
    public final int c;

    public /* synthetic */ fa0(int i) {
        this.c = i;
    }

    public static void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static void e(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static a.vk0 f(a.d4 d4Var, int i) {
        a.ai1.n(i, "appType");
        a.vk0 vk0Var = new a.vk0();
        vk0Var.a0 = d4Var;
        vk0Var.b0 = i;
        return vk0Var;
    }

    public static a.ad1 g(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new a.ad1();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str : bundle2.keySet()) {
                a.wv.v(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new a.ad1(hashMap);
        }
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new java.lang.IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = parcelableArrayList.get(i);
            a.wv.t(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((java.lang.String) obj, parcelableArrayList2.get(i));
        }
        return new a.ad1(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(android.app.Activity activity, a.ev0 ev0Var) {
        a.wv.w(activity, "activity");
        a.wv.w(ev0Var, "event");
        if (activity instanceof a.mv0) {
            a.gv0 lifecycle = ((a.mv0) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.a) {
                ((androidx.lifecycle.a) lifecycle).e(ev0Var);
            }
        }
    }

    public static android.content.Intent j(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
        intent.putExtra("mode", com.omarea.vtools.activities.ActivityFileSelector.o);
        if (str != null && str.length() != 0) {
            intent.putExtra("title", str);
        }
        return intent;
    }

    public static android.graphics.Path m(float f, float f2, float f3, float f4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static android.widget.RelativeLayout n(android.view.View view, int i) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            if (childAt.getClass().getName().equals("com.tencent.mm.plugin.scanner.ui.ScanMaskView")) {
                int i3 = i2 + 1;
                if (i3 < viewGroup.getChildCount()) {
                    return (android.widget.RelativeLayout) viewGroup.getChildAt(i3);
                }
            } else {
                android.widget.RelativeLayout n = n(childAt, i + 1);
                if (n != null) {
                    return n;
                }
            }
        }
        return null;
    }

    public static android.widget.RelativeLayout p(android.view.View view, int i) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                android.view.View childAt = viewGroup.getChildAt(i2);
                if (childAt.getClass().getName().equals("com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView")) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) childAt;
                    for (int i3 = 0; i3 < viewGroup2.getChildCount(); i3++) {
                        android.view.View childAt2 = viewGroup2.getChildAt(i3);
                        if (childAt2.getClass().getName().equals("android.widget.RelativeLayout")) {
                            return (android.widget.RelativeLayout) childAt2;
                        }
                    }
                    return null;
                }
                android.widget.RelativeLayout p = p(childAt, i + 1);
                if (p != null) {
                    return p;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fa0.t(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void w(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            a.eb1.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new a.eb1());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new android.app.Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void y(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        a.wv.w(context, "context");
        a.wv.w(str, "store");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
        intent.putExtra("config", i);
        intent.putExtra("store", str);
        intent.putExtra("title", str2);
        context.startActivity(intent);
    }

    public static void z(android.content.Context context, a.yt0 yt0Var, java.lang.String str, java.lang.String str2) {
        a.wv.w(context, "context");
        a.wv.w(str, "store");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
        intent.putExtra("configJson", yt0Var.toString());
        intent.putExtra("store", str);
        intent.putExtra("title", str2);
        context.startActivity(intent);
    }

    public void A(boolean z) {
    }

    public void B(boolean z) {
    }

    public void C(boolean z) {
    }

    public void D(boolean z) {
    }

    public void E(int i) {
    }

    @Override // a.n01
    public void a(a.pz0 pz0Var, boolean z) {
    }

    @Override // a.cr1
    public a.zq1 b(java.lang.Class cls) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.dm0(true);
            default:
                return new a.dx0();
        }
    }

    @Override // a.s71
    public void i() {
        switch (this.c) {
            case 23:
                return;
            default:
                android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // a.s71
    public void k(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (this.c) {
            case 23:
                return;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) obj);
                    return;
                } else {
                    android.util.Log.d("ProfileInstaller", str);
                    return;
                }
        }
    }

    public android.text.InputFilter[] l(android.text.InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    @Override // a.n01
    public boolean o(a.pz0 pz0Var) {
        return false;
    }

    public java.lang.Boolean q() {
        switch (this.c) {
            case 17:
                return a.kf0.D;
            case 18:
                return a.jf0.d;
            case 19:
                return a.ag0.y;
            case 20:
                return a.fg0.B;
            default:
                return a.uh0.h;
        }
    }

    public boolean r() {
        android.view.View view;
        android.view.View view2;
        int i = this.c;
        switch (i) {
            case 21:
                switch (i) {
                    case 21:
                        view = a.rg0.x;
                        break;
                    default:
                        view = a.ph0.j;
                        break;
                }
                return view != null;
            default:
                switch (i) {
                    case 21:
                        view2 = a.rg0.x;
                        break;
                    default:
                        view2 = a.ph0.j;
                        break;
                }
                return view2 != null;
        }
    }

    public android.content.pm.Signature[] s(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void u(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        int i = 2;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                XposedHelpers.findAndHookMethod("android.app.Activity", loadPackageParam.classLoader, "onCreate", new java.lang.Object[]{android.os.Bundle.class, new a.c3(i, this)});
                return;
            default:
                XposedBridge.hookAllConstructors(androidx.recyclerview.widget.RecyclerView.class, new a.cc1(0));
                java.lang.Class cls = java.lang.Integer.TYPE;
                XposedHelpers.findAndHookMethod(androidx.recyclerview.widget.RecyclerView.class, "setItemViewCacheSize", new java.lang.Object[]{cls, new a.cc1(1)});
                XposedBridge.hookAllConstructors(android.view.Window.class, new a.cc1(2));
                XposedHelpers.findAndHookMethod(android.view.Window.class, "setWindowManager", new java.lang.Object[]{android.view.WindowManager.class, android.os.IBinder.class, java.lang.String.class, java.lang.Boolean.TYPE, new a.cc1(3)});
                XposedHelpers.findAndHookMethod(android.view.Window.class, "setFlags", new java.lang.Object[]{cls, cls, new a.cc1(4)});
                return;
        }
    }

    public void v(int i) {
    }

    public boolean x(android.text.Spannable spannable) {
        return false;
    }

    /* [修复] 从 smali 还原：fa0(II) 为 R8 合成构造器。
       smali: iput p1,c; packed-switch p1 (0x1..0x1c); default→this(0); case N→this(N)。
       净效果 c = (1<=i<=28 && i!=4) ? i : 0（case 4 落入 default）。 */
    public /* synthetic */ fa0(int i, int i2) {
        this((i >= 1 && i <= 28 && i != 4) ? i : 0);
    }

    public /* synthetic */ fa0(int i, java.lang.Object obj) {
        this.c = i;
    }
}
