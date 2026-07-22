package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0261c1 implements K {
    final /* synthetic */ RunnableC0264d1 a;

    C0261c1(RunnableC0264d1 runnableC0264d1) {
        this.a = runnableC0264d1;
    }

    public final void a() {
        RunnableC0264d1 runnableC0264d1 = this.a;
        runnableC0264d1.a = true;
        if (runnableC0264d1.b) {
            runnableC0264d1.c.release();
        }
    }
}
