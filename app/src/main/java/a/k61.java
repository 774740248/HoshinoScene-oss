package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k61 extends com.omarea.model.PowerStatRecord {
    public k61(android.database.Cursor cursor) {
        boolean z = false;
        long j = cursor.getLong(0);
        this.startTime = j;
        this.endTime = j;
        this.capacity = cursor.getInt(1);
        this.screenOn = cursor.getInt(2) == 1;
        int i = cursor.getInt(3);
        if (i != 3 && i != 4) {
            z = true;
        }
        this.charging = z;
        this.packageName = cursor.getString(4);
    }
}
