package p003;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟۠۟۟۟۟۠۠۟۟۟۠ۡ۟۟۟۠ۢ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0116 {
    public static String className;
    public static ClassLoader mClassLoader;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f592short = {1926, 1930, 1928, 1995, 1923, 1932, 1939, 1920, 1941, 1929, 1924, 1948, 1995, 1928, 1930, 1921, 1995, 1975, 1960, 1974, 1995, 1954, 1920, 1931, 1920, 1943, 1924, 1929, 3147, 3180, 3179, 3190, 3151, 3181, 3174, 2659, 2576, 2569, 2576, 2569, 2567, 2593, 2602, 2621, 2602, 2660, 2599, 2602, 2597, 2604, 2660, 2584, 2623, 2617, 2594, 2597, 2604, 2672, 2567, 2593, 2602, 2621, 2602, 2660, 2599, 2602, 2597, 2604, 2660, 2584, 2623, 2617, 2594, 2597, 2604, 2672, 2567, 2593, 2602, 2621, 2602, 2660, 2599, 2602, 2597, 2604, 2660, 2584, 2623, 2617, 2594, 2597, 2604, 2672, 2567, 2593, 2602, 2621, 2602, 2660, 2599, 2602, 2597, 2604, 2660, 2584, 2623, 2617, 2594, 2597, 2604, 2672, 2567, 2593, 2602, 2621, 2602, 2660, 2599, 2602, 2597, 2604, 2660, 2584, 2623, 2617, 2594, 2597, 2604, 2672, 2562, 2577, 2658, 2589, 431, 436, 402, 410, 405, 410, 2973, 2961, 2963, 2971, 3038, 2967, 2960, 3038, 2999, 2960, 2967, 2954, 2995, 2961, 2970, 1907, 1919, 1917, 1854, 1910, 1913, 1894, 1909, 1888, 1916, 1905, 1897, 1854, 1917, 1919, 1908, 1854, 1858, 1885, 1859, 1854, 1879, 1909, 1918, 1909, 1890, 1905, 1916, 1433, 1411, 1442, 1429, 1425, 1436, 1433, 1411, 1429};

    public C0116() {
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
                    System.out.println(Integer.parseInt(C0203.m13264("xdBXG7mfoY0Rh5")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۦۧ";
        String strM13267 = null;
        String strM13263 = null;
        String strM13281 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1747750:
                    str = "ۣ۠۟";
                    strM13263 = C0203.m13263(sArr, 0, 28, 2021);
                    break;
                case 1748707:
                    str = "ۨۨۥ";
                    strM13281 = C0207.m13281(sArr, 28, 7, 3074);
                    break;
                case 1749668:
                    methodSig = strM13267;
                    str = "ۥۥ۠";
                    break;
                case 1749702:
                    strM13267 = C0204.m13267(sArr, 35, 99, 2635);
                    str = "ۢۢۤ";
                    break;
                case 1750756:
                    str = "۠ۢۨ";
                    sArr = f592short;
                    break;
                case 1752640:
                    return;
                case 1754656:
                    str = "ۣۢۧ";
                    sArr = f592short;
                    break;
                case 1755491:
                    str = "ۡۢۤ";
                    sArr = f592short;
                    break;
                case 1755621:
                    methodName = strM13281;
                    str = "ۧۨۡ";
                    break;
                default:
                    className = strM13263;
                    str = "ۨۤ۟";
                    break;
            }
        }
    }

    public static native void backup(byte[] bArr, byte[] bArr2, String str, String str2, String str3, String str4, String str5, int i, boolean z);

    public static void hook(byte[] bArr, byte[] bArr2, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C0205.m13272(f592short, 134, 6, 461);
        C0204.m13267(f592short, 140, 15, 3070);
        backup(bArr, bArr2, str, str2, str3, str4, str5, i, false);
        try {
            ClassLoader classLoader = mClassLoader;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = classLoader == null ? 1678 : 1709;
                        break;
                    case 204:
                        Field declaredField = Class.forName(C0205.m13272(f592short, ModuleDescriptor.MODULE_VERSION, 28, 1808), true, classLoader).getDeclaredField(C0205.m13272(f592short, 183, 9, 1520));
                        declaredField.setAccessible(true);
                        declaredField.set(null, true);
                        break;
                    case 239:
                        break;
                }
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = 1771;
                        break;
                    case 54:
                        return;
                }
            }
        }
    }
}
