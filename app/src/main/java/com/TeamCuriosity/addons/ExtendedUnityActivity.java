package com.teamcuriosity.addons;

import android.content.Intent;
import com.unity3d.player.UnityPlayerActivity;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedUnityActivity extends UnityPlayerActivity {
    private final Map<Integer, ActivityResultListener> sListeners = new ConcurrentHashMap();

    public interface ActivityResultListener {
        void onActivityResult(int i, Intent intent);
    }

    public void registerActivityResultListener(int i, ActivityResultListener activityResultListener) {
        if (activityResultListener == null) {
            this.sListeners.remove(Integer.valueOf(i));
        } else {
            this.sListeners.put(Integer.valueOf(i), activityResultListener);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ActivityResultListener activityResultListener = this.sListeners.get(Integer.valueOf(i));
        if (activityResultListener != null) {
            activityResultListener.onActivityResult(i2, intent);
        }
    }
}
