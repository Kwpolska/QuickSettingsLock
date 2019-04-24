package com.chriswarrick.quicksettingslock;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class BlankScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_screen);
        // finish();
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                BlankScreenActivity.this.finish();
            }
        }, 1000);
    }
}
