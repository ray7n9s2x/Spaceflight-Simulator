package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes3.dex */
public final class C5 extends InputStream {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f235short = {2622, 2569, 2573, 2575, 2564, 2569, 2568, 2636, 2569, 2562, 2568, 2636, 2563, 2570, 2636, 2569, 2562, 2584, 2590, 2581, 2624, 2636, 2574, 2585, 2584, 2636, 2575, 2590, 2575, 2636, 2586, 2569, 2590, 2565, 2570, 2565, 2575, 2573, 2584, 2565, 2563, 2562, 2636, 2570, 2573, 2565, 2560, 2569, 2568, 2636, 2570, 2563, 2590, 2636, 2377, 2414, 2408, 2431, 2427, 2423, 2362, 2425, 2422, 2421, 2409, 2431, 2430, 2790, 2152, 2730, 2701, 2709, 2690, 2703, 2698, 2695, 2755, 2703, 2700, 2688, 2690, 2703, 2755, 2693, 2698, 2703, 2694, 2755, 2699, 2694, 2690, 2695, 2694, 2705, 2755, 2693, 2700, 2705, 2777, 2755, 1814, 1816, 1901, 1878, 1883, 1879, 1877, 1864, 1866, 1885, 1867, 1867, 1885, 1884, 1816, 1867, 1873, 1858, 1885, 1816, 1872, 1881, 1867, 1816, 1868, 1879, 1816, 1882, 1885, 1816, 1867, 1885, 1868, 1816, 1886, 1879, 1866, 1816, 1885, 1878, 1868, 1866, 1857, 1816, 1879, 1886, 1816, 1883, 1879, 1877, 1864, 1866, 1885, 1867, 1867, 1873, 1879, 1878, 1816, 1868, 1857, 1864, 1885, 1816, 1867, 1868, 1879, 1866, 1885, 1816, 1871, 1872, 1873, 1883, 1872, 1816, 1873, 1867, 1816, 1878, 1879, 1868, 1816, 1881, 1816, 1884, 1873, 1866, 1885, 1883, 1868, 1879, 1866, 1857, 3157, 3185, 3175, 3153, 3180, 3168, 3174, 3189, 3152, 3189, 3168, 3189, 3142, 3185, 3191, 3195, 3174, 3184, 3124, 3194, 3195, 3168, 3124, 3186, 3195, 3169, 3194, 3184, 3124, 3195, 3174, 3124, 3197, 3194, 3170, 3189, 3192, 3197, 3184, 3124, 3186, 3195, 3174, 3124, 3157, 3185, 3175, 3124, 3185, 3194, 3191, 3174, 3181, 3172, 3168, 3185, 3184, 3124, 3185, 3194, 3168, 3174, 3181, 2377, 2402, 2424, 2430, 2421, 2348, 2391, 2873, 2884, 2871, 2832, 2838, 2827, 2826, 2819, 2884, 2849, 2826, 2823, 2838, 2845, 2836, 2832, 2829, 2827, 2826, 2884, 2826, 2827, 2832, 2884, 2839, 2833, 2836, 2836, 2827, 2838, 2832, 2817, 2816, 853, 882, 874, 893, 880, 885, 888, 828, 889, 882, 872, 878, 869, 828, 882, 893, 881, 889, 828, 885, 882, 828, 880, 883, 895, 893, 880, 828, 890, 885, 880, 889, 828, 884, 889, 893, 888, 889, 878, 918, 954, 928, 953, 945, 1013, 955, 954, 929, 1013, 935, 944, 948, 945, 1013, 944, 955, 954, 928, 946, 957, 1013, 951, 940, 929, 944, 934, 1013, 947, 954, 935, 1013, 946, 944, 955, 944, 935, 948, 953, 901, 928, 935, 933, 954, 934, 944, 915, 953, 948, 946, 934, 2771, 2808, 2810, 2812, 2793, 2804, 2795, 2808, 2749, 2799, 2808, 2812, 2809, 2749, 2801, 2808, 2803, 2810, 2793, 2805, 480, 455, 449, 470, 466, 478, 403, 464, 479, 476, 448, 470, 471};
    public final PushbackInputStream a;
    public AbstractC0416o1 b;
    public final C0387j2 c;
    public P2 d;
    public final CRC32 e;
    public boolean f;
    public final q5 g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6915() {
        if (C0071.m6069() > 0) {
            return f235short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static Object m6916(Object obj) {
        if (C0025.m2132() > 0) {
            return ((byte[]) obj).clone();
        }
        return null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (C0024.m2079(this, bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public C5(P4 p4) {
        q5 q5Var = new q5(4096, true);
        this.c = new C0387j2(0);
        this.e = new CRC32();
        this.f = false;
        this.h = false;
        this.i = false;
        this.a = new PushbackInputStream(p4, 4096);
        this.g = q5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C5.a():void");
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (C0025.m2128(this)) {
            throw new IOException(C0021.m1650(m6915(), 54, 13, 2330));
        }
        return !C0068.m5596(this) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zfork.multiplatforms.android.bomb.P2 b(com.zfork.multiplatforms.android.bomb.E1 r77) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C5.b(com.zfork.multiplatforms.android.bomb.E1):com.zfork.multiplatforms.android.bomb.P2");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (C0025.m2128(this)) {
            return;
        }
        AbstractC0416o1 abstractC0416o1M2133 = C0025.m2133(this);
        if (abstractC0416o1M2133 != null) {
            C0033.m3350(abstractC0416o1M2133);
        }
        this.h = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return C0024.m2079(this, bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (C0025.m2128(this)) {
            throw new IOException(C0029.m2695(m6915(), 407, 13, 435));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C0026.m2321(m6915(), 387, 20, 2717));
        }
        if (i2 == 0) {
            return 0;
        }
        if (C0031.m3101(this) == null) {
            return -1;
        }
        try {
            int iM1078 = C0018.m1078(C0025.m2133(this), bArr, i, i2);
            if (iM1078 == -1) {
                C0071.m6094(this);
            } else {
                C0034.m3484(C0033.m3299(this), bArr, i, iM1078);
            }
            return iM1078;
        } catch (IOException e) {
            P2 p2M3101 = C0031.m3101(this);
            if (C0026.m2287(p2M3101) && C0075.m6833(2, C0031.m3025(p2M3101))) {
                throw new z5(C0033.m3375(e), C0024.m1998(e));
            }
            throw e;
        }
    }
}
