package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class vr implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ vr(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.app.Activity activity;
        a.pm pmVar;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wr wrVar = (a.wr) this.d;
                a.wv.w(wrVar, "this$0");
                wrVar.b();
                return true;
            default:
                a.b91 b91Var = (a.b91) this.d;
                java.util.concurrent.ExecutorService executorService = a.b91.q;
                a.wv.w(b91Var, "this$0");
                if (!b91Var.e && b91Var.f35a.getWidth() > 0 && b91Var.f35a.getHeight() > 0 && b91Var.f35a.isAttachedToWindow()) {
                    android.content.Context context = b91Var.f35a.getContext();
                    while (true) {
                        if (!(context instanceof android.content.ContextWrapper)) {
                            activity = null;
                        } else if (context instanceof android.app.Activity) {
                            activity = (android.app.Activity) context;
                        } else {
                            context = ((android.content.ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null && !activity.isInPictureInPictureMode() && !activity.isInMultiWindowMode()) {
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        if (uptimeMillis - b91Var.g >= 33 && !b91Var.k) {
                            b91Var.g = uptimeMillis;
                            int width = (int) (b91Var.f35a.getWidth() * b91Var.c);
                            if (width < 1) {
                                width = 1;
                            }
                            int height = (int) (b91Var.f35a.getHeight() * b91Var.c);
                            if (height < 1) {
                                height = 1;
                            }
                            synchronized (b91Var.i) {
                                try {
                                    pmVar = b91Var.j;
                                    if (pmVar != null && ((android.graphics.Bitmap) pmVar.d).getWidth() == width && ((android.graphics.Bitmap) pmVar.d).getHeight() == height) {
                                        b91Var.j = null;
                                    } else {
                                        if (pmVar != null) {
                                            pmVar.F();
                                        }
                                        b91Var.j = null;
                                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, config);
                                        a.wv.v(createBitmap, "createBitmap(w, h, Bitmap.Config.ARGB_8888)");
                                        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width, height, config);
                                        a.wv.v(createBitmap2, "createBitmap(w, h, Bitmap.Config.ARGB_8888)");
                                        pmVar = new a.pm(createBitmap, createBitmap2);
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            java.util.ArrayList F0 = a.b20.F0(b91Var.f35a);
                            try {
                                try {
                                    b91Var.e = true;
                                    android.view.ViewParent parent = b91Var.f35a.getParent();
                                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                                    if (viewGroup != null) {
                                        android.graphics.Rect rect = new android.graphics.Rect();
                                        b91Var.f35a.getGlobalVisibleRect(rect);
                                        android.graphics.Rect rect2 = new android.graphics.Rect();
                                        int childCount = viewGroup.getChildCount();
                                        for (int indexOfChild = viewGroup.indexOfChild(b91Var.f35a) + 1; indexOfChild < childCount; indexOfChild++) {
                                            android.view.View childAt = viewGroup.getChildAt(indexOfChild);
                                            if (childAt.getVisibility() == 0 && childAt.getGlobalVisibleRect(rect2) && android.graphics.Rect.intersects(rect, rect2)) {
                                                F0.add(childAt);
                                            }
                                        }
                                    }
                                    java.util.Iterator it = F0.iterator();
                                    while (it.hasNext()) {
                                        ((android.view.View) it.next()).setVisibility(4);
                                    }
                                    int i = 2;
                                    int[] iArr2 = new int[2];
                                    b91Var.f35a.getLocationInWindow(iArr2);
                                    android.graphics.Canvas canvas = new android.graphics.Canvas((android.graphics.Bitmap) pmVar.d);
                                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                                    float f = b91Var.c;
                                    canvas.scale(f, f);
                                    canvas.translate(-iArr2[0], -iArr2[1]);
                                    canvas.clipRect(0.0f, 0.0f, b91Var.f35a.getWidth(), b91Var.f35a.getHeight());
                                    b91Var.f35a.getRootView().draw(canvas);
                                    java.util.Iterator it2 = F0.iterator();
                                    while (it2.hasNext()) {
                                        ((android.view.View) it2.next()).setVisibility(0);
                                    }
                                    b91Var.e = false;
                                    b91Var.k = true;
                                    a.b91.q.submit(new a.m30(pmVar, b91Var, b91Var.l, i));
                                } catch (java.lang.Exception unused) {
                                    synchronized (b91Var.i) {
                                        pmVar.F();
                                        b91Var.j = null;
                                        java.util.Iterator it3 = F0.iterator();
                                        while (it3.hasNext()) {
                                            ((android.view.View) it3.next()).setVisibility(0);
                                        }
                                        b91Var.e = false;
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                java.util.Iterator it4 = F0.iterator();
                                while (it4.hasNext()) {
                                    ((android.view.View) it4.next()).setVisibility(0);
                                }
                                b91Var.e = false;
                                throw th2;
                            }
                        }
                    }
                }
                return true;
        }
    }
}
