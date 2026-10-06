package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ShellHandlerBase extends android.os.Handler {
    public static final int EVENT_EXIT = -2;
    public static final int EVENT_READ_ERROR = 4;
    public static final int EVENT_REDE = 2;
    public static final int EVENT_START = 0;
    public static final int EVENT_WRITE = 6;

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == -2) {
            onExit(message.obj);
            return;
        }
        if (i == 0) {
            onStart(message.obj);
            return;
        }
        if (i == 2) {
            onReaderMsg(message.obj);
        } else if (i == 4) {
            onError(message.obj);
        } else {
            if (i != 6) {
                return;
            }
            onWrite(message.obj);
        }
    }

    public void onError(java.lang.Object obj) {
        updateLog(obj, "#ff0000");
    }

    public abstract void onExit(java.lang.Object obj);

    public abstract void onProgress(int i, int i2);

    public void onReader(java.lang.Object obj) {
        updateLog(obj, "#00cc55");
    }

    public void onReaderMsg(java.lang.Object obj) {
        if (obj != null) {
            java.lang.String trim = obj.toString().trim();
            if (!java.util.regex.Pattern.matches("^progress:\\[[\\-0-9\\\\]{1,}/[0-9\\\\]{1,}]$", trim)) {
                onReader(obj);
            } else {
                java.lang.String[] split = trim.substring(10, trim.indexOf("]")).split("/");
                onProgress(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]));
            }
        }
    }

    public abstract void onStart(java.lang.Object obj);

    public abstract void onStart(java.lang.Runnable runnable);

    public void onWrite(java.lang.Object obj) {
        updateLog(obj, "#808080");
    }

    public abstract void updateLog(android.text.SpannableString spannableString);

    public void updateLog(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            java.lang.String obj2 = obj.toString();
            android.text.SpannableString spannableString = new android.text.SpannableString(obj2);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor(str)), 0, obj2.length(), 33);
            updateLog(spannableString);
        }
    }

    public void updateLog(java.lang.Object obj, int i) {
        if (obj != null) {
            java.lang.String obj2 = obj.toString();
            android.text.SpannableString spannableString = new android.text.SpannableString(obj2);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), 0, obj2.length(), 33);
            updateLog(spannableString);
        }
    }
}
