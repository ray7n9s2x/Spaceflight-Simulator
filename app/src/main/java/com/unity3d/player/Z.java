package com.unity3d.player;

/* JADX INFO: loaded from: classes2.dex */
final class Z implements Runnable {
    final /* synthetic */ C0257b0 a;

    Z(C0257b0 c0257b0) {
        this.a = c0257b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.e();
    }
}
