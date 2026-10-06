package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x81 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f682a = new java.util.ArrayList();
    public a.bp0 b = a.xi.g;

    public x81(java.util.Iterator it) {
        e(it);
    }

    public final void a(android.view.View view) {
        for (android.view.KeyEvent.Callback callback : (Iterable<android.view.KeyEvent.Callback>) this.f682a) {
            if (!a.wv.e(callback, view)) {
                ((android.widget.Checkable) callback).setChecked(false);
            }
        }
    }

    public final android.view.View b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f682a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((android.widget.Checkable) ((android.view.View) obj)).isChecked()) {
                break;
            }
        }
        return (android.view.View) obj;
    }

    public final int c() {
        android.view.View b = b();
        if (b == null) {
            return -1;
        }
        return this.f682a.indexOf(b);
    }

    public final void d(int i) {
        java.util.ArrayList arrayList = this.f682a;
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "radios[value]");
        android.view.View view = (android.view.View) obj;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.view.KeyEvent.Callback callback = (android.view.View) it.next();
            ((android.widget.Checkable) callback).setChecked(a.wv.e(callback, view));
        }
    }

    public final void e(java.util.Iterator it) {
        java.util.ArrayList arrayList;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f682a;
            int i = 1;
            if (!hasNext) {
                break;
            }
            android.view.View view = (android.view.View) it.next();
            arrayList.add(view);
            view.setOnClickListener(new a.gv(9, this));
            if (view instanceof android.widget.CompoundButton) {
                ((android.widget.CompoundButton) view).setOnCheckedChangeListener(new a.uu(i, this));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            if (((android.widget.Checkable) ((android.view.View) next)).isChecked()) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            android.view.View view2 = (android.view.View) a.qv.l2(arrayList2);
            java.util.Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                android.view.KeyEvent.Callback callback = (android.view.View) it3.next();
                if (!a.wv.e(callback, view2)) {
                    ((android.widget.Checkable) callback).setChecked(false);
                }
            }
        }
    }

    public x81(android.view.View... viewArr) {
        e(new a.tq1(viewArr));
    }
}
