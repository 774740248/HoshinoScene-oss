package com.omarea.scene_mode;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SceneTileService extends android.service.quicksettings.TileService {
    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        startActivityAndCollapse(new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPowerModeTile.class).addFlags(268435456).addFlags(65536).addFlags(1073741824));
        super.onClick();
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        a.nk nkVar = a.b11.c;
        java.lang.String j = a.tg1.j();
        if (a.wv.e(j, a.b11.i)) {
            android.service.quicksettings.Tile qsTile = getQsTile();
            qsTile.setState(2);
            qsTile.setIcon(android.graphics.drawable.Icon.createWithResource(getApplicationContext(), 2131231214));
            qsTile.setLabel(getString(2131953250));
        } else if (a.wv.e(j, a.b11.l)) {
            android.service.quicksettings.Tile qsTile2 = getQsTile();
            qsTile2.setState(2);
            qsTile2.setIcon(android.graphics.drawable.Icon.createWithResource(getApplicationContext(), 2131231215));
            qsTile2.setLabel(getString(2131952012));
        } else if (a.wv.e(j, a.b11.j)) {
            android.service.quicksettings.Tile qsTile3 = getQsTile();
            qsTile3.setState(2);
            qsTile3.setIcon(android.graphics.drawable.Icon.createWithResource(getApplicationContext(), 2131231216));
            qsTile3.setLabel(getString(2131953202));
        } else if (a.wv.e(j, a.b11.k)) {
            android.service.quicksettings.Tile qsTile4 = getQsTile();
            qsTile4.setState(2);
            qsTile4.setIcon(android.graphics.drawable.Icon.createWithResource(getApplicationContext(), 2131231217));
            qsTile4.setLabel(getString(2131952259));
        } else {
            android.service.quicksettings.Tile qsTile5 = getQsTile();
            qsTile5.setState(1);
            qsTile5.setIcon(android.graphics.drawable.Icon.createWithResource(getApplicationContext(), 2131231215));
            qsTile5.setLabel(getString(2131951876));
        }
        getQsTile().updateTile();
    }
}
