package com.unity3d.player;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0263d0 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ C0272g0 a;

    ViewTreeObserverOnGlobalLayoutListenerC0263d0(C0272g0 c0272g0) {
        this.a = c0272g0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
        this.a.h.b();
    }
}
