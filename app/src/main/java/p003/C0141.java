package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۠ۡۤ۟۟۠ۡۥ۟۟۠ۡۦ۟۟۠ۡۧ۟۟۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0141 {
    public static String className;
    public static String methodName;
    public static String methodSig;
    public static int newdataSize;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f617short = {680, 679, 685, 699, 678, 672, 685, 743, 678, 698, 743, 665, 680, 699, 682, 684, 677, 3268, 3283, 3287, 3282, 3298, 3279, 3270, 3283, 3282, 3321, 3284, 3292, 3283, 3285, 3266, 2410, 2318, 2339, 2348, 2342, 2352, 2349, 2347, 2342, 2413, 2349, 2353, 2413, 2322, 2339, 2352, 2337, 2343, 2350, 2339, 2336, 2350, 2343, 2406, 2305, 2352, 2343, 2339, 2358, 2349, 2352, 2425, 2411, 2318, 2344, 2339, 2356, 2339, 2413, 2350, 2339, 2348, 2341, 2413, 2317, 2336, 2344, 2343, 2337, 2358, 2425, 3060, 3064, 3066, 3058, 2999, 3070, 3065, 2999, 3071, 3064, 3064, 3068, 3016, 3015, 3062, 3045, 3060, 3058, 3067, 3016, 3045, 3058, 3062, 3059, 3011, 3054, 3047, 3058, 3059, 3032, 3061, 3069, 3058, 3060, 3043, 3007, 22648, -29846, 28088, 3029, 3070, 3065, 3059, 3058, 3045, -25715, -32712, -30688, 22593, 28905, 24474, 25431, -28389, 3006, 3141, 3166, 3192, 3184, 3199, 3184, 24475, 21483, 22286, 22727, 18976, 28869, -29948, 32701, -1063, 28583, 24885, 29255, 32701, 20686, -29925, 25324, 26322, 29255, 32701, 20686, -1073, 19433, -27421, 26323, 22248, 19065, 29255, 32701, 20686, -1073, -27919, 28577, 22248, 19065, 19100, 22115, 21926, 32701, 20686, -25009, -28926, 24451, 21491, 22294, 22751, 19000, 28893, -29924, 32677, -1087, 22825, 29162, 22256, 19041, 22294, 22751, 19000, 28893, -29924, 32677};

    public C0141() {
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
                    System.out.println(Integer.valueOf(C0203.m13264("Qv")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
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
                    i2 = i < 23 ? 1678 : 1709;
                    break;
                case 204:
                    strM13267 = C0204.m13267(f617short, 0, 17, 713);
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
                    strM13267 = null;
                    break;
            }
        }
        className = strM13267;
        methodName = C0204.m13267(f617short, 17, 15, 3254);
        methodSig = C0207.m13281(f617short, 32, 51, 2370);
    }

    public static native <T> T backup(Object obj, Parcelable.Creator<T> creator);

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x01f7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x011f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T hook(Object obj, Parcelable.Creator<T> creator) {
        boolean z = true;
        T t = (T) backup(obj, creator);
        boolean z2 = t instanceof PackageInfo;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z2 ? 1678 : 1709;
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = creator == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zEquals = creator.equals(PackageInfo.CREATOR);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zEquals ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0203.m13263(f617short, 83, 54, 2967);
                                            C0204.m13267(f617short, 137, 6, 3111);
                                            PackageInfo packageInfo = (PackageInfo) t;
                                            Signature[] signatureArr = packageInfo.signatures;
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        int length = signatureArr.length;
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = length <= 0 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    String str = C0193.f719;
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = str == null ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                boolean zEquals2 = C0193.f719.equals("");
                                                                                int i7 = 49790;
                                                                                while (true) {
                                                                                    i7 ^= 49807;
                                                                                    switch (i7) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean zM13233 = C0193.m13233(packageInfo.signatures[0].toByteArray(), true);
                                                                                            int i8 = 49914;
                                                                                            while (true) {
                                                                                                i8 ^= 49931;
                                                                                                switch (i8) {
                                                                                                    case 497:
                                                                                                        i8 = !zM13233 ? 50627 : 50658;
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        C0204.m13267(f617short, 184, 19, 1243);
                                                                                                        int i9 = 50813;
                                                                                                        while (true) {
                                                                                                            i9 ^= 50830;
                                                                                                            switch (i9) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    i9 = 50844;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        C0204.m13267(f617short, 143, 41, 1219);
                                                                                                        packageInfo.signatures = new Signature[]{new Signature(C0193.f719)};
                                                                                                        int i10 = 50689;
                                                                                                        while (true) {
                                                                                                            i10 ^= 50706;
                                                                                                            switch (i10) {
                                                                                                                case 19:
                                                                                                                    i10 = 50720;
                                                                                                                    continue;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            i7 = !zEquals2 ? 49883 : 49852;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    Signature[] signatureArr2 = C0193.f715;
                                                                    int i11 = 51588;
                                                                    while (true) {
                                                                        i11 ^= 51605;
                                                                        switch (i11) {
                                                                            case 17:
                                                                                i11 = signatureArr2 == null ? 51650 : 51681;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                String str2 = C0193.f714;
                                                                                int i12 = 52611;
                                                                                while (true) {
                                                                                    i12 ^= 52628;
                                                                                    switch (i12) {
                                                                                        case 23:
                                                                                            i12 = str2 == null ? 52673 : 52704;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 116:
                                                                                            boolean zEquals3 = C0193.f714.equals("");
                                                                                            int i13 = 52735;
                                                                                            while (true) {
                                                                                                i13 ^= 52752;
                                                                                                switch (i13) {
                                                                                                    case 14:
                                                                                                        break;
                                                                                                    case 45:
                                                                                                        break;
                                                                                                    case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                                                                        i13 = !zEquals3 ? 53479 : 52797;
                                                                                                        break;
                                                                                                    case 7927:
                                                                                                        boolean zM132332 = C0193.m13233(packageInfo.signatures[0].toByteArray(), true);
                                                                                                        int i14 = 53510;
                                                                                                        while (true) {
                                                                                                            i14 ^= 53527;
                                                                                                            switch (i14) {
                                                                                                                case 17:
                                                                                                                    i14 = !zM132332 ? 53572 : 53603;
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case 83:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    packageInfo.signatures = new Signature[]{new Signature(C0193.f714)};
                                                                                                                    int i15 = 53634;
                                                                                                                    while (true) {
                                                                                                                        i15 ^= 53651;
                                                                                                                        switch (i15) {
                                                                                                                            case 17:
                                                                                                                                i15 = 53665;
                                                                                                                                continue;
                                                                                                                            case 50:
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
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                boolean zM132333 = C0193.m13233(packageInfo.signatures[0].toByteArray(), true);
                                                                                int i16 = 51712;
                                                                                while (true) {
                                                                                    i16 ^= 51729;
                                                                                    switch (i16) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 17:
                                                                                            i16 = !zM132333 ? 51774 : 51805;
                                                                                            break;
                                                                                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                            break;
                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                            packageInfo.signatures = C0193.f715;
                                                                                            int i17 = 51836;
                                                                                            while (true) {
                                                                                                i17 ^= 51853;
                                                                                                switch (i17) {
                                                                                                    case 241:
                                                                                                        i17 = 52518;
                                                                                                        continue;
                                                                                                    case 1963:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    z = false;
                                                                    int i18 = 53758;
                                                                    while (true) {
                                                                        i18 ^= 53775;
                                                                        switch (i18) {
                                                                            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                                                                i18 = !z ? 54471 : 54502;
                                                                                break;
                                                                            case 1703:
                                                                                break;
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                int i19 = newdataSize;
                                                                                int i20 = 54533;
                                                                                while (true) {
                                                                                    i20 ^= 54550;
                                                                                    switch (i20) {
                                                                                        case 19:
                                                                                            i20 = i19 != 0 ? 54595 : 54626;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 116:
                                                                                            Parcel parcelObtain = Parcel.obtain();
                                                                                            packageInfo.writeToParcel(parcelObtain, 0);
                                                                                            newdataSize = parcelObtain.dataSize() + 8;
                                                                                            parcelObtain.recycle();
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                ((Parcel) obj).setDataSize(newdataSize);
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = signatureArr == null ? 48829 : 48860;
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
        return t;
    }
}
