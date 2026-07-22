package p003;

import java.io.File;
import java.util.zip.ZipFile;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۦۤ۟۟۠ۦۥ۟۟۠ۦۦ۟۟۠ۦۧ۟۟۠ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0152 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f628short = {2789, 2798, 2809, 2798, 2721, 2810, 2811, 2790, 2787, 2721, 2805, 2790, 2815, 2721, 2773, 2790, 2815, 2761, 2790, 2787, 2794, 2153, 2108, 2107, 2108, 2081, 2155, 661, 753, 727, 732, 715, 732, 658, 721, 732, 723, 730, 658, 750, 713, 719, 724, 723, 730, 646, 660, 747};

    public C0152() {
        int iM13275 = C0206.m13275();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13275 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Double.decode(C0206.m13276("NGOIsdyfE9FawjyUlxk5vW")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۠ۧۦ";
        String strM13263 = null;
        String strM13267 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56507:
                    strM13263 = C0203.m13263(sArr, 21, 6, 2133);
                    str = "ۥۤۥ";
                    break;
                case 1746726:
                    methodSig = strM13267;
                    str = "۠ۡۦ";
                    break;
                case 1746749:
                    str = "۟۠ۧ";
                    strM13267 = C0204.m13267(sArr, 27, 21, 701);
                    break;
                case 1747717:
                    return;
                case 1747903:
                    str = "ۥۧۢ";
                    sArr = f628short;
                    break;
                case 1749725:
                    str = "۟ۡ۟";
                    sArr = f628short;
                    break;
                case 1752488:
                    str = "ۦۡ";
                    sArr = f628short;
                    break;
                case 1752614:
                    methodName = strM13263;
                    str = "ۢۤ۟";
                    break;
                case 1752704:
                    str = "ۥ۟ۥ";
                    strM132632 = C0203.m13263(sArr, 0, 21, 2703);
                    break;
                default:
                    className = strM132632;
                    str = "ۥۣ۠";
                    break;
            }
        }
    }

    public static native void backup(Object obj, String str);

    public static void hook(Object obj, String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = obj == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = obj.getClass().getName().equals(className);
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
                                boolean z = C0193.f703;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !z ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zEquals2 = str.equals(C0193.f696);
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = !zEquals2 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    long length = new File(str).length();
                                                                    long length2 = new File(C0193.f696).length();
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = length != length2 ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        backup(obj, C0193.f711);
                                                        boolean zContainsKey = C0151.getOrigName.containsKey(obj);
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    C0151.getOrigName.put((ZipFile) obj, str);
                                                                    break;
                                                                case 241:
                                                                    i7 = !zContainsKey ? 49883 : 49852;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = str == null ? 48829 : 48860;
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
                    break;
                case 239:
                    break;
            }
            return;
        }
        backup(obj, str);
        int iM13266 = C0204.m13266();
        int i8 = 49914;
        while (true) {
            i8 ^= 49931;
            switch (i8) {
                case 497:
                    i8 = iM13266 > 0 ? 50627 : 50658;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    System.out.println(Integer.parseInt(C0203.m13264("1nfUqDkj4jr0sBb4IZ")));
                    break;
            }
            return;
        }
    }
}
