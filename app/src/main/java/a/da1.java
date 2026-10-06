package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原：da1 无抽象方法，abstract 为 R8 冗余标志，去 abstract 保编译 */
public class da1 {

    public da1() {
        this(null);
    }
    public static final java.util.List t = java.util.Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f91a;
    public java.lang.ref.WeakReference b;
    public int j;
    public androidx.recyclerview.widget.RecyclerView r;
    public a.e91 s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public a.da1 h = null;
    public a.da1 i = null;
    public java.util.ArrayList k = null;
    public java.util.List l = null;
    public int m = 0;
    public a.t91 n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public da1(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.f91a = view;
    }

    public final void a(java.lang.Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.k = arrayList;
                this.l = java.util.Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void b(int i) {
        this.j = i | this.j;
    }

    public final int c() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.K(this);
    }

    public final int d() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        a.e91 adapter;
        int K;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.r.K(this)) == -1 || this.s != adapter) {
            return -1;
        }
        return K;
    }

    public final int e() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
    }

    public final boolean g(int i) {
        return (i & this.j) != 0;
    }

    public final boolean h() {
        android.view.View view = this.f91a;
        return (view.getParent() == null || view.getParent() == this.r) ? false : true;
    }

    public final boolean i() {
        return (this.j & 1) != 0;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    public final boolean k() {
        if ((this.j & 16) == 0) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (!a.rp1.i(this.f91a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        return (this.j & 8) != 0;
    }

    public final boolean m() {
        return this.n != null;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    public final boolean o() {
        return (this.j & 2) != 0;
    }

    public final void p(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        android.view.View view = this.f91a;
        if (view.getLayoutParams() != null) {
            ((a.n91) view.getLayoutParams()).e = true;
        }
    }

    public final void q() {
        if (androidx.recyclerview.widget.RecyclerView.D0 && n()) {
            throw new java.lang.IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        java.util.ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        androidx.recyclerview.widget.RecyclerView.l(this);
    }

    public final void r(boolean z) {
        int i = this.m;
        int i2 = z ? i - 1 : i + 1;
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            if (androidx.recyclerview.widget.RecyclerView.D0) {
                throw new java.lang.RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            android.util.Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
        if (androidx.recyclerview.widget.RecyclerView.E0) {
            android.util.Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean s() {
        return (this.j & 128) != 0;
    }

    public final boolean t() {
        return (this.j & 32) != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (m()) {
            sb.append(" scrap ");
            sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!i()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (l()) {
            sb.append(" removed");
        }
        if (s()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!k()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.f91a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
