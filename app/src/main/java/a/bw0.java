package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bw0 extends a.dw0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(android.content.Context context, com.omarea.krscript.model.ActionNode actionNode) {
        super(context, 2131558585, actionNode);
        a.wv.w(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) this.c.findViewById(2131362726);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (actionNode.getParams() != null) {
            java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> params = actionNode.getParams();
            a.wv.s(params);
            if (params.size() > 0) {
                if (imageView != null) {
                    imageView.setImageDrawable(context.getDrawable(2131231094));
                    return;
                }
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(context.getDrawable(2131231103));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(android.content.Context context, com.omarea.krscript.model.PageNode pageNode) {
        super(context, 2131558585, pageNode);
        a.wv.w(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) this.c.findViewById(2131362726);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setImageDrawable(context.getDrawable(2131231086));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(android.content.Context context, com.omarea.krscript.model.PickerNode pickerNode) {
        super(context, 2131558585, pickerNode);
        a.wv.w(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) this.c.findViewById(2131362726);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setImageDrawable(context.getDrawable(2131231099));
        }
    }
}
