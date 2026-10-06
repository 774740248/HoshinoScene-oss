package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tq1 implements java.util.Iterator, a.du0 {
    public final /* synthetic */ int c = 0;
    public int d;
    public final java.lang.Object e;

    public tq1(java.lang.Object[] objArr) {
        a.wv.w(objArr, "array");
        this.e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return this.d < ((android.view.ViewGroup) obj).getChildCount();
            case 1:
                return ((java.util.Iterator) obj).hasNext();
            default:
                return this.d < ((java.lang.Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.c;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = this.d;
                this.d = i2 + 1;
                android.view.View childAt = ((android.view.ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new java.lang.IndexOutOfBoundsException();
            case 1:
                int i3 = this.d;
                this.d = i3 + 1;
                if (i3 >= 0) {
                    return new a.cs0(i3, ((java.util.Iterator) obj).next());
                }
                a.b20.p1();
                throw null;
            default:
                try {
                    int i4 = this.d;
                    this.d = i4 + 1;
                    return ((java.lang.Object[]) obj)[i4];
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    this.d--;
                    throw new java.util.NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.e;
                int i = this.d - 1;
                this.d = i;
                viewGroup.removeViewAt(i);
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tq1(java.util.Iterator it) {
        a.wv.w(it, "iterator");
        this.e = it;
    }

    public tq1(android.view.ViewGroup viewGroup) {
        this.e = viewGroup;
    }
}
