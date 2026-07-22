package com.unity3d.player;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0262d implements OnBackInvokedCallback {
    final /* synthetic */ com.unity3d.player.a.e a;

    C0262d(com.unity3d.player.a.e eVar) {
        this.a = eVar;
    }

    public final void onBackInvoked() {
        Runnable runnable = ((F) this.a).a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
