package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public enum z41 {
    /* JADX INFO: Fake field, exist only in values array */
    CacheReferences("cache_references", "cache-references(M)", 2131952301),
    CacheMisses("cache_misses", "cache-misses(M)", 2131952300),
    MemAccess("mem_access", "mem-access(M)", 2131952302),
    Stall("stall", "stall(M)", 2131952303),
    StallBackend("stall_backend", "stall-backend(M)", 2131952304),
    StallBackendMembound("stall_backend_membound", "stall-backend-membound(M)", 2131952305),
    StallFrontend("stall_frontend", "stall-frontend(M)", 2131952306),
    StallFrontendMembound("stall_frontend_membound", "stall-frontend-membound(M)", 2131952307);

    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;

    z41(java.lang.String str, java.lang.String str2, int i) {
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}
