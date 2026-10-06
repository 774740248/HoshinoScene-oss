package com.omarea.scene_mode;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class NotificationListenerService extends android.service.notification.NotificationListenerService {
    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(android.service.notification.StatusBarNotification statusBarNotification) {
        com.omarea.model.SceneConfigInfo sceneConfigInfo;
        super.onNotificationPosted(statusBarNotification);
        if (statusBarNotification != null && statusBarNotification.isClearable()) {
            a.tg1 tg1Var = a.me1.m;
            a.me1 me1Var = a.me1.p;
            if (me1Var == null || (sceneConfigInfo = me1Var.i) == null || !sceneConfigInfo.disNotice) {
                return;
            }
            try {
                int i = statusBarNotification.getNotification().flags;
                cancelNotification(statusBarNotification.getKey());
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
