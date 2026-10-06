package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d3 extends com.omarea.model.ActivityCacheInfo {
    public d3(android.database.Cursor cursor, int i) {
        if (i == 1) {
            this.name = cursor.getString(0);
            this.packageName = cursor.getString(1);
            this.exported = cursor.getInt(2) == 1;
            this.enabled = cursor.getInt(3) == 1;
            this.label = cursor.getString(4);
            return;
        }
        if (i == 2) {
            this.name = cursor.getString(0);
            this.packageName = cursor.getString(1);
            this.exported = cursor.getInt(2) == 1;
            this.enabled = cursor.getInt(3) == 1;
            return;
        }
        if (i == 3) {
            this.name = cursor.getString(0);
            this.packageName = cursor.getString(1);
            this.exported = cursor.getInt(2) == 1;
            this.enabled = cursor.getInt(3) == 1;
            return;
        }
        this.name = cursor.getString(0);
        this.packageName = cursor.getString(1);
        this.exported = cursor.getInt(2) == 1;
        this.enabled = cursor.getInt(3) == 1;
        this.label = cursor.getString(4);
    }
}
