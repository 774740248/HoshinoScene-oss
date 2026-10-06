package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qc0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ android.view.View h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.ej1 j;
    public final /* synthetic */ android.graphics.drawable.Drawable k;
    public final /* synthetic */ a.w60 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(android.view.View view, java.lang.String str, a.ej1 ej1Var, android.graphics.drawable.Drawable drawable, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = view;
        this.i = str;
        this.j = ej1Var;
        this.k = drawable;
        this.l = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qc0(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(500L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        android.view.View view = this.h;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        a.wv.v(createBitmap, "createBitmap(view.width,… Bitmap.Config.ARGB_8888)");
        view.draw(new android.graphics.Canvas(createBitmap));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.lang.String str = this.i;
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpg");
        contentValues.put("relative_path", android.os.Environment.DIRECTORY_PICTURES);
        android.net.Uri uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        a.ej1 ej1Var = this.j;
        android.content.ContentResolver contentResolver = ((android.content.Context) ej1Var.d).getContentResolver();
        android.net.Uri insert = contentResolver.insert(uri, contentValues);
        a.wv.s(insert);
        java.io.OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        a.wv.s(openOutputStream);
        createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 65, openOutputStream);
        try {
            android.media.MediaScannerConnection.scanFile((android.content.Context) ej1Var.d, new java.lang.String[]{new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES), str).getAbsolutePath()}, new java.lang.String[]{"image/jpg"}, null);
        } catch (java.lang.Throwable th) {
            a.b20.I(th);
        }
        a.wr.m = false;
        android.view.View view2 = this.h;
        view2.post(new a.u1(view2, this.k, this.l, this.j, 2));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.qc0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
