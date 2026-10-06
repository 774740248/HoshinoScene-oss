package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ig1 implements android.os.Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229a;

    public /* synthetic */ ig1(int i) {
        this.f229a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.f229a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.jg1(parcel, classLoader);
            case 1:
                return new a.xm1(parcel, classLoader);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.oy(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return a.c.d;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new a.r90(parcel, classLoader);
            case 5:
                return new a.w91(parcel, classLoader);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return new a.nr1(parcel, classLoader);
            case 7:
                return new a.bs(parcel, classLoader);
            case 8:
                return new a.ny0(parcel, classLoader);
            case 9:
                return new a.mu(parcel, classLoader);
            case 10:
                return new a.qh1(parcel, classLoader);
            case 11:
                return new a.tc0(parcel, classLoader);
            default:
                return new a.dl1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        switch (this.f229a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.jg1[i];
            case 1:
                return new a.xm1[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.oy[i];
            case 3:
                return new a.c[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new a.r90[i];
            case 5:
                return new a.w91[i];
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return new a.nr1[i];
            case 7:
                return new a.bs[i];
            case 8:
                return new a.ny0[i];
            case 9:
                return new a.mu[i];
            case 10:
                return new a.qh1[i];
            case 11:
                return new a.tc0[i];
            default:
                return new a.dl1[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f229a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.jg1(parcel, null);
            case 1:
                return new a.xm1(parcel, null);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.oy(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return a.c.d;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new a.r90(parcel, null);
            case 5:
                return new a.w91(parcel, null);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return new a.nr1(parcel, null);
            case 7:
                return new a.bs(parcel, (java.lang.ClassLoader) null);
            case 8:
                return new a.ny0(parcel, null);
            case 9:
                return new a.mu(parcel, null);
            case 10:
                return new a.qh1(parcel, (java.lang.ClassLoader) null);
            case 11:
                return new a.tc0(parcel, null);
            default:
                return new a.dl1(parcel, null);
        }
    }
}
