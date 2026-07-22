package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟ۡ۟۟۟۟ۡ۠۟۟۟ۡۡ۟۟۟ۡۢ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0119 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f595short = {2932, 2936, 2938, 2873, 2931, 2934, 2937, 2942, 2930, 2939, 2873, 2919, 2917, 2936, 2915, 2930, 2932, 2915, 2942, 2936, 2937, 2873, 2906, 2934, 2942, 2937, 2302, 2297, 2274, 2255, 2276, 2281, 2287, 2279, 2303, 2364, 2365, 2370, 3240, 3251, 3221, 3229, 3218, 3229, 1125, 1129, 1131, 1123, 1062, 1135, 1128, 1062, 1140, 1139, 1128, 1093, 1134, 1123, 1125, 1133, 1141};

    public C0119() {
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
                    System.out.println(Double.parseDouble(C0203.m13264("5UXfuUvwqwR")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۥۦ۠";
        String strM13272 = null;
        String strM132722 = null;
        String strM13281 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56328:
                    str = "ۨۡۨ";
                    sArr = f595short;
                    break;
                case 56445:
                    methodName = strM132722;
                    str = "۠ۨ";
                    break;
                case 1746942:
                    str = "ۤۡ";
                    strM132722 = C0205.m13272(sArr, 26, 9, 2188);
                    break;
                case 1750629:
                    className = strM13272;
                    str = "ۤۤۢ";
                    break;
                case 1750633:
                    methodSig = strM13281;
                    str = "ۦۡۤ";
                    break;
                case 1751650:
                    str = "۟ۧۦ";
                    sArr = f595short;
                    break;
                case 1752671:
                    str = "ۦۣۦ";
                    sArr = f595short;
                    break;
                case 1753481:
                    return;
                case 1755407:
                    str = "ۣۢۨ";
                    strM13281 = C0207.m13281(sArr, 35, 3, 2324);
                    break;
                default:
                    strM13272 = C0205.m13272(sArr, 0, 26, 2839);
                    str = "ۣۢۤ";
                    break;
            }
        }
    }

    public static native void backup();

    public static void hook() {
        C0204.m13267(f595short, 38, 6, 3274);
        C0205.m13272(f595short, 44, 17, 1030);
    }
}
