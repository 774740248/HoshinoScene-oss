package a;

import java.util.List;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class me implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    public me(int i) {
        this.f346a = i;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [a.mi1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [a.ni1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.ViewGroup$MarginLayoutParams, java.lang.Object, a.xe0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [a.n91, a.ze0, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [a.bf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [a.fq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View.BaseSavedState, a.zy0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View.BaseSavedState, java.lang.Object, a.in] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View.BaseSavedState, a.x11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.xl0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.cm0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, a.vv0] */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f346a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.ne(parcel);
            case 1:
                return new a.us0(parcel);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.in inVar = (a.in) new android.view.View.BaseSavedState(parcel);
                inVar.c = parcel.readByte() != 0;
                return inVar;
            case 3:
                a.x11 x11Var = (a.x11) new android.view.View.BaseSavedState(parcel);
                x11Var.c = parcel.readInt();
                return x11Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new a.dq(parcel);
            case 5:
                a.xl0 xl0Var = new a.xl0();
                xl0Var.c = parcel.readString();
                xl0Var.d = parcel.readInt();
                return xl0Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.cm0 cm0Var = new a.cm0();
                cm0Var.g = null;
                cm0Var.h = new java.util.ArrayList();
                cm0Var.i = new java.util.ArrayList();
                cm0Var.c = parcel.createTypedArrayList(a.cn0.CREATOR);
                cm0Var.d = parcel.createStringArrayList();
                cm0Var.e = (a.dq[]) parcel.createTypedArray(a.dq.CREATOR);
                cm0Var.f = parcel.readInt();
                cm0Var.g = parcel.readString();
                cm0Var.h = parcel.createStringArrayList();
                cm0Var.i = parcel.createTypedArrayList(android.os.Bundle.CREATOR);
                cm0Var.j = parcel.createTypedArrayList(a.xl0.CREATOR);
                return cm0Var;
            case 7:
                return new a.cn0(parcel);
            case 8:
                a.vv0 vv0Var = new a.vv0();
                vv0Var.c = parcel.readInt();
                vv0Var.d = parcel.readInt();
                vv0Var.e = parcel.readInt() == 1;
                return vv0Var;
            case 9:
                mi1 obj4 = new mi1();
                obj4.c = parcel.readInt();
                obj4.d = parcel.readInt();
                obj4.f = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj4.e = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 10:
                a.ni1 obj5 = new a.ni1();
                obj5.c = parcel.readInt();
                obj5.d = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj5.e = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj5.f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj5.g = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj5.h = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj5.j = parcel.readInt() == 1;
                obj5.k = parcel.readInt() == 1;
                obj5.l = parcel.readInt() == 1;
                obj5.i = parcel.readArrayList(a.mi1.class.getClassLoader());
                return obj5;
            case 11:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 12:
                a.xe0 xe0Var = new a.xe0();
                xe0Var.c = parcel.readInt();
                xe0Var.d = parcel.readFloat();
                xe0Var.e = parcel.readFloat();
                xe0Var.f = parcel.readInt();
                xe0Var.g = parcel.readFloat();
                xe0Var.h = parcel.readInt();
                xe0Var.i = parcel.readInt();
                xe0Var.j = parcel.readInt();
                xe0Var.k = parcel.readInt();
                xe0Var.l = parcel.readByte() != 0;
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).bottomMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).leftMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).rightMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).topMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).height = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) xe0Var).width = parcel.readInt();
                return xe0Var;
            case 13:
                a.ze0 n91Var = new a.ze0();
                n91Var.g = 0.0f;
                n91Var.h = (int) (1.0f);
                n91Var.i = -1;
                n91Var.j = -1.0f;
                n91Var.m = 16777215;
                n91Var.n = 16777215;
                n91Var.g = parcel.readFloat();
                n91Var.h = parcel.readFloat();
                n91Var.i = parcel.readInt();
                n91Var.j = parcel.readFloat();
                n91Var.k = parcel.readInt();
                n91Var.l = parcel.readInt();
                n91Var.m = parcel.readInt();
                n91Var.n = parcel.readInt();
                n91Var.o = parcel.readByte() != 0;
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).bottomMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).topMargin = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).height = parcel.readInt();
                ((android.view.ViewGroup.MarginLayoutParams) n91Var).width = parcel.readInt();
                return n91Var;
            case 14:
                mi1 obj6 = new mi1();
                /* TODO: jadx type unresolved, defaulted to Object */
                obj6.c = parcel.readInt();
                obj6.d = parcel.readInt();
                return obj6;
            case 15:
                a.fq fqVar = new a.fq();
                fqVar.c = parcel.readInt();
                fqVar.d = (java.lang.Integer) parcel.readSerializable();
                fqVar.e = (java.lang.Integer) parcel.readSerializable();
                fqVar.f = (java.lang.Integer) parcel.readSerializable();
                fqVar.g = (java.lang.Integer) parcel.readSerializable();
                fqVar.h = (java.lang.Integer) parcel.readSerializable();
                fqVar.i = (java.lang.Integer) parcel.readSerializable();
                fqVar.j = (java.lang.Integer) parcel.readSerializable();
                fqVar.k = parcel.readInt();
                fqVar.l = parcel.readInt();
                fqVar.m = parcel.readInt();
                fqVar.o = parcel.readString();
                fqVar.p = parcel.readInt();
                fqVar.r = (java.lang.Integer) parcel.readSerializable();
                fqVar.t = (java.lang.Integer) parcel.readSerializable();
                fqVar.u = (java.lang.Integer) parcel.readSerializable();
                fqVar.v = (java.lang.Integer) parcel.readSerializable();
                fqVar.w = (java.lang.Integer) parcel.readSerializable();
                fqVar.x = (java.lang.Integer) parcel.readSerializable();
                fqVar.y = (java.lang.Integer) parcel.readSerializable();
                fqVar.s = (java.lang.Boolean) parcel.readSerializable();
                fqVar.n = (java.util.Locale) parcel.readSerializable();
                return fqVar;
            case 16:
                a.zy0 zy0Var = (a.zy0) new android.view.View.BaseSavedState(parcel);
                zy0Var.c = ((java.lang.Integer) parcel.readValue(a.zy0.class.getClassLoader())).intValue();
                return zy0Var;
            case 17:
                return new a.ps((a.n11) parcel.readParcelable(a.n11.class.getClassLoader()), (a.n11) parcel.readParcelable(a.n11.class.getClassLoader()), (a.os) parcel.readParcelable(a.os.class.getClassLoader()), (a.n11) parcel.readParcelable(a.n11.class.getClassLoader()), parcel.readInt());
            case 18:
                return new a.y10(parcel.readLong());
            case 19:
                return a.n11.r(parcel.readInt(), parcel.readInt());
            default:
                return new a.fm1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        switch (this.f346a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.ne[i];
            case 1:
                return new a.us0[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.in[i];
            case 3:
                return new a.x11[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new a.dq[i];
            case 5:
                return new a.xl0[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return new a.cm0[i];
            case 7:
                return new a.cn0[i];
            case 8:
                return new a.vv0[i];
            case 9:
                return new a.mi1[i];
            case 10:
                return new a.ni1[i];
            case 11:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case 12:
                return new a.xe0[i];
            case 13:
                return new a.ze0[i];
            case 14:
                return new a.bf0[i];
            case 15:
                return new a.fq[i];
            case 16:
                return new a.zy0[i];
            case 17:
                return new a.ps[i];
            case 18:
                return new a.y10[i];
            case 19:
                return new a.n11[i];
            default:
                return new a.fm1[i];
        }
    }
}
