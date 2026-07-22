package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC0273g1 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ UnityPlayerForActivityOrService b;

    RunnableC0273g1(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W w = this.b.mSoftInput;
        if (w != null) {
            w.a(this.a);
        }
    }
}
