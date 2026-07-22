package p003;

import android.content.pm.ApplicationInfo;
import java.util.List;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡۡ۟۟۟ۡۡ۠۟۟ۡۡۡ۟۟ۡۡۢ۟۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0162 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f638short = {2483, 2492, 2486, 2464, 2493, 2491, 2486, 2556, 2483, 2466, 2466, 2556, 2451, 2466, 2466, 2494, 2491, 2481, 2483, 2470, 2491, 2493, 2492, 2434, 2483, 2481, 2489, 2483, 2485, 2487, 2463, 2483, 2492, 2483, 2485, 2487, 2464, 3323, 3321, 3304, 3285, 3314, 3311, 3304, 3325, 3312, 3312, 3321, 3320, 3293, 3308, 3308, 3312, 3317, 3327, 3325, 3304, 3317, 3315, 3314, 3311, 3001, 3032, 3000, 3037, 3067, 3056, 3047, 3056, 3006, 3044, 3045, 3064, 3069, 3006, 3037, 3064, 3042, 3045, 2986, 1795, 1807, 1805, 1797, 1856, 1801, 1806, 1856, 1799, 1797, 1812, 1833, 1806, 1811, 1812, 1793, 1804, 1804, 1797, 1796, 1825, 1808, 1808, 1804, 1801, 1795, 1793, 1812, 1801, 1807, 1806, 1811, 1868, 1856, 1798, 1804, 1793, 1799, 1811, 1885, 612, 639, 601, 593, 606, 593};

    public C0162() {
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
                    System.out.println(Double.decode(C0203.m13264("XdUnCvJHCx")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۧۥ";
        String strM13272 = null;
        String strM13267 = null;
        String strM13281 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746722:
                    className = strM13272;
                    str = "ۣۡۥ";
                    break;
                case 1746941:
                    str = "ۣۨۡ";
                    strM13267 = C0204.m13267(sArr, 37, 24, 3228);
                    break;
                case 1747685:
                    return;
                case 1748861:
                    str = "ۦۣۢ";
                    strM13281 = C0207.m13281(sArr, 61, 19, 2961);
                    break;
                case 1750599:
                    str = "۟ۧۥ";
                    sArr = f638short;
                    break;
                case 1750812:
                    methodName = strM13267;
                    str = "ۦۦۡ";
                    break;
                case 1753541:
                    methodSig = strM13281;
                    str = "۠۠ۥ";
                    break;
                case 1753633:
                    str = "ۣۡۧ";
                    sArr = f638short;
                    break;
                case 1755373:
                    strM13272 = C0205.m13272(sArr, 0, 37, 2514);
                    str = "ۣ۟۠";
                    break;
                default:
                    str = "ۨ۠ۥ";
                    sArr = f638short;
                    break;
            }
        }
    }

    public static native List<ApplicationInfo> backup(Object obj, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    public static List<ApplicationInfo> hook(Object obj, int i) {
        C0204.m13267(f638short, 120, 6, 518);
        String str = C0203.m13263(f638short, 80, 40, 1888) + i;
        List<ApplicationInfo> listBackup = backup(obj, i);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = listBackup == null ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        int size = listBackup.size();
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = i4 >= size ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zM13250 = C0193.m13250(listBackup.get(i4).packageName);
                                    int i6 = 1864;
                                    while (true) {
                                        i6 ^= 1881;
                                        switch (i6) {
                                            case 17:
                                                i6 = !zM13250 ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                listBackup.remove(i4);
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    i3 = i4 + 1;
                                    int i7 = 48767;
                                    while (true) {
                                        i7 ^= 48784;
                                        switch (i7) {
                                            case 14:
                                                break;
                                            case 239:
                                                i7 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return listBackup;
    }
}
