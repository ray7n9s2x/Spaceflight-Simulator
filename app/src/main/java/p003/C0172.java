package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢ۟۟۟ۢ۠۟۟ۢۡ۟۟ۢۢ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0172 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f648short = {283, 276, 286, 264, 277, 275, 286, 340, 283, 266, 266, 340, 315, 266, 266, 278, 275, 281, 283, 270, 275, 277, 276, 298, 283, 281, 273, 283, 285, 287, 311, 283, 276, 283, 285, 287, 264, 1917, 1919, 1902, 1866, 1915, 1913, 1905, 1915, 1917, 1919, 1897, 1874, 1909, 1910, 1918, 1907, 1908, 1917, 1866, 1919, 1896, 1911, 1907, 1897, 1897, 1907, 1909, 1908, 1897, 1065, 1114, 1101, 1131, 1120, 1143, 1120, 1070, 1133, 1120, 1135, 1126, 1070, 1106, 1141, 1139, 1128, 1135, 1126, 1082, 1096, 1064, 1101, 1131, 1120, 1143, 1120, 1070, 1140, 1141, 1128, 1133, 1070, 1101, 1128, 1138, 1141, 1082, 2165, 2169, 2171, 2163, 2102, 2175, 2168, 2102, 2161, 2163, 2146, 2118, 2167, 2165, 2173, 2167, 2161, 2163, 2149, 2142, 2169, 2170, 2162, 2175, 2168, 2161, 2118, 2163, 2148, 2171, 2175, 2149, 2149, 2175, 2169, 2168, 2149, 1941, 1934, 1960, 1952, 1967, 1952, 20853, 23813, 23008, 22057, 17614, 32299, -31254, 29011, -2761, 24905, 28635, 31913, 29011, 24096, -31243, 27650, 26684, 31913, 29011, 24096, -2783, 17671, -26099, 26685, 22534, 17559, 31913, 29011, 24096, -2783, -25569, 24911, 22534, 17559, 17522, 22669, 23368, 29011, 24096, -28511, -32276, 20849, 23809, 23012, 22061, 17610, 32303, -31250, 29015, -2765, 22491, 32536, 22530, 17555, 23012, 22061, 17610, 32303, -31250, 29015};

    public C0172() {
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
                    System.out.println(Long.valueOf(C0207.m13279("8wyBVPEr1wJe4")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0203.m13263(f648short, 0, 37, 378);
        methodName = C0205.m13272(f648short, 37, 29, 1818);
        methodSig = C0205.m13272(f648short, 66, 38, InputDeviceCompat.SOURCE_GAMEPAD);
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
                    System.out.println(Long.parseLong(C0207.m13279("K51BpPnCamLXVCeNc3L528F")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native List<PackageInfo> backup(Object obj, String[] strArr, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0039. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x006c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0083. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0119. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0143. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0160. Please report as an issue. */
    public static List<PackageInfo> hook(Object obj, String[] strArr, int i) {
        C0204.m13267(f648short, 104, 37, 2070);
        C0205.m13272(f648short, 141, 6, 2039);
        List<PackageInfo> listBackup = backup(obj, strArr, i);
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
                    Iterator<PackageInfo> it = listBackup.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = !zHasNext ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    PackageInfo next = it.next();
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = next == null ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean zEquals = C0193.f713.equals(next.packageName);
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            String str = C0193.f719;
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i6 = str == null ? 48953 : 49635;
                                                                        break;
                                                                    case 32495:
                                                                        boolean zEquals2 = C0193.f719.equals("");
                                                                        int i7 = 49666;
                                                                        while (true) {
                                                                            i7 ^= 49683;
                                                                            switch (i7) {
                                                                                case 17:
                                                                                    i7 = !zEquals2 ? 49759 : 49728;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                    boolean zM13233 = C0193.m13233(next.signatures[0].toByteArray(), false);
                                                                                    int i8 = 49790;
                                                                                    while (true) {
                                                                                        i8 ^= 49807;
                                                                                        switch (i8) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 51:
                                                                                                C0205.m13272(f648short, 188, 19, 2601);
                                                                                                int i9 = 50689;
                                                                                                while (true) {
                                                                                                    i9 ^= 50706;
                                                                                                    switch (i9) {
                                                                                                        case 19:
                                                                                                            i9 = 50720;
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 84:
                                                                                                C0203.m13263(f648short, 147, 41, 2605);
                                                                                                next.signatures = new Signature[]{new Signature(C0193.f719)};
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
                                                                                            case 241:
                                                                                                i8 = !zM13233 ? 49852 : 49883;
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
                                                            int i11 = 50813;
                                                            while (true) {
                                                                i11 ^= 50830;
                                                                switch (i11) {
                                                                    case 18:
                                                                        break;
                                                                    case 53:
                                                                        String str2 = C0193.f714;
                                                                        int i12 = 51712;
                                                                        while (true) {
                                                                            i12 ^= 51729;
                                                                            switch (i12) {
                                                                                case 14:
                                                                                    break;
                                                                                case 17:
                                                                                    i12 = str2 == null ? 51774 : 51805;
                                                                                    break;
                                                                                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                    break;
                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                    boolean zEquals3 = C0193.f714.equals("");
                                                                                    int i13 = 51836;
                                                                                    while (true) {
                                                                                        i13 ^= 51853;
                                                                                        switch (i13) {
                                                                                            case 241:
                                                                                                i13 = !zEquals3 ? 52580 : 52549;
                                                                                                break;
                                                                                            case 1963:
                                                                                                break;
                                                                                            case 1992:
                                                                                                break;
                                                                                            case 2025:
                                                                                                next.signatures = new Signature[]{new Signature(C0193.f714)};
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 243:
                                                                        i11 = signatureArr == null ? 50875 : 51557;
                                                                        break;
                                                                    case 4075:
                                                                        next.signatures = C0193.f715;
                                                                        int i14 = 51588;
                                                                        while (true) {
                                                                            i14 ^= 51605;
                                                                            switch (i14) {
                                                                                case 17:
                                                                                    i14 = 51619;
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
                                                            i5 = !zEquals ? 48829 : 48860;
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
                    }
                    break;
                case 239:
                    break;
            }
        }
        return listBackup;
    }
}
