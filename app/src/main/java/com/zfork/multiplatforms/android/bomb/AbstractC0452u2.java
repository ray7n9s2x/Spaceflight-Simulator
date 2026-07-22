package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0452u2 {
    public static final int b;
    public static final int c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f367short = {2387, 2383, 2322, 2386, 2397, 2385, 2393, 3107, 3110, 3097, 3157, 3074, 3144, 3157, 3137, 3109, 3155, 603, 595, 578, 2664, 2672, 2677, 2680, 3065, 3045, 2978, 2982, 2982, 1873, 1876, 1875, 1864, 1861, 500, 504, 506, 502, 490, 481, 3186, 3182, 3173, 2927, 2939, 2924, 2924, 2923, 2938, 2925, 1442, 1469, 1448, 1443, 1455, 1470, 1449, 444, 439, 422, 432, 417, 438, 1902, 1906, 1905, 1916, 1903, 1908, 1902, 436, 434, 425, 424, 436, 1513, 1527, 1520, 1530, 1521, 1513, 1517, 1989, 2009, 1924, 1995, 2008, 1993, 1986, 1587, 1605, 1557, 1621, 1627, 1627, 1625, 1553, 1548, 1536, 1545, 1627, 1625, 1553, 1540, 1548, 1630, 1631, 1544, 1553, 1544, 1536, 1627, 1625, 1561, 1553, 1557, 1627, 1625, 1604, 1609, 1542, 1648, 1568, 1632, 1646, 1643, 1642, 1572, 1568, 1632, 1646, 1572, 1585, 1539, 1643, 1653, 1646, 1541, 1632, 1646, 1572, 1585, 1593, 1643, 1642, 1572, 1568, 1643, 1642, 1649, 1660, 1996, 1978, 2043, 2035, 1956, 1958, 2030, 2043, 2022, 2035, 2044, 2043, 2023, 2047, 1956, 1958, 1979, 1974, 437, 451, 408, 411, 394, 409, 392, 407, 408, 411, 394, 409, 392, 472, 473, 450, 463, 2295, 2177, 2266, 2265, 2248, 2267, 2250, 2271, 2192, 2261, 2266, 2265, 2248, 2267, 2250, 2207, 2205, 2176, 2189, 621, 539, 594, 577, 606, 591, 594, 577, 606, 512, 513, 538, 535, 459, 459, 472, 457, 450, 412, 414, 2998, 3008, 2968, 2968, 2955, 2964, 2968, 2968, 2955, 3035, 3034, 3009, 3020, 984, 984, 971, 926, 924, 720, 720, 707, 662, 660, 716, 709, 3029, 2965, 2975, 2966, 2396, 2332, 2326, 2335, 2391};
    public static final Logger a = C0063.m4369(C0038.m3997(AbstractC0452u2.class));

    public static File a(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        C0019.m1226(file);
        if (!C0030.m2838(file)) {
            return null;
        }
        try {
            return C0065.m4746(file);
        } catch (Exception unused) {
            return file;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7127() {
        if (C0038.m4010() > 0) {
            return f367short;
        }
        return null;
    }

    static {
        String strM1443 = C0020.m1443(m7127(), 0, 7, 2364);
        String strM2993 = C0031.m2993();
        String strM2697 = C0029.m2697(strM1443, strM2993);
        Locale localeM7270 = C0077.m7270();
        String strM974 = C0018.m974(strM2697, localeM7270);
        String strM1650 = C0021.m1650(m7127(), 7, 10, 3192);
        String strM6422 = C0073.m6422(strM974, strM1650, strM2993);
        int i = 9;
        b = C0019.m1242(strM6422, C0070.m5942(m7127(), 17, 3, 570)) ? 1 : C0019.m1242(strM6422, C0038.m4022(m7127(), 20, 4, 2560)) ? 2 : (!C0019.m1242(strM6422, C0111.m13097(m7127(), 24, 5, 2966)) || (C0078.m7380(strM6422) > 5 && C0065.m4646(C0077.m7212(strM6422, 5)))) ? C0019.m1242(strM6422, C0025.m2151(m7127(), 29, 5, 1853)) ? 4 : (C0019.m1242(strM6422, C0036.m3678(m7127(), 34, 6, 409)) || C0019.m1242(strM6422, C0020.m1443(m7127(), 40, 3, 3101))) ? 5 : C0019.m1242(strM6422, C0018.m1070(m7127(), 43, 7, 2825)) ? 6 : C0019.m1242(strM6422, C0031.m3047(m7127(), 50, 7, 1485)) ? 7 : C0019.m1242(strM6422, C0017.m936(m7127(), 57, 6, 466)) ? 8 : (C0019.m1242(strM6422, C0030.m2840(m7127(), 63, 7, 1821)) || C0019.m1242(strM6422, C0025.m2151(m7127(), 70, 5, 455))) ? 9 : C0019.m1242(strM6422, C0065.m4757(m7127(), 75, 7, 1438)) ? 10 : 11 : 3;
        String strM64222 = C0073.m6422(C0018.m974(C0029.m2697(C0063.m4315(m7127(), 82, 7, 1962), strM2993), localeM7270), strM1650, strM2993);
        if (C0031.m3014(strM64222, C0066.m4828(m7127(), 89, 31, 1645))) {
            i = 1;
        } else if (C0031.m3014(strM64222, C0069.m5807(m7127(), 120, 31, 1624))) {
            i = 2;
        } else if (C0031.m3014(strM64222, C0070.m5942(m7127(), 151, 18, 1938))) {
            i = 3;
        } else if (C0031.m3014(strM64222, C0036.m3678(m7127(), 169, 17, 491))) {
            i = 4;
        } else if (C0031.m3014(strM64222, C0111.m13097(m7127(), 186, 19, 2217))) {
            i = 5;
        } else if (C0031.m3014(strM64222, C0018.m1070(m7127(), 205, 13, 563))) {
            i = 6;
        } else if (C0070.m5838(C0020.m1443(m7127(), 218, 7, 426), strM64222)) {
            i = 7;
        } else if (C0031.m3014(strM64222, C0072.m6116(m7127(), 225, 13, 3048))) {
            i = 8;
        } else if (!C0070.m5838(C0030.m2840(m7127(), 238, 5, 936), strM64222)) {
            i = C0070.m5838(C0036.m3678(m7127(), 243, 7, 672), strM64222) ? 10 : C0070.m5838(C0026.m2321(m7127(), 250, 4, 2982), strM64222) ? 11 : C0070.m5838(C0017.m936(m7127(), 254, 5, 2351), strM64222) ? 12 : 13;
        }
        c = i;
    }
}
