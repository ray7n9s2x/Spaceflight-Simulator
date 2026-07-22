package com.zfork.multiplatforms.android.bomb;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0065;

/* JADX INFO: loaded from: classes3.dex */
public final class D4 extends Dialog {
    public TextView a;
    public TextView b;
    public C0479z c;

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0017.m944(this, false);
        Window windowM3064 = C0031.m3064(this);
        C0034.m3483(windowM3064, new ColorDrawable(0));
        C0065.m4766(windowM3064, 0.0f);
    }
}
