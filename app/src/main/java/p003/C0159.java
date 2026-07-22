package p003;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۡ۟ۤ۟۟ۡ۟ۥ۟۟ۡ۟ۦ۟۟ۡ۟ۧ۟۟ۡ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0159 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f635short = {2863, 2848, 2858, 2876, 2849, 2855, 2858, 2912, 2861, 2849, 2848, 2874, 2859, 2848, 2874, 2912, 2878, 2851, 2912, 2845, 2855, 2857, 2848, 2855, 2848, 2857, 2823, 2848, 2856, 2849, 2243, 2241, 2256, 2277, 2260, 2255, 2279, 2251, 2250, 2256, 2241, 2250, 2256, 2263, 2295, 2253, 2243, 2250, 2241, 2262, 2263, 2889, 2888, 2874, 2861, 2816, 2831, 2821, 2835, 2830, 2824, 2821, 2894, 2818, 2830, 2831, 2837, 2820, 2831, 2837, 2894, 2833, 2828, 2894, 2866, 2824, 2822, 2831, 2816, 2837, 2836, 2835, 2820, 2906, 1099, 1095, 1093, 1101, 1032, 1089, 1094, 1032, 1103, 1101, 1116, 1129, 1112, 1091, 1131, 1095, 1094, 1116, 1101, 1094, 1116, 1115, 1147, 1089, 1103, 1094, 1101, 1114, 1115, 442, 417, 391, 399, 384, 399, 22603, 21563, 20702, 24343, 19952, 30485, -29484, 30829, -1015, 26743, 26341, 30103, 30829, 22302, -29493, 25916, 24834, 30103, 30829, 22302, -993, 19513, -27853, 24835, 20792, 19881, 30103, 30829, 22302, -993, -27359, 26737, 20792, 19881, 19788, 20915, 21110, 30829, 22302, -26209, -30510, 22646, 21510, 20707, 24362, 19917, 30504, -29463, 30800, -972, 24284, 30239, 20741, 19860, 20707, 24362, 19917, 30504, -29463, 30800};

    public C0159() {
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
                    System.out.println(Integer.decode(C0206.m13276("pKkj")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static void SetStr() {
        String strM13281;
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
                    strM13281 = C0207.m13281(f635short, 0, 30, 2894);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM13281 = null;
                    break;
            }
        }
        className = strM13281;
        methodName = C0205.m13272(f635short, 30, 21, 2212);
        methodSig = C0205.m13272(f635short, 51, 33, 2913);
    }

    public static native Signature[] backup(Object obj);

    public static Signature[] hook(Object obj) {
        C0204.m13267(f635short, 84, 29, 1064);
        C0207.m13281(f635short, 113, 6, 472);
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
                                                                                C0203.m13263(f635short, 119, 41, 787);
                                                                                return new Signature[]{new Signature(C0193.f719)};
                                                                            case 83:
                                                                                C0203.m13263(f635short, 160, 19, 814);
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
