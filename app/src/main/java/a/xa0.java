package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xa0 extends a.fa0 {
    public final android.widget.EditText e;
    public final a.kb0 f;

    /* JADX WARN: Type inference failed for: r1v2, types: [a.za0, android.text.Editable$Factory] */
    public xa0(android.widget.EditText editText) {
        super(13, (java.lang.Object) null);
        this.e = editText;
        a.kb0 kb0Var = new a.kb0(editText);
        this.f = kb0Var;
        editText.addTextChangedListener(kb0Var);
        if (a.za0.b == null) {
            synchronized (a.za0.f731a) {
                try {
                    if (a.za0.b == null) {
                        a.za0 factory = (za0) new android.text.Editable.Factory();
                        try {
                            a.za0.c = java.lang.Class.forName("android.text.DynamicLayout$ChangeWatcher", false, a.za0.class.getClassLoader());
                        } catch (java.lang.Throwable unused) {
                        }
                        a.za0.b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(a.za0.b);
    }

    @Override // a.fa0
    public final void D(boolean z) {
        a.kb0 kb0Var = this.f;
        if (kb0Var.f != z) {
            if (kb0Var.e != null) {
                a.ta0 a2 = a.ta0.a();
                a.jb0 jb0Var = kb0Var.e;
                a2.getClass();
                a.wv.u(jb0Var, "initCallback cannot be null");
                java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = a2.f554a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(jb0Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kb0Var.f = z;
            if (z) {
                a.kb0.a(kb0Var.c, a.ta0.a().b());
            }
        }
    }

    public final android.text.method.KeyListener F(android.text.method.KeyListener keyListener) {
        if (keyListener instanceof a.db0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof android.text.method.NumberKeyListener ? keyListener : new a.db0(keyListener);
    }

    public final android.view.inputmethod.InputConnection G(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return inputConnection instanceof a.ab0 ? inputConnection : new a.ab0(this.e, inputConnection, editorInfo);
    }
}
