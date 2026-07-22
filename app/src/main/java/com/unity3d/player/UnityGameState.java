package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class UnityGameState {
    private static String ModeName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.valueOf(i) : "CONTENT" : "GAMEPLAY_UNINTERRUPTIBLE" : "GAMEPLAY_INTERRUPTIBLE" : "NONE" : "UNKNOWN";
    }

    public static void setGameState(Context context, boolean z, int i) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManagerM6629m = C$$ExternalSyntheticApiModelOutline0.m6629m(UnityGameManager.getGameManager(context));
        if (gameManagerM6629m == null) {
            D.Log(6, "UnityGame: GameManager not available.");
            return;
        }
        D.Log(4, "SetGameState: " + z + " " + i);
        gameManagerM6629m.setGameState(C$$ExternalSyntheticApiModelOutline0.m(z, i));
    }

    public static void setGameState(Context context, boolean z, int i, int i2, int i3) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManagerM6629m = C$$ExternalSyntheticApiModelOutline0.m6629m(UnityGameManager.getGameManager(context));
        if (gameManagerM6629m == null) {
            D.Log(6, "UnityGame: GameManager not available.");
            return;
        }
        D.Log(4, "SetGameState: isLoading: " + z + ", mode: " + ModeName(i) + ", label: " + i2 + ", quality: " + i3);
        gameManagerM6629m.setGameState(C$$ExternalSyntheticApiModelOutline0.m(z, i, i2, i3));
    }
}
