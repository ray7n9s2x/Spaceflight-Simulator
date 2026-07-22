package com.android.apksig.apk;

import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.ZipFormatException;
import com.android.apksig.zip.ZipSections;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkUtilsLite {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f39short = {2059, 2064, 2073, 2165, 2154, 2157, 2158, 481, 506, 499, 415, 384, 391, 388, 402, 475, 449, 402, 476, 477, 454, 402, 468, 477, 455, 476, 470, 1666, 1683, 1672, 1763, 1680, 1706, 1700, 1709, 1706, 1709, 1700, 1763, 1665, 1711, 1708, 1696, 1704, 1763, 1712, 1706, 1721, 1702, 1712, 1763, 1706, 1709, 1763, 1707, 1702, 1698, 1703, 1702, 1713, 1763, 1698, 1709, 1703, 1763, 1701, 1708, 1708, 1719, 1702, 1713, 1763, 1703, 1708, 1763, 1709, 1708, 1719, 1763, 1710, 1698, 1719, 1696, 1707, 1785, 1763, 1291, 1373, 1368, 1291, 3053, 3068, 3047, 2956, 3071, 3013, 3019, 3010, 3013, 3010, 3019, 2956, 3054, 3008, 3011, 3023, 3015, 2956, 3011, 3018, 3018, 3039, 3017, 3032, 2956, 3011, 3033, 3032, 2956, 3011, 3018, 2956, 3038, 3021, 3010, 3019, 3017, 2966, 2956, 996, 1013, 1006, 901, 1014, 972, 962, 971, 972, 971, 962, 901, 999, 969, 970, 966, 974, 901, 982, 972, 991, 960, 901, 970, 976, 977, 901, 970, 963, 901, 983, 964, 971, 962, 960, 927, 901, 2346, 2315, 2372, 2341, 2356, 2351, 2372, 2359, 2317, 2307, 2314, 2317, 2314, 2307, 2372, 2342, 2312, 2315, 2311, 2319, 2372, 2310, 2305, 2306, 2315, 2326, 2305, 2372, 2366, 2349, 2356, 2372, 2343, 2305, 2314, 2320, 2326, 2309, 2312, 2372, 2336, 2317, 2326, 2305, 2311, 2320, 2315, 2326, 2333, 1318, 1335, 1324, 1351, 1299, 1288, 1288, 1351, 1300, 1290, 1286, 1291, 1291, 1351, 1281, 1288, 1301, 1351, 1318, 1335, 1324, 1351, 1332, 1294, 1280, 1289, 1294, 1289, 1280, 1351, 1317, 1291, 1288, 1284, 1292, 1353, 1351, 1341, 1326, 1335, 1351, 1316, 1282, 1289, 1299, 1301, 1286, 1291, 1351, 1315, 1294, 1301, 1282, 1284, 1299, 1288, 1301, 1310, 1351, 1288, 1281, 1281, 1300, 1282, 1299, 1373, 1351, 2508, 2527, 2502, 2486, 2517, 2547, 2552, 2530, 2532, 2551, 2554, 2486, 2514, 2559, 2532, 2547, 2549, 2530, 2553, 2532, 2543, 2486, 2559, 2533, 2486, 2552, 2553, 2530, 2486, 2559, 2555, 2555, 2547, 2546, 2559, 2551, 2530, 2547, 2554, 2543, 2486, 2544, 2553, 2554, 2554, 2553, 2529, 2547, 2546, 2486, 2548, 2543, 2486, 2515, 2552, 2546, 2486, 2553, 2544, 2486, 2517, 2547, 2552, 2530, 2532, 2551, 2554, 2486, 2514, 2559, 2532, 2547, 2549, 2530, 2553, 2532, 2543, 2488, 2486, 2517, 2514, 2486, 2547, 2552, 2546, 2476, 2486, 3223, 3227, 3326, 3284, 3320, 3327, 3227, 3272, 3279, 3290, 3273, 3279, 3201, 3227, 319, 300, 309, 325, 294, 256, 267, 273, 279, 260, 265, 325, 289, 268, 279, 256, 262, 273, 266, 279, 284, 325, 266, 275, 256, 279, 265, 260, 277, 278, 325, 274, 268, 273, 269, 325, 288, 267, 257, 325, 266, 259, 325, 294, 256, 267, 273, 279, 260, 265, 325, 289, 268, 279, 256, 262, 273, 266, 279, 284, 331, 325, 294, 289, 325, 256, 267, 257, 351, 325, 1975, 1979, 2014, 2036, 2008, 2015, 1979, 2024, 2031, 2042, 2025, 2031, 1953, 1979, 1981, 1966, 1975, 1991, 1956, 1922, 1929, 1939, 1941, 1926, 1931, 1991, 1955, 1934, 1941, 1922, 1924, 1939, 1928, 1941, 1950, 1991, 1940, 1939, 1926, 1941, 1939, 1991, 1928, 1921, 1921, 1940, 1922, 1939, 1991, 1928, 1938, 1939, 1991, 1928, 1921, 1991, 1941, 1926, 1929, 1920, 1922, 2013, 1991, 2835, 2845, 2919, 2932, 2925, 2845, 2936, 2899, 2905, 2845, 2898, 2907, 2845, 2942, 2904, 2899, 2889, 2895, 2908, 2897, 2845, 2937, 2900, 2895, 2904, 2910, 2889, 2898, 2895, 2884, 2845, 2898, 2907, 2907, 2894, 2904, 2889, 2823, 2845, 2689, 2706, 2699, 2811, 2718, 2741, 2751, 2811, 2740, 2749, 2811, 2712, 2750, 2741, 2735, 2729, 2746, 2743, 2811, 2719, 2738, 2729, 2750, 2744, 2735, 2740, 2729, 2722, 2811, 2729, 2750, 2744, 2740, 2729, 2751, 2811, 2741, 2740, 2735, 2811, 2749, 2740, 2734, 2741, 2751};

    public static class ApkSigningBlock {
        public final long a;
        public final DataSource b;

        public DataSource getContents() {
            return C0019.m1254(this);
        }

        public long getStartOffset() {
            return C0026.m2324(this);
        }

        public ApkSigningBlock(long j, DataSource dataSource) {
            this.a = j;
            this.b = dataSource;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m600() {
        if (C0071.m6069() >= 0) {
            return f39short;
        }
        return null;
    }

    public static byte[] computeSha256DigestBytes(byte[] bArr) {
        try {
            MessageDigest messageDigestM2835 = C0030.m2835(C0068.m5544(m600(), 0, 7, 2136));
            C0063.m4423(messageDigestM2835, bArr);
            return C0033.m3355(messageDigestM2835);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(C0067.m5418(m600(), 7, 20, 434), e);
        }
    }

    public static ApkSigningBlock findApkSigningBlock(DataSource dataSource, ZipSections zipSections) throws ApkSigningBlockNotFoundException {
        long jM2922 = C0030.m2922(zipSections);
        long jM3871 = C0037.m3871(zipSections) + jM2922;
        long jM621 = C0016.m621(zipSections);
        if (jM3871 == jM621) {
            if (jM2922 >= 32) {
                ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, jM2922 - 24, 24);
                ByteOrder byteOrderM6217 = C0072.m6217();
                C0064.m4604(byteBufferM6568, byteOrderM6217);
                if (C0034.m3454(byteBufferM6568, 8) == 2334950737559900225L && C0034.m3454(byteBufferM6568, 16) == 3617552046287187010L) {
                    long jM3454 = C0034.m3454(byteBufferM6568, 0);
                    if (jM3454 >= C0074.m6516(byteBufferM6568) && jM3454 <= 2147483639) {
                        long j = (int) (8 + jM3454);
                        long j2 = jM2922 - j;
                        if (j2 >= 0) {
                            ByteBuffer byteBufferM65682 = C0074.m6568(dataSource, j2, 8);
                            C0064.m4604(byteBufferM65682, byteOrderM6217);
                            long jM34542 = C0034.m3454(byteBufferM65682, 0);
                            if (jM34542 == jM3454) {
                                return new ApkSigningBlock(j2, C0072.m6182(dataSource, j2, j));
                            }
                            StringBuilder sb = new StringBuilder(C0032.m3209(m600(), 27, 59, 1731));
                            C0078.m7466(sb, jM34542);
                            C0077.m7290(sb, C0071.m5991(m600(), 86, 4, 1323));
                            C0078.m7466(sb, jM3454);
                            throw new ApkSigningBlockNotFoundException(C0068.m5536(sb));
                        }
                        throw new ApkSigningBlockNotFoundException(C0039.m4094(j2, C0023.m1904(m600(), 90, 39, 2988)));
                    }
                    throw new ApkSigningBlockNotFoundException(C0039.m4094(jM3454, C0025.m2151(m600(), 129, 37, 933)));
                }
                throw new ApkSigningBlockNotFoundException(C0074.m6452(m600(), 166, 49, 2404));
            }
            throw new ApkSigningBlockNotFoundException(C0039.m4094(jM2922, C0066.m4828(m600(), 215, 67, 1383)));
        }
        StringBuilder sb2 = new StringBuilder(C0016.m625(m600(), 282, 87, 2454));
        C0078.m7466(sb2, jM3871);
        C0077.m7290(sb2, C0021.m1650(m600(), 369, 14, 3259));
        C0078.m7466(sb2, jM621);
        throw new ApkSigningBlockNotFoundException(C0068.m5536(sb2));
    }

    public static ZipSections findZipSections(DataSource dataSource) throws ZipFormatException {
        Pair pairM2500 = C0027.m2500(dataSource);
        if (pairM2500 != null) {
            ByteBuffer byteBuffer = (ByteBuffer) C0111.m13157(pairM2500);
            long jM704 = C0016.m704((Long) C0037.m3781(pairM2500));
            C0064.m4604(byteBuffer, C0072.m6217());
            long jM13106 = C0111.m13106(byteBuffer);
            if (jM13106 <= jM704) {
                long jM2946 = C0030.m2946(byteBuffer);
                long j = jM13106 + jM2946;
                if (j <= jM704) {
                    return new ZipSections(jM13106, jM2946, C0023.m1868(byteBuffer), jM704, byteBuffer);
                }
                StringBuilder sb = new StringBuilder(C0066.m4828(m600(), 383, 70, 357));
                C0078.m7466(sb, j);
                C0077.m7290(sb, C0070.m5942(m600(), 453, 14, 1947));
                C0078.m7466(sb, jM704);
                throw new ZipFormatException(C0068.m5536(sb));
            }
            StringBuilder sb2 = new StringBuilder(C0017.m936(m600(), 467, 49, 2023));
            C0078.m7466(sb2, jM13106);
            C0077.m7290(sb2, C0016.m625(m600(), 516, 39, 2877));
            C0078.m7466(sb2, jM704);
            throw new ZipFormatException(C0068.m5536(sb2));
        }
        throw new ZipFormatException(C0025.m2151(m600(), 555, 45, 2779));
    }
}
