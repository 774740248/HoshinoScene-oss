package android.support.v4.graphics.drawable;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public static androidx.core.graphics.drawable.IconCompat read(a.fp1 fp1Var) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read((VersionedParcel) fp1Var);
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, a.fp1 fp1Var) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, (VersionedParcel) fp1Var);
    }
}
