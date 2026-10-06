package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nn1 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    public nn1() {
    }

    public a.ln1 c;
    public android.view.ViewGroup d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ec A[EDGE_INSN: B:120:0x01ec->B:121:0x01ec BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nn1.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.view.ViewGroup viewGroup = this.d;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        java.util.ArrayList arrayList = a.on1.c;
        android.view.ViewGroup viewGroup2 = this.d;
        arrayList.remove(viewGroup2);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a.on1.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((a.ln1) it.next()).x(viewGroup2);
            }
        }
        this.c.i(true);
    }
}
