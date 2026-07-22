package com.android.apksig.internal.apk;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.ApkVerifier;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.pkcs7.EncapsulatedContentInfo;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.util.ChainedDataSource;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.x509.RSAPublicKey;
import com.android.apksig.internal.x509.SubjectPublicKeyInfo;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
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
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigningBlockUtils {
    public static final int ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    public static final int VERITY_PADDING_BLOCK_ID = 1114793335;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V2 = 2;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V3 = 3;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V31 = 31;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V4 = 4;
    public static final int VERSION_JAR_SIGNATURE_SCHEME = 1;
    public static final int VERSION_SOURCE_STAMP = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f45short = {2889, 2926, 2918, 2915, 2922, 2923, 2863, 2939, 2912, 2863, 2924, 2912, 2914, 2943, 2938, 2939, 2922, 2863, 2923, 2918, 2920, 2922, 2940, 2939, 2940, 2863, 2912, 2921, 2863, 2894, 2911, 2884, 1209, 1182, 1174, 1171, 1178, 1179, 1247, 1163, 1168, 1247, 1165, 1178, 1182, 1179, 1247, 1214, 1199, 1204, 1247, 1181, 1178, 1174, 1169, 1176, 1247, 1164, 1174, 1176, 1169, 1178, 1179, 1327, 1294, 1345, 1298, 1288, 1286, 1295, 1284, 1299, 1345, 1282, 1294, 1295, 1287, 1288, 1286, 1298, 1345, 1297, 1299, 1294, 1303, 1288, 1285, 1284, 1285, 1359, 1345, 1312, 1301, 1345, 1293, 1284, 1280, 1298, 1301, 1345, 1294, 1295, 1284, 1345, 1288, 1298, 1345, 1299, 1284, 1296, 1300, 1288, 1299, 1284, 1285, 2243, 2276, 2298, 2303, 2302, 2218, 2302, 2277, 2277, 2218, 2278, 2277, 2276, 2285, 2224, 2218, 2570, 2633, 2626, 2655, 2628, 2625, 2649, 2450, 2473, 2466, 2495, 2487, 2466, 2468, 2483, 2466, 2467, 2535, 2472, 2482, 2483, 2487, 2482, 2483, 2535, 2484, 2478, 2493, 2466, 2535, 2472, 2465, 2535, 1442, 1510, 1515, 1509, 1511, 1521, 1526, 1464, 1442, 2616, 2591, 2583, 2578, 2587, 2586, 2654, 2570, 2577, 2654, 2572, 2587, 2591, 2586, 2654, 2589, 2582, 2571, 2576, 2581, 2654, 2653, 3319, 3280, 3278, 3275, 3274, 3230, 3274, 3281, 3281, 3230, 3282, 3281, 3280, 3289, 3204, 3230, 2446, 2509, 2502, 2523, 2496, 2501, 2525, 1838, 1880, 1859, 1862, 1871, 1715, 1714, 1696, 3323, 3300, 3320, 3300, 3314, 3326, 3322, 3300, 3323, 3323, 3321, 3327, 3326, 3315, 3300, 3323, 3300, 3323, 3300, 3323, 2011, 2041, 2029, 2047, 2032, 2028, 1976, 2041, 1976, 2045, 2016, 2043, 2045, 2024, 2028, 2033, 2039, 2038, 1976, 2045, 2038, 2043, 2039, 2044, 2033, 2038, 2047, 1976, 2028, 2032, 2045, 1976, 2024, 2029, 2042, 2036, 2033, 2043, 1976, 2035, 2045, 2017, 1954, 1976, 2802, 2749, 2740, 2802, 2737, 2750, 2739, 2721, 2721, 2802, 2489, 2462, 2454, 2451, 2458, 2459, 2527, 2443, 2448, 2527, 2448, 2461, 2443, 2462, 2454, 2449, 2527, 2471, 2513, 2506, 2511, 2502, 2527, 2458, 2449, 2460, 2448, 2459, 2458, 2459, 2527, 2457, 2448, 2445, 2450, 2527, 2448, 2457, 2527, 2447, 2442, 2461, 2451, 2454, 2460, 2527, 2452, 2458, 2438, 2527, 2039, 2024, 2036, 2024, 2046, 2034, 2038, 2024, 2039, 2039, 2037, 2035, 2034, 2047, 2024, 2039, 2024, 2033, 2024, 2039, 2677, 2666, 2678, 2666, 2684, 2672, 2676, 2666, 2677, 2677, 2679, 2673, 2672, 2685, 2666, 2677, 2666, 2675, 2666, 2678, 1517, 1482, 1474, 1479, 1486, 1487, 1419, 1503, 1476, 1419, 1496, 1474, 1484, 1477, 1419, 1502, 1496, 1474, 1477, 1484, 1419, 2021, 1974, 1964, 1954, 1963, 1956, 1969, 1968, 1975, 1952, 2021, 1968, 1974, 1964, 1963, 1954, 2021, 1973, 1968, 1959, 1961, 1964, 1958, 2021, 1966, 1952, 1980, 2021, 1955, 1975, 1962, 1960, 2021, 1958, 1952, 1975, 1969, 1964, 1955, 1964, 1958, 1956, 1969, 1952, 969, 1006, 998, 995, 1002, 1003, 943, 1019, 992, 943, 1017, 1002, 1021, 998, 1001, 1014, 943, 1000, 1002, 993, 1002, 1021, 1006, 1019, 1002, 1003, 943, 1383, 1345, 1366, 1360, 1284, 1357, 1354, 1344, 1345, 1372, 1284, 724, 641, 666, 656, 657, 646, 724, 647, 669, 659, 666, 657, 646, 724, 669, 666, 656, 657, 652, 724, 370, 289, 315, 296, 311, 370, 317, 295, 294, 370, 317, 308, 370, 288, 307, 316, 309, 311, 360, 370, 1458, 1436, 1439, 1427, 1435, 1488, 1433, 1438, 1428, 1429, 1416, 1488, 2571, 2648, 2626, 2641, 2638, 2571, 2628, 2654, 2655, 2571, 2628, 2637, 2571, 2649, 2634, 2629, 2636, 2638, 2577, 2571, 771, 786, 777, 866, 817, 811, 805, 812, 811, 812, 805, 866, 800, 814, 813, 801, 809, 866, 817, 811, 824, 807, 866, 813, 823, 822, 866, 813, 804, 866, 816, 803, 812, 805, 807, 888, 866, 1329, 1312, 1339, 1360, 1315, 1305, 1303, 1310, 1305, 1310, 1303, 1360, 1330, 1308, 1311, 1299, 1307, 1360, 1283, 1305, 1290, 1301, 1360, 1305, 1283, 1360, 1310, 1311, 1284, 1360, 1309, 1285, 1308, 1284, 1305, 1280, 1308, 1301, 1360, 1311, 1302, 1360, 1280, 1297, 1303, 1301, 1360, 1283, 1305, 1290, 1301, 1354, 1360, 3322, 3307, 3312, 3227, 3304, 3282, 3292, 3285, 3282, 3285, 3292, 3227, 3321, 3287, 3284, 3288, 3280, 3227, 3282, 3272, 3227, 3285, 3284, 3279, 3227, 3290, 3287, 3282, 3292, 3285, 3294, 3295, 3227, 3284, 3285, 3227, 3215, 3280, 3227, 3289, 3284, 3278, 3285, 3295, 3290, 3273, 3266, 3201, 3227, 2228, 2192, 2186, 2196, 2200, 2189, 2202, 2193, 2265, 2203, 2204, 2189, 2190, 2204, 2204, 2199, 2265, 2186, 2204, 2189, 2186, 2265, 2198, 2207, 2265, 2187, 2204, 2184, 2188, 2204, 2186, 2189, 2204, 2205, 2265, 2200, 2199, 2205, 2265, 2202, 2198, 2196, 2185, 2188, 2189, 2204, 2205, 2265, 2202, 2198, 2199, 2189, 2204, 2199, 2189, 2265, 2205, 2192, 2206, 2204, 2186, 2189, 2186, 2265, 2263, 2265, 2219, 2204, 2184, 2188, 2204, 2186, 2189, 2204, 2205, 2243, 2265, 930, 942, 1005, 993, 995, 1022, 1019, 1018, 1003, 1002, 948, 942, 847, 872, 864, 869, 876, 877, 809, 893, 870, 809, 874, 870, 868, 889, 892, 893, 876, 809, 874, 870, 871, 893, 876, 871, 893, 809, 877, 864, 878, 876, 890, 893, 890, 1088, 1121, 1070, 1133, 1121, 1120, 1146, 1131, 1120, 1146, 1070, 1130, 1127, 1129, 1131, 1149, 1146, 1149, 1070, 1128, 1121, 1147, 1120, 1130};
    public static final byte[] a = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};
    public static final ContentDigestAlgorithm[] b = {C0063.m4405(), C0018.m997(), C0067.m5499()};

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.ApkSigningBlockUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ChunkDigester implements Runnable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f46short = {932, 927, 916, 905, 897, 916, 914, 901, 916, 917, 977, 926, 900, 901, 897, 900, 901, 977, 898, 920, 907, 916, 977, 926, 919, 977, 836, 768, 781, 771, 769, 791, 784, 862, 836, 2411, 2368, 2397, 2374, 2371, 2312, 2395, 2369, 2386, 2381, 2312, 2383, 2394, 2381, 2377, 2396, 2381, 2394, 2312, 2396, 2368, 2377, 2374, 2312, 2381, 2384, 2392, 2381, 2379, 2396, 2381, 2380, 2322, 2312};
        public final ChunkSupplier a;
        public final List b;
        public final ArrayList c;
        public final DataSink d;

        /* JADX INFO: renamed from: ۟۟۟ۤ۠, reason: not valid java name and contains not printable characters */
        public static int m770(Object obj, int i) {
            if (C0019.m1311() == 0) {
                return ChunkDigests.access$900((ChunkDigests) obj, i);
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
        public static ChunkSupplier m771(Object obj) {
            if (C0074.m6454() < 0) {
                return ((ChunkDigester) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟۠ۢۡۨ, reason: not valid java name and contains not printable characters */
        public static int m772(Object obj) {
            if (C0036.m3653() < 0) {
                return ChunkSupplier.Chunk.m793((ChunkSupplier.Chunk) obj);
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۡۢۥۡ, reason: not valid java name and contains not printable characters */
        public static ContentDigestAlgorithm m773(Object obj) {
            if (C0027.m2460() > 0) {
                return ChunkDigests.m784((ChunkDigests) obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۡۢۦ۠, reason: not valid java name and contains not printable characters */
        public static ChunkSupplier.Chunk m774(Object obj) {
            if (C0078.m7450() >= 0) {
                return ((ChunkSupplier) obj).get();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
        public static MessageDigest m775(Object obj) {
            if (C0071.m6069() > 0) {
                return ChunkDigests.access$200((ChunkDigests) obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢۢۡۨ, reason: not valid java name and contains not printable characters */
        public static ArrayList m776(Object obj) {
            if (C0017.m846() > 0) {
                return ((ChunkDigester) obj).c;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
        public static List m777(Object obj) {
            if (C0067.m5468() < 0) {
                return ((ChunkDigester) obj).b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۡۧ۠, reason: not valid java name and contains not printable characters */
        public static ByteBuffer m778(Object obj) {
            if (C0030.m2940() > 0) {
                return ChunkSupplier.Chunk.m795((ChunkSupplier.Chunk) obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
        public static short[] m779() {
            if (C0037.m3837() < 0) {
                return f46short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
        public static DataSink m780(Object obj) {
            if (C0016.m717() < 0) {
                return ((ChunkDigester) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
        public static int m781(Object obj) {
            if (C0077.m7272() <= 0) {
                return ChunkSupplier.Chunk.m794((ChunkSupplier.Chunk) obj);
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
        public static int m782(Object obj) {
            if (C0027.m2460() >= 0) {
                return ChunkDigests.m785((ChunkDigests) obj);
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۧۡۢ۟, reason: not valid java name and contains not printable characters */
        public static byte[] m783(Object obj) {
            if (C0031.m3075() >= 0) {
                return ChunkDigests.m786((ChunkDigests) obj);
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            List listM777 = m777(this);
            DataSink dataSinkM780 = m780(this);
            ChunkSupplier chunkSupplierM771 = m771(this);
            byte[] bArr = new byte[5];
            bArr[0] = -91;
            try {
                for (ChunkSupplier.Chunk chunkM774 = m774(chunkSupplierM771); chunkM774 != null; chunkM774 = m774(chunkSupplierM771)) {
                    int iM781 = m781(chunkM774);
                    if (iM781 > 1048576) {
                        StringBuilder sb = new StringBuilder();
                        C0077.m7290(sb, C0033.m3330(m779(), 35, 34, 2344));
                        C0021.m1551(sb, iM781);
                        throw new RuntimeException(C0068.m5536(sb));
                    }
                    C0025.m2122(iM781, bArr, 1);
                    C0037.m3874(dataSinkM780, bArr, 0, 5);
                    C0017.m841(dataSinkM780, m778(chunkM774));
                    for (int i = 0; i < C0034.m3427(listM777); i++) {
                        ChunkDigests chunkDigests = (ChunkDigests) C0071.m6078(listM777, i);
                        int iM826 = C0017.m826((MessageDigest) C0064.m4526(m776(this), i), m783(chunkDigests), m770(chunkDigests, m772(chunkM774)), m782(chunkDigests));
                        if (iM826 != m782(chunkDigests)) {
                            StringBuilder sb2 = new StringBuilder();
                            C0077.m7290(sb2, C0022.m1728(m779(), 0, 26, PointerIconCompat.TYPE_VERTICAL_TEXT));
                            C0036.m3741(sb2, m773(chunkDigests));
                            C0077.m7290(sb2, C0065.m4757(m779(), 26, 9, 868));
                            C0021.m1551(sb2, iM826);
                            throw new RuntimeException(C0068.m5536(sb2));
                        }
                    }
                }
            } catch (IOException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (DigestException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        }

        public ChunkDigester(ChunkSupplier chunkSupplier, List list, AnonymousClass1 anonymousClass1) {
            this.a = chunkSupplier;
            this.b = list;
            this.c = new ArrayList(C0034.m3427(list));
            Iterator itM4732 = C0065.m4732(list);
            while (C0036.m3657(itM4732)) {
                try {
                    C0017.m919(m776(this), m775((ChunkDigests) C0071.m6012(itM4732)));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            this.d = C0027.m2416((MessageDigest[]) C0039.m4172(m776(this), new MessageDigest[0]));
        }
    }

    public static class ChunkDigests {
        public final ContentDigestAlgorithm a;
        public final int b;
        public final byte[] c;

        /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
        public static ContentDigestAlgorithm m784(Object obj) {
            if (C0066.m4827() > 0) {
                return ((ChunkDigests) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۢۦۢ, reason: not valid java name and contains not printable characters */
        public static int m785(Object obj) {
            if (C0111.m13165() < 0) {
                return ((ChunkDigests) obj).b;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۤۧۥۧ, reason: not valid java name and contains not printable characters */
        public static byte[] m786(Object obj) {
            if (C0075.m6893() >= 0) {
                return ((ChunkDigests) obj).c;
            }
            return null;
        }

        public static MessageDigest access$200(ChunkDigests chunkDigests) {
            return C0030.m2835(C0019.m1186(m784(chunkDigests)));
        }

        public static int access$900(ChunkDigests chunkDigests, int i) {
            return (i * m785(chunkDigests)) + 5;
        }

        public ChunkDigests(ContentDigestAlgorithm contentDigestAlgorithm, int i, AnonymousClass1 anonymousClass1) {
            this.a = contentDigestAlgorithm;
            int iM3506 = C0034.m3506(contentDigestAlgorithm);
            this.b = iM3506;
            byte[] bArr = new byte[(iM3506 * i) + 5];
            this.c = bArr;
            bArr[0] = 90;
            C0025.m2122(i, bArr, 1);
        }
    }

    public static class ChunkSupplier implements Supplier<Chunk> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f47short = {464, 491, 499, 508, 507, 492, 446, 497, 504, 446, 509, 502, 491, 496, 501, 493, 446, 503, 496, 446, 506, 511, 490, 511, 461, 497, 491, 492, 509, 507, 453, 443, 506, 451, 446, 503, 493, 446, 505, 492, 507, 511, 490, 507, 492, 446, 490, 502, 511, 496, 446, 499, 511, 486, 446, 503, 496, 490, 432, 2699, 2732, 2724, 2721, 2728, 2729, 2797, 2745, 2722, 2797, 2751, 2728, 2732, 2729, 2797, 2734, 2725, 2744, 2723, 2726};
        public final DataSource[] a;
        public final int[] b;
        public final int c;
        public final AtomicInteger d;

        public static class Chunk {
            public final int a;
            public final ByteBuffer b;
            public final int c;

            /* JADX INFO: renamed from: ۟۟۠۟ۦ, reason: not valid java name and contains not printable characters */
            public static int m793(Object obj) {
                if (C0063.m4427() >= 0) {
                    return ((Chunk) obj).a;
                }
                return 0;
            }

            /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
            public static int m794(Object obj) {
                if (C0034.m3450() >= 0) {
                    return ((Chunk) obj).c;
                }
                return 0;
            }

            /* JADX INFO: renamed from: ۦۧۨ, reason: contains not printable characters */
            public static ByteBuffer m795(Object obj) {
                if (C0034.m3450() >= 0) {
                    return ((Chunk) obj).b;
                }
                return null;
            }

            public Chunk(int i, ByteBuffer byteBuffer, int i2, AnonymousClass1 anonymousClass1) {
                this.a = i;
                this.b = byteBuffer;
                this.c = i2;
            }
        }

        public ChunkSupplier(DataSource[] dataSourceArr, AnonymousClass1 anonymousClass1) {
            this.a = dataSourceArr;
            this.b = new int[dataSourceArr.length];
            int i = 0;
            for (int i2 = 0; i2 < dataSourceArr.length; i2++) {
                long jM7342 = C0078.m7342(C0072.m6146(dataSourceArr[i2]), 1048576L);
                if (jM7342 > 2147483647L) {
                    throw new RuntimeException(C0021.m1531(C0063.m4315(m787(), 0, 59, 414), new Object[]{C0021.m1548(i2)}));
                }
                m792(this)[i2] = (int) jM7342;
                i = (int) (((long) i) + jM7342);
            }
            this.c = i;
            this.d = new AtomicInteger(0);
        }

        /* JADX INFO: renamed from: ۟۠ۡ۠ۦ, reason: not valid java name and contains not printable characters */
        public static short[] m787() {
            if (C0074.m6454() <= 0) {
                return f47short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟۠ۦۧۤ, reason: not valid java name and contains not printable characters */
        public static AtomicInteger m788(Object obj) {
            if (C0019.m1311() == 0) {
                return ((ChunkSupplier) obj).d;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
        public static Chunk m789(Object obj) {
            if (C0026.m2298() < 0) {
                return ((ChunkSupplier) obj).get();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۢۤۢ, reason: not valid java name and contains not printable characters */
        public static int m790(Object obj) {
            if (C0020.m1385() <= 0) {
                return ((ChunkSupplier) obj).c;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
        public static DataSource[] m791(Object obj) {
            if (C0037.m3837() <= 0) {
                return ((ChunkSupplier) obj).a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦ۟ۥۨ, reason: contains not printable characters */
        public static int[] m792(Object obj) {
            if (C0063.m4427() >= 0) {
                return ((ChunkSupplier) obj).b;
            }
            return null;
        }

        @Override // java.util.function.Supplier
        public /* bridge */ /* synthetic */ Chunk get() {
            return m789(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.function.Supplier
        public Chunk get() {
            DataSource[] dataSourceArrM791;
            int iM4679 = C0065.m4679(m788(this));
            if (iM4679 < 0 || iM4679 >= m790(this)) {
                return null;
            }
            long j = iM4679;
            int i = 0;
            while (true) {
                dataSourceArrM791 = m791(this);
                if (i >= dataSourceArrM791.length) {
                    break;
                }
                int i2 = m792(this)[i];
                if (j < i2) {
                    break;
                }
                j -= (long) i2;
                i++;
            }
            long j2 = j * 1048576;
            int iM2757 = (int) C0029.m2757(C0072.m6146(dataSourceArrM791[i]) - j2, 1048576L);
            ByteBuffer byteBufferM3516 = C0035.m3516(iM2757);
            try {
                C0028.m2603(dataSourceArrM791[i], j2, iM2757, byteBufferM3516);
                C0038.m3987(byteBufferM3516);
                return new Chunk(iM4679, byteBufferM3516, iM2757, null);
            } catch (IOException e) {
                throw new IllegalStateException(C0025.m2151(m787(), 59, 20, 2765), e);
            }
        }
    }

    public static class Result extends ApkSigResult {
        public final ArrayList c;
        public final ArrayList d;
        public final List<SignerInfo> signers;
        public SigningCertificateLineage signingCertificateLineage;

        public static class SignerInfo extends ApkSignerInfo {
            public int maxSdkVersion;
            public int minSdkVersion;
            public byte[] signedData;
            public SigningCertificateLineage signingCertificateLineage;
            public List<ContentDigest> contentDigests = new ArrayList();
            public Map<ContentDigestAlgorithm, byte[]> verifiedContentDigests = new HashMap();
            public List<Signature> signatures = new ArrayList();
            public Map<SignatureAlgorithm, byte[]> verifiedSignatures = new HashMap();
            public List<AdditionalAttribute> additionalAttributes = new ArrayList();
            public final ArrayList d = new ArrayList();
            public final ArrayList e = new ArrayList();

            public static class AdditionalAttribute {
                public final int a;
                public final byte[] b;

                /* JADX INFO: renamed from: ۧۢۥۤ, reason: not valid java name and contains not printable characters */
                public static Object m796(Object obj) {
                    if (C0039.m4109() > 0) {
                        return ((byte[]) obj).clone();
                    }
                    return null;
                }

                public int getId() {
                    return C0063.m4339(this);
                }

                public byte[] getValue() {
                    return (byte[]) m796(C0024.m1950(this));
                }

                public AdditionalAttribute(int i, byte[] bArr) {
                    this.a = i;
                    this.b = (byte[]) m796(bArr);
                }
            }

            public static class ContentDigest {
                public final int a;
                public final byte[] b;

                public int getSignatureAlgorithmId() {
                    return C0077.m7191(this);
                }

                public byte[] getValue() {
                    return C0016.m609(this);
                }

                public ContentDigest(int i, byte[] bArr) {
                    this.a = i;
                    this.b = bArr;
                }
            }

            public static class Signature {
                public final int a;
                public final byte[] b;

                public int getAlgorithmId() {
                    return C0078.m7350(this);
                }

                public byte[] getValue() {
                    return C0024.m1977(this);
                }

                public Signature(int i, byte[] bArr) {
                    this.a = i;
                    this.b = bArr;
                }
            }

            public void addError(ApkVerifier.Issue issue, Object... objArr) {
                C0017.m919(C0070.m5870(this), new ApkVerifier.IssueWithParams(issue, objArr));
            }

            public void addWarning(ApkVerifier.Issue issue, Object... objArr) {
                C0017.m919(C0063.m4314(this), new ApkVerifier.IssueWithParams(issue, objArr));
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public boolean containsErrors() {
                return !C0066.m4881(C0070.m5870(this));
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public boolean containsWarnings() {
                return !C0066.m4881(C0063.m4314(this));
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public List<ApkVerifier.IssueWithParams> getErrors() {
                return C0070.m5870(this);
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public List<ApkVerifier.IssueWithParams> getWarnings() {
                return C0063.m4314(this);
            }
        }

        public void addError(ApkVerifier.Issue issue, Object... objArr) {
            C0017.m919(C0072.m6220(this), new ApkVerifier.IssueWithParams(issue, objArr));
        }

        public void addWarning(ApkVerifier.Issue issue, Object... objArr) {
            C0017.m919(C0070.m5907(this), new ApkVerifier.IssueWithParams(issue, objArr));
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public boolean containsErrors() {
            if (!C0066.m4881(C0072.m6220(this))) {
                return true;
            }
            if (C0025.m2084(C0021.m1543(this))) {
                return false;
            }
            Iterator itM4732 = C0065.m4732(C0021.m1543(this));
            while (C0036.m3657(itM4732)) {
                if (C0032.m3125((SignerInfo) C0071.m6012(itM4732))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public boolean containsWarnings() {
            if (!C0066.m4881(C0070.m5907(this))) {
                return true;
            }
            if (C0025.m2084(C0021.m1543(this))) {
                return false;
            }
            Iterator itM4732 = C0065.m4732(C0021.m1543(this));
            while (C0036.m3657(itM4732)) {
                if (C0064.m4639((SignerInfo) C0071.m6012(itM4732))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public List<ApkVerifier.IssueWithParams> getErrors() {
            return C0072.m6220(this);
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public List<ApkVerifier.IssueWithParams> getWarnings() {
            return C0070.m5907(this);
        }

        public Result(int i) {
            super(i);
            this.signingCertificateLineage = null;
            this.signers = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }
    }

    public static class SignatureNotFoundException extends Exception {
        public SignatureNotFoundException(String str) {
            super(str);
        }

        public SignatureNotFoundException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class SignerConfig {
        public List<X509Certificate> certificates;
        public KeyConfig keyConfig;
        public int maxSdkVersion;
        public int minSdkVersion;

        @Deprecated
        public PrivateKey privateKey;
        public List<SignatureAlgorithm> signatureAlgorithms;
        public boolean signerTargetsDevRelease;
        public SigningCertificateLineage signingCertificateLineage;
    }

    public static long access$1100(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static Map<ContentDigestAlgorithm, byte[]> computeContentDigests(RunnablesExecutor runnablesExecutor, Set<ContentDigestAlgorithm> set, DataSource dataSource, DataSource dataSource2, DataSource dataSource3) throws DigestException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        Iterator itM2001 = C0024.m2001(set);
        while (C0036.m3657(itM2001)) {
            ContentDigestAlgorithm contentDigestAlgorithm = (ContentDigestAlgorithm) C0071.m6012(itM2001);
            if (contentDigestAlgorithm == C0067.m5499() || contentDigestAlgorithm == C0063.m4405()) {
                C0077.m7232(hashSet, contentDigestAlgorithm);
            }
        }
        m769(runnablesExecutor, hashSet, new DataSource[]{dataSource, dataSource2, dataSource3}, map);
        ContentDigestAlgorithm contentDigestAlgorithmM997 = C0018.m997();
        if (C0063.m4345(set, contentDigestAlgorithmM997)) {
            ByteBuffer byteBufferM3516 = C0035.m3516(C0034.m3506(contentDigestAlgorithmM997) + 8);
            C0064.m4604(byteBufferM3516, C0072.m6217());
            VerityTreeBuilder verityTreeBuilder = new VerityTreeBuilder(new byte[8]);
            try {
                C0068.m5569(byteBufferM3516, C0019.m1319(verityTreeBuilder, dataSource, dataSource2, dataSource3));
                C0018.m961(byteBufferM3516, C0072.m6146(dataSource) + C0072.m6146(dataSource2) + C0072.m6146(dataSource3));
                C0038.m3969(map, contentDigestAlgorithmM997, C0027.m2445(byteBufferM3516));
                C0039.m4118(verityTreeBuilder);
            } catch (Throwable th) {
                try {
                    C0039.m4118(verityTreeBuilder);
                } catch (Throwable th2) {
                    C0072.m6234(th, th2);
                }
                throw th;
            }
        }
        return map;
    }

    public static void computeOneMbChunkContentDigests(Set<ContentDigestAlgorithm> set, DataSource[] dataSourceArr, Map<ContentDigestAlgorithm, byte[]> map) throws DigestException, IOException {
        long j;
        DataSource[] dataSourceArr2 = dataSourceArr;
        int length = dataSourceArr2.length;
        long j2 = 0;
        int i = 0;
        long jM6146 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= length) {
                break;
            }
            jM6146 += (C0072.m6146(dataSourceArr2[i2]) + 1048575) / 1048576;
            i2++;
        }
        if (jM6146 > 2147483647L) {
            StringBuilder sb = new StringBuilder(C0030.m2840(m765(), 195, 16, 3262));
            C0078.m7466(sb, jM6146);
            C0077.m7290(sb, C0037.m3829(m765(), 211, 7, 2478));
            throw new DigestException(C0068.m5536(sb));
        }
        int i3 = (int) jM6146;
        ContentDigestAlgorithm[] contentDigestAlgorithmArr = (ContentDigestAlgorithm[]) C0065.m4735(set, new ContentDigestAlgorithm[C0068.m5563(set)]);
        int length2 = contentDigestAlgorithmArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        byte[][] bArr = new byte[contentDigestAlgorithmArr.length][];
        int[] iArr = new int[contentDigestAlgorithmArr.length];
        for (int i4 = 0; i4 < contentDigestAlgorithmArr.length; i4++) {
            ContentDigestAlgorithm contentDigestAlgorithm = contentDigestAlgorithmArr[i4];
            int iM3506 = C0034.m3506(contentDigestAlgorithm);
            iArr[i4] = iM3506;
            byte[] bArr2 = new byte[(iM3506 * i3) + 5];
            bArr2[0] = 90;
            C0073.m6350(i3, bArr2, 1);
            bArr[i4] = bArr2;
            messageDigestArr[i4] = C0030.m2835(C0019.m1186(contentDigestAlgorithm));
        }
        DataSink dataSinkM2416 = C0027.m2416(messageDigestArr);
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length3 = dataSourceArr2.length;
        int i5 = 0;
        while (i < length3) {
            DataSource dataSource = dataSourceArr2[i];
            long j3 = j2;
            int i6 = i5;
            long jM61462 = C0072.m6146(dataSource);
            while (jM61462 > j2) {
                int iM2757 = (int) C0029.m2757(jM61462, j);
                C0073.m6350(iM2757, bArr3, 1);
                for (int i7 = 0; i7 < length2; i7++) {
                    C0063.m4423(messageDigestArr[i7], bArr3);
                }
                long j4 = iM2757;
                try {
                    C0018.m1019(dataSource, j3, j4, dataSinkM2416);
                    int i8 = 0;
                    while (i8 < contentDigestAlgorithmArr.length) {
                        MessageDigest messageDigest = messageDigestArr[i8];
                        byte[] bArr4 = bArr[i8];
                        DataSink dataSink = dataSinkM2416;
                        int i9 = iArr[i8];
                        int i10 = length2;
                        int iM826 = C0017.m826(messageDigest, bArr4, (i6 * i9) + 5, i9);
                        if (iM826 != i9) {
                            StringBuilder sb2 = new StringBuilder(C0030.m2840(m765(), 138, 26, 2503));
                            C0077.m7290(sb2, C0064.m4642(messageDigest));
                            C0077.m7290(sb2, C0075.m6791(m765(), 164, 9, 1410));
                            C0021.m1551(sb2, iM826);
                            throw new RuntimeException(C0068.m5536(sb2));
                        }
                        i8++;
                        dataSinkM2416 = dataSink;
                        length2 = i10;
                    }
                    j3 += j4;
                    jM61462 -= j4;
                    i6++;
                    j2 = 0;
                    j = 1048576;
                } catch (IOException e) {
                    throw new IOException(C0071.m6038(i6, C0038.m4022(m765(), 173, 22, 2686)), e);
                }
            }
            i++;
            dataSourceArr2 = dataSourceArr;
            j = 1048576;
            i5 = i6;
            j2 = 0;
        }
        for (int i11 = 0; i11 < contentDigestAlgorithmArr.length; i11++) {
            C0035.m3624(map, contentDigestAlgorithmArr[i11], C0016.m653(messageDigestArr[i11], bArr[i11]));
        }
    }

    public static byte[] encodeAsLengthPrefixedElement(byte[] bArr) {
        return C0066.m4830(new byte[][]{bArr});
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedElements(List<byte[]> list) {
        return C0066.m4830((byte[][]) C0024.m2077(list, new byte[C0034.m3427(list)][]));
    }

    public static Pair<DataSource, Integer> generateApkSigningBlockPadding(DataSource dataSource, boolean z) {
        DataSource chainedDataSource = dataSource;
        int i = 0;
        if (z && C0072.m6146(chainedDataSource) % 4096 != 0) {
            int iM6146 = (int) (4096 - (C0072.m6146(chainedDataSource) % 4096));
            i = iM6146;
            chainedDataSource = new ChainedDataSource(chainedDataSource, C0025.m2149(C0035.m3516(iM6146)));
        }
        return C0025.m2158(chainedDataSource, C0021.m1548(i));
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i, int i2) {
        return C0033.m3363(list, i, i2, false);
    }

    /* JADX INFO: renamed from: ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static short[] m765() {
        if (C0016.m717() <= 0) {
            return f45short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۢ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m766(Object obj) {
        if (C0029.m2791() > 0) {
            return ChunkDigests.access$200((ChunkDigests) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static ContentDigestAlgorithm m767(Object obj) {
        if (C0072.m6216() > 0) {
            return ChunkDigests.m784((ChunkDigests) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m768(Object obj) {
        if (C0018.m1064() > 0) {
            return ChunkDigests.m786((ChunkDigests) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m769(Object obj, Object obj2, Object obj3, Object obj4) throws DigestException {
        if (C0063.m4427() > 0) {
            computeOneMbChunkContentDigests((RunnablesExecutor) obj, (Set) obj2, (DataSource[]) obj3, (Map) obj4);
        }
    }

    public static class NoSupportedSignaturesException extends NoApkSupportedSignaturesException {
        public NoSupportedSignaturesException(String str) {
            super(str);
        }
    }

    public static class SigningSchemeBlockAndDigests {
        public final Map<ContentDigestAlgorithm, byte[]> digestInfo;
        public final Pair<byte[], Integer> signingSchemeBlock;

        public SigningSchemeBlockAndDigests(Pair<byte[], Integer> pair, Map<ContentDigestAlgorithm, byte[]> map) {
            this.signingSchemeBlock = pair;
            this.digestInfo = map;
        }
    }

    public static class SupportedSignature extends ApkSupportedSignature {
        public SupportedSignature(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
            super(signatureAlgorithm, bArr);
        }
    }

    public static class VerityTreeAndDigest {
        public final ContentDigestAlgorithm contentDigestAlgorithm;
        public final byte[] rootHash;
        public final byte[] tree;

        public VerityTreeAndDigest(ContentDigestAlgorithm contentDigestAlgorithm, byte[] bArr, byte[] bArr2) {
            this.contentDigestAlgorithm = contentDigestAlgorithm;
            this.rootHash = bArr;
            this.tree = bArr2;
        }
    }

    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public static VerityTreeAndDigest computeChunkVerityTreeAndDigest(DataSource dataSource) {
        ContentDigestAlgorithm contentDigestAlgorithmM997 = C0018.m997();
        ByteBuffer byteBufferM3516 = C0035.m3516(C0034.m3506(contentDigestAlgorithmM997));
        C0064.m4604(byteBufferM3516, C0072.m6217());
        VerityTreeBuilder verityTreeBuilder = new VerityTreeBuilder(null);
        try {
            ByteBuffer byteBufferM1743 = C0022.m1743(verityTreeBuilder, dataSource);
            C0068.m5569(byteBufferM3516, C0024.m1942(verityTreeBuilder, byteBufferM1743));
            VerityTreeAndDigest verityTreeAndDigest = new VerityTreeAndDigest(contentDigestAlgorithmM997, C0027.m2445(byteBufferM3516), C0027.m2445(byteBufferM1743));
            C0039.m4118(verityTreeBuilder);
            return verityTreeAndDigest;
        } catch (Throwable th) {
            try {
                C0039.m4118(verityTreeBuilder);
            } catch (Throwable th2) {
                C0072.m6234(th, th2);
            }
            throw th;
        }
    }

    public static List<byte[]> encodeCertificates(List<X509Certificate> list) {
        ArrayList arrayList = new ArrayList(C0034.m3427(list));
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            C0017.m919(arrayList, C0064.m4613((X509Certificate) C0071.m6012(itM4732)));
        }
        return arrayList;
    }

    public static byte[] generatePkcs7DerEncodedMessage(byte[] bArr, ByteBuffer byteBuffer, List<X509Certificate> list, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        SignerInfo signerInfo = new SignerInfo();
        signerInfo.version = 1;
        X509Certificate x509Certificate = (X509Certificate) C0071.m6078(list, 0);
        signerInfo.sid = new SignerIdentifier(new IssuerAndSerialNumber(new Asn1OpaqueObject(C0068.m5682(C0067.m5528(x509Certificate))), C0034.m3416(x509Certificate)));
        signerInfo.digestAlgorithm = algorithmIdentifier;
        signerInfo.signatureAlgorithm = algorithmIdentifier2;
        signerInfo.signature = C0020.m1393(bArr);
        SignedData signedData = new SignedData();
        signedData.certificates = new ArrayList(C0034.m3427(list));
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            C0077.m7162(C0022.m1748(signedData), new Asn1OpaqueObject(C0064.m4613((X509Certificate) C0071.m6012(itM4732))));
        }
        signedData.version = 1;
        signedData.digestAlgorithms = C0111.m13086(algorithmIdentifier);
        EncapsulatedContentInfo encapsulatedContentInfo = new EncapsulatedContentInfo(C0022.m1728(m765(), 350, 20, 1990));
        signedData.encapContentInfo = encapsulatedContentInfo;
        encapsulatedContentInfo.content = byteBuffer;
        signedData.signerInfos = C0111.m13086(signerInfo);
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.contentType = C0019.m1189(m765(), 370, 20, 2628);
        contentInfo.content = new Asn1OpaqueObject(C0072.m6214(signedData));
        return C0072.m6214(contentInfo);
    }

    public static List<Pair<Integer, byte[]>> generateSignaturesOverData(SignerConfig signerConfig, byte[] bArr) throws SignatureException, InvalidKeyException {
        String strM2840 = C0030.m2840(m765(), 390, 21, 1451);
        String strM3209 = C0032.m3209(m765(), 411, 44, 1989);
        String strM3431 = C0034.m3431(m765(), 455, 27, 911);
        ArrayList arrayList = new ArrayList(C0034.m3427(C0064.m4591(signerConfig)));
        PublicKey publicKeyM6845 = C0075.m6845((X509Certificate) C0071.m6078(C0066.m4892(signerConfig), 0));
        Iterator itM4732 = C0065.m4732(C0064.m4591(signerConfig));
        while (C0036.m3657(itM4732)) {
            SignatureAlgorithm signatureAlgorithm = (SignatureAlgorithm) C0071.m6012(itM4732);
            Pair pairM2023 = C0024.m2023(signatureAlgorithm);
            String str = (String) C0111.m13157(pairM2023);
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) C0037.m3781(pairM2023);
            try {
                byte[] bArrM4640 = C0064.m4640(C0073.m6403(C0028.m2542(signerConfig), str, algorithmParameterSpec), bArr);
                try {
                    Signature signatureM2131 = C0025.m2131(str);
                    C0072.m6123(signatureM2131, publicKeyM6845);
                    if (algorithmParameterSpec != null) {
                        C0070.m5856(signatureM2131, algorithmParameterSpec);
                    }
                    C0027.m2440(signatureM2131, bArr);
                    if (!C0025.m2194(signatureM2131, bArrM4640)) {
                        StringBuilder sb = new StringBuilder();
                        C0077.m7290(sb, strM3431);
                        C0077.m7290(sb, str);
                        C0077.m7290(sb, strM3209);
                        throw new SignatureException(C0068.m5536(sb));
                    }
                    C0017.m919(arrayList, C0025.m2158(C0021.m1548(C0078.m7437(signatureAlgorithm)), bArrM4640));
                } catch (InvalidAlgorithmParameterException e) {
                    e = e;
                    throw new SignatureException(C0074.m6503(strM3431, str, strM3209), e);
                } catch (InvalidKeyException e2) {
                    throw new InvalidKeyException(C0074.m6503(strM3431, str, strM3209), e2);
                } catch (SignatureException e3) {
                    e = e3;
                    throw new SignatureException(C0074.m6503(strM3431, str, strM3209), e);
                }
            } catch (InvalidAlgorithmParameterException e4) {
                e = e4;
                throw new SignatureException(C0032.m3116(strM2840, str), e);
            } catch (InvalidKeyException e5) {
                throw new InvalidKeyException(C0032.m3116(strM2840, str), e5);
            } catch (SignatureException e6) {
                e = e6;
                throw new SignatureException(C0032.m3116(strM2840, str), e);
            }
        }
        return arrayList;
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i, int i2, boolean z) throws NoSupportedSignaturesException {
        try {
            return C0035.m3636(list, i, i2, z);
        } catch (NoApkSupportedSignaturesException e) {
            throw new NoSupportedSignaturesException(C0033.m3375(e));
        }
    }

    public static byte[] pickBestDigestForV4(Map<ContentDigestAlgorithm, byte[]> map) {
        for (ContentDigestAlgorithm contentDigestAlgorithm : C0111.m13093()) {
            if (C0069.m5786(map, contentDigestAlgorithm)) {
                return (byte[]) C0072.m6108(map, contentDigestAlgorithm);
            }
        }
        return null;
    }

    public static void verifyIntegrity(RunnablesExecutor runnablesExecutor, DataSource dataSource, DataSource dataSource2, ByteBuffer byteBuffer, Set<ContentDigestAlgorithm> set, Result result) {
        String strM7205 = C0077.m7205(m765(), 602, 53, 1392);
        String strM2321 = C0026.m2321(m765(), 655, 49, 3259);
        if (C0036.m3738(set)) {
            throw new RuntimeException(C0037.m3829(m765(), 826, 24, 1038));
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(C0071.m5984(byteBuffer));
        int iM3629 = C0035.m3629(byteBuffer);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0067.m5510(byteBufferM3516, byteBuffer);
        C0020.m1437(byteBufferM3516);
        C0037.m3886(byteBuffer, iM3629);
        C0067.m5417(byteBufferM3516, C0072.m6146(dataSource));
        try {
            Map mapM6190 = C0072.m6190(runnablesExecutor, set, dataSource, dataSource2, new ByteBufferDataSource(byteBufferM3516));
            if (C0069.m5786(mapM6190, C0018.m997())) {
                if (C0072.m6146(dataSource) % 4096 != 0) {
                    StringBuilder sb = new StringBuilder(strM2321);
                    C0078.m7466(sb, C0072.m6146(dataSource));
                    throw new RuntimeException(C0068.m5536(sb));
                }
                long jM13106 = C0111.m13106(byteBuffer) - C0072.m6146(dataSource);
                if (jM13106 % 4096 != 0) {
                    StringBuilder sb2 = new StringBuilder(strM7205);
                    C0078.m7466(sb2, jM13106);
                    throw new RuntimeException(C0068.m5536(sb2));
                }
            }
            if (!C0020.m1434(set, C0030.m2937(mapM6190))) {
                StringBuilder sb3 = new StringBuilder(C0069.m5807(m765(), 704, 77, 2297));
                C0036.m3741(sb3, set);
                C0077.m7290(sb3, C0065.m4757(m765(), 781, 12, 910));
                C0036.m3741(sb3, C0030.m2937(mapM6190));
                throw new RuntimeException(C0068.m5536(sb3));
            }
            Iterator itM4732 = C0065.m4732(C0021.m1543(result));
            while (C0036.m3657(itM4732)) {
                Result.SignerInfo signerInfo = (Result.SignerInfo) C0071.m6012(itM4732);
                Iterator itM47322 = C0065.m4732(C0023.m1795(signerInfo));
                while (C0036.m3657(itM47322)) {
                    Result.SignerInfo.ContentDigest contentDigest = (Result.SignerInfo.ContentDigest) C0071.m6012(itM47322);
                    SignatureAlgorithm signatureAlgorithmM4321 = C0063.m4321(C0026.m2274(contentDigest));
                    if (signatureAlgorithmM4321 != null) {
                        ContentDigestAlgorithm contentDigestAlgorithmM2948 = C0030.m2948(signatureAlgorithmM4321);
                        if (C0063.m4345(set, contentDigestAlgorithmM2948)) {
                            byte[] bArrM3823 = C0037.m3823(contentDigest);
                            byte[] bArr = (byte[]) C0072.m6108(mapM6190, contentDigestAlgorithmM2948);
                            if (C0073.m6306(bArrM3823, bArr)) {
                                C0035.m3624(C0065.m4718(signerInfo), contentDigestAlgorithmM2948, bArr);
                            } else {
                                int iM707 = C0016.m707(result);
                                if (iM707 == 2) {
                                    C0038.m3966(signerInfo, C0028.m2621(), new Object[]{contentDigestAlgorithmM2948, C0027.m2472(bArrM3823), C0027.m2472(bArr)});
                                } else if (iM707 == 3) {
                                    C0038.m3966(signerInfo, C0028.m2596(), new Object[]{contentDigestAlgorithmM2948, C0027.m2472(bArrM3823), C0027.m2472(bArr)});
                                }
                            }
                        }
                    }
                }
            }
        } catch (DigestException e) {
            throw new RuntimeException(C0023.m1904(m765(), 793, 33, 777), e);
        }
    }

    public static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        C0074.m6567(byteBuffer);
    }

    public static int compareSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2) {
        return C0063.m4323(signatureAlgorithm, signatureAlgorithm2);
    }

    public static DataSource copyWithModifiedCDOffset(DataSource dataSource, DataSource dataSource2) {
        long jM6146 = C0072.m6146(dataSource);
        ByteBuffer byteBufferM3516 = C0035.m3516((int) C0072.m6146(dataSource2));
        C0064.m4604(byteBufferM3516, C0072.m6217());
        C0028.m2603(dataSource2, 0L, (int) C0072.m6146(dataSource2), byteBufferM3516);
        C0020.m1437(byteBufferM3516);
        C0067.m5417(byteBufferM3516, jM6146);
        return C0025.m2149(byteBufferM3516);
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedElements(byte[][] bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length + 4;
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(length);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        for (byte[] bArr3 : bArr) {
            C0038.m4018(byteBufferM3516, bArr3.length);
            C0068.m5569(byteBufferM3516, bArr3);
        }
        return C0027.m2445(byteBufferM3516);
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(List<Pair<Integer, byte[]>> list) {
        return C0073.m6363(list);
    }

    public static byte[] encodePublicKey(PublicKey publicKey) throws InvalidKeyException {
        byte[] bArrM2820 = null;
        if (C0070.m5838(C0077.m7205(m765(), 218, 5, 1910), C0074.m6448(publicKey))) {
            byte[] bArrM2096 = C0025.m2096(publicKey);
            String strM5875 = C0070.m5875(publicKey);
            if (!C0070.m5838(C0037.m3829(m765(), 223, 3, 1761), strM5875) && !C0070.m5838(C0035.m3603(m765(), 226, 20, 3274), strM5875)) {
                bArrM2820 = bArrM2096;
            } else {
                try {
                    SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) C0036.m3643(C0020.m1393(bArrM2096), SubjectPublicKeyInfo.class);
                    ByteBuffer byteBufferM3761 = C0036.m3761(subjectPublicKeyInfo);
                    byte bM5826 = C0069.m5826(byteBufferM3761);
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) C0036.m3643(byteBufferM3761, RSAPublicKey.class);
                    if (C0016.m624(C0078.m7325(rSAPublicKey), C0068.m5582()) < 0) {
                        byte[] bArrM1333 = C0020.m1333(C0078.m7325(rSAPublicKey));
                        byte[] bArr = new byte[bArrM1333.length + 1];
                        bArr[0] = 0;
                        C0027.m2519(bArrM1333, 0, bArr, 1, bArrM1333.length);
                        rSAPublicKey.modulus = new BigInteger(bArr);
                        byte[] bArrM6214 = C0072.m6214(rSAPublicKey);
                        byte[] bArr2 = new byte[bArrM6214.length + 1];
                        bArr2[0] = bM5826;
                        C0027.m2519(bArrM6214, 0, bArr2, 1, bArrM6214.length);
                        subjectPublicKeyInfo.subjectPublicKey = C0020.m1393(bArr2);
                        bArrM2096 = C0072.m6214(subjectPublicKeyInfo);
                    }
                    bArrM2820 = bArrM2096;
                } catch (Asn1DecodingException | Asn1EncodingException e) {
                    PrintStream printStreamM3219 = C0032.m3219();
                    StringBuilder sb = new StringBuilder(C0036.m3678(m765(), 246, 44, 1944));
                    C0036.m3741(sb, e);
                    C0065.m4767(printStreamM3219, C0068.m5536(sb));
                    C0033.m3347(e);
                }
            }
        }
        String strM4828 = C0066.m4828(m765(), 290, 10, 2770);
        String strM3330 = C0033.m3330(m765(), 300, 50, 2559);
        if (bArrM2820 == null) {
            try {
                bArrM2820 = C0029.m2820((X509EncodedKeySpec) C0070.m5865(C0111.m13063(C0070.m5875(publicKey)), publicKey, X509EncodedKeySpec.class));
            } catch (InvalidKeySpecException e2) {
                StringBuilder sb2 = new StringBuilder(strM3330);
                C0036.m3741(sb2, publicKey);
                C0077.m7290(sb2, strM4828);
                C0077.m7290(sb2, C0038.m3997(C0030.m2951(publicKey)));
                throw new InvalidKeyException(C0068.m5536(sb2), e2);
            }
        }
        if (bArrM2820 != null && bArrM2820.length != 0) {
            return bArrM2820;
        }
        StringBuilder sb3 = new StringBuilder(strM3330);
        C0036.m3741(sb3, publicKey);
        C0077.m7290(sb3, strM4828);
        C0077.m7290(sb3, C0038.m3997(C0030.m2951(publicKey)));
        throw new InvalidKeyException(C0068.m5536(sb3));
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer byteBuffer, int i, Result result) throws SignatureNotFoundException {
        try {
            return C0074.m6443(byteBuffer, i);
        } catch (com.android.apksig.internal.apk.SignatureNotFoundException e) {
            throw new SignatureNotFoundException(C0033.m3375(e));
        }
    }

    public static SignatureInfo findSignature(DataSource dataSource, ApkUtils.ZipSections zipSections, int i, Result result) throws SignatureNotFoundException {
        try {
            return C0016.m644(dataSource, zipSections, i);
        } catch (com.android.apksig.internal.apk.SignatureNotFoundException e) {
            throw new SignatureNotFoundException(C0033.m3375(e));
        }
    }

    public static byte[] generateApkSigningBlock(List<Pair<byte[], Integer>> list) {
        ByteBuffer byteBufferM4604;
        Iterator itM4732 = C0065.m4732(list);
        int length = 0;
        while (C0036.m3657(itM4732)) {
            length += ((byte[]) C0111.m13157((Pair) C0071.m6012(itM4732))).length + 12;
        }
        int i = length + 32;
        int i2 = i % 4096;
        if (i2 != 0) {
            int i3 = 4096 - i2;
            if (i3 < 12) {
                i3 = 8192 - i2;
            }
            byteBufferM4604 = C0064.m4604(C0035.m3516(i3), C0072.m6217());
            C0018.m961(byteBufferM4604, i3 - 8);
            C0038.m4018(byteBufferM4604, VERITY_PADDING_BLOCK_ID);
            C0038.m3987(byteBufferM4604);
            i += i3;
        } else {
            byteBufferM4604 = null;
        }
        ByteBuffer byteBufferM3516 = C0035.m3516(i);
        C0064.m4604(byteBufferM3516, C0072.m6217());
        long j = ((long) i) - 8;
        C0018.m961(byteBufferM3516, j);
        Iterator itM47322 = C0065.m4732(list);
        while (C0036.m3657(itM47322)) {
            Pair pair = (Pair) C0071.m6012(itM47322);
            byte[] bArr = (byte[]) C0111.m13157(pair);
            int iM2170 = C0025.m2170((Integer) C0037.m3781(pair));
            C0018.m961(byteBufferM3516, ((long) bArr.length) + 4);
            C0038.m4018(byteBufferM3516, iM2170);
            C0068.m5569(byteBufferM3516, bArr);
        }
        if (byteBufferM4604 != null) {
            C0067.m5510(byteBufferM3516, byteBufferM4604);
        }
        C0018.m961(byteBufferM3516, j);
        C0068.m5569(byteBufferM3516, C0026.m2300());
        return C0027.m2445(byteBufferM3516);
    }

    public static List<Pair<List<X509Certificate>, byte[]>> getApkSignatureBlockSigners(byte[] bArr) {
        ByteBuffer byteBufferM1393 = C0020.m1393(bArr);
        C0064.m4604(byteBufferM1393, C0072.m6217());
        ByteBuffer byteBufferM5463 = C0067.m5463(byteBufferM1393);
        ArrayList arrayList = new ArrayList();
        while (C0111.m13127(byteBufferM5463)) {
            ByteBuffer byteBufferM54632 = C0067.m5463(byteBufferM5463);
            byte[] bArr2 = new byte[C0071.m5984(byteBufferM54632)];
            C0029.m2812(byteBufferM54632, bArr2);
            C0038.m3987(byteBufferM54632);
            ByteBuffer byteBufferM54633 = C0067.m5463(byteBufferM54632);
            C0067.m5463(byteBufferM54633);
            ByteBuffer byteBufferM54634 = C0067.m5463(byteBufferM54633);
            ArrayList arrayList2 = new ArrayList();
            while (C0111.m13127(byteBufferM54634)) {
                int iM4566 = C0064.m4566(byteBufferM54634);
                byte[] bArr3 = new byte[iM4566];
                if (iM4566 <= C0071.m5984(byteBufferM54634)) {
                    C0029.m2812(byteBufferM54634, bArr3);
                    C0017.m919(arrayList2, new GuaranteedEncodedFormX509Certificate(C0020.m1370(bArr3), bArr3));
                } else {
                    StringBuilder sb = new StringBuilder(C0067.m5418(m765(), 482, 11, 1316));
                    C0021.m1551(sb, C0018.m1084(arrayList2) + 1);
                    C0077.m7290(sb, C0031.m3047(m765(), 493, 20, 756));
                    C0021.m1551(sb, C0018.m1084(arrayList) + 1);
                    C0077.m7290(sb, C0039.m4066(m765(), InputDeviceCompat.SOURCE_DPAD, 20, 338));
                    C0021.m1551(sb, iM4566);
                    throw new IllegalArgumentException(C0068.m5536(sb));
                }
            }
            C0017.m919(arrayList, C0025.m2158(arrayList2, bArr2));
        }
        return arrayList;
    }

    public static List<Pair<byte[], Integer>> getApkSignatureBlocks(DataSource dataSource) {
        long jM6146 = C0072.m6146(dataSource);
        if (C0072.m6146(dataSource) <= 2147483647L && jM6146 >= 32) {
            ByteBuffer byteBufferM6568 = C0074.m6568(dataSource, 8L, ((int) C0072.m6146(dataSource)) - 32);
            C0064.m4604(byteBufferM6568, C0072.m6217());
            ArrayList arrayList = new ArrayList();
            while (C0111.m13127(byteBufferM6568)) {
                long jM2869 = C0030.m2869(byteBufferM6568);
                if (jM2869 <= 2147483647L && jM2869 >= 4) {
                    int iM4566 = C0064.m4566(byteBufferM6568);
                    byte[] bArr = new byte[((int) jM2869) - 4];
                    C0029.m2812(byteBufferM6568, bArr);
                    C0017.m919(arrayList, C0025.m2158(bArr, C0021.m1548(iM4566)));
                } else {
                    StringBuilder sb = new StringBuilder(C0026.m2321(m765(), 533, 12, 1520));
                    C0021.m1551(sb, C0018.m1084(arrayList) + 1);
                    C0077.m7290(sb, C0071.m5991(m765(), 545, 20, 2603));
                    C0078.m7466(sb, jM2869);
                    throw new IllegalArgumentException(C0068.m5536(sb));
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(C0039.m4094(jM6146, C0035.m3603(m765(), 565, 37, 834)));
    }

    public static ByteBuffer getLengthPrefixedSlice(ByteBuffer byteBuffer) {
        return C0111.m13168(byteBuffer);
    }

    public static byte[] readLengthPrefixedByteArray(ByteBuffer byteBuffer) {
        return C0026.m2313(byteBuffer);
    }

    public static String toHex(byte[] bArr) {
        return C0071.m6092(bArr);
    }

    public static Pair<List<SignerConfig>, Map<ContentDigestAlgorithm, byte[]>> computeContentDigests(RunnablesExecutor runnablesExecutor, DataSource dataSource, DataSource dataSource2, DataSource dataSource3, List<SignerConfig> list) throws SignatureException, IOException {
        if (!C0025.m2084(list)) {
            HashSet hashSet = new HashSet(1);
            Iterator itM4732 = C0065.m4732(list);
            while (C0036.m3657(itM4732)) {
                Iterator itM47322 = C0065.m4732(C0064.m4591((SignerConfig) C0071.m6012(itM4732)));
                while (C0036.m3657(itM47322)) {
                    C0077.m7232(hashSet, C0030.m2948((SignatureAlgorithm) C0071.m6012(itM47322)));
                }
            }
            try {
                return C0025.m2158(list, C0072.m6190(runnablesExecutor, hashSet, dataSource, dataSource2, dataSource3));
            } catch (IOException e) {
                throw new IOException(C0016.m625(m765(), 32, 31, 1279), e);
            } catch (DigestException e2) {
                throw new SignatureException(C0078.m7427(m765(), 0, 32, 2831), e2);
            }
        }
        throw new IllegalArgumentException(C0071.m5991(m765(), 63, 52, 1377));
    }

    public static void computeOneMbChunkContentDigests(RunnablesExecutor runnablesExecutor, Set<ContentDigestAlgorithm> set, DataSource[] dataSourceArr, Map<ContentDigestAlgorithm, byte[]> map) throws DigestException {
        long jM6146 = 0;
        for (DataSource dataSource : dataSourceArr) {
            jM6146 += (C0072.m6146(dataSource) + 1048575) / 1048576;
        }
        if (jM6146 <= 2147483647L) {
            int i = (int) jM6146;
            ArrayList arrayList = new ArrayList(C0068.m5563(set));
            Iterator itM2001 = C0024.m2001(set);
            while (C0036.m3657(itM2001)) {
                C0017.m919(arrayList, new ChunkDigests((ContentDigestAlgorithm) C0071.m6012(itM2001), i, null));
            }
            C0034.m3496(runnablesExecutor, new a(new ChunkSupplier(dataSourceArr, null), arrayList));
            Iterator itM4154 = C0039.m4154(arrayList);
            while (C0036.m3657(itM4154)) {
                ChunkDigests chunkDigests = (ChunkDigests) C0071.m6012(itM4154);
                C0035.m3624(map, m767(chunkDigests), C0016.m653(m766(chunkDigests), m768(chunkDigests)));
            }
            return;
        }
        StringBuilder sb = new StringBuilder(C0035.m3603(m765(), 115, 16, 2186));
        C0078.m7466(sb, jM6146);
        C0077.m7290(sb, C0076.m6902(m765(), 131, 7, 2602));
        throw new DigestException(C0068.m5536(sb));
    }
}
