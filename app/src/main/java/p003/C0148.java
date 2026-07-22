package p003;

import android.text.TextUtils;
import android.widget.Toast;
import java.util.HashMap;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۤۤ۟۟۠ۤۥ۟۟۠ۤۦ۟۟۠ۤۧ۟۟۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0148 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f624short = {727, 728, 722, 708, 729, 735, 722, 664, 705, 735, 722, 721, 723, 706, 664, 738, 729, 727, 709, 706, 1403, 1376, 1383, 1407, 320, 321, 318, 1574, 1578, 1576, 1568, 1637, 1580, 1579, 1637, 1581, 1578, 1578, 1582, 1562, 1553, 1578, 1572, 1590, 1585, 1562, 1590, 1581, 1578, 1586, 1641, 1637, 1585, 1568, 1597, 1585, 1656, 3321, 3298, 3268, 3276, 3267, 3276, 2641, 2635, 2678, 2653, 2653, 2652, 2667, 2640, 2647, 2639, 2668, 2647, 2649, 2635, 2636, 2576, 2569, 2577, -2782, 2654, 2649, 2644, 2635, 2653, 1975, 1965, 1936, 1979, 1979, 1978, 1933, 1974, 1969, 1961, 1930, 1969, 1983, 1965, 1962, 2038, 2028, 2039, -1852, 1976, 1983, 1970, 1965, 1979};
    public static HashMap<Toast, CharSequence> Toast_for_Android11 = new HashMap<>();

    public C0148() {
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
                    System.out.println(Float.valueOf(C0207.m13279("LmvoTe3w61NDBaJGlDQX6EHr")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0205.m13272(f624short, 0, 20, 694);
        methodName = C0205.m13272(f624short, 20, 4, 1288);
        methodSig = C0203.m13263(f624short, 24, 3, 360);
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
                    System.out.println(Long.valueOf(C0206.m13276("NL7m6U1MLr3uTc3HVYsLtQWE")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Object obj);

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00c0. Please report as an issue. */
    public static void hook(Object obj) {
        boolean z = false;
        CharSequence charSequence = Toast_for_Android11.get(obj);
        String str = C0207.m13281(f624short, 27, 30, 1605) + ((Object) charSequence);
        C0203.m13263(f624short, 57, 6, 3227);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zIsEmpty ? 1709 : 1678;
                    break;
                case 204:
                    String strReplace = charSequence.toString().toLowerCase().replace(C0193.f694, "");
                    boolean zContains = strReplace.contains(C0193.f723);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zContains ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                String[] strArr = C0193.f697;
                                int length = strArr.length;
                                int i3 = 0;
                                while (true) {
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = i3 >= length ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean zContains2 = strReplace.contains(strArr[i3].toLowerCase());
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            i3++;
                                                            int i6 = 49666;
                                                            while (true) {
                                                                i6 ^= 49683;
                                                                switch (i6) {
                                                                    case 17:
                                                                        i6 = 49697;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            C0203.m13263(f624short, 87, 24, 2014);
                                                            int i7 = 48891;
                                                            while (true) {
                                                                i7 ^= 48908;
                                                                switch (i7) {
                                                                    case 22:
                                                                        break;
                                                                    case 503:
                                                                        i7 = 48922;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            i5 = !zContains2 ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                C0207.m13281(f624short, 63, 24, 2616);
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
        z = true;
        int i8 = 49790;
        while (true) {
            i8 ^= 49807;
            switch (i8) {
                case 18:
                    break;
                case 51:
                    break;
                case 84:
                    backup(obj);
                    break;
                case 241:
                    i8 = !z ? 49852 : 49883;
                    break;
            }
        }
        int iM13266 = C0204.m13266();
        int i9 = 49914;
        while (true) {
            i9 ^= 49931;
            switch (i9) {
                case 497:
                    i9 = iM13266 > 0 ? 50627 : 50658;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    System.out.println(Double.decode(C0204.m13269("aJGW0prz")));
                    break;
            }
            return;
        }
    }
}
