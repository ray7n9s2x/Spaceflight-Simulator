package com.zfork.multiplatforms.android.bomb;

import androidx.core.view.MotionEventCompat;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
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
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class K3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f260short = {1608, 1651, 1654, 1651, 1650, 1642, 1651, 1597, 1662, 1650, 1648, 1645, 1647, 1656, 1646, 1646, 1652, 1650, 1651, 1597, 1648, 1656, 1641, 1653, 1650, 1657, 1421, 1410, 1415, 1422, 2252, 2267, 2262, 2259, 2270, 2259, 2254, 2243, 1195, 2641, 2647, 2640, 2646, 2641, 2630, 2628, 2630, 2624, 2647, 2641, 2646, 2230, 2225, 2218, 2231, 2208, 2225, 2236, 2229, 2208, 2539, 2540, 2551, 2538, 2557, 2536, 2553, 2539, 2539, 1850, 1853, 1832, 1851, 1853, 1837, 1832, 1853, 1836, 3267, 3272, 3291, 3279, 3264, 3269, 3276, 486, 486, 505, 486, 496, 487, 483, 496, 487, 2226, 2227, 2210, 2226, 2229, 2222, 2227, 2212, 2229, 2232, 2225, 2212, 2420, 2421, 2404, 2420, 2419, 2408, 2421, 2402, 2423, 2406, 2420, 2420, 1287, 1286, 1303, 1284, 1286, 1307, 1282, 1309, 1296, 1297, 1286, 1306, 1301, 1305, 1297, 1934, 1935, 1950, 1933, 1935, 1938, 1929, 1944, 1950, 1929, 1944, 1945, 1080, 1081, 1064, 1056, 1070, 1074, 1080, 1087, 1060, 1081, 1070, 555, 554, 571, 563, 573, 545, 552, 569, 555, 555, 1301, 1300, 1285, 1287, 1290, 1295, 1287, 1301, 563, 553, 551, 545, 556, 551, 2863, 2875, 2878, 1562, 1560, 1541, 1564, 1539, 1550, 1551, 1560, 1562, 1547, 1566, 1538, 1297, 1299, 1294, 1303, 1288, 1285, 1284, 1299, 1295, 1280, 1292, 1284, 2671, 2669, 2672, 2665, 2678, 2683, 2682, 2669, 2684, 2675, 2686, 2668, 2668, 3324, 3326, 3299, 3322, 3301, 3304, 3305, 3326, 3309, 3326, 3307, 1834, 1832, 1845, 1838, 1855, 1849, 1838, 1855, 1854, 3311, 3317, 3316, 3302, 3305, 3308, 3301, 1432, 1433, 1414, 1412, 1433, 1435, 1414, 1410, 1228, 1223, 1237, 1923, 1933, 1937, 1947, 1948, 1927, 1946, 1933, 3120, 3134, 3106, 3112, 3122, 3105, 3134, 1334, 1336, 1316, 1325, 1340, 1326, 1326, 588, 578, 606, 582, 587, 576, 994, 997, 1005, 994, 999, 1006, 1274, 1271, 1438, 1411, 1423, 1647, 1637, 1642, 1638, 1646, 2383, 2382, 2392, 2399, 2392, 2399, 2372, 2393, 2382, 2399, 2386, 2395, 2382, 2371, 2370, 2388, 2387, 2388, 2387, 2376, 2389, 2370, 2391, 2374, 2388, 2388, 2292, 2293, 2275, 2276, 2272, 2274, 2303, 2278, 2297, 2292, 2293, 2274, 2302, 2289, 2301, 2293, 1775, 1774, 1784, 1791, 1787, 1785, 1764, 1791, 1774, 1768, 1791, 1774, 1775, 1475, 1474, 1492, 1491, 1484, 1474, 1502, 1492, 1491, 1480, 1493, 1474, 2599, 2598, 2608, 2615, 2600, 2598, 2618, 2611, 2594, 2608, 2608, 1020, 1021, 1003, 1004, 1017, 1012, 1009, 1017, 1003, 1696, 1709, 1704, 1696, 1714, 2773};
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43};

    public static int a(int i) throws z5 {
        for (int i2 : C0067.m5480(3)) {
            if (C0031.m3107(i2) == i) {
                return i2;
            }
        }
        throw new z5(C0018.m1070(m6954(), 0, 26, 1565));
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        String strM3058 = C0031.m3058();
        String strM3074 = C0031.m3074();
        switch (i) {
            case 1:
                return C0017.m857();
            case 2:
                return C0025.m2164();
            case 3:
                return strM3074;
            case 4:
                return C0016.m622();
            case 5:
                return null;
            case 6:
                return C0023.m1846();
            case 7:
                return strM3074;
            case 8:
                return C0073.m6430();
            case 9:
                return C0034.m3482();
            case 10:
                return C0027.m2388();
            case 11:
            case 12:
                return strM3058;
            case 13:
                return C0018.m995();
            case 14:
                return strM3058;
            case 15:
                return C0017.m916();
            case 16:
                return strM3074;
            case 17:
                return C0032.m3140();
            case 18:
                return C0072.m6166();
            case 19:
                return strM3074;
            case 20:
                return null;
            case 21:
                return strM3058;
            case 22:
                return null;
            case 23:
                return strM3074;
            case 24:
                return C0025.m2126();
            case 25:
                return C0016.m680();
            case 26:
                return C0035.m3535();
            case 27:
                return null;
            case 28:
                return C0029.m2779();
            case 29:
                return C0025.m2226();
            case 30:
                return strM3074;
            case 31:
                return C0023.m1869();
            case 32:
                return null;
            case 33:
                return C0023.m1898();
            case 34:
                return strM3074;
            case 35:
                return C0023.m1800();
            case 36:
                return C0070.m5913();
            case 37:
                return strM3058;
            case 38:
                return C0111.m13077();
            case 39:
                return strM3074;
            case 40:
                return C0038.m4051();
            case 41:
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return null;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                return C0077.m7183();
            default:
                throw null;
        }
    }

    public static /* synthetic */ int e(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 99;
        }
        throw null;
    }

    public static /* synthetic */ int f(int i) {
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 24;
        }
        if (i == 3) {
            return 32;
        }
        throw null;
    }

    public static /* synthetic */ int g(int i) {
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 24;
        }
        if (i == 3) {
            return 32;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw null;
            }
        }
        return i2;
    }

    public static /* synthetic */ int i(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 12;
        }
        if (i == 3) {
            return 16;
        }
        throw null;
    }

    public static /* synthetic */ long j(int i) {
        switch (i) {
            case 1:
                return 67324752L;
            case 2:
                return 134695760L;
            case 3:
                return 33639248L;
            case 4:
                return 101010256L;
            case 5:
                return 808471376L;
            case 6:
                return 84233040L;
            case 7:
                return 134630224L;
            case 8:
                return 134695760L;
            case 9:
                return 117853008L;
            case 10:
                return 101075792L;
            case 11:
                return 1L;
            case 12:
                return 39169L;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int k(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int[] t(int i) {
        int[] iArr = new int[i];
        C0027.m2519(C0030.m2900(), 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6954() {
        if (C0066.m4827() > 0) {
            return f260short;
        }
        return null;
    }

    public static final String b(int i) {
        String strM4828 = C0066.m4828(m6954(), 26, 4, 1515);
        switch (i) {
            case 1:
                strM4828 = C0111.m13097(m6954(), 389, 5, 1729);
                break;
            case 2:
                strM4828 = C0038.m4022(m6954(), 380, 9, 920);
                break;
            case 3:
                strM4828 = C0036.m3678(m6954(), 369, 11, 2627);
                break;
            case 4:
                strM4828 = C0016.m625(m6954(), 357, 12, 1447);
                break;
            case 5:
                strM4828 = C0026.m2321(m6954(), 344, 13, 1675);
                break;
            case 6:
                strM4828 = C0067.m5418(m6954(), 328, 16, 2192);
                break;
            case 7:
                strM4828 = C0035.m3603(m6954(), 315, 13, 2343);
                break;
            case 8:
                strM4828 = C0069.m5807(m6954(), 302, 13, 2347);
                break;
            case 9:
                strM4828 = C0028.m2609(m6954(), 297, 5, 1547);
                break;
            case 10:
                strM4828 = C0037.m3829(m6954(), 294, 3, 1531);
                break;
            case 11:
            case 12:
                break;
            case 13:
                strM4828 = C0065.m4757(m6954(), 292, 2, 1171);
                break;
            case 14:
                strM4828 = C0072.m6116(m6954(), 286, 6, 907);
                break;
            case 15:
                strM4828 = C0023.m1904(m6954(), 280, 6, 551);
                break;
            case 16:
                strM4828 = C0023.m1904(m6954(), 273, 7, 1373);
                break;
            case 17:
                strM4828 = C0020.m1443(m6954(), 266, 7, 3163);
                break;
            case 18:
                strM4828 = C0022.m1728(m6954(), AndroidBinXmlParser.Chunk.RES_XML_TYPE_START_ELEMENT, 8, 2024);
                break;
            case 19:
                strM4828 = C0036.m3678(m6954(), 255, 3, 1186);
                break;
            case 20:
                strM4828 = C0031.m3047(m6954(), 247, 8, 1526);
                break;
            case 21:
                strM4828 = C0023.m1904(m6954(), 240, 7, 3200);
                break;
            case 22:
                strM4828 = C0033.m3330(m6954(), 231, 9, 1882);
                break;
            case 23:
                strM4828 = C0036.m3678(m6954(), 220, 11, 3212);
                break;
            case 24:
                strM4828 = C0034.m3431(m6954(), 207, 13, 2591);
                break;
            case 25:
                strM4828 = C0030.m2840(m6954(), 195, 12, 1377);
                break;
            case 26:
                strM4828 = C0022.m1728(m6954(), 183, 12, 1642);
                break;
            case 27:
                strM4828 = C0038.m4022(m6954(), 180, 3, 2909);
                break;
            case 28:
                strM4828 = C0075.m6791(m6954(), 174, 6, 576);
                break;
            case 29:
                strM4828 = C0029.m2695(m6954(), 166, 8, 1382);
                break;
            case 30:
                strM4828 = C0027.m2404(m6954(), 156, 10, 600);
                break;
            case 31:
                strM4828 = C0025.m2151(m6954(), 145, 11, 1099);
                break;
            case 32:
                strM4828 = C0028.m2609(m6954(), 133, 12, 2045);
                break;
            case 33:
                strM4828 = C0038.m4022(m6954(), 118, 15, 1396);
                break;
            case 34:
                strM4828 = C0023.m1904(m6954(), 106, 12, 2311);
                break;
            case 35:
                strM4828 = C0028.m2609(m6954(), 94, 12, 2241);
                break;
            case 36:
                strM4828 = C0075.m6791(m6954(), 85, 9, 405);
                break;
            case 37:
                strM4828 = C0077.m7205(m6954(), 78, 7, 3241);
                break;
            case 38:
                strM4828 = C0076.m6902(m6954(), 69, 9, 1865);
                break;
            case 39:
                strM4828 = C0032.m3209(m6954(), 60, 9, 2456);
                break;
            case 40:
                strM4828 = C0078.m7427(m6954(), 51, 9, 2245);
                break;
            case 41:
                strM4828 = C0074.m6452(m6954(), 39, 12, 2597);
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                strM4828 = C0066.m4828(m6954(), 38, 1, 1245);
                break;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                strM4828 = C0071.m5991(m6954(), 30, 8, 2234);
                break;
            default:
                throw null;
        }
        return C0032.m3232(C0070.m5942(m6954(), 394, 1, 2808), strM4828);
    }

    public static String l(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        C0021.m1551(sb, i);
        return C0068.m5536(sb);
    }

    public static String m(long j, String str) {
        StringBuilder sb = new StringBuilder(str);
        C0078.m7466(sb, j);
        return C0068.m5536(sb);
    }

    public static String n(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        C0021.m1551(sb, i);
        C0077.m7290(sb, str2);
        return C0068.m5536(sb);
    }

    public static String o(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        C0077.m7290(sb, str2);
        return C0068.m5536(sb);
    }

    public static String p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        C0077.m7290(sb, str2);
        C0077.m7290(sb, str3);
        return C0068.m5536(sb);
    }

    public static StringBuilder q(C0483z3 c0483z3, String str, String str2, String str3, String str4) {
        C0021.m1601(c0483z3, str, str2);
        C0021.m1601(c0483z3, str3, str4);
        return new StringBuilder();
    }

    public static void r(StringBuilder sb, String str, String str2, C0483z3 c0483z3, String str3) {
        C0077.m7290(sb, str);
        C0077.m7290(sb, str2);
        C0021.m1601(c0483z3, str3, C0068.m5536(sb));
    }

    public static /* synthetic */ boolean s(String str) {
        int iM7380 = C0078.m7380(str);
        int iM4072 = 0;
        while (iM4072 < iM7380) {
            int iM7249 = C0077.m7249(str, iM4072);
            if (!C0036.m3666(iM7249)) {
                return false;
            }
            iM4072 += C0039.m4072(iM7249);
        }
        return true;
    }
}
