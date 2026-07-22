package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0272g0 extends W {
    Y h;

    public C0272g0(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.W
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Y y = new Y(this.a, this.b);
        this.h = y;
        y.a(this, z5, z6);
        this.h.setOnDismissListener(new DialogInterfaceOnDismissListenerC0260c0(this));
        super.a(str, i, z, z2, z3, z4, str2, i2, z5, z6);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0263d0(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new DialogInterfaceOnCancelListenerC0266e0(this));
    }

    @Override // com.unity3d.player.W
    public final void a(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    @Override // com.unity3d.player.W
    public final void b() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.W
    protected EditText createEditText(W w) {
        return new C0269f0(this, this.a, w);
    }

    @Override // com.unity3d.player.W
    public final void d() {
        this.h.show();
    }

    protected void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }
}
