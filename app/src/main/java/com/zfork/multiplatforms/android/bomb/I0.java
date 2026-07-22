package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.widget.GridLayout;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ K0 b;

    public /* synthetic */ I0(K0 k0, int i) {
        this.a = i;
        this.b = k0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0019.m1280(this)) {
            case 0:
                K0 k0M6803 = C0075.m6803(this);
                if (C0034.m3384(k0M6803) != null) {
                    GridLayout gridLayoutM5574 = C0068.m5574(k0M6803);
                    if (gridLayoutM5574 != null && C0016.m655(gridLayoutM5574) == 0) {
                        C0063.m4382(C0068.m5574(k0M6803), 8);
                    }
                    if (C0016.m655(C0034.m3384(k0M6803)) != 0) {
                        C0063.m4382(C0034.m3384(k0M6803), 0);
                    } else {
                        C0063.m4382(C0034.m3384(k0M6803), 8);
                    }
                }
                break;
            case 1:
                K0 k0M68032 = C0075.m6803(this);
                if (!C0016.m700(k0M68032)) {
                    C0070.m5878(k0M68032);
                    break;
                }
                break;
            default:
                K0 k0M68033 = C0075.m6803(this);
                if (C0016.m700(k0M68033)) {
                    C0070.m5878(k0M68033);
                    break;
                }
                break;
        }
    }
}
