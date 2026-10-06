package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zt extends com.omarea.model.ChargeStatSession {
    public zt(android.database.Cursor cursor) {
        this.session = cursor.getInt(0);
        this.beginTime = cursor.getLong(1);
        this.endTime = cursor.getLong(2);
        if (cursor.isNull(3) || cursor.isNull(4)) {
            return;
        }
        this.capacityRatio = cursor.getInt(4) - cursor.getInt(3);
    }

    public zt(int i, android.database.Cursor cursor) {
        this.session = i;
        this.beginTime = cursor.getLong(0);
        this.endTime = cursor.getLong(1);
        this.capacityWh = ((int) (cursor.getDouble(2) / 10.0d)) / 100.0d;
    }
}
