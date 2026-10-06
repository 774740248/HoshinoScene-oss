package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class di1 implements android.text.TextWatcher, android.text.SpanWatcher {
    public final java.lang.Object c;
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(0);

    public di1(java.lang.Object obj) {
        this.c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        ((android.text.TextWatcher) this.c).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.c).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.d.get() <= 0 || !(obj instanceof a.jo1)) {
            ((android.text.SpanWatcher) this.c).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.d.get() <= 0 || !(obj instanceof a.jo1)) {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((android.text.SpanWatcher) this.c).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((android.text.SpanWatcher) this.c).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.d.get() <= 0 || !(obj instanceof a.jo1)) {
            ((android.text.SpanWatcher) this.c).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.c).onTextChanged(charSequence, i, i2, i3);
    }
}
