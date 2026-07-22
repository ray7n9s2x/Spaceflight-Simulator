package com.zfork.multiplatforms.android.bomb;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.apksig.C0037;
import com.android.apksig.internal.util.C0028;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 extends FrameLayout {
    public TextView a;
    public TextView b;
    public TextView c;

    public TextView getTvCancel() {
        return C0111.m13144(this);
    }

    public TextView getTvDelete() {
        return C0037.m3808(this);
    }

    public TextView getTvSet() {
        return C0028.m2619(this);
    }
}
