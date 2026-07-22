package p003;

import android.content.Intent;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۤ۟۟ۢۥ۟۟ۢۦ۟۟ۢۧ۟۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0183 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f659short = {1890, 1901, 1895, 1905, 1900, 1898, 1895, 1837, 1890, 1907, 1907, 1837, 1858, 1888, 1911, 1898, 1909, 1898, 1911, 1914, 3072, 3079, 3090, 3073, 3079, 3122, 3088, 3079, 3098, 3077, 3098, 3079, 3082, 2539, 2447, 2466, 2477, 2471, 2481, 2476, 2474, 2471, 2540, 2464, 2476, 2477, 2487, 2470, 2477, 2487, 2540, 2442, 2477, 2487, 2470, 2477, 2487, 2552, 2538, 2453, 2383, 2371, 2369, 2377, 2316, 2373, 2370, 2316, 2413, 2383, 2392, 2373, 2394, 2373, 2392, 2389, 2419, 2399, 2392, 2381, 2398, 2392, 2413, 2383, 2392, 2373, 2394, 2373, 2392, 2389, 2304, 2316, 2373, 2370, 2392, 2377, 2370, 2392, 2321, 2087, 2108, 2074, 2066, 2077, 2066};

    public C0183() {
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
                    System.out.println(Double.parseDouble(C0203.m13264("ENQGaGBMOxNyOoaQPqxeHGW4rmG")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f659short, 0, 20, 1795);
        methodName = C0205.m13272(f659short, 20, 13, 3187);
        methodSig = C0205.m13272(f659short, 33, 27, 2499);
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
                    System.out.println(Integer.valueOf(C0204.m13269("SGHFwxhyaEmwtIpo")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Object obj, Intent intent);

    public static void hook(Object obj, Intent intent) {
        C0203.m13263(f659short, 99, 6, 2117);
        String str = C0204.m13267(f659short, 60, 39, 2348) + intent;
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
                    int iM13275 = C0206.m13275();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iM13275 < 0 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                System.out.println(Integer.valueOf(C0205.m13270("VLzqJfC2c4aPj2VXXH6EnN")));
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
