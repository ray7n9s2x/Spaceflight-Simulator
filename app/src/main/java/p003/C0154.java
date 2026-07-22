package p003;

import android.content.pm.Signature;
import android.os.Build;
import java.lang.reflect.Field;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۧۤ۟۟۠ۧۥ۟۟۠ۧۦ۟۟۠ۧۧ۟۟۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0154 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f630short = {2109, 2098, 2104, 2094, 2099, 2101, 2104, 2162, 2111, 2099, 2098, 2088, 2105, 2098, 2088, 2162, 2092, 2097, 2162, 2060, 2109, 2111, 2103, 2109, 2107, 2105, 2060, 2109, 2094, 2095, 2105, 2094, 1988, 1992, 1995, 1995, 1986, 1988, 2003, 2020, 1986, 2005, 2003, 1998, 1985, 1998, 1988, 1990, 2003, 1986, 2004, 510, 410, 439, 440, 434, 420, 441, 447, 434, 505, 437, 441, 440, 418, 435, 440, 418, 505, 422, 443, 505, 390, 439, 437, 445, 439, 433, 435, 390, 439, 420, 421, 435, 420, 498, 390, 439, 437, 445, 439, 433, 435, 493, 415, 511, 384, 530, 542, 540, 532, 593, 536, 543, 593, 530, 542, 541, 541, 532, 530, 517, 562, 532, 515, 517, 536, 535, 536, 530, 528, 517, 532, 514, 601, 579, 600, -661, 513, 528, 515, 514, 532, 567, 541, 528, 534, 514, 588, 2469, 2494, 2456, 2448, 2463, 2448, 2897, 2880, 2882, 2890, 2880, 2886, 2884, 2927, 2880, 2892, 2884, 1371, 1381, 1375, 1361, 1368, 1367, 1346, 1347, 1348, 1363, 1349, 20630, 23782, 22531, 22474, 17709, 32712, -31735, 28848, -2860, 24746, 28216, 32074, 28848, 24515, -31722, 28129, 27103, 32074, 28848, 24515, -2878, 17636, -25618, 27102, 23013, 17780, 32074, 28848, 24515, -2878, -25092, 24748, 23013, 17780, 17809, 22894, 23211, 28848, 24515, -28350, -32753, 23969, 20945, 21812, 23293, 18458, 29439, -30402, 32135, -1565, 23307, 29640, 21714, 18499, 21812, 23293, 18458, 29439, -30402, 32135};

    public C0154() {
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
                    System.out.println(Float.decode(C0207.m13279("SEvnEMYbL45nl0TW92uPvnx21")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String strM13272;
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i < 24 ? 1678 : 1709;
                    break;
                case 204:
                    strM13272 = C0205.m13272(f630short, 0, 32, 2140);
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
                    strM13272 = null;
                    break;
            }
        }
        className = strM13272;
        methodName = C0204.m13267(f630short, 32, 19, 1959);
        methodSig = C0203.m13263(f630short, 51, 46, 470);
        int iM13262 = C0203.m13262();
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    i4 = iM13262 > 0 ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    System.out.println(Float.decode(C0207.m13279("OjTOIhd")));
                    break;
                case 47483:
                    break;
            }
            return;
        }
    }

    public static native void backup(Package r0, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0153. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0170. Please report as an issue. */
    public static void hook(Package r5, int i) {
        String str;
        int i2;
        String str2 = C0207.m13281(f630short, 97, 42, 625) + i;
        C0205.m13272(f630short, 139, 6, 2503);
        backup(r5, i);
        try {
            Field declaredField = r5.getClass().getDeclaredField(C0204.m13267(f630short, 145, 11, 2849));
            declaredField.setAccessible(true);
            str = (String) declaredField.get(r5);
            i2 = 1616;
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
            return;
        }
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i != 64 ? 1678 : 1709;
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
                                Field declaredField2 = r5.getClass().getDeclaredField(C0204.m13267(f630short, 156, 11, 1334));
                                declaredField2.setAccessible(true);
                                Signature[] signatureArr = (Signature[]) declaredField2.get(r5);
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
                                                        boolean zM13233 = C0193.m13233(signatureArr[0].toByteArray(), false);
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    C0203.m13263(f630short, 208, 19, 1785);
                                                                    int i7 = 49790;
                                                                    while (true) {
                                                                        i7 ^= 49807;
                                                                        switch (i7) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i7 = 49821;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        e.toString();
                                                                        e.printStackTrace();
                                                                        return;
                                                                    }
                                                                case 503:
                                                                    if (zM13233) {
                                                                        i6 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    C0204.m13267(f630short, 167, 41, 3022);
                                                                    declaredField2.set(r5, new Signature[]{new Signature(C0193.f719)});
                                                                    int i8 = 49666;
                                                                    while (true) {
                                                                        i8 ^= 49683;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 49697;
                                                                                continue;
                                                                            case 50:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        e.toString();
                                                                        e.printStackTrace();
                                                                        return;
                                                                    }
                                                                default:
                                                                    continue;
                                                            }
                                                            i6 = 48953;
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
                                Signature[] signatureArr2 = C0193.f715;
                                int i9 = 49914;
                                while (true) {
                                    i9 ^= 49931;
                                    switch (i9) {
                                        case 497:
                                            if (signatureArr2 != null) {
                                                i9 = 50658;
                                            }
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
                                                                    declaredField2.set(r5, new Signature[]{new Signature(C0193.f714)});
                                                                    int i12 = 51712;
                                                                    while (true) {
                                                                        i12 ^= 51729;
                                                                        switch (i12) {
                                                                            case 17:
                                                                                i12 = 51743;
                                                                                continue;
                                                                        }
                                                                        e.toString();
                                                                        e.printStackTrace();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            declaredField2.set(r5, C0193.f715);
                                            int i13 = 50689;
                                            while (true) {
                                                i13 ^= 50706;
                                                switch (i13) {
                                                    case 19:
                                                        i13 = 50720;
                                                        continue;
                                                    case 50:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                e.toString();
                                                e.printStackTrace();
                                                return;
                                            }
                                        default:
                                            continue;
                                    }
                                    i9 = 50627;
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
    }
}
