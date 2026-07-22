package com.zfork.multiplatforms.android.bomb;

import android.graphics.Canvas;
import android.view.View;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0425p4 extends View {
    public Z4 a;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0068.m5612(C0023.m1818(this), canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0020.m1398(C0023.m1818(this), 0, 0, C0073.m6402(this), C0025.m2187(this));
    }
}
