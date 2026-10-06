package a;

import android.view.View;
import com.omarea.ui.apps.Games;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class rp0 implements View.OnClickListener {

    public rp0(Games p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ Games d;

    public /* synthetic */ rp0(Games games, int i) {
        this.c = i;
        this.d = games;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        Games games = this.d;
        switch (i) {
            case 0:
                Games.c(games, view);
                return;
            case 1:
                Games.b(games, view);
                return;
            default:
                Games.d(games, view);
                return;
        }
    }
}
