package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import java.io.InputStream;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D2 {
    public static final byte[] a;
    public static final C2 b;
    public static final byte[] c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f237short = {2084, 2076, 2078, 2055, 2135, 2068, 2072, 2050, 2073, 2051, 2135, 2074, 2050, 2052, 2051, 2135, 2069, 2066, 2135, 2073, 2072, 2073, 2138, 2073, 2066, 2064, 2070, 2051, 2078, 2049, 2066, 2139, 2135, 2070, 2068, 2051, 2050, 2070, 2075, 2125, 2135};

    /* JADX INFO: renamed from: ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6918() {
        if (C0023.m1921() > 0) {
            return f237short;
        }
        return null;
    }

    static {
        C0066.m4841();
        a = new byte[0];
        C0023.m1913();
        C0030.m2951(C0016.m702());
        C0030.m2951(C0023.m1883());
        b = new C2(new B2(2), 0);
        c = new byte[8192];
        new C2(new B2(3), 1);
    }

    public static long a(InputStream inputStream, long j, Supplier supplier) {
        if (j < 0) {
            throw new IllegalArgumentException(C0039.m4094(j, C0037.m3829(m6918(), 0, 41, 2167)));
        }
        long j2 = j;
        while (j2 > 0) {
            long jM3212 = C0032.m3212(inputStream, (byte[]) C0064.m4593(supplier), 0, (int) C0029.m2757(j2, r4.length));
            if (jM3212 < 0) {
                break;
            }
            j2 -= jM3212;
        }
        return j - j2;
    }
}
