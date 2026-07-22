package p003;

import android.content.Intent;
import com.android.apksig.internal.zip.ZipUtils;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۡۦۤ۟۟ۡۦۥ۟۟ۡۦۦ۟۟ۡۦۧ۟۟ۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0166 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f642short = {807, 808, 802, 820, 809, 815, 802, 872, 807, 822, 822, 872, 775, 822, 822, 810, 815, 805, 807, 818, 815, 809, 808, 790, 807, 805, 813, 807, 801, 803, 779, 807, 808, 807, 801, 803, 820, 2968, 2970, 2955, 2995, 2974, 2954, 2961, 2972, 2967, 2998, 2961, 2955, 2970, 2961, 2955, 3001, 2960, 2957, 2991, 2974, 2972, 2964, 2974, 2968, 2970, 2125, 2089, 2063, 2052, 2067, 2052, 2122, 2057, 2052, 2059, 2050, 2122, 2102, 2065, 2071, 2060, 2059, 2050, 2142, 2124, 2089, 2052, 2059, 2049, 2071, 2058, 2060, 2049, 2122, 2054, 2058, 2059, 2065, ZipUtils.GP_FLAG_EFS, 2059, 2065, 2122, 2092, 2059, 2065, ZipUtils.GP_FLAG_EFS, 2059, 2065, 2142, 2389, 2393, 2395, 2387, 2326, 2399, 2392, 2326, 2385, 2387, 2370, 2426, 2391, 2371, 2392, 2389, 2398, 2431, 2392, 2370, 2387, 2392, 2370, 2416, 2393, 2372, 2406, 2391, 2389, 2397, 2391, 2385, 2387, 2330, 2326, 2374, 2391, 2389, 2397, 2391, 2385, 2387, 2424, 2391, 2395, 2387, 2315, 2083, 2104, 2078, 2070, 2073, 2070};

    public C0166() {
        int iM13275 = C0206.m13275();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13275 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Double.decode(C0203.m13264("IEdswvkpz4")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0205.m13272(f642short, 0, 37, 838);
        methodName = C0204.m13267(f642short, 37, 25, 3071);
        methodSig = C0207.m13281(f642short, 62, 44, 2149);
        int iM13275 = C0206.m13275();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13275 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0205.m13270("8ofgdrfKZ0OtvyizIcaV")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native Intent backup(Object obj, String str);

    public static Intent hook(Object obj, String str) {
        C0205.m13272(f642short, 153, 6, 2113);
        String str2 = C0204.m13267(f642short, 106, 47, 2358) + str;
        boolean zM13250 = C0193.m13250(str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zM13250 ? 1678 : 1709;
                    break;
                case 204:
                    return null;
                case 239:
                    return backup(obj, str);
            }
        }
    }
}
