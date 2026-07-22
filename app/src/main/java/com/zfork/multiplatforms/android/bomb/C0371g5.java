package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import j$.util.Objects;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0371g5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f326short = {1753, 1730, 1754, 1749, 1742, 1731, 1746, 1732, 1687, 1754, 1730, 1732, 1731, 1687, 1753, 1752, 1731, 1687, 1749, 1746, 1687, 1753, 1746, 1744, 1750, 1731, 1758, 1729, 1746, 1494, 1503, 1503, 1482, 1500, 1485, 1433, 1492, 1484, 1482, 1485, 1433, 1495, 1494, 1485, 1433, 1499, 1500, 1433, 1495, 1500, 1502, 1496, 1485, 1488, 1487, 1500, 397, 440, 427, 408, 427, 442, 433, 432, 431, 444, 394, 429, 427, 428, 442, 429, 394, 425, 440, 427, 426, 444, 418, 438, 447, 447, 426, 444, 429, 484, 1144, 1140, 1082, 1057, 1081, 1078, 1069, 1056, 1073, 1063, 1129};
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: ۥۨۤ۠, reason: contains not printable characters */
    public static int m7066(Object obj) {
        if (C0017.m846() > 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۣۤ, reason: contains not printable characters */
    public static short[] m7067() {
        if (C0021.m1598() < 0) {
            return f326short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0371g5.class != C0030.m2951(obj)) {
            return false;
        }
        C0371g5 c0371g5 = (C0371g5) obj;
        return C0029.m2798(this) == C0029.m2798(c0371g5) && C0024.m2050(this) == C0024.m2050(c0371g5);
    }

    public final int hashCode() {
        return m7066(new Object[]{C0070.m5853(C0029.m2798(this)), C0070.m5853(C0024.m2050(this))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0038.m4022(m7067(), 56, 30, 473));
        C0078.m7466(sb, C0029.m2798(this));
        C0077.m7290(sb, C0018.m1070(m7067(), 86, 11, 1108));
        C0078.m7466(sb, C0024.m2050(this));
        C0077.m7289(sb, '}');
        return C0068.m5536(sb);
    }

    public C0371g5(long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                this.a = j;
                this.b = j2;
                return;
            }
            throw new IllegalArgumentException(C0036.m3678(m7067(), 0, 29, 1719));
        }
        throw new IllegalArgumentException(C0078.m7427(m7067(), 29, 27, 1465));
    }
}
