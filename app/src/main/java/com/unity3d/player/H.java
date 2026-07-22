package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes2.dex */
final class H extends G {
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private int f;

    private H(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static G a(Object obj, int i, Runnable runnable) {
        G h = (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) ? new H(AbstractC0265e.a(obj), i, runnable) : new G(runnable);
        h.registerOnBackPressedCallback();
        return h;
    }

    @Override // com.unity3d.player.G
    protected void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C0262d c0262d = new C0262d(this.a);
            this.d = c0262d;
            AbstractC0265e.a(this.e, this.f, c0262d);
        }
    }

    @Override // com.unity3d.player.G
    protected void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0265e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
