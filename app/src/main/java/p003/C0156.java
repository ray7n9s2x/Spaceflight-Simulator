package p003;

import android.content.pm.Signature;
import java.lang.reflect.Field;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۨۤ۟۟۠ۨۥ۟۟۠ۨۦ۟۟۠ۨۧ۟۟۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0156 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f632short = {943, 928, 938, 956, 929, 935, 938, 992, 941, 929, 928, 954, 939, 928, 954, 992, 958, 931, 992, 926, 943, 941, 933, 943, 937, 939, 926, 943, 956, 957, 939, 956, 2562, 2574, 2573, 2573, 2564, 2562, 2581, 2594, 2564, 2579, 2581, 2568, 2567, 2568, 2562, 2560, 2581, 2564, 2578, 1778, 1686, 1723, 1716, 1726, 1704, 1717, 1715, 1726, 1781, 1721, 1717, 1716, 1710, 1727, 1716, 1710, 1781, 1706, 1719, 1781, 1674, 1723, 1721, 1713, 1723, 1725, 1727, 1674, 1723, 1704, 1705, 1727, 1704, 1790, 1674, 1723, 1721, 1713, 1723, 1725, 1727, 1761, 1664, 1779, 1676, 3027, 3039, 3037, 3029, 2960, 3033, 3038, 2960, 3027, 3039, 3036, 3036, 3029, 3027, 3012, 3059, 3029, 3010, 3012, 3033, 3030, 3033, 3027, 3025, 3012, 3029, 3011, 2968, 2946, 2969, -2902, 3011, 3035, 3033, 3008, 3046, 3029, 3010, 3033, 3030, 3017, 2957, 1730, 1753, 1791, 1783, 1784, 1783, 2315, 2330, 2328, 2320, 2330, 2332, 2334, 2357, 2330, 2326, 2334, 1328, 1294, 1332, 1338, 1331, 1332, 1331, 1338, 1305, 1336, 1321, 1340, 1332, 1329, 1326, 2393, 2371, 2381, 2372, 2379, 2398, 2399, 2392, 2383, 2393, 22327, 23367, 24482, 20587, 17036, 30825, -31832, 30481, -3211, 26379, 27033, 31467, 30481, 22626, -31817, 27200, 28286, 31467, 30481, 22626, -3229, 17221, -25521, 28287, 24132, 17109, 31467, 30481, 22626, -3229, -26019, 26381, 24132, 17109, 16944, 24271, 23818, 30481, 22626, -26909, -30802, 20837, 23829, 23024, 22073, 17630, 32315, -31238, 28995, -2777, 22479, 32524, 22550, 17543, 23024, 22073, 17630, 32315, -31238, 28995};

    public C0156() {
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
                    System.out.println(Integer.parseInt(C0207.m13279("X3CDOj6ANpY8vmFVZ")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0207.m13281(f632short, 0, 32, 974);
        methodName = C0205.m13272(f632short, 32, 19, 2657);
        methodSig = C0205.m13272(f632short, 51, 46, 1754);
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
                    System.out.println(Long.valueOf(C0207.m13279("aT")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Package r0, boolean z);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0098. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0158. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0175. Please report as an issue. */
    public static void hook(Package r6, boolean z) {
        boolean zEquals;
        int i;
        String str = C0204.m13267(f632short, 97, 42, 2992) + z;
        C0205.m13272(f632short, 139, 6, 1696);
        backup(r6, z);
        try {
            Field declaredField = r6.getClass().getDeclaredField(C0203.m13263(f632short, 145, 11, 2427));
            declaredField.setAccessible(true);
            zEquals = C0193.f713.equals((String) declaredField.get(r6));
            i = 1616;
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
            return;
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zEquals ? 1678 : 1709;
                    break;
                case 204:
                    Field declaredField2 = r6.getClass().getDeclaredField(C0203.m13263(f632short, 156, 15, 1373));
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(r6);
                    Field declaredField3 = obj.getClass().getDeclaredField(C0204.m13267(f632short, 171, 10, 2346));
                    declaredField3.setAccessible(true);
                    Signature[] signatureArr = (Signature[]) declaredField3.get(obj);
                    String str2 = C0193.f719;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = str2 == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zEquals2 = C0193.f719.equals("");
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zEquals2 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zM13233 = C0193.m13233(signatureArr[0].toByteArray(), false);
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        C0203.m13263(f632short, 222, 19, 2621);
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = 49697;
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
                                                    case Base64.mimeLineLength /* 76 */:
                                                        C0203.m13263(f632short, 181, 41, 3183);
                                                        declaredField3.set(obj, new Signature[]{new Signature(C0193.f719)});
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i6 = 48922;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                            e.toString();
                                                            e.printStackTrace();
                                                            return;
                                                        }
                                                    case 239:
                                                        if (zM13233) {
                                                            i4 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    Signature[] signatureArr2 = C0193.f715;
                    int i7 = 49790;
                    while (true) {
                        i7 ^= 49807;
                        switch (i7) {
                            case 18:
                                break;
                            case 51:
                                String str3 = C0193.f714;
                                int i8 = 50689;
                                while (true) {
                                    i8 ^= 50706;
                                    switch (i8) {
                                        case 19:
                                            i8 = str3 == null ? 50751 : 50782;
                                            break;
                                        case 45:
                                            break;
                                        case 50:
                                            break;
                                        case Base64.mimeLineLength /* 76 */:
                                            boolean zEquals3 = C0193.f714.equals("");
                                            int i9 = 50813;
                                            while (true) {
                                                i9 ^= 50830;
                                                switch (i9) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i9 = !zEquals3 ? 51557 : 50875;
                                                        break;
                                                    case 4075:
                                                        declaredField3.set(obj, new Signature[]{new Signature(C0193.f714)});
                                                        int i10 = 51588;
                                                        while (true) {
                                                            i10 ^= 51605;
                                                            switch (i10) {
                                                                case 17:
                                                                    i10 = 51619;
                                                                    continue;
                                                                case 54:
                                                                    break;
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
                            case 84:
                                declaredField3.set(obj, C0193.f715);
                                int i11 = 49914;
                                while (true) {
                                    i11 ^= 49931;
                                    switch (i11) {
                                        case 497:
                                            i11 = 50596;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                    }
                                    e.toString();
                                    e.printStackTrace();
                                    return;
                                }
                            case 241:
                                if (signatureArr2 != null) {
                                    i7 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i7 = 49852;
                    }
                    break;
                case 239:
                    break;
            }
        }
    }
}
