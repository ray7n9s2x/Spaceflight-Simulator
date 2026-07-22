package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class M0 implements DialogInterface.OnClickListener {
    final /* synthetic */ UnityPlayer a;

    M0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
