package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hn0 extends android.transition.Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212a;
    public final /* synthetic */ android.graphics.Rect b;

    public /* synthetic */ hn0(android.graphics.Rect rect, int i) {
        this.f212a = i;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        int i = this.f212a;
        android.graphics.Rect rect = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
