package com.unity3d.player;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class AudioVolumeHandler implements InterfaceC0298p {
    private C0301q a;

    AudioVolumeHandler(Context context) {
        C0301q c0301q = new C0301q(context);
        this.a = c0301q;
        c0301q.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override // com.unity3d.player.InterfaceC0298p
    public final native void onAudioVolumeChanged(int i);
}
