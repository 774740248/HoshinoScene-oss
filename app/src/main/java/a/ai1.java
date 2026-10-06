package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract /* synthetic */ class ai1 {
    public static /* synthetic */ java.lang.String A(int i) {
        switch (i) {
            case 1:
                return "POWER_CONNECTED";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return "POWER_DISCONNECTED";
            case 3:
                return "BATTERY_LOW";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return "BATTERY_CAPACITY_CHANGED";
            case 5:
                return "BATTERY_CHANGED";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return "BATTERY_FULL";
            case 7:
                return "CHARGE_CONFIG_CHANGED";
            case 8:
                return "SCREEN_ON";
            case 9:
                return "SCREEN_OFF";
            case 10:
                return "APP_SWITCH";
            case 11:
                return "BOOT_COMPLETED";
            case 12:
                return "TIMER";
            case 13:
                return "SERVICE_DEBUG";
            case 14:
                return "SERVICE_UPDATE";
            case 15:
                return "STATE_RESUME";
            case 16:
                return "SCENE_MODE_ACTION";
            case 17:
                return "SCENE_CONFIG";
            case 18:
                return "SCENE_APP_CONFIG";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ java.lang.String C(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return "LEFT";
            case 5:
                return "RIGHT";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ java.lang.String D(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ long a(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i) {
        switch (i) {
            case 1:
                return 2;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return 8;
            case 3:
                return 16;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return 1;
            case 5:
                return 4;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return 32;
            case 7:
                return 128;
            default:
                throw null;
        }
    }

    public static java.lang.String c(int i, java.lang.String str) {
        return i + str;
    }

    public static java.lang.String d(androidx.recyclerview.widget.RecyclerView recyclerView, java.lang.StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static java.lang.String e(java.lang.String str, int i, java.lang.String str2) {
        return str + i + str2;
    }

    public static java.lang.String f(java.lang.String str, a.gk0 gk0Var, java.lang.String str2) {
        return str + gk0Var + str2;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + str2 + str3;
    }

    public static java.lang.String i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static java.lang.String j(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static java.lang.String k(java.util.Locale locale, java.lang.String str, java.lang.String str2, java.util.Locale locale2, java.lang.String str3) {
        a.wv.v(locale, str);
        java.lang.String lowerCase = str2.toLowerCase(locale2);
        a.wv.v(lowerCase, str3);
        return lowerCase;
    }

    public static java.lang.String l(java.lang.Object[] objArr, int i, java.lang.String str, java.lang.String str2) {
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(objArr, i));
        a.wv.v(format, str2);
        return format;
    }

    public static /* synthetic */ java.util.Iterator m() {
        try {
            return java.util.Arrays.asList(new a.yk()).iterator();
        } catch (java.lang.Throwable th) {
            throw new java.util.ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void n(int i, java.lang.String str) {
        if (i == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = a.wv.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            a.wv.w1(a.wv.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void o(a.ml mlVar, int i, java.lang.String str, int i2) {
        java.lang.String string = mlVar.getString(i);
        a.wv.v(string, str);
        a.fs1.X(string, i2);
    }

    public static void p(a.v60 v60Var, a.p80 p80Var, int i, android.view.View view) {
        view.setOnClickListener(new a.m80(v60Var, p80Var, i));
    }

    public static void q(a.zt0 zt0Var, java.lang.String str, a.l1 l1Var, int i, java.lang.String str2) {
        a.wv.w(zt0Var, str);
        zt0Var.m(l1Var.o(i), str2);
    }

    public static void r(android.content.Context context, int i, android.content.Context context2, int i2) {
        android.widget.Toast.makeText(context2, context.getString(i), i2).show();
    }

    public static /* synthetic */ void s(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static /* synthetic */ void t(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static void u(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.StringBuilder sb) {
        sb.append(str + str2 + str3);
    }

    public static void v(java.lang.Object[] objArr, int i, java.lang.String str, java.lang.String str2, android.widget.TextView textView) {
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(objArr, i));
        a.wv.v(format, str2);
        textView.setText(format);
    }

    public static boolean w(java.lang.String str) {
        return new java.io.File(str).exists();
    }

    public static /* synthetic */ java.util.Iterator x() {
        try {
            return java.util.Arrays.asList(new a.xk()).iterator();
        } catch (java.lang.Throwable th) {
            throw new java.util.ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void y(java.lang.Object obj) {
        throw new java.lang.ClassCastException();
    }

    public static /* synthetic */ java.lang.String z(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return "LEFT";
            case 3:
                return "TOP";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
