package a;

import android.animation.ObjectAnimator;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class st extends a.ln1 {
    public static final a.ot A;
    public static final a.ot B;
    public static final a.ot C;
    public static final a.ot D;
    public static final a.ot E;
    public static final java.lang.String[] z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    static {
        new a.nt(0);
        A = new a.ot(android.graphics.PointF.class, "topLeft", 0);
        B = new a.ot(android.graphics.PointF.class, "bottomRight", 1);
        C = new a.ot(android.graphics.PointF.class, "bottomRight", 2);
        D = new a.ot(android.graphics.PointF.class, "topLeft", 3);
        E = new a.ot(android.graphics.PointF.class, "position", 4);
    }

    public static void H(a.sn1 sn1Var) {
        android.view.View view = sn1Var.b;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (!a.up1.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        java.util.HashMap hashMap = sn1Var.f532a;
        hashMap.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", sn1Var.b.getParent());
    }

    @Override // a.ln1
    public final void d(a.sn1 sn1Var) {
        H(sn1Var);
    }

    @Override // a.ln1
    public final void g(a.sn1 sn1Var) {
        H(sn1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.rt, java.lang.Object] */
    @Override // a.ln1
    public final android.animation.Animator k(android.view.ViewGroup viewGroup, a.sn1 sn1Var, a.sn1 sn1Var2) {
        int i;
        a.st stVar;
        android.animation.ObjectAnimator ofObject;
        if (sn1Var == null || sn1Var2 == null) {
            return null;
        }
        java.util.HashMap hashMap = sn1Var.f532a;
        java.util.HashMap hashMap2 = sn1Var2.f532a;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) hashMap.get("android:changeBounds:parent");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) hashMap.get("android:changeBounds:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        android.graphics.Rect rect3 = (android.graphics.Rect) hashMap.get("android:changeBounds:clip");
        android.graphics.Rect rect4 = (android.graphics.Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        android.view.View view = sn1Var2.b;
        a.yr1.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            stVar = this;
            if (i2 == i3 && i4 == i5) {
                stVar.v.getClass();
                ofObject = android.animation.ObjectAnimator.ofObject(view, C, (android.animation.TypeConverter) null, a.fa0.m(i6, i8, i7, i9));
            } else {
                stVar.v.getClass();
                ofObject = android.animation.ObjectAnimator.ofObject(view, D, (android.animation.TypeConverter) null, a.fa0.m(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            stVar = this;
            stVar.v.getClass();
            ofObject = android.animation.ObjectAnimator.ofObject(view, E, (android.animation.TypeConverter) null, a.fa0.m(i2, i4, i3, i5));
        } else {
            stVar = this;
            rt obj = new rt();
            /* TODO: jadx type unresolved, defaulted to Object */
            obj.e = view;
            stVar.v.getClass();
            android.animation.ObjectAnimator ofObject2 = android.animation.ObjectAnimator.ofObject(obj, A, (android.animation.TypeConverter) null, a.fa0.m(i2, i4, i3, i5));
            stVar.v.getClass();
            android.animation.ObjectAnimator ofObject3 = android.animation.ObjectAnimator.ofObject(obj, B, (android.animation.TypeConverter) null, a.fa0.m(i6, i8, i7, i9));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new a.pt(obj));
            ofObject = (ObjectAnimator) animatorSet;
        }
        if (view.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.getParent();
            a.uq1.a(viewGroup4, true);
            stVar.a(new a.qt(viewGroup4));
        }
        return ofObject;
    }

    @Override // a.ln1
    public final java.lang.String[] p() {
        return z;
    }
}
