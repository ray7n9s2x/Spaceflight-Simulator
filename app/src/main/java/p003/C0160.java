package p003;

import android.content.pm.ApplicationInfo;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡ۠۟۟۟ۡ۠۠۟۟ۡ۠ۡ۟۟ۡ۠ۢ۟۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0160 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f636short = {2335, 2320, 2330, 2316, 2321, 2327, 2330, 2384, 2335, 2318, 2318, 2384, 2367, 2318, 2318, 2322, 2327, 2333, 2335, 2314, 2327, 2321, 2320, 2350, 2335, 2333, 2325, 2335, 2329, 2331, 2355, 2335, 2320, 2335, 2329, 2331, 2316, 2904, 2906, 2891, 2942, 2895, 2895, 2899, 2902, 2908, 2910, 2891, 2902, 2896, 2897, 2934, 2897, 2905, 2896, 1018, 926, 952, 947, 932, 947, 1021, 958, 947, 956, 949, 1021, 897, 934, 928, 955, 956, 949, 1001, 923, 1019, 926, 947, 956, 950, 928, 957, 955, 950, 1021, 945, 957, 956, 934, 951, 956, 934, 1021, 930, 959, 1021, 915, 930, 930, 958, 955, 945, 947, 934, 955, 957, 956, 923, 956, 948, 957, 1001, 2275, 2287, 2285, 2277, 2208, 2281, 2286, 2208, 2279, 2277, 2292, 2241, 2288, 2288, 2284, 2281, 2275, 2273, 2292, 2281, 2287, 2286, 2249, 2286, 2278, 2287, 2220, 2208, 2288, 2273, 2275, 2283, 2273, 2279, 2277, 2254, 2273, 2285, 2277, 2237, 1443, 1455, 1513, 1507, 1518, 1512, 1532, 1458, 2375, 2396, 2426, 2418, 2429, 2418, 1652, 1656, 1658, 1593, 1648, 1663, 1593, 1648, 1654, 1658, 1650, 1652, 1650, 1657, 1635, 1650, 1637};

    public C0160() {
        int iM13273 = C0205.m13273();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13273 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0204.m13269("d9ZcfzybcuuD6ZOtxkulwD")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۠۠ۨ";
        String strM13267 = null;
        String strM13272 = null;
        String strM132672 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56358:
                    return;
                case 56382:
                    methodName = strM13267;
                    str = "ۨۤ۠";
                    break;
                case 1747688:
                    str = "ۤۢۧ";
                    sArr = f636short;
                    break;
                case 1747873:
                    strM13267 = C0204.m13267(sArr, 37, 18, 2879);
                    str = "ۢ۠";
                    break;
                case 1751593:
                    str = "ۧۢۢ";
                    strM13272 = C0205.m13272(sArr, 0, 37, 2430);
                    break;
                case 1753699:
                    str = "ۤ۠ۦ";
                    strM132672 = C0204.m13267(sArr, 55, 57, 978);
                    break;
                case 1754471:
                    className = strM13272;
                    str = "ۨۢ۟";
                    break;
                case 1755429:
                    str = "۠ۦۧ";
                    sArr = f636short;
                    break;
                case 1755492:
                    str = "ۦۨۥ";
                    sArr = f636short;
                    break;
                default:
                    methodSig = strM132672;
                    str = "ۡۧ";
                    break;
            }
        }
    }

    public static native ApplicationInfo backup(Object obj, String str, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0060. Please report as an issue. */
    public static ApplicationInfo hook(Object obj, String str, int i) {
        C0204.m13267(f636short, 160, 6, 2341);
        String str2 = C0205.m13272(f636short, 112, 40, 2176) + str + C0204.m13267(f636short, 152, 8, 1423) + i;
        boolean zEquals = C0205.m13272(f636short, 166, 17, 1559).equals(str);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = !zEquals ? 1678 : 1709;
                    break;
                case 204:
                    return backup(obj, str, i);
                case 239:
                    boolean zM13250 = C0193.m13250(str);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = !zM13250 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM13252 = C0193.m13252(str);
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case Base64.mimeLineLength /* 76 */:
                                            str = C0193.f713;
                                            break;
                                        case 239:
                                            i4 = !zM13252 ? 48829 : 48860;
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                str = C0193.f687;
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    return backup(obj, str, i);
            }
        }
    }
}
