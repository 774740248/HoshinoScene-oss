package a;

import java.util.List;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xi1 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(java.lang.Object obj, boolean z, int i) {
        super(2);
        this.d = i;
        this.f = obj;
        this.e = z;
    }

    public final a.y31 a(int i, java.lang.CharSequence charSequence) {
        java.lang.Object obj;
        a.y31 y31Var;
        java.lang.Object obj2;
        int i2 = this.d;
        java.lang.Object obj3 = this.f;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(charSequence, "$this$$receiver");
                int n2 = a.yi1.n2(i, charSequence, this.e, (char[]) obj3);
                if (n2 < 0) {
                    return null;
                }
                return new a.y31(java.lang.Integer.valueOf(n2), 1);
            default:
                a.wv.w(charSequence, "$this$$receiver");
                java.util.List list = (java.util.List) obj3;
                boolean z = this.e;
                if (z || list.size() != 1) {
                    if (i < 0) {
                        i = 0;
                    }
                    a.qs0 qs0Var = new a.qs0(i, charSequence.length(), 1);
                    boolean z2 = charSequence instanceof java.lang.String;
                    int i3 = qs0Var.e;
                    int i4 = qs0Var.d;
                    if (z2) {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        java.lang.String str = (java.lang.String) obj2;
                                        if (a.yi1.t2(0, i, str.length(), str, (java.lang.String) charSequence, z)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                java.lang.String str2 = (java.lang.String) obj2;
                                if (str2 != null) {
                                    y31Var = new a.y31(java.lang.Integer.valueOf(i), str2);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        y31Var = null;
                    } else {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                java.util.Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        java.lang.String str3 = (java.lang.String) obj;
                                        if (a.yi1.u2(str3, 0, charSequence, i, str3.length(), z)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                java.lang.String str4 = (java.lang.String) obj;
                                if (str4 != null) {
                                    y31Var = new a.y31(java.lang.Integer.valueOf(i), str4);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        y31Var = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new java.util.NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new java.lang.IllegalArgumentException("List has more than one element.");
                    }
                    java.lang.String str5 = (java.lang.String) list.get(0);
                    int m2 = a.yi1.m2(charSequence, str5, i, false, 4);
                    if (m2 >= 0) {
                        y31Var = new a.y31(java.lang.Integer.valueOf(m2), str5);
                    }
                    y31Var = null;
                }
                if (y31Var == null) {
                    return null;
                }
                return new a.y31(y31Var.c, java.lang.Integer.valueOf(((java.lang.String) y31Var.d).length()));
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a(((java.lang.Number) obj2).intValue(), (java.lang.CharSequence) obj);
            case 1:
                return a(((java.lang.Number) obj2).intValue(), (java.lang.CharSequence) obj);
            default:
                return ((a.ty) obj).c((a.ry) obj2);
        }
    }
}
