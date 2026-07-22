package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۡۨۤ۟۟ۡۨۥ۟۟ۡۨۦ۟۟ۡۨۧ۟۟ۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0170 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f646short = {662, 665, 659, 645, 664, 670, 659, 729, 660, 664, 665, 643, 658, 665, 643, 729, 647, 666, 729, 702, 679, 662, 660, 668, 662, 656, 658, 698, 662, 665, 662, 656, 658, 645, 723, 676, 643, 642, 661, 723, 679, 645, 664, 655, 654, 835, 833, 848, 884, 837, 839, 847, 837, 835, 833, 877, 842, 834, 843, 2618, 2654, 2680, 2675, 2660, 2675, 2621, 2686, 2675, 2684, 2677, 2621, 2625, 2662, 2656, 2683, 2684, 2677, 2601, 2651, 2651, 2619, 2654, 2675, 2684, 2678, 2656, 2685, 2683, 2678, 2621, 2673, 2685, 2684, 2662, 2679, 2684, 2662, 2621, 2658, 2687, 2621, 2626, 2675, 2673, 2681, 2675, 2677, 2679, 2651, 2684, 2676, 2685, 2601, 1813, 1905, 1879, 1884, 1867, 1884, 1810, 1873, 1884, 1875, 1882, 1810, 1902, 1865, 1871, 1876, 1875, 1882, 1798, 1911, 1908, 1812, 1905, 1884, 1875, 1881, 1871, 1874, 1876, 1881, 1810, 1886, 1874, 1875, 1865, 1880, 1875, 1865, 1810, 1869, 1872, 1810, 1901, 1884, 1886, 1878, 1884, 1882, 1880, 1908, 1875, 1883, 1874, 1798, 1056, 1068, 1070, 1062, 1123, 1066, 1069, 1123, 1034, 1043, 1058, 1056, 1064, 1058, 1060, 1062, 1038, 1058, 1069, 1058, 1060, 1062, 1073, 1127, 1040, 1079, 1078, 1057, 1127, 1043, 1073, 1068, 1083, 1082, 1052, 1060, 1062, 1079, 1043, 1058, 1056, 1064, 1058, 1060, 1062, 1034, 1069, 1061, 1068, 1135, 1123, 1075, 1058, 1056, 1064, 1058, 1060, 1062, 1037, 1058, 1070, 1062, 1150, 1826, 1838, 1896, 1890, 1903, 1897, 1917, 1843, 1914, 1889, 1863, 1871, 1856, 1871, 21262, 24446, 23451, 21586, 18101, 31824, -30831, 29480, -2228, 25394, 28064, 32466, 29480, 23643, -30834, 28281, 27207, 32466, 29480, 23643, -2214, 18300, -26506, 27206, 23165, 18156, 32466, 29480, 23643, -2214, -24988, 25396, 23165, 18156, 17929, 23286, 22835, 29480, 23643, -27942, -31849, 24421, 21269, 22512, 22585, 19166, 28731, -29702, 32579, -1241, 22991, 28940, 22038, 19079, 22512, 22585, 19166, 28731, -29702, 32579};

    public C0170() {
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
                    System.out.println(Long.parseLong(C0205.m13270("scH")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String strM13263;
        className = C0203.m13263(f646short, 0, 45, 759);
        methodName = C0204.m13267(f646short, 45, 14, 804);
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
                    strM13263 = C0203.m13263(f646short, 59, 54, 2578);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                continue;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM13263 = C0203.m13263(f646short, 113, 54, 1853);
                    break;
            }
        }
        methodSig = strM13263;
        int iM13280 = C0207.m13280();
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    i4 = iM13280 < 0 ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    System.out.println(Long.parseLong(C0205.m13270("G4yo0xEfK3lNijg8DpmzYeUOMth")));
                    break;
                case 47483:
                    break;
            }
            return;
        }
    }

    public static native PackageInfo backup(Object obj, String str, long j, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0069. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0086. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0100. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x012a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x0147. Please report as an issue. */
    public static PackageInfo hook(Object obj, String str, long j, int i) {
        String str2 = C0207.m13281(f646short, 167, 63, 1091) + str + C0204.m13267(f646short, 230, 8, 1806) + j;
        C0207.m13281(f646short, 238, 6, 1816);
        PackageInfo packageInfoBackup = backup(obj, str, j, i);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = j != 64 ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = C0193.f713.equals(str);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = !zEquals ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str3 = C0193.f719;
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = str3 == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals2 = C0193.f719.equals("");
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zM13233 = C0193.m13233(packageInfoBackup.signatures[0].toByteArray(), false);
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    C0205.m13272(f646short, 285, 19, 1085);
                                                                    int i7 = 49790;
                                                                    while (true) {
                                                                        i7 ^= 49807;
                                                                        switch (i7) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i7 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    i6 = !zM13233 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    C0203.m13263(f646short, 244, 41, 2134);
                                                                    packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f719)};
                                                                    int i8 = 49666;
                                                                    while (true) {
                                                                        i8 ^= 49683;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 49697;
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
                                                        i5 = !zEquals2 ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                Signature[] signatureArr = C0193.f715;
                                int i9 = 49914;
                                while (true) {
                                    i9 ^= 49931;
                                    switch (i9) {
                                        case 497:
                                            i9 = signatureArr == null ? 50627 : 50658;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            String str4 = C0193.f714;
                                            int i10 = 50813;
                                            while (true) {
                                                i10 ^= 50830;
                                                switch (i10) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i10 = str4 == null ? 50875 : 51557;
                                                        break;
                                                    case 4075:
                                                        boolean zEquals3 = C0193.f714.equals("");
                                                        int i11 = 51588;
                                                        while (true) {
                                                            i11 ^= 51605;
                                                            switch (i11) {
                                                                case 17:
                                                                    i11 = !zEquals3 ? 51681 : 51650;
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
                                            int i12 = 50689;
                                            while (true) {
                                                i12 ^= 50706;
                                                switch (i12) {
                                                    case 19:
                                                        i12 = 50720;
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
