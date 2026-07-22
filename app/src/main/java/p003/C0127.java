package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۥ۟۟۟۟ۥ۠۟۟۟ۥۡ۟۟۟ۥۢ۟۟۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0127 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f603short = {1183, 1168, 1178, 1164, 1169, 1175, 1178, 1232, 1181, 1169, 1168, 1162, 1179, 1168, 1162, 1232, 1164, 1179, 1165, 1232, 1215, 1165, 1165, 1179, 1162, 1203, 1183, 1168, 1183, 1177, 1179, 1164, 1754, 1759, 1733, 1730, 2681, 2589, 2619, 2608, 2599, 2608, 2686, 2621, 2608, 2623, 2614, 2686, 2562, 2597, 2595, 2616, 2623, 2614, 2666, 2680, 2570, 2589, 2619, 2608, 2599, 2608, 2686, 2621, 2608, 2623, 2614, 2686, 2562, 2597, 2595, 2616, 2623, 2614, 2666, 2733, 2721, 2723, 2731, 2798, 2727, 2720, 2798, 2703, 2749, 2749, 2731, 2746, 2691, 2735, 2720, 2735, 2729, 2731, 2748, 2705, 2722, 2727, 2749, 2746, 2786, 2798, 2750, 2735, 2746, 2726, 2803, 2925, 2934, 2896, 2904, 2903, 2904};

    public C0127() {
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
                    System.out.println(Double.decode(C0207.m13279("v0MzFWYZYvcYeGGi")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۠۠ۧ";
        String strM13281 = null;
        String strM13263 = null;
        String strM13272 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56288:
                    return;
                case 1746973:
                    methodSig = strM13263;
                    str = "۟۟";
                    break;
                case 1747687:
                    str = "ۢۨۤ";
                    sArr = f603short;
                    break;
                case 1749694:
                    str = "ۧۢۡ";
                    sArr = f603short;
                    break;
                case 1749854:
                    str = "ۣۨۨ";
                    strM13272 = C0205.m13272(sArr, 0, 32, 1278);
                    break;
                case 1750691:
                    str = "۟ۨۦ";
                    strM13263 = C0203.m13263(sArr, 36, 39, 2641);
                    break;
                case 1753602:
                    methodName = strM13281;
                    str = "ۧۢۥ";
                    break;
                case 1754470:
                    strM13281 = C0207.m13281(sArr, 32, 4, 1718);
                    str = "ۦۥۡ";
                    break;
                case 1755469:
                    className = strM13272;
                    str = "ۣۢ۟";
                    break;
                default:
                    str = "ۣۤۤ";
                    sArr = f603short;
                    break;
            }
        }
    }

    public static native String[] backup(Object obj, String str);

    public static String[] hook(Object obj, String str) {
        String[] strArrBackup = backup(obj, str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = str.equals("");
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return strArrBackup;
                            case 500:
                                C0205.m13272(f603short, 107, 6, 2831);
                                String str2 = C0203.m13263(f603short, 75, 32, 2766) + str;
                                return C0193.m13234(strArrBackup, C0193.f708);
                        }
                    }
                    break;
                case 239:
                    return strArrBackup;
            }
        }
    }
}
