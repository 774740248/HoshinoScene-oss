package a;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class e41 implements DialogInterface.OnClickListener {

    public e41() {
        this(null, null, null, null, null, null, null, null, null);
    }
    public final /* synthetic */ SeekBar c;
    public final /* synthetic */ SeekBar d;
    public final /* synthetic */ SeekBar e;
    public final /* synthetic */ SeekBar f;
    public final /* synthetic */ Button g;
    public final /* synthetic */ TextView h;
    public final /* synthetic */ c41 i;
    public final /* synthetic */ ImageView j;
    public final /* synthetic */ View k;

    public /* synthetic */ e41(SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, SeekBar seekBar4, Button button, EditText editText, c41 c41Var, ImageView imageView, View view) {
        this.c = seekBar;
        this.d = seekBar2;
        this.e = seekBar3;
        this.f = seekBar4;
        this.g = button;
        this.h = editText;
        this.i = c41Var;
        this.j = imageView;
        this.k = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        TextView textView = this.h;
        wv.w(textView, "$textView");
        wv.w(this.i, "this$0");
        ImageView imageView = this.j;
        wv.w(imageView, "$invalidView");
        View view = this.k;
        wv.w(view, "$preview");
        SeekBar seekBar = this.c;
        int progress = seekBar.getProgress();
        SeekBar seekBar2 = this.d;
        int progress2 = seekBar2.getProgress();
        SeekBar seekBar3 = this.e;
        int progress3 = seekBar3.getProgress();
        SeekBar seekBar4 = this.f;
        int argb = Color.argb(progress, progress2, progress3, seekBar4.getProgress());
        this.g.setBackgroundColor(argb);
        try {
            textView.setText(c41.b(seekBar.getProgress(), seekBar2.getProgress(), seekBar3.getProgress(), seekBar4.getProgress()));
            imageView.setVisibility(8);
            view.setBackground(new ColorDrawable(argb));
        } catch (Exception unused) {
        }
    }
}
