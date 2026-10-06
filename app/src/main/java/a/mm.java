package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mm {

    public mm() {
    }


    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f356a = new int[]{2131230836, 2131230834, 2131230760};
    public java.lang.Object b = new int[]{2131230784, 2131230819, 2131230791, 2131230786, 2131230787, 2131230790, 2131230789};
    public java.lang.Object c = new int[]{2131230833, 2131230835, 2131230777, 2131230829, 2131230830, 2131230831, 2131230832};
    public java.lang.Object d = new int[]{2131230809, 2131230775, 2131230808};
    public java.lang.Object e = new int[]{2131230827, 2131230837};
    public java.lang.Object f = new int[]{2131230763, 2131230769, 2131230764, 2131230770};

    public static final void a(a.mm mmVar, com.omarea.krscript.model.NodeInfoBase nodeInfoBase, a.dw0 dw0Var) {
        java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> params;
        mmVar.getClass();
        final int i = 0;
        if (nodeInfoBase instanceof com.omarea.krscript.model.PageNode) {
            a.r31 r31Var = (a.r31) mmVar.c;
            com.omarea.krscript.model.PageNode pageNode = (com.omarea.krscript.model.PageNode) nodeInfoBase;
            mmVar.e(nodeInfoBase, dw0Var);
            a.a2 a2Var = (a.a2) r31Var;
            a2Var.getClass();
            if (a2Var.V(pageNode)) {
                if (a2Var.f() == null || pageNode.getLink().length() <= 0) {
                    if (a2Var.f() != null && pageNode.getActivity().length() > 0) {
                        new a.w21(a2Var.L(), pageNode.getActivity()).j();
                        return;
                    }
                    com.omarea.krscript.model.KrScriptActionHandler krScriptActionHandler = a2Var.Y;
                    if (krScriptActionHandler != null) {
                        krScriptActionHandler.onSubPageClick(pageNode);
                        return;
                    }
                    return;
                }
                try {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(pageNode.getLink()));
                    intent.addFlags(268435456);
                    android.content.Context f = a2Var.f();
                    if (f != null) {
                        f.startActivity(intent);
                        return;
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    android.content.Context f2 = a2Var.f();
                    android.content.Context f3 = a2Var.f();
                    android.widget.Toast.makeText(f2, f3 != null ? f3.getString(2131952738) : null, 0).show();
                    return;
                }
            }
            return;
        }
        final int i2 = 1;
        if (nodeInfoBase instanceof com.omarea.krscript.model.ActionNode) {
            a.r31 r31Var2 = (a.r31) mmVar.c;
            final com.omarea.krscript.model.ActionNode actionNode = (com.omarea.krscript.model.ActionNode) nodeInfoBase;
            final a.u1 e = mmVar.e(nodeInfoBase, dw0Var);
            final a.a2 a2Var2 = (a.a2) r31Var2;
            a2Var2.getClass();
            if (a2Var2.V(actionNode)) {
                if (actionNode.getConfirm()) {
                    int i3 = a.x60.f681a;
                    a.fs1.Z(a2Var2.K(), actionNode.getTitle(), actionNode.getDesc(), new a.m1(), null, 16);
                    return;
                } else if (actionNode.getWarning().length() <= 0 || (actionNode.getParams() != null && ((params = actionNode.getParams()) == null || params.size() != 0))) {
                    a2Var2.S(actionNode, e);
                    return;
                } else {
                    int i4 = a.x60.f681a;
                    a.fs1.Z(a2Var2.K(), actionNode.getTitle(), actionNode.getWarning(), new a.m1(), null, 16);
                    return;
                }
            }
            return;
        }
        if (nodeInfoBase instanceof com.omarea.krscript.model.PickerNode) {
            a.r31 r31Var3 = (a.r31) mmVar.c;
            final com.omarea.krscript.model.PickerNode pickerNode = (com.omarea.krscript.model.PickerNode) nodeInfoBase;
            final a.u1 e2 = mmVar.e(nodeInfoBase, dw0Var);
            final a.a2 a2Var3 = (a.a2) r31Var3;
            a2Var3.getClass();
            if (a2Var3.V(pickerNode)) {
                if (pickerNode.getConfirm()) {
                    int i5 = a.x60.f681a;
                    a.fs1.Z(a2Var3.K(), pickerNode.getTitle(), pickerNode.getDesc(), new a.n1(), null, 16);
                    return;
                } else if (pickerNode.getWarning().length() <= 0) {
                    a2Var3.W(pickerNode, e2);
                    return;
                } else {
                    int i6 = a.x60.f681a;
                    a.fs1.Z(a2Var3.K(), pickerNode.getTitle(), pickerNode.getWarning(), new a.n1(), null, 16);
                    return;
                }
            }
            return;
        }
        if (nodeInfoBase instanceof com.omarea.krscript.model.SwitchNode) {
            a.r31 r31Var4 = (a.r31) mmVar.c;
            com.omarea.krscript.model.SwitchNode switchNode = (com.omarea.krscript.model.SwitchNode) nodeInfoBase;
            a.u1 e3 = mmVar.e(nodeInfoBase, dw0Var);
            a.a2 a2Var4 = (a.a2) r31Var4;
            a2Var4.getClass();
            if (a2Var4.V(switchNode)) {
                boolean z = !switchNode.getChecked();
                if (switchNode.getConfirm()) {
                    int i7 = a.x60.f681a;
                    a.fs1.Z(a2Var4.K(), switchNode.getTitle(), switchNode.getDesc(), new a.o1(a2Var4, switchNode, z, e3, 0), null, 16);
                } else if (switchNode.getWarning().length() > 0) {
                    int i8 = a.x60.f681a;
                    a.fs1.Z(a2Var4.K(), switchNode.getTitle(), switchNode.getWarning(), new a.o1(a2Var4, switchNode, z, e3, 1), null, 16);
                } else {
                    java.lang.String setState = switchNode.getSetState();
                    if (setState == null) {
                        return;
                    }
                    a2Var4.T(switchNode, setState, e3, new a.z1(z));
                }
            }
        }
    }

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static android.content.res.ColorStateList c(android.content.Context context, int i) {
        int c = a.rl1.c(context, 2130968798);
        return new android.content.res.ColorStateList(new int[][]{a.rl1.b, a.rl1.d, a.rl1.c, a.rl1.f}, new int[]{a.rl1.b(context, 2130968795), a.sv.b(c, i), a.sv.b(c, i), i});
    }

    public static com.omarea.krscript.model.NodeInfoBase d(java.lang.String str, java.util.ArrayList arrayList) {
        com.omarea.krscript.model.NodeInfoBase d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.omarea.krscript.model.NodeInfoBase nodeInfoBase = (com.omarea.krscript.model.NodeInfoBase) it.next();
            if (a.wv.e(nodeInfoBase.getIndex(), str)) {
                return nodeInfoBase;
            }
            if (nodeInfoBase instanceof com.omarea.krscript.model.GroupNode) {
                com.omarea.krscript.model.GroupNode groupNode = (com.omarea.krscript.model.GroupNode) nodeInfoBase;
                if (groupNode.getChildren().size() > 0 && (d = d(str, groupNode.getChildren())) != null) {
                    return d;
                }
            }
        }
        return null;
    }

    public static android.graphics.drawable.LayerDrawable f(a.lb1 lb1Var, android.content.Context context, int i) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        android.graphics.drawable.Drawable f = lb1Var.f(context, 2131230823);
        android.graphics.drawable.Drawable f2 = lb1Var.f(context, 2131230824);
        if ((f instanceof android.graphics.drawable.BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) f;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(createBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((f2 instanceof android.graphics.drawable.BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) f2;
        } else {
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(createBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void i(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
        int[] iArr = a.m90.f340a;
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = a.nm.b;
        }
        mutate.setColorFilter(a.nm.c(i, mode));
    }

    public final a.u1 e(com.omarea.krscript.model.NodeInfoBase nodeInfoBase, a.dw0 dw0Var) {
        return new a.u1(new android.os.Handler(android.os.Looper.getMainLooper()), dw0Var, nodeInfoBase, this, 1);
    }

    public final android.content.res.ColorStateList g(android.content.Context context, int i) {
        if (i == 2131230780) {
            return a.zx.b(context, 2131099669);
        }
        if (i == 2131230826) {
            return a.zx.b(context, 2131099672);
        }
        if (i != 2131230825) {
            if (i == 2131230768) {
                return c(context, a.rl1.c(context, 2130968795));
            }
            if (i == 2131230762) {
                return c(context, 0);
            }
            if (i == 2131230767) {
                return c(context, a.rl1.c(context, 2130968793));
            }
            if (i == 2131230821 || i == 2131230822) {
                return a.zx.b(context, 2131099671);
            }
            if (b((int[]) this.b, i)) {
                return a.rl1.d(context, 2130968799);
            }
            if (b((int[]) this.e, i)) {
                return a.zx.b(context, 2131099668);
            }
            if (b((int[]) this.f, i)) {
                return a.zx.b(context, 2131099667);
            }
            if (i == 2131230818) {
                return a.zx.b(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = (int[][]) new int[3];
        int[] iArr2 = new int[3];
        android.content.res.ColorStateList d = a.rl1.d(context, 2130968848);
        if (d == null || !d.isStateful()) {
            iArr[0] = a.rl1.b;
            iArr2[0] = a.rl1.b(context, 2130968848);
            iArr[1] = a.rl1.e;
            iArr2[1] = a.rl1.c(context, 2130968797);
            iArr[2] = a.rl1.f;
            iArr2[2] = a.rl1.c(context, 2130968848);
        } else {
            int[] iArr3 = a.rl1.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = a.rl1.e;
            iArr2[1] = a.rl1.c(context, 2130968797);
            iArr[2] = a.rl1.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public final void h(a.ew0 ew0Var, java.util.ArrayList arrayList) {
        a.lw0 lw0Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = arrayList.get(i);
            a.wv.v(obj, "actionInfos[index]");
            com.omarea.krscript.model.NodeInfoBase nodeInfoBase = (com.omarea.krscript.model.NodeInfoBase) obj;
            try {
                if (nodeInfoBase instanceof com.omarea.krscript.model.PageNode) {
                    lw0Var = new a.bw0((android.content.Context) this.f356a, (com.omarea.krscript.model.PageNode) nodeInfoBase);
                } else if (nodeInfoBase instanceof com.omarea.krscript.model.SwitchNode) {
                    lw0Var = new a.fw0((android.content.Context) this.f356a, (com.omarea.krscript.model.SwitchNode) nodeInfoBase);
                } else if (nodeInfoBase instanceof com.omarea.krscript.model.ActionNode) {
                    lw0Var = new a.bw0((android.content.Context) this.f356a, (com.omarea.krscript.model.ActionNode) nodeInfoBase);
                } else if (nodeInfoBase instanceof com.omarea.krscript.model.PickerNode) {
                    lw0Var = new a.bw0((android.content.Context) this.f356a, (com.omarea.krscript.model.PickerNode) nodeInfoBase);
                } else if (!(nodeInfoBase instanceof com.omarea.krscript.model.TextNode)) {
                    if (nodeInfoBase instanceof com.omarea.krscript.model.GroupNode) {
                        a.ew0 ew0Var2 = new a.ew0((android.content.Context) this.f356a, false, (com.omarea.krscript.model.GroupNode) nodeInfoBase);
                        if (((com.omarea.krscript.model.GroupNode) nodeInfoBase).getChildren().size() > 0) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ew0Var.c.findViewById(android.R.id.content);
                            android.view.View view = ew0Var2.c;
                            a.wv.v(view, "layout");
                            viewGroup.addView(view);
                            ew0Var.h.add(ew0Var2);
                            h(ew0Var2, ((com.omarea.krscript.model.GroupNode) nodeInfoBase).getChildren());
                        }
                    }
                    lw0Var = null;
                } else if (ew0Var.g) {
                    lw0Var = new a.kw0((android.content.Context) this.f356a, 2131558610, (com.omarea.krscript.model.TextNode) nodeInfoBase);
                } else {
                    lw0Var = new a.kw0((android.content.Context) this.f356a, 2131558611, (com.omarea.krscript.model.TextNode) nodeInfoBase);
                }
                if (lw0Var != null) {
                    if (lw0Var instanceof a.dw0) {
                        a.s31 s31Var = (a.s31) this.e;
                        a.wv.w(s31Var, "onClickListener");
                        ((a.dw0) lw0Var).g = s31Var;
                        a.s31 s31Var2 = (a.s31) this.f;
                        a.wv.w(s31Var2, "onLongClickListener");
                        ((a.dw0) lw0Var).h = s31Var2;
                    }
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ew0Var.c.findViewById(android.R.id.content);
                    android.view.View view2 = lw0Var.c;
                    a.wv.v(view2, "layout");
                    viewGroup2.addView(view2);
                    ew0Var.h.add(lw0Var);
                }
            } catch (java.lang.Exception e) {
                android.widget.Toast.makeText((android.content.Context) this.f356a, nodeInfoBase.getTitle() + "界面渲染异常" + e.getMessage(), 0).show();
            }
        }
    }

    public final void j(android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = ((boolean[]) this.d).length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (((boolean[]) this.d)[i2]) {
                java.lang.String str = ((java.lang.String[]) this.f)[i2];
                if (str != null) {
                    arrayList.add(str);
                }
                java.lang.String str2 = ((java.lang.String[]) this.e)[i2];
                if (str2 != null) {
                    arrayList2.add(str2);
                }
                i++;
            }
        }
        java.lang.String j2 = a.qv.j2(arrayList, ((com.omarea.krscript.model.ActionParamInfo) this.f356a).getSeparator(), null, null, null, 62);
        textView.setText(arrayList2.size() > 0 ? a.qv.j2(arrayList2, "，", null, null, null, 62) : "");
        textView2.setText(j2);
        textView3.setText(java.lang.String.valueOf(i));
    }
}
