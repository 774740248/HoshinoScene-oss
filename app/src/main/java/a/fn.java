package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fn implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

    public fn() {
    }

    public android.widget.SpinnerAdapter c;
    public android.widget.ListAdapter d;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.d;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        android.widget.ListAdapter listAdapter = this.d;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.c;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
