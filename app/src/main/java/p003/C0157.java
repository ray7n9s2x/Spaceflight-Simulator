package p003;

import android.content.pm.Signature;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡ۟۟۟۟ۡ۟۠۟۟ۡ۟ۡ۟۟ۡ۟ۢ۟۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0157 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f633short = {1570, 1581, 1575, 1585, 1580, 1578, 1575, 1645, 1568, 1580, 1581, 1591, 1574, 1581, 1591, 1645, 1587, 1582, 1645, 1555, 1570, 1568, 1576, 1570, 1572, 1574, 1555, 1570, 1585, 1584, 1574, 1585, 863, 851, 848, 848, 857, 863, 840, 895, 857, 846, 840, 853, 858, 853, 863, 861, 840, 857, 847, 1530, 1438, 1459, 1468, 1462, 1440, 1469, 1467, 1462, 1533, 1457, 1469, 1468, 1446, 1463, 1468, 1446, 1533, 1442, 1471, 1533, 1410, 1459, 1457, 1465, 1459, 1461, 1463, 1410, 1459, 1440, 1441, 1463, 1440, 1526, 1410, 1459, 1457, 1465, 1459, 1461, 1463, 1513, 1438, 1464, 1459, 1444, 1459, 1533, 1467, 1469, 1533, 1428, 1467, 1470, 1463, 1513, 1416, 1531, 1412, 2343, 2347, 2345, 2337, 2404, 2349, 2346, 2404, 2343, 2347, 2344, 2344, 2337, 2343, 2352, 2311, 2337, 2358, 2352, 2349, 2338, 2349, 2343, 2341, 2352, 2337, 2359, 2412, 2423, 2413, -2466, 2341, 2356, 2351, 2306, 2349, 2344, 2337, 2425, 1238, 1242, 1161, 1169, 1171, 1162, 1196, 1183, 1160, 1171, 1180, 1155, 1223, 771, 792, 830, 822, 825, 822, 2883, 2898, 2896, 2904, 2898, 2900, 2902, 2941, 2898, 2910, 2902, 1153, 1215, 1157, 1163, 1154, 1157, 1154, 1163, 1192, 1161, 1176, 1165, 1157, 1152, 1183, 1065, 1075, 1085, 1076, 1083, 1070, 1071, 1064, 1087, 1065, 20670, 23758, 22571, 22498, 17669, 32736, -31711, 28824, -2820, 24706, 28176, 32098, 28824, 24555, -31682, 28105, 27127, 32098, 28824, 24555, -2838, 17612, -25658, 27126, 22989, 17756, 32098, 28824, 24555, -2838, -25132, 24708, 22989, 17756, 17849, 22854, 23171, 28824, 24555, -28310, -32729, 23594, 20570, 21695, 23414, 18833, 29556, -30539, 31756, -1944, 23168, 29251, 21849, 18888, 21695, 23414, 18833, 29556, -30539, 31756};

    public C0157() {
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
                    System.out.println(Integer.valueOf(C0205.m13270("9mwHvkqL8Eyta")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f633short, 0, 32, 1603);
        methodName = C0205.m13272(f633short, 32, 19, 828);
        methodSig = C0205.m13272(f633short, 51, 60, 1490);
        int iM13262 = C0203.m13262();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13262 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Long.decode(C0206.m13276("ogvEoMuHn7Ul")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Package r0, File file, boolean z);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0078. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0189. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x01a6. Please report as an issue. */
    public static void hook(Package r6, File file, boolean z) {
        String str;
        boolean zEquals;
        int i;
        String str2 = C0207.m13281(f633short, 111, 39, 2372) + file + C0205.m13272(f633short, 150, 13, 1274) + z;
        C0203.m13263(f633short, 163, 6, 865);
        backup(r6, file, z);
        try {
            Field declaredField = r6.getClass().getDeclaredField(C0205.m13272(f633short, 169, 11, 2867));
            declaredField.setAccessible(true);
            str = (String) declaredField.get(r6);
            zEquals = C0193.f696.equals(file.getPath());
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
                    boolean zEquals2 = C0193.f713.equals(str);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals2 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                Field declaredField2 = r6.getClass().getDeclaredField(C0203.m13263(f633short, 180, 15, 1260));
                                declaredField2.setAccessible(true);
                                Object obj = declaredField2.get(r6);
                                Field declaredField3 = obj.getClass().getDeclaredField(C0205.m13272(f633short, 195, 10, 1114));
                                declaredField3.setAccessible(true);
                                Signature[] signatureArr = (Signature[]) declaredField3.get(obj);
                                String str3 = C0193.f719;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = str3 == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals3 = C0193.f719.equals("");
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zM13233 = C0193.m13233(signatureArr[0].toByteArray(), false);
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    C0205.m13272(f633short, 246, 19, 1906);
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i6 = 49821;
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
                                                                        i5 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    C0204.m13267(f633short, 205, 41, 3046);
                                                                    declaredField3.set(obj, new Signature[]{new Signature(C0193.f719)});
                                                                    int i7 = 49666;
                                                                    while (true) {
                                                                        i7 ^= 49683;
                                                                        switch (i7) {
                                                                            case 17:
                                                                                i7 = 49697;
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
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = !zEquals3 ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                Signature[] signatureArr2 = C0193.f715;
                                int i8 = 49914;
                                while (true) {
                                    i8 ^= 49931;
                                    switch (i8) {
                                        case 497:
                                            if (signatureArr2 != null) {
                                                i8 = 50658;
                                            }
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            String str4 = C0193.f714;
                                            int i9 = 50813;
                                            while (true) {
                                                i9 ^= 50830;
                                                switch (i9) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i9 = str4 == null ? 50875 : 51557;
                                                        break;
                                                    case 4075:
                                                        boolean zEquals4 = C0193.f714.equals("");
                                                        int i10 = 51588;
                                                        while (true) {
                                                            i10 ^= 51605;
                                                            switch (i10) {
                                                                case 17:
                                                                    i10 = !zEquals4 ? 51681 : 51650;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    declaredField3.set(obj, new Signature[]{new Signature(C0193.f714)});
                                                                    int i11 = 51712;
                                                                    while (true) {
                                                                        i11 ^= 51729;
                                                                        switch (i11) {
                                                                            case 17:
                                                                                i11 = 51743;
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
                                            declaredField3.set(obj, C0193.f715);
                                            int i12 = 50689;
                                            while (true) {
                                                i12 ^= 50706;
                                                switch (i12) {
                                                    case 19:
                                                        i12 = 50720;
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
                                    i8 = 50627;
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
