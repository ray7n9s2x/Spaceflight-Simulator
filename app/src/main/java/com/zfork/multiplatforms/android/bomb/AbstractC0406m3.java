package com.zfork.multiplatforms.android.bomb;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
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
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickBean;
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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0406m3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f345short = {421, 406, 466, 469, 465, 1419, 1450, 1469, 1446, 1465, 1450, 1451, 1519, 1412, 1450, 1462, 1519, 1446, 1441, 1465, 1454, 1443, 1446, 1451, 1519, 1449, 1440, 1469, 1519, 1412, 1450, 1462, 1519, 1411, 1450, 1441, 1448, 1467, 1447, 1519, 1428, 1514, 1451, 1426, 1519, 1410, 1422, 1420, 1519, 1411, 1450, 1441, 1448, 1467, 1447, 1519, 1428, 1514, 1451, 1426, 3105, 3077, 3091, 3109, 3096, 3092, 3090, 3073, 3108, 3073, 3092, 3073, 3122, 3077, 3075, 3087, 3090, 3076, 3136, 3086, 3087, 3092, 3136, 3088, 3090, 3077, 3091, 3077, 3086, 3092, 3136, 3081, 3086, 3136, 3084, 3087, 3075, 3073, 3084, 3136, 3080, 3077, 3073, 3076, 3077, 3090, 3136, 3078, 3087, 3090, 3136, 3073, 3077, 3091, 3136, 3077, 3086, 3075, 3090, 3097, 3088, 3092, 3077, 3076, 3136, 3076, 3073, 3092, 3073, 2780, 2780, 1379, 2612, 2619, 2622, 2615, 2674, 2586, 2615, 2611, 2614, 2615, 2592, 2593, 2674, 2611, 2592, 2615, 2674, 2620, 2599, 2622, 2622, 2686, 2674, 2609, 2611, 2620, 2620, 2621, 2598, 2674, 2614, 2615, 2598, 2615, 2592, 2623, 2619, 2620, 2615, 2674, 2612, 2619, 2622, 2615, 2674, 2618, 2615, 2611, 2614, 2615, 2592, 2674, 2597, 2619, 2598, 2618, 2674, 2615, 2602, 2611, 2609, 2598, 2674, 2623, 2611, 2598, 2609, 2618, 2674, 2612, 2621, 2592, 2674, 2612, 2619, 2622, 2615, 2588, 2611, 2623, 2615, 2664, 2674, 979, 981, 990, 964, 962, 977, 988, 912, 980, 985, 962, 981, 979, 964, 991, 962, 969, 912, 985, 963, 912, 990, 965, 988, 988, 924, 912, 979, 977, 990, 990, 991, 964, 912, 980, 981, 964, 981, 962, 989, 985, 990, 981, 912, 982, 985, 988, 981, 912, 984, 981, 977, 980, 981, 962, 912, 967, 985, 964, 984, 912, 981, 968, 977, 979, 964, 912, 989, 977, 964, 979, 984, 912, 982, 991, 962, 912, 982, 985, 988, 981, 1022, 977, 989, 981, 906, 912, 2904, 2903, 2898, 2907, 2846, 2896, 2911, 2899, 2907, 2846, 2903, 2893, 2846, 2896, 2891, 2898, 2898, 2834, 2846, 2909, 2911, 2896, 2896, 2897, 2890, 2846, 2906, 2907, 2890, 2907, 2892, 2899, 2903, 2896, 2907, 2846, 2904, 2903, 2898, 2907, 2846, 2902, 2907, 2911, 2906, 2907, 2892, 2846, 2889, 2903, 2890, 2902, 2846, 2907, 2886, 2911, 2909, 2890, 2846, 2899, 2911, 2890, 2909, 2902, 2846, 2904, 2897, 2892, 2846, 2904, 2903, 2898, 2907, 2928, 2911, 2899, 2907, 2820, 2846, 265, 282, 259, 339, 286, 284, 279, 278, 287, 339, 282, 256, 339, 285, 262, 287, 287, 351, 339, 272, 274, 285, 285, 284, 263, 339, 279, 278, 263, 278, 257, 286, 282, 285, 278, 339, 277, 282, 287, 278, 339, 283, 278, 274, 279, 278, 257, 339, 260, 282, 263, 283, 339, 278, 267, 274, 272, 263, 339, 286, 274, 263, 272, 283, 339, 277, 284, 257, 339, 277, 282, 287, 278, 317, 274, 286, 278, 329, 339, 2043, 2034, 2020, 2034, 2042, 2032, 2012, 2013, 2013, 2006, 2000, 1991, 2887, 2891, 2890, 2890, 2881, 2887, 2896, 2939, 2885, 2888, 2888, 646, 664, 671, 661, 670, 646, 2671, 2673, 2678, 2684, 2679, 2671, 875, 867, 882, 871, 857, 866, 871, 882, 871, 857, 885, 882, 873, 884, 867, 857, 868, 871, 869, 877, 883, 886, 808, 882, 871, 884, 2366, 2366, 2366, 2407, 2431, 2427, 2367, 2407, 2343, 2348, 2365, 2326, 2344, 2361, 2361, 2319, 2336, 2363, 2362, 2365, 2304, 2343, 2336, 2365, 2336, 2344, 2341, 2336, 2355, 2348, 2349, 1983, 1955, 1962, 1975, 1966, 2027, 1958, 1962, 1960, 1946, 1956, 1973, 1973, 1932, 1963, 1964, 1969, 2083, 2145, 2143, 2136, 2130, 2137, 2113, 2117, 2075, 2171, 2159, 921, 935, 928, 938, 929, 953, 957, 995, 924, 897, 897, 922, 641, 675, 684, 684, 685, 694, 738, 688, 679, 675, 678, 738, 676, 695, 686, 686, 699, 738, 683, 684, 694, 685, 738, 672, 699, 694, 679, 738, 672, 695, 676, 676, 679, 688, 3056, 3031, 3023, 3032, 3029, 3024, 3037, 2969, 3019, 3036, 3032, 3037, 3061, 3036, 3031, 3038, 3021, 3025, 1392, 1355, 1344, 1373, 1365, 1344, 1350, 1361, 1344, 1345, 1285, 1376, 1386, 1379, 1285, 1367, 1344, 1348, 1350, 1357, 1344, 1345, 1285, 1362, 1357, 1344, 1355, 1285, 1361, 1367, 1372, 1356, 1355, 1346, 1285, 1361, 1354, 1285, 1367, 1344, 1348, 1345, 1285, 1366, 1361, 1367, 1344, 1348, 1352, 2518, 2559, 2548, 2557, 2542, 2546, 2490, 2557, 2536, 2559, 2555, 2542, 2559, 2536, 2490, 2542, 2546, 2555, 2548, 2490, 2552, 2543, 2556, 2556, 2559, 2536, 2490, 2537, 2547, 2528, 2559, 2365, 2326, 2324, 2322, 2311, 2330, 2309, 2326, 2387, 2335, 2326, 2333, 2324, 2311, 2331, 2020, 1999, 1997, 1995, 2014, 1987, 2012, 1999, 1930, 1989, 1996, 1996, 2009, 1999, 2014, 1043, 1039, 1030, 1051, 1026, 1095, 1034, 1030, 1028, 1078, 1032, 1049, 1049, 1056, 1031, 1024, 1053, 2734, 2738, 2747, 2726, 2751, 2810, 2743, 2747, 2745, 2699, 2726, 2737, 2745, 2737, 2745, 2742, 2737, 2726, 2699, 2721, 2726, 2749, 1155, 1170, 1152, 1152, 1225, 860, 838, 840, 833, 2973, 2973, 3035, 3011, 2523, 2523, 2461, 2437, 2523, 2438, 2455, 2437, 2437, 900, 900, 962, 986, 900, 962, 972, 976, 900, 968, 965, 960, 968, 986, 2992, 2992, 3062, 3064, 3044, 2992, 3053, 3068, 3054, 3054, 1847, 1847, 1909, 1903, 1902};
    public static final C0479z a = new C0479z(0);
    public static final C0408n b = new C0408n(3);

    public static byte[] a(char[] cArr, boolean z) {
        int i = 0;
        if (!z) {
            byte[] bArr = new byte[cArr.length];
            while (i < cArr.length) {
                bArr[i] = (byte) cArr[i];
                i++;
            }
            return bArr;
        }
        try {
            ByteBuffer byteBufferM6877 = C0075.m6877(C0024.m1956(), C0032.m3152(cArr));
            byte[] bArr2 = new byte[C0075.m6818(byteBufferM6877)];
            C0029.m2812(byteBufferM6877, bArr2);
            return bArr2;
        } catch (Exception unused) {
            byte[] bArr3 = new byte[cArr.length];
            while (i < cArr.length) {
                bArr3[i] = (byte) cArr[i];
                i++;
            }
            return bArr3;
        }
    }

    public static boolean q(byte b2, int i) {
        return ((1 << i) & ((long) b2)) != 0;
    }

    public static void t(int i, byte[] bArr) {
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        for (int i2 = 4; i2 <= 15; i2++) {
            bArr[i2] = 0;
        }
    }

    public static byte x(byte b2, int i) {
        return (byte) (b2 | (1 << i));
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7092() {
        if (C0021.m1598() < 0) {
            return f345short;
        }
        return null;
    }

    public static String b(byte[] bArr, boolean z, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z) {
            return new String(bArr, C0024.m1956());
        }
        try {
            return new String(bArr, C0063.m4315(m7092(), 0, 5, 486));
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static Object c(Object obj) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0027.m2502(new ObjectOutputStream(byteArrayOutputStream), obj);
            return C0029.m2718(new ObjectInputStream(new ByteArrayInputStream(C0077.m7297(byteArrayOutputStream))));
        } catch (IOException | ClassNotFoundException e) {
            C0033.m3347(e);
            return null;
        }
    }

    public static byte[] d(byte[] bArr, char[] cArr, int i, boolean z) throws z5 {
        byte[] bArr2 = bArr;
        int i2 = 0;
        int iM7188 = C0077.m7188(i);
        int iM3398 = C0034.m3398(i);
        int i3 = iM7188 + iM3398 + 2;
        C0030.m2951(cArr);
        byte[] bArrM3680 = C0036.m3680(cArr, z);
        Q2 q2 = new Q2();
        int iM649 = C0016.m649(q2);
        C0111.m13154(q2, bArrM3680);
        int i4 = i3 == 0 ? iM649 : i3;
        int i5 = (i4 / iM649) + (i4 % iM649 > 0 ? 1 : 0);
        int i6 = i4 - ((i5 - 1) * iM649);
        byte[] bArr3 = new byte[i5 * iM649];
        int i7 = 1;
        int i8 = 0;
        while (i7 <= i5) {
            byte[] bArr4 = new byte[iM649];
            byte[] bArrM1214 = new byte[bArr2.length + 4];
            C0027.m2519(bArr2, i2, bArrM1214, i2, bArr2.length);
            int length = bArr2.length;
            bArrM1214[length] = (byte) (i7 / 16777216);
            bArrM1214[length + 1] = (byte) (i7 / 65536);
            bArrM1214[length + 2] = (byte) (i7 / 256);
            bArrM1214[length + 3] = (byte) i7;
            for (int i9 = 0; i9 < 1000; i9++) {
                if (C0069.m5716(C0075.m6883(q2)) > 0) {
                    C0077.m7199(q2, 0);
                }
                bArrM1214 = C0019.m1214(C0025.m2116(q2), bArrM1214);
                for (int i10 = 0; i10 < iM649; i10++) {
                    bArr4[i10] = (byte) (bArr4[i10] ^ bArrM1214[i10]);
                }
            }
            i2 = 0;
            C0027.m2519(bArr4, 0, bArr3, i8, iM649);
            i8 += iM649;
            i7++;
            bArr2 = bArr;
        }
        if (i6 < iM649) {
            byte[] bArr5 = new byte[i4];
            C0027.m2519(bArr3, i2, bArr5, i2, i4);
            bArr3 = bArr5;
        }
        if (bArr3.length == i3) {
            return bArr3;
        }
        Integer numM1548 = C0021.m1548(iM7188);
        Integer numM15482 = C0021.m1548(iM3398);
        Object[] objArr = new Object[2];
        objArr[i2] = numM1548;
        objArr[1] = numM15482;
        throw new z5(C0021.m1531(C0066.m4828(m7092(), 5, 55, 1487), objArr));
    }

    public static void g(String str, V0 v0) {
        C0065.m4734(new Thread(new T0(new E(), str, v0)));
    }

    public static byte[] h(String str, Charset charset) {
        return charset == null ? C0025.m2092(str, C0064.m4627()) : C0025.m2092(str, charset);
    }

    public static int i(AbstractC0384j abstractC0384j) throws z5 {
        int iM5987 = C0071.m5987(abstractC0384j);
        if (iM5987 != 3) {
            return iM5987;
        }
        C0337c c0337cM4871 = C0066.m4871(abstractC0384j);
        if (c0337cM4871 != null) {
            return C0024.m1994(c0337cM4871);
        }
        throw new z5(C0038.m4022(m7092(), 60, 69, 3168));
    }

    public static E1 l(D5 d5, String str) throws z5 {
        if (d5 == null) {
            throw new z5(C0032.m3116(C0075.m6791(m7092(), 381, 79, 371), str));
        }
        if (!C0072.m6224(str)) {
            throw new z5(C0032.m3116(C0033.m3330(m7092(), 302, 79, 2878), str));
        }
        C0402m c0402mM1447 = C0020.m1447(d5);
        if (c0402mM1447 == null) {
            throw new z5(C0032.m3116(C0024.m1945(m7092(), 215, 87, 944), str));
        }
        ArrayList arrayListM2889 = C0030.m2889(c0402mM1447);
        if (arrayListM2889 == null) {
            throw new z5(C0032.m3116(C0035.m3603(m7092(), 132, 83, 2642), str));
        }
        if (C0018.m1084(arrayListM2889) == 0) {
            return null;
        }
        Iterator itM4154 = C0039.m4154(C0030.m2889(C0020.m1447(d5)));
        while (C0036.m3657(itM4154)) {
            E1 e1 = (E1) C0071.m6012(itM4154);
            String strM6428 = C0073.m6428(e1);
            if (C0072.m6224(strM6428) && C0070.m5838(str, strM6428)) {
                return e1;
            }
        }
        return null;
    }

    public static List m(Context context) {
        SharedPreferences sharedPreferencesM2737 = context == null ? null : C0029.m2737(context, C0071.m5991(m7092(), 460, 12, 1971), 0);
        if (sharedPreferencesM2737 != null) {
            String strM1422 = C0020.m1422(sharedPreferencesM2737, C0067.m5418(m7092(), 472, 11, 2852), C0031.m2993());
            if (!C0038.m3939(strM1422)) {
                return (List) C0030.m2963(strM1422, C0072.m6196(AutoClickBean.class));
            }
        }
        return new ArrayList();
    }

    public static int n(Context context) {
        WindowManager windowManager = (WindowManager) C0026.m2310(context, C0074.m6452(m7092(), 483, 6, 753));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C0032.m3136(C0069.m5833(windowManager), displayMetrics);
        return C0068.m5638(displayMetrics);
    }

    public static int o(Context context) {
        WindowManager windowManager = (WindowManager) C0026.m2310(context, C0078.m7427(m7092(), 489, 6, 2584));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C0032.m3136(C0069.m5833(windowManager), displayMetrics);
        return C0039.m4161(displayMetrics);
    }

    public static void p(Application application) {
        String strM5991 = C0071.m5991(m7092(), 495, 26, 774);
        String strM3330 = C0033.m3330(m7092(), 521, 31, 2377);
        try {
            SharedPreferences sharedPreferencesM2737 = C0029.m2737(application, C0076.m6902(m7092(), 552, 17, 1989), 0);
            if (C0066.m4848(sharedPreferencesM2737, strM3330, false)) {
                return;
            }
            InputStream inputStreamM5812 = C0069.m5812(C0036.m3768(application), strM5991);
            try {
                File file = new File(C0038.m4020(application), strM5991);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    C0016.m667(inputStreamM5812, fileOutputStream);
                    C0063.m4304(fileOutputStream);
                    String strM5696 = C0069.m5696(C0035.m3575(application));
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        C0357e5 c0357e5 = new C0357e5(fileInputStream);
                        try {
                            for (C0350d5 c0350d5M1014 = C0018.m1014(c0357e5); c0350d5M1014 != null; c0350d5M1014 = C0018.m1014(c0357e5)) {
                                byte bM4516 = C0064.m4516(c0350d5M1014);
                                if (bM4516 == 0 || bM4516 == 48 || !(bM4516 == 53 || C0072.m6150(C0031.m3046(c0350d5M1014), C0018.m1070(m7092(), 569, 1, 2060)))) {
                                    File file2 = new File(strM5696, C0031.m3046(c0350d5M1014));
                                    File fileM3328 = C0033.m3328(file2);
                                    if (fileM3328 != null && !C0033.m3343(fileM3328)) {
                                        C0019.m1226(fileM3328);
                                    }
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                    try {
                                        C0016.m667(c0357e5, fileOutputStream2);
                                        C0063.m4304(fileOutputStream2);
                                    } catch (Throwable th) {
                                        try {
                                            C0063.m4304(fileOutputStream2);
                                        } catch (Throwable th2) {
                                            C0072.m6234(th, th2);
                                        }
                                        throw th;
                                    }
                                } else if (C0039.m4131(c0350d5M1014)) {
                                    File file3 = new File(strM5696, C0031.m3046(c0350d5M1014));
                                    if (!C0033.m3343(file3)) {
                                        C0019.m1226(file3);
                                    }
                                }
                            }
                            C0034.m3461(c0357e5);
                            C0016.m636(fileInputStream);
                            C0024.m1958(inputStreamM5812);
                            C0072.m6210(C0111.m13185(C0026.m2261(sharedPreferencesM2737), strM3330, true));
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static boolean r(String str) {
        return str != null && C0078.m7380(C0023.m1802(str)) > 0;
    }

    public static boolean s(String str) {
        return C0025.m2111(str, C0029.m2695(m7092(), 570, 10, 2102)) || C0025.m2111(str, C0111.m13097(m7092(), 580, 12, 974));
    }

    public static int v(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(C0038.m4022(m7092(), 739, 15, 1962));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C0032.m3209(m7092(), 724, 15, 2419));
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(C0111.m13097(m7092(), 693, 31, 2458));
        }
        while (i3 != i2) {
            int iM3212 = C0032.m3212(inputStream, bArr, i + i3, i2 - i3);
            if (iM3212 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            i3 += iM3212;
        }
        return i3;
    }

    public static String y(File file, File file2, File file3, String str, String str2) {
        String strM1728 = C0022.m1728(m7092(), 793, 5, 1267);
        try {
            String strM6902 = C0076.m6902(m7092(), 798, 4, 815);
            String strM2840 = C0030.m2840(m7092(), 802, 4, 2992);
            String strM4158 = C0039.m4158(file3);
            String strM936 = C0017.m936(m7092(), 806, 9, 2550);
            StringBuilder sb = new StringBuilder(strM1728);
            C0077.m7290(sb, str2);
            String strM5536 = C0068.m5536(sb);
            String strM7205 = C0077.m7205(m7092(), 815, 14, 937);
            String strM3330 = C0033.m3330(m7092(), 829, 10, 2973);
            StringBuilder sb2 = new StringBuilder(strM1728);
            C0077.m7290(sb2, str2);
            C0029.m2752(new String[]{strM6902, strM2840, strM4158, strM936, strM5536, strM7205, str, strM3330, C0068.m5536(sb2), C0066.m4828(m7092(), 839, 5, 1818), C0039.m4158(file2), C0039.m4158(file)});
            return C0031.m2993();
        } catch (Exception e) {
            return C0077.m7276(e);
        }
    }

    public static int e(int i, Context context) {
        return (int) ((i * C0078.m7404(C0066.m4797(C0029.m2720(context)))) + 0.5f);
    }

    public static int f(Context context, float f) {
        return (int) ((f * C0078.m7404(C0066.m4797(C0029.m2720(context)))) + 0.5f);
    }

    public static Drawable j(String str) {
        return C0021.m1589(C0024.m2031(), str);
    }

    public static E1 k(D5 d5, String str) {
        E1 e1M2161 = C0025.m2161(d5, str);
        if (e1M2161 == null) {
            String strM4022 = C0038.m4022(m7092(), 129, 2, 2688);
            String strM1904 = C0023.m1904(m7092(), 131, 1, 1356);
            String strM6422 = C0073.m6422(str, strM4022, strM1904);
            E1 e1M21612 = C0025.m2161(d5, strM6422);
            if (e1M21612 == null) {
                return C0025.m2161(d5, C0073.m6422(strM6422, strM1904, strM4022));
            }
            return e1M21612;
        }
        return e1M2161;
    }

    public static int u(InputStream inputStream, byte[] bArr) throws IOException {
        int iM3621 = C0035.m3621(inputStream, bArr);
        if (iM3621 != -1) {
            if (iM3621 != bArr.length) {
                if (iM3621 >= 0) {
                    int iM3212 = 0;
                    if (iM3621 == 0) {
                        iM3621 = 0;
                    } else {
                        int length = bArr.length - iM3621;
                        for (int i = 1; iM3621 < bArr.length && iM3212 != -1 && i < 15; i++) {
                            iM3212 = C0032.m3212(inputStream, bArr, iM3621, length);
                            if (iM3212 > 0) {
                                iM3621 += iM3212;
                                length -= iM3212;
                            }
                        }
                    }
                    if (iM3621 != bArr.length) {
                        throw new IOException(C0025.m2151(m7092(), 592, 34, 706));
                    }
                } else {
                    throw new IOException(C0076.m6902(m7092(), 626, 18, AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN));
                }
            }
            return iM3621;
        }
        throw new IOException(C0066.m4828(m7092(), 644, 49, 1317));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static ContentResolver w(Context context) {
        ContentResolver contentResolverM2615 = C0028.m2615(context);
        try {
            Iterator itM4732 = C0065.m4732(C0073.m6328(contentResolverM2615));
            while (C0036.m3657(itM4732)) {
                UriPermission uriPermission = (UriPermission) C0071.m6012(itM4732);
                int iM1799 = C0023.m1799(uriPermission);
                if (C0064.m4531(uriPermission)) {
                    iM1799 = (iM1799 == true ? 1 : 0) | 2;
                }
                C0069.m5825(contentResolverM2615, C0038.m4042(uriPermission), iM1799);
            }
            C0072.m6210(C0027.m2422(C0026.m2261(C0029.m2737(context, C0064.m4545(m7092(), 754, 17, 1129), 0)), C0068.m5544(m7092(), 771, 22, 2772)));
        } catch (Exception unused) {
        }
        return contentResolverM2615;
    }
}
