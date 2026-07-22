package com.zfork.multiplatforms.android.bomb;

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
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class A5 implements Closeable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f230short = {811, 792, 769, 849, 791, 792, 797, 788, 849, 784, 797, 771, 788, 784, 789, 776, 849, 788, 777, 792, 770, 773, 770, 863, 849, 811, 792, 769, 849, 791, 792, 797, 788, 849, 791, 798, 771, 796, 784, 773, 849, 789, 798, 788, 770, 849, 799, 798, 773, 849, 784, 797, 797, 798, 774, 849, 772, 769, 789, 784, 773, 792, 799, 790, 849, 770, 769, 797, 792, 773, 862, 770, 769, 784, 799, 799, 788, 789, 849, 791, 792, 797, 788, 770, 2523, 2524, 2502, 2519, 2496, 2524, 2515, 2526, 2450, 2519, 2496, 2496, 2525, 2496, 2440, 2450, 2504, 2523, 2498, 2450, 2527, 2525, 2518, 2519, 2526, 2450, 2523, 2497, 2450, 2524, 2503, 2526, 2526, 1094, 1089, 1119, 1114, 1115, 1116, 1115, 1117, 1098, 1102, 1090, 1039, 1094, 1116, 1039, 1089, 1114, 1091, 1091, 1027, 1039, 1100, 1102, 1089, 1089, 1088, 1115, 1039, 1102, 1099, 1099, 1039, 1097, 1094, 1091, 1098, 1039, 1115, 1088, 1039, 1109, 1094, 1119, 2341, 2314, 2304, 2326, 2315, 2317, 2304, 2345, 2309, 2314, 2317, 2306, 2305, 2327, 2320, 2378, 2332, 2313, 2312, 1158, 1153, 1183, 1178, 1179, 1231, 1161, 1158, 1155, 1162, 1231, 1153, 1166, 1154, 1162, 1231, 1158, 1180, 1231, 1162, 1154, 1179, 1183, 1174, 1231, 1152, 1181, 1231, 1153, 1178, 1155, 1155, 1219, 1231, 1164, 1166, 1153, 1153, 1152, 1179, 1231, 1160, 1162, 1179, 1231, 1193, 1158, 1155, 1162, 1191, 1162, 1166, 1163, 1162, 1181, 1276, 1232, 1226, 1235, 1243, 1183, 1233, 1232, 1227, 1183, 1235, 1232, 1244, 1246, 1227, 1242, 1183, 1235, 1232, 1244, 1246, 1235, 1183, 1241, 1238, 1235, 1242, 1183, 1239, 1242, 1246, 1243, 1242, 1229, 1183, 1241, 1232, 1229, 1183, 1244, 1232, 1229, 1229, 1242, 1228, 1231, 1232, 1233, 1243, 1238, 1233, 1240, 1183, 1241, 1238, 1235, 1242, 1183, 1239, 1242, 1246, 1243, 1242, 1229, 2631, 2644, 2637, 2589, 2640, 2642, 2649, 2648, 2641, 2589, 2644, 2638, 2589, 2643, 2632, 2641, 2641, 2577, 2589, 2654, 2652, 2643, 2643, 2642, 2633, 2589, 2650, 2648, 2633, 2589, 2644, 2643, 2637, 2632, 2633, 2638, 2633, 2639, 2648, 2652, 2640, 1188, 1264, 1251, 1274, 1188, 1210, 1210, 1211, 2907, 1194, 1195, 1252, 1206, 1185, 1189, 1184, 1252, 1189, 1191, 1191, 1185, 1207, 1207, 1252, 1186, 1195, 1206, 1252, 1200, 1196, 1185, 1252, 1197, 1194, 1204, 1201, 1200, 1252, 1214, 1197, 1204, 1252, 1186, 1197, 1192, 1185, 2241, 2290, 2283, 2235, 2301, 2290, 2295, 2302, 2235, 2301, 2292, 2281, 2294, 2298, 2287, 2235, 2303, 2292, 2302, 2280, 2235, 2293, 2292, 2287, 2235, 2298, 2295, 2295, 2292, 2284, 2235, 2286, 2283, 2303, 2298, 2287, 2290, 2293, 2300, 2235, 2280, 2283, 2295, 2290, 2287, 2228, 2280, 2283, 2298, 2293, 2293, 2302, 2303, 2235, 2301, 2290, 2295, 2302, 2280, 1265, 1278, 1275, 1266, 1241, 1270, 1274, 1266, 1252, 1207, 1275, 1278, 1252, 1251, 1207, 1278, 1252, 1207, 1273, 1250, 1275, 1275, 2881, 2894, 2891, 2882, 2823, 2889, 2886, 2890, 2882, 2823, 2894, 2900, 2823, 2882, 2890, 2903, 2899, 2910, 2823, 2888, 2901, 2823, 2889, 2898, 2891, 2891, 2827, 2823, 2884, 2886, 2889, 2889, 2888, 2899, 2823, 2901, 2882, 2890, 2888, 2897, 2882, 2823, 2881, 2894, 2891, 2882, 2832, 2851, 2874, 2922, 2860, 2851, 2854, 2863, 2922, 2860, 2853, 2872, 2855, 2859, 2878, 2922, 2862, 2853, 2863, 2873, 2922, 2852, 2853, 2878, 2922, 2859, 2854, 2854, 2853, 2877, 2922, 2879, 2874, 2862, 2859, 2878, 2851, 2852, 2861, 2922, 2873, 2874, 2854, 2851, 2878, 2917, 2873, 2874, 2859, 2852, 2852, 2863, 2862, 2922, 2860, 2851, 2854, 2863, 2873};
    public final File a;
    public D5 b;
    public final N3 c;
    public final C0387j2 d;
    public final int e;
    public final ArrayList f;
    public final boolean g;

    public A5(String str) {
        this(new File(str), 0);
    }

    /* JADX INFO: renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6908() {
        if (C0029.m2791() >= 0) {
            return f230short;
        }
        return null;
    }

    public A5(File file) {
        this(file, 0);
    }

    public final void a(InputStream inputStream, F5 f5) {
        if (inputStream == null) {
            throw new z5(C0020.m1443(m6908(), 117, 43, 1071));
        }
        C0038.m4031(this);
        if (C0070.m5956(this) == null) {
            throw new z5(C0027.m2404(m6908(), 84, 33, 2482));
        }
        if (C0033.m3343(C0017.m950(this)) && C0074.m6512(C0070.m5956(this))) {
            throw new z5(C0021.m1650(m6908(), 0, 84, 881));
        }
        C0017.m875(new C0420p(C0070.m5956(this), C0063.m4391(this), C0072.m6223(this)), new C0414o(inputStream, f5, new q5(C0032.m3249(this), C0066.m4878(this))));
    }

    public final C0479z b() {
        return new C0479z(null, C0018.m1027(this), 1);
    }

    public final E1 c() throws z5 {
        String strM1189 = C0019.m1189(m6908(), 160, 19, 2404);
        if (!C0072.m6224(strM1189)) {
            throw new z5(C0078.m7427(m6908(), 179, 55, 1263));
        }
        C0038.m4031(this);
        D5 d5M5956 = C0070.m5956(this);
        if (d5M5956 == null || C0020.m1447(d5M5956) == null) {
            return null;
        }
        return C0018.m972(d5M5956, strM1189);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayListM3787 = C0037.m3787(this);
        Iterator itM4154 = C0039.m4154(arrayListM3787);
        while (C0036.m3657(itM4154)) {
            C0024.m1958((InputStream) C0071.m6012(itM4154));
        }
        C0064.m4570(arrayListM3787);
    }

    public final RandomAccessFile e() {
        File fileM950 = C0017.m950(this);
        if (!C0072.m6150(C0018.m1025(fileM950), C0028.m2609(m6908(), 339, 8, 1162))) {
            return new RandomAccessFile(fileM950, C0069.m5807(m6908(), 347, 1, 2857));
        }
        C0453u3 c0453u3 = new C0453u3(fileM950, C0031.m2973(fileM950));
        C0027.m2427(c0453u3, C0016.m681(c0453u3).length - 1);
        return c0453u3;
    }

    public final void f() {
        if (C0070.m5956(this) != null) {
            return;
        }
        File fileM950 = C0017.m950(this);
        if (!C0033.m3343(fileM950)) {
            D5 d5 = new D5();
            this.b = d5;
            d5.h = fileM950;
            return;
        }
        if (!C0021.m1582(fileM950)) {
            throw new z5(C0075.m6791(m6908(), 348, 37, 1220));
        }
        try {
            RandomAccessFile randomAccessFileM2299 = C0026.m2299(this);
            try {
                D5 d5M1759 = C0022.m1759(new C0387j2(0), randomAccessFileM2299, new q5(C0032.m3249(this), C0066.m4878(this)));
                this.b = d5M1759;
                d5M1759.h = fileM950;
                C0111.m13119(randomAccessFileM2299);
            } catch (Throwable th) {
                try {
                    C0111.m13119(randomAccessFileM2299);
                } catch (Throwable th2) {
                    C0072.m6234(th, th2);
                }
                throw th;
            }
        } catch (z5 e) {
            throw e;
        } catch (IOException e2) {
            throw new z5(e2);
        }
    }

    public final void g(E1 e1) {
        String strM6428 = C0073.m6428(e1);
        if (!C0072.m6224(strM6428)) {
            throw new z5(C0069.m5807(m6908(), 466, 46, 2855));
        }
        List listM13086 = C0111.m13086(strM6428);
        if (listM13086 == null) {
            throw new z5(C0036.m3678(m6908(), 444, 22, 1175));
        }
        if (C0025.m2084(listM13086)) {
            return;
        }
        if (C0070.m5956(this) == null) {
            C0038.m4031(this);
        }
        D5 d5M5956 = C0070.m5956(this);
        if (C0074.m6512(d5M5956)) {
            throw new z5(C0069.m5807(m6908(), 385, 59, 2203));
        }
        C0017.m875(new W3(d5M5956, C0063.m4391(this), C0072.m6223(this)), new V3(listM13086, new q5(C0032.m3249(this), C0066.m4878(this))));
    }

    public final String toString() {
        return C0032.m3137(C0017.m950(this));
    }

    public A5(File file, int i) {
        this.d = new C0387j2(1);
        this.e = 4096;
        this.f = new ArrayList();
        this.g = true;
        this.a = file;
        this.c = new N3();
    }

    public final C5 d(E1 e1) throws IOException {
        P4 p4M2338;
        C0038.m4031(this);
        D5 d5M5956 = C0070.m5956(this);
        if (d5M5956 != null) {
            try {
                p4M2338 = C0026.m2338(d5M5956);
                try {
                    C0036.m3723(p4M2338, e1);
                    C5 c5 = new C5(p4M2338);
                    if (C0031.m3003(c5, e1) != null) {
                        C0017.m919(C0037.m3787(this), c5);
                        return c5;
                    }
                    throw new z5(C0074.m6452(m6908(), 234, 64, 1215));
                } catch (IOException e) {
                    e = e;
                    if (p4M2338 != null) {
                        C0024.m1958(p4M2338);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
                p4M2338 = null;
            }
        } else {
            throw new z5(C0017.m936(m6908(), 298, 41, 2621));
        }
    }

    public final void h(HashMap map) {
        if (C0037.m3811(map) == 0) {
            return;
        }
        C0038.m4031(this);
        if (!C0074.m6512(C0070.m5956(this))) {
            C0479z c0479zM6223 = C0072.m6223(this);
            C0017.m875(new Y3(C0070.m5956(this), C0063.m4391(this), new C0387j2(3), c0479zM6223), new X3(map, new q5(C0032.m3249(this), C0066.m4878(this))));
            return;
        }
        throw new z5(C0035.m3603(m6908(), 512, 59, 2890));
    }
}
