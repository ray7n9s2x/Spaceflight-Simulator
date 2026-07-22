package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;

/* JADX INFO: loaded from: classes3.dex */
public final class B3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f232short = {3062, 3057, 3068, 3043, 3061, 2299, 2301, 2298, 2282, 1018, 961, 988, 986, 991, 991, 960, 989, 987, 970, 971, 911, 985, 974, 963, 986, 970, 911, 969, 960, 989, 911, 721, 715, 1184, 1198, 1217, 1248, 1250, 1271, 1198, 1274, 1276, 1275, 1259, 1198, 1249, 1276, 1198, 1256, 1263, 1250, 1277, 1259, 1198, 1277, 1275, 1278, 1278, 1249, 1276, 1274, 1259, 1258, 1184, 2726, 2726, 2677, 2685, 2019, 2026, 1959, 1983, 1977, 1982, 2026, 1960, 1967, 2026, 1963, 2026, 1966, 1967, 1961, 1955, 1959, 1963, 1958, 2026, 1956, 1983, 1959, 1960, 1967, 1976, 2032, 2026, 2694, 2763, 2767, 2773, 2773, 2767, 2760, 2753, 2694, 2759, 2752, 2770, 2755, 2772, 2694, 2052, 2052, 432, 2453, 2453};
    public final String[] a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: ۟ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6910() {
        if (C0074.m6454() <= 0) {
            return f232short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m6911(Object obj) {
        if (C0024.m2011() < 0) {
            return ((String[]) obj).clone();
        }
        return null;
    }

    public final boolean a(boolean z) throws A3 {
        String strM3260 = C0033.m3260(this);
        String strM1650 = C0021.m1650(m6910(), 0, 5, 2960);
        String strM5991 = C0071.m5991(m6910(), 5, 4, 2191);
        if (strM3260 != null) {
            this.d = null;
            if (C0070.m5838(strM5991, strM3260)) {
                return true;
            }
            if (C0070.m5838(strM1650, strM3260)) {
                return false;
            }
            StringBuilder sb = new StringBuilder(C0033.m3330(m6910(), 9, 22, 943));
            C0077.m7290(sb, C0026.m2302(this));
            C0077.m7290(sb, C0023.m1904(m6910(), 31, 2, 747));
            C0077.m7290(sb, strM3260);
            C0077.m7290(sb, C0017.m936(m6910(), 33, 31, 1166));
            throw new A3(C0068.m5536(sb));
        }
        int iM6122 = C0072.m6122(this);
        String[] strArrM4098 = C0039.m4098(this);
        if (iM6122 >= strArrM4098.length) {
            return z;
        }
        String str = strArrM4098[iM6122];
        if (C0070.m5838(strM5991, str)) {
            this.b = C0072.m6122(this) + 1;
            return true;
        }
        if (!C0070.m5838(strM1650, str)) {
            return z;
        }
        this.b = C0072.m6122(this) + 1;
        return false;
    }

    public final String[] b() {
        int iM6122 = C0072.m6122(this);
        String[] strArrM4098 = C0039.m4098(this);
        if (iM6122 >= strArrM4098.length) {
            return new String[0];
        }
        return C0070.m5838(C0070.m5942(m6910(), 64, 2, 2699), strArrM4098[iM6122]) ? (String[]) C0034.m3405(strArrM4098, C0072.m6122(this) + 1, strArrM4098.length) : (String[]) C0034.m3405(strArrM4098, C0072.m6122(this), strArrM4098.length);
    }

    public final String d(String str) throws A3 {
        String strM3260 = C0033.m3260(this);
        if (strM3260 != null) {
            this.d = null;
            return strM3260;
        }
        int iM6122 = C0072.m6122(this);
        String[] strArrM4098 = C0039.m4098(this);
        int length = strArrM4098.length;
        String strM4022 = C0038.m4022(m6910(), 96, 15, 2726);
        if (iM6122 >= length) {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, str);
            C0077.m7290(sb, strM4022);
            C0077.m7290(sb, C0026.m2302(this));
            throw new A3(C0068.m5536(sb));
        }
        String str2 = strArrM4098[iM6122];
        if (!C0070.m5838(C0022.m1728(m6910(), 111, 2, 2089), str2)) {
            this.b = C0072.m6122(this) + 1;
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        C0077.m7290(sb2, str);
        C0077.m7290(sb2, strM4022);
        C0077.m7290(sb2, C0026.m2302(this));
        throw new A3(C0068.m5536(sb2));
    }

    public final String e() {
        int iM6122 = C0072.m6122(this);
        String[] strArrM4098 = C0039.m4098(this);
        if (iM6122 >= strArrM4098.length) {
            return null;
        }
        String str = strArrM4098[iM6122];
        if (!C0019.m1242(str, C0016.m625(m6910(), 113, 1, 413))) {
            return null;
        }
        int iM61222 = C0072.m6122(this);
        this.c = iM61222;
        this.b = iM61222 + 1;
        this.g = C0026.m2302(this);
        this.f = str;
        this.e = C0033.m3260(this);
        this.d = null;
        String strM4757 = C0065.m4757(m6910(), 114, 2, 2488);
        if (!C0019.m1242(str, strM4757)) {
            return C0071.m6056(str, 1);
        }
        if (C0070.m5838(strM4757, str)) {
            return null;
        }
        int iM2051 = C0024.m2051(str, 61);
        if (iM2051 == -1) {
            return C0071.m6056(str, 2);
        }
        this.d = C0071.m6056(str, iM2051 + 1);
        this.f = C0032.m3220(str, 0, iM2051);
        return C0032.m3220(str, 2, iM2051);
    }

    public B3(String[] strArr) {
        this.a = (String[]) m6911(strArr);
    }

    public final int c(String str) throws A3 {
        String strM1060 = C0018.m1060(this, str);
        try {
            return C0039.m4116(strM1060);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, str);
            C0077.m7290(sb, C0020.m1443(m6910(), 66, 2, 2645));
            C0077.m7290(sb, C0026.m2302(this));
            C0077.m7290(sb, C0021.m1650(m6910(), 68, 28, 1994));
            C0077.m7290(sb, strM1060);
            throw new A3(C0068.m5536(sb));
        }
    }
}
