package com.unity3d.player;

import android.view.WindowInsets;

/* JADX INFO: renamed from: com.unity3d.player.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0255a1 extends Z0 {
    final /* synthetic */ WindowInsets b;
    final /* synthetic */ ViewOnApplyWindowInsetsListenerC0294n1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0255a1(ViewOnApplyWindowInsetsListenerC0294n1 viewOnApplyWindowInsetsListenerC0294n1, WindowInsets windowInsets) {
        super(viewOnApplyWindowInsetsListenerC0294n1.a);
        this.c = viewOnApplyWindowInsetsListenerC0294n1;
        this.b = windowInsets;
    }

    @Override // com.unity3d.player.Z0
    public final void a() {
        this.c.a.nativeOnApplyWindowInsets(this.b);
    }
}
