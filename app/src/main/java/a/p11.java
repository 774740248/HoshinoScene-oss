package a;

import android.animation.ObjectAnimator;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p11 {

    /* renamed from: a, reason: collision with root package name */
    public final a.rh1 f428a = new a.rh1();
    public final a.rh1 b = new a.rh1();

    public static a.p11 a(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static a.p11 b(android.content.Context context, int i) {
        try {
            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof android.animation.AnimatorSet) {
                return c(((android.animation.AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (java.lang.Exception e) {
            android.util.Log.w("MotionSpec", "Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.q11, java.lang.Object] */
    public static a.p11 c(java.util.ArrayList arrayList) {
        a.p11 p11Var = new a.p11();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            if (!(animator instanceof android.animation.ObjectAnimator)) {
                throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            p11Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            java.lang.String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            android.animation.TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.el.b;
            } else if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
                interpolator = a.el.c;
            } else if (interpolator instanceof android.view.animation.DecelerateInterpolator) {
                interpolator = a.el.d;
            }
            a.q11 obj = new a.q11();
            obj.d = 0;
            obj.e = 1;
            obj.f458a = startDelay;
            obj.b = duration;
            obj.c = interpolator;
            obj.d = objectAnimator.getRepeatCount();
            obj.e = objectAnimator.getRepeatMode();
            p11Var.f428a.put(propertyName, obj);
        }
        return p11Var;
    }

    public final a.q11 d(java.lang.String str) {
        a.rh1 rh1Var = this.f428a;
        if (rh1Var.getOrDefault(str, null) != null) {
            return (a.q11) rh1Var.getOrDefault(str, null);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a.p11) {
            return this.f428a.equals(((a.p11) obj).f428a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f428a.hashCode();
    }

    public final java.lang.String toString() {
        return "\n" + a.p11.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.f428a + "}\n";
    }
}
