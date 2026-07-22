package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC0320y0 implements Runnable {
    final /* synthetic */ A0 a;

    RunnableC0320y0(A0 a0) {
        this.a = a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().requestPointerCapture();
    }
}
