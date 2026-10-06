package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class op1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
    public final java.util.WeakHashMap c = new java.util.WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.WeakHashMap weakHashMap = this.c;
            for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) weakHashMap.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                boolean booleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
                boolean z = view.isShown() && view.getWindowVisibility() == 0;
                if (booleanValue != z) {
                    a.jq1.i(view, z ? 16 : 32);
                    weakHashMap.put(view, java.lang.Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
