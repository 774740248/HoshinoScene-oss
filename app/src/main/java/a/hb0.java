package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hb0 extends a.fa0 {
    public final android.widget.TextView e;
    public final a.cb0 f;
    public boolean g;

    public hb0(android.widget.TextView textView) {
        super(16, (java.lang.Object) null);
        this.e = textView;
        this.g = true;
        this.f = new a.cb0(textView);
    }

    @Override // a.fa0
    public final void A(boolean z) {
        if (z) {
            F();
        }
    }

    @Override // a.fa0
    public final void D(boolean z) {
        this.g = z;
        F();
        android.widget.TextView textView = this.e;
        textView.setFilters(l(textView.getFilters()));
    }

    public final void F() {
        android.widget.TextView textView = this.e;
        android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.g) {
            if (!(transformationMethod instanceof a.lb0) && !(transformationMethod instanceof android.text.method.PasswordTransformationMethod)) {
                transformationMethod = new a.lb0(transformationMethod);
            }
        } else if (transformationMethod instanceof a.lb0) {
            transformationMethod = ((a.lb0) transformationMethod).f314a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // a.fa0
    public final android.text.InputFilter[] l(android.text.InputFilter[] inputFilterArr) {
        if (!this.g) {
            android.util.SparseArray sparseArray = new android.util.SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                android.text.InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof a.cb0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            a.cb0 cb0Var = this.f;
            if (i4 >= length2) {
                android.text.InputFilter[] inputFilterArr3 = new android.text.InputFilter[inputFilterArr.length + 1];
                java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = cb0Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == cb0Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
