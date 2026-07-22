package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
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
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import org.conscrypt.C0111;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0446t2 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f362short = {2418, 2416, 2401, 2368, 2427, 2406, 2420, 2419, 2416, 548, 567, 561, 520, 544, 561, 557, 554, 545, 928, 929, 935, 936, 933, 950, 941, 938, 931, 903, 936, 933, 951, 951, 2028, 2047, 2041, 1995, 2020, 2024, 2017, 2025, 1986, 2047, 1984, 2024, 2041, 2021, 2018, 2025, 2399, 2392, 2384, 2393, 2905, 2897, 2880, 2908, 2907, 2896, 2887, 989, 1010, 989, 977, 984, 976, 967, 1073, 1028, 1067, 1063, 1070, 1062, 1073, 1019, 1011, 1019, 1012, 1011, 996, 425, 758, 444, 2340, 2917, 2884, 2889, 2889, 2888, 2883, 2924, 2909, 2884, 2927, 2900, 2909, 2892, 2910, 2910, 395, 428, 427, 438, 427, 419, 430, 427, 440, 423, 482, 423, 432, 432, 429, 432, 1073, 1069, 1068, 1078, 1125, 1066, 1063, 1071, 1056, 1062, 1073, 1125, 1068, 1078, 1125, 1067, 1066, 1073, 1125, 1060, 1067, 1125, 1068, 1067, 1078, 1073, 1060, 1067, 1062, 1056, 1125, 1066, 1059, 1125, 1073, 1069, 1056, 1125, 1058, 1068, 1075, 1056, 1067, 1125, 1062, 1065, 1060, 1078, 1078, 1620, 1619, 1611, 1618, 1622, 1624, 1716, 1686, 1689, 1689, 1688, 1667, 1751, 1681, 1694, 1689, 1683, 1751, 1690, 1686, 1667, 1684, 1695, 1694, 1689, 1680, 1751, 1690, 1682, 1667, 1695, 1688, 1683, 1211, 1197, 1212, 1152, 1185, 1196, 1196, 1197, 1190, 1161, 1208, 1185, 1165, 1200, 1197, 1189, 1208, 1212, 1185, 1191, 1190, 1211, 2595, 2593, 2608, 2582, 2609, 2602, 2608, 2605, 2601, 2593, 2563, 2594, 2607, 2607, 2606, 2597, 2570, 2619, 2594, 2569, 2610, 2619, 2602, 2616, 2616};
    public static final HashSet f = new HashSet();

    public static boolean b(String... strArr) {
        String strM3678 = C0036.m3678(m7118(), 196, 22, 1224);
        try {
            C0073.m6316(VMRuntime.class, C0073.m6316(VMRuntime.class, null, C0111.m13097(m7118(), 218, 10, 2628), new Object[0]), strM3678, new Object[]{strArr});
            return true;
        } catch (Throwable th) {
            C0021.m1620(C0018.m1070(m7118(), 228, 15, 2635), strM3678, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7118() {
        if (C0066.m4827() >= 0) {
            return f362short;
        }
        return null;
    }

    static {
        try {
            Unsafe unsafe = (Unsafe) C0070.m5924(C0073.m6369(Unsafe.class, C0031.m3047(m7118(), 0, 9, 2325), null), null, null);
            a = unsafe;
            b = C0033.m3336(unsafe, C0069.m5765(C0405m2.class, C0020.m1443(m7118(), 9, 9, 581)));
            C0033.m3336(unsafe, C0069.m5765(C0405m2.class, C0064.m4545(m7118(), 18, 14, 964)));
            long jM3336 = C0033.m3336(unsafe, C0069.m5765(C0423p2.class, C0065.m4757(m7118(), 32, 16, 1933)));
            C0033.m3336(unsafe, C0069.m5765(C0429q2.class, C0031.m3047(m7118(), 48, 4, 2358)));
            long jM33362 = C0033.m3336(unsafe, C0069.m5765(C0399l2.class, C0064.m4545(m7118(), 52, 7, 2868)));
            c = jM33362;
            long jM33363 = C0033.m3336(unsafe, C0069.m5765(C0399l2.class, C0027.m2404(m7118(), 59, 7, 948)));
            C0033.m3336(unsafe, C0069.m5765(C0399l2.class, C0038.m4022(m7118(), 66, 7, 1090)));
            C0033.m3336(unsafe, C0069.m5765(C0411n2.class, C0027.m2404(m7118(), 73, 6, 918)));
            Method methodM6369 = C0073.m6369(C0434r2.class, C0022.m1728(m7118(), 79, 1, 456), null);
            Method methodM63692 = C0073.m6369(C0434r2.class, C0075.m6791(m7118(), 80, 1, 660), null);
            C0035.m3619(methodM6369, true);
            C0035.m3619(methodM63692, true);
            MethodHandle methodHandleM6057 = C0071.m6057(C0030.m2877(), methodM6369);
            MethodHandle methodHandleM60572 = C0071.m6057(C0030.m2877(), methodM63692);
            long jM1999 = C0024.m1999(unsafe, methodHandleM6057, jM3336);
            long jM19992 = C0024.m1999(unsafe, methodHandleM60572, jM3336);
            long jM19993 = C0024.m1999(unsafe, C0434r2.class, jM33362);
            long j = jM19992 - jM1999;
            d = j;
            e = (jM1999 - jM19993) - j;
            Field fieldM5765 = C0069.m5765(C0434r2.class, C0022.m1728(m7118(), 81, 1, 469));
            Field fieldM57652 = C0069.m5765(C0434r2.class, C0035.m3603(m7118(), 82, 1, 2382));
            C0035.m3619(fieldM5765, true);
            C0035.m3619(fieldM57652, true);
            MethodHandle methodHandleM3527 = C0035.m3527(C0030.m2877(), fieldM5765);
            MethodHandle methodHandleM35272 = C0035.m3527(C0030.m2877(), fieldM57652);
            C0024.m1999(unsafe, methodHandleM3527, jM3336);
            C0024.m1999(unsafe, methodHandleM35272, jM3336);
            C0024.m1999(unsafe, C0434r2.class, jM33363);
        } catch (ReflectiveOperationException e2) {
            C0074.m6572(C0029.m2695(m7118(), 83, 15, 2861), C0023.m1904(m7118(), 98, 16, 450), e2);
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static Object a(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        int i;
        if (obj != null && !C0078.m7323(cls, obj)) {
            throw new IllegalArgumentException(C0075.m6791(m7118(), 114, 49, 1093));
        }
        Method methodM6369 = C0073.m6369(C0417o2.class, C0039.m4066(m7118(), 163, 6, 1597), new Class[]{Object[].class});
        C0035.m3619(methodM6369, true);
        Unsafe unsafeM901 = C0017.m901();
        long jM1999 = C0024.m1999(unsafeM901, cls, C0034.m3393());
        String strM3829 = C0037.m3829(m7118(), 169, 27, 1783);
        if (jM1999 == 0) {
            throw new NoSuchMethodException(strM3829);
        }
        int iM5831 = C0069.m5831(unsafeM901, jM1999);
        for (int i2 = 0; i2 < iM5831; i2++) {
            C0032.m3143(C0017.m901(), methodM6369, C0030.m2832(), (((long) i2) * C0034.m3480()) + jM1999 + C0077.m7240());
            if (C0070.m5838(str, C0064.m4514(methodM6369))) {
                Class[] clsArrM6417 = C0073.m6417(methodM6369);
                if (clsArrM6417.length == objArr.length) {
                    while (i < clsArrM6417.length) {
                        if (C0068.m5581(clsArrM6417[i])) {
                            Class cls2 = clsArrM6417[i];
                            i = ((cls2 != C0072.m6191() || (objArr[i] instanceof Integer)) && (cls2 != C0067.m5434() || (objArr[i] instanceof Byte)) && ((cls2 != C0111.m13059() || (objArr[i] instanceof Character)) && ((cls2 != C0024.m2007() || (objArr[i] instanceof Boolean)) && ((cls2 != C0019.m1278() || (objArr[i] instanceof Double)) && ((cls2 != C0068.m5567() || (objArr[i] instanceof Float)) && ((cls2 != C0066.m4824() || (objArr[i] instanceof Long)) && (cls2 != C0064.m4630() || (objArr[i] instanceof Short)))))))) ? i + 1 : 0;
                        } else {
                            Object obj2 = objArr[i];
                            if (obj2 == null || C0078.m7323(clsArrM6417[i], obj2)) {
                            }
                        }
                    }
                    return C0070.m5924(methodM6369, obj, objArr);
                }
                continue;
            }
        }
        throw new NoSuchMethodException(strM3829);
    }
}
