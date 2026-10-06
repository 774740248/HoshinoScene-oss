package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class py implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a;

    public /* synthetic */ py(int i) {
        this.f453a = i;
    }

    public final int a(android.view.View view, android.view.View view2) {
        switch (this.f453a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                float m = a.xp1.m(view);
                float m2 = a.xp1.m(view2);
                if (m > m2) {
                    return -1;
                }
                return m < m2 ? 1 : 0;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.kr1 kr1Var = (a.kr1) view.getLayoutParams();
                a.kr1 kr1Var2 = (a.kr1) view2.getLayoutParams();
                boolean z = kr1Var.f301a;
                return z != kr1Var2.f301a ? z ? 1 : -1 : kr1Var.e - kr1Var2.e;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0287, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0293, code lost:
    
        if (r0 != false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.py.compare(java.lang.Object, java.lang.Object):int");
    }
}
