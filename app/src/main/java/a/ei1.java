package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ei1 extends android.text.SpannableStringBuilder {
    public final java.lang.Class c;
    public final java.util.ArrayList d;

    public ei1(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.d = new java.util.ArrayList();
        if (cls == null) {
            throw new java.lang.NullPointerException("watcherClass cannot be null");
        }
        this.c = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((a.di1) arrayList.get(i)).d.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((a.di1) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final a.di1 c(java.lang.Object obj) {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return null;
            }
            a.di1 di1Var = (a.di1) arrayList.get(i);
            if (di1Var.c == obj) {
                return di1Var;
            }
            i++;
        }
    }

    public final boolean d(java.lang.Object obj) {
        if (obj != null) {
            if (this.c == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((a.di1) arrayList.get(i)).d.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        a.di1 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        a.di1 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        a.di1 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        if (this.c != cls) {
            return super.getSpans(i, i2, cls);
        }
        a.di1[] di1VarArr = (a.di1[]) super.getSpans(i, i2, a.di1.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, di1VarArr.length);
        for (int i3 = 0; i3 < di1VarArr.length; i3++) {
            objArr[i3] = di1VarArr[i3].c;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        if (cls == null || this.c == cls) {
            cls = a.di1.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        a.di1 di1Var;
        if (d(obj)) {
            di1Var = c(obj);
            if (di1Var != null) {
                obj = di1Var;
            }
        } else {
            di1Var = null;
        }
        super.removeSpan(obj);
        if (di1Var != null) {
            this.d.remove(di1Var);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            a.di1 di1Var = new a.di1(obj);
            this.d.add(di1Var);
            obj = di1Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new a.ei1(this.c, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    public ei1(java.lang.Class cls, java.lang.CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.d = new java.util.ArrayList();
        if (cls == null) {
            throw new java.lang.NullPointerException("watcherClass cannot be null");
        }
        this.c = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
