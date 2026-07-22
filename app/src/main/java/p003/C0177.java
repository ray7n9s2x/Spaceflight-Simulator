package p003;

import android.util.Log;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۡۤ۟۟ۢۡۥ۟۟ۢۡۦ۟۟ۢۡۧ۟۟ۢۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0177 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f653short = {2902, 2905, 2899, 2885, 2904, 2910, 2899, 2841, 2880, 2898, 2901, 2908, 2910, 2883, 2841, 2912, 2898, 2901, 2913, 2910, 2898, 2880, 3137, 3138, 3148, 3145, 3192, 3167, 3137, 2855, 2883, 2917, 2926, 2937, 2926, 2848, 2915, 2926, 2913, 2920, 2848, 2908, 2939, 2941, 2918, 2913, 2920, 2868, 2854, 2905, 1927, 1931, 1929, 1921, 1988, 1933, 1930, 1988, 1971, 1921, 1926, 1970, 1933, 1921, 1939, 1979, 1928, 1931, 1925, 1920, 1969, 1942, 1928, 1992, 1988, 1937, 1942, 1928, 2009, 2525, 2502, 2528, 2536, 2535, 2536, 27370, 27174, -25358, 27561, -2282};

    public C0177() {
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
                    System.out.println(Float.parseFloat(C0206.m13276("5AGszM7Edv6QoZMs")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0203.m13263(f653short, 0, 22, 2871);
        methodName = C0207.m13281(f653short, 22, 7, 3117);
        methodSig = C0204.m13267(f653short, 29, 21, 2831);
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
                    System.out.println(Long.parseLong(C0207.m13279("DhZ")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Object obj, String str);

    public static void hook(Object obj, String str) {
        String str2 = C0207.m13281(f653short, 50, 29, 2020) + str;
        C0203.m13263(f653short, 79, 6, 2495);
        Log.getStackTraceString(new Throwable());
        boolean zM13254 = C0193.m13254(str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zM13254 ? 1678 : 1709;
                    break;
                case 204:
                    String str3 = C0205.m13272(f653short, 85, 5, 2060) + str;
                    int iM13262 = C0203.m13262();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = iM13262 > 0 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                System.out.println(Integer.parseInt(C0204.m13269("Fw4frzIUMyaZlUn2uCUaowOJxTS")));
                                break;
                        }
                    }
                    break;
                case 239:
                    backup(obj, str);
                    break;
            }
            return;
        }
    }
}
