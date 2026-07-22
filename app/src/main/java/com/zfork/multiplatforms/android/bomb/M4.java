package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.KeyConfig;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsType;
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
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class M4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f267short = {1071, 1038, 1089, 1041, 1024, 1042, 1042, 1046, 1038, 1043, 1029, 1042, 2722, 2691, 2764, 2695, 2697, 2709, 2764, 2716, 2701, 2719, 2719, 2715, 2691, 2718, 2696, 2719, 310, 272, 263, 257, 284, 275, 284, 278, 276, 257, 272, 341, 275, 284, 281, 272, 341, 349, 344, 344, 278, 272, 263, 257, 348, 341, 280, 256, 262, 257, 341, 279, 272, 341, 262, 261, 272, 278, 284, 275, 284, 272, 273, 308, 314, 294, 383, 318, 307, 310, 318, 300, 383, 375, 370, 370, 308, 300, 370, 308, 314, 294, 370, 318, 307, 310, 318, 300, 374, 383, 310, 300, 383, 301, 314, 302, 298, 310, 301, 314, 315, 383, 310, 313, 383, 308, 300, 370, 299, 294, 303, 314, 383, 310, 300, 383, 318, 383, 316, 307, 304, 298, 315, 383, 276, 274, 268, 2189, 2186, 2202, 2199, 2192, 3050, 3046, 3047, 3055, 3040, 3054, 3068, 3067, 3052, 1326, 1280, 1308, 1302, 1297, 1290, 1303, 1280, 1349, 1333, 1303, 1290, 1299, 1292, 1281, 1280, 1303, 1349, 1286, 1289, 1284, 1302, 1302, 1349, 548, 618, 619, 624, 548, 631, 625, 614, 615, 616, 613, 631, 631, 548, 619, 610, 548, 692, 666, 646, 652, 651, 656, 653, 666, 735, 655, 670, 652, 652, 648, 656, 653, 667, 735, 665, 656, 653, 735, 1182, 1183, 1182, 1173, 1579, 1640, 1636, 1637, 1663, 1642, 1634, 1637, 1656, 1579, 1638, 1662, 1639, 1663, 1634, 1659, 1639, 1646, 1579, 1632, 1646, 1650, 1579, 1646, 1637, 1663, 1657, 1634, 1646, 1656, 1573, 1579, 1574, 1574, 1632, 1656, 1574, 1632, 1646, 1650, 1574, 1642, 1639, 1634, 1642, 1656, 1579, 1636, 1659, 1663, 1634, 1636, 1637, 1579, 1638, 1662, 1656, 1663, 1579, 1641, 1646, 1579, 1662, 1656, 1646, 1647, 1579, 1663, 1636, 1579, 1656, 1659, 1646, 1640, 1634, 1645, 1650, 1579, 1660, 1635, 1634, 1640, 1635, 1579, 1646, 1637, 1663, 1657, 1650, 1579, 1663, 1636, 1579, 1662, 1656, 1646, 1573, 2910, 2842, 2833, 2843, 2829, 2910, 2832, 2833, 2826, 2910, 2845, 2833, 2832, 2826, 2847, 2839, 2832, 2910, 2837, 2843, 2823, 2910, 2843, 2832, 2826, 2828, 2839, 2843, 2829, 2021, 2023, 1955, 1960, 1954, 1972, 2023, 1961, 1960, 1971, 2023, 1956, 1960, 1961, 1971, 1958, 1966, 1961, 2023, 1958, 2023, 1964, 1954, 1982, 2179, 2246, 2253, 2263, 2257, 2266, 2179, 2177, 650, 648, 728, 713, 731, 731, 735, 711, 730, 716, 648, 718, 711, 730, 648, 2423, 2393, 2373, 2332, 2334, 3057, 3059, 2999, 3004, 2998, 2976, 3059, 3005, 3004, 2983, 3059, 2992, 3004, 3005, 2983, 2994, 3002, 3005, 3059, 2992, 2998, 2977, 2983, 3002, 2997, 3002, 2992, 2994, 2983, 2998, 2976, 1271, 1269, 1201, 1210, 1200, 1190, 1269, 1211, 1210, 1185, 1269, 1206, 1210, 1211, 1185, 1204, 1212, 1211, 1269, 1204, 1269, 1189, 1191, 1212, 1187, 1204, 1185, 1200, 1269, 1214, 1200, 1196, 1275, 1269, 1180, 1185, 1269, 1206, 1210, 1211, 1185, 1204, 1212, 1211, 1190, 1269, 1204, 1269, 1214, 1200, 1196, 1269, 1210, 1203, 1269, 1204, 1209, 1202, 1210, 1191, 1212, 1185, 1213, 1208, 1263, 1269, 2168, 2143, 2135, 2130, 2139, 2138, 2078, 2122, 2129, 2078, 2129, 2140, 2122, 2143, 2135, 2128, 2078, 2133, 2139, 2119, 2078, 2121, 2135, 2122, 2134, 2078, 2143, 2130, 2135, 2143, 2125, 2078, 2076, 1495, 1493, 1427, 1415, 1434, 1432, 1493, 602, 596, 547, 518, 539, 538, 531, 596, 516, 533, 519, 519, 515, 539, 518, 528, 587, 2948, 2981, 3050, 2977, 2991, 2995, 3001, 3006, 2981, 3000, 2991, 3050, 3002, 2987, 3001, 3001, 3005, 2981, 3000, 2990, 3001, 2138, 2138, 2076, 2052, 2135, 2070, 2073, 2067, 2135, 2138, 2138, 2068, 2066, 2053, 2051, 2135, 2074, 2070, 2062, 2135, 2073, 2072, 2051, 2135, 2069, 2066, 2135, 2052, 2055, 2066, 2068, 2078, 2065, 2078, 2066, 2067, 2135, 2070, 2051, 2135, 2051, 2079, 2066, 2135, 2052, 2070, 2074, 2066, 2135, 2051, 2078, 2074, 2066, 912, 912, 982, 974, 925, 988, 979, 985, 925, 912, 912, 982, 984, 964, 925, 976, 988, 964, 925, 979, 978, 969, 925, 991, 984, 925, 974, 973, 984, 990, 980, 987, 980, 984, 985, 925, 988, 969, 925, 969, 981, 984, 925, 974, 988, 976, 984, 925, 969, 980, 976, 984, 699, 665, 642, 669, 650, 671, 654, 715, 640, 654, 658, 715, 667, 650, 664, 664, 668, 644, 665, 655, 715, 653, 644, 665, 715, 1440, 1441, 1459, 840, 846, 1812, 1795, 1809, 1395, 1362, 1353, 1309, 1372, 1363, 1309, 1391, 1390, 1404, 1297, 1309, 1400, 1406, 1297, 1309, 1362, 1359, 1309, 1401, 1390, 1404, 1309, 1357, 1359, 1364, 1355, 1372, 1353, 1368, 1309, 1366, 1368, 1348, 1529, 1502, 1494, 1491, 1498, 1499, 1439, 1483, 1488, 1439, 1491, 1488, 1502, 1499, 1439, 1519, 1524, 1532, 1516, 1439, 1436, 1415, 1439, 1498, 1489, 1500, 1488, 1499, 1498, 1499, 1439, 1487, 1485, 1494, 1481, 1502, 1483, 1498, 1439, 1492, 1498, 1478, 1439, 1497, 1485, 1488, 1490, 1439, 733, 762, 754, 759, 766, 767, 699, 751, 756, 699, 747, 762, 745, 744, 766, 699, 766, 757, 760, 745, 738, 747, 751, 766, 767, 699, 747, 745, 754, 749, 762, 751, 766, 699, 752, 766, 738, 699, 761, 759, 756, 761, 699, 1419, 1449, 1458, 1453, 1466, 1455, 1470, 1531, 1456, 1470, 1442, 1531, 1469, 1458, 1463, 1470, 1531, 1523, 1526, 1526, 1456, 1470, 1442, 1522, 1531, 1462, 1454, 1448, 1455, 1531, 1465, 1470, 1531, 1448, 1451, 1470, 1464, 1458, 1469, 1458, 1470, 1471, 2603, 2565, 2585, 2611, 2580, 2575, 2578, 2565, 2624, 2632, 2637, 2637, 2571, 2579, 2633, 2636, 2624, 2576, 2578, 2569, 2582, 2561, 2580, 2565, 2624, 2571, 2565, 2585, 2624, 2566, 2569, 2572, 2565, 2624, 2632, 2637, 2637, 2571, 2565, 2585, 2633, 2636, 2624, 2575, 2578, 2624, 2571, 2565, 2585, 2624, 2561, 2572, 2569, 2561, 2579, 2624, 2561, 2574, 2564, 2624, 2563, 2572, 2575, 2581, 2564, 2624, 2576, 2578, 2575, 2582, 2569, 2564, 2565, 2578, 2624, 2632, 2637, 2637, 2571, 2579, 2637, 2571, 2565, 2585, 2637, 2561, 2572, 2569, 2561, 2579, 2624, 2561, 2574, 2564, 2624, 2637, 2637, 2571, 2579, 2637, 2580, 2585, 2576, 2565, 2633, 2624, 2573, 2581, 2579, 2580, 2624, 2562, 2565, 2624, 2579, 2576, 2565, 2563, 2569, 2566, 2569, 2565, 2564};
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Charset f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public KeyConfig n;
    public List o;
    public final SigningCertificateLineage.SignerCapabilities.Builder p = new SigningCertificateLineage.SignerCapabilities.Builder();
    public int q;
    public SigningCertificateLineage r;

    /* JADX INFO: renamed from: ۟۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m6966(Object obj, Object obj2) {
        if (C0077.m7272() < 0) {
            return ((Optional) obj).orElse(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6967() {
        if (C0035.m3569() < 0) {
            return f267short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static Optional m6968(Object obj) {
        if (C0075.m6893() > 0) {
            return ((Stream) obj).findFirst();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۥ۠, reason: contains not printable characters */
    public static Stream m6969(Object obj, Object obj2) {
        if (C0025.m2132() >= 0) {
            return ((Stream) obj).filter((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Stream m6970(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return ((Stream) obj).map((Function) obj2);
        }
        return null;
    }

    public final void e(F3 f3) {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec;
        PrivateKey privateKeyM2469;
        KeyStore keyStoreM3403;
        Provider provider;
        Key keyM1875;
        int i = 0;
        String strM3332 = null;
        KmsType kmsType = (KmsType) m6966(m6968(m6969(C0066.m4910(C0032.m3162()), new L4(i, this))), null);
        if (kmsType != null) {
            if (C0033.m3332(this) == null) {
                throw new E3(C0022.m1728(m6967(), 71, 64, 351));
            }
            this.o = C0020.m1390(C0073.m6375(this));
            this.n = new KeyConfig.Kms(kmsType, C0033.m3332(this));
            return;
        }
        String strM6181 = C0072.m6181(this);
        String strM5942 = C0070.m5942(m6967(), 135, 5, 2302);
        if (strM6181 == null) {
            if (C0064.m4624(this) == null) {
                throw new E3(C0035.m3603(m6967(), 874, 123, 2656));
            }
            this.o = C0020.m1390(C0073.m6375(this));
            String strM4624 = C0064.m4624(this);
            if (strM4624 == null) {
                throw new E3(C0017.m936(m6967(), 832, 42, 1499));
            }
            File file = new File(strM4624);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int iM3621 = C0035.m3621(fileInputStream, bArr);
                    if (iM3621 == -1) {
                        break;
                    } else {
                        C0036.m3734(byteArrayOutputStream, bArr, 0, iM3621);
                    }
                }
                C0016.m636(fileInputStream);
                byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
                try {
                    EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(bArrM7297);
                    String strM3471 = C0034.m3471(this);
                    if (strM3471 != null) {
                        strM5942 = strM3471;
                    }
                    Charset charsetM4434 = C0063.m4434(this);
                    Charset[] charsetArr = charsetM4434 != null ? new Charset[]{charsetM4434} : new Charset[0];
                    StringBuilder sb = new StringBuilder();
                    C0077.m7290(sb, C0072.m6116(m6967(), 674, 25, 747));
                    C0077.m7290(sb, C0069.m5801(this));
                    pKCS8EncodedKeySpec = C0078.m7333(encryptedPrivateKeyInfo, C0065.m4743(f3, strM5942, C0068.m5536(sb), charsetArr));
                } catch (IOException e) {
                    if (C0034.m3471(this) != null) {
                        throw new InvalidKeySpecException(C0032.m3232(C0067.m5418(m6967(), 789, 43, 667), strM4624), e);
                    }
                    pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrM7297);
                }
                try {
                    try {
                        try {
                            try {
                                privateKeyM2469 = C0027.m2469(C0111.m13063(C0025.m2151(m6967(), 699, 3, 1522)), pKCS8EncodedKeySpec);
                            } catch (InvalidKeySpecException unused) {
                                throw new InvalidKeySpecException(C0024.m1945(m6967(), 707, 34, 1341));
                            }
                        } catch (InvalidKeySpecException unused2) {
                            privateKeyM2469 = C0027.m2469(C0111.m13063(C0030.m2840(m6967(), 704, 3, 1872)), pKCS8EncodedKeySpec);
                        }
                    } catch (InvalidKeySpecException unused3) {
                        privateKeyM2469 = C0027.m2469(C0111.m13063(C0066.m4828(m6967(), 702, 2, 781)), pKCS8EncodedKeySpec);
                    }
                    this.n = new KeyConfig.Jca(privateKeyM2469);
                    return;
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeySpecException(C0032.m3232(C0019.m1189(m6967(), 741, 48, 1471), strM4624), e2);
                }
            } catch (Throwable th) {
                try {
                    C0016.m636(fileInputStream);
                } catch (Throwable th2) {
                    C0072.m6234(th, th2);
                }
                throw th;
            }
        }
        if (C0064.m4624(this) != null) {
            throw new E3(C0067.m5418(m6967(), 622, 52, 957));
        }
        if (C0073.m6375(this) != null) {
            throw new E3(C0037.m3829(m6967(), 569, 53, 2167));
        }
        String strM6519 = C0074.m6519(this);
        if (strM6519 == null) {
            strM6519 = C0064.m4622();
        }
        String strM4784 = C0065.m4784(this);
        if (strM4784 != null) {
            keyStoreM3403 = C0074.m6566(strM6519, strM4784);
        } else {
            String strM6071 = C0071.m6071(this);
            if (strM6071 != null) {
                Class clsM4101 = C0039.m4101(strM6071);
                if (!C0031.m2999(Provider.class, clsM4101)) {
                    StringBuilder sb2 = new StringBuilder(C0017.m936(m6967(), 149, 24, 1381));
                    C0077.m7290(sb2, C0071.m6071(this));
                    C0077.m7290(sb2, C0039.m4066(m6967(), 173, 17, 516));
                    C0077.m7290(sb2, C0038.m3997(Provider.class));
                    throw new E3(C0068.m5536(sb2));
                }
                if (C0033.m3352(this) != null) {
                    try {
                        provider = (Provider) C0019.m1220(C0066.m4883(clsM4101, new Class[]{String.class}), new Object[]{C0033.m3352(this)});
                    } catch (NoSuchMethodException unused4) {
                        provider = (Provider) C0070.m5924(C0029.m2690(clsM4101, C0023.m1904(m6967(), 140, 9, 2953), new Class[]{String.class}), (Provider) C0019.m1220(C0066.m4883(clsM4101, null), null), new Object[]{C0033.m3352(this)});
                    }
                } else {
                    provider = (Provider) C0019.m1220(C0066.m4883(clsM4101, null), null);
                }
                keyStoreM3403 = C0066.m4798(strM6519, provider);
            } else {
                keyStoreM3403 = C0034.m3403(strM6519);
            }
        }
        String strM1530 = C0021.m1530(this);
        if (strM1530 == null) {
            strM1530 = strM5942;
        }
        Charset charsetM44342 = C0063.m4434(this);
        Charset[] charsetArr2 = charsetM44342 != null ? new Charset[]{charsetM44342} : new Charset[0];
        StringBuilder sb3 = new StringBuilder(C0063.m4315(m6967(), 190, 22, 767));
        C0077.m7290(sb3, C0069.m5801(this));
        ArrayList arrayListM4743 = C0065.m4743(f3, strM1530, C0068.m5536(sb3), charsetArr2);
        String strM61812 = C0070.m5838(C0023.m1904(m6967(), 212, 4, 1232), C0072.m6181(this)) ? null : C0072.m6181(this);
        Iterator itM4154 = C0039.m4154(arrayListM4743);
        Exception e3 = null;
        while (C0036.m3657(itM4154)) {
            char[] cArr = (char[]) C0071.m6012(itM4154);
            try {
                if (strM61812 != null) {
                    FileInputStream fileInputStream2 = new FileInputStream(strM61812);
                    try {
                        continue;
                        C0070.m5885(keyStoreM3403, fileInputStream2, cArr);
                        C0016.m636(fileInputStream2);
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th3) {
                        }
                    }
                } else {
                    C0070.m5885(keyStoreM3403, null, cArr);
                }
                try {
                    if (C0033.m3332(this) == null) {
                        Enumeration enumerationM2119 = C0025.m2119(keyStoreM3403);
                        if (enumerationM2119 != null) {
                            while (C0068.m5570(enumerationM2119)) {
                                String str = (String) C0073.m6330(enumerationM2119);
                                if (C0027.m2470(keyStoreM3403, str)) {
                                    try {
                                        if (C0033.m3332(this) != null) {
                                            StringBuilder sb4 = new StringBuilder();
                                            C0077.m7290(sb4, C0072.m6181(this));
                                            C0077.m7290(sb4, C0078.m7427(m6967(), 216, 97, 1547));
                                            throw new E3(C0068.m5536(sb4));
                                        }
                                        this.c = str;
                                    } catch (UnrecoverableKeyException e4) {
                                        e = e4;
                                        strM3332 = str;
                                    }
                                }
                            }
                        }
                        if (C0033.m3332(this) == null) {
                            StringBuilder sb5 = new StringBuilder();
                            C0077.m7290(sb5, C0072.m6181(this));
                            C0077.m7290(sb5, C0034.m3431(m6967(), 313, 29, 2942));
                            throw new E3(C0068.m5536(sb5));
                        }
                    }
                    strM3332 = C0033.m3332(this);
                    boolean zM2470 = C0027.m2470(keyStoreM3403, strM3332);
                    String strM1945 = C0024.m1945(m6967(), 342, 24, 1991);
                    String strM1728 = C0022.m1728(m6967(), 366, 8, 2211);
                    if (!zM2470) {
                        StringBuilder sb6 = new StringBuilder();
                        C0077.m7290(sb6, C0072.m6181(this));
                        C0077.m7290(sb6, strM1728);
                        C0077.m7290(sb6, strM3332);
                        C0077.m7290(sb6, strM1945);
                        throw new E3(C0068.m5536(sb6));
                    }
                    String strM34712 = C0034.m3471(this);
                    String strM3431 = C0034.m3431(m6967(), 374, 15, 680);
                    String strM1904 = C0023.m1904(m6967(), 389, 5, 2364);
                    if (strM34712 != null) {
                        StringBuilder sb7 = new StringBuilder();
                        C0077.m7290(sb7, strM1904);
                        C0077.m7290(sb7, strM3332);
                        C0077.m7290(sb7, strM3431);
                        C0077.m7290(sb7, C0069.m5801(this));
                        keyM1875 = C0023.m1875(keyStoreM3403, strM3332, C0065.m4743(f3, strM34712, C0068.m5536(sb7), charsetArr2));
                    } else {
                        try {
                            keyM1875 = C0023.m1875(keyStoreM3403, strM3332, arrayListM4743);
                        } catch (UnrecoverableKeyException unused5) {
                            StringBuilder sb8 = new StringBuilder();
                            C0077.m7290(sb8, strM1904);
                            C0077.m7290(sb8, strM3332);
                            C0077.m7290(sb8, strM3431);
                            C0077.m7290(sb8, C0069.m5801(this));
                            keyM1875 = C0023.m1875(keyStoreM3403, strM3332, C0065.m4743(f3, strM5942, C0068.m5536(sb8), charsetArr2));
                        }
                    }
                    if (keyM1875 == null) {
                        StringBuilder sb9 = new StringBuilder();
                        C0077.m7290(sb9, C0072.m6181(this));
                        C0077.m7290(sb9, strM1728);
                        C0077.m7290(sb9, strM3332);
                        C0077.m7290(sb9, strM1945);
                        throw new E3(C0068.m5536(sb9));
                    }
                    if (!(keyM1875 instanceof PrivateKey)) {
                        StringBuilder sb10 = new StringBuilder();
                        C0077.m7290(sb10, C0072.m6181(this));
                        C0077.m7290(sb10, strM1728);
                        C0077.m7290(sb10, strM3332);
                        C0077.m7290(sb10, C0069.m5807(m6967(), 425, 66, 1237));
                        C0077.m7290(sb10, C0070.m5875(keyM1875));
                        throw new E3(C0068.m5536(sb10));
                    }
                    this.n = new KeyConfig.Jca((PrivateKey) keyM1875);
                    Certificate[] certificateArrM3560 = C0035.m3560(keyStoreM3403, strM3332);
                    if (certificateArrM3560 == null || certificateArrM3560.length == 0) {
                        StringBuilder sb11 = new StringBuilder();
                        C0077.m7290(sb11, C0072.m6181(this));
                        C0077.m7290(sb11, strM1728);
                        C0077.m7290(sb11, strM3332);
                        C0077.m7290(sb11, C0078.m7427(m6967(), 394, 31, 3027));
                        throw new E3(C0068.m5536(sb11));
                    }
                    this.o = new ArrayList(certificateArrM3560.length);
                    int length = certificateArrM3560.length;
                    while (i < length) {
                        C0077.m7162(C0027.m2419(this), (X509Certificate) certificateArrM3560[i]);
                        i++;
                    }
                    return;
                } catch (UnrecoverableKeyException e5) {
                    e = e5;
                }
                StringBuilder sb12 = new StringBuilder(C0016.m625(m6967(), 491, 33, 2110));
                C0077.m7290(sb12, strM3332);
                C0077.m7290(sb12, C0031.m3047(m6967(), 524, 7, 1525));
                C0077.m7290(sb12, C0072.m6181(this));
                C0077.m7290(sb12, C0071.m5991(m6967(), 531, 17, 628));
                throw new IOException(C0068.m5536(sb12), e);
            } catch (Exception e6) {
                e3 = e6;
            }
        }
        if (e3 != null) {
            throw e3;
        }
        throw new RuntimeException(C0017.m936(m6967(), 548, 21, 3018));
    }

    public static List d(String str) throws IOException, E3 {
        if (str == null) {
            throw new E3(C0111.m13097(m6967(), 28, 43, 373));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            List list = (List) C0111.m13090(m6970(C0074.m6565(C0035.m3555(fileInputStream)), new r(4)), C0023.m1922());
            C0016.m636(fileInputStream);
            return list;
        } catch (Throwable th) {
            try {
                C0016.m636(fileInputStream);
            } catch (Throwable th2) {
                C0072.m6234(th, th2);
            }
            throw th;
        }
    }

    public final boolean c() {
        return C0069.m5801(this) == null && C0072.m6181(this) == null && C0033.m3332(this) == null && C0021.m1530(this) == null && C0034.m3471(this) == null && C0063.m4434(this) == null && C0074.m6519(this) == null && C0065.m4784(this) == null && C0071.m6071(this) == null && C0033.m3352(this) == null && C0064.m4624(this) == null && C0073.m6375(this) == null && C0065.m4726(this) == null && C0031.m3012(this) == null && C0027.m2419(this) == null;
    }

    public static PKCS8EncodedKeySpec a(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, ArrayList arrayList) throws InvalidKeySpecException, InvalidKeyException {
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = encryptedPrivateKeyInfo;
        SecretKeyFactory secretKeyFactoryM3341 = C0033.m3341(C0035.m3542(encryptedPrivateKeyInfo2));
        Iterator itM4154 = C0039.m4154(arrayList);
        InvalidKeyException e = null;
        InvalidKeySpecException e2 = null;
        while (C0036.m3657(itM4154)) {
            try {
                return C0075.m6853(encryptedPrivateKeyInfo2, C0067.m5447(secretKeyFactoryM3341, new PBEKeySpec((char[]) C0071.m6012(itM4154))));
            } catch (InvalidKeyException e3) {
                e = e3;
            } catch (InvalidKeySpecException e4) {
                e2 = e4;
            }
        }
        if (e == null && e2 == null) {
            throw new RuntimeException(C0024.m1945(m6967(), 0, 12, 1121));
        }
        if (e != null) {
            throw e;
        }
        throw e2;
    }

    public static Key b(KeyStore keyStore, String str, ArrayList arrayList) throws UnrecoverableKeyException {
        KeyStore keyStore2 = keyStore;
        Iterator itM4154 = C0039.m4154(arrayList);
        UnrecoverableKeyException e = null;
        while (C0036.m3657(itM4154)) {
            try {
                return C0065.m4707(keyStore2, str, (char[]) C0071.m6012(itM4154));
            } catch (UnrecoverableKeyException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new RuntimeException(C0034.m3431(m6967(), 12, 16, 2796));
        }
        throw e;
    }
}
