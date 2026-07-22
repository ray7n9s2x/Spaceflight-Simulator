package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0400l3 {
    public static final Logger a;
    public static final File b;
    public static final boolean c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f343short = {1570, 1599, 1578, 1635, 1582, 1570, 1571, 1598, 1582, 1599, 1588, 1597, 1593, 1635, 1571, 1580, 1593, 1572, 1595, 1576, 1635, 1594, 1570, 1599, 1574, 1577, 1572, 1599, 474, 481, 494, 493, 483, 490, 431, 507, 480, 431, 489, 486, 481, 491, 431, 480, 509, 431, 492, 509, 490, 494, 507, 490, 431, 504, 480, 509, 484, 486, 481, 488, 431, 491, 486, 509, 490, 492, 507, 480, 509, 502, 437, 431, 500, 447, 498, 2060, 2076, 2111, 2099, 2097, 2108, 2160, 2051, 2101, 2084, 2084, 2105, 2110, 2103, 2083, 2060, 2052, 2101, 2109, 2080, 754, 751, 734, 734, 746, 719, 730, 719, 754, 738, 705, 717, 719, 706, 754, 762, 715, 707, 734, 643, 670, 651, 706, 655, 643, 642, 671, 655, 670, 661, 668, 664, 706, 664, 641, 668, 648, 645, 670, 2959, 2948, 2963, 2948, 3019, 2956, 2954, 3019, 2961, 2952, 2965, 2945, 2956, 2967, 424, 441, 433, 428, 2177, 2183, 2193, 2182, 2180, 2182, 2203, 2194, 2205, 2200, 2193, 2885, 2908, 2881, 2901, 2904, 2883, 1336, 1345, 1319, 1324, 1298, 1301, 1311, 1300, 1292, 1288, 1319, 1327, 1310, 1302, 1291, 2927, 2868, 2861, 2864, 2739, 2708, 2716, 2713, 2704, 2705, 2773, 2689, 2714, 2773, 2706, 2704, 2689, 2773, 2689, 2717, 2704, 2773, 2689, 2704, 2712, 2693, 2714, 2695, 2708, 2695, 2700, 2773, 2705, 2716, 2695, 2704, 2710, 2689, 2714, 2695, 2700, 2766, 2773, 2707, 2708, 2713, 2713, 2716, 2715, 2706, 2773, 2711, 2708, 2710, 2718, 2773, 2689, 2714, 2767, 2773, 2702, 2757, 2696, 1681, 1784, 1735, 1676, 1729, 1670, 1692, 1735, 1677, 1729, 2943, 2914, 2935, 2878, 2931, 2943, 2942, 2915, 2931, 2914, 2921, 2912, 2916, 2878, 2942, 2929, 2916, 2937, 2918, 2933, 2878, 2932, 2933, 2940, 2933, 2916, 2933, 2908, 2937, 2930, 2897, 2934, 2916, 2933, 2914, 2908, 2943, 2929, 2932, 2937, 2942, 2935, 887, 881, 886, 870, 635, 566, 569, 564, 550, 550};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e A[PHI: r5
  0x014e: PHI (r5v5 ??) = 
  (r5v17 ??)
  (r5v14 ?? I:??[int, float, short, byte, char])
  (r5v15 ?? I:??[int, float, short, byte, char])
  (r5v16 ?? I:??[int, float, short, byte, char])
 binds: [B:37:0x012e, B:39:0x014b, B:30:0x0113, B:35:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012c -> B:48:0x01a4). Please report as a decompilation issue!!! */
    static {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.AbstractC0400l3.<clinit>():void");
    }

    public static void b(URL url, File file) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStreamM13056 = C0111.m13056(url);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int iM3621 = C0035.m3621(inputStreamM13056, bArr);
                        if (iM3621 <= 0) {
                            C0023.m1839(fileOutputStream);
                            C0028.m2642(inputStreamM13056);
                            C0028.m2642(fileOutputStream);
                            return;
                        }
                        C0036.m3734(fileOutputStream, bArr, 0, iM3621);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamM13056;
                    C0028.m2642(inputStream);
                    C0028.m2642(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean c(ClassLoader classLoader, String str, boolean z, ArrayList arrayList) {
        C0394k3 c0394k3;
        try {
            C0394k3 c0394k32 = (C0394k3) C0019.m1200(new C0382i3(C0017.m890(classLoader), str, z));
            C0017.m919(arrayList, c0394k32);
            if (C0026.m2301(c0394k32)) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            if (z) {
                C0074.m6541(str);
            } else {
                C0077.m7165(str);
            }
            c0394k3 = new C0394k3(str, true, false, null);
        } catch (Throwable th) {
            c0394k3 = new C0394k3(str, false, false, th);
        }
        C0017.m919(arrayList, c0394k3);
        return C0026.m2301(c0394k3);
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7090() {
        if (C0019.m1311() >= 0) {
            return f343short;
        }
        return null;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                C0022.m1770(closeable);
            } catch (IOException unused) {
            }
        }
    }

    public static Class d(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            return C0035.m3601(classLoader, C0038.m3997(AbstractC0406m3.class));
        } catch (ClassNotFoundException unused) {
            String strM3997 = C0038.m3997(AbstractC0406m3.class);
            int iM5815 = C0069.m5815(strM3997, 46);
            if (iM5815 > 0) {
                strM3997 = C0071.m6056(strM3997, iM5815 + 1);
            }
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, strM3997);
            C0077.m7290(sb, C0020.m1443(m7090(), 303, 6, 597));
            URL urlM4730 = C0065.m4730(AbstractC0406m3.class, C0068.m5536(sb));
            if (urlM4730 == null) {
                throw new ClassNotFoundException(C0038.m3997(AbstractC0406m3.class));
            }
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            InputStream inputStreamM13056 = null;
            try {
                try {
                    inputStreamM13056 = C0111.m13056(urlM4730);
                    while (true) {
                        int iM3621 = C0035.m3621(inputStreamM13056, bArr);
                        if (iM3621 == -1) {
                            byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
                            C0028.m2642(inputStreamM13056);
                            C0028.m2642(byteArrayOutputStream);
                            return (Class) C0019.m1200(new C0388j3(classLoader, bArrM7297));
                        }
                        C0067.m5408(byteArrayOutputStream, bArr, 0, iM3621);
                    }
                } catch (IOException e) {
                    throw new ClassNotFoundException(C0038.m3997(AbstractC0406m3.class), e);
                }
            } catch (Throwable th) {
                C0028.m2642(inputStreamM13056);
                C0028.m2642(byteArrayOutputStream);
                throw th;
            }
        }
    }
}
