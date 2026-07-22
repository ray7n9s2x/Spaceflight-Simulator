package p003;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢ۟ۤ۟۟ۢ۟ۥ۟۟ۢ۟ۦ۟۟ۢ۟ۧ۟۟ۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0173 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f649short = {2460, 2451, 2457, 2447, 2450, 2452, 2457, 2515, 2462, 2450, 2451, 2441, 2456, 2451, 2441, 2515, 2445, 2448, 2515, 2478, 2452, 2458, 2451, 2452, 2451, 2458, 2484, 2451, 2459, 2450, 1290, 1288, 1305, 1342, 1284, 1290, 1283, 1284, 1283, 1290, 1326, 1288, 1311, 1305, 1284, 1291, 1284, 1294, 1292, 1305, 1288, 1317, 1284, 1310, 1305, 1282, 1311, 1300, 1690, 1691, 1769, 1790, 1747, 1756, 1750, 1728, 1757, 1755, 1750, 1693, 1745, 1757, 1756, 1734, 1751, 1756, 1734, 1693, 1730, 1759, 1693, 1761, 1755, 1749, 1756, 1747, 1734, 1735, 1728, 1751, 1673, 442, 438, 436, 444, 505, 432, 439, 505, 446, 444, 429, 394, 432, 446, 439, 432, 439, 446, 410, 444, 427, 429, 432, 447, 432, 442, 440, 429, 444, 401, 432, 426, 429, 438, 427, 416, 1417, 1426, 1460, 1468, 1459, 1468, 20761, 23913, 22924, 22085, 17570, 32327, -31354, 28991, -2725, 24869, 28599, 31941, 28991, 24140, -31335, 27758, 26704, 31941, 28991, 24140, -2739, 17771, -26015, 26705, 22634, 17659, 31941, 28991, 24140, -2739, -25485, 24867, 22634, 17659, 17438, 22753, 23332, 28991, 24140, -28467, -32384, 23802, 20618, 21615, 23462, 18753, 29604, -30619, 31964, -1864, 23120, 29331, 21897, 18712, 21615, 23462, 18753, 29604, -30619, 31964};

    public C0173() {
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
                    System.out.println(Long.decode(C0205.m13270("aR")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String strM13267;
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i < 28 ? 1678 : 1709;
                    break;
                case 204:
                    strM13267 = C0204.m13267(f649short, 0, 30, 2557);
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
                    strM13267 = null;
                    break;
            }
        }
        className = strM13267;
        methodName = C0204.m13267(f649short, 30, 28, 1389);
        methodSig = C0203.m13263(f649short, 58, 33, 1714);
        int iM13266 = C0204.m13266();
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    i4 = iM13266 > 0 ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    System.out.println(Integer.decode(C0207.m13279("dY")));
                    break;
                case 47483:
                    break;
            }
            return;
        }
    }

    public static native Signature[] backup(Object obj);

    public static Signature[] hook(Object obj) {
        C0203.m13263(f649short, 91, 36, 473);
        C0204.m13267(f649short, WorkQueueKt.MASK, 6, 1515);
        Signature[] signatureArrBackup = backup(obj);
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i < 28 ? 1678 : 1709;
                    break;
                case 204:
                    SigningInfo signingInfo = C0193.f722;
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = signingInfo != obj ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                return signatureArrBackup;
                            case 500:
                                String str = C0193.f719;
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = str == null ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals = C0193.f719.equals("");
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i6 = signatureArrBackup == null ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    boolean zM13233 = C0193.m13233(signatureArrBackup[0].toByteArray(), false);
                                                                    int i7 = 49666;
                                                                    while (true) {
                                                                        i7 ^= 49683;
                                                                        switch (i7) {
                                                                            case 17:
                                                                                i7 = !zM13233 ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                C0205.m13272(f649short, 133, 41, 2625);
                                                                                return new Signature[]{new Signature(C0193.f719)};
                                                                            case 83:
                                                                                C0204.m13267(f649short, 174, 19, 1954);
                                                                                int i8 = 49790;
                                                                                while (true) {
                                                                                    i8 ^= 49807;
                                                                                    switch (i8) {
                                                                                        case 18:
                                                                                            return signatureArrBackup;
                                                                                        case 241:
                                                                                            i8 = 49821;
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
                                                        i5 = !zEquals ? 48860 : 48829;
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
                                            String str2 = C0193.f714;
                                            int i10 = 50689;
                                            while (true) {
                                                i10 ^= 50706;
                                                switch (i10) {
                                                    case 19:
                                                        i10 = str2 == null ? 50751 : 50782;
                                                        break;
                                                    case 45:
                                                        return signatureArrBackup;
                                                    case 50:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zEquals2 = C0193.f714.equals("");
                                                        int i11 = 50813;
                                                        while (true) {
                                                            i11 ^= 50830;
                                                            switch (i11) {
                                                                case 18:
                                                                    break;
                                                                case 53:
                                                                    return signatureArrBackup;
                                                                case 243:
                                                                    i11 = !zEquals2 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    return new Signature[]{new Signature(C0193.f714)};
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            return C0193.f715;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    return signatureArrBackup;
            }
        }
    }
}
