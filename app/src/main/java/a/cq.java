package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cq implements a.yl0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f77a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public java.lang.String h;
    public int i;
    public java.lang.CharSequence j;
    public int k;
    public java.lang.CharSequence l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public boolean o;
    public final a.am0 p;
    public boolean q;
    public int r;

    public cq(a.am0 am0Var) {
        am0Var.z();
        a.jk0 jk0Var = am0Var.q;
        if (jk0Var != null) {
            jk0Var.X.getClassLoader();
        }
        this.f77a = new java.util.ArrayList();
        this.o = false;
        this.r = -1;
        this.p = am0Var;
    }

    @Override // a.yl0
    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        a.am0 am0Var = this.p;
        if (am0Var.d == null) {
            am0Var.d = new java.util.ArrayList();
        }
        am0Var.d.add(this);
        return true;
    }

    public final void b(a.en0 en0Var) {
        this.f77a.add(en0Var);
        en0Var.c = this.b;
        en0Var.d = this.c;
        en0Var.e = this.d;
        en0Var.f = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f77a.size();
            for (int i2 = 0; i2 < size; i2++) {
                a.en0 en0Var = (a.en0) this.f77a.get(i2);
                a.gk0 gk0Var = en0Var.b;
                if (gk0Var != null) {
                    gk0Var.t += i;
                    if (android.util.Log.isLoggable("FragmentManager", 2)) {
                        android.util.Log.v("FragmentManager", "Bump nesting of " + en0Var.b + " to " + en0Var.b.t);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Commit: " + this);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new a.px0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        a.am0 am0Var = this.p;
        if (z2) {
            this.r = am0Var.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        am0Var.s(this, z);
        return this.r;
    }

    public final void e(int i, a.gk0 gk0Var, java.lang.String str, int i2) {
        java.lang.Class<?> cls = gk0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str2 = gk0Var.A;
            if (str2 != null && !str.equals(str2)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + gk0Var + ": was " + gk0Var.A + " now " + str);
            }
            gk0Var.A = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + gk0Var + " with tag " + str + " to container view with no id");
            }
            int i3 = gk0Var.y;
            if (i3 != 0 && i3 != i) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + gk0Var + ": was " + gk0Var.y + " now " + i);
            }
            gk0Var.y = i;
            gk0Var.z = i;
        }
        b(new a.en0(i2, gk0Var));
        gk0Var.u = this.p;
    }

    public final void f(java.lang.String str, java.io.PrintWriter printWriter, boolean z) {
        java.lang.String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (this.f77a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f77a.size();
        for (int i = 0; i < size; i++) {
            a.en0 en0Var = (a.en0) this.f77a.get(i);
            switch (en0Var.f129a) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + en0Var.f129a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(en0Var.b);
            if (z) {
                if (en0Var.c != 0 || en0Var.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(en0Var.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(en0Var.d));
                }
                if (en0Var.e != 0 || en0Var.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(en0Var.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(en0Var.f));
                }
            }
        }
    }

    public final void g() {
        int size = this.f77a.size();
        for (int i = 0; i < size; i++) {
            a.en0 en0Var = (a.en0) this.f77a.get(i);
            a.gk0 gk0Var = en0Var.b;
            if (gk0Var != null) {
                if (gk0Var.K != null) {
                    gk0Var.c().c = false;
                }
                int i2 = this.f;
                if (gk0Var.K != null || i2 != 0) {
                    gk0Var.c();
                    gk0Var.K.h = i2;
                }
                java.util.ArrayList arrayList = this.m;
                java.util.ArrayList arrayList2 = this.n;
                gk0Var.c();
                a.ek0 ek0Var = gk0Var.K;
                ek0Var.i = arrayList;
                ek0Var.j = arrayList2;
            }
            int i3 = en0Var.f129a;
            a.am0 am0Var = this.p;
            switch (i3) {
                case 1:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, false);
                    am0Var.a(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + en0Var.f129a);
                case 3:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.K(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.B(gk0Var);
                    break;
                case 5:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, false);
                    a.am0.T(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.g(gk0Var);
                    break;
                case 7:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, false);
                    am0Var.c(gk0Var);
                    break;
                case 8:
                    am0Var.R(gk0Var);
                    break;
                case 9:
                    am0Var.R(null);
                    break;
                case 10:
                    am0Var.Q(gk0Var, en0Var.h);
                    break;
            }
        }
    }

    public final void h() {
        for (int size = this.f77a.size() - 1; size >= 0; size--) {
            a.en0 en0Var = (a.en0) this.f77a.get(size);
            a.gk0 gk0Var = en0Var.b;
            if (gk0Var != null) {
                if (gk0Var.K != null) {
                    gk0Var.c().c = true;
                }
                int i = this.f;
                int i2 = i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
                if (gk0Var.K != null || i2 != 0) {
                    gk0Var.c();
                    gk0Var.K.h = i2;
                }
                java.util.ArrayList arrayList = this.n;
                java.util.ArrayList arrayList2 = this.m;
                gk0Var.c();
                a.ek0 ek0Var = gk0Var.K;
                ek0Var.i = arrayList;
                ek0Var.j = arrayList2;
            }
            int i3 = en0Var.f129a;
            a.am0 am0Var = this.p;
            switch (i3) {
                case 1:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, true);
                    am0Var.K(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + en0Var.f129a);
                case 3:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.a(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.getClass();
                    a.am0.T(gk0Var);
                    break;
                case 5:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, true);
                    am0Var.B(gk0Var);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.c(gk0Var);
                    break;
                case 7:
                    gk0Var.O(en0Var.c, en0Var.d, en0Var.e, en0Var.f);
                    am0Var.P(gk0Var, true);
                    am0Var.g(gk0Var);
                    break;
                case 8:
                    am0Var.R(null);
                    break;
                case 9:
                    am0Var.R(gk0Var);
                    break;
                case 10:
                    am0Var.Q(gk0Var, en0Var.g);
                    break;
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
