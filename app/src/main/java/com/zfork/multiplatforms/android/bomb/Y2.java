package com.zfork.multiplatforms.android.bomb;

import android.content.pm.ApplicationInfo;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.MetaSelectAppAbility;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MetaSelectAppAbility a;
    public final /* synthetic */ C0334b3 b;

    public /* synthetic */ Y2(MetaSelectAppAbility metaSelectAppAbility, C0334b3 c0334b3) {
        this.a = metaSelectAppAbility;
        this.b = c0334b3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0334b3 c0334b3M3749 = C0036.m3749(this);
        C0077.m7242();
        MetaSelectAppAbility metaSelectAppAbilityM1987 = C0024.m1987(this);
        C0030.m2951(metaSelectAppAbilityM1987);
        try {
            ApplicationInfo applicationInfo = (ApplicationInfo) C0064.m4526(C0078.m7409(c0334b3M3749), i);
            HashSet hashSetM6151 = C0072.m6151(metaSelectAppAbilityM1987);
            if (C0077.m7232(hashSetM6151, C0016.m703(applicationInfo))) {
                C0019.m1180(C0070.m5857(C0037.m3782(metaSelectAppAbilityM1987)), C0019.m1300(C0021.m1548(C0038.m4054(hashSetM6151))));
                C0017.m919(C0030.m2949(metaSelectAppAbilityM1987), new Pair(applicationInfo, C0017.m940(new File(C0038.m4044(applicationInfo)))));
            }
        } catch (Exception unused) {
        }
    }
}
