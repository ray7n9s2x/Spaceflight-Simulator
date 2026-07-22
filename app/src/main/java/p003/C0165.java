package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۡۢۤ۟۟ۡۢۥ۟۟ۡۢۦ۟۟ۡۢۧ۟۟ۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0165 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f641short = {838, 841, 835, 853, 840, 846, 835, 777, 838, 855, 855, 777, 884, 847, 838, 853, 834, 835, 887, 853, 834, 833, 834, 853, 834, 841, 836, 834, 852, 878, 842, 855, 843, 625, 627, 610, 607, 632, 610, 488, 396, 426, 417, 438, 417, 495, 428, 417, 430, 423, 495, 403, 436, 434, 425, 430, 423, 507, 393, 489, 393, 1824, 1833, 1828, 1831, 1815, 1835, 1837, 1850, 1852, 1825, 1838, 1825, 1835, 1833, 1852, 1825, 1831, 1830, 1815, 1851, 1852, 1833, 1852, 1837, 2700, 2711, 2737, 2745, 2742, 2745, 21276, 29178, 27285, 28446, 22987, 22104, 20579, 25722, 22131, 30026, 29905, -30223, -30316, -29294, 637, 25659, -28081, -30223, -30316, 636, -689, 1072, 1077, 1060, 1085, 1061, 2032, 2032, 2037, 2036, 18473, 25342, 20911, 28423, 27276, 23641, 21450, 22001, 25064, 21473, 28888, 28995, -29597, -29690, -30720, -1827};

    public C0165() {
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
                    System.out.println(Integer.decode(C0203.m13264("sV2HVmIBh2LOPuUdfikY0AaPaDzK")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۡۦ";
        String strM13272 = null;
        String strM132722 = null;
        String strM13263 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56541:
                    methodName = strM132722;
                    str = "ۣۨۡ";
                    break;
                case 1747905:
                    strM13272 = C0205.m13272(sArr, 39, 22, 448);
                    str = "ۢۥۨ";
                    break;
                case 1748740:
                    str = "ۦۦۦ";
                    sArr = f641short;
                    break;
                case 1749765:
                    methodSig = strM13272;
                    str = "ۣۧۨ";
                    break;
                case 1750781:
                    str = "ۥۣۢ";
                    sArr = f641short;
                    break;
                case 1750812:
                    str = "۠ۧۨ";
                    sArr = f641short;
                    break;
                case 1752550:
                    str = "ۧۤ";
                    strM132722 = C0205.m13272(sArr, 33, 6, 534);
                    break;
                case 1753638:
                    str = "ۧۦۨ";
                    strM13263 = C0203.m13263(sArr, 0, 33, 807);
                    break;
                case 1754658:
                    return;
                default:
                    className = strM13263;
                    str = "ۣۧۡ";
                    break;
            }
        }
    }

    public static native int backup(Object obj, String str, int i);

    public static int hook(Object obj, String str, int i) {
        int i2 = 1864;
        int iBackup = backup(obj, str, i);
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    i3 = str == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = str.equals(C0207.m13281(f641short, 61, 24, 1864));
                    C0207.m13281(f641short, 85, 6, 2798);
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = !zEquals ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zEquals2 = str.equals(C0203.m13263(f641short, 112, 5, 1105));
                                while (true) {
                                    i2 ^= 1881;
                                    switch (i2) {
                                        case 17:
                                            i2 = !zEquals2 ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            return iBackup;
                                        case 47417:
                                            String str2 = C0204.m13267(f641short, 117, 20, 1991) + str;
                                            return 1;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                String str3 = C0205.m13272(f641short, 91, 21, 597) + str;
                                return 7;
                        }
                    }
                    break;
                case 239:
                    return iBackup;
            }
        }
    }
}
