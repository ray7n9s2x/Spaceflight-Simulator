package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnDismissListenerC0260c0 implements DialogInterface.OnDismissListener {
    final /* synthetic */ C0272g0 a;

    DialogInterfaceOnDismissListenerC0260c0(C0272g0 c0272g0) {
        this.a = c0272g0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
