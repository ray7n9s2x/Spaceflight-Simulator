package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡۢ۟۟۟ۡۢ۠۟۟ۡۢۡ۟۟ۡۢۢ۟۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0164 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f640short = {1476, 1483, 1473, 1495, 1482, 1484, 1473, 1419, 1476, 1493, 1493, 1419, 1508, 1493, 1493, 1481, 1484, 1478, 1476, 1489, 1484, 1482, 1483, 1525, 1476, 1478, 1486, 1476, 1474, 1472, 1512, 1476, 1483, 1476, 1474, 1472, 1495, 987, 985, 968, 1013, 978, 975, 968, 989, 976, 976, 985, 974, 1004, 989, 991, 983, 989, 987, 985, 1010, 989, 977, 985, 3199, 3099, 3133, 3126, 3105, 3126, 3192, 3131, 3126, 3129, 3120, 3192, 3076, 3107, 3109, 3134, 3129, 3120, 3180, 3198, 3099, 3133, 3126, 3105, 3126, 3192, 3131, 3126, 3129, 3120, 3192, 3076, 3107, 3109, 3134, 3129, 3120, 3180, 2909, 2897, 2899, 2907, 2846, 2903, 2896, 2846, 2905, 2907, 2890, 2935, 2896, 2893, 2890, 2911, 2898, 2898, 2907, 2892, 2926, 2911, 2909, 2901, 2911, 2905, 2907, 2928, 2911, 2899, 2907, 2834, 2846, 2894, 2911, 2909, 2901, 2911, 2905, 2907, 2928, 2911, 2899, 2907, 2819, 1159, 1180, 1210, 1202, 1213, 1202, 2997, 2962, 2959, 2952, 2973, 2960, 2960, 2969, 2958, 2988, 2973, 2975, 2967, 2973, 2971, 2969, 2994, 2973, 2961, 2969, 3009, 2236, 2224, 2226, 2289, 2238, 2225, 2235, 2221, 2224, 2230, 2235, 2289, 2217, 2234, 2225, 2235, 2230, 2225, 2232};

    public C0164() {
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
                    System.out.println(Float.valueOf(C0204.m13269("vWRaVTXEP1B7PIDCTl8DMikKRUw")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0203.m13263(f640short, 0, 37, 1445);
        methodName = C0207.m13281(f640short, 37, 23, 956);
        methodSig = C0204.m13267(f640short, 60, 38, 3159);
        int iM13280 = C0207.m13280();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13280 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Integer.decode(C0207.m13279("pyE6YGjEBHhAFQ2pzme92ICptHQf")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native String backup(Object obj, String str);

    public static String hook(Object obj, String str) {
        String str2 = C0205.m13272(f640short, 98, 45, 2878) + str;
        C0204.m13267(f640short, 143, 6, 1253);
        String strBackup = backup(obj, str);
        boolean zEquals = C0193.f713.equals(str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zEquals ? 1678 : 1709;
                    break;
                case 204:
                    String str3 = C0204.m13267(f640short, 149, 21, 3068) + strBackup;
                    return C0205.m13272(f640short, 170, 19, 2271);
                case 239:
                    return strBackup;
            }
        }
    }
}
