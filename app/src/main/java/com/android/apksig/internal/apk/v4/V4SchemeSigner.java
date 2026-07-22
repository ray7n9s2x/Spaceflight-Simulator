package com.android.apksig.internal.apk.v4;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.android.apksig.zip.ZipFormatException;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V4SchemeSigner {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f74short = {908, 1006, 1012, 1003, 1018, 953, 955, 948, 948, 949, 942, 1018, 952, 959, 1018, 937, 947, 957, 948, 959, 958, 1018, 941, 947, 942, 946, 949, 943, 942, 1018, 955, 1018, 908, 1001, 1012, 1003, 1018, 953, 949, 948, 942, 959, 948, 942, 1018, 958, 947, 957, 959, 937, 942, 2853, 2846, 2841, 2819, 2842, 2834, 2902, 2841, 2840, 2842, 2831, 2902, 2836, 2835, 2902, 2841, 2840, 2835, 2902, 2821, 2847, 2833, 2840, 2839, 2818, 2819, 2820, 2835, 2902, 2833, 2835, 2840, 2835, 2820, 2839, 2818, 2835, 2834, 1403, 1344, 1351, 1373, 1348, 1356, 1288, 1351, 1350, 1348, 1361, 1288, 1344, 1353, 1374, 1357, 1288, 1351, 1350, 1357, 1288, 1355, 1357, 1370, 1372, 1345, 1358, 1345, 1355, 1353, 1372, 1357, 2460, 2493, 2546, 2481, 2487, 2464, 2470, 2491, 2484, 2491, 2481, 2483, 2470, 2487, 2465, 2546, 2481, 2493, 2492, 2484, 2491, 2485, 2471, 2464, 2487, 2486, 2546, 2484, 2493, 2464, 2546, 2465, 2491, 2485, 2492, 2487, 2464, 1313, 1296, 1283, 1282, 1304, 1311, 1302, 1361, 1303, 1296, 1304, 1309, 1300, 1301, 1355, 1361, 2356, 2319, 2312, 2322, 2315, 2307, 2375, 2312, 2313, 2315, 2334, 2375, 2319, 2310, 2321, 2306, 2375, 2312, 2313, 2306, 2375, 2324, 2318, 2304, 2313, 2306, 2325, 2379, 2375, 2306, 2325, 2325, 2312, 2325, 2324, 2397, 2375, 637, 602, 594, 599, 606, 607, 539, 591, 596, 539, 606, 579, 591, 585, 602, 600, 591, 539, 602, 597, 607, 539, 587, 602, 585, 584, 606, 539, 589, 521, 539, 601, 599, 596, 600, 592, 3069, 3034, 3010, 3029, 3032, 3037, 3024, 2964, 3042, 2951, 2964, 3015, 3031, 3036, 3025, 3033, 3025, 2964, 3012, 3014, 3035, 3010, 3037, 3024, 3025, 3024, 2958, 2964, 1493, 1508, 1527, 1526, 1516, 1515, 1506, 1445, 1507, 1508, 1516, 1513, 1504, 1505, 1471, 1445, 2578, 2601, 2606, 2612, 2605, 2597, 2657, 2606, 2607, 2605, 2616, 2657, 2601, 2592, 2615, 2596, 2657, 2606, 2607, 2596, 2657, 2610, 2600, 2598, 2607, 2596, 2611, 2669, 2657, 2596, 2611, 2611, 2606, 2611, 2610, 2683, 2657, 1708, 1675, 1667, 1670, 1679, 1678, 1738, 1694, 1669, 1738, 1679, 1682, 1694, 1688, 1675, 1673, 1694, 1738, 1675, 1668, 1678, 1738, 1690, 1675, 1688, 1689, 1679, 1738, 1692, 1753, 1738, 1672, 1670, 1669, 1673, 1665, 1410, 1445, 1453, 1448, 1441, 1440, 1508, 1456, 1451, 1508, 1442, 1453, 1450, 1440, 1508, 1445, 1508, 1463, 1457, 1460, 1460, 1451, 1462, 1456, 1441, 1440, 1508, 1440, 1453, 1443, 1441, 1463, 1456, 1508, 1453, 1450, 1508, 1456, 1452, 1441, 1508, 1463, 1451, 1457, 1462, 1447, 1441, 1508, 1413, 1428, 1423, 2703, 2740, 2739, 2729, 2736, 2744, 2812, 2740, 2749, 2730, 2745, 2812, 2749, 2728, 2812, 2736, 2745, 2749, 2735, 2728, 2812, 2739, 2738, 2745, 2812, 2744, 2741, 2747, 2745, 2735, 2728, 3023, 3061, 3067, 3058, 3065, 3054, 3004, 3066, 3069, 3061, 3056, 3065, 3064, 2080, 2055, 2079, 2056, 2053, ZipUtils.GP_FLAG_EFS, 2061, 2121, 2049, 2056, 2074, 2049, 2121, 2056, 2053, 2062, 2054, 2075, ZipUtils.GP_FLAG_EFS, 2077, 2049, 2052, 2117, 2121, 2054, 2055, 2053, 2064, 2121, 2106, 2081, 2088, 2139, 2116, 2139, 2140, 2143, 2121, 2054, 2079, 2060, 2075, 2121, 2141, 2121, 2082, 2091, 2121, 2058, 2049, 2076, 2055, 2050, 2074, 2121, 2074, 2076, 2073, 2073, 2054, 2075, 2077, 2060, 2061, 2119, 2570, 2605, 2597, 2592, 2601, 2600, 2668, 2616, 2595, 2668, 2595, 2606, 2616, 2605, 2597, 2594, 2668, 2618, 2686, 2659, 2618, 2687, 2668, 2600, 2597, 2603, 2601, 2623, 2616, 2656, 2668, 2618, 2687, 2668, 2601, 2612, 2607, 2601, 2620, 2616, 2597, 2595, 2594, 2678, 2668, 765, 753, 679, 739, 753, 692, 681, 690, 692, 673, 677, 696, 702, 703, 747, 753, 1301, 1337, 1332, 1342, 1335, 1322, 1333, 1341, 1340, 1400, 1305, 1288, 1299, 1378, 1400, 1334, 1335, 1324, 1400, 1337, 1400, 1282, 1297, 1288, 1400, 1337, 1322, 1339, 1328, 1329, 1326, 1341};

    public static V4Signature a(SignerConfig signerConfig, V4Signature.HashingInfo hashingInfo, HashMap map, long j) {
        V4Signature.SigningInfos signingInfos;
        Integer numM1548 = C0021.m1548(3);
        V4Signature.SigningInfo signingInfoM5503 = C0067.m5503(C0021.m1611(signerConfig), hashingInfo, C0111.m13072(map, numM1548) ? (byte[]) C0067.m5420(map, numM1548) : (byte[]) C0067.m5420(map, C0021.m1548(2)), j);
        if (C0023.m1874(signerConfig) == null) {
            signingInfos = new V4Signature.SigningInfos(signingInfoM5503);
        } else {
            if (!C0111.m13072(map, C0021.m1548(31))) {
                throw new IllegalStateException(C0031.m3047(m1169(), 0, 51, 986));
            }
            signingInfos = new V4Signature.SigningInfos(signingInfoM5503, new V4Signature.SigningInfoBlock(462663009, C0065.m4788(C0067.m5503(C0023.m1874(signerConfig), hashingInfo, (byte[]) C0067.m5420(map, C0021.m1548(31)), j))));
        }
        return new V4Signature(2, C0065.m4699(hashingInfo), C0020.m1376(signingInfos));
    }

    public static V4Signature.SigningInfo b(ApkSigningBlockUtils.SignerConfig signerConfig, V4Signature.HashingInfo hashingInfo, byte[] bArr, long j) throws SignatureException, CertificateEncodingException {
        if (C0025.m2084(C0066.m4892(signerConfig))) {
            throw new SignatureException(C0016.m625(m1169(), 121, 37, 2514));
        }
        if (C0034.m3427(C0066.m4892(signerConfig)) != 1) {
            throw new CertificateEncodingException(C0017.m936(m1169(), 89, 32, 1320));
        }
        PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0));
        byte[] bArr2 = (byte[]) C0071.m6078(C0023.m1918(C0066.m4892(signerConfig)), 0);
        List listM5550 = C0068.m5550(signerConfig, C0020.m1456(j, hashingInfo, new V4Signature.SigningInfo(bArr, bArr2, null, C0025.m2096(publicKeyM6845), -1, null)));
        if (C0034.m3427(listM5550) != 1) {
            throw new SignatureException(C0039.m4066(m1169(), 51, 38, 2934));
        }
        return new V4Signature.SigningInfo(bArr, bArr2, null, C0025.m2096(publicKeyM6845), C0025.m2170((Integer) C0111.m13157((Pair) C0071.m6078(listM5550, 0))), (byte[]) C0037.m3781((Pair) C0071.m6078(listM5550, 0)));
    }

    public static void generateV4Signature(DataSource dataSource, SignerConfig signerConfig, File file) throws IOException {
        Pair pairM832 = C0017.m832(dataSource, signerConfig);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C0111.m13186((V4Signature) C0111.m13157(pairM832), fileOutputStream);
                C0067.m5484(fileOutputStream, (byte[]) C0037.m3781(pairM832));
                C0075.m6780(fileOutputStream);
            } finally {
            }
        } catch (IOException e) {
            C0032.m3207(file);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int[] m1168() {
        if (C0026.m2298() < 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1169() {
        if (C0025.m2132() >= 0) {
            return f74short;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v4.V4SchemeSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;

        /* JADX INFO: renamed from: ۤۧۢ, reason: not valid java name and contains not printable characters */
        public static int[] m1170() {
            if (C0037.m3837() <= 0) {
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
                m1170()[C0030.m2893(C0018.m997())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m1170()[C0030.m2893(C0063.m4405())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class SignerConfig {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f75short = {2299, 2266, 2264, 2253, 2196, 2261, 2263, 2263, 2257, 2244, 2240, 2269, 2266, 2259, 2196, 2267, 2266, 2257, 2196, 2247, 2269, 2259, 2266, 2257, 2246, 2196, 2263, 2267, 2266, 2258, 2269, 2259, 2196, 2258, 2267, 2246, 2196, 2274, 2176, 2202, 2181, 2196, 2279, 2269, 2259, 2266, 2261, 2240, 2241, 2246, 2257, 2202, 515, 546, 544, 565, 620, 557, 559, 559, 553, 572, 568, 549, 546, 555, 620, 547, 546, 553, 620, 575, 549, 555, 546, 553, 574, 620, 559, 547, 546, 554, 549, 555, 620, 554, 547, 574, 620, 538, 632, 620, 543, 549, 555, 546, 557, 568, 569, 574, 553, 610};
        public final ApkSigningBlockUtils.SignerConfig v41Config;
        public final ApkSigningBlockUtils.SignerConfig v4Config;

        /* JADX INFO: renamed from: ۢۡۥ۠, reason: not valid java name and contains not printable characters */
        public static short[] m1171() {
            if (C0063.m4427() >= 0) {
                return f75short;
            }
            return null;
        }

        public SignerConfig(List<ApkSigningBlockUtils.SignerConfig> list, List<ApkSigningBlockUtils.SignerConfig> list2) throws InvalidKeyException {
            ApkSigningBlockUtils.SignerConfig signerConfig;
            if (list != null && C0034.m3427(list) == 1) {
                if (list2 != null && C0034.m3427(list2) != 1) {
                    throw new InvalidKeyException(C0063.m4315(m1171(), 0, 52, 2228));
                }
                this.v4Config = (ApkSigningBlockUtils.SignerConfig) C0071.m6078(list, 0);
                if (list2 != null) {
                    signerConfig = (ApkSigningBlockUtils.SignerConfig) C0071.m6078(list2, 0);
                } else {
                    signerConfig = null;
                }
                this.v41Config = signerConfig;
                return;
            }
            throw new InvalidKeyException(C0111.m13097(m1171(), 52, 50, 588));
        }
    }

    public static byte[] c(DataSource dataSource, ApkUtils.ZipSections zipSections) throws SignatureException {
        HashSet hashSet = new HashSet(1);
        HashSet hashSet2 = new HashSet(1);
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(2);
        try {
            C0075.m6811(C0067.m5410(C0019.m1188(dataSource, zipSections, 1896449818, result)), hashSet, C0070.m5897(), hashSet2, Integer.MAX_VALUE, Integer.MAX_VALUE, result);
            if (C0034.m3427(C0021.m1543(result)) != 1) {
                StringBuilder sb = new StringBuilder(C0033.m3330(m1169(), 174, 37, 2407));
                C0036.m3741(sb, C0039.m4126(result));
                throw new SignatureException(C0068.m5536(sb));
            }
            ApkSigningBlockUtils.Result.SignerInfo signerInfo = (ApkSigningBlockUtils.Result.SignerInfo) C0071.m6078(C0021.m1543(result), 0);
            if (!C0032.m3125(signerInfo)) {
                return C0037.m3847(C0023.m1795(signerInfo));
            }
            StringBuilder sb2 = new StringBuilder(C0021.m1650(m1169(), 158, 16, 1393));
            C0036.m3741(sb2, C0111.m13133(signerInfo));
            throw new SignatureException(C0068.m5536(sb2));
        } catch (Exception e) {
            throw new SignatureException(C0016.m625(m1169(), 211, 36, 571), e);
        }
    }

    public static byte[] d(DataSource dataSource, ApkUtils.ZipSections zipSections, int i) throws SignatureException {
        int i2;
        HashSet hashSet = new HashSet(1);
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(i);
        if (i == 3) {
            i2 = -262969152;
        } else {
            if (i != 31) {
                throw new IllegalArgumentException(C0071.m6038(i, C0032.m3209(m1169(), 247, 28, 2996)));
            }
            i2 = 462663009;
        }
        try {
            C0034.m3487(C0067.m5410(C0019.m1188(dataSource, zipSections, i2, result)), hashSet, result);
            if (C0034.m3427(C0021.m1543(result)) != 1) {
                StringBuilder sb = new StringBuilder(C0038.m4022(m1169(), 291, 37, 2625));
                C0036.m3741(sb, C0039.m4126(result));
                throw new SignatureException(C0068.m5536(sb));
            }
            ApkSigningBlockUtils.Result.SignerInfo signerInfo = (ApkSigningBlockUtils.Result.SignerInfo) C0071.m6078(C0021.m1543(result), 0);
            if (!C0032.m3125(signerInfo)) {
                return C0037.m3847(C0023.m1795((ApkSigningBlockUtils.Result.SignerInfo) C0071.m6078(C0021.m1543(result), 0)));
            }
            StringBuilder sb2 = new StringBuilder(C0024.m1945(m1169(), 275, 16, 1413));
            C0036.m3741(sb2, C0111.m13133(signerInfo));
            throw new SignatureException(C0068.m5536(sb2));
        } catch (Exception e) {
            throw new SignatureException(C0067.m5418(m1169(), 328, 36, 1770), e);
        }
    }

    public static int digestAlgorithmSortingOrder(ContentDigestAlgorithm contentDigestAlgorithm) {
        int i = m1168()[C0030.m2893(contentDigestAlgorithm)];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? -1 : 2;
        }
        return 1;
    }

    public static byte[] e(List list) throws SignatureException {
        if (list == null || C0025.m2084(list)) {
            throw new SignatureException(C0033.m3330(m1169(), 415, 31, 2780));
        }
        Iterator itM4732 = C0065.m4732(list);
        int i = -1;
        byte[] bArrM3823 = null;
        while (C0036.m3657(itM4732)) {
            ApkSigningBlockUtils.Result.SignerInfo.ContentDigest contentDigest = (ApkSigningBlockUtils.Result.SignerInfo.ContentDigest) C0071.m6012(itM4732);
            ContentDigestAlgorithm contentDigestAlgorithmM2948 = C0030.m2948(C0063.m4321(C0026.m2274(contentDigest)));
            if (contentDigestAlgorithmM2948 != null && (contentDigestAlgorithmM2948 == C0067.m5499() || contentDigestAlgorithmM2948 == C0063.m4405() || contentDigestAlgorithmM2948 == C0018.m997())) {
                int iM3667 = C0036.m3667(contentDigestAlgorithmM2948);
                if (i < iM3667) {
                    bArrM3823 = C0037.m3823(contentDigest);
                    i = iM3667;
                }
            }
        }
        if (bArrM3823 != null) {
            return bArrM3823;
        }
        throw new SignatureException(C0074.m6452(m1169(), 364, 51, 1476));
    }

    public static List<SignatureAlgorithm> getSuggestedSignatureAlgorithms(PublicKey publicKey, int i, boolean z, boolean z2) {
        List<SignatureAlgorithm> listM4014 = C0038.m4014(publicKey, i, z, z2);
        ListIterator listIteratorM1062 = C0018.m1062(listM4014);
        while (C0036.m3657(listIteratorM1062)) {
            ContentDigestAlgorithm contentDigestAlgorithmM2948 = C0030.m2948((SignatureAlgorithm) C0071.m6012(listIteratorM1062));
            if (contentDigestAlgorithmM2948 == null || (contentDigestAlgorithmM2948 != C0067.m5499() && contentDigestAlgorithmM2948 != C0063.m4405())) {
                C0025.m2085(listIteratorM1062);
            }
        }
        return listM4014;
    }

    public static Pair<V4Signature, byte[]> generateV4Signature(DataSource dataSource, SignerConfig signerConfig) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        long jM6146 = C0072.m6146(dataSource);
        try {
            ApkUtils.ZipSections zipSectionsM3656 = C0036.m3656(dataSource);
            HashMap map = new HashMap(1);
            try {
                C0038.m3969(map, C0021.m1548(31), C0063.m4424(dataSource, zipSectionsM3656, 31));
            } catch (SignatureException unused) {
            }
            try {
                C0038.m3969(map, C0021.m1548(3), C0063.m4424(dataSource, zipSectionsM3656, 3));
                e = null;
            } catch (SignatureException e) {
                e = e;
            }
            try {
                C0038.m3969(map, C0021.m1548(2), C0078.m7369(dataSource, zipSectionsM3656));
                e = null;
            } catch (SignatureException e2) {
                e = e2;
            }
            if (C0037.m3811(map) > 0) {
                ApkSigningBlockUtils.VerityTreeAndDigest verityTreeAndDigestM1257 = C0019.m1257(dataSource);
                ContentDigestAlgorithm contentDigestAlgorithmM6186 = C0072.m6186(verityTreeAndDigestM1257);
                byte[] bArrM1940 = C0024.m1940(verityTreeAndDigestM1257);
                byte[] bArrM7339 = C0078.m7339(verityTreeAndDigestM1257);
                if (m1168()[C0030.m2893(contentDigestAlgorithmM6186)] == 2) {
                    Pair pairM2158 = C0025.m2158(C0021.m1548(1), C0111.m13179((byte) 12));
                    try {
                        return C0025.m2158(C0033.m3364(signerConfig, new V4Signature.HashingInfo(C0025.m2170((Integer) C0111.m13157(pairM2158)), C0068.m5625((Byte) C0037.m3781(pairM2158)), null, bArrM1940), map, jM6146), bArrM7339);
                    } catch (InvalidKeyException | SignatureException | CertificateEncodingException e3) {
                        throw new InvalidKeyException(C0034.m3431(m1169(), 446, 13, 2972), e3);
                    }
                }
                throw new NoSuchAlgorithmException(C0069.m5807(m1169(), 459, 65, 2153));
            }
            StringBuilder sb = new StringBuilder(C0074.m6452(m1169(), 524, 45, 2636));
            C0036.m3741(sb, e);
            C0077.m7290(sb, C0037.m3829(m1169(), 569, 16, 721));
            C0036.m3741(sb, e);
            throw new IOException(C0068.m5536(sb));
        } catch (ZipFormatException e4) {
            throw new IOException(C0037.m3829(m1169(), 585, 32, 1368), e4);
        }
    }
}
