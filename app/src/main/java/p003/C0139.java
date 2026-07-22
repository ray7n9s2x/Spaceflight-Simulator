package p003;

import android.database.MatrixCursor;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠۠ۤ۟۟۠۠ۥ۟۟۠۠ۦ۟۟۠۠ۧ۟۟۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0139 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f615short = {470, 473, 467, 453, 472, 478, 467, 409, 467, 470, 451, 470, 469, 470, 452, 466, 409, 506, 470, 451, 453, 478, 463, 500, 450, 453, 452, 472, 453, 2746, 2751, 2751, 2697, 2740, 2732, 734, 685, 698, 668, 663, 640, 663, 729, 666, 663, 664, 657, 729, 697, 660, 668, 659, 661, 642, 717, 735, 672, 1879, 1883, 1881, 1873, 1812, 1885, 1882, 1812, 1884, 1883, 1883, 1887, 1899, 1913, 1877, 1856, 1862, 1885, 1868, 1911, 1857, 1862, 1863, 1883, 1862, 1899, 1877, 1872, 1872, 1894, 1883, 1859, 1503, 1476, 1506, 1514, 1509, 1514, 1556, 1550, 1570, 1566, 1560, 1551, 1545, 1556, 1563, 1556, 1566, 1564, 1545, 1556, 1554, 1555, 1570, 1547, 1560, 1551, 1556, 1563, 1556, 1560, 1561, 1710, 1716, 1688, 1696, 1702, 1706, 1698, 1688, 1702, 1700, 1715, 1710, 1713, 1710, 1715, 1726, 1688, 1716, 1715, 1702, 1717, 1715, 1698, 1699, 22057, 29903, 28576, 27179, 23806, 21357, 21846, 24911, 21318, 28799, 29156, -29500, -29535, -30553, -1926};

    public C0139() {
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
                    System.out.println(Double.parseDouble(C0203.m13264("fbKCP")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۤۢ";
        String strM13272 = null;
        String strM13263 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1747679:
                    str = "ۤۥۦ";
                    strM13267 = C0204.m13267(sArr, 0, 29, 439);
                    break;
                case 1747773:
                    strM13272 = C0205.m13272(sArr, 35, 22, 758);
                    str = "ۥۥۣ";
                    break;
                case 1748833:
                    str = "ۣ۠۠";
                    sArr = f615short;
                    break;
                case 1751589:
                    str = "۠۠۟";
                    sArr = f615short;
                    break;
                case 1751685:
                    className = strM13267;
                    str = "ۤ۟ۦ";
                    break;
                case 1752643:
                    methodSig = strM13272;
                    str = "ۦ۟ۡ";
                    break;
                case 1752739:
                    str = "ۦۨۧ";
                    strM13263 = C0203.m13263(sArr, 29, 6, 2779);
                    break;
                case 1753416:
                    return;
                case 1753701:
                    methodName = strM13263;
                    str = "ۡۦۦ";
                    break;
                default:
                    str = "ۥۨۦ";
                    sArr = f615short;
                    break;
            }
        }
    }

    public static native void backup(Object obj, Object[] objArr);

    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00e4. Please report as an issue. */
    public static void hook(Object obj, Object[] objArr) {
        int i = 0;
        C0207.m13281(f615short, 57, 32, 1844);
        C0203.m13263(f615short, 89, 6, 1469);
        String[] columnNames = ((MatrixCursor) obj).getColumnNames();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = objArr == null ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = columnNames == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int length = objArr.length;
                                int length2 = columnNames.length;
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = length != length2 ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i5 = 0;
                                            while (true) {
                                                int length3 = columnNames.length;
                                                int i6 = 48767;
                                                while (true) {
                                                    i6 ^= 48784;
                                                    switch (i6) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            boolean zEquals = columnNames[i5].equals(C0205.m13272(f615short, 95, 25, 1661));
                                                            int i7 = 48891;
                                                            while (true) {
                                                                i7 ^= 48908;
                                                                switch (i7) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i7 = !zEquals ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        boolean zEquals2 = columnNames[i5].equals(C0207.m13281(f615short, 120, 24, 1735));
                                                                        int i8 = 49666;
                                                                        while (true) {
                                                                            i8 ^= 49683;
                                                                            switch (i8) {
                                                                                case 17:
                                                                                    i8 = !zEquals2 ? 49728 : 49759;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                    int i9 = 49790;
                                                                                    while (true) {
                                                                                        i9 ^= 49807;
                                                                                        switch (i9) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 241:
                                                                                                i9 = 49821;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    i5++;
                                                                                    int i10 = 49914;
                                                                                    while (true) {
                                                                                        i10 ^= 49931;
                                                                                        switch (i10) {
                                                                                            case 497:
                                                                                                i10 = 50596;
                                                                                                break;
                                                                                            case 1711:
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
                                                            i6 = i5 >= length3 ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                            }
                                            String str = C0207.m13281(f615short, 144, 15, 1888) + columnNames[i5];
                                            int length4 = objArr.length;
                                            Object[] objArr2 = new Object[length4];
                                            while (true) {
                                                int i11 = 50689;
                                                while (true) {
                                                    i11 ^= 50706;
                                                    switch (i11) {
                                                        case 19:
                                                            i11 = i >= length4 ? 50751 : 50782;
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 50:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            objArr2[i] = 1;
                                                            i++;
                                                            int i12 = 50813;
                                                            while (true) {
                                                                i12 ^= 50830;
                                                                switch (i12) {
                                                                    case 18:
                                                                        break;
                                                                    case 243:
                                                                        i12 = 50844;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                    backup(obj, objArr2);
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
        backup(obj, objArr);
    }
}
