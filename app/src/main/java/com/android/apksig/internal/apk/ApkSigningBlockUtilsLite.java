package com.android.apksig.internal.apk;

import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkSigningBlockNotFoundException;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipSections;
import com.google.common.base.Ascii;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0455v;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigningBlockUtilsLite {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f48short = {1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945, 1985, 1986, 1987, 1988, 1989, 1990, 1034, 1040, 1027, 1052, 1091, 1113, 955, 896, 909, 924, 955, 908, 927, 927, 924, 907, 985, 923, 896, 909, 924, 985, 918, 907, 925, 924, 907, 985, 916, 908, 906, 909, 985, 923, 924, 985, 917, 912, 909, 909, 917, 924, 985, 924, 919, 925, 912, 920, 919, 1633, 1626, 1631, 1626, 1627, 1603, 1626, 1556, 1621, 1624, 1619, 1542, 1550, 1556, 1487, 1524, 1521, 1524, 1525, 1517, 1524, 1466, 1531, 1526, 1533, 1451, 1440, 1466, 3017, 2970, 2944, 2963, 2956, 3017, 2950, 2972, 2973, 3017, 2950, 2959, 3017, 2971, 2952, 2951, 2958, 2956, 3027, 3017, 2295, 2278, 2301, 2198, 2277, 2271, 2257, 2264, 2271, 2264, 2257, 2198, 2292, 2266, 2265, 2261, 2269, 2198, 2259, 2264, 2242, 2244, 2255, 2198, 2197, 3025, 3037, 2972, 2955, 2972, 2964, 2961, 2972, 2975, 2961, 2968, 3015, 3037, 1584, 1559, 1546, 1548, 1567, 1567, 1552, 1562, 1552, 1564, 1559, 1549, 1625, 1565, 1560, 1549, 1560, 1625, 1549, 1558, 1625, 1547, 1564, 1560, 1565, 1625, 1546, 1552, 1539, 1564, 1625, 1558, 1567, 1625, 1592, 1577, 1586, 1625, 1578, 1552, 1566, 1559, 1552, 1559, 1566, 1625, 1595, 1557, 1558, 1562, 1554, 1625, 1564, 1559, 1549, 1547, 1536, 1625, 1626, 2555, 2522, 2453, 2548, 2533, 2558, 2453, 2534, 2524, 2514, 2523, 2516, 2497, 2496, 2503, 2512, 2453, 2534, 2518, 2525, 2512, 2520, 2512, 2453, 2519, 2521, 2522, 2518, 2526, 2453, 2524, 2523, 2453, 2548, 2533, 2558, 2453, 2534, 2524, 2514, 2523, 2524, 2523, 2514, 2453, 2551, 2521, 2522, 2518, 2526, 2453, 2498, 2524, 2497, 2525, 2453, 2556, 2545, 2447, 2453, 2263, 2268, 2262, 2194, 2188, 2194, 2257, 2259, 2242, 2259, 2257, 2267, 2246, 2251, 2184, 2194, 321, 351, 321, 1969, 1978, 1968, 2036, 2024, 2036, 1959, 1952, 1973, 1958, 1952, 2030, 2036, 2211, 2239, 2211, 2235, 2901, 2940, 2935, 2942, 2925, 2929, 2868, 2921, 2923, 2940, 2943, 2928, 2913, 2940, 2941, 2873, 2943, 2928, 2940, 2933, 2941, 2873, 2933, 2934, 2935, 2942, 2940, 2923, 2873, 2925, 2929, 2936, 2935, 2873, 2923, 2940, 2932, 2936, 2928, 2935, 2928, 2935, 2942, 2873, 2939, 2924, 2943, 2943, 2940, 2923, 2871, 2873, 2911, 2928, 2940, 2933, 2941, 2873, 2933, 2940, 2935, 2942, 2925, 2929, 2851, 2873, 2923, 2919, 2869, 2850, 2858, 2854, 2862, 2857, 2862, 2857, 2848, 2941, 2919, 3144, 3171, 3169, 3175, 3186, 3183, 3184, 3171, 3110, 3178, 3171, 3176, 3169, 3186, 3182, 2434, 2485, 2493, 2481, 2489, 2494, 2489, 2494, 2487, 2544, 2482, 2469, 2486, 2486, 2485, 2466, 2544, 2468, 2495, 2495, 2544, 2467, 2488, 2495, 2466, 2468, 2544, 2468, 2495, 2544, 2483, 2495, 2494, 2468, 2481, 2489, 2494, 2544, 2492, 2485, 2494, 2487, 2468, 2488, 2544, 2495, 2486, 2544, 2492, 2485, 2494, 2487, 2468, 2488, 2557, 2464, 2466, 2485, 2486, 2489, 2472, 2485, 2484, 2544, 2486, 2489, 2485, 2492, 2484, 2558, 2544, 2434, 2485, 2493, 2481, 2489, 2494, 2489, 2494, 2487, 2538, 2544, 2608, 2577, 2654, 2573, 2571, 2574, 2574, 2577, 2572, 2570, 2587, 2586, 2654, 2573, 2583, 2585, 2576, 2591, 2570, 2571, 2572, 2587, 565, 529, 534, 529, 533, 525, 533, 600, 520, 522, 535, 526, 529, 540, 541, 540, 600, 523, 529, 543, 534, 537, 524, 525, 522, 541, 600, 526, 541, 522, 523, 529, 535, 534, 600, 3257, 3239, 3257, 3316, 3312, 3319, 3274, 3325, 3314, 3279, 3324, 3307, 3306, 3312, 3318, 3319, 3257, 714, 753, 763, 762, 749, 761, 755, 752, 744, 703, 744, 759, 758, 755, 762, 703, 749, 762, 766, 763, 758, 753, 760, 703, 755, 762, 753, 760, 747, 759, 690, 751, 749, 762, 761, 758, 743, 762, 763, 703, 745, 766, 755, 746, 762, 689, 703, 723, 762, 753, 760, 747, 759, 677, 703, 515, 527, 590, 601, 590, 582, 579, 590, 589, 579, 586, 533, 527, 276, 319, 317, 315, 302, 307, 300, 319, 378, 310, 319, 308, 317, 302, 306};
    public static final char[] a = C0031.m2984(C0016.m625(m798(), 0, 16, 1952));

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i, int i2) {
        return C0035.m3636(list, i, i2, false);
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static int[] m797() {
        if (C0020.m1385() <= 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m798() {
        if (C0018.m1064() >= 0) {
            return f48short;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.ApkSigningBlockUtilsLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;

        /* JADX INFO: renamed from: ۣ۟ۦۨۤ, reason: not valid java name and contains not printable characters */
        public static int[] m799() {
            if (C0021.m1598() <= 0) {
                return $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0065.m4668().length];
            $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm = iArr;
            try {
                iArr[C0030.m2893(C0067.m5499())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m799()[C0030.m2893(C0063.m4405())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m799()[C0030.m2893(C0018.m997())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C0071.m6038(i, C0111.m13097(m798(), 16, 6, 1145)));
        }
        int iM6818 = C0075.m6818(byteBuffer);
        int iM3629 = C0035.m3629(byteBuffer);
        int i2 = i + iM3629;
        if (i2 < iM3629 || i2 > iM6818) {
            throw new BufferUnderflowException();
        }
        C0034.m3392(byteBuffer, i2);
        try {
            ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
            C0064.m4604(byteBufferM6043, C0033.m3275(byteBuffer));
            C0037.m3886(byteBuffer, i2);
            return byteBufferM6043;
        } finally {
            C0034.m3392(byteBuffer, iM6818);
        }
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i, int i2, boolean z) throws NoApkSupportedSignaturesException {
        HashMap map = new HashMap();
        Iterator itM4732 = C0065.m4732(list);
        int i3 = Integer.MAX_VALUE;
        while (C0036.m3657(itM4732)) {
            ApkSupportedSignature apkSupportedSignature = (ApkSupportedSignature) C0071.m6012(itM4732);
            SignatureAlgorithm signatureAlgorithmM3131 = C0032.m3131(apkSupportedSignature);
            int iM1833 = z ? C0023.m1833(signatureAlgorithmM3131) : C0071.m6026(signatureAlgorithmM3131);
            if (iM1833 <= i2) {
                if (iM1833 < i3) {
                    i3 = iM1833;
                }
                ApkSupportedSignature apkSupportedSignature2 = (ApkSupportedSignature) C0067.m5420(map, C0021.m1548(iM1833));
                if (apkSupportedSignature2 == null || C0063.m4323(signatureAlgorithmM3131, C0032.m3131(apkSupportedSignature2)) > 0) {
                    C0038.m3969(map, C0021.m1548(iM1833), apkSupportedSignature);
                }
            }
        }
        if (i >= i3) {
            if (C0035.m3592(map)) {
                throw new NoApkSupportedSignaturesException(C0078.m7427(m798(), 482, 22, 2686));
            }
            ArrayList arrayList = new ArrayList(C0020.m1411(map));
            C0039.m4063(arrayList, new C0455v(0));
            return arrayList;
        }
        StringBuilder sb = new StringBuilder(C0035.m3603(m798(), 504, 35, 632));
        C0021.m1551(sb, i3);
        C0077.m7290(sb, C0032.m3209(m798(), 539, 17, 3225));
        C0021.m1551(sb, i);
        throw new NoApkSupportedSignaturesException(C0068.m5536(sb));
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = (b & 255) >>> 4;
            int i2 = b & Ascii.SI;
            char[] cArrM5796 = C0069.m5796();
            C0077.m7289(sb, cArrM5796[i]);
            C0077.m7289(sb, cArrM5796[i2]);
        }
        return C0068.m5536(sb);
    }

    public static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (C0033.m3275(byteBuffer) == C0072.m6217()) {
        } else {
            throw new IllegalArgumentException(C0067.m5418(m798(), 22, 43, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW));
        }
    }

    public static int compareSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2) {
        ContentDigestAlgorithm contentDigestAlgorithmM2948 = C0030.m2948(signatureAlgorithm);
        ContentDigestAlgorithm contentDigestAlgorithmM29482 = C0030.m2948(signatureAlgorithm2);
        int[] iArrM797 = m797();
        int i = iArrM797[C0030.m2893(contentDigestAlgorithmM2948)];
        String strM1443 = C0020.m1443(m798(), 65, 14, 1588);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int i2 = iArrM797[C0030.m2893(contentDigestAlgorithmM29482)];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return -1;
                        }
                        if (i2 != 3) {
                            StringBuilder sb = new StringBuilder(strM1443);
                            C0036.m3741(sb, contentDigestAlgorithmM29482);
                            throw new IllegalArgumentException(C0068.m5536(sb));
                        }
                    }
                    return 1;
                }
                StringBuilder sb2 = new StringBuilder(C0039.m4066(m798(), 79, 14, 1434));
                C0036.m3741(sb2, contentDigestAlgorithmM2948);
                throw new IllegalArgumentException(C0068.m5536(sb2));
            }
            int i3 = iArrM797[C0030.m2893(contentDigestAlgorithmM29482)];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        StringBuilder sb3 = new StringBuilder(strM1443);
                        C0036.m3741(sb3, contentDigestAlgorithmM29482);
                        throw new IllegalArgumentException(C0068.m5536(sb3));
                    }
                }
            }
            return 1;
        }
        int i4 = iArrM797[C0030.m2893(contentDigestAlgorithmM29482)];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                return -1;
            }
            StringBuilder sb4 = new StringBuilder(strM1443);
            C0036.m3741(sb4, contentDigestAlgorithmM29482);
            throw new IllegalArgumentException(C0068.m5536(sb4));
        }
        return 0;
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(List<Pair<Integer, byte[]>> list) {
        Iterator itM4732 = C0065.m4732(list);
        int length = 0;
        while (C0036.m3657(itM4732)) {
            length += ((byte[]) C0037.m3781((Pair) C0071.m6012(itM4732))).length + 12;
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(length);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        Iterator itM47322 = C0065.m4732(list);
        while (C0036.m3657(itM47322)) {
            Pair pair = (Pair) C0071.m6012(itM47322);
            byte[] bArr = (byte[]) C0037.m3781(pair);
            C0038.m4018(byteBufferM3516, bArr.length + 8);
            C0038.m4018(byteBufferM3516, C0025.m2170((Integer) C0111.m13157(pair)));
            C0038.m4018(byteBufferM3516, bArr.length);
            C0068.m5569(byteBufferM3516, bArr);
        }
        return C0027.m2445(byteBufferM3516);
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer byteBuffer, int i) throws SignatureNotFoundException {
        C0074.m6567(byteBuffer);
        int iM6516 = C0074.m6516(byteBuffer) - 24;
        if (iM6516 >= 8) {
            int iM65162 = C0074.m6516(byteBuffer);
            if (iM6516 <= C0074.m6516(byteBuffer)) {
                int iM6818 = C0075.m6818(byteBuffer);
                int iM3629 = C0035.m3629(byteBuffer);
                int i2 = 0;
                try {
                    C0037.m3886(byteBuffer, 0);
                    C0034.m3392(byteBuffer, iM6516);
                    C0037.m3886(byteBuffer, 8);
                    ByteBuffer byteBufferM6043 = C0071.m6043(byteBuffer);
                    C0064.m4604(byteBufferM6043, C0033.m3275(byteBuffer));
                    while (C0111.m13127(byteBufferM6043)) {
                        i2++;
                        if (C0071.m5984(byteBufferM6043) >= 8) {
                            long jM2869 = C0030.m2869(byteBufferM6043);
                            String strM4066 = C0039.m4066(m798(), 93, 20, 3049);
                            String strM3431 = C0034.m3431(m798(), 113, 25, 2230);
                            if (jM2869 >= 4 && jM2869 <= 2147483647L) {
                                int i3 = (int) jM2869;
                                int iM36292 = C0035.m3629(byteBufferM6043) + i3;
                                if (i3 <= C0071.m5984(byteBufferM6043)) {
                                    if (C0064.m4566(byteBufferM6043) == i) {
                                        return C0026.m2264(byteBufferM6043, i3 - 4);
                                    }
                                    C0037.m3886(byteBufferM6043, iM36292);
                                } else {
                                    StringBuilder sb = new StringBuilder(strM3431);
                                    C0021.m1551(sb, i2);
                                    C0077.m7290(sb, strM4066);
                                    C0021.m1551(sb, i3);
                                    C0077.m7290(sb, C0072.m6116(m798(), 138, 13, 3069));
                                    C0021.m1551(sb, C0071.m5984(byteBufferM6043));
                                    throw new SignatureNotFoundException(C0068.m5536(sb));
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder(strM3431);
                                C0021.m1551(sb2, i2);
                                C0077.m7290(sb2, strM4066);
                                C0078.m7466(sb2, jM2869);
                                throw new SignatureNotFoundException(C0068.m5536(sb2));
                            }
                        } else {
                            throw new SignatureNotFoundException(C0071.m6038(i2, C0070.m5942(m798(), 151, 59, 1657)));
                        }
                    }
                    throw new SignatureNotFoundException(C0071.m6038(i, C0078.m7427(m798(), 210, 60, 2485)));
                } finally {
                    C0037.m3886(byteBuffer, 0);
                    C0034.m3392(byteBuffer, iM6818);
                    C0037.m3886(byteBuffer, iM3629);
                }
            }
            StringBuilder sb3 = new StringBuilder(C0067.m5418(m798(), 270, 16, 2226));
            C0021.m1551(sb3, iM6516);
            C0077.m7290(sb3, C0067.m5418(m798(), 286, 3, 353));
            C0021.m1551(sb3, iM65162);
            throw new IllegalArgumentException(C0068.m5536(sb3));
        }
        throw new IllegalArgumentException(C0025.m2086(C0023.m1904(m798(), 289, 13, 2004), iM6516, C0037.m3829(m798(), 302, 4, 2179)));
    }

    public static SignatureInfo findSignature(DataSource dataSource, ZipSections zipSections, int i) throws SignatureNotFoundException {
        try {
            ApkUtilsLite.ApkSigningBlock apkSigningBlockM1360 = C0020.m1360(dataSource, zipSections);
            long jM2367 = C0026.m2367(apkSigningBlockM1360);
            DataSource dataSourceM2860 = C0030.m2860(apkSigningBlockM1360);
            ByteBuffer byteBufferM6568 = C0074.m6568(dataSourceM2860, 0L, (int) C0072.m6146(dataSourceM2860));
            C0064.m4604(byteBufferM6568, C0072.m6217());
            return new SignatureInfo(C0074.m6443(byteBufferM6568, i), jM2367, C0030.m2922(zipSections), C0016.m621(zipSections), C0070.m5867(zipSections));
        } catch (ApkSigningBlockNotFoundException e) {
            throw new SignatureNotFoundException(C0033.m3375(e), e);
        }
    }

    public static ByteBuffer getLengthPrefixedSlice(ByteBuffer byteBuffer) throws ApkFormatException {
        if (C0071.m5984(byteBuffer) >= 4) {
            int iM4566 = C0064.m4566(byteBuffer);
            if (iM4566 >= 0) {
                if (iM4566 <= C0071.m5984(byteBuffer)) {
                    return C0026.m2264(byteBuffer, iM4566);
                }
                StringBuilder sb = new StringBuilder(C0111.m13097(m798(), 306, 66, 2841));
                C0021.m1551(sb, iM4566);
                C0077.m7290(sb, C0029.m2695(m798(), 372, 13, 2887));
                C0021.m1551(sb, C0071.m5984(byteBuffer));
                throw new ApkFormatException(C0068.m5536(sb));
            }
            throw new IllegalArgumentException(C0065.m4757(m798(), 385, 15, 3078));
        }
        StringBuilder sb2 = new StringBuilder(C0027.m2404(m798(), 400, 82, 2512));
        C0021.m1551(sb2, C0071.m5984(byteBuffer));
        throw new ApkFormatException(C0068.m5536(sb2));
    }

    public static byte[] readLengthPrefixedByteArray(ByteBuffer byteBuffer) throws ApkFormatException {
        int iM4566 = C0064.m4566(byteBuffer);
        if (iM4566 >= 0) {
            if (iM4566 <= C0071.m5984(byteBuffer)) {
                byte[] bArr = new byte[iM4566];
                C0029.m2812(byteBuffer, bArr);
                return bArr;
            }
            StringBuilder sb = new StringBuilder(C0070.m5942(m798(), 556, 55, 671));
            C0021.m1551(sb, iM4566);
            C0077.m7290(sb, C0032.m3209(m798(), 611, 13, 559));
            C0021.m1551(sb, C0071.m5984(byteBuffer));
            throw new ApkFormatException(C0068.m5536(sb));
        }
        throw new ApkFormatException(C0064.m4545(m798(), 624, 15, 346));
    }
}
