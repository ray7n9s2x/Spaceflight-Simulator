package com.zfork.multiplatforms.android.bomb;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.InputDeviceCompat;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
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
import com.android.apksig.zip.C0036;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import j$.time.DateTimeException;
import j$.time.Instant;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0350d5 {
    public String a;
    public long b;
    public byte c;
    public ArrayList d;
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final HashMap j;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f314short = {1935, 1949, 2046, 1990, 2009, 1939, 1934, 1939, 1947, 2015, 1930, 1949, 1944, 2046, 1932, 2046, 1990, 2009, 1939, 1934, 1939, 1947, 2015, 1931, 1949, 2116, 2114, 2132, 2115, 2079, 2143, 2128, 2140, 2132, 2036, 2008, 1989, 1989, 1986, 1991, 1987, 2002, 2003, 1943, 2019, 2038, 2021, 1943, 2006, 1989, 2004, 2015, 2014, 1985, 2002, 1945, 2837, 2958, 2978, 3007, 3007, 3000, 3005, 3001, 2984, 2985, 3053, 2973, 2956, 2965, 3053, 2981, 2984, 2988, 2985, 2984, 3007, 3043, 3053, 2969, 2980, 2976, 2984, 3053, 2987, 2980, 2984, 2977, 2985, 3053, 3003, 2988, 2977, 3000, 2984, 3053, 2980, 3006, 3053, 2980, 2979, 3003, 2988, 2977, 2980, 2985, 3053, 3050, 2110, 1008, 1014, 1009, 996, 1015, 933, 1341, 1339, 1340, 1321, 1338, 1352, 3248, 3237, 3254, 3268, 2025, 2041, 2034, 2035, 2038, 2019, 1940, 2011, 1992, 2009, 2002, 1998, 1987, 1994, 2015, 1015, 1018, 1020, 1019, 1006, 1021, 1322, 1335, 1338, 1340, 1339, 1326, 1341, 1649, 690, 674, 703, 699, 693, 702, 752, 689, 674, 691, 696, 697, 678, 693, 764, 752, 693, 702, 676, 674, 681, 752, 679, 697, 676, 696, 752, 702, 693, 695, 689, 676, 697, 678, 693, 752, 675, 697, 682, 693, 1102, 1106, 1039, 1103, 1088, 1100, 1092, 2821, 2843, 2844, 2838, 2845, 2821, 2817, 1805, 1798, 1815, 1812, 1794, 1809, 1798, 954};
    public static final Pattern k = C0039.m4174(C0033.m3330(m7044(), 0, 25, 1954));

    /* JADX INFO: renamed from: ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static Instant m7043(long j, long j2) {
        if (C0069.m5781() <= 0) {
            return Instant.ofEpochSecond(j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥ, reason: contains not printable characters */
    public static short[] m7044() {
        if (C0036.m3653() < 0) {
            return f314short;
        }
        return null;
    }

    public static void a(long j) {
        if (j <= 0) {
            return;
        }
        C0019.m1253();
        C0021.m1555(j, C0038.m4008());
    }

    public static boolean c(int i, byte[] bArr) {
        if ((bArr[i] & 128) == 0) {
            for (int i2 = 0; i2 < 11; i2++) {
                byte b = bArr[i + i2];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + 11];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static Instant e(String str) throws IOException {
        boolean zM3708 = C0036.m3708(C0028.m2641(C0064.m4550(), str));
        String strM2151 = C0025.m2151(m7044(), 56, 1, 2866);
        String strM4545 = C0064.m4545(m7044(), 57, 51, 3021);
        if (!zM3708) {
            throw new IOException(C0074.m6503(strM4545, str, strM2151));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return m7043(C0068.m5614(bigDecimal), C0068.m5614(C0063.m4364(C0111.m13126(bigDecimal, C0075.m6892()), 9)));
        } catch (DateTimeException | ArithmeticException e) {
            throw new IOException(C0074.m6503(strM4545, str, strM2151), e);
        }
    }

    public final boolean b() {
        byte bM4516 = C0064.m4516(this);
        if (bM4516 == 53) {
            return true;
        }
        return (bM4516 == 120 || bM4516 == 88 || bM4516 == 103 || !C0072.m6150(C0031.m3046(this), C0034.m3431(m7044(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 1, 2065))) ? false : true;
    }

    public final boolean d() {
        return C0064.m4516(this) == 83 || C0034.m3499(this) || C0018.m1068(this);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C0350d5.class != C0030.m2951(obj)) {
            return false;
        }
        return C0070.m5838(C0031.m3046(this), C0031.m3046((C0350d5) obj));
    }

    public final void f(HashMap map, byte[] bArr, C0412n3 c0412n3) {
        String str;
        byte b;
        this.a = C0036.m3742(bArr, 0, 100, c0412n3);
        C0032.m3200(100, bArr, 8);
        C0032.m3200(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, bArr, 8);
        C0032.m3200(116, bArr, 8);
        long jM3200 = C0032.m3200(124, bArr, 12);
        this.b = jM3200;
        long j = 0;
        if (jM3200 < 0) {
            throw new IOException(C0067.m5418(m7044(), 154, 40, 720));
        }
        long jM32002 = C0032.m3200(136, bArr, 12);
        C0019.m1253();
        C0021.m1555(jM32002, C0038.m4008());
        int i = 148;
        long jM1665 = C0022.m1665(148, bArr, 8);
        long j2 = 0;
        int i2 = 0;
        while (true) {
            byte b2 = 32;
            if (i2 >= bArr.length) {
                break;
            }
            byte b3 = bArr[i2];
            if (i > i2 || i2 >= 156) {
                b2 = b3;
            }
            j += (long) (b2 & 255);
            j2 += (long) b2;
            i2++;
            i = 148;
        }
        if (jM1665 != j) {
            int i3 = (jM1665 > j2 ? 1 : (jM1665 == j2 ? 0 : -1));
        }
        this.c = bArr[156];
        C0036.m3742(bArr, 157, 100, c0412n3);
        C0077.m7197(InputDeviceCompat.SOURCE_KEYBOARD, bArr, 6);
        C0077.m7197(263, bArr, 2);
        C0036.m3742(bArr, 265, 32, c0412n3);
        C0036.m3742(bArr, 297, 32, c0412n3);
        byte bM4516 = C0064.m4516(this);
        if (bM4516 == 51 || bM4516 == 52) {
            C0032.m3200(329, bArr, 8);
            C0032.m3200(337, bArr, 8);
        }
        char c = C0031.m3027(C0016.m625(m7044(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 6, 901), bArr, InputDeviceCompat.SOURCE_KEYBOARD, 6) ? (char) 2 : C0031.m3027(C0071.m5991(m7044(), 115, 6, 1352), bArr, InputDeviceCompat.SOURCE_KEYBOARD, 6) ? (!C0031.m3027(C0063.m4315(m7044(), 121, 4, 3268), bArr, 508, 4) && ((str = (String) C0067.m5420(map, C0032.m3209(m7044(), 125, 15, 1978))) == null ? ((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & 128) == 0 && b != 32))) || C0066.m4865(476, bArr) || C0066.m4865(488, bArr) : !(C0070.m5838(C0038.m4022(m7044(), 140, 6, 911), str) || C0070.m5838(C0016.m625(m7044(), 146, 7, 1359), str)))) ? (char) 3 : (char) 4 : (char) 0;
        if (c == 2) {
            C0029.m2747(C0032.m3200(345, bArr, 12));
            C0029.m2747(C0032.m3200(357, bArr, 12));
            this.d = new ArrayList(C0029.m2797(386, bArr, 4));
            this.e = bArr[482] == 1;
            this.f = C0022.m1665(483, bArr, 12);
            return;
        }
        String strM2321 = C0026.m2321(m7044(), 153, 1, 1630);
        if (c == 4) {
            String strM3742 = C0036.m3742(bArr, 345, 131, c0412n3);
            if (!C0077.m7292(strM3742)) {
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, strM3742);
                C0077.m7290(sb, strM2321);
                C0077.m7290(sb, C0031.m3046(this));
                this.a = C0068.m5536(sb);
            }
            C0029.m2747(C0032.m3200(476, bArr, 12));
            C0029.m2747(C0032.m3200(488, bArr, 12));
            return;
        }
        String strM37422 = C0036.m3742(bArr, 345, ModuleDescriptor.MODULE_VERSION, c0412n3);
        if (C0039.m4131(this) && !C0072.m6150(C0031.m3046(this), strM2321)) {
            StringBuilder sb2 = new StringBuilder();
            C0077.m7290(sb2, C0031.m3046(this));
            C0077.m7290(sb2, strM2321);
            this.a = C0068.m5536(sb2);
        }
        if (C0077.m7292(strM37422)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        C0077.m7290(sb3, strM37422);
        C0077.m7290(sb3, strM2321);
        C0077.m7290(sb3, C0031.m3046(this));
        this.a = C0068.m5536(sb3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r57) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0350d5.g(java.lang.String):void");
    }

    public final int hashCode() {
        return C0027.m2392(C0031.m3046(this));
    }

    public C0350d5(HashMap map, byte[] bArr, C0412n3 c0412n3) throws IOException {
        String strM2993 = C0031.m2993();
        this.a = strM2993;
        this.j = new HashMap();
        String strM2697 = C0029.m2697(C0018.m1070(m7044(), 25, 9, 2097), strM2993);
        if (C0078.m7380(strM2697) > 31) {
            C0032.m3220(strM2697, 0, 31);
        }
        C0021.m1561();
        try {
            C0033.m3266(this, map, bArr, c0412n3);
        } catch (IllegalArgumentException e) {
            throw new IOException(C0025.m2151(m7044(), 34, 22, 1975), e);
        }
    }
}
