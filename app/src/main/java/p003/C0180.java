package p003;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.core.view.PointerIconCompat;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣۣۣۣۣ۟۟ۢ۟۟۟ۢ۠۟۟ۢۡ۟۟ۢۢ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0180 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f656short = {1557, 1562, 1552, 1542, 1563, 1565, 1552, 1626, 1557, 1540, 1540, 1626, 1589, 1540, 1540, 1560, 1565, 1559, 1557, 1536, 1565, 1563, 1562, 1572, 1557, 1559, 1567, 1557, 1555, 1553, 1593, 1557, 1562, 1557, 1555, 1553, 1542, 1164, 1160, 1176, 1167, 1156, 1204, 1171, 1161, 1176, 1171, 1161, 1198, 1176, 1167, 1163, 1172, 1182, 1176, 1166, 3231, 3323, 3286, 3289, 3283, 3269, 3288, 3294, 3283, 3224, 3284, 3288, 3289, 3267, 3282, 3289, 3267, 3224, 3326, 3289, 3267, 3282, 3289, 3267, 3212, 3326, 3230, 3323, 3293, 3286, 3265, 3286, 3224, 3266, 3267, 3294, 3291, 3224, 3323, 3294, 3268, 3267, 3212, 927, 915, 913, 921, 988, 917, 914, 988, 909, 905, 921, 910, 901, 949, 914, 904, 921, 914, 904, 943, 921, 910, 906, 917, 927, 921, 911, 976, 988, 917, 914, 904, 921, 914, 904, 961, 1373, 1361, 1303, 1309, 1296, 1302, 1282, 1356, 2925, 2934, 2896, 2904, 2903, 2904, 2211, 2223, 2221, 2286, 2209, 2222, 2212, 2226, 2223, 2217, 2212, 2286, 2230, 2213, 2222, 2212, 2217, 2222, 2215, 2286, 2210, 2217, 2220, 2220, 2217, 2222, 2215, 2286, 2185, 2222, 2177, 2224, 2224, 2178, 2217, 2220, 2220, 2217, 2222, 2215, 2195, 2213, 2226, 2230, 2217, 2211, 2213, 2286, 2178, 2185, 2190, 2180, 27606, 27418, -31481, 25212, 27679, 18408, -32644, 21189, 27886, -31383, 26467, 20555, -31993, 27092, 29251, 32490, -30731, 24718, -2866, -30425, -32189, -30731, 24718, 23111, -30993, 32054, 26727, -30993, 17821, -25406, -32189, 2990, 2987, 2993, 2998, 2973, 2960, 2983, 2993, 2989, 2990, 2996, 2983, 2955, 2988, 2980, 2989, -25444, 2951, 2991, 2994, 2998, 3003, 3050, 3051, -2866, 23842, 24742, -26097, 28274, 17634, 23207, 2987, 2988, 2998, 2983, 2988, 2998};

    public C0180() {
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
                    System.out.println(C0205.m13270("HvXHIU1eNqOrE8rDycaqHJf7d69"));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۠ۡۧ";
        String strM13267 = null;
        String strM13272 = null;
        String strM13263 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56447:
                    str = "ۨۨۢ";
                    strM13272 = C0205.m13272(sArr, 56, 43, 3255);
                    break;
                case 1746966:
                    str = "ۣۤ";
                    sArr = f656short;
                    break;
                case 1747718:
                    str = "ۨۥۤ";
                    sArr = f656short;
                    break;
                case 1747896:
                    return;
                case 1747932:
                    className = strM13267;
                    str = "ۥ۟ۤ";
                    break;
                case 1751525:
                    methodName = strM13263;
                    str = "۟ۨ۟";
                    break;
                case 1753485:
                    str = "ۤ۠ۡ";
                    strM13263 = C0203.m13263(sArr, 37, 19, 1277);
                    break;
                case 1755527:
                    strM13267 = C0204.m13267(sArr, 0, 37, 1652);
                    str = "۠ۨۤ";
                    break;
                case 1755618:
                    methodSig = strM13272;
                    str = "۠ۧ۟";
                    break;
                default:
                    str = "ۦۡۨ";
                    sArr = f656short;
                    break;
            }
        }
    }

    public static native List<ResolveInfo> backup(Object obj, Intent intent, int i);

    public static List<ResolveInfo> hook(Object obj, Intent intent, int i) {
        String str = C0204.m13267(f656short, 99, 36, PointerIconCompat.TYPE_GRAB) + intent + C0205.m13272(f656short, 135, 8, 1393) + i;
        C0205.m13272(f656short, 143, 6, 2831);
        List<ResolveInfo> listBackup = backup(obj, intent, i);
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
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = intent == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return listBackup;
                            case 500:
                                String action = intent.getAction();
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = action == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals = intent.getAction().equals(C0207.m13281(f656short, 149, 52, 2240));
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        C0203.m13263(f656short, 201, 6, 2352);
                                                        intent.setPackage(C0193.f713);
                                                        boolean zIsEmpty = listBackup.isEmpty();
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return listBackup;
                                                                case 503:
                                                                    i6 = !zIsEmpty ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    C0207.m13281(f656short, 207, 62, 3010);
                                                                    return backup(obj, intent, i);
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i5 = !zEquals ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                boolean zM13232 = C0193.m13232(intent);
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            i7 = !zM13232 ? 49759 : 49728;
                                            break;
                                        case 50:
                                            break;
                                        case Base64.mimeLineLength /* 76 */:
                                            boolean zM13250 = C0193.m13250(intent.getPackage());
                                            int i8 = 49790;
                                            while (true) {
                                                i8 ^= 49807;
                                                switch (i8) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        return listBackup;
                                                    case 84:
                                                        break;
                                                    case 241:
                                                        i8 = !zM13250 ? 49852 : 49883;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            break;
                                    }
                                }
                                listBackup.clear();
                                return listBackup;
                        }
                    }
                    break;
                case 239:
                    return listBackup;
            }
        }
    }
}
