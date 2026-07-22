package p003;

import java.io.InputStream;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۥۤ۟۟۟ۥۥ۟۟۟ۥۦ۟۟۟ۥۧ۟۟۟ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0128 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f604short = {269, 258, 264, 286, 259, 261, 264, 322, 271, 259, 258, 280, 265, 258, 280, 322, 286, 265, 287, 322, 301, 287, 287, 265, 280, 289, 269, 258, 269, 267, 265, 286, 2160, 2159, 2170, 2161, 402, 502, 464, 475, 460, 475, 405, 470, 475, 468, 477, 405, 489, 462, 456, 467, 468, 477, 385, 403, 502, 464, 475, 460, 475, 405, 467, 469, 405, 499, 468, 458, 463, 462, 489, 462, 456, 479, 475, 471, 385, 501, 505, 507, 499, 438, 511, 504, 438, 471, 485, 485, 499, 482, 475, 503, 504, 503, 497, 499, 484, 457, 505, 486, 499, 504, 423, 442, 438, 496, 511, 506, 499, 472, 503, 507, 499, 427, 2132, 2127, 2153, 2145, 2158, 2145};

    public C0128() {
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
                    System.out.println(Float.valueOf(C0204.m13269("EuS9xL27vQOk8Dry5U")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۥۡۢ";
        String strM13272 = null;
        String strM13267 = null;
        String strM13281 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56356:
                    str = "ۨۧۤ";
                    sArr = f604short;
                    break;
                case 56474:
                    str = "ۥۤۧ";
                    sArr = f604short;
                    break;
                case 1746693:
                    return;
                case 1752457:
                    methodSig = strM13267;
                    str = "۟۟ۥ";
                    break;
                case 1752518:
                    str = "ۧ۟ۦ";
                    sArr = f604short;
                    break;
                case 1752616:
                    str = "ۨۦ۟";
                    strM13281 = C0207.m13281(sArr, 32, 4, 2079);
                    break;
                case 1754382:
                    strM13272 = C0205.m13272(sArr, 0, 32, 364);
                    str = "۠ۦ۠";
                    break;
                case 1755553:
                    methodName = strM13281;
                    str = "ۡۥ";
                    break;
                case 1755589:
                    str = "ۥۣ۟";
                    strM13267 = C0204.m13267(sArr, 36, 41, 442);
                    break;
                default:
                    className = strM13272;
                    str = "ۥ۟";
                    break;
            }
        }
    }

    public static native InputStream backup(Object obj, String str);

    public static InputStream hook(Object obj, String str) {
        String[] strArr = C0193.f708;
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= length ? 1678 : 1709;
                        break;
                    case 204:
                        boolean zEquals = strArr[i].equals(str);
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
                                    i++;
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    C0204.m13267(f604short, 114, 6, 2102);
                                    String str2 = C0204.m13267(f604short, 77, 37, 406) + str;
                                    return backup(obj, C0193.f709);
                            }
                        }
                        break;
                    case 239:
                        return backup(obj, str);
                }
            }
        }
    }
}
