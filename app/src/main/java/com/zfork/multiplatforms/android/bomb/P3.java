package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.joke.plugin.gson.internal.bind.C0068;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class P3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f274short = {435, 435, 428};

    static {
        try {
            TrustManager[] trustManagerArr = {new O3()};
            SSLContext sSLContextM834 = C0017.m834(C0032.m3209(m6997(), 0, 3, 480));
            C0030.m2842(sSLContextM834, null, trustManagerArr, null);
            C0022.m1679(C0077.m7214(sSLContextM834));
            C0032.m3165(new M2(1));
        } catch (Exception unused) {
        }
        C0068.m5616(C0032.m3196());
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6997() {
        if (C0018.m1064() > 0) {
            return f274short;
        }
        return null;
    }
}
