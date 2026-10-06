package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z10 extends android.widget.BaseAdapter {
    public final java.util.Calendar c;
    public final int d;
    public final int e;

    public z10() {
        java.util.Calendar d = a.so1.d(null);
        this.c = d;
        this.d = d.getMaximum(7);
        this.e = d.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        int i2 = this.d;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.e;
        if (i3 > i2) {
            i3 -= i2;
        }
        return java.lang.Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131558686, viewGroup, false);
        }
        int i2 = i + this.e;
        int i3 = this.d;
        if (i2 > i3) {
            i2 -= i3;
        }
        java.util.Calendar calendar = this.c;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(java.lang.String.format(viewGroup.getContext().getString(2131953034), calendar.getDisplayName(7, 2, java.util.Locale.getDefault())));
        return textView;
    }

    public z10(int i) {
        java.util.Calendar d = a.so1.d(null);
        this.c = d;
        this.d = d.getMaximum(7);
        this.e = i;
    }
}
