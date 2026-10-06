package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vz extends android.widget.BaseAdapter implements android.widget.Filterable, a.wz {
    public boolean c;
    public boolean d;
    public android.database.Cursor e;
    public int f;
    public a.uz g;
    public a.sw0 h;
    public a.xz i;

    public abstract void a(android.view.View view, android.database.Cursor cursor);

    public void b(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.e;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a.uz uzVar = this.g;
                if (uzVar != null) {
                    cursor2.unregisterContentObserver(uzVar);
                }
                a.sw0 sw0Var = this.h;
                if (sw0Var != null) {
                    cursor2.unregisterDataSetObserver(sw0Var);
                }
            }
            this.e = cursor;
            if (cursor != null) {
                a.uz uzVar2 = this.g;
                if (uzVar2 != null) {
                    cursor.registerContentObserver(uzVar2);
                }
                a.sw0 sw0Var2 = this.h;
                if (sw0Var2 != null) {
                    cursor.registerDataSetObserver(sw0Var2);
                }
                this.f = cursor.getColumnIndexOrThrow("_id");
                this.c = true;
                notifyDataSetChanged();
            } else {
                this.f = -1;
                this.c = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract java.lang.String c(android.database.Cursor cursor);

    public abstract android.view.View d(android.view.ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        android.database.Cursor cursor;
        if (!this.c || (cursor = this.e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.c) {
            return null;
        }
        this.e.moveToPosition(i);
        if (view == null) {
            a.bj1 bj1Var = (a.bj1) this;
            view = bj1Var.l.inflate(bj1Var.k, viewGroup, false);
        }
        a(view, this.e);
        return view;
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.i == null) {
            this.i = new a.xz(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        android.database.Cursor cursor;
        if (!this.c || (cursor = this.e) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        android.database.Cursor cursor;
        if (this.c && (cursor = this.e) != null && cursor.moveToPosition(i)) {
            return this.e.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.c) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.e.moveToPosition(i)) {
            throw new java.lang.IllegalStateException(a.ii1.d("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.e);
        return view;
    }
}
