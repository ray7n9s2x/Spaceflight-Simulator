package p003;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۥۤ۟۟۠ۥۥ۟۟۠ۥۦ۟۟۠ۥۧ۟۟۠ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0150 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f626short = {2982, 2986, 2984, 3051, 2980, 2987, 2977, 2999, 2986, 2988, 2977, 3051, 2986, 2999, 2978, 3051, 2982, 2986, 2987, 2998, 2982, 2999, 3004, 2997, 2993, 3051, 2954, 2997, 2976, 2987, 2966, 2966, 2953, 2973, 3056, 3061, 3068, 2950, 2976, 2999, 2993, 2988, 2979, 2988, 2982, 2980, 2993, 2976, 1260, 1262, 1279, 1230, 1253, 1256, 1252, 1263, 1262, 1263, 2851, 2850, 2896, 2889, 1552, 1547, 1581, 1573, 1578, 1573, 24104, 21080, 22205, 22900, 19347, 29046, -30025, 32270, -1430, 28180, 24710, 29684, 32270, 20861, -30040, 25439, 26465, 29684, 32270, 20861, -1412, 19034, -27312, 26464, 22363, 19402, 29684, 32270, 20861, -1412, -27838, 28178, 22363, 19402, 19247, 22480, 21525, 32270, 20861, -24580, -29007, 22392, 23304, 24557, 20516, 17091, 30758, -31769, 30558, -3270, 20946, 30993, 24075, 17050, 24557, 20516, 17091, 30758, -31769, 30558, 2539, 2535, 2533, 2541, 2472, 2529, 2534, 2472, 2528, 2535, 2535, 2531, 2519, 2512, 2493, 2488, 2481, 2507, 2541, 2554, 2556, 2529, 2542, 2529, 2539, 2537, 2556, 2541, 2519, 2543, 2541, 2556, 2509, 2534, 2539, 2535, 2540, 2541, 2540};

    public C0150() {
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
                    System.out.println(Long.decode(C0206.m13276("zT8hl5mgs8tVjnPkEU3lgQ")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۠ۤۧ";
        String strM13267 = null;
        String strM13263 = null;
        String strM13272 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1747712:
                    className = strM13263;
                    str = "ۣ۠ۧ";
                    break;
                case 1747811:
                    str = "ۣۨ";
                    sArr = f626short;
                    break;
                case 1747900:
                    str = "ۣۤ۠";
                    sArr = f626short;
                    break;
                case 1747903:
                    methodName = strM13272;
                    str = "ۤۤۡ";
                    break;
                case 1749700:
                    methodSig = strM13267;
                    str = "ۣۤۤ";
                    break;
                case 1751617:
                    str = "۠ۧۦ";
                    strM13272 = C0205.m13272(sArr, 48, 10, 1163);
                    break;
                case 1751649:
                    str = "ۥۤۥ";
                    sArr = f626short;
                    break;
                case 1751651:
                    return;
                case 1752614:
                    strM13267 = C0204.m13267(sArr, 58, 4, 2827);
                    str = "ۣۢۥ";
                    break;
                default:
                    str = "۠ۡۡ";
                    strM13263 = C0203.m13263(sArr, 0, 48, 3013);
                    break;
            }
        }
    }

    public static native byte[] backup(Object obj);

    public static byte[] hook(Object obj) {
        byte[] bArrBackup = backup(obj);
        byte[] bArr = C0193.f718;
        C0203.m13263(f626short, 62, 6, 1650);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = bArr == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zM13233 = C0193.m13233(bArrBackup, false);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zM13233 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0205.m13272(f626short, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 19, 3104);
                                return bArrBackup;
                            case 500:
                                C0207.m13281(f626short, 68, 41, 1392);
                                return C0193.f718;
                        }
                    }
                    break;
                case 239:
                    byte[] bArr2 = C0193.f712;
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = bArr2 == null ? 48705 : 48736;
                                break;
                            case 47384:
                                return bArrBackup;
                            case 47417:
                                boolean zM132332 = C0193.m13233(bArrBackup, false);
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            return bArrBackup;
                                        case Base64.mimeLineLength /* 76 */:
                                            C0205.m13272(f626short, 128, 39, 2440);
                                            return C0193.f712;
                                        case 239:
                                            i4 = !zM132332 ? 48829 : 48860;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
