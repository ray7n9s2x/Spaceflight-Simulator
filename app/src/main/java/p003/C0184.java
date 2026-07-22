package p003;

import android.content.Intent;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۤۤ۟۟ۢۤۥ۟۟ۢۤۦ۟۟ۢۤۧ۟۟ۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0184 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f660short = {1832, 1831, 1837, 1851, 1830, 1824, 1837, 1895, 1834, 1830, 1831, 1853, 1836, 1831, 1853, 1895, 1802, 1830, 1831, 1853, 1836, 1841, 1853, 1822, 1851, 1832, 1849, 1849, 1836, 1851, 1533, 1530, 1519, 1532, 1530, 1487, 1517, 1530, 1511, 1528, 1511, 1530, 1527, 3017, 2989, 2944, 2959, 2949, 2963, 2958, 2952, 2949, 3022, 2946, 2958, 2959, 2965, 2948, 2959, 2965, 3022, 2984, 2959, 2965, 2948, 2959, 2965, 3034, 3016, 2999, 2294, 2298, 2296, 2288, 2229, 2300, 2299, 2229, 2262, 2298, 2299, 2273, 2288, 2285, 2273, 2242, 2279, 2292, 2277, 2277, 2288, 2279, 2250, 2278, 2273, 2292, 2279, 2273, 2260, 2294, 2273, 2300, 2275, 2300, 2273, 2284, 2233, 2229, 2300, 2299, 2273, 2288, 2299, 2273, 2216, 589, 598, 624, 632, 631, 632};

    public C0184() {
        int iM13262 = C0203.m13262();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13262 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Long.decode(C0204.m13269("Iv5uGZNW1TejczwSTbTJ1")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۢ۠ۤ";
        String strM13267 = null;
        String strM132672 = null;
        String strM13263 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56319:
                    className = strM132672;
                    str = "ۣۦ۠";
                    break;
                case 56479:
                    strM13267 = C0204.m13267(sArr, 30, 13, 1422);
                    str = "ۢۤۤ";
                    break;
                case 56505:
                    str = "ۥۣۥ";
                    sArr = f660short;
                    break;
                case 1748648:
                    str = "۠۟";
                    strM132672 = C0204.m13267(sArr, 0, 30, 1865);
                    break;
                case 1749606:
                    str = "ۡ۠ۧ";
                    sArr = f660short;
                    break;
                case 1749730:
                    methodName = strM13267;
                    str = "ۦ۟";
                    break;
                case 1750627:
                    methodSig = strM13263;
                    str = "ۧۡۥ";
                    break;
                case 1750749:
                    str = "ۥۤ";
                    sArr = f660short;
                    break;
                case 1752583:
                    str = "ۣۢۢ";
                    strM13263 = C0203.m13263(sArr, 43, 27, 3041);
                    break;
                default:
                    return;
            }
        }
    }

    public static native void backup(Object obj, Intent intent);

    public static void hook(Object obj, Intent intent) {
        C0207.m13281(f660short, 115, 6, 559);
        String str = C0205.m13272(f660short, 70, 45, 2197) + intent;
        boolean zM13232 = C0193.m13232(intent);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zM13232 ? 1678 : 1709;
                    break;
                case 204:
                    break;
                case 239:
                    backup(obj, intent);
                    break;
            }
            return;
        }
    }
}
