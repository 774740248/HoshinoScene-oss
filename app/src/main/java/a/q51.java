package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q51 extends com.omarea.model.FpsWatchSession {
    public q51(android.database.Cursor cursor, int i) {
        if (i != 1) {
            this.sessionId = java.lang.Long.valueOf(cursor.getLong(0));
            this.cloudId = cursor.getString(1);
            this.beginTime = java.lang.Long.valueOf(cursor.getLong(2));
            this.appName = cursor.getString(3);
            this.packageName = cursor.getString(4);
            this.packageVersion = cursor.getString(5);
            this.viewSize = cursor.getString(6);
            this.sessionDesc = cursor.getString(7);
            return;
        }
        this.sessionId = java.lang.Long.valueOf(cursor.getLong(0));
        this.beginTime = java.lang.Long.valueOf(cursor.getLong(1));
        this.packageName = cursor.getString(2);
        this.sessionDesc = cursor.getString(3);
        this.duration = cursor.getInt(4);
        this.avgFPS = cursor.getDouble(5);
        this.avgPower = cursor.getDouble(6);
        this.mode = cursor.getString(7);
        this.cloudId = cursor.getString(8);
    }
}
