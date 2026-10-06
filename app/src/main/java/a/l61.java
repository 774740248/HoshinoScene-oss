package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l61 extends com.omarea.model.PowerStatSession {
    public l61(int i, android.database.Cursor cursor) {
        if (i != 1) {
            this.session = cursor.getInt(0);
            this.beginTime = cursor.getLong(1);
            this.endTime = cursor.getLong(2);
            this.avgPower = cursor.getDouble(3);
            this.used = cursor.getInt(4);
            return;
        }
        this.session = cursor.getInt(0);
        this.beginTime = cursor.getLong(1);
        this.endTime = cursor.getLong(2);
        this.avgPower = cursor.getDouble(3);
        this.used = cursor.getInt(4);
    }
}
