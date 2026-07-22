package p003;

import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢ۠۟۟۟ۢ۠۠۟۟ۢ۠ۡ۟۟ۢ۠ۢ۟۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0174 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f650short = {1034, 1029, 1039, 1049, 1028, 1026, 1039, 1093, 1034, 1051, 1051, 1093, 1080, 1027, 1034, 1049, 1038, 1039, 1083, 1049, 1038, 1037, 1038, 1049, 1038, 1029, 1032, 1038, 1048, 1058, 1030, 1051, 1031, 2434, 2432, 2449, 2486, 2449, 2455, 2444, 2443, 2434, 1698, 1734, 1760, 1771, 1788, 1771, 1701, 1766, 1771, 1764, 1773, 1701, 1753, 1790, 1784, 1763, 1764, 1773, 1713, 1734, 1760, 1771, 1788, 1771, 1701, 1766, 1771, 1764, 1773, 1701, 1753, 1790, 1784, 1763, 1764, 1773, 1713, 1699, 1734, 1760, 1771, 1788, 1771, 1701, 1766, 1771, 1764, 1773, 1701, 1753, 1790, 1784, 1763, 1764, 1773, 1713, 2695, 2689, 2708, 2691, 2691, 2745, 2710, 2708, 2703, 2704, 2695, 2693, 2719, 1412, 1439, 1465, 1457, 1470, 1457, 2666, 2666, 2671, 2670, 17843, 28516, 23605, 25245, 26390, -25395, 29596, -26017, -27175, -2745, 1610, 1155, 1160, 1171, 1173, 1161, 1157, 1152, 1176, 365, 365, 360, 361, 20148, 25699, 22322, 27034, 27665, 23236, 21847, 21356, 26485, 21884, 30277, 30686, -29954, -30053, -29027, -448, 823, 831, 831, 817, 811, 822, 817, 811, 820, 821, 427, 421, 414, 416, 426, 397, 509, 416, 426, 415, 413, 501, 763, 683, 718, 754, 705, 731, 718, 738, 763, 751, 677, 677};

    public C0174() {
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
                    System.out.println(Double.valueOf(C0206.m13276("VNvxyzN4BzdA42VUXGIJho")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۡ۟ۤ";
        String strM13263 = null;
        String strM132632 = null;
        String strM132633 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1747682:
                    strM13263 = C0203.m13263(sArr, 0, 33, 1131);
                    str = "ۥۤۤ";
                    break;
                case 1747716:
                    str = "ۡۦۦ";
                    strM132633 = C0203.m13263(sArr, 42, 56, 1674);
                    break;
                case 1748614:
                    str = "۠۠ۢ";
                    sArr = f650short;
                    break;
                case 1748706:
                    methodName = strM132632;
                    str = "ۣۧ۠";
                    break;
                case 1748833:
                    methodSig = strM132633;
                    str = "ۨۥ۟";
                    break;
                case 1748834:
                    str = "ۦۤۨ";
                    sArr = f650short;
                    break;
                case 1752613:
                    className = strM13263;
                    str = "ۡۦۧ";
                    break;
                case 1754500:
                    str = "۠ۡۥ";
                    sArr = f650short;
                    break;
                case 1755522:
                    return;
                default:
                    str = "ۣۡۢ";
                    strM132632 = C0203.m13263(sArr, 33, 9, 2533);
                    break;
            }
        }
    }

    public static native String backup(Object obj, String str, String str2);

    public static String hook(Object obj, String str, String str2) {
        String strBackup = backup(obj, str, str2);
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
                    boolean zEquals = str.equals(C0203.m13263(f650short, 98, 13, 2790));
                    C0205.m13272(f650short, 111, 6, 1510);
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
                                boolean zEquals2 = str.equals(C0207.m13281(f650short, 132, 8, 1249));
                                String strM13272 = C0205.m13272(f650short, 140, 20, 346);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zEquals2 ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            boolean zEquals3 = str.equals(C0207.m13281(f650short, 170, 12, 456));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        return strBackup;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        String str3 = strM13272 + str;
                                                        return C0203.m13263(f650short, 182, 12, 664);
                                                    case 239:
                                                        i4 = !zEquals3 ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            String str4 = strM13272 + str;
                                            return C0205.m13272(f650short, 160, 10, 774);
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                String str5 = C0205.m13272(f650short, 117, 14, 2653) + str;
                                return C0203.m13263(f650short, 131, 1, 1659);
                        }
                    }
                    break;
                case 239:
                    return strBackup;
            }
        }
    }
}
