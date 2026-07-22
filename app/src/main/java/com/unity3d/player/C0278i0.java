package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0278i0 extends ContentObserver {
    private InterfaceC0275h0 a;

    public C0278i0(Handler handler, InterfaceC0275h0 interfaceC0275h0) {
        super(handler);
        this.a = interfaceC0275h0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        InterfaceC0275h0 interfaceC0275h0 = this.a;
        if (interfaceC0275h0 != null) {
            ((OrientationLockListener) interfaceC0275h0).b();
        }
    }
}
