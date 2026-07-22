package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC0266e0 implements DialogInterface.OnCancelListener {
    final /* synthetic */ C0272g0 a;

    DialogInterfaceOnCancelListenerC0266e0(C0272g0 c0272g0) {
        this.a = c0272g0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        J j = this.a.f;
        if (j != null) {
            ((x1) j).a();
        }
    }
}
