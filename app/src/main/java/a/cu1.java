package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class cu1 {
    public static int a(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }
}
