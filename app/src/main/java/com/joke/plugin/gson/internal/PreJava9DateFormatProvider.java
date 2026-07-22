package com.joke.plugin.gson.internal;

import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class PreJava9DateFormatProvider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f177short = {2252, 2222, 2277, 2222, 2296, 2296, 468, 495, 490, 495, 494, 502, 495, 417, 453, 480, 501, 484, 455, 494, 499, 492, 480, 501, 417, 498, 501, 504, 493, 484, 443, 417, 1062, 1062, 1062, 1099, 1039, 1095, 1099, 1042, 1788, 1788, 1788, 1788, 1681, 1749, 1693, 1681, 1736, ZipUtils.GP_FLAG_EFS, ZipUtils.GP_FLAG_EFS, ZipUtils.GP_FLAG_EFS, ZipUtils.GP_FLAG_EFS, 2153, 2149, 2056, 2056, 2056, 2056, 2149, 2081, 2153, 2149, 2108, 3198, 3100, 3159, 3100, 3146, 3146, 825, 770, 775, 770, 771, 795, 770, 844, 808, 781, 792, 777, 810, 771, 798, 769, 781, 792, 844, 799, 792, 789, 768, 777, 854, 844, 661, 661, 661, 760, 700, 756, 760, 673, 673, 673, 673, 925, 925, 925, 925, 1008, 948, 1020, 1008, 937, 937, 937, 937, 2352, 2352, 2352, 2352, 2393, 2389, 2360, 2360, 2360, 2360, 2389, 2321, 2393, 2389, 2316, 2316, 2316, 2316, 1628, 1550, 1625, 1625, 1556, 1621, 2999, 2956, 2953, 2956, 2957, 2965, 2956, 3010, 2982, 2947, 2966, 2951, 2980, 2957, 2960, 2959, 2947, 2966, 3010, 2961, 2966, 2971, 2958, 2951, 3032, 3010, 1871, 1821, 1866, 1866, 1821, 1876, 1876, 1799, 1862, 2506, 2456, 2511, 2511, 2456, 2513, 2513, 2434, 2499, 2434, 2520, 1628};

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5195() {
        if (C0070.m5903() >= 0) {
            return f177short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5196(int i) {
        if (C0068.m5678() >= 0) {
            return getDatePartOfDateTimePattern(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5197(int i) {
        if (C0067.m5468() < 0) {
            return getDateFormatPattern(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥۥ, reason: contains not printable characters */
    public static String m5198(int i) {
        if (C0024.m2011() < 0) {
            return getTimePartOfDateTimePattern(i);
        }
        return null;
    }

    private static String getDateFormatPattern(int i) {
        if (i == 0) {
            return C0017.m936(m5195(), 49, 15, 2117);
        }
        if (i == 1) {
            return C0111.m13097(m5195(), 40, 9, 1713);
        }
        if (i == 2) {
            return C0028.m2609(m5195(), 32, 8, 1131);
        }
        if (i == 3) {
            return C0023.m1904(m5195(), 0, 6, 2177);
        }
        throw new IllegalArgumentException(C0071.m6038(i, C0032.m3209(m5195(), 6, 26, 385)));
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i == 0) {
            return C0038.m4022(m5195(), 119, 18, 2421);
        }
        if (i == 1) {
            return C0033.m3330(m5195(), 107, 12, 976);
        }
        if (i == 2) {
            return C0016.m625(m5195(), 96, 11, 728);
        }
        if (i == 3) {
            return C0068.m5544(m5195(), 64, 6, 3123);
        }
        throw new IllegalArgumentException(C0071.m6038(i, C0027.m2404(m5195(), 70, 26, 876)));
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i == 0 || i == 1) {
            return C0016.m625(m5195(), 178, 11, 2466);
        }
        if (i == 2) {
            return C0019.m1189(m5195(), 169, 9, 1831);
        }
        if (i == 3) {
            return C0022.m1728(m5195(), 137, 6, 1588);
        }
        throw new IllegalArgumentException(C0071.m6038(i, C0070.m5942(m5195(), 143, 26, 3042)));
    }

    public static DateFormat getUSDateFormat(int i) {
        return new SimpleDateFormat(m5197(i), C0077.m7270());
    }

    public static DateFormat getUSDateTimeFormat(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, m5196(i));
        C0077.m7290(sb, C0027.m2404(m5195(), 189, 1, 1660));
        C0077.m7290(sb, m5198(i2));
        return new SimpleDateFormat(C0068.m5536(sb), C0077.m7270());
    }
}
