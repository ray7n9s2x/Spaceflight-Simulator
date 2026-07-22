package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.unity3d.player.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ViewOnApplyWindowInsetsListenerC0294n1 implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ UnityPlayerForActivityOrService a;

    ViewOnApplyWindowInsetsListenerC0294n1(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.invokeOnMainThread((Runnable) new C0255a1(this, windowInsets));
        return windowInsets;
    }
}
