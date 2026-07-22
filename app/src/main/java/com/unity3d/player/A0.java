package com.unity3d.player;

/* JADX INFO: loaded from: classes2.dex */
final class A0 {
    private UnityPlayer a;

    public A0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    final void a() {
        if (PlatformSupport.OREO_SUPPORT) {
            this.a.runOnUiThread(new RunnableC0322z0(this));
        }
    }

    final void b() {
        if (PlatformSupport.OREO_SUPPORT) {
            this.a.runOnUiThread(new RunnableC0320y0(this));
        }
    }
}
