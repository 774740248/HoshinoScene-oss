package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pi0 {
    public static android.database.Cursor a(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (android.os.CancellationSignal) obj);
    }
}
