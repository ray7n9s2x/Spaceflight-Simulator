package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.ApkSignerEngine;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.RunnablesExecutor;
import com.joke.connectdevice.bean.C0064;
import java.util.Set;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0437s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f358short = {2687, 2680, 2687, 2658, 2625, 2687, 2658, 2686, 2614, 2683, 2675, 2658, 2686, 2681, 2674, 2614, 2687, 2661, 2614, 2680, 2681, 2658, 2614, 2687, 2683, 2662, 2682, 2675, 2683, 2675, 2680, 2658, 2675, 2674, 2075, 2061, 2076, 2093, 2064, 2061, 2059, 2077, 2076, 2055, 2074, 2120, 2053, 2061, 2076, ZipUtils.GP_FLAG_EFS, 2055, 2060, 2120, 2049, 2075, 2120, 2054, 2055, 2076, 2120, 2049, 2053, 2072, 2052, 2061, 2053, 2061, 2054, 2076, 2061, 2060};

    public static byte[] a(ApkSignerEngine apkSignerEngine) {
        return new byte[0];
    }

    public static boolean c(ApkSignerEngine apkSignerEngine) {
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7109() {
        if (C0064.m4578() >= 0) {
            return f358short;
        }
        return null;
    }

    public static Set b(ApkSignerEngine apkSignerEngine, byte[] bArr, Set set) {
        throw new UnsupportedOperationException(C0064.m4545(m7109(), 0, 34, 2582));
    }

    public static void d(ApkSignerEngine apkSignerEngine, RunnablesExecutor runnablesExecutor) {
        throw new UnsupportedOperationException(C0025.m2151(m7109(), 34, 37, 2152));
    }
}
