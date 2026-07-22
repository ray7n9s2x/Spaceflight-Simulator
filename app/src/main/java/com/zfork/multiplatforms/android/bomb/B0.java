package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.view.View;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public final class B0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ C0 c;

    public /* synthetic */ B0(C0 c0, Context context, int i) {
        this.a = i;
        this.c = c0;
        this.b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0023.m1827(this)) {
            case 0:
                C0 c0M4096 = C0039.m4096(this);
                boolean z = !C0030.m2969(c0M4096);
                c0M4096.v = z;
                C0039.m4135(c0M4096, C0075.m6871(this), z);
                C0030.m2951(c0M4096);
                break;
            default:
                C0 c0M40962 = C0039.m4096(this);
                boolean z2 = !C0030.m2969(c0M40962);
                c0M40962.v = z2;
                C0027.m2510(c0M40962, C0075.m6871(this), z2);
                if (C0030.m2969(c0M40962)) {
                    if (!C0078.m7334(c0M40962)) {
                        c0M40962.G = true;
                        C0017.m859(c0M40962, true);
                    } else {
                        C0017.m859(c0M40962, false);
                    }
                }
                break;
        }
    }
}
