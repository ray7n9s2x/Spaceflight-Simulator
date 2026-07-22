package p003;

import java.util.HashMap;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۦ۟۟۟۠ۦ۠۟۟۠ۦۡ۟۟۠ۦۢ۟۟۠ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0151 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f627short = {2080, 2091, 2108, 2091, 2148, 2111, 2110, 2083, 2086, 2148, 2096, 2083, 2106, 2148, 2064, 2083, 2106, 2060, 2083, 2086, 2095, 1651, 1649, 1632, 1626, 1653, 1657, 1649, 2805, 2804, 2705, 2743, 2748, 2731, 2748, 2802, 2737, 2748, 2739, 2746, 2802, 2702, 2729, 2735, 2740, 2739, 2746, 2790};
    public static HashMap<ZipFile, String> getOrigName = new HashMap<>();

    public C0151() {
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
                    System.out.println(Double.valueOf(C0204.m13269("ca")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣ۠ۡ";
        String strM13281 = null;
        String strM132812 = null;
        String strM13272 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56443:
                    str = "۠۠۠";
                    strM13272 = C0205.m13272(sArr, 0, 21, 2122);
                    break;
                case 1747680:
                    className = strM13272;
                    str = "۠ۦۧ";
                    break;
                case 1747686:
                    methodSig = strM132812;
                    str = "۠ۤ";
                    break;
                case 1747873:
                    str = "ۥۧۧ";
                    sArr = f627short;
                    break;
                case 1750564:
                    str = "ۤ۟";
                    sArr = f627short;
                    break;
                case 1751654:
                    str = "ۨۧۦ";
                    sArr = f627short;
                    break;
                case 1752709:
                    strM13281 = C0207.m13281(sArr, 21, 7, 1556);
                    str = "ۣۧۨ";
                    break;
                case 1754508:
                    methodName = strM13281;
                    str = "ۤۤۦ";
                    break;
                case 1755591:
                    str = "۠۠ۦ";
                    strM132812 = C0207.m13281(sArr, 28, 20, 2781);
                    break;
                default:
                    return;
            }
        }
    }

    public static native String backup(Object obj);

    public static String hook(Object obj) {
        String strBackup = backup(obj);
        boolean zEquals = strBackup.equals(C0193.f711);
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
                    boolean zContainsKey = getOrigName.containsKey(obj);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zContainsKey ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return strBackup;
                            case 500:
                                return getOrigName.get(obj);
                        }
                    }
                    break;
                case 239:
                    return strBackup;
            }
        }
    }
}
