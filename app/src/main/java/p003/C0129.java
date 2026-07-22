package p003;

import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۦ۟۟۟۟ۦ۠۟۟۟ۦۡ۟۟۟ۦۢ۟۟۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0129 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f605short = {1684, 1681, 1692, 1670, 1689, 1691, 1758, 1667, 1673, 1667, 1668, 1685, 1693, 1758, 1714, 1681, 1667, 1685, 1716, 1685, 1672, 1715, 1692, 1681, 1667, 1667, 1724, 1695, 1681, 1684, 1685, 1666, 1596, 1587, 1588, 1598, 1561, 1590, 1595, 1577, 1577, 2776, 2748, 2714, 2705, 2694, 2705, 2783, 2716, 2705, 2718, 2711, 2783, 2723, 2692, 2690, 2713, 2718, 2711, 2763, 2777, 2748, 2714, 2705, 2694, 2705, 2783, 2716, 2705, 2718, 2711, 2783, 2739, 2716, 2705, 2691, 2691, 2763, 1697, 1722, 1692, 1684, 1691, 1684, 2218, 2214, 2212, 2220, 2281, 2208, 2215, 2281, 2187, 2216, 2234, 2220, 2189, 2220, 2225, 2186, 2213, 2216, 2234, 2234, 2181, 2214, 2216, 2221, 2220, 2235, 2198, 2223, 2208, 2215, 2221, 2186, 2213, 2216, 2234, 2234, 2277, 2281, 2215, 2216, 2212, 2220, 2292, 2392, 2388, 2390, 2325, 2399, 2394, 2389, 2386, 2398, 2391, 2325, 2379, 2377, 2388, 2383, 2398, 2392, 2383, 2386, 2388, 2389, 21999, 20415, 28586, 25501, 21306, 24979, 21298, -28945, 30486, 32233, -354, 24210, 22617, 506, 509, 509, 505, 28586, 25501, 32233, 446, 434, 508, 499, 511, 503, 431};

    public C0129() {
        int iM13273 = C0205.m13273();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13273 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0205.m13270("GeVl")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۡۧ";
        String strM13263 = null;
        String strM13272 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56290:
                    str = "ۣۨۨ";
                    strM13272 = C0205.m13272(sArr, 32, 9, 1626);
                    break;
                case 1748861:
                    str = "ۦ۠ۦ";
                    sArr = f605short;
                    break;
                case 1751525:
                    return;
                case 1753452:
                    str = "ۦۧ۟";
                    strM13267 = C0204.m13267(sArr, 0, 32, 1776);
                    break;
                case 1753662:
                    className = strM13267;
                    str = "۠ۥ۟";
                    break;
                case 1754384:
                    strM13263 = C0203.m13263(sArr, 41, 37, 2800);
                    str = "ۨۧ۠";
                    break;
                case 1754471:
                    str = "ۧ۟ۨ";
                    sArr = f605short;
                    break;
                case 1755469:
                    methodName = strM13272;
                    str = "ۧۢۢ";
                    break;
                case 1755585:
                    methodSig = strM13263;
                    str = "ۤ۠ۡ";
                    break;
                default:
                    str = "۟ۡ";
                    sArr = f605short;
                    break;
            }
        }
    }

    public static native Class<?> backup(Object obj, String str);

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0089. Please report as an issue. */
    public static Class<?> hook(Object obj, String str) {
        boolean z = C0193.f698;
        C0207.m13281(f605short, 78, 6, 1731);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = str == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zStartsWith = str.startsWith(C0193.f707);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zStartsWith ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            String str2 = C0207.m13281(f605short, 84, 43, 2249) + str;
                                            str = C0193.f709;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
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
                    break;
                case Base64.mimeLineLength /* 76 */:
                    boolean zContains = str.contains(C0203.m13263(f605short, WorkQueueKt.MASK, 21, 2363));
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i5 = !zContains ? 48953 : 49635;
                                break;
                            case 32495:
                                String str3 = C0207.m13281(f605short, 148, 27, 402) + str;
                                C0193.f698 = false;
                                C0114.m13193(C0193.f695.getClassLoader(), C0113.f577, (ClassLoader) obj);
                                C0193.f698 = true;
                                break;
                        }
                    }
                    break;
                case 239:
                    i4 = str == null ? 48829 : 48860;
                    break;
            }
        }
        return backup(obj, str);
    }
}
