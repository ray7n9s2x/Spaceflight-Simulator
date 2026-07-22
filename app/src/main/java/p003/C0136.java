package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠۟۟۟۠۠۟۟۠ۡ۟۟۠ۢ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0136 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f612short = {2975, 2960, 2970, 2956, 2961, 2967, 2970, 3024, 2955, 2954, 2967, 2962, 3024, 2994, 2961, 2969, 277, 2313, 2413, 2379, 2368, 2391, 2368, 2318, 2381, 2368, 2383, 2374, 2318, 2418, 2389, 2387, 2376, 2383, 2374, 2330, 2413, 2379, 2368, 2391, 2368, 2318, 2381, 2368, 2383, 2374, 2318, 2418, 2389, 2387, 2376, 2383, 2374, 2330, 2312, 2408};

    public C0136() {
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
                    System.out.println(Long.decode(C0204.m13269("KaK")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۨۤۦ";
        String strM13272 = null;
        String strM13281 = null;
        String strM132722 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56291:
                    methodName = strM13281;
                    str = "ۦۦۥ";
                    break;
                case 56328:
                    str = "۟ۢ";
                    strM13281 = C0207.m13281(sArr, 16, 1, 380);
                    break;
                case 56540:
                    methodSig = strM132722;
                    str = "ۤۧ۠";
                    break;
                case 1747684:
                    className = strM13272;
                    str = "ۣ۟ۢ";
                    break;
                case 1750534:
                    str = "۠ۨ";
                    sArr = f612short;
                    break;
                case 1750788:
                    str = "ۣۧ";
                    strM132722 = C0205.m13272(sArr, 17, 39, 2337);
                    break;
                case 1751741:
                    return;
                case 1753637:
                    str = "ۣۧۨ";
                    sArr = f612short;
                    break;
                case 1755342:
                    strM13272 = C0205.m13272(sArr, 0, 16, 3070);
                    str = "۠۠ۤ";
                    break;
                default:
                    str = "ۨ۟ۥ";
                    sArr = f612short;
                    break;
            }
        }
    }

    public static int hook(String str, String str2) {
        return 1;
    }
}
