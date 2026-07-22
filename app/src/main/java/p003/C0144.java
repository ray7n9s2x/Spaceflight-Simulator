package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣۣۣۣۣ۟۟۠۟۟۟۠۠۟۟۠ۡ۟۟۠ۢ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0144 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f620short = {894, 885, 866, 885, 826, 871, 881, 887, 865, 870, 893, 864, 877, 826, 839, 893, 883, 890, 885, 864, 865, 870, 881, 1898, 1913, 1902, 1909, 1914, 1893, 2937, 2826, 2835, 2936, 2827};

    public C0144() {
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
                    System.out.println(Integer.valueOf(C0204.m13269("byXFxDgWqxBVs3i3VYpYel")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۟ۦۥ";
        String strM13263 = null;
        String strM13272 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746723:
                    str = "ۣۨۦ";
                    sArr = f620short;
                    break;
                case 1746758:
                    str = "ۣۨۧ";
                    sArr = f620short;
                    break;
                case 1746910:
                    str = "ۥۥۡ";
                    sArr = f620short;
                    break;
                case 1748795:
                    className = strM13272;
                    str = "۟۠ۤ";
                    break;
                case 1752641:
                    str = "ۡۥ۟";
                    strM13272 = C0205.m13272(sArr, 0, 23, 788);
                    break;
                case 1754624:
                    methodSig = strM13263;
                    str = "ۣۨۥ";
                    break;
                case 1755462:
                    methodName = strM13267;
                    str = "۟ۡۨ";
                    break;
                case 1755467:
                    str = "ۣۨۡ";
                    strM13267 = C0204.m13267(sArr, 23, 6, 1820);
                    break;
                case 1755588:
                    strM13263 = C0203.m13263(sArr, 29, 5, 2897);
                    str = "ۧۧ۠";
                    break;
                default:
                    return;
            }
        }
    }

    public static native boolean backup(Object obj, byte[] bArr);

    public static boolean hook(Object obj, byte[] bArr) {
        return true;
    }
}
