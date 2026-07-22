package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0390k extends AbstractC0396l {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f340short = {263, 261, 266, 266, 267, 272, 324, 278, 257, 266, 261, 265, 257, 324, 265, 267, 256, 269, 258, 269, 257, 256, 324, 286, 269, 276, 324, 258, 269, 264, 257, 309, 311, 312, 312, 313, 290, 374, 306, 307, 314, 307, 290, 307, 374, 313, 314, 306, 374, 300, 319, 294, 374, 304, 319, 314, 307, 2519, 2555, 2529, 2552, 2544, 2484, 2554, 2555, 2528, 2484, 2544, 2545, 2552, 2545, 2528, 2545, 2484, 2528, 2545, 2553, 2532, 2555, 2534, 2549, 2534, 2541, 2484, 2546, 2557, 2552, 2545, 2616, 2623, 2599, 2608, 2621, 2616, 2613, 2673, 2622, 2615, 2615, 2594, 2612, 2597, 2594, 2819, 2863, 2869, 2860, 2852, 2912, 2862, 2863, 2868, 2912, 2854, 2857, 2862, 2852, 2912, 2854, 2857, 2860, 2853, 2912, 2856, 2853, 2849, 2852, 2853, 2866, 2912, 2857, 2862, 2912, 2860, 2857, 2867, 2868, 2912, 2863, 2854, 2912, 2851, 2853, 2862, 2868, 2866, 2849, 2860, 2912, 2852, 2857, 2866, 2853, 2851, 2868, 2863, 2866, 2873, 2912, 2854, 2857, 2860, 2853, 2912, 2856, 2853, 2849, 2852, 2853, 2866, 2867, 2425, 2389, 2383, 2390, 2398, 2330, 2388, 2389, 2382, 2330, 2390, 2389, 2393, 2395, 2382, 2399, 2330, 2391, 2389, 2398, 2387, 2396, 2387, 2399, 2398, 2330, 2396, 2387, 2390, 2399, 2330, 2386, 2399, 2395, 2398, 2399, 2376, 2330, 2387, 2388, 2330, 2368, 2387, 2378, 2423, 2389, 2398, 2399, 2390};

    public static int e(ArrayList arrayList, E1 e1) throws z5 {
        for (int i = 0; i < C0018.m1084(arrayList); i++) {
            if (C0072.m6118((E1) C0064.m4526(arrayList, i), e1)) {
                return i;
            }
        }
        throw new z5(C0031.m3047(m7084(), 103, 68, 2880));
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m7084() {
        if (C0028.m2593() >= 0) {
            return f340short;
        }
        return null;
    }

    public static void c(boolean z, File file, File file2) {
        if (!z) {
            if (!C0032.m3207(file2)) {
                throw new z5(C0066.m4828(m7084(), 57, 31, 2452));
            }
        } else {
            if (!C0032.m3207(file)) {
                throw new z5(C0025.m2151(m7084(), 31, 26, 342));
            }
            if (!C0024.m1967(file2, file)) {
                throw new z5(C0020.m1443(m7084(), 0, 31, 356));
            }
        }
    }

    public static void d(RandomAccessFile randomAccessFile, Q4 q4, long j, long j2, N3 n3, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        long j3 = j + j2;
        if (j < 0 || j3 < 0 || j > j3) {
            throw new z5(C0068.m5544(m7084(), 88, 15, 2641));
        }
        if (j == j3) {
            return;
        }
        try {
            C0017.m851(randomAccessFile2, j);
            long j4 = j3 - j;
            byte[] bArr = j4 < ((long) i) ? new byte[(int) j4] : new byte[i];
            long j5 = 0;
            while (true) {
                int iM4833 = C0066.m4833(randomAccessFile2, bArr);
                if (iM4833 == -1) {
                    return;
                }
                C0111.m13166(q4, bArr, 0, iM4833);
                long j6 = iM4833;
                long jM1766 = C0022.m1766(n3) + j6;
                n3.b = jM1766;
                byte[] bArr2 = bArr;
                long jM1607 = C0021.m1607(n3);
                if (jM1607 > 0) {
                    long j7 = (jM1766 * 100) / jM1607;
                }
                j5 += j6;
                if (j5 == j4) {
                    return;
                }
                if (((long) bArr2.length) + j5 > j4) {
                    bArr = new byte[(int) (j4 - j5)];
                    randomAccessFile2 = randomAccessFile;
                } else {
                    randomAccessFile2 = randomAccessFile;
                    bArr = bArr2;
                }
            }
        } catch (IOException e) {
            throw new z5(e);
        }
    }

    public static File f(String str) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, str);
        C0021.m1551(sb, C0032.m3176(secureRandom, 10000));
        File file = new File(C0068.m5536(sb));
        while (C0033.m3343(file)) {
            StringBuilder sb2 = new StringBuilder();
            C0077.m7290(sb2, str);
            C0021.m1551(sb2, C0032.m3176(secureRandom, 10000));
            file = new File(C0068.m5536(sb2));
        }
        return file;
    }

    public static void g(ArrayList arrayList, D5 d5, E1 e1, long j) {
        t5 t5VarM3013;
        int iM2437 = C0027.m2437(arrayList, e1);
        if (iM2437 == -1) {
            throw new z5(C0023.m1904(m7084(), 171, 49, 2362));
        }
        while (true) {
            iM2437++;
            if (iM2437 < C0018.m1084(arrayList)) {
                E1 e12 = (E1) C0064.m4526(arrayList, iM2437);
                e12.w = C0032.m3179(e12) + j;
                if (C0063.m4401(d5) && (t5VarM3013 = C0031.m3013(e12)) != null) {
                    long jM1377 = C0020.m1377(t5VarM3013);
                    if (jM1377 != -1) {
                        t5VarM3013.d = jM1377 + j;
                    }
                }
            } else {
                return;
            }
        }
    }
}
