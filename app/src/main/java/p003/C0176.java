package p003;

import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢۡ۟۟۟ۢۡ۠۟۟ۢۡۡ۟۟ۢۡۢ۟۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0176 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f652short = {3045, 3050, 3040, 3062, 3051, 3053, 3040, 2986, 3059, 3041, 3046, 3055, 3053, 3056, 2986, 3027, 3041, 3046, 3026, 3053, 3041, 3059, 2869, 2870, 2872, 2877, 2845, 2872, 2861, 2872, 819, 855, 881, 890, 877, 890, 820, 887, 890, 885, 892, 820, 840, 879, 873, 882, 885, 892, 800, 855, 881, 890, 877, 890, 820, 887, 890, 885, 892, 820, 840, 879, 873, 882, 885, 892, 800, 855, 881, 890, 877, 890, 820, 887, 890, 885, 892, 820, 840, 879, 873, 882, 885, 892, 800, 818, 845, 1529, 2130, 2592, 2609, 2604, 2592, 2665, 2961, 2954, 2988, 2980, 2987, 2980, 877, 865, 867, 875, 814, 871, 864, 814, 857, 875, 876, 856, 871, 875, 889, 849, 866, 865, 879, 874, 842, 879, 890, 879, 802, 814, 874, 879, 890, 879, 819, 3303, 3324, 3290, 3282, 3293, 3282, 826, 811, 822, 826, 865, 806, 826, 803, 802, 2398, 2319, 2307, 2320, 2323, 2327, 2311, 2311, 576, 595, 529, 541, 526, 525, 521, 537, 537, 578, 2854, 2940, 2933, 2932, 2926, 1407, 1388, 1317, 1324, 1325, 1335, 1405};

    public C0176() {
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
                    System.out.println(Double.valueOf(C0203.m13264("vI")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۟ۨۥ";
        String strM13281 = null;
        String strM13263 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56570:
                    str = "ۣ۟۠";
                    sArr = f652short;
                    break;
                case 1746722:
                    str = "ۧۢۥ";
                    strM132632 = C0203.m13263(sArr, 30, 57, 795);
                    break;
                case 1746972:
                    str = "ۣۤۤ";
                    sArr = f652short;
                    break;
                case 1747903:
                    return;
                case 1750691:
                    strM13281 = C0207.m13281(sArr, 0, 22, 2948);
                    str = "ۣۥۤ";
                    break;
                case 1750722:
                    className = strM13281;
                    str = "ۣۥۥ";
                    break;
                case 1750723:
                    str = "ۧۢۦ";
                    sArr = f652short;
                    break;
                case 1754408:
                    methodName = strM13263;
                    str = "ۨۢ";
                    break;
                case 1754475:
                    str = "ۧ۠ۡ";
                    strM13263 = C0203.m13263(sArr, 22, 8, 2905);
                    break;
                default:
                    methodSig = strM132632;
                    str = "۠ۧۦ";
                    break;
            }
        }
    }

    public static native void backup(Object obj, String str, String str2, String str3);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0028. Please report as an issue. */
    public static String get_new_data(String str, String str2, String str3) {
        int iIndexOf = 0;
        while (true) {
            int iIndexOf2 = str.indexOf(str2, iIndexOf);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = iIndexOf2 != -1 ? 1678 : 1709;
                        break;
                    case 204:
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                            iIndexOf = -1;
                            break;
                        }
                        break;
                    case 239:
                        iIndexOf = str.indexOf(str3, iIndexOf2);
                        break;
                }
            }
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = iIndexOf == -1 ? 48705 : 48736;
                        break;
                    case 47384:
                        break;
                    case 47417:
                        String lowerCase = str.substring(iIndexOf2, iIndexOf).toLowerCase();
                        String[] strArr = C0193.f697;
                        int length = strArr.length;
                        int i4 = 0;
                        while (true) {
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                        break;
                                    case 45:
                                        break;
                                    case Base64.mimeLineLength /* 76 */:
                                        int iIndexOf3 = lowerCase.indexOf(strArr[i4].toLowerCase());
                                        int i6 = 48891;
                                        while (true) {
                                            i6 ^= 48908;
                                            switch (i6) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    i4++;
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
                                                    i6 = iIndexOf3 == -1 ? 48953 : 49635;
                                                    break;
                                                case 32495:
                                                    int i8 = iIndexOf3 + iIndexOf2;
                                                    int iLastIndexOf = str.lastIndexOf(C0207.m13281(f652short, 87, 1, 1479), i8);
                                                    int iIndexOf4 = str.indexOf(C0207.m13281(f652short, 88, 1, 2158), i8);
                                                    int i9 = iLastIndexOf + 1;
                                                    String strSubstring = str.substring(i9, iIndexOf4);
                                                    C0205.m13272(f652short, 94, 6, 3059);
                                                    String str4 = C0204.m13267(f652short, 89, 5, 2644) + strSubstring;
                                                    str = str.substring(0, i9) + C0193.f723 + str.substring(iIndexOf4);
                                                    int i10 = 49666;
                                                    while (true) {
                                                        i10 ^= 49683;
                                                        switch (i10) {
                                                            case 17:
                                                                i10 = 49697;
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
                                        i5 = i4 >= length ? 48829 : 48860;
                                        break;
                                }
                            }
                        }
                        int i11 = 49914;
                        while (true) {
                            i11 ^= 49931;
                            switch (i11) {
                                case 497:
                                    i11 = 50596;
                                    break;
                                case 1711:
                                    break;
                            }
                        }
                        break;
                    case 47483:
                        break;
                }
                return str;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0045. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    public static void hook(Object obj, String str, String str2, String str3) {
        C0207.m13281(f652short, 131, 6, 3205);
        String str4 = C0203.m13263(f652short, 100, 31, 782) + str;
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
                    boolean zEquals = C0203.m13263(f652short, 137, 9, 846).equals(str2);
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
                                break;
                            case 500:
                                str = get_new_data(get_new_data(str, C0207.m13281(f652short, 146, 8, 2402), C0207.m13281(f652short, 154, 10, 636)), C0204.m13267(f652short, 164, 5, 2842), C0205.m13272(f652short, 169, 7, 1347));
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        backup(obj, str, str2, str3);
    }
}
