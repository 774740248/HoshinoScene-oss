package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xt extends com.omarea.model.ChargeStatRecord {
    public xt(int i, android.database.Cursor cursor) {
        if (i == 1) {
            this.capacity = cursor.getInt(0);
            this.power = cursor.getDouble(1);
            this.time = cursor.getLong(2);
        } else if (i != 2) {
            this.capacity = cursor.getInt(0);
            this.current = cursor.getLong(1);
            this.time = cursor.getLong(2);
        } else {
            this.capacity = cursor.getInt(0);
            this.temperature = (float) cursor.getLong(1);
            this.time = cursor.getLong(2);
        }
    }
}
