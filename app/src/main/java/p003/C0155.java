package p003;

import android.content.pm.Signature;
import androidx.core.view.MotionEventCompat;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠ۨ۟۟۟۠ۨ۠۟۟۠ۨۡ۟۟۠ۨۢ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0155 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f631short = {3069, 3058, 3064, 3054, 3059, 3061, 3064, 2994, 3071, 3059, 3058, 3048, 3065, 3058, 3048, 2994, 3052, 3057, 2994, 3020, 3069, 3071, 3063, 3069, 3067, 3065, 3020, 3069, 3054, 3055, 3065, 3054, 1766, 1770, 1769, 1769, 1760, 1766, 1777, 1734, 1760, 1783, 1777, 1772, 1763, 1772, 1766, 1764, 1777, 1760, 1782, 3022, 2986, 2951, 2952, 2946, 2964, 2953, 2959, 2946, 3017, 2949, 2953, 2952, 2962, 2947, 2952, 2962, 3017, 2966, 2955, 3017, 2998, 2951, 2949, 2957, 2951, 2945, 2947, 2998, 2951, 2964, 2965, 2947, 2964, 3010, 2998, 2951, 2949, 2957, 2951, 2945, 2947, 3037, 2986, 2956, 2951, 2960, 2951, 3017, 2959, 2953, 3017, 2976, 2959, 2954, 2947, 3037, 2991, 3023, 2992, 2672, 2684, 2686, 2678, 2611, 2682, 2685, 2611, 2672, 2684, 2687, 2687, 2678, 2672, 2663, 2640, 2678, 2657, 2663, 2682, 2677, 2682, 2672, 2674, 2663, 2678, 2656, 2619, 2592, 2618, -2807, 2674, 2659, 2680, 2645, 2682, 2687, 2678, 2606, 2590, 2578, 2626, 2643, 2624, 2625, 2647, 2676, 2654, 2643, 2645, 2625, 2575, 3239, 3260, 3226, 3218, 3229, 3218, 1968, 1953, 1955, 1963, 1953, 1959, 1957, 1934, 1953, 1965, 1957, 720, 750, 724, 730, 723, 732, 713, 712, 719, 728, 718, 23933, 20749, 21992, 23073, 18630, 29219, -30238, 32091, -1729, 27969, 25555, 28833, 32091, 21032, -30211, 24586, 25652, 28833, 32091, 21032, -1751, 18703, -27131, 25653, 21518, 18591, 28833, 32091, 21032, -1751, -28649, 27975, 21518, 18591, 18554, 21637, 22336, 32091, 21032, -25431, -29212, 24114, 21058, 22183, 22894, 19337, 29036, -30035, 32276, -1424, 22680, 28763, 22337, 19408, 22183, 22894, 19337, 29036, -30035, 32276};

    public C0155() {
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
                    System.out.println(Double.parseDouble(C0205.m13270("lqgdB")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0205.m13272(f631short, 0, 32, 2972);
        methodName = C0204.m13267(f631short, 32, 19, 1669);
        methodSig = C0207.m13281(f631short, 51, 60, 3046);
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
                    System.out.println(Integer.valueOf(C0207.m13279("T0I8iKvuknMQ")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native void backup(Package r0, File file, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x012d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x015c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0187. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x01da. Please report as an issue. */
    public static void hook(Package r5, File file, int i) {
        String str = C0207.m13281(f631short, 111, 39, 2579) + file + C0207.m13281(f631short, 150, 13, 2610) + i;
        C0204.m13267(f631short, 163, 6, 3269);
        backup(r5, file, i);
        try {
            Field declaredField = r5.getClass().getDeclaredField(C0207.m13281(f631short, 169, 11, 1984));
            declaredField.setAccessible(true);
            String str2 = (String) declaredField.get(r5);
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
                        boolean zEquals = C0193.f696.equals(file.getPath());
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
                                    boolean zEquals2 = C0193.f713.equals(str2);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = !zEquals2 ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                Field declaredField2 = r5.getClass().getDeclaredField(C0203.m13263(f631short, 180, 11, 701));
                                                declaredField2.setAccessible(true);
                                                Signature[] signatureArr = (Signature[]) declaredField2.get(r5);
                                                String str3 = C0193.f719;
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            boolean zEquals3 = C0193.f719.equals("");
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i6 = !zEquals3 ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        boolean zM13233 = C0193.m13233(signatureArr[0].toByteArray(), false);
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
                                                                                    C0203.m13263(f631short, 191, 41, 1573);
                                                                                    declaredField2.set(r5, new Signature[]{new Signature(C0193.f719)});
                                                                                    int i8 = 49790;
                                                                                    while (true) {
                                                                                        i8 ^= 49807;
                                                                                        switch (i8) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 241:
                                                                                                i8 = 49821;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    C0204.m13267(f631short, 232, 19, 1386);
                                                                                    int i9 = 49914;
                                                                                    while (true) {
                                                                                        i9 ^= 49931;
                                                                                        switch (i9) {
                                                                                            case 497:
                                                                                                i9 = 50596;
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
                                                            i5 = str3 == null ? 48829 : 48860;
                                                            break;
                                                    }
                                                }
                                                Signature[] signatureArr2 = C0193.f715;
                                                int i10 = 50689;
                                                while (true) {
                                                    i10 ^= 50706;
                                                    switch (i10) {
                                                        case 19:
                                                            i10 = signatureArr2 == null ? 50751 : 50782;
                                                            break;
                                                        case 45:
                                                            String str4 = C0193.f714;
                                                            int i11 = 51588;
                                                            while (true) {
                                                                i11 ^= 51605;
                                                                switch (i11) {
                                                                    case 17:
                                                                        i11 = str4 == null ? 51650 : 51681;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        boolean zEquals4 = C0193.f714.equals("");
                                                                        int i12 = 51712;
                                                                        while (true) {
                                                                            i12 ^= 51729;
                                                                            switch (i12) {
                                                                                case 14:
                                                                                    break;
                                                                                case 17:
                                                                                    i12 = !zEquals4 ? 51805 : 51774;
                                                                                    break;
                                                                                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                    break;
                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                    declaredField2.set(r5, new Signature[]{new Signature(C0193.f714)});
                                                                                    int i13 = 51836;
                                                                                    while (true) {
                                                                                        i13 ^= 51853;
                                                                                        switch (i13) {
                                                                                            case 241:
                                                                                                i13 = 52518;
                                                                                                break;
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
                                                            break;
                                                        case 50:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            declaredField2.set(r5, C0193.f715);
                                                            int i14 = 50813;
                                                            while (true) {
                                                                i14 ^= 50830;
                                                                switch (i14) {
                                                                    case 18:
                                                                        break;
                                                                    case 243:
                                                                        i14 = 50844;
                                                                        break;
                                                                }
                                                            }
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
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
        int iM13262 = C0203.m13262();
        int i15 = 52611;
        while (true) {
            i15 ^= 52628;
            switch (i15) {
                case 23:
                    i15 = iM13262 > 0 ? 52673 : 52704;
                    break;
                case 54:
                    break;
                case 85:
                    break;
                case 116:
                    System.out.println(Float.decode(C0205.m13270("73sTh")));
                    break;
            }
            return;
        }
    }
}
