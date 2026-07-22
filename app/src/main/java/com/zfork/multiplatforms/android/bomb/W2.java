package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.view.View;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.entry.MetaSelectAppAbility;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W2 implements View.OnLongClickListener {
    public final /* synthetic */ MetaSelectAppAbility a;
    public final /* synthetic */ C0358f b;

    public /* synthetic */ W2(MetaSelectAppAbility metaSelectAppAbility, C0358f c0358f) {
        this.a = metaSelectAppAbility;
        this.b = c0358f;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C0358f c0358fM1264 = C0019.m1264(this);
        C0077.m7242();
        MetaSelectAppAbility metaSelectAppAbilityM1750 = C0022.m1750(this);
        C0030.m2951(metaSelectAppAbilityM1750);
        try {
            C0064.m4570(C0030.m2949(metaSelectAppAbilityM1750));
            C0036.m3705(C0070.m5857(c0358fM1264), R.string.ok);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
