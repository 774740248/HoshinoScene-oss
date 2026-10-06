package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yt extends com.omarea.model.ChargeStatTime {
    public yt(android.database.Cursor cursor) {
        this.capacity = cursor.getInt(0);
        long j = cursor.getLong(1);
        this.startTime = j;
        this.endTime = j;
    }
}
