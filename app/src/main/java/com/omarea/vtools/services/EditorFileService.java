package com.omarea.vtools.services;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class EditorFileService extends android.app.Service {
    public final a.ga0 c = new a.ga0(this);

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.c;
    }
}
