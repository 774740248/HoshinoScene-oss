package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fu {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.WeakHashMap f160a = new java.util.WeakHashMap();
    public static final java.util.WeakHashMap b = new java.util.WeakHashMap();
    public static final java.util.WeakHashMap c = new java.util.WeakHashMap();
    public static final java.util.WeakHashMap d = new java.util.WeakHashMap();

    public static final java.lang.Float a(a.cn1 cn1Var) {
        a.wv.w(cn1Var, "<this>");
        return (java.lang.Float) b.get(cn1Var.getChartView());
    }

    public static final boolean b(a.cn1 cn1Var, android.view.MotionEvent motionEvent, a.eu euVar) {
        java.lang.Runnable runnable;
        a.wv.w(cn1Var, "<this>");
        a.wv.w(motionEvent, "event");
        android.view.View chartView = cn1Var.getChartView();
        int action = motionEvent.getAction();
        java.util.WeakHashMap weakHashMap = c;
        java.util.WeakHashMap weakHashMap2 = f160a;
        java.util.WeakHashMap weakHashMap3 = d;
        if (action == 0) {
            weakHashMap2.put(chartView, new a.y31(java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY())));
            weakHashMap.remove(chartView);
            java.lang.Runnable runnable2 = (java.lang.Runnable) weakHashMap3.remove(chartView);
            if (runnable2 != null) {
                chartView.removeCallbacks(runnable2);
            }
            a.ua0 ua0Var = new a.ua0(chartView, cn1Var, euVar, 7);
            weakHashMap3.put(chartView, ua0Var);
            chartView.postDelayed(ua0Var, android.view.ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                a.y31 y31Var = (a.y31) weakHashMap2.get(chartView);
                if (y31Var != null) {
                    java.lang.String str = (java.lang.String) weakHashMap.get(chartView);
                    float abs = java.lang.Math.abs(motionEvent.getX() - ((java.lang.Number) y31Var.c).floatValue());
                    float abs2 = java.lang.Math.abs(motionEvent.getY() - ((java.lang.Number) y31Var.d).floatValue());
                    if (weakHashMap.get(chartView) == null) {
                        float scaledTouchSlop = android.view.ViewConfiguration.get(chartView.getContext()).getScaledTouchSlop();
                        if ((abs > scaledTouchSlop || abs2 > scaledTouchSlop) && (runnable = (java.lang.Runnable) weakHashMap3.remove(chartView)) != null) {
                            chartView.removeCallbacks(runnable);
                        }
                    }
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1984141450) {
                            if (hashCode != 143756103) {
                                if (hashCode == 1387629604 && str.equals("horizontal")) {
                                    if (abs2 > abs + 80.0f) {
                                        weakHashMap.put(chartView, "vertical");
                                        android.view.ViewParent parent = chartView.getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(false);
                                        }
                                        c(cn1Var, null);
                                        if (euVar != null) {
                                            euVar.a();
                                        }
                                    } else {
                                        android.view.ViewParent parent2 = chartView.getParent();
                                        if (parent2 != null) {
                                            parent2.requestDisallowInterceptTouchEvent(true);
                                        }
                                        float B = a.wv.B(motionEvent.getX(), 0.0f, chartView.getWidth());
                                        cn1Var.setTooltipPosition(java.lang.Float.valueOf(B));
                                        c(cn1Var, java.lang.Float.valueOf(motionEvent.getY()));
                                        if (euVar != null) {
                                            euVar.d(cn1Var, java.lang.Float.valueOf(B));
                                        }
                                    }
                                }
                            } else if (str.equals("longpress")) {
                                android.view.ViewParent parent3 = chartView.getParent();
                                if (parent3 != null) {
                                    parent3.requestDisallowInterceptTouchEvent(true);
                                }
                                float B2 = a.wv.B(motionEvent.getX(), 0.0f, chartView.getWidth());
                                cn1Var.setTooltipPosition(java.lang.Float.valueOf(B2));
                                c(cn1Var, java.lang.Float.valueOf(motionEvent.getY()));
                                if (euVar != null) {
                                    euVar.d(cn1Var, java.lang.Float.valueOf(B2));
                                }
                            }
                        } else if (str.equals("vertical")) {
                            if (abs > abs2 + 80.0f) {
                                weakHashMap.put(chartView, "horizontal");
                                android.view.ViewParent parent4 = chartView.getParent();
                                if (parent4 != null) {
                                    parent4.requestDisallowInterceptTouchEvent(true);
                                }
                                float B3 = a.wv.B(motionEvent.getX(), 0.0f, chartView.getWidth());
                                cn1Var.setTooltipPosition(java.lang.Float.valueOf(B3));
                                c(cn1Var, java.lang.Float.valueOf(motionEvent.getY()));
                                if (euVar != null) {
                                    euVar.d(cn1Var, java.lang.Float.valueOf(B3));
                                }
                            } else {
                                android.view.ViewParent parent5 = chartView.getParent();
                                if (parent5 != null) {
                                    parent5.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        }
                    }
                    if (abs > abs2 + 12.0f) {
                        weakHashMap.put(chartView, "horizontal");
                        android.view.ViewParent parent6 = chartView.getParent();
                        if (parent6 != null) {
                            parent6.requestDisallowInterceptTouchEvent(true);
                        }
                        float B4 = a.wv.B(motionEvent.getX(), 0.0f, chartView.getWidth());
                        cn1Var.setTooltipPosition(java.lang.Float.valueOf(B4));
                        c(cn1Var, java.lang.Float.valueOf(motionEvent.getY()));
                        if (euVar != null) {
                            euVar.d(cn1Var, java.lang.Float.valueOf(B4));
                        }
                    } else if (abs2 > abs + 12.0f) {
                        weakHashMap.put(chartView, "vertical");
                        android.view.ViewParent parent7 = chartView.getParent();
                        if (parent7 != null) {
                            parent7.requestDisallowInterceptTouchEvent(false);
                        }
                        c(cn1Var, null);
                        if (euVar != null) {
                            euVar.a();
                        }
                    }
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        java.lang.Runnable runnable3 = (java.lang.Runnable) weakHashMap3.remove(chartView);
        if (runnable3 != null) {
            chartView.removeCallbacks(runnable3);
        }
        weakHashMap2.remove(chartView);
        weakHashMap.remove(chartView);
        android.view.ViewParent parent8 = chartView.getParent();
        if (parent8 != null) {
            parent8.requestDisallowInterceptTouchEvent(false);
        }
        c(cn1Var, null);
        if (euVar != null) {
            euVar.a();
        }
        return true;
    }

    public static final void c(a.cn1 cn1Var, java.lang.Float f) {
        a.wv.w(cn1Var, "<this>");
        android.view.View chartView = cn1Var.getChartView();
        java.util.WeakHashMap weakHashMap = b;
        if (f != null) {
            weakHashMap.put(chartView, f);
        } else {
            weakHashMap.remove(chartView);
        }
    }
}
