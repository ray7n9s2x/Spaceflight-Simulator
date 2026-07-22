package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.VersionedPackage;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢ۟۟۟۟ۢ۟۠۟۟ۢ۟ۡ۟۟ۢ۟ۢ۟۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0171 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f647short = {972, 963, 969, 991, 962, 964, 969, 899, 972, 989, 989, 899, 1004, 989, 989, 961, 964, 974, 972, 985, 964, 962, 963, 1021, 972, 974, 966, 972, 970, 968, 992, 972, 963, 972, 970, 968, 991, 3174, 3172, 3189, 3153, 3168, 3170, 3178, 3168, 3174, 3172, 3144, 3183, 3175, 3182, 1967, 1995, 2022, 2025, 2019, 2037, 2024, 2030, 2019, 1960, 2020, 2024, 2025, 2035, 2018, 2025, 2035, 1960, 2039, 2026, 1960, 2001, 2018, 2037, 2036, 2030, 2024, 2025, 2018, 2019, 2007, 2022, 2020, 2028, 2022, 2016, 2018, 1980, 1998, 1966, 1995, 2022, 2025, 2019, 2037, 2024, 2030, 2019, 1960, 2020, 2024, 2025, 2035, 2018, 2025, 2035, 1960, 2039, 2026, 1960, 2007, 2022, 2020, 2028, 2022, 2016, 2018, 1998, 2025, 2017, 2024, 1980, 2459, 2455, 2453, 2461, 2520, 2449, 2454, 2520, 2463, 2461, 2444, 2472, 2457, 2459, 2451, 2457, 2463, 2461, 2481, 2454, 2462, 2455, 2512, 2446, 2461, 2442, 2443, 2449, 2455, 2454, 2461, 2460, 2472, 2457, 2459, 2451, 2457, 2463, 2461, 2516, 2462, 2452, 2457, 2463, 2443, 2513, 2516, 2520, 2462, 2452, 2457, 2463, 2443, 2501, 3115, 3120, 3094, 3102, 3089, 3102, 24145, 21025, 22212, 22797, 19434, 28943, -30002, 32375, -1517, 28269, 24831, 29581, 32375, 20740, -29999, 25382, 26392, 29581, 32375, 20740, -1531, 18979, -27351, 26393, 22306, 19379, 29581, 32375, 20740, -1531, -27845, 28267, 22306, 19379, 19286, 22441, 21612, 32375, 20740, -24699, -28984, 22877, 21805, 20936, 24065, 19686, 30211, -29246, 31099, -737, 24567, 30516, 20526, 19647, 20936, 24065, 19686, 30211, -29246, 31099};

    public C0171() {
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
                    System.out.println(Integer.decode(C0203.m13264("yKTYnLxcehyCe3LjZtpkp")));
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
                    i2 = i < 26 ? 1678 : 1709;
                    break;
                case 204:
                    strM13272 = C0205.m13272(f647short, 0, 37, 941);
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
        methodName = C0207.m13281(f647short, 37, 14, 3073);
        methodSig = C0204.m13267(f647short, 51, 72, 1927);
        int iM13273 = C0205.m13273();
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    i4 = iM13273 < 0 ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    System.out.println(Float.parseFloat(C0203.m13264("AJgn8qKxVgMZaw4vUU")));
                    break;
                case 47483:
                    break;
            }
            return;
        }
    }

    public static native PackageInfo backup(Object obj, VersionedPackage versionedPackage, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0070. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0087. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00c5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x011d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0147. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0164. Please report as an issue. */
    public static PackageInfo hook(Object obj, VersionedPackage versionedPackage, int i) {
        String str = C0203.m13263(f647short, 123, 54, 2552) + i;
        C0204.m13267(f647short, 177, 6, 3145);
        PackageInfo packageInfoBackup = backup(obj, versionedPackage, i);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i != 64 ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = versionedPackage == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i4 = Build.VERSION.SDK_INT;
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = i4 < 26 ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zEquals = C0193.f713.equals(versionedPackage.getPackageName());
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        String str2 = C0193.f719;
                                                        int i7 = 48891;
                                                        while (true) {
                                                            i7 ^= 48908;
                                                            switch (i7) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i7 = str2 == null ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    boolean zEquals2 = C0193.f719.equals("");
                                                                    int i8 = 49666;
                                                                    while (true) {
                                                                        i8 ^= 49683;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = !zEquals2 ? 49759 : 49728;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                boolean zM13233 = C0193.m13233(packageInfoBackup.signatures[0].toByteArray(), false);
                                                                                int i9 = 49790;
                                                                                while (true) {
                                                                                    i9 ^= 49807;
                                                                                    switch (i9) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            C0203.m13263(f647short, 224, 19, 517);
                                                                                            int i10 = 50689;
                                                                                            while (true) {
                                                                                                i10 ^= 50706;
                                                                                                switch (i10) {
                                                                                                    case 19:
                                                                                                        i10 = 50720;
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 84:
                                                                                            C0207.m13281(f647short, 183, 41, 1289);
                                                                                            packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f719)};
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
                                                                                        case 241:
                                                                                            i9 = !zM13233 ? 49852 : 49883;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        Signature[] signatureArr = C0193.f715;
                                                        int i12 = 50813;
                                                        while (true) {
                                                            i12 ^= 50830;
                                                            switch (i12) {
                                                                case 18:
                                                                    break;
                                                                case 53:
                                                                    String str3 = C0193.f714;
                                                                    int i13 = 51712;
                                                                    while (true) {
                                                                        i13 ^= 51729;
                                                                        switch (i13) {
                                                                            case 14:
                                                                                break;
                                                                            case 17:
                                                                                i13 = str3 == null ? 51774 : 51805;
                                                                                break;
                                                                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                boolean zEquals3 = C0193.f714.equals("");
                                                                                int i14 = 51836;
                                                                                while (true) {
                                                                                    i14 ^= 51853;
                                                                                    switch (i14) {
                                                                                        case 241:
                                                                                            i14 = !zEquals3 ? 52580 : 52549;
                                                                                            break;
                                                                                        case 1963:
                                                                                            break;
                                                                                        case 1992:
                                                                                            break;
                                                                                        case 2025:
                                                                                            packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f714)};
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 243:
                                                                    i12 = signatureArr == null ? 50875 : 51557;
                                                                    break;
                                                                case 4075:
                                                                    packageInfoBackup.signatures = C0193.f715;
                                                                    int i15 = 51588;
                                                                    while (true) {
                                                                        i15 ^= 51605;
                                                                        switch (i15) {
                                                                            case 17:
                                                                                i15 = 51619;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i6 = !zEquals ? 48829 : 48860;
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
        }
        return packageInfoBackup;
    }
}
