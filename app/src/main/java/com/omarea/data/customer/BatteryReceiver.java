package com.omarea.data.customer;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BatteryReceiver implements a.wr0 {
    private final double batteryCapacity;
    private a.mr batteryUtils;
    private boolean cdpDisableDelay;
    private boolean chargeDisabled;
    private android.content.SharedPreferences config;
    private final android.content.Context context;
    private java.util.Timer governorTimer;
    private final boolean isAsync;
    private a.hu0 keepShellAsync;
    private int lastLimitValue;
    private long lastSetChargeLimit;
    private final double limitExit;
    private boolean limited;
    private int lowSpeedExtreme;
    private final a.yu0 lowSpeedHigh$delegate;
    private final a.yu0 lowSpeedMedium$delegate;
    private final double tempL1;
    private final double tempL2;
    private final double tempL3;

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, a.hu0] */
    public BatteryReceiver(android.content.Context context, boolean z) {
        a.wv.w(context, "context");
        this.context = context;
        this.isAsync = z;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("charge", 0);
        a.wv.v(sharedPreferences, "context.getSharedPrefere…PF, Context.MODE_PRIVATE)");
        this.config = sharedPreferences;
        a.nu0 nu0Var = a.nu0.f395a;
        this.chargeDisabled = a.wv.e(a.nu0.d("/dev/bypass"), "1");
        this.batteryCapacity = a.gy.q(context);
        this.batteryUtils = new a.mr();
        this.lowSpeedMedium$delegate = new a.vj1(a.gr.f);
        this.lowSpeedHigh$delegate = new a.vj1(a.gr.e);
        this.lowSpeedExtreme = 100;
        this.lastLimitValue = -1;
        if (this.keepShellAsync == null) {
            a.hu0 obj = new a.hu0();
            new android.os.Handler(android.os.Looper.getMainLooper());
            new java.util.concurrent.locks.ReentrantLock();
            this.keepShellAsync = obj;
        }
        java.lang.String str = android.os.Build.MANUFACTURER;
        a.wv.v(str, "MANUFACTURER");
        java.util.Locale locale = java.util.Locale.ENGLISH;
        double d = a.wv.e(a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)"), "xiaomi") ? 48.0d : 44.5d;
        this.tempL3 = d;
        double d2 = d - 0.7d;
        this.tempL2 = d2;
        double d3 = d2 - 2.2d;
        this.tempL1 = d3;
        this.limitExit = d3 - 1;
    }

    public static final /* synthetic */ void access$governorRun(com.omarea.data.customer.BatteryReceiver batteryReceiver) {
        batteryReceiver.governorRun();
    }

    private final void autoChangeLimitValue(a.kc0 kc0Var) {
        if (this.config.getBoolean("sleep_time", false)) {
            a.vj1 vj1Var = a.oq0.c;
            int i = a.oq0.f;
            if (i > 79) {
                setChargerLimitToValue(i > 94 ? this.lowSpeedExtreme : i > 89 ? getLowSpeedHigh() : getLowSpeedMedium(), kc0Var, true);
                return;
            }
        }
        if (this.config.getBoolean("qc_booster", false)) {
            setChargerLimitToValue(getQcLimit(), kc0Var, false);
        }
    }

    private final void disableCharge() {
        this.batteryUtils.getClass();
        this.chargeDisabled = a.wv.e(a.q10.L("charge-control", "pause", null), "true");
    }

    private final boolean getBpAllowed() {
        return this.config.getBoolean("bp", false);
    }

    private final int getBpLevel() {
        return this.config.getInt("bp_level", 90);
    }

    private final boolean getCdpDisable() {
        return !this.cdpDisableDelay && this.config.getBoolean("cdp_disable", false);
    }

    private final int getCurrentTime() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        return calendar.get(12) + (calendar.get(11) * 60);
    }

    private final int getGetUpTime() {
        return this.config.getInt("time_get_up", 420);
    }

    private final int getGoToBedTime() {
        return this.config.getInt("time_slepp", 1350);
    }

    private final int getLowSpeedHigh() {
        return ((java.lang.Number) ((a.vj1) this.lowSpeedHigh$delegate).a()).intValue();
    }

    private final int getLowSpeedMedium() {
        return ((java.lang.Number) ((a.vj1) this.lowSpeedMedium$delegate).a()).intValue();
    }

    private final boolean getOnCharge() {
        a.vj1 vj1Var = a.oq0.c;
        return a.oq0.i == 2;
    }

    private final int getQcLimit() {
        return this.config.getInt("charge_limit_ma", 3000);
    }

    private final boolean getShouldBP() {
        java.lang.String str;
        if (getBpAllowed() && (a.oq0.f >= getBpLevel() || (this.chargeDisabled && a.oq0.f > getBpLevel() - 20))) {
            return true;
        }
        if (!getCdpDisable() || a.oq0.f <= 9) {
            return false;
        }
        this.batteryUtils.getClass();
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String[] g = a.nu0.g(new java.lang.String[]{"/sys/class/oplus_chg/usb/fast_chg_type", "/sys/class/power_supply/usb/online", "/sys/class/power_supply/usb/voltage_max"});
        java.lang.String str2 = g[0];
        java.lang.Integer c2 = str2 != null ? a.wi1.c2(str2) : null;
        if (c2 != null) {
            if (c2.intValue() == 0 && a.wv.e(g[1], "1")) {
                return true;
            }
        } else if (a.wv.e(g[1], "1") && (str = g[2]) != null && a.yi1.B2(str, "5")) {
            return true;
        }
        return false;
    }

    public final void governorRun() {
        if (this.config.getInt("current_control_mode", 1) != 2) {
            stopGovernorTimer();
        } else if (inSleepTime() || this.chargeDisabled) {
            stopGovernorTimer();
        } else {
            autoChangeLimitValue(a.kc0.n);
        }
    }

    private final boolean inSleepTime() {
        if (!this.config.getBoolean("sleep_time", false)) {
            return false;
        }
        int currentTime = getCurrentTime();
        int getUpTime = getGetUpTime();
        int goToBedTime = getGoToBedTime();
        if (getUpTime <= goToBedTime || goToBedTime > currentTime || currentTime > getUpTime) {
            if (getUpTime >= goToBedTime) {
                return false;
            }
            if (currentTime < goToBedTime && currentTime > getUpTime) {
                return false;
            }
        }
        return true;
    }

    public static final void onReceive$lambda$0(com.omarea.data.customer.BatteryReceiver batteryReceiver) {
        a.wv.w(batteryReceiver, "this$0");
        batteryReceiver.cdpDisableDelay = false;
        batteryReceiver.onReceive(a.kc0.g, null);
    }

    private final void resumeCharge() {
        this.batteryUtils.getClass();
        this.chargeDisabled = !a.mr.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7 A[Catch: Exception -> 0x00c7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c7, blocks: (B:10:0x006b, B:14:0x00b7, B:20:0x0075, B:22:0x0079, B:24:0x007d, B:30:0x008a, B:32:0x008e, B:33:0x0092, B:35:0x0097, B:41:0x00a9), top: B:9:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setChargerLimitToValue(int r17, a.kc0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.data.customer.BatteryReceiver.setChargerLimitToValue(int, a.kc0, boolean):void");
    }

    private final boolean sleepChargeMode(int i, int i2, int i3, a.kc0 kc0Var) {
        boolean z;
        if (i < 20 || !inSleepTime()) {
            return false;
        }
        int getUpTime = getGetUpTime();
        a.kc0 kc0Var2 = a.kc0.f;
        if (i >= i2) {
            int i4 = this.lastLimitValue;
            int i5 = this.lowSpeedExtreme;
            if (i4 != i5) {
                this.lastLimitValue = i5;
                a.mr mrVar = this.batteryUtils;
                z = kc0Var == kc0Var2;
                mrVar.getClass();
                a.mr.h(i5, z);
            }
        } else {
            double d = ((i2 - i) / 100.0f) * this.batteryCapacity;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            int i6 = (int) (d / ((calendar.get(12) + (calendar.get(11) * 60) > getUpTime ? (1440 - (calendar.get(12) + (calendar.get(11) * 60))) + getUpTime : getUpTime - (calendar.get(12) + (calendar.get(11) * 60))) / 60.0f));
            int i7 = this.lowSpeedExtreme;
            if (i6 < i7) {
                i3 = i7;
            } else if (i6 <= i3) {
                i3 = i6;
            }
            if (this.lastLimitValue != i3) {
                this.lastLimitValue = i3;
                a.mr mrVar2 = this.batteryUtils;
                z = kc0Var == kc0Var2;
                mrVar2.getClass();
                a.mr.h(i3, z);
            }
        }
        return true;
    }

    private final void startGovernorTimer() {
        if (this.governorTimer == null) {
            java.util.Timer timer = new java.util.Timer("ChargeControl");
            timer.schedule(new a.hr(0, this), 0L, 1000L);
            this.governorTimer = timer;
        }
    }

    private final void stopGovernorTimer() {
        java.util.Timer timer = this.governorTimer;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            java.util.Timer timer2 = this.governorTimer;
            if (timer2 != null) {
                timer2.purge();
            }
            this.governorTimer = null;
        }
    }

    @Override // a.wr0
    public boolean eventFilter(a.kc0 kc0Var) {
        a.wv.w(kc0Var, "eventType");
        int ordinal = kc0Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6;
    }

    @Override // a.wr0
    public boolean isAsync() {
        return this.isAsync;
    }

    public final void onDestroy$app_release_mini() {
        resumeCharge();
        if (this.keepShellAsync != null) {
            try {
                a.wv.s(null);
                throw null;
            } catch (java.lang.Exception unused) {
                this.keepShellAsync = null;
            }
        }
        this.keepShellAsync = null;
    }

    @Override // a.wr0
    public void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        a.wv.w(kc0Var, "eventType");
        if (a.oq0.f < 0) {
            return;
        }
        if (kc0Var == a.kc0.c) {
            this.cdpDisableDelay = true;
            a.cp cpVar = com.omarea.Scene.c;
            com.omarea.Scene.d.postDelayed(new a.fw(14, this), 5000L);
        }
        try {
            boolean shouldBP = getShouldBP();
            if (shouldBP != this.chargeDisabled) {
                if (!shouldBP) {
                    resumeCharge();
                    return;
                }
                disableCharge();
            }
            if (getOnCharge()) {
                if (sleepChargeMode(a.oq0.f, getBpAllowed() ? getBpLevel() : 100, getQcLimit(), kc0Var) || !this.config.getBoolean("qc_booster", false)) {
                    return;
                }
                autoChangeLimitValue(kc0Var);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // a.wr0
    public void onSubscribe() {
    }

    @Override // a.wr0
    public void onUnsubscribe() {
    }

    public /* synthetic */ BatteryReceiver(android.content.Context context, boolean z, int i, a.e20 e20Var) {
        this(context, (i & 2) != 0 ? true : z);
    }
}
