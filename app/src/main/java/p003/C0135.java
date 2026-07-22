package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠۟۟۟۟۠۟۠۟۟۠۟ۡ۟۟۠۟ۢ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0135 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f611short = {1124, 1131, 1121, 1143, 1130, 1132, 1121, 1067, 1136, 1137, 1132, 1129, 1067, 1097, 1130, 1122, 1135, 524, 616, 590, 581, 594, 581, 523, 584, 581, 586, 579, 523, 631, 592, 598, 589, 586, 579, 543, 616, 590, 581, 594, 581, 523, 584, 581, 586, 579, 523, 631, 592, 598, 589, 586, 579, 543, 525, 621};

    public C0135() {
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
                    System.out.println(Double.decode(C0203.m13264("BVXW41oBfqjF6CS3")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۤۥۢ";
        String strM13267 = null;
        String strM13263 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56509:
                    str = "ۣۥۦ";
                    strM13263 = C0203.m13263(sArr, 0, 16, 1029);
                    break;
                case 1746785:
                    str = "۟ۥۡ";
                    strM132632 = C0203.m13263(sArr, 16, 1, 1034);
                    break;
                case 1747904:
                    str = "۟ۢۤ";
                    sArr = f611short;
                    break;
                case 1747933:
                    str = "ۣ۟ۧ";
                    sArr = f611short;
                    break;
                case 1749608:
                    return;
                case 1750539:
                    strM13267 = C0204.m13267(sArr, 17, 39, 548);
                    str = "ۣۨۤ";
                    break;
                case 1750724:
                    className = strM13263;
                    str = "۠ۧۧ";
                    break;
                case 1751681:
                    str = "ۦۣ";
                    sArr = f611short;
                    break;
                case 1755465:
                    methodSig = strM13267;
                    str = "ۢ۠ۦ";
                    break;
                default:
                    methodName = strM132632;
                    str = "۠ۨۥ";
                    break;
            }
        }
    }

    public static int hook(String str, String str2) {
        return 1;
    }
}
