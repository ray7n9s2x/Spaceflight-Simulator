package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡۨ۟۟۟ۡۨ۠۟۟ۡۨۡ۟۟ۡۨۢ۟۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0169 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f645short = {2442, 2437, 2447, 2457, 2436, 2434, 2447, 2501, 2440, 2436, 2437, 2463, 2446, 2437, 2463, 2501, 2459, 2438, 2501, 2466, 2491, 2442, 2440, 2432, 2442, 2444, 2446, 2470, 2442, 2437, 2442, 2444, 2446, 2457, 2511, 2488, 2463, 2462, 2441, 2511, 2491, 2457, 2436, 2451, 2450, 1758, 1756, 1741, 1769, 1752, 1754, 1746, 1752, 1758, 1756, 1776, 1751, 1759, 1750, 2451, 2551, 2513, 2522, 2509, 2522, 2452, 2519, 2522, 2517, 2524, 2452, 2536, 2511, 2505, 2514, 2517, 2524, 2432, 2546, 2546, 2450, 2551, 2522, 2517, 2527, 2505, 2516, 2514, 2527, 2452, 2520, 2516, 2517, 2511, 2526, 2517, 2511, 2452, 2507, 2518, 2452, 2539, 2522, 2520, 2512, 2522, 2524, 2526, 2546, 2517, 2525, 2516, 2432, 1460, 1488, 1526, 1533, 1514, 1533, 1459, 1520, 1533, 1522, 1531, 1459, 1487, 1512, 1518, 1525, 1522, 1531, 1447, 1494, 1493, 1461, 1488, 1533, 1522, 1528, 1518, 1523, 1525, 1528, 1459, 1535, 1523, 1522, 1512, 1529, 1522, 1512, 1459, 1516, 1521, 1459, 1484, 1533, 1535, 1527, 1533, 1531, 1529, 1493, 1522, 1530, 1523, 1447, 3236, 3240, 3242, 3234, 3303, 3246, 3241, 3303, 3214, 3223, 3238, 3236, 3244, 3238, 3232, 3234, 3210, 3238, 3241, 3238, 3232, 3234, 3253, 3299, 3220, 3251, 3250, 3237, 3299, 3223, 3253, 3240, 3263, 3262, 3224, 3232, 3234, 3251, 3223, 3238, 3236, 3244, 3238, 3232, 3234, 3214, 3241, 3233, 3240, 3307, 3303, 3255, 3238, 3236, 3244, 3238, 3232, 3234, 3209, 3238, 3242, 3234, 3322, 1287, 1291, 1357, 1351, 1354, 1356, 1368, 1302, 1687, 1676, 1706, 1698, 1709, 1698, 23553, 20593, 21652, 23389, 18874, 29535, -30562, 31783, -1981, 27709, 25263, 29149, 31783, 21332, -30591, 24950, 25928, 29149, 31783, 21332, -1963, 18547, -26759, 25929, 21874, 18915, 29149, 31783, 21332, -1963, -28309, 27707, 21874, 18915, 18694, 22009, 22076, 31783, 21332, -25131, -29544, 24411, 21291, 22478, 22535, 19168, 28677, -29756, 32637, -1255, 23025, 28978, 22056, 19129, 22478, 22535, 19168, 28677, -29756, 32637};

    public C0169() {
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
                    System.out.println(Long.decode(C0207.m13279("YptSnEmrR0cTgNZWo47gyVMR")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    public static void SetStr() {
        String strM13281;
        className = C0207.m13281(f645short, 0, 45, 2539);
        methodName = C0203.m13263(f645short, 45, 14, 1721);
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i > 32 ? 1678 : 1709;
                    break;
                case 204:
                    strM13281 = C0203.m13263(f645short, 59, 54, 2491);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM13281 = C0207.m13281(f645short, 113, 54, 1436);
                    break;
            }
        }
        methodSig = strM13281;
    }

    public static native PackageInfo backup(Object obj, String str, int i, int i2);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0067. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00fe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0128. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x0145. Please report as an issue. */
    public static PackageInfo hook(Object obj, String str, int i, int i2) {
        String str2 = C0207.m13281(f645short, 167, 63, 3271) + str + C0207.m13281(f645short, 230, 8, 1323) + i;
        C0204.m13267(f645short, 238, 6, 1781);
        PackageInfo packageInfoBackup = backup(obj, str, i, i2);
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    i3 = i != 64 ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = C0193.f713.equals(str);
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
                                break;
                            case 500:
                                String str3 = C0193.f719;
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = str3 == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals2 = C0193.f719.equals("");
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zM13233 = C0193.m13233(packageInfoBackup.signatures[0].toByteArray(), false);
                                                        int i7 = 48891;
                                                        while (true) {
                                                            i7 ^= 48908;
                                                            switch (i7) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    C0205.m13272(f645short, 285, 19, 1027);
                                                                    int i8 = 49790;
                                                                    while (true) {
                                                                        i8 ^= 49807;
                                                                        switch (i8) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i8 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    i7 = !zM13233 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    C0205.m13272(f645short, 244, 41, 1881);
                                                                    packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f719)};
                                                                    int i9 = 49666;
                                                                    while (true) {
                                                                        i9 ^= 49683;
                                                                        switch (i9) {
                                                                            case 17:
                                                                                i9 = 49697;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i6 = !zEquals2 ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                Signature[] signatureArr = C0193.f715;
                                int i10 = 49914;
                                while (true) {
                                    i10 ^= 49931;
                                    switch (i10) {
                                        case 497:
                                            i10 = signatureArr == null ? 50627 : 50658;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            String str4 = C0193.f714;
                                            int i11 = 50813;
                                            while (true) {
                                                i11 ^= 50830;
                                                switch (i11) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i11 = str4 == null ? 50875 : 51557;
                                                        break;
                                                    case 4075:
                                                        boolean zEquals3 = C0193.f714.equals("");
                                                        int i12 = 51588;
                                                        while (true) {
                                                            i12 ^= 51605;
                                                            switch (i12) {
                                                                case 17:
                                                                    i12 = !zEquals3 ? 51681 : 51650;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f714)};
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            packageInfoBackup.signatures = C0193.f715;
                                            int i13 = 50689;
                                            while (true) {
                                                i13 ^= 50706;
                                                switch (i13) {
                                                    case 19:
                                                        i13 = 50720;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
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
        return packageInfoBackup;
    }
}
