package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class io1 {
    public static android.os.ParcelFileDescriptor a(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
