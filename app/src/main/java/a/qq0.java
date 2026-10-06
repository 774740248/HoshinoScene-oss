package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qq0 implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public final a.rq0 f474a;

    public qq0(a.ej1 ej1Var) {
        this.f474a = ej1Var;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        this.f474a.c(new a.pq0(gl10));
    }
}
