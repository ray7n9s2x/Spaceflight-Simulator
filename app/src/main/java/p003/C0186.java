package p003;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۥۤ۟۟ۢۥۥ۟۟ۢۥۦ۟۟ۢۥۧ۟۟ۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0186 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f662short = {1328, 1343, 1333, 1315, 1342, 1336, 1333, 1407, 1328, 1313, 1313, 1407, 1296, 1330, 1317, 1336, 1319, 1336, 1317, 1320, 1797, 1794, 1815, 1796, 1794, 1847, 1813, 1794, 1823, 1792, 1823, 1794, 1807, 1840, 1817, 1796, 1828, 1811, 1797, 1795, 1818, 1794, 2360, 2396, 2417, 2430, 2420, 2402, 2431, 2425, 2420, 2367, 2419, 2431, 2430, 2404, 2421, 2430, 2404, 2367, 2393, 2430, 2404, 2421, 2430, 2404, 2347, 2393, 2396, 2417, 2430, 2420, 2402, 2431, 2425, 2420, 2367, 2431, 2403, 2367, 2386, 2405, 2430, 2420, 2428, 2421, 2347, 2361, 2374, 3115, 3111, 3109, 3117, 3176, 3105, 3110, 3176, 3131, 3132, 3113, 3130, 3132, 3081, 3115, 3132, 3105, 3134, 3105, 3132, 3121, 3086, 3111, 3130, 3098, 3117, 3131, 3133, 3108, 3132, 3172, 3176, 3105, 3110, 3132, 3117, 3110, 3132, 3189, 2314, 2321, 2359, 2367, 2352, 2367, 1438, 1433, 1411, 1426, 1433, 1411, 1497, 1424, 1426, 1411, 1462, 1428, 1411, 1438, 1432, 1433, 1503, 1502, 1482, 1177, 1173, 1175, 1236, 1166, 1179, 1162, 1166, 1179, 1162, 1236, 1161, 1182, 1169, 1236, 1179, 1177, 1166, 1171, 1173, 1172, 25921, 25997, 2035, 1990, 2007, 2035, 1990, 2007, 23557, 26000, 32072, 29148, 22770, 2032, 2039, 2029, 2044, 2039, 2029, 1975, 2046, 2044, 2029, 2010, 2038, 2036, 2025, 2038, 2039, 2044, 2039, 2029, 1969, 1968, 1956};

    public C0186() {
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
                    System.out.println(C0203.m13264("uxrgxDqJn8kuueiMXD3i7rdwGW"));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۣۡ";
        String strM13267 = null;
        String strM13281 = null;
        String strM13263 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1747714:
                    str = "ۣۢۥ";
                    strM13281 = C0207.m13281(sArr, 20, 22, 1910);
                    break;
                case 1747838:
                    str = "ۣ۠ۡ";
                    sArr = f662short;
                    break;
                case 1748737:
                    str = "ۡۨ۠";
                    sArr = f662short;
                    break;
                case 1748889:
                    strM13267 = C0204.m13267(sArr, 0, 20, 1361);
                    str = "ۣۨۧ";
                    break;
                case 1749666:
                    methodSig = strM13263;
                    str = "ۣۧۢ";
                    break;
                case 1750630:
                    methodName = strM13281;
                    str = "ۤۨۨ";
                    break;
                case 1751779:
                    str = "ۢۢۢ";
                    strM13263 = C0203.m13263(sArr, 42, 47, 2320);
                    break;
                case 1751780:
                    str = "ۤۨۧ";
                    sArr = f662short;
                    break;
                case 1755468:
                    className = strM13267;
                    str = "۠ۥۣ";
                    break;
                default:
                    return;
            }
        }
    }

    public static native void backup(Object obj, Intent intent, int i, Bundle bundle);

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    public static void hook(Object obj, Intent intent, int i, Bundle bundle) {
        String str = C0203.m13263(f662short, 89, 39, 3144) + intent;
        C0207.m13281(f662short, 128, 6, 2408);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = intent == null ? 1678 : 1709;
                    break;
                case 204:
                    String action = intent.getAction();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = action == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str2 = C0203.m13263(f662short, 134, 19, 1527) + intent.getAction();
                                boolean zEquals = intent.getAction().equals(C0207.m13281(f662short, 153, 21, 1274));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !zEquals ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0205.m13272(f662short, 174, 13, 1959);
                                            intent.setAction(C0193.f709);
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    ComponentName component = intent.getComponent();
                    int i5 = 48767;
                    while (true) {
                        i5 ^= 48784;
                        switch (i5) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case Base64.mimeLineLength /* 76 */:
                                String str3 = C0204.m13267(f662short, 187, 22, 1945) + intent.getComponent();
                                boolean zM13250 = C0193.m13250(intent.getComponent().getPackageName());
                                int i6 = 48891;
                                while (true) {
                                    i6 ^= 48908;
                                    switch (i6) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i6 = !zM13250 ? 48953 : 49635;
                                            break;
                                        case 32495:
                                            intent.setComponent(new ComponentName(C0193.f687, intent.getComponent().getClassName()));
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i5 = component == null ? 48829 : 48860;
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        backup(obj, intent, i, bundle);
    }
}
