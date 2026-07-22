package com.zfork.multiplatforms.android.bomb;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.internal.view.SupportMenu;
import com.android.apksig.C0037;
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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0387j2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f337short = {3182, 3169, 3172, 3181, 3112, 3168, 3181, 3177, 3180, 3181, 3194, 3195, 3112, 3177, 3194, 3181, 3112, 3174, 3197, 3172, 3172, 3108, 3112, 3179, 3177, 3174, 3174, 3175, 3196, 3112, 3179, 3177, 3172, 3179, 3197, 3172, 3177, 3196, 3181, 3112, 3174, 3197, 3173, 3178, 3181, 3194, 3112, 3175, 3182, 3112, 3181, 3174, 3196, 3194, 3169, 3181, 3195, 3112, 3175, 3174, 3112, 3196, 3168, 3169, 3195, 3112, 3180, 3169, 3195, 3171, 1400, 1404, 290, 281, 260, 258, 263, 263, 280, 261, 259, 274, 275, 343, 310, 274, 260, 343, 257, 274, 261, 260, 286, 280, 281, 2120, 2116, 2137, 2137, 2142, 2139, 2143, 2059, 2154, 2158, 2168, 2059, 2126, 2131, 2143, 2137, 2122, 2059, 2127, 2122, 2143, 2122, 2059, 2137, 2126, 2120, 2116, 2137, 2127, 2136, 663, 699, 673, 696, 688, 756, 698, 699, 672, 756, 690, 701, 696, 696, 756, 694, 673, 690, 690, 689, 678, 847, 840, 854, 851, 850, 774, 854, 839, 852, 839, 843, 835, 850, 835, 852, 853, 774, 847, 853, 774, 840, 851, 842, 842, 778, 774, 837, 839, 840, 840, 841, 850, 774, 832, 847, 840, 839, 842, 847, 860, 835, 774, 860, 847, 854, 774, 832, 847, 842, 835, 471, 464, 456, 479, 466, 471, 474, 414, 461, 471, 473, 464, 479, 458, 459, 460, 475, 414, 472, 465, 460, 414, 452, 471, 462, 392, 394, 414, 475, 464, 474, 414, 465, 472, 414, 477, 475, 464, 458, 460, 479, 466, 414, 474, 471, 460, 475, 477, 458, 465, 460, 455, 414, 460, 475, 477, 465, 460, 474, 1137, 1142, 1134, 1145, 1140, 1137, 1148, 1080, 1143, 1150, 1150, 1131, 1149, 1132, 1080, 1150, 1143, 1130, 1080, 1131, 1132, 1145, 1130, 1132, 1080, 1143, 1150, 1080, 1149, 1142, 1148, 1080, 1143, 1150, 1080, 1147, 1149, 1142, 1132, 1130, 1145, 1140, 1080, 1148, 1137, 1130, 1149, 1147, 1132, 1143, 1130, 1121, 1080, 1130, 1149, 1147, 1143, 1130, 1148, 872, 879, 887, 864, 877, 872, 869, 801, 891, 872, 881, 823, 821, 801, 868, 879, 869, 801, 878, 871, 801, 866, 868, 879, 885, 883, 864, 877, 801, 869, 872, 883, 868, 866, 885, 878, 883, 888, 801, 877, 878, 866, 864, 885, 878, 883, 2538, 2729, 1981, 1946, 1922, 1941, 1944, 1949, 1936, 2004, 1937, 1946, 1920, 1926, 1933, 2004, 1946, 1941, 1945, 1937, 2004, 1949, 1946, 2004, 1938, 1949, 1944, 1937, 2004, 1948, 1937, 1941, 1936, 1937, 1926, 3135, 3074, 3082, 3103, 3097, 3086, 3103, 3102, 3162, 3097, 3103, 3092, 3086, 3080, 3099, 3094, 3162, 3102, 3091, 3080, 3103, 3097, 3086, 3093, 3080, 3075, 3162, 3103, 3092, 3086, 3080, 3075, 3162, 3092, 3093, 3086, 3162, 3100, 3093, 3087, 3092, 3102, 3162, 3154, 3161, 526, 3007, 2956, 2965, 3013, 2957, 2944, 2948, 2945, 2944, 2967, 2966, 3013, 2955, 2954, 2961, 3013, 2947, 2954, 2960, 2955, 2945, 3019, 3013, 2997, 2967, 2954, 2951, 2948, 2951, 2953, 2972, 3013, 2955, 2954, 2961, 3013, 2948, 3013, 2975, 2956, 2965, 3013, 2947, 2956, 2953, 2944, 3013, 2954, 2967, 3013, 2948, 3013, 2950, 2954, 2967, 2967, 2960, 2965, 2961, 2944, 2945, 3013, 2975, 2956, 2965, 3013, 2947, 2956, 2953, 2944, 1737, 1786, 1763, 1715, 1781, 1786, 1791, 1782, 1715, 1760, 1786, 1769, 1782, 1715, 1791, 1782, 1760, 1760, 1715, 1767, 1787, 1778, 1789, 1715, 1790, 1786, 1789, 1786, 1790, 1766, 1790, 1715, 1782, 1771, 1763, 1782, 1776, 1767, 1782, 1783, 1715, 1769, 1786, 1763, 1715, 1781, 1786, 1791, 1782, 1715, 1760, 1786, 1769, 1782, 1725, 1715, 1731, 1761, 1788, 1777, 1778, 1777, 1791, 1770, 1715, 1789, 1788, 1767, 1715, 1778, 1715, 1769, 1786, 1763, 1715, 1781, 1786, 1791, 1782, 1715, 1788, 1761, 1715, 1778, 1715, 1776, 1788, 1761, 1761, 1766, 1763, 1767, 1782, 1783, 1715, 1769, 1786, 1763, 1715, 1781, 1786, 1791, 1782, 741, 726, 719, 671, 727, 730, 734, 731, 730, 717, 716, 671, 721, 720, 715, 671, 729, 720, 714, 721, 731, 657, 671, 751, 717, 720, 733, 734, 733, 723, 710, 671, 721, 720, 715, 671, 734, 671, 709, 726, 719, 671, 729, 726, 723, 730, 2727, 2708, 2701, 2781, 2715, 2708, 2705, 2712, 2781, 2702, 2708, 2695, 2712, 2781, 2705, 2712, 2702, 2702, 2781, 2697, 2709, 2716, 2707, 2781, 2702, 2708, 2695, 2712, 2781, 2706, 2715, 2781, 2695, 2708, 2701, 2781, 2709, 2712, 2716, 2713, 2712, 2703, 2702, 2771, 2781, 2733, 2703, 2706, 2719, 2716, 2719, 2705, 2692, 2781, 2707, 2706, 2697, 2781, 2716, 2781, 2695, 2708, 2701, 2781, 2715, 2708, 2705, 2712, 2771, 3074, 3077, 3099, 3102, 3103, 3147, 3099, 3082, 3097, 3082, 3078, 3086, 3103, 3086, 3097, 3096, 3147, 3074, 3096, 3147, 3077, 3102, 3079, 3079, 3143, 3147, 3080, 3082, 3077, 3077, 3076, 3103, 3147, 3100, 3097, 3074, 3103, 3086, 3147, 3079, 3076, 3080, 3082, 3079, 3147, 3085, 3074, 3079, 3086, 3147, 3075, 3086, 3082, 3087, 3086, 3097, 1447, 1452, 1454, 1448, 1469, 1440, 1471, 1452, 1513, 1451, 1468, 1455, 1455, 1452, 1467, 1466, 1440, 1459, 1452, 1513, 1455, 1446, 1467, 1513, 1450, 1441, 1452, 1450, 1442, 1419, 1468, 1455, 1455, 1452, 1467, 1434, 1440, 1459, 1452, 1416, 1447, 1453, 1434, 1469, 1448, 1467, 1469, 1415, 1452, 1457, 1469, 1434, 1465, 1445, 1440, 1469, 1423, 1440, 1445, 1452, 2567, 2560, 2584, 2575, 2562, 2567, 2570, 2638, 2572, 2587, 2568, 2568, 2638, 2586, 2561, 2638, 2585, 2588, 2567, 2586, 2571, 2638, 2575, 2589, 2638, 2580, 2567, 2590, 2638, 2566, 2571, 2575, 2570, 2571, 2588, 2589};
    public final Object a;
    public final Object b;
    public Object c;

    public C0387j2(ByteArrayInputStream byteArrayInputStream, ByteArrayOutputStream byteArrayOutputStream, C0362f3 c0362f3) {
        this.b = c0362f3;
        this.c = byteArrayInputStream;
        this.a = byteArrayOutputStream;
    }

    public static void j(PushbackInputStream pushbackInputStream, byte[] bArr, int i) {
        if (C0064.m4626(pushbackInputStream, bArr, 0, i) != i) {
            throw new z5(C0065.m4757(m7080(), 125, 21, 724));
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7080() {
        if (C0035.m3569() < 0) {
            return f337short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m7081(Object obj) {
        if (C0035.m3569() < 0) {
            return ((byte[]) obj).clone();
        }
        return null;
    }

    public long m(int i, byte[] bArr) {
        int length = bArr.length - i;
        byte[] bArr2 = (byte[]) C0036.m3641(this);
        if (length < 8) {
            C0025.m2213(bArr2, (byte) 0);
        }
        C0027.m2519(bArr, i, bArr2, 0, C0032.m3151(bArr.length - i, 8));
        return (((((((((((((((long) (bArr2[7] & 255)) << 8) | ((long) (bArr2[6] & 255))) << 8) | ((long) (bArr2[5] & 255))) << 8) | ((long) (bArr2[4] & 255))) << 8) | ((long) (bArr2[3] & 255))) << 8) | ((long) (bArr2[2] & 255))) << 8) | ((long) (bArr2[1] & 255))) << 8) | ((long) (bArr2[0] & 255));
    }

    public static s5 a(D5 d5, int i, long j) {
        ArrayList arrayListM2889;
        s5 s5Var = new s5();
        s5Var.a = 10;
        s5Var.b = 44L;
        C0402m c0402mM1447 = C0020.m1447(d5);
        if (c0402mM1447 != null && (arrayListM2889 = C0030.m2889(c0402mM1447)) != null && C0018.m1084(arrayListM2889) > 0) {
            E1 e1 = (E1) C0064.m4526(C0030.m2889(C0020.m1447(d5)), 0);
            s5Var.c = C0035.m3593(e1);
            s5Var.d = C0022.m1714(e1);
        }
        C1 c1M1654 = C0022.m1654(d5);
        s5Var.e = C0038.m3947(c1M1654);
        s5Var.f = C0023.m1871(c1M1654);
        long jM1084 = C0018.m1084(C0030.m2889(C0020.m1447(d5)));
        s5Var.g = C0074.m6512(d5) ? C0037.m3909(C0030.m2889(C0020.m1447(d5)), C0038.m3947(C0022.m1654(d5))) : jM1084;
        s5Var.h = jM1084;
        s5Var.i = i;
        s5Var.j = j;
        return s5Var;
    }

    public static long b(ArrayList arrayList, int i) throws z5 {
        if (arrayList == null) {
            throw new z5(C0065.m4757(m7080(), 0, 70, 3080));
        }
        Iterator itM4154 = C0039.m4154(arrayList);
        int i2 = 0;
        while (C0036.m3657(itM4154)) {
            if (C0025.m2135((E1) C0071.m6012(itM4154)) == i) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(D5 d5, OutputStream outputStream) {
        int iM2850;
        if (outputStream instanceof C3) {
            C3 c3 = (C3) outputStream;
            C0022.m1654(d5).f = C0064.m4539(c3);
            iM2850 = C0030.m2850(c3);
        } else {
            iM2850 = 0;
        }
        if (C0063.m4401(d5)) {
            if (C0064.m4527(d5) == null) {
                d5.e = new s5();
            }
            if (C0036.m3714(d5) == null) {
                d5.d = new r5();
            }
            C0064.m4527(d5).j = C0111.m13113(C0022.m1654(d5));
            r5 r5VarM3714 = C0036.m3714(d5);
            r5VarM3714.b = iM2850;
            r5VarM3714.d = iM2850 + 1;
        }
        C1 c1M1654 = C0022.m1654(d5);
        c1M1654.b = iM2850;
        c1M1654.c = iM2850;
    }

    public static void g(AbstractC0384j abstractC0384j, C0387j2 c0387j2) {
        List listM4813 = C0066.m4813(abstractC0384j);
        if (listM4813 == null || C0034.m3427(listM4813) <= 0) {
            return;
        }
        List listM48132 = C0066.m4813(abstractC0384j);
        C0337c c0337c = null;
        if (listM48132 != null) {
            Iterator itM4732 = C0065.m4732(listM48132);
            while (true) {
                if (!C0036.m3657(itM4732)) {
                    break;
                }
                D1 d1 = (D1) C0071.m6012(itM4732);
                if (d1 != null && C0036.m3721(d1) == 39169) {
                    byte[] bArrM5778 = C0069.m5778(d1);
                    if (bArrM5778 == null || bArrM5778.length != 7) {
                        throw new z5(C0022.m1728(m7080(), 95, 30, 2091));
                    }
                    c0337c = new C0337c();
                    c0337c.a = 12;
                    c0337c.b = 7;
                    c0337c.c = 2;
                    c0337c.d = C0035.m3603(m7080(), 70, 2, 1337);
                    c0337c.e = 3;
                    c0337c.f = 2;
                    c0337c.a = 12;
                    c0337c.b = C0064.m4586(d1);
                    int i = 0;
                    int iM5892 = C0070.m5892(0, bArrM5778);
                    for (int i2 : C0067.m5480(2)) {
                        if (C0063.m4447(i2) == iM5892) {
                            c0337c.c = i2;
                            byte[] bArr = new byte[2];
                            C0027.m2519(bArrM5778, 2, bArr, 0, 2);
                            c0337c.d = new String(bArr);
                            int i3 = bArrM5778[4] & 255;
                            int[] iArrM5480 = C0067.m5480(3);
                            int length = iArrM5480.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                int i5 = iArrM5480[i4];
                                if (C0077.m7263(i5) == i3) {
                                    i = i5;
                                    break;
                                }
                                i4++;
                            }
                            c0337c.e = i;
                            c0337c.f = C0020.m1395(C0070.m5892(5, bArrM5778));
                        }
                    }
                    throw new z5(C0064.m4545(m7080(), 72, 23, 375));
                }
            }
        }
        if (c0337c != null) {
            abstractC0384j.p = c0337c;
            abstractC0384j.m = 4;
        }
    }

    public static int k(int i, byte[] bArr) {
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static int n(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static void p(RandomAccessFile randomAccessFile, long j) {
        if (randomAccessFile instanceof C0453u3) {
            C0017.m851(C0021.m1535((C0453u3) randomAccessFile), j);
        } else {
            C0017.m851(randomAccessFile, j);
        }
    }

    public static void r(D5 d5, int i, long j, ByteArrayOutputStream byteArrayOutputStream, C0387j2 c0387j2) {
        byte[] bArr = new byte[8];
        C0069.m5733(c0387j2, byteArrayOutputStream, (int) 101010256);
        C0016.m656(c0387j2, byteArrayOutputStream, C0038.m3947(C0022.m1654(d5)));
        C0016.m656(c0387j2, byteArrayOutputStream, C0023.m1871(C0022.m1654(d5)));
        long jM1084 = C0018.m1084(C0030.m2889(C0020.m1447(d5)));
        long jM3909 = C0074.m6512(d5) ? C0037.m3909(C0030.m2889(C0020.m1447(d5)), C0038.m3947(C0022.m1654(d5))) : jM1084;
        if (jM3909 > 65535) {
            jM3909 = 65535;
        }
        C0016.m656(c0387j2, byteArrayOutputStream, (int) jM3909);
        if (jM1084 > 65535) {
            jM1084 = 65535;
        }
        C0016.m656(c0387j2, byteArrayOutputStream, (int) jM1084);
        C0069.m5733(c0387j2, byteArrayOutputStream, i);
        if (j > 4294967295L) {
            C0029.m2742(4294967295L, bArr);
            C0067.m5408(byteArrayOutputStream, bArr, 0, 4);
        } else {
            C0029.m2742(j, bArr);
            C0067.m5408(byteArrayOutputStream, bArr, 0, 4);
        }
        String strM1349 = C0020.m1349(C0022.m1654(d5));
        if (!C0072.m6224(strM1349)) {
            C0016.m656(c0387j2, byteArrayOutputStream, 0);
            return;
        }
        byte[] bArrM5800 = C0069.m5800(strM1349, null);
        C0016.m656(c0387j2, byteArrayOutputStream, bArrM5800.length);
        C0033.m3292(byteArrayOutputStream, bArrM5800);
    }

    public static void s(int i, byte[] bArr) {
        bArr[3] = (byte) (i >>> 24);
        bArr[2] = (byte) (i >>> 16);
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
    }

    public static void u(long j, byte[] bArr) {
        bArr[7] = (byte) (j >>> 56);
        bArr[6] = (byte) (j >>> 48);
        bArr[5] = (byte) (j >>> 40);
        bArr[4] = (byte) (j >>> 32);
        bArr[3] = (byte) (j >>> 24);
        bArr[2] = (byte) (j >>> 16);
        bArr[1] = (byte) (j >>> 8);
        bArr[0] = (byte) (j & 255);
    }

    public static void y(s5 s5Var, ByteArrayOutputStream byteArrayOutputStream, C0387j2 c0387j2) {
        C0069.m5733(c0387j2, byteArrayOutputStream, (int) C0074.m6557(C0034.m3420(s5Var)));
        C0022.m1681(c0387j2, byteArrayOutputStream, C0069.m5734(s5Var));
        C0016.m656(c0387j2, byteArrayOutputStream, C0067.m5487(s5Var));
        C0016.m656(c0387j2, byteArrayOutputStream, C0032.m3171(s5Var));
        C0069.m5733(c0387j2, byteArrayOutputStream, C0020.m1346(s5Var));
        C0069.m5733(c0387j2, byteArrayOutputStream, C0078.m7321(s5Var));
        C0022.m1681(c0387j2, byteArrayOutputStream, C0074.m6501(s5Var));
        C0022.m1681(c0387j2, byteArrayOutputStream, C0034.m3439(s5Var));
        C0022.m1681(c0387j2, byteArrayOutputStream, C0067.m5449(s5Var));
        C0022.m1681(c0387j2, byteArrayOutputStream, C0069.m5821(s5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x0016, B:8:0x0021, B:10:0x0027, B:14:0x0038, B:18:0x004e, B:46:0x00f5, B:23:0x0063, B:25:0x0069, B:26:0x0070, B:28:0x0076, B:29:0x007d, B:31:0x008b, B:39:0x00a7, B:41:0x00ab, B:43:0x00ba, B:45:0x00cc, B:42:0x00b3, B:44:0x00c4, B:34:0x0098, B:36:0x009c, B:13:0x0030), top: B:56:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x0016, B:8:0x0021, B:10:0x0027, B:14:0x0038, B:18:0x004e, B:46:0x00f5, B:23:0x0063, B:25:0x0069, B:26:0x0070, B:28:0x0076, B:29:0x007d, B:31:0x008b, B:39:0x00a7, B:41:0x00ab, B:43:0x00ba, B:45:0x00cc, B:42:0x00b3, B:44:0x00c4, B:34:0x0098, B:36:0x009c, B:13:0x0030), top: B:56:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x0016, B:8:0x0021, B:10:0x0027, B:14:0x0038, B:18:0x004e, B:46:0x00f5, B:23:0x0063, B:25:0x0069, B:26:0x0070, B:28:0x0076, B:29:0x007d, B:31:0x008b, B:39:0x00a7, B:41:0x00ab, B:43:0x00ba, B:45:0x00cc, B:42:0x00b3, B:44:0x00c4, B:34:0x0098, B:36:0x009c, B:13:0x0030), top: B:56:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.zfork.multiplatforms.android.bomb.D5 r64, java.io.OutputStream r65) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0387j2.c(com.zfork.multiplatforms.android.bomb.D5, java.io.OutputStream):void");
    }

    public ArrayList d(int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            D1 d1 = new D1();
            d1.b = C0070.m5892(i2, bArr);
            int iM5892 = C0070.m5892(i2 + 2, bArr);
            d1.c = iM5892;
            int i3 = i2 + 4;
            if (iM5892 > 0) {
                byte[] bArr2 = new byte[iM5892];
                C0027.m2519(bArr, i3, bArr2, 0, iM5892);
                d1.d = bArr2;
            }
            i2 = i3 + iM5892;
            C0017.m919(arrayList, d1);
        }
        if (C0018.m1084(arrayList) > 0) {
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|40|3|4|44|5|(10:6|(1:8)(1:46)|34|13|23|38|24|42|25|29)|12|34|13|23|38|24|42|25|29|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r57 = this;
            r6 = r57
            java.lang.Object r0 = com.android.apksig.util.C0031.m3108(r6)
            java.io.ByteArrayInputStream r0 = (java.io.ByteArrayInputStream) r0
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
        L12:
            int r4 = com.android.apksig.zip.C0035.m3621(r0, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            r5 = -1
            if (r4 == r5) goto L23
            r5 = 0
            com.joke.plugin.gson.internal.bind.util.C0067.m5408(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            goto L12
        L1e:
            r0 = move-exception
            r1 = r2
            goto L30
        L21:
            goto L36
        L23:
            byte[] r1 = com.zfork.multiplatforms.android.bomb.C0077.m7297(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
        L27:
            com.android.apksig.internal.asn1.C0022.m1770(r2)     // Catch: java.io.IOException -> L39
            goto L39
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r2 = r1
            goto L36
        L30:
            if (r1 == 0) goto L35
            com.android.apksig.internal.asn1.C0022.m1770(r1)     // Catch: java.io.IOException -> L35
        L35:
            throw r0
        L36:
            if (r2 == 0) goto L39
            goto L27
        L39:
            com.zfork.multiplatforms.android.bomb.T r0 = new com.zfork.multiplatforms.android.bomb.T
            r0.<init>(r1)
            com.zfork.multiplatforms.android.bomb.Y r1 = new com.zfork.multiplatforms.android.bomb.Y
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            r1.b = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.g = r2
            com.zfork.multiplatforms.android.bomb.W4 r2 = new com.zfork.multiplatforms.android.bomb.W4
            r2.<init>()
            r3 = 1
            r2.b = r3
            r1.h = r2
            com.zfork.multiplatforms.android.bomb.R2 r2 = new com.zfork.multiplatforms.android.bomb.R2     // Catch: java.io.IOException -> L80
            r2.<init>(r6, r1)     // Catch: java.io.IOException -> L80
            com.android.apksig.apk.C0016.m607(r0, r2)     // Catch: java.io.IOException -> L80
        L80:
            byte[] r0 = com.android.apksig.C0038.m3937(r1)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.Object r1 = com.android.apksig.zip.C0036.m3641(r6)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            com.android.apksig.zip.C0033.m3292(r1, r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            goto L90
        L8e:
            r0 = move-exception
            throw r0
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0387j2.f():void");
    }

    public D5 h(RandomAccessFile randomAccessFile, q5 q5Var) throws IOException {
        byte b;
        List listM3866;
        byte[] bArr;
        E1 e1;
        byte[] bArr2;
        D5 d5;
        byte[] bArr3;
        C0402m c0402m;
        byte[] bArr4;
        ArrayList arrayList;
        byte[] bArr5;
        C0387j2 c0387j2 = this;
        C0387j2 c0387j22 = (C0387j2) C0036.m3641(c0387j2);
        if (C0028.m2600(randomAccessFile) == 0) {
            return new D5();
        }
        if (C0028.m2600(randomAccessFile) < 22) {
            throw new z5(C0037.m3829(m7080(), FrameMetricsAggregator.EVERY_DURATION, 103, 1683));
        }
        D5 d52 = new D5();
        c0387j2.c = d52;
        try {
            d52.c = C0064.m4589(c0387j2, randomAccessFile, c0387j22, q5Var);
            D5 d53 = (D5) C0031.m3108(c0387j2);
            C1 c1M1654 = C0022.m1654(d53);
            if (C0017.m877(c1M1654) == 0) {
                return d53;
            }
            long jM3315 = C0033.m3315(c1M1654);
            r5 r5Var = new r5();
            C0020.m1412(randomAccessFile, jM3315 - 20);
            byte[] bArr6 = (byte[]) C0031.m3108(c0387j22);
            C0025.m2228(randomAccessFile, bArr6);
            int i = 0;
            long jM5546 = C0068.m5546(0, bArr6);
            byte[] bArr7 = (byte[]) C0036.m3641(c0387j22);
            if (jM5546 == 117853008) {
                ((D5) C0031.m3108(c0387j2)).i = true;
                r5Var.a = 9;
                C0025.m2228(randomAccessFile, bArr6);
                r5Var.b = C0068.m5546(0, bArr6);
                C0025.m2228(randomAccessFile, bArr7);
                r5Var.c = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr6);
                r5Var.d = C0068.m5546(0, bArr6);
            } else {
                ((D5) C0031.m3108(c0387j2)).i = false;
                r5Var = null;
            }
            d53.d = r5Var;
            D5 d54 = (D5) C0031.m3108(c0387j2);
            boolean zM4401 = C0063.m4401(d54);
            byte[] bArr8 = (byte[]) C0068.m5627(c0387j22);
            if (zM4401) {
                r5 r5VarM3714 = C0036.m3714(d54);
                if (r5VarM3714 == null) {
                    throw new z5(C0033.m3330(m7080(), 314, 46, 769));
                }
                long jM4680 = C0065.m4680(r5VarM3714);
                if (jM4680 < 0) {
                    throw new z5(C0018.m1070(m7080(), 255, 59, 1048));
                }
                C0017.m851(randomAccessFile, jM4680);
                s5 s5Var = new s5();
                C0025.m2228(randomAccessFile, bArr6);
                if (C0068.m5546(0, bArr6) != 101075792) {
                    throw new z5(C0037.m3829(m7080(), 196, 59, 446));
                }
                s5Var.a = 10;
                C0025.m2228(randomAccessFile, bArr7);
                s5Var.b = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr8);
                s5Var.c = C0070.m5892(0, bArr8);
                C0025.m2228(randomAccessFile, bArr8);
                s5Var.d = C0070.m5892(0, bArr8);
                C0025.m2228(randomAccessFile, bArr6);
                s5Var.e = C0068.m5546(0, bArr6);
                C0025.m2228(randomAccessFile, bArr6);
                s5Var.f = C0068.m5546(0, bArr6);
                C0025.m2228(randomAccessFile, bArr7);
                s5Var.g = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr7);
                s5Var.h = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr7);
                s5Var.i = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr7);
                s5Var.j = C0074.m6479(c0387j22, 0, bArr7);
                long jM5734 = C0069.m5734(s5Var) - 44;
                if (jM5734 > 0) {
                    C0025.m2228(randomAccessFile, new byte[(int) jM5734]);
                }
                d54.e = s5Var;
                D5 d55 = (D5) C0031.m3108(c0387j2);
                s5 s5VarM4527 = C0064.m4527(d55);
                if (s5VarM4527 == null || C0020.m1346(s5VarM4527) <= 0) {
                    d55.f = false;
                } else {
                    d55.f = true;
                }
            }
            D5 d56 = (D5) C0031.m3108(c0387j2);
            C0402m c0402m2 = new C0402m();
            ArrayList arrayList2 = new ArrayList();
            D5 d57 = (D5) C0031.m3108(c0387j2);
            boolean zM44012 = C0063.m4401(d57);
            long jM5821 = zM44012 ? C0069.m5821(C0064.m4527(d57)) : C0111.m13113(C0022.m1654(d57));
            long jM3439 = zM44012 ? C0034.m3439(C0064.m4527(d57)) : C0017.m877(C0022.m1654(d57));
            C0017.m851(randomAccessFile, jM5821);
            byte[] bArr9 = new byte[2];
            byte[] bArr10 = new byte[4];
            int i2 = 0;
            while (i2 < jM3439) {
                E1 e12 = new E1();
                C0025.m2228(randomAccessFile, bArr6);
                int i3 = i2;
                if (C0068.m5546(i, bArr6) != 33639248) {
                    StringBuilder sb = new StringBuilder(C0029.m2695(m7080(), 395, 45, 3194));
                    C0021.m1551(sb, i3 + 1);
                    C0077.m7290(sb, C0019.m1189(m7080(), 440, 1, 551));
                    throw new z5(C0068.m5536(sb));
                }
                e12.a = 3;
                C0025.m2228(randomAccessFile, bArr8);
                e12.t = C0070.m5892(i, bArr8);
                C0025.m2228(randomAccessFile, bArr8);
                e12.b = C0070.m5892(i, bArr8);
                byte[] bArr11 = new byte[2];
                C0025.m2228(randomAccessFile, bArr11);
                e12.l = C0021.m1652(bArr11[i], i);
                e12.n = C0021.m1652(bArr11[i], 3);
                e12.q = C0021.m1652(bArr11[1], 3);
                e12.c = (byte[]) m7081(bArr11);
                C0025.m2228(randomAccessFile, bArr8);
                e12.d = C0020.m1395(C0070.m5892(0, bArr8));
                C0025.m2228(randomAccessFile, bArr6);
                e12.e = C0068.m5546(0, bArr6);
                C0025.m2228(randomAccessFile, bArr10);
                e12.f = C0074.m6479(c0387j22, 0, bArr10);
                C0025.m2213(bArr7, (byte) 0);
                C0111.m13028(randomAccessFile, bArr7, 0, 4);
                e12.g = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2213(bArr7, (byte) 0);
                C0111.m13028(randomAccessFile, bArr7, 0, 4);
                e12.h = C0074.m6479(c0387j22, 0, bArr7);
                C0025.m2228(randomAccessFile, bArr8);
                int iM5892 = C0070.m5892(0, bArr8);
                e12.i = iM5892;
                C0025.m2228(randomAccessFile, bArr8);
                e12.j = C0070.m5892(0, bArr8);
                C0025.m2228(randomAccessFile, bArr8);
                int iM58922 = C0070.m5892(0, bArr8);
                C0025.m2228(randomAccessFile, bArr8);
                e12.u = C0070.m5892(0, bArr8);
                C0025.m2228(randomAccessFile, bArr9);
                C0025.m2228(randomAccessFile, bArr10);
                e12.v = (byte[]) m7081(bArr10);
                C0025.m2228(randomAccessFile, bArr10);
                byte[] bArr12 = bArr9;
                C0402m c0402m3 = c0402m2;
                e12.w = C0074.m6479(c0387j22, 0, bArr10);
                if (iM5892 <= 0) {
                    throw new z5(C0021.m1650(m7080(), 362, 33, 2036));
                }
                byte[] bArr13 = new byte[iM5892];
                C0025.m2228(randomAccessFile, bArr13);
                String strM3261 = C0033.m3261(bArr13, C0068.m5607(e12), null);
                e12.k = strM3261;
                byte[] bArrM2763 = C0029.m2763(e12);
                byte b2 = bArrM2763[0];
                e12.s = (b2 != 0 && C0021.m1652(b2, 4)) || ((b = bArrM2763[3]) != 0 && C0021.m1652(b, 6)) || C0072.m6150(strM3261, C0029.m2695(m7080(), 360, 1, 2501)) || C0072.m6150(strM3261, C0078.m7427(m7080(), 361, 1, 2805));
                int iM5586 = C0068.m5586(e12);
                if (iM5586 > 0) {
                    if (iM5586 < 4) {
                        if (iM5586 > 0) {
                            C0073.m6344(randomAccessFile, iM5586);
                        }
                        listM3866 = null;
                    } else {
                        byte[] bArr14 = new byte[iM5586];
                        C0066.m4833(randomAccessFile, bArr14);
                        try {
                            listM3866 = C0077.m7233(c0387j2, iM5586, bArr14);
                        } catch (Exception unused) {
                            listM3866 = C0037.m3866();
                        }
                    }
                    e12.r = listM3866;
                }
                List listM4813 = C0066.m4813(e12);
                if (listM4813 == null || C0034.m3427(listM4813) <= 0) {
                    bArr = bArr10;
                    e1 = e12;
                    bArr2 = bArr8;
                    d5 = d56;
                    bArr3 = bArr6;
                    c0402m = c0402m3;
                    bArr4 = bArr12;
                    arrayList = arrayList2;
                    bArr5 = bArr7;
                } else {
                    bArr = bArr10;
                    e1 = e12;
                    bArr4 = bArr12;
                    c0402m = c0402m3;
                    bArr3 = bArr6;
                    arrayList = arrayList2;
                    d5 = d56;
                    bArr2 = bArr8;
                    bArr5 = bArr7;
                    t5 t5VarM3307 = C0033.m3307(C0066.m4813(e12), c0387j22, C0075.m6881(e12), C0066.m4817(e12), C0032.m3179(e12), C0025.m2135(e12));
                    if (t5VarM3307 != null) {
                        e1.o = t5VarM3307;
                        long jM6804 = C0075.m6804(t5VarM3307);
                        if (jM6804 != -1) {
                            e1.h = jM6804;
                        }
                        long jM4362 = C0063.m4362(t5VarM3307);
                        if (jM4362 != -1) {
                            e1.g = jM4362;
                        }
                        long jM1377 = C0020.m1377(t5VarM3307);
                        if (jM1377 != -1) {
                            e1.w = jM1377;
                        }
                        int iM6829 = C0075.m6829(t5VarM3307);
                        if (iM6829 != -1) {
                            e1.u = iM6829;
                        }
                    }
                }
                C0069.m5834(e1, c0387j22);
                if (iM58922 > 0) {
                    byte[] bArr15 = new byte[iM58922];
                    C0025.m2228(randomAccessFile, bArr15);
                    e1.x = C0033.m3261(bArr15, C0068.m5607(e1), null);
                }
                if (C0026.m2287(e1)) {
                    if (C0066.m4871(e1) != null) {
                        e1.m = 4;
                    } else {
                        e1.m = 2;
                        C0017.m919(arrayList, e1);
                        i2 = i3 + 1;
                        c0402m2 = c0402m;
                        arrayList2 = arrayList;
                        bArr9 = bArr4;
                        bArr6 = bArr3;
                        bArr7 = bArr5;
                        bArr10 = bArr;
                        bArr8 = bArr2;
                        d56 = d5;
                        i = 0;
                        c0387j2 = this;
                    }
                }
                C0017.m919(arrayList, e1);
                i2 = i3 + 1;
                c0402m2 = c0402m;
                arrayList2 = arrayList;
                bArr9 = bArr4;
                bArr6 = bArr3;
                bArr7 = bArr5;
                bArr10 = bArr;
                bArr8 = bArr2;
                d56 = d5;
                i = 0;
                c0387j2 = this;
            }
            C0402m c0402m4 = c0402m2;
            byte[] bArr16 = bArr8;
            D5 d58 = d56;
            c0402m4.a = arrayList2;
            C0025.m2228(randomAccessFile, bArr6);
            if (C0068.m5546(0, r22) == 84233040) {
                C0025.m2228(randomAccessFile, bArr16);
                int iM58923 = C0070.m5892(0, bArr16);
                if (iM58923 > 0) {
                    byte[] bArr17 = new byte[iM58923];
                    C0025.m2228(randomAccessFile, bArr17);
                    new String(bArr17);
                }
            }
            d58.b = c0402m4;
            return (D5) C0031.m3108(this);
        } catch (z5 e) {
            throw e;
        } catch (IOException e2) {
            C0033.m3347(e2);
            throw new z5(C0017.m936(m7080(), 441, 70, 3045), e2);
        }
    }

    public int l(PushbackInputStream pushbackInputStream) {
        byte[] bArr = (byte[]) C0031.m3108(this);
        C0035.m3559(pushbackInputStream, bArr, 4);
        return C0068.m5546(0, bArr);
    }

    public void q(D5 d5, ByteArrayOutputStream byteArrayOutputStream, C0387j2 c0387j2) {
        ArrayList arrayListM2889;
        int i = 2;
        int i2 = 0;
        C0402m c0402mM1447 = C0020.m1447(d5);
        if (c0402mM1447 == null || (arrayListM2889 = C0030.m2889(c0402mM1447)) == null || C0018.m1084(arrayListM2889) <= 0) {
            return;
        }
        Iterator itM4154 = C0039.m4154(C0030.m2889(C0020.m1447(d5)));
        while (C0036.m3657(itM4154)) {
            E1 e1 = (E1) C0071.m6012(itM4154);
            byte[] bArr = (byte[]) C0031.m3108(this);
            byte[] bArr2 = (byte[]) C0068.m5627(this);
            if (e1 == null) {
                throw new z5(C0036.m3678(m7080(), 729, 56, 3179));
            }
            try {
                byte[] bArr3 = new byte[i];
                // fill-array-data instruction
                bArr3[0] = 0;
                bArr3[1] = 0;
                boolean z = C0066.m4817(e1) >= 4294967295L || C0075.m6881(e1) >= 4294967295L || C0032.m3179(e1) >= 4294967295L || C0025.m2135(e1) >= 65535;
                C0069.m5733(c0387j2, byteArrayOutputStream, (int) C0074.m6557(C0034.m3420(e1)));
                C0016.m656(c0387j2, byteArrayOutputStream, C0035.m3593(e1));
                C0016.m656(c0387j2, byteArrayOutputStream, C0022.m1714(e1));
                C0033.m3292(byteArrayOutputStream, C0024.m2053(e1));
                C0016.m656(c0387j2, byteArrayOutputStream, C0031.m3107(C0071.m5987(e1)));
                C0029.m2742(C0022.m1767(e1), bArr2);
                C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                C0029.m2742(C0072.m6168(e1), bArr2);
                C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                if (z) {
                    C0029.m2742(4294967295L, bArr2);
                    C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                    C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                    d5.i = true;
                } else {
                    C0029.m2742(C0066.m4817(e1), bArr2);
                    C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                    C0029.m2742(C0075.m6881(e1), bArr2);
                    C0067.m5408(byteArrayOutputStream, bArr2, i2, 4);
                }
                byte[] bArrM5800 = new byte[i2];
                if (C0072.m6224(C0073.m6428(e1))) {
                    bArrM5800 = C0069.m5800(C0073.m6428(e1), null);
                }
                C0016.m656(c0387j2, byteArrayOutputStream, bArrM5800.length);
                byte[] bArr4 = new byte[4];
                if (z) {
                    C0029.m2742(4294967295L, bArr2);
                    C0027.m2519(bArr2, i2, bArr4, i2, 4);
                } else {
                    C0029.m2742(C0032.m3179(e1), bArr2);
                    C0027.m2519(bArr2, i2, bArr4, i2, 4);
                }
                int iM4586 = z ? 32 : 0;
                if (C0066.m4871(e1) != null) {
                    iM4586 += 11;
                }
                List listM4813 = C0066.m4813(e1);
                Iterator it = itM4154;
                if (listM4813 != null) {
                    Iterator itM4732 = C0065.m4732(listM4813);
                    while (C0036.m3657(itM4732)) {
                        D1 d1 = (D1) C0071.m6012(itM4732);
                        Iterator it2 = itM4732;
                        long jM3721 = C0036.m3721(d1);
                        if (jM3721 != 39169 && jM3721 != 1) {
                            iM4586 += C0064.m4586(d1) + 4;
                        }
                        itM4732 = it2;
                    }
                }
                C0016.m656(c0387j2, byteArrayOutputStream, iM4586);
                String strM2614 = C0028.m2614(e1);
                byte[] bArrM58002 = new byte[0];
                if (C0072.m6224(strM2614)) {
                    bArrM58002 = C0069.m5800(strM2614, null);
                }
                C0016.m656(c0387j2, byteArrayOutputStream, bArrM58002.length);
                if (z) {
                    C0016.m705(SupportMenu.USER_MASK, bArr);
                    C0067.m5408(byteArrayOutputStream, bArr, 0, 2);
                } else {
                    C0016.m656(c0387j2, byteArrayOutputStream, C0025.m2135(e1));
                }
                C0033.m3292(byteArrayOutputStream, bArr3);
                C0033.m3292(byteArrayOutputStream, C0029.m2763(e1));
                C0033.m3292(byteArrayOutputStream, bArr4);
                if (bArrM5800.length > 0) {
                    C0033.m3292(byteArrayOutputStream, bArrM5800);
                }
                if (z) {
                    d5.i = true;
                    C0016.m656(c0387j2, byteArrayOutputStream, (int) 1);
                    C0016.m656(c0387j2, byteArrayOutputStream, 28);
                    C0022.m1681(c0387j2, byteArrayOutputStream, C0075.m6881(e1));
                    C0022.m1681(c0387j2, byteArrayOutputStream, C0066.m4817(e1));
                    C0022.m1681(c0387j2, byteArrayOutputStream, C0032.m3179(e1));
                    C0069.m5733(c0387j2, byteArrayOutputStream, C0025.m2135(e1));
                }
                C0337c c0337cM4871 = C0066.m4871(e1);
                if (c0337cM4871 != null) {
                    C0016.m656(c0387j2, byteArrayOutputStream, (int) C0074.m6557(C0034.m3420(c0337cM4871)));
                    C0016.m656(c0387j2, byteArrayOutputStream, C0071.m6081(c0337cM4871));
                    C0016.m656(c0387j2, byteArrayOutputStream, C0063.m4447(C0111.m13048(c0337cM4871)));
                    C0033.m3292(byteArrayOutputStream, C0069.m5800(C0077.m7283(c0337cM4871), null));
                    C0033.m3292(byteArrayOutputStream, new byte[]{(byte) C0077.m7263(C0032.m3155(c0337cM4871))});
                    C0016.m656(c0387j2, byteArrayOutputStream, C0031.m3107(C0024.m1994(c0337cM4871)));
                }
                C0074.m6511(this, e1, byteArrayOutputStream);
                if (bArrM58002.length > 0) {
                    C0033.m3292(byteArrayOutputStream, bArrM58002);
                }
                itM4154 = it;
                i = 2;
                i2 = 0;
            } catch (Exception e) {
                throw new z5(e);
            }
        }
    }

    public void t(OutputStream outputStream, int i) {
        byte[] bArr = (byte[]) C0031.m3108(this);
        C0016.m705(i, bArr);
        C0033.m3292(outputStream, bArr);
    }

    public void v(OutputStream outputStream, long j) {
        byte[] bArr = (byte[]) C0036.m3641(this);
        C0029.m2742(j, bArr);
        C0033.m3292(outputStream, bArr);
    }

    public void w(E1 e1, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArrM5778;
        List listM4813 = C0066.m4813(e1);
        if (listM4813 == null || C0034.m3427(listM4813) == 0) {
            return;
        }
        Iterator itM4732 = C0065.m4732(C0066.m4813(e1));
        while (C0036.m3657(itM4732)) {
            D1 d1 = (D1) C0071.m6012(itM4732);
            long jM3721 = C0036.m3721(d1);
            if (jM3721 != 39169 && jM3721 != 1) {
                int i = (int) jM3721;
                C0387j2 c0387j2 = (C0387j2) C0036.m3641(this);
                C0016.m656(c0387j2, byteArrayOutputStream, i);
                C0016.m656(c0387j2, byteArrayOutputStream, C0064.m4586(d1));
                if (C0064.m4586(d1) > 0 && (bArrM5778 = C0069.m5778(d1)) != null) {
                    C0033.m3292(byteArrayOutputStream, bArrM5778);
                }
            }
        }
    }

    public void x(OutputStream outputStream, int i) {
        byte[] bArr = (byte[]) C0068.m5627(this);
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
        C0033.m3292(outputStream, bArr);
    }

    public void z(D5 d5, OutputStream outputStream, byte[] bArr) {
        if (bArr == null) {
            throw new z5(C0039.m4066(m7080(), 845, 36, 2670));
        }
        if (outputStream instanceof C0404m1) {
            C0404m1 c0404m1 = (C0404m1) outputStream;
            int length = bArr.length;
            if (C0036.m3645(c0404m1)) {
                Q4 q4M4091 = C0039.m4091(c0404m1);
                if (length < 0) {
                    C0030.m2951(q4M4091);
                    throw new z5(C0024.m1945(m7080(), 785, 60, 1481));
                }
                long jM5514 = C0067.m5514(q4M4091);
                if (jM5514 >= 65536 && C0027.m2420(q4M4091) + ((long) length) > jM5514) {
                    try {
                        C0021.m1523(q4M4091);
                        q4M4091.e = 0L;
                        C0035.m3626(this, d5, outputStream);
                        return;
                    } catch (IOException e) {
                        throw new z5(e);
                    }
                }
            }
        }
        C0033.m3292(outputStream, bArr);
    }

    public static t5 o(List list, C0387j2 c0387j2, long j, long j2, long j3, int i) {
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            D1 d1 = (D1) C0071.m6012(itM4732);
            if (d1 != null && 1 == C0036.m3721(d1)) {
                t5 t5Var = new t5();
                t5Var.b = -1L;
                t5Var.c = -1L;
                t5Var.d = -1L;
                t5Var.e = -1;
                byte[] bArrM5778 = C0069.m5778(d1);
                int iM4586 = C0064.m4586(d1);
                if (iM4586 <= 0) {
                    return null;
                }
                int i2 = 0;
                if (iM4586 > 0 && j == 4294967295L) {
                    t5Var.c = C0074.m6479(c0387j2, 0, bArrM5778);
                    i2 = 8;
                }
                if (i2 < C0064.m4586(d1) && j2 == 4294967295L) {
                    t5Var.b = C0074.m6479(c0387j2, i2, bArrM5778);
                    i2 += 8;
                }
                if (i2 < C0064.m4586(d1) && j3 == 4294967295L) {
                    t5Var.d = C0074.m6479(c0387j2, i2, bArrM5778);
                    i2 += 8;
                }
                if (i2 < C0064.m4586(d1) && i == 65535) {
                    t5Var.e = C0068.m5546(i2, bArrM5778);
                }
                return t5Var;
            }
        }
        return null;
    }

    public C1 i(RandomAccessFile randomAccessFile, C0387j2 c0387j2, q5 q5Var) throws IOException {
        long jM2600 = C0028.m2600(randomAccessFile);
        if (jM2600 >= 22) {
            long jM26002 = jM2600 - 22;
            C0020.m1412(randomAccessFile, jM26002);
            byte[] bArr = (byte[]) C0031.m3108((C0387j2) C0036.m3641(this));
            C0025.m2228(randomAccessFile, bArr);
            boolean z = false;
            if (C0068.m5546(0, bArr) != 101010256) {
                jM26002 = C0028.m2600(randomAccessFile) - 22;
                long jM26003 = 65536;
                if (C0028.m2600(randomAccessFile) < 65536) {
                    jM26003 = C0028.m2600(randomAccessFile);
                }
                while (jM26003 > 0 && jM26002 > 0) {
                    jM26002--;
                    C0020.m1412(randomAccessFile, jM26002);
                    C0025.m2228(randomAccessFile, bArr);
                    if (C0068.m5546(0, bArr) != 101010256) {
                        jM26003--;
                    }
                }
                throw new z5(C0038.m4022(m7080(), 614, 46, 703));
            }
            C0020.m1412(randomAccessFile, 4 + jM26002);
            C1 c1 = new C1();
            c1.a = 4;
            byte[] bArr2 = (byte[]) C0068.m5627(c0387j2);
            C0025.m2228(randomAccessFile, bArr2);
            c1.b = C0070.m5892(0, bArr2);
            C0025.m2228(randomAccessFile, bArr2);
            c1.c = C0070.m5892(0, bArr2);
            C0025.m2228(randomAccessFile, bArr2);
            c1.d = C0070.m5892(0, bArr2);
            C0025.m2228(randomAccessFile, bArr2);
            c1.e = C0070.m5892(0, bArr2);
            byte[] bArr3 = (byte[]) C0031.m3108(c0387j2);
            C0025.m2228(randomAccessFile, bArr3);
            C0068.m5546(0, bArr3);
            c1.g = jM26002;
            byte[] bArr4 = (byte[]) C0068.m5627(this);
            C0025.m2228(randomAccessFile, bArr4);
            c1.f = C0074.m6479(c0387j2, 0, bArr4);
            C0025.m2228(randomAccessFile, bArr2);
            int iM5892 = C0070.m5892(0, bArr2);
            String strM3261 = null;
            if (iM5892 > 0) {
                try {
                    byte[] bArr5 = new byte[iM5892];
                    C0025.m2228(randomAccessFile, bArr5);
                    strM3261 = C0033.m3261(bArr5, false, C0064.m4627());
                } catch (IOException unused) {
                }
            }
            if (strM3261 != null) {
                c1.h = strM3261;
            }
            D5 d5 = (D5) C0031.m3108(this);
            if (C0038.m3947(c1) > 0) {
                z = true;
            }
            d5.f = z;
            return c1;
        }
        throw new z5(C0021.m1650(m7080(), 660, 69, 2813));
    }

    public C0387j2(int i) {
        switch (i) {
            case 1:
                this.a = new C0387j2(3);
                this.b = new byte[8];
                this.c = new byte[4];
                break;
            case 2:
            default:
                this.a = new C0387j2(3);
                this.b = new byte[4];
                break;
            case 3:
                this.b = new byte[2];
                this.c = new byte[4];
                this.a = new byte[8];
                break;
        }
    }
}
