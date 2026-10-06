package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e3 extends android.database.sqlite.SQLiteOpenHelper {
    public final /* synthetic */ int c;

    /* [修复] 从 smali 还原：super 只能调用一次，按 i 选择库名/版本 */
    public e3(android.content.Context context, int i) {
        super(context, i == 1 ? "auto_skip_config" : (i == 2 ? "magisk_modules" : "scene_app_contents"), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, (i == 1 || i == 2) ? 1 : 2);
        this.c = i;
    }

    public static java.lang.String a(java.lang.String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -987494927:
                if (str.equals("provider")) {
                    c = 0;
                    break;
                }
                break;
            case -808719889:
                if (str.equals("receiver")) {
                    c = 1;
                    break;
                }
                break;
            case 1984153269:
                if (str.equals("service")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return "providers";
            case 1:
                return "receivers";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return "services";
            default:
                return "activities";
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    sQLiteDatabase.execSQL("create table apps(id INTEGER primary key AUTOINCREMENT, package_name text COLLATE NOCASE, version bigint)");
                    sQLiteDatabase.execSQL("create table activities(id INTEGER primary key AUTOINCREMENT, package_name text COLLATE NOCASE, name text COLLATE NOCASE, exported REAL,enabled REAL,label text COLLATE NOCASE)");
                    sQLiteDatabase.execSQL("create table services(id INTEGER primary key AUTOINCREMENT, package_name text COLLATE NOCASE, name text COLLATE NOCASE, exported REAL,enabled REAL)");
                    sQLiteDatabase.execSQL("create table providers(id INTEGER primary key AUTOINCREMENT, package_name text COLLATE NOCASE, name text COLLATE NOCASE, exported REAL,enabled REAL,authority text COLLATE NOCASE)");
                    sQLiteDatabase.execSQL("create table receivers(id INTEGER primary key AUTOINCREMENT, package_name text COLLATE NOCASE, name text COLLATE NOCASE, exported REAL,enabled REAL)");
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case 1:
                try {
                    sQLiteDatabase.execSQL("create table auto_skip_ids(activity text primary key, viewId text)");
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            default:
                a.wv.w(sQLiteDatabase, "db");
                try {
                    sQLiteDatabase.execSQL("create table modules(id text primary key, last_update REAL default(-1), prop_url int default(-1),zip_url text,notes_url text,name text,version_name text,version_code text,author text,description text,support text,donate text,template text)");
                    return;
                } catch (java.lang.Exception unused3) {
                    return;
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                sQLiteDatabase.execSQL("alter table apps add column version bigint");
                return;
            case 1:
                return;
            default:
                a.wv.w(sQLiteDatabase, "db");
                return;
        }
    }
}
