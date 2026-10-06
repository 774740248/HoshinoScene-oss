package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qz0 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, a.n01 {

    public qz0() {
    }

    public a.pz0 c;
    public a.uk d;
    public a.nw0 e;

    @Override // a.n01
    public final void a(a.pz0 pz0Var, boolean z) {
        a.uk ukVar;
        if ((z || pz0Var == this.c) && (ukVar = this.d) != null) {
            ukVar.dismiss();
        }
    }

    @Override // a.n01
    public final boolean o(a.pz0 pz0Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        a.nw0 nw0Var = this.e;
        if (nw0Var.h == null) {
            nw0Var.h = new a.mw0(nw0Var);
        }
        this.c.q((a.xz0) nw0Var.h.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.e.a(this.c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        a.pz0 pz0Var = this.c;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                pz0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return pz0Var.performShortcut(i, keyEvent, 0);
    }
}
