package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ H0(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0073.m6373(this)) {
            case 0:
                ArrayList arrayListM2889 = C0030.m2889(C0038.m4007());
                if (C0018.m1084(arrayListM2889) > 0) {
                    for (int i = 0; i < C0018.m1084(arrayListM2889); i++) {
                        C0030.m2918((Activity) C0064.m4526(arrayListM2889, i));
                    }
                }
                C0064.m4570(arrayListM2889);
                C0068.m5552(C0065.m4717());
                C0067.m5508(0);
                break;
            case 1:
                C0028.m2623(103, C0111.m13120(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                break;
            default:
                C0066.m4814();
                break;
        }
    }
}
