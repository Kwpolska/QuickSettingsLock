package com.chriswarrick.quicksettingslock;

import android.content.Intent;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class LockTileService extends TileService {
    @Override
    public void onStartListening() {
        super.onStartListening();
        Tile t = getQsTile();
        t.setState(Tile.STATE_INACTIVE);
        t.updateTile();
    }

    @Override
    public void onClick() {
        Intent i = new Intent(getApplicationContext(), BlankScreenActivity.class);
        i.addFlags(FLAG_ACTIVITY_NEW_TASK);
        startActivityAndCollapse(i);
        super.onClick();
    }
}
