package android.support.v4.app;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(a.fp1 fp1Var) {
        return androidx.core.app.RemoteActionCompatParcelizer.read((VersionedParcel) fp1Var);
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, a.fp1 fp1Var) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, (VersionedParcel) fp1Var);
    }
}
