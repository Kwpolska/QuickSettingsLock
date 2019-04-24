package com.chriswarrick.quicksettingslock;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class LockAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            performLock();
        }
    }

    @Override
    public void onInterrupt() {

    }

    public void performLock() {
        performGlobalAction(GLOBAL_ACTION_LOCK_SCREEN);
    }
}
