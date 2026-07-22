package p003;

import android.content.Intent;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۥ۟۟۟ۢۥ۠۟۟ۢۥۡ۟۟ۢۥۢ۟۟ۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0185 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f661short = {1855, 1840, 1850, 1836, 1841, 1847, 1850, 1904, 1855, 1838, 1838, 1904, 1821, 1841, 1840, 1834, 1851, 1830, 1834, 1815, 1843, 1838, 1842, 1684, 1683, 1670, 1685, 1683, 1702, 1668, 1683, 1678, 1681, 1678, 1683, 1694, 2317, 2409, 2372, 2379, 2369, 2391, 2378, 2380, 2369, 2314, 2374, 2378, 2379, 2385, 2368, 2379, 2385, 2314, 2412, 2379, 2385, 2368, 2379, 2385, 2334, 2316, 2419, 2630, 2634, 2632, 2624, 2565, 2636, 2635, 2565, 2662, 2634, 2635, 2641, 2624, 2653, 2641, 2668, 2632, 2645, 2633, 2682, 2646, 2641, 2628, 2647, 2641, 2660, 2630, 2641, 2636, 2643, 2636, 2641, 2652, 2569, 2565, 2636, 2635, 2641, 2624, 2635, 2641, 2584, 1883, 1856, 1894, 1902, 1889, 1902};

    public C0185() {
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
                    System.out.println(Float.decode(C0205.m13270("BGU")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f661short, 0, 23, 1886);
        methodName = C0205.m13272(f661short, 23, 13, 1767);
        methodSig = C0207.m13281(f661short, 36, 27, 2341);
        int iM13266 = C0204.m13266();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13266 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Long.decode(C0204.m13269("sFmhCz1AkqPA2bjxDmVBc1L")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Object obj, Intent intent);

    public static void hook(Object obj, Intent intent) {
        C0207.m13281(f661short, LocationRequest.PRIORITY_NO_POWER, 6, 1849);
        String str = C0203.m13263(f661short, 63, 42, 2597) + intent;
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
                    int iM13266 = C0204.m13266();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iM13266 > 0 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                System.out.println(Float.parseFloat(C0204.m13269("pSXT1dPhMSpoSdGw")));
                                break;
                        }
                    }
                    break;
                case 239:
                    backup(obj, intent);
                    break;
            }
            return;
        }
    }
}
