package p003;

import androidx.appcompat.app.AppCompatDelegate;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡ۟۟۟ۡ۠۟۟ۡۡ۟۟ۡۢ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0158 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f634short = {2107, 2096, 2087, 2096, 2175, 2111, 2100, 2085, 2175, 2072, 2111, 2100, 2085, 2064, 2101, 2101, 2083, 2100, 2082, 2082, 1882, 1880, 1865, 1916, 1873, 1873, 1919, 1860, 1907, 1884, 1872, 1880, 1771, 1679, 1705, 1698, 1717, 1698, 1772, 1711, 1698, 1709, 1700, 1772, 1680, 1719, 1713, 1706, 1709, 1700, 1784, 1770, 1688, 1679, 1705, 1698, 1717, 1698, 1772, 1709, 1702, 1719, 1772, 1674, 1709, 1702, 1719, 1666, 1703, 1703, 1713, 1702, 1712, 1712, 1784, 1655, 1659, 1657, 1649, 1588, 1661, 1658, 1588, 1651, 1649, 1632, 1621, 1656, 1656, 1622, 1645, 1626, 1653, 1657, 1649, 1592, 1588, 1660, 1659, 1639, 1632, 1577, 760, 739, 709, 717, 706, 717, 703, 679, 701, 723, 754, 701, 764, 761, 761, 751, 760, 750, 750, 701, 764, 750, 750, 754, 766, 756, 764, 745, 760, 761, 701, 746, 756, 745, 757, 701, 757, 754, 750, 745, 755, 764, 752, 760, 1605, 1662, 1649, 1650, 1660, 1653, 1584, 1636, 1663, 1584, 1634, 1653, 1635, 1663, 1660, 1638, 1653, 1584, 1656, 1663, 1635, 1636, 1584, 1586, 2299, 2272, 2284, 2214, 2302, 2299, 2284, 2214, 2282, 2299, 2274, 2213, 2296, 2275, 2282, 2277, 2289, 2275, 2274, 2279, 2287, 2298, 2213, 2280, 2276, 2278, 1030, 1093, 1036, 1034, 1055, 1038, 1052, 1034, 1042, 1093, 1116, 1116, 1113, 1112, 1034, 1051, 1026, 1093, 1032, 1028, 1030, 28311, 28251, 23470, 22652, 3161, 3094, 3092, 3077, 3120, 3101, 3101, 3123, 3080, 3135, 3088, 3100, 3092, 3160, -3221, 2405, 2384, 2375, 2392, 2396, 2374, 2374, 2396, 2394, 2395, 2325, 2385, 2384, 2395, 2396, 2384, 2385, 19080, 23659, 22237, -27902, 1327, 1320, 1330, 1315, 1332, 1320, 1315, 1330, 25125, -27850, 24218, -31598, 21660, -28545, -1412};

    public C0158() {
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
                    System.out.println(Long.valueOf(C0203.m13264("tpYvGv")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۧۡۧ";
        String strM13267 = null;
        String strM13263 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746936:
                    return;
                case 1747837:
                    str = "ۦ۠ۢ";
                    strM132632 = C0203.m13263(sArr, 20, 12, 1853);
                    break;
                case 1749756:
                    str = "۠ۥۢ";
                    sArr = f634short;
                    break;
                case 1751623:
                    methodSig = strM13263;
                    str = "۟ۧ۠";
                    break;
                case 1752673:
                    str = "ۨۢۨ";
                    sArr = f634short;
                    break;
                case 1753448:
                    methodName = strM132632;
                    str = "ۥۦۢ";
                    break;
                case 1754414:
                    strM13267 = C0204.m13267(sArr, 0, 20, 2129);
                    str = "ۡۥ۟";
                    break;
                case 1754445:
                    str = "ۧ۠ۧ";
                    sArr = f634short;
                    break;
                case 1755438:
                    str = "ۣۤۦ";
                    strM13263 = C0203.m13263(sArr, 32, 43, 1731);
                    break;
                default:
                    className = strM13267;
                    str = "ۢۥ۟";
                    break;
            }
        }
    }

    public static native InetAddress[] backup(String str);

    public static InetAddress[] hook(String str) throws UnknownHostException {
        boolean z;
        String str2 = C0203.m13263(f634short, 75, 27, 1556) + str;
        C0207.m13281(f634short, 102, 6, 666);
        String strM13281 = C0207.m13281(f634short, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 38, 669);
        String strM13272 = C0205.m13272(f634short, 146, 24, 1552);
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
                    boolean zEquals = str.equals(C0207.m13281(f634short, 170, 26, 2187));
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
                                str.equals(C0207.m13281(f634short, 196, 21, 1131));
                                z = false;
                                break;
                            case 500:
                                z = true;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                String str3 = C0204.m13267(f634short, 217, 19, 3185) + str;
                                throw new UnknownHostException(strM13272 + str + strM13281);
                            case Base64.mimeLineLength /* 76 */:
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 503:
                                            i5 = 48922;
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i4 = !z ? 48860 : 48829;
                                break;
                        }
                    }
                case 239:
                    try {
                        return backup(str);
                    } catch (SecurityException e) {
                        boolean zContains = e.toString().contains(C0204.m13267(f634short, 236, 17, 2357));
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = !zContains ? 49728 : 49759;
                                    break;
                                case 50:
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    String str4 = C0203.m13263(f634short, 253, 19, 1382) + e.toString();
                                    throw new UnknownHostException(strM13272 + str + strM13281);
                                case 83:
                                    throw e;
                            }
                        }
                    }
                    break;
            }
        }
    }
}
