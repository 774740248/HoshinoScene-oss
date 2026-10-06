package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nd0 extends a.k91 implements a.p91 {
    public static final int[] C = {android.R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a.jd0 B;

    /* renamed from: a, reason: collision with root package name */
    public final int f378a;
    public final int b;
    public final android.graphics.drawable.StateListDrawable c;
    public final android.graphics.drawable.Drawable d;
    public final int e;
    public final int f;
    public final android.graphics.drawable.StateListDrawable g;
    public final android.graphics.drawable.Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final androidx.recyclerview.widget.RecyclerView s;
    public final android.animation.ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public nd0(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i, int i2, int i3) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        a.jd0 jd0Var = new a.jd0(0, this);
        this.B = jd0Var;
        a.kd0 kd0Var = new a.kd0(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = java.lang.Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = java.lang.Math.max(i, drawable.getIntrinsicWidth());
        this.i = java.lang.Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = java.lang.Math.max(i, drawable2.getIntrinsicWidth());
        this.f378a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new a.ld0(this));
        ofFloat.addUpdateListener(new a.md0(0, this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.d0(this);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.s;
            recyclerView3.s.remove(this);
            if (recyclerView3.t == this) {
                recyclerView3.t = null;
            }
            java.util.ArrayList arrayList = this.s.l0;
            if (arrayList != null) {
                arrayList.remove(kd0Var);
            }
            this.s.removeCallbacks(jd0Var);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.s.s.add(this);
            this.s.j(kd0Var);
        }
    }

    public static int i(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // a.p91
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!h && !g) {
                return false;
            }
            if (g) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (h) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            j(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // a.p91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            if (h || g) {
                if (g) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (h) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                j(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            j(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            k();
            int i = this.w;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i2;
                int i3 = this.q - i2;
                iArr[1] = i3;
                float max = java.lang.Math.max(i2, java.lang.Math.min(i3, x));
                if (java.lang.Math.abs(this.o - max) >= 2.0f) {
                    int i4 = i(this.p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                    if (i4 != 0) {
                        this.s.scrollBy(i4, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i2;
                int i5 = this.r - i2;
                iArr2[1] = i5;
                float max2 = java.lang.Math.max(i2, java.lang.Math.min(i5, y));
                if (java.lang.Math.abs(this.l - max2) < 2.0f) {
                    return;
                }
                int i6 = i(this.m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                if (i6 != 0) {
                    this.s.scrollBy(0, i6);
                }
                this.m = max2;
            }
        }
    }

    @Override // a.p91
    public final void c(boolean z) {
    }

    @Override // a.k91
    public final void f(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, a.z91 z91Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            j(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i = this.q;
                int i2 = this.e;
                int i3 = i - i2;
                int i4 = this.l;
                int i5 = this.k;
                int i6 = i4 - (i5 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.r;
                int i8 = this.f;
                android.graphics.drawable.Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i7);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.s;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                if (a.sp1.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.u) {
                int i9 = this.r;
                int i10 = this.i;
                int i11 = i9 - i10;
                int i12 = this.o;
                int i13 = this.n;
                int i14 = i12 - (i13 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.q;
                int i16 = this.j;
                android.graphics.drawable.Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    public final boolean g(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(float f, float f2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.s;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean z = a.sp1.d(recyclerView) == 1;
        int i = this.e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void j(int i) {
        a.jd0 jd0Var = this.B;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(jd0Var);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            k();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(jd0Var);
            this.s.postDelayed(jd0Var, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(jd0Var);
            this.s.postDelayed(jd0Var, 1500);
        }
        this.v = i;
    }

    public final void k() {
        int i = this.A;
        android.animation.ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
