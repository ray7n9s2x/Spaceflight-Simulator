package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.google.android.gms.common.ConnectionResult;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h5 {
    public static final C0412n3 a;
    public static final E b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f331short = {1500, 2202, 2223, 2228, 2221, 2204, 1130, 1101, 1109, 1090, 1103, 1098, 1095, 1027, 1089, 1114, 1111, 1094, 1027, 3083, 3146, 3167, 3083, 3140, 3149, 3149, 3160, 3150, 3167, 3083, 2606, 2663, 2656, 2606, 2601, 1190, 1185, 1261, 1252, 1263, 1212, 2685, 2644, 2655, 2646, 2629, 2649, 2577, 3035, 2966, 2958, 2952, 2959, 3035, 2969, 2974, 3035, 2970, 2959, 3035, 2967, 2974, 2970, 2952, 2959, 3035, 3017, 804, 870, 893, 880, 865, 804, 870, 877, 874, 869, 886, 893, 804, 874, 881, 873, 870, 865, 886, 804, 865, 892, 871, 865, 865, 864, 887, 804, 873, 869, 892, 877, 873, 881, 873, 804, 887, 877, 867, 874, 865, 864, 804, 872, 875, 874, 867, 804, 882, 869, 872, 881, 865, 2156, 2144, 1591, 1538, 1622, 1561, 1552, 1552, 1541, 1555, 1538, 1622, 3217, 3232, 3257, 3241, 3236, 3232, 3237, 3236, 3251, 3297, 3255, 3232, 3245, 3252, 3236, 3297, 3250, 3240, 3259, 3236, 3297, 2034, 1975, 1962, 1969, 1975, 1975, 1974, 1953, 2034, 1953, 1979, 1960, 1975, 2034, 1981, 1972, 2034, 1978, 1975, 1971, 1974, 1975, 1952, 2034, 1952, 1975, 1969, 1981, 1952, 1974, 1121, 1128, 1139, 1032, 1109, 1110, 1095, 1108, 1109, 1091, 1032, 1097, 1088, 1088, 1109, 1091, 1106, 734, 761, 753, 756, 765, 764, 696, 748, 759, 696, 746, 765, 761, 764, 696, 712, 761, 736, 752, 765, 761, 764, 765, 746, 694, 735, 726, 717, 694, 747, 744, 761, 746, 747, 765, 694, 759, 766, 766, 747, 765, 748, 696, 763, 759, 758, 748, 761, 753, 758, 747, 696, 758, 765, 767, 761, 748, 753, 750, 765, 696, 750, 761, 756, 749, 765, 2155, 2124, 2116, 2113, 2120, 2121, 2061, 2137, 2114, 2061, 2143, 2120, 2124, 2121, 2061, 2173, 2124, 2133, 2117, 2120, 2124, 2121, 2120, 2143, 2051, 2154, 2147, 2168, 2051, 2142, 2141, 2124, 2143, 2142, 2120, 2051, 2114, 2123, 2123, 2142, 2120, 2137, 2061, 2126, 2114, 2115, 2137, 2124, 2116, 2115, 2142, 2061, 2124, 2061, 2115, 2114, 2115, ZipUtils.GP_FLAG_EFS, 2115, 2136, 2112, 2120, 2143, 2116, 2126, 2061, 2139, 2124, 2113, 2136, 2120, 1346, 1355, 1360, 1323, 1398, 1397, 1380, 1399, 1398, 1376, 1323, 1387, 1392, 1384, 1383, 1404, 1393, 1376, 1398, 2847, 2872, 2864, 2869, 2876, 2877, 2937, 2861, 2870, 2937, 2859, 2876, 2872, 2877, 2937, 2825, 2872, 2849, 2865, 2876, 2872, 2877, 2876, 2859, 2935, 2846, 2839, 2828, 2935, 2858, 2857, 2872, 2859, 2858, 2876, 2935, 2871, 2860, 2868, 2875, 2848, 2861, 2876, 2858, 2937, 2874, 2870, 2871, 2861, 2872, 2864, 2871, 2858, 2937, 2871, 2876, 2878, 2872, 2861, 2864, 2863, 2876, 2937, 2863, 2872, 2869, 2860, 2876, 1521, 1494, 1502, 1499, 1490, 1491, 1431, 1475, 1496, 1431, 1477, 1490, 1494, 1491, 1431, 1511, 1494, 1487, 1503, 1490, 1494, 1491, 1490, 1477, 1433, 1520, 1529, 1506, 1433, 1476, 1479, 1494, 1477, 1476, 1490, 1433, 1496, 1489, 1489, 1476, 1490, 1475, 1431, 1502, 1476, 1431, 1490, 1487, 1479, 1490, 1492, 1475, 1490, 1491, 1431, 1493, 1490, 1489, 1496, 1477, 1490, 1431, 1520, 1529, 1506, 1433, 1476, 1479, 1494, 1477, 1476, 1490, 1433, 1497, 1474, 1498, 1493, 1486, 1475, 1490, 1476, 1431, 1476, 1503, 1496, 1472, 1476, 1431, 1474, 1479, 1433, 3194, 3165, 3157, 3152, 3161, 3160, 3100, 3144, 3155, 3100, 3150, 3161, 3165, 3160, 3100, 3180, 3165, 3140, 3156, 3161, 3165, 3160, 3161, 3150, 3090, 3178, 3165, 3152, 3145, 3161, 3100, 3151, 3156, 3155, 3145, 3152, 3160, 3100, 3161, 3154, 3160, 3100, 3147, 3157, 3144, 3156, 3100, 3165, 3100, 3154, 3161, 3147, 3152, 3157, 3154, 3161, 2903, 2928, 2936, 2941, 2932, 2933, 2865, 2917, 2942, 2865, 2915, 2932, 2928, 2933, 2865, 2881, 2928, 2921, 2937, 2932, 2928, 2933, 2932, 2915, 2879, 2865, 2900, 2921, 2913, 2932, 2930, 2917, 2932, 2933, 2865, 2181, 2247, 2268, 2257, 2240, 2262, 2185, 2181, 2263, 2240, 2244, 2241, 2181, 801, 774, 782, 779, 770, 771, 839, 787, 776, 839, 789, 770, 774, 771, 839, 823, 774, 799, 783, 770, 774, 771, 770, 789, 841, 839, 802, 777, 772, 776, 786, 777, 787, 770, 789, 770, 771, 839, 774, 839, 777, 776, 777, 842, 777, 786, 778, 773, 770, 789, 839, 784, 783, 782, 779, 770, 839, 789, 770, 774, 771, 782, 777, 768, 839, 779, 770, 777, 768, 787, 783, 1105, 1149, 1120, 1120, 1127, 1122, 1126, 1143, 1142, 1074, 1094, 1107, 1088, 1074, 1139, 1120, 1137, 1146, 1147, 1124, 1143, 1084, 1074, 1116, 1149, 1148, 1087, 1148, 1127, 1151, 1143, 1120, 1147, 1137, 1074, 1124, 1139, 1150, 1127, 1143, 1074, 1147, 1148, 1074, 1121, 1122, 1139, 1120, 1121, 1143, 1074, 1146, 1143, 1139, 1142, 1143, 1120, 1121, 1074, 1136, 1150, 1149, 1137, 1145, 1059, 1048, 1043, 1038, 1030, 1043, 1045, 1026, 1043, 1042, 1110, 1075, 1081, 1072, 1110, 1025, 1054, 1043, 1048, 1110, 1028, 1043, 1047, 1042, 1055, 1048, 1041, 1110, 1030, 1047, 1028, 1029, 1043, 1110, 1055, 1048, 1040, 1049, 1028, 1051, 1047, 1026, 1055, 1049, 1048, 1110, 1049, 1040, 1110, 1095, 1112, 1070, 1110, 1062, 1079, 1070, 1110, 1040, 1049, 1028, 1051, 1047, 1026, 1590, 1562, 1543, 1543, 1536, 1541, 1537, 1552, 1553, 1621, 1569, 1588, 1575, 1621, 1556, 1543, 1558, 1565, 1564, 1539, 1552, 1625, 1621, 1542, 1541, 1556, 1543, 1542, 1552, 1621, 1552, 1563, 1537, 1543, 1548, 1621, 1538, 1564, 1537, 1565, 1621, 1563, 1552, 1554, 1556, 1537, 1564, 1539, 1552, 1621, 1563, 1536, 1560, 1559, 1548, 1537, 1552, 1542, 1744, 1788, 1761, 1761, 1766, 1763, 1767, 1782, 1783, 1715, 1735, 1746, 1729, 1715, 1778, 1761, 1776, 1787, 1786, 1765, 1782, 1727, 1715, 1760, 1763, 1778, 1761, 1760, 1782, 1715, 1782, 1789, 1767, 1761, 1770, 1715, 1764, 1786, 1767, 1787, 1715, 1789, 1782, 1780, 1778, 1767, 1786, 1765, 1782, 1715, 1788, 1781, 1781, 1760, 1782, 1767, 1794, 1838, 1843, 1843, 1844, 1841, 1845, 1828, 1829, 1889, 1813, 1792, 1811, 1889, 1824, 1843, 1826, 1833, 1832, 1847, 1828, 1901, 1889, 1842, 1841, 1824, 1843, 1842, 1828, 1889, 1828, 1839, 1845, 1843, 1848, 1889, 1832, 1842, 1889, 1832, 1839, 1847, 1824, 1837, 1832, 1829};

    public static String b(byte[] bArr, int i, int i2, v5 v5Var) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 <= 0) {
            return C0031.m2993();
        }
        byte[] bArr2 = new byte[i3];
        C0027.m2519(bArr, i, bArr2, 0, i3);
        return C0033.m3287(v5Var, bArr2);
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static List m7072(Object obj) {
        if (C0073.m6356() < 0) {
            return DesugarCollections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7073() {
        if (C0017.m846() > 0) {
            return f331short;
        }
        return null;
    }

    public static String a(int i, byte[] bArr, int i2) {
        try {
            try {
                return C0036.m3742(bArr, i, i2, C0025.m2146());
            } catch (IOException unused) {
                return C0036.m3742(bArr, i, i2, C0021.m1537());
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static long c(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C0025.m2086(C0063.m4315(m7073(), 41, 7, 2609), i2, C0064.m4545(m7073(), 48, 19, 3067)));
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b2 = bArr[i3 - 1];
        while (i4 < i3 && (b2 == 0 || b2 == 32)) {
            b2 = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b3 = bArr[i4];
            if (b3 < 48 || b3 > 55) {
                String strM3222 = C0032.m3222(new String(bArr, i, i2, C0022.m1684()), C0026.m2321(m7073(), 0, 1, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), C0076.m6902(m7073(), 1, 5, 2273));
                StringBuilder sb = new StringBuilder(C0026.m2321(m7073(), 6, 13, 1059));
                C0021.m1551(sb, b3);
                C0077.m7290(sb, C0077.m7205(m7073(), 19, 11, 3115));
                C0021.m1551(sb, i4 - i);
                C0077.m7290(sb, C0078.m7427(m7073(), 30, 5, 2574));
                C0077.m7290(sb, strM3222);
                C0077.m7290(sb, C0026.m2321(m7073(), 35, 6, 1153));
                C0021.m1551(sb, i2);
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
            j = (j << 3) + ((long) (b3 - 48));
            i4++;
        }
        return j;
    }

    public static long d(int i, byte[] bArr, int i2) {
        byte b2 = bArr[i];
        if ((b2 & 128) == 0) {
            return C0022.m1665(i, bArr, i2);
        }
        boolean z = b2 == -1;
        String strM6452 = C0074.m6452(m7073(), 67, 53, 772);
        String strM2404 = C0027.m2404(m7073(), 120, 2, 2112);
        String strM4315 = C0063.m4315(m7073(), 122, 10, 1654);
        if (i2 < 9) {
            if (i2 >= 9) {
                StringBuilder sb = new StringBuilder(strM4315);
                C0021.m1551(sb, i);
                C0077.m7290(sb, strM2404);
                C0021.m1551(sb, i2);
                C0077.m7290(sb, strM6452);
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
            long jM2212 = 0;
            for (int i3 = 1; i3 < i2; i3++) {
                jM2212 = (jM2212 << 8) + ((long) (bArr[i + i3] & 255));
            }
            if (z) {
                jM2212 = (jM2212 - 1) ^ (((long) C0025.m2212(2.0d, ((double) (i2 - 1)) * 8.0d)) - 1);
            }
            return z ? -jM2212 : jM2212;
        }
        int i4 = i2 - 1;
        byte[] bArr2 = new byte[i4];
        C0027.m2519(bArr, i + 1, bArr2, 0, i4);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = C0068.m5539(C0039.m4185(bigInteger, C0038.m3948(-1L)));
        }
        if (C0017.m876(bigInteger) <= 63) {
            long jM1087 = C0018.m1087(bigInteger);
            return z ? -jM1087 : jM1087;
        }
        StringBuilder sb2 = new StringBuilder(strM4315);
        C0021.m1551(sb2, i);
        C0077.m7290(sb2, strM2404);
        C0021.m1551(sb2, i2);
        C0077.m7290(sb2, strM6452);
        throw new IllegalArgumentException(C0068.m5536(sb2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0269, code lost:
    
        r11 = r15;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a5, code lost:
    
        throw new java.io.IOException(com.android.apksig.util.C0031.m3047(m7073(), 619, 71, 871));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a6, code lost:
    
        if (r11 != (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a8, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
    
        com.android.apksig.internal.apk.stamp.C0017.m919(r74, new com.zfork.multiplatforms.android.bomb.C0371g5(com.android.apksig.apk.C0016.m704(r8), 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap e(com.zfork.multiplatforms.android.bomb.C0357e5 r73, java.util.ArrayList r74, java.util.HashMap r75, long r76) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.h5.e(com.zfork.multiplatforms.android.bomb.e5, java.util.ArrayList, java.util.HashMap, long):java.util.HashMap");
    }

    public static long[] f(InputStream inputStream) throws IOException {
        long j = 0;
        long j2 = 0;
        while (true) {
            int iM3071 = C0031.m3071(inputStream);
            if (iM3071 == 10) {
                return new long[]{j2, j + 1};
            }
            j++;
            if (iM3071 == -1) {
                throw new IOException(C0078.m7427(m7073(), 754, 63, 1142));
            }
            if (iM3071 < 48 || iM3071 > 57) {
                break;
            }
            j2 = (j2 * 10) + ((long) (iM3071 - 48));
        }
        throw new IOException(C0022.m1728(m7073(), 690, 64, 1042));
    }

    public static List g(int i, byte[] bArr, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                long jM3200 = C0032.m3200(i4, bArr, 12);
                long jM32002 = C0032.m3200(i4 + 12, bArr, 12);
                C0371g5 c0371g5 = new C0371g5(jM3200, jM32002);
                if (jM3200 < 0) {
                    throw new IOException(C0036.m3678(m7073(), 875, 56, 1683));
                }
                if (jM32002 < 0) {
                    throw new IOException(C0024.m1945(m7073(), 817, 58, 1653));
                }
                C0017.m919(arrayList, c0371g5);
            } catch (IllegalArgumentException e) {
                throw new IOException(C0078.m7427(m7073(), 931, 46, 1857), e);
            }
        }
        return m7072(arrayList);
    }

    static {
        Charset charsetM1684;
        Charset charsetM16842 = C0022.m1684();
        C0033.m3337();
        C0039.m4060();
        if (charsetM16842 == null) {
            charsetM1684 = C0022.m1684();
        } else {
            charsetM1684 = charsetM16842;
        }
        if (charsetM16842 == null) {
            charsetM16842 = C0022.m1684();
        }
        if (charsetM16842 == null) {
            charsetM16842 = C0022.m1684();
        }
        a = new C0412n3(charsetM1684, C0111.m13073(C0078.m7357(charsetM16842)));
        b = new E();
    }
}
