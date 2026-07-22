package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S0 implements Runnable {
    public final /* synthetic */ double a;

    public /* synthetic */ S0(double d) {
        this.a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0028.m2623(101, new double[]{C0025.m2139(this), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE});
    }
}
