package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sp extends a.tg1 {
    public final java.lang.String[] b;
    public final java.lang.String[] c;
    public final java.lang.String[] d;

    public sp() {
        super(8);
        this.b = new java.lang.String[]{"始终允许", "仅在使用中允许", "允许访问全部", "允许", "Allow"};
        this.c = new java.lang.String[]{"发送通知", "获取已安装的应用", "获取位置信息", "访问设备上的照片", "访问照片和视频", "访问设备上的音乐和视频", "通话状态和移动网络信息", "发现并连接到附近的设备"};
        this.d = new java.lang.String[]{"Don't", "商店", "安全", "删除", "退出", "取消"};
    }

    public static java.lang.CharSequence w(a.sp spVar, java.lang.String[] strArr, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.accessibilityservice.AccessibilityService accessibilityService) {
        spVar.getClass();
        for (java.lang.String str : strArr) {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str);
            if (findAccessibilityNodeInfosByText != null && !findAccessibilityNodeInfosByText.isEmpty()) {
                int size = findAccessibilityNodeInfosByText.size();
                for (int i = 0; i < size; i++) {
                    java.lang.CharSequence text = findAccessibilityNodeInfosByText.get(i).getText();
                    a.wv.s(text);
                    java.lang.String obj = text.toString();
                    java.lang.String[] strArr2 = spVar.d;
                    int length = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = findAccessibilityNodeInfosByText.get(i);
                            a.wv.v(accessibilityNodeInfo2, "nodes[i]");
                            android.view.accessibility.AccessibilityNodeInfo d = a.tg1.d(accessibilityNodeInfo2);
                            if (d != null) {
                                if (!d.isEnabled()) {
                                    d.setEnabled(true);
                                }
                                if (!a.tg1.c(d)) {
                                    a.tg1.s(d, accessibilityService);
                                }
                                java.lang.CharSequence text2 = findAccessibilityNodeInfosByText.get(i).getText();
                                a.wv.s(text2);
                                return text2;
                            }
                        } else {
                            if (a.yi1.g2(obj, strArr2[i2])) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void v(android.accessibilityservice.AccessibilityService accessibilityService, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        java.lang.String str;
        java.lang.CharSequence w;
        a.wv.w(accessibilityService, "service");
        a.wv.w(accessibilityEvent, "event");
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.s("is_auto_allow", false) && accessibilityEvent.getSource() != null) {
            try {
                android.view.accessibility.AccessibilityNodeInfo source = accessibilityEvent.getSource();
                a.wv.s(source);
                java.lang.String[] strArr = this.c;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str = null;
                        break;
                    }
                    str = strArr[i];
                    a.wv.v(source.findAccessibilityNodeInfosByText(str), "view.findAccessibilityNodeInfosByText(text)");
                    if (!r5.isEmpty()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (str == null || (w = w(this, this.b, source, accessibilityService)) == null) {
                    return;
                }
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.X("Scene为“" + str + "”请求选择了“" + ((java.lang.Object) w) + "”", 0);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
