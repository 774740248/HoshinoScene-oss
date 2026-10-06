package a;

import android.view.View;
import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eo implements android.view.View.OnClickListener {
    public final /* synthetic */ int c = 1;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;

    public eo(a.v60 v60Var, a.at atVar, com.omarea.ui.SwitchOptionItemView switchOptionItemView, com.omarea.ui.SwitchOptionItemView switchOptionItemView2) {
        this.d = v60Var;
        this.e = atVar;
        this.f = switchOptionItemView;
        this.g = switchOptionItemView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.reflect.Method method;
        int i = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (((java.lang.reflect.Method) this.f) == null) {
                    android.view.View view2 = (android.view.View) obj2;
                    android.content.Context context = view2.getContext();
                    while (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod((java.lang.String) obj, android.view.View.class)) != null) {
                                this.f = method;
                                this.g = context;
                            }
                        } catch (java.lang.NoSuchMethodException unused) {
                        }
                        context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
                    }
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new java.lang.IllegalStateException("Could not find method " + ((java.lang.String) obj) + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    ((java.lang.reflect.Method) this.f).invoke((android.content.Context) this.g, view);
                    return;
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e2);
                }
            default:
                ((a.v60) obj2).a();
                ((a.at) ((a.zs) obj)).j(new a.ec1(((com.omarea.ui.SwitchOptionItemView) this.f).i, ((com.omarea.ui.SwitchOptionItemView) this.g).i));
                return;
        }
    }

    public eo(android.view.View view, java.lang.String str) {
        this.d = view;
        this.e = str;
    }
}
