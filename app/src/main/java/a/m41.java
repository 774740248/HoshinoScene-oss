package a;

import android.view.View;
import android.widget.SeekBar;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class m41 implements View.OnClickListener {

    public m41() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ SeekBar d;

    public /* synthetic */ m41(SeekBar seekBar, int i) {
        this.c = i;
        this.d = seekBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SeekBar seekBar = this.d;
        switch (i) {
            case 0:
                if (seekBar.getProgress() > 0) {
                    seekBar.setProgress(seekBar.getProgress() - 1);
                    return;
                }
                return;
            default:
                if (seekBar.getProgress() < seekBar.getMax()) {
                    seekBar.setProgress(seekBar.getProgress() + 1);
                    return;
                }
                return;
        }
    }
}
