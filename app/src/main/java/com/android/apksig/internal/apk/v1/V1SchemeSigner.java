package com.android.apksig.internal.apk.v1;

import androidx.credentials.CredentialOption;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.KeyConfig;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import j$.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1SchemeSigner {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f63short = {592, 600, 585, 604, 560, 596, 595, 603, 562, 592, 604, 595, 596, 603, 600, 590, 585, 563, 592, 603, 1518, 1503, 1480, 1484, 1497, 1480, 1481, 1408, 1519, 1492, 3229, 3304, 3204, 3243, 3233, 3255, 3242, 3244, 3233, 3304, 3204, 3221, 3214, 3304, 3222, 3244, 3234, 3243, 3232, 3233, 2446, 2473, 2465, 2468, 2477, 2476, 2536, 2492, 2471, 2536, 2491, 2465, 2479, 2470, 2536, 2493, 2491, 2465, 2470, 2479, 2536, 1780, 1703, 1725, 1715, 1722, 1717, 1696, 1697, 1702, 1713, 1780, 1697, 1703, 1725, 1722, 1715, 1780, 1700, 1697, 1718, 1720, 1725, 1719, 1780, 1727, 1713, 1709, 1780, 1714, 1702, 1723, 1721, 1780, 1719, 1713, 1702, 1696, 1725, 1714, 1725, 1719, 1717, 1696, 1713, 3057, 3030, 3038, 3035, 3026, 3027, 2967, 3011, 3032, 2967, 3009, 3026, 3013, 3038, 3025, 3022, 2967, 3024, 3026, 3033, 3026, 3013, 3030, 3011, 3026, 3027, 2967, 3161, 3198, 3190, 3187, 3194, 3195, 3135, 3179, 3184, 3135, 3194, 3185, 3196, 3184, 3195, 3194, 3135, 3180, 3190, 3192, 3185, 3198, 3179, 3178, 3181, 3194, 3135, 3197, 3187, 3184, 3196, 3188, 521, 563, 573, 564, 571, 558, 559, 552, 575, 634, 574, 563, 574, 634, 564, 565, 558, 634, 556, 575, 552, 563, 572, 547, 575, 548, 557, 577, 606, 601, 602, 577, 552, 517, 523, 521, 543, 536, 2314, 2353, 2362, 2343, 2351, 2362, 2364, 2347, 2362, 2363, 2431, 2364, 2352, 2353, 2347, 2362, 2353, 2347, 2431, 2363, 2358, 2360, 2362, 2348, 2347, 2431, 2366, 2355, 2360, 2352, 2349, 2358, 2347, 2359, 2354, 2405, 2431, 2253, 2262, 2271, 2223, 2227, 2266, 2295, 2297, 2299, 2285, 2282, 2123, 2156, 2148, 2145, 2152, 2153, 2093, 2169, 2146, 2093, 2170, 2175, 2148, 2169, 2152, 2093, 2148, 2147, 2080, 2144, 2152, 2144, 2146, 2175, 2164, 2093, 2112, 2124, 2115, 2116, 2123, 2120, 2142, 2137, 2083, 2112, 2123, 436, 408, 405, 415, 406, 395, 404, 412, 413, 473, 394, 406, 396, 395, 410, 412, 473, 436, 444, 429, 440, 468, 432, 439, 447, 470, 436, 440, 439, 432, 447, 444, 426, 429, 471, 436, 447, 495, 496, 494, 1380, 1375, 1346, 1348, 1345, 1345, 1374, 1347, 1349, 1364, 1365, 1297, 1362, 1369, 1360, 1347, 1360, 1362, 1349, 1364, 1347, 1297, 1281, 1353, 1300, 1280, 1301, 1281, 1283, 1353, 1297, 1368, 1375, 1297, 1387, 1400, 1377, 1297, 1364, 1375, 1349, 1347, 1352, 1297, 1375, 1360, 1372, 1364, 1297, 1299, 1300, 1283, 1301, 1346, 1299, 917, 925, 908, 921, 1013, 913, 918, 926, 1015, 1402, 1287, 1298, 976, 2586, 2578, 2563, 2582, 2682, 2590, 2585, 2577, 2680, 2586, 2582, 2585, 2590, 2577, 2578, 2564, 2563, 2681, 2586, 2577, 1439, 1463, 1450, 1454, 1443, 1530, 1460, 1467, 1463, 1471, 2009, 2008, 1994, 3107, 3132, 3104, 3132, 3114, 3110, 3106, 3132, 3107, 3107, 3105, 3111, 3110, 3115, 3132, 3107, 3132, 3107, 3132, 3107, 1940, 1923, 1937, 2501, 2499, 2685, 2683, 2684, 2667, 2681, 2584, 2635, 2641, 2655, 2646, 2649, 2636, 2637, 2634, 2653, 2635, 2584, 2647, 2646, 2644, 2625, 2584, 2635, 2637, 2632, 2632, 2647, 2634, 2636, 2653, 2652, 2584, 2654, 2647, 2634, 2584, 2645, 2641, 2646, 2667, 2652, 2643, 2670, 2653, 2634, 2635, 2641, 2647, 2646, 2584, 2569, 2560, 2584, 2649, 2646, 2652, 2584, 2640, 2641, 2655, 2640, 2653, 2634, 1219, 1272, 1253, 1251, 1254, 1254, 1273, 1252, 1250, 1267, 1266, 1206, 1277, 1267, 1263, 1206, 1271, 1274, 1265, 1273, 1252, 1279, 1250, 1278, 1275, 1196, 1206, 2524, 1934, 1926, 1943, 1922, 2030, 1930, 1933, 1925, 2028, 3281, 3293, 3282, 3285, 3290, 3289, 3279, 3272, 3218, 3281, 3290, 502, 427, 446, 3011, 2975, 2974, 2956, 1193, 1251, 1268, 1254, 2572, 2631, 2625, 863, 837, 843, 769, 739, 754, 745, 642, 753, 715, 709, 716, 707, 726, 727, 720, 711, 642, 753, 705, 714, 711, 719, 711, 642, 724, 659, 642, 717, 716, 718, 731, 642, 721, 727, 722, 722, 717, 720, 726, 721, 642, 707, 642, 719, 707, 730, 715, 719, 727, 719, 642, 717, 708, 642, 659, 658, 654, 642, 2794, 2746, 2744, 2725, 2748, 2723, 2734, 2735, 2734, 1425, 1444, 1520, 1468, 1461, 1457, 1443, 1444, 1520, 1471, 1470, 1461, 1520, 1443, 1465, 1463, 1470, 1461, 1442, 1520, 1459, 1471, 1470, 1462, 1465, 1463, 1520, 1469, 1445, 1443, 1444, 1520, 1458, 1461, 1520, 1440, 1442, 1471, 1446, 1465, 1460, 1461, 1460, 1140, 3081, 3118, 3110, 3107, 3114, 3115, 3183, 3131, 3104, 3183, 3132, 3110, 3112, 3105, 3183, 3130, 3132, 3110, 3105, 3112, 3183, 3132, 3110, 3112, 3105, 3114, 3133, 3183, 3181, 1831, 1792, 1800, 1805, 1796, 1797, 1857, 1813, 1806, 1857, 1814, 1811, 1800, 1813, 1796, 1857, 1800, 1807, 1868, 1804, 1796, 1804, 1806, 1811, 1816, 1857, 1871, 1842, 1831, 1857, 1799, 1800, 1805, 1796, 2167, 2152, 2166, 2397, 2385, 1283, 1304, 1297, 1405, 1378, 1381, 1382, 1405, 1300, 1337, 1335, 1333, 1315, 1316, 1405, 1309, 1329, 1342, 1337, 1334, 1333, 1315, 1316, 2086, 2077, 2070, 2059, 2051, 2070, 2064, 2055, 2070, 2071, 2131, 2064, 2076, 2077, 2055, 2070, 2077, 2055, 2131, 2071, 2074, 2068, 2070, ZipUtils.GP_FLAG_EFS, 2055, 2131, 2066, 2079, 2068, 2076, 2049, 2074, 2055, 2075, 2078, 2121, 2131, 534, 525, 516, 628, 616, 513, 556, 546, 544, 566, 561, 616, 520, 548, 555, 556, 547, 544, 566, 561, 2436, 2467, 2475, 2478, 2471, 2470, 2530, 2486, 2477, 2530, 2485, 2480, 2475, 2486, 2471, 2530, 2486, 2477, 2530, 2432, 2491, 2486, 2471, 2435, 2480, 2480, 2467, 2491, 2445, 2487, 2486, 2482, 2487, 2486, 2449, 2486, 2480, 2471, 2467, 2479, 2081, 2089, 2104, 2093, 2113, 2085, 2082, 2090, 2115, 2219, 2262, 2243, 1755, 433, 441, 424, 445, 465, 437, 434, 442, 467, 433, 445, 434, 437, 442, 441, 431, 424, 466, 433, 442, 1992, 2045, 1961, 2021, 2028, 2024, 2042, 2045, 1961, 2022, 2023, 2028, 1961, 2042, 2016, 2030, 2023, 2028, 2043, 1961, 2026, 2022, 2023, 2031, 2016, 2030, 1961, 2020, 2044, 2042, 2045, 1961, 2027, 2028, 1961, 2041, 2043, 2022, 2047, 2016, 2029, 2028, 2029};
    public static final String MANIFEST_ENTRY_NAME = C0034.m3431(m1100(), 0, 20, 541);
    public static final Attributes.Name a = new Attributes.Name(C0022.m1728(m1100(), 20, 10, 1453));
    public static final Attributes.Name b = new Attributes.Name(C0064.m4545(m1100(), 30, 20, 3269));

    public static class OutputManifestFile {
        public byte[] contents;
        public SortedMap<String, byte[]> individualSectionsContents;
        public Attributes mainSectionAttributes;
    }

    public static class SignerConfig {
        public List<X509Certificate> certificates;
        public boolean deterministicDsaSigning;
        public KeyConfig keyConfig;
        public String name;
        public PrivateKey privateKey;
        public DigestAlgorithm signatureDigestAlgorithm;
    }

    public static OutputManifestFile generateManifestFile(DigestAlgorithm digestAlgorithm, Map<String, byte[]> map, byte[] bArr) throws ApkFormatException {
        Manifest manifest;
        String strM5544 = C0068.m5544(m1100(), 260, 37, 2061);
        if (bArr != null) {
            try {
                manifest = new Manifest(new ByteArrayInputStream(bArr));
            } catch (IOException e) {
                throw new ApkFormatException(C0036.m3678(m1100(), 297, 37, 505), e);
            }
        } else {
            manifest = null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Attributes attributes = new Attributes();
        if (manifest != null) {
            C0024.m1939(attributes, C0023.m1822(manifest));
        } else {
            C0016.m721(attributes, C0078.m7440(), C0027.m2404(m1100(), 334, 3, 478));
        }
        try {
            C0064.m4620(byteArrayOutputStream, attributes);
            ArrayList arrayList = new ArrayList(C0030.m2937(map));
            C0035.m3581(arrayList);
            TreeMap treeMap = new TreeMap();
            String strM1708 = C0022.m1708(digestAlgorithm);
            Iterator itM4154 = C0039.m4154(arrayList);
            while (C0036.m3657(itM4154)) {
                String str = (String) C0071.m6012(itM4154);
                for (char c : C0031.m2984(str)) {
                    if (c == '\r' || c == '\n' || c == 0) {
                        throw new ApkFormatException(C0021.m1531(C0023.m1904(m1100(), 337, 55, 1329), new Object[]{C0021.m1548(c), str}));
                    }
                }
                byte[] bArr2 = (byte[]) C0072.m6108(map, str);
                Attributes attributes2 = new Attributes();
                C0032.m3181(attributes2, strM1708, m1099(m1098(), bArr2));
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C0021.m1577(byteArrayOutputStream2, str, attributes2);
                    byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream2);
                    C0033.m3292(byteArrayOutputStream, bArrM7297);
                    C0075.m6786(treeMap, str, bArrM7297);
                } catch (IOException e2) {
                    throw new RuntimeException(strM5544, e2);
                }
            }
            OutputManifestFile outputManifestFile = new OutputManifestFile();
            outputManifestFile.contents = C0077.m7297(byteArrayOutputStream);
            outputManifestFile.mainSectionAttributes = attributes;
            outputManifestFile.individualSectionsContents = treeMap;
            return outputManifestFile;
        } catch (IOException e3) {
            throw new RuntimeException(strM5544, e3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int[] m1097() {
        if (C0025.m2132() >= 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Base64.Encoder m1098() {
        if (C0111.m13165() < 0) {
            return Base64.getEncoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1099(Object obj, Object obj2) {
        if (C0024.m2011() <= 0) {
            return ((Base64.Encoder) obj).encodeToString((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1100() {
        if (C0074.m6454() <= 0) {
            return f63short;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.v1.V1SchemeSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;

        /* JADX INFO: renamed from: ۣ۠ۥۨ, reason: not valid java name and contains not printable characters */
        public static int[] m1101() {
            if (C0070.m5903() >= 0) {
                return $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0073.m6333().length];
            $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm = iArr;
            try {
                iArr[C0030.m2893(C0066.m4884())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m1101()[C0030.m2893(C0028.m2546())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static byte[] a(SignerConfig signerConfig, byte[] bArr) throws SignatureException, InvalidKeyException {
        String strM5807 = C0069.m5807(m1100(), 50, 21, 2504);
        String strM3603 = C0035.m3603(m1100(), 71, 44, 1748);
        String strM1443 = C0020.m1443(m1100(), 115, 27, 2999);
        List listM1568 = C0021.m1568(signerConfig);
        PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(listM1568, 0));
        DigestAlgorithm digestAlgorithmM3692 = C0036.m3692(signerConfig);
        Pair pairM6180 = C0072.m6180(publicKeyM6845, digestAlgorithmM3692, C0031.m3100(signerConfig));
        String str = (String) C0111.m13157(pairM6180);
        try {
            byte[] bArrM4640 = C0064.m4640(C0073.m6403(C0024.m1941(signerConfig), str, null), bArr);
            try {
                Signature signatureM2131 = C0025.m2131(str);
                C0072.m6123(signatureM2131, publicKeyM6845);
                C0027.m2440(signatureM2131, bArr);
                if (!C0025.m2194(signatureM2131, bArrM4640)) {
                    throw new SignatureException(C0038.m4022(m1100(), 174, 24, 602));
                }
                try {
                    return C0075.m6840(bArrM4640, null, listM1568, C0064.m4641(digestAlgorithmM3692), (AlgorithmIdentifier) C0037.m3781(pairM6180));
                } catch (Asn1EncodingException | CertificateEncodingException unused) {
                    throw new SignatureException(C0068.m5544(m1100(), 142, 32, 3103));
                }
            } catch (InvalidKeyException e) {
                throw new InvalidKeyException(C0074.m6503(strM1443, str, strM3603), e);
            } catch (SignatureException e2) {
                throw new SignatureException(C0074.m6503(strM1443, str, strM3603), e2);
            }
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            throw new SignatureException(C0032.m3116(strM5807, str), e);
        } catch (InvalidKeyException e4) {
            throw new InvalidKeyException(C0032.m3116(strM5807, str), e4);
        } catch (SignatureException e5) {
            e = e5;
            throw new SignatureException(C0032.m3116(strM5807, str), e);
        }
    }

    public static String b(DigestAlgorithm digestAlgorithm) {
        int i = m1097()[C0030.m2893(digestAlgorithm)];
        if (i == 1) {
            return C0019.m1189(m1100(), 249, 11, 2206);
        }
        if (i == 2) {
            return C0075.m6791(m1100(), 198, 14, 620);
        }
        StringBuilder sb = new StringBuilder(C0035.m3603(m1100(), 212, 37, 2399));
        C0036.m3741(sb, digestAlgorithm);
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    public static Set<String> getOutputEntryNames(List<SignerConfig> list) {
        HashSet hashSet = new HashSet((C0034.m3427(list) * 2) + 1);
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            SignerConfig signerConfig = (SignerConfig) C0071.m6012(itM4732);
            String strM13139 = C0111.m13139(signerConfig);
            String strM6902 = C0076.m6902(m1100(), 392, 9, 984);
            StringBuilder sb = new StringBuilder(strM6902);
            C0077.m7290(sb, strM13139);
            C0077.m7290(sb, C0030.m2840(m1100(), 401, 3, 1364));
            C0077.m7232(hashSet, C0068.m5536(sb));
            PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(C0021.m1568(signerConfig), 0));
            StringBuilder sb2 = new StringBuilder(strM6902);
            C0077.m7290(sb2, strM13139);
            C0077.m7290(sb2, C0035.m3603(m1100(), 404, 1, 1022));
            C0077.m7290(sb2, C0018.m1005(C0070.m5875(publicKeyM6845), C0077.m7270()));
            C0077.m7232(hashSet, C0068.m5536(sb2));
        }
        C0077.m7232(hashSet, C0024.m1945(m1100(), 405, 20, 2647));
        return hashSet;
    }

    public static boolean isJarEntryDigestNeededInManifest(String str) {
        if (C0072.m6150(str, C0022.m1728(m1100(), 553, 1, 2547))) {
            return false;
        }
        if (!C0019.m1242(str, C0071.m5991(m1100(), 554, 9, 1987)) || C0064.m4569(str, 47, 9) != -1) {
            return true;
        }
        String strM974 = C0018.m974(C0071.m6056(str, 9), C0077.m7270());
        return (C0070.m5838(C0018.m1070(m1100(), 563, 11, 3260), strM974) || C0072.m6150(strM974, C0017.m936(m1100(), 574, 3, 472)) || C0072.m6150(strM974, C0027.m2404(m1100(), 577, 4, 3053)) || C0072.m6150(strM974, C0018.m1070(m1100(), 581, 4, 1159)) || C0072.m6150(strM974, C0019.m1189(m1100(), 585, 3, 2594)) || C0019.m1242(strM974, C0031.m3047(m1100(), 588, 4, 812))) ? false : true;
    }

    public static List<Pair<String, byte[]>> signManifest(List<SignerConfig> list, DigestAlgorithm digestAlgorithm, List<Integer> list2, String str, OutputManifestFile outputManifestFile) throws SignatureException, InvalidKeyException, CertificateException {
        String strM2609;
        String strM936 = C0017.m936(m1100(), 699, 1, 1110);
        String strM1945 = C0024.m1945(m1100(), 700, 29, 3151);
        if (C0025.m2084(list)) {
            throw new IllegalArgumentException(C0067.m5418(m1100(), 921, 43, 1929));
        }
        ArrayList arrayList = new ArrayList((C0034.m3427(list) * 2) + 1);
        String strM2840 = C0030.m2840(m1100(), 729, 34, 1889);
        Attributes attributesM1822 = C0023.m1822(new Manifest());
        C0016.m721(attributesM1822, C0069.m5750(), C0038.m4022(m1100(), 763, 3, 2118));
        C0016.m721(attributesM1822, C0016.m710(), str);
        if (!C0025.m2084(list2)) {
            StringBuilder sb = new StringBuilder();
            Iterator itM4732 = C0065.m4732(list2);
            while (C0036.m3657(itM4732)) {
                int iM2170 = C0025.m2170((Integer) C0071.m6012(itM4732));
                if (C0064.m4509(sb) > 0) {
                    C0077.m7290(sb, C0064.m4545(m1100(), 766, 2, 2417));
                }
                C0077.m7290(sb, C0078.m7464(iM2170));
            }
            C0016.m721(attributesM1822, C0023.m1831(), C0068.m5536(sb));
        }
        MessageDigest messageDigestM2835 = C0030.m2835(C0071.m6040(digestAlgorithm));
        int i = m1097()[C0030.m2893(digestAlgorithm)];
        if (i == 1) {
            strM2609 = C0028.m2609(m1100(), 828, 20, 581);
        } else {
            if (i != 2) {
                StringBuilder sb2 = new StringBuilder(C0065.m4757(m1100(), 791, 37, 2163));
                C0036.m3741(sb2, digestAlgorithm);
                throw new IllegalArgumentException(C0068.m5536(sb2));
            }
            strM2609 = C0029.m2695(m1100(), 768, 23, 1360);
        }
        C0032.m3181(attributesM1822, strM2609, m1099(m1098(), C0016.m653(messageDigestM2835, C0017.m913(outputManifestFile))));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0021.m1622(byteArrayOutputStream, attributesM1822);
            String strM1708 = C0022.m1708(digestAlgorithm);
            Iterator itM2001 = C0024.m2001(C0033.m3380(C0022.m1713(outputManifestFile)));
            while (C0036.m3657(itM2001)) {
                Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                String str2 = (String) C0063.m4368(entry);
                byte[] bArrM653 = C0016.m653(messageDigestM2835, (byte[]) C0019.m1293(entry));
                Attributes attributes = new Attributes();
                C0032.m3181(attributes, strM1708, m1099(m1098(), bArrM653));
                try {
                    C0075.m6792(byteArrayOutputStream, str2, attributes);
                } catch (IOException e) {
                    throw new RuntimeException(strM2840, e);
                }
            }
            if (C0069.m5716(byteArrayOutputStream) > 0 && C0069.m5716(byteArrayOutputStream) % 1024 == 0) {
                try {
                    C0017.m887(byteArrayOutputStream);
                } catch (IOException e2) {
                    throw new RuntimeException(C0076.m6902(m1100(), 848, 40, 2498), e2);
                }
            }
            byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
            Iterator itM47322 = C0065.m4732(list);
            while (C0036.m3657(itM47322)) {
                SignerConfig signerConfig = (SignerConfig) C0071.m6012(itM47322);
                String strM13139 = C0111.m13139(signerConfig);
                try {
                    byte[] bArrM1944 = C0024.m1944(signerConfig, bArrM7297);
                    String strM5942 = C0070.m5942(m1100(), 888, 9, 2156);
                    StringBuilder sb3 = new StringBuilder(strM5942);
                    C0077.m7290(sb3, strM13139);
                    C0077.m7290(sb3, C0111.m13097(m1100(), 897, 3, 2181));
                    C0017.m919(arrayList, C0025.m2158(C0068.m5536(sb3), bArrM7297));
                    PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(C0021.m1568(signerConfig), 0));
                    StringBuilder sb4 = new StringBuilder(strM5942);
                    C0077.m7290(sb4, strM13139);
                    C0077.m7290(sb4, C0033.m3330(m1100(), DescriptorProtos.Edition.EDITION_LEGACY_VALUE, 1, 1781));
                    C0077.m7290(sb4, C0018.m1005(C0070.m5875(publicKeyM6845), C0077.m7270()));
                    C0017.m919(arrayList, C0025.m2158(C0068.m5536(sb4), bArrM1944));
                } catch (InvalidKeyException e3) {
                    throw new InvalidKeyException(C0074.m6503(strM1945, strM13139, strM936), e3);
                } catch (SignatureException e4) {
                    throw new SignatureException(C0074.m6503(strM1945, strM13139, strM936), e4);
                } catch (CertificateException e5) {
                    throw new CertificateException(C0074.m6503(strM1945, strM13139, strM936), e5);
                }
            }
            C0017.m919(arrayList, C0025.m2158(C0028.m2609(m1100(), 901, 20, 508), C0017.m913(outputManifestFile)));
            return arrayList;
        } catch (IOException e6) {
            throw new RuntimeException(strM2840, e6);
        }
    }

    public static String getJcaMessageDigestAlgorithm(DigestAlgorithm digestAlgorithm) {
        return C0071.m6040(digestAlgorithm);
    }

    public static String getSafeSignerName(String str) {
        if (!C0077.m7292(str)) {
            StringBuilder sb = new StringBuilder();
            char[] cArrM2984 = C0031.m2984(C0018.m1005(str, C0077.m7270()));
            for (int i = 0; i < C0032.m3151(cArrM2984.length, 8); i++) {
                char c = cArrM2984[i];
                if ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != '-' && c != '_')) {
                    C0077.m7289(sb, '_');
                } else {
                    C0077.m7289(sb, c);
                }
            }
            return C0068.m5536(sb);
        }
        throw new IllegalArgumentException(C0071.m5991(m1100(), 425, 10, 1498));
    }

    public static DigestAlgorithm getSuggestedSignatureDigestAlgorithm(PublicKey publicKey, int i) throws InvalidKeyException {
        String strM5875 = C0070.m5875(publicKey);
        if (!C0025.m2111(C0065.m4757(m1100(), 435, 3, 1931), strM5875) && !C0070.m5838(C0035.m3603(m1100(), 438, 20, 3090), strM5875)) {
            if (C0025.m2111(C0023.m1904(m1100(), 458, 3, CredentialOption.PRIORITY_DEFAULT), strM5875)) {
                if (i < 21) {
                    return C0066.m4884();
                }
                return C0028.m2546();
            }
            if (C0025.m2111(C0063.m4315(m1100(), 461, 2, 2432), strM5875)) {
                if (i >= 18) {
                    return C0028.m2546();
                }
                throw new InvalidKeyException(C0020.m1443(m1100(), 463, 63, 2616));
            }
            throw new InvalidKeyException(C0032.m3116(C0078.m7427(m1100(), 526, 27, 1174), strM5875));
        }
        if (i < 18) {
            return C0066.m4884();
        }
        return C0028.m2546();
    }

    public static List<Pair<String, byte[]>> sign(List<SignerConfig> list, DigestAlgorithm digestAlgorithm, Map<String, byte[]> map, List<Integer> list2, byte[] bArr, String str) {
        if (!C0025.m2084(list)) {
            if (C0034.m3427(list) <= 10) {
                return C0021.m1557(list, digestAlgorithm, list2, str, C0065.m4737(digestAlgorithm, map, bArr));
            }
            StringBuilder sb = new StringBuilder(C0070.m5942(m1100(), 592, 55, 674));
            C0021.m1551(sb, C0034.m3427(list));
            C0077.m7290(sb, C0020.m1443(m1100(), 647, 9, 2762));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        throw new IllegalArgumentException(C0028.m2609(m1100(), 656, 43, 1488));
    }
}
