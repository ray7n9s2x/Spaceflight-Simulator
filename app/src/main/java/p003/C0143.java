package p003;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۢۤ۟۟۠ۢۥ۟۟۠ۢۦ۟۟۠ۢۧ۟۟۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0143 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f619short = {1790, 1777, 1787, 1773, 1776, 1782, 1787, 1713, 1788, 1776, 1777, 1771, 1786, 1777, 1771, 1713, 1773, 1786, 1772, 1713, 1741, 1786, 1772, 1776, 1770, 1773, 1788, 1786, 1772, 2456, 2458, 2443, 2491, 2445, 2462, 2440, 2462, 2461, 2451, 2458, 1846, 1879, 1874, 1919, 1904, 1914, 1900, 1905, 1911, 1914, 1841, 1917, 1905, 1904, 1898, 1915, 1904, 1898, 1841, 1900, 1915, 1901, 1841, 1868, 1915, 1901, 1905, 1899, 1900, 1917, 1915, 1901, 1850, 1866, 1910, 1915, 1907, 1915, 1829, 1847, 1874, 1919, 1904, 1914, 1900, 1905, 1911, 1914, 1841, 1913, 1900, 1919, 1902, 1910, 1911, 1917, 1901, 1841, 1914, 1900, 1919, 1897, 1919, 1916, 1906, 1915, 1841, 1882, 1900, 1919, 1897, 1919, 1916, 1906, 1915, 1829, 1617, 1629, 1631, 1623, 1554, 1627, 1628, 1554, 1626, 1629, 1629, 1625, 1645, 1632, 1623, 1601, 1629, 1607, 1600, 1617, 1623, 1601, 1645, 1621, 1623, 1606, 1654, 1600, 1619, 1605, 1619, 1616, 1630, 1623, 1536, -1752, 1627, 1622, 1551, 3004, 2983, 2945, 2953, 2950, 2953, 2592, 2615, 2593, 2573, 2620, 2611, 2623, 2615, -2744, 3320, 3314, 3326, 3327, 3278, 3319, 3325, 3326, 3312, 3301, 3320, 3327, 3318, 3319, 3325, 3313, 3312, 3265, 3314, 3313, 3321, 3313, 2643, 2647, 2653, 2661, 2638, 2655, 2626, 2638, 2646, 2645, 2653, 2645, 21443, 24499, 22994, 31540, 18293, 28066, 24307, 24165, 24732, -2153, 21865, 28260, 27641};

    public C0143() {
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
                    System.out.println(Float.valueOf(C0205.m13270("qXrQKeNhAZ7hNyA")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f619short, 0, 29, 1695);
        methodName = C0203.m13263(f619short, 29, 11, 2559);
        methodSig = C0204.m13267(f619short, 40, 76, 1822);
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
                    System.out.println(Integer.decode(C0203.m13264("zVkzH6B0clkzpkUO7KKMscva")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native Drawable backup(Object obj, int i, Resources.Theme theme);

    public static Drawable hook(Object obj, int i, Resources.Theme theme) {
        String str = C0204.m13267(f619short, 116, 39, 1586) + i;
        C0205.m13272(f619short, ModuleDescriptor.MODULE_VERSION, 6, 3038);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i <= 0 ? 1678 : 1709;
                    break;
                case 204:
                    Resources resources = (Resources) obj;
                    String strM13228 = C0193.m13228(resources, i);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = strM13228 == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str2 = C0207.m13281(f619short, 161, 9, 2642) + strM13228;
                                boolean zContains = strM13228.contains(C0207.m13281(f619short, 170, 13, 3217));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !zContains ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zContains2 = strM13228.contains(C0204.m13267(f619short, 183, 9, 3230));
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zContains3 = strM13228.contains(C0203.m13263(f619short, 192, 12, 2618));
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i6 = !zContains3 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i5 = !zContains2 ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                C0207.m13281(f619short, 204, 13, 2203);
                                return C0193.m13226(resources, C0193.f692);
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return backup(obj, i, theme);
    }
}
