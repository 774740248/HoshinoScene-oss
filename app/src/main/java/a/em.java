package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class em implements android.view.Window.Callback {
    public final android.view.Window.Callback c;
    public a.ym1 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ a.km h;

    public em(a.km kmVar, android.view.Window.Callback callback) {
        this.h = kmVar;
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("Window callback may not be null");
        }
        this.c = callback;
    }

    public final void a(android.view.Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
        } finally {
            this.e = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(android.view.ActionMode actionMode) {
        this.c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(android.view.ActionMode actionMode) {
        this.c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.f;
        android.view.Window.Callback callback = this.c;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.h.x(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        if (this.c.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        a.km kmVar = this.h;
        kmVar.D();
        a.d1 d1Var = kmVar.q;
        if (d1Var != null && d1Var.i(keyCode, keyEvent)) {
            return true;
        }
        a.jm jmVar = kmVar.O;
        if (jmVar != null && kmVar.I(jmVar, keyEvent.getKeyCode(), keyEvent)) {
            a.jm jmVar2 = kmVar.O;
            if (jmVar2 == null) {
                return true;
            }
            jmVar2.l = true;
            return true;
        }
        if (kmVar.O == null) {
            a.jm C = kmVar.C(0);
            kmVar.J(C, keyEvent);
            boolean I = kmVar.I(C, keyEvent.getKeyCode(), keyEvent);
            C.k = false;
            if (I) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.c.onDetachedFromWindow();
    }

    public final boolean f(int i, android.view.Menu menu) {
        return this.c.onMenuOpened(i, menu);
    }

    public final void g(int i, android.view.Menu menu) {
        this.c.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z) {
        a.zs1.a(this.c, z);
    }

    public final void i(java.util.List list, android.view.Menu menu, int i) {
        a.ys1.a(this.c, list, menu, i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z) {
        this.c.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.e) {
            this.c.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0 || (menu instanceof a.pz0)) {
            return this.c.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int i) {
        a.ym1 ym1Var = this.d;
        if (ym1Var != null) {
            android.view.View view = i == 0 ? new android.view.View(ym1Var.c.f20a.f47a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.c.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        return this.c.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        f(i, menu);
        a.km kmVar = this.h;
        if (i == 108) {
            kmVar.D();
            a.d1 d1Var = kmVar.q;
            if (d1Var != null) {
                d1Var.c(true);
            }
        } else {
            kmVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        if (this.g) {
            this.c.onPanelClosed(i, menu);
            return;
        }
        g(i, menu);
        a.km kmVar = this.h;
        if (i == 108) {
            kmVar.D();
            a.d1 d1Var = kmVar.q;
            if (d1Var != null) {
                d1Var.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            kmVar.getClass();
            return;
        }
        a.jm C = kmVar.C(i);
        if (C.m) {
            kmVar.v(C, false);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        a.pz0 pz0Var = menu instanceof a.pz0 ? (a.pz0) menu : null;
        if (i == 0 && pz0Var == null) {
            return false;
        }
        if (pz0Var != null) {
            pz0Var.x = true;
        }
        a.ym1 ym1Var = this.d;
        if (ym1Var != null && i == 0) {
            a.an1 an1Var = ym1Var.c;
            if (!an1Var.d) {
                an1Var.f20a.l = true;
                an1Var.d = true;
            }
        }
        boolean onPreparePanel = this.c.onPreparePanel(i, view, menu);
        if (pz0Var != null) {
            pz0Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i) {
        a.pz0 pz0Var = this.h.C(0).h;
        if (pz0Var != null) {
            i(list, pz0Var, i);
        } else {
            i(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return a.xs1.a(this.c, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.c.onSearchRequested();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.ej1, java.lang.Object, a.n2] */
    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        a.km kmVar = this.h;
        kmVar.getClass();
        if (i != 0) {
            return a.xs1.b(this.c, callback, i);
        }
        android.content.Context context = kmVar.m;
        a.ej1 obj = new a.ej1();
        obj.d = context;
        obj.c = callback;
        obj.e = new java.util.ArrayList();
        obj.f = new a.rh1();
        a.o2 o = kmVar.o(obj);
        if (o != null) {
            return obj.o(o);
        }
        return null;
    }
}
