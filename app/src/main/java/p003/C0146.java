package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠ۤ۟۟۟۠ۤ۠۟۟۠ۤۡ۟۟۠ۤۢ۟۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0146 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f622short = {736, 751, 741, 755, 750, 744, 741, 687, 758, 744, 741, 742, 740, 757, 687, 725, 740, 761, 757, 727, 744, 740, 758, 2100, 2082, 2099, 2067, 2082, 2111, 2099, 742, 642, 676, 687, 696, 687, 737, 674, 687, 672, 681, 737, 653, 678, 687, 700, 669, 683, 703, 699, 683, 672, 685, 683, 757, 743, 664, 3313, 3318, 3318, 3314, 3270, 3277, 3324, 3297, 3309, 3279, 3312, 3324, 3310, 3270, 3306, 3324, 3309, 3277, 3324, 3297, 3309};

    public C0146() {
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
                    System.out.println(Double.decode(C0204.m13269("Fh6H2HN560tcu1Elr9UQ")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۧۦۢ";
        String strM13272 = null;
        String strM13263 = null;
        String strM132722 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56292:
                    str = "ۢۨ۟";
                    strM132722 = C0205.m13272(sArr, 30, 27, 718);
                    break;
                case 1746752:
                    methodName = strM13272;
                    str = "ۨ۟۟";
                    break;
                case 1749703:
                    str = "ۨۨ۟";
                    strM13263 = C0203.m13263(sArr, 0, 23, 641);
                    break;
                case 1749849:
                    methodSig = strM132722;
                    str = "ۥ۟ۦ";
                    break;
                case 1750725:
                    str = "ۣۤۡ";
                    sArr = f622short;
                    break;
                case 1751618:
                    strM13272 = C0205.m13272(sArr, 23, 7, 2119);
                    str = "۟ۡۢ";
                    break;
                case 1752460:
                    return;
                case 1754595:
                    str = "ۣۢۨ";
                    sArr = f622short;
                    break;
                case 1755615:
                    className = strM13263;
                    str = "ۣۥۧ";
                    break;
                default:
                    str = "ۣ۟";
                    sArr = f622short;
                    break;
            }
        }
    }

    public static native void backup(Object obj, CharSequence charSequence);

    public static void hook(Object obj, CharSequence charSequence) {
        String str = "ۥۢۥ";
        short[] sArr = null;
        String strM13281 = null;
        CharSequence charSequenceM13227 = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56390:
                    str = "۠ۤ۟";
                    strM13281 = C0207.m13281(sArr, 57, 21, 3225);
                    break;
                case 1747900:
                    backup(obj, charSequenceM13227);
                    str = "ۣۣۨ";
                    break;
                case 1750664:
                    return;
                case 1752552:
                    sArr = f622short;
                    str = "ۢۨ";
                    break;
                default:
                    str = "ۣ۠ۧ";
                    charSequenceM13227 = C0193.m13227(charSequence, strM13281);
                    break;
            }
        }
    }
}
