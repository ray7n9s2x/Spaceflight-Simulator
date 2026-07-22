package p003;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import java.io.File;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۡۧ۟۟۟ۡۧ۠۟۟ۡۧۡ۟۟ۡۧۢ۟۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0167 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f643short = {3197, 3186, 3192, 3182, 3187, 3189, 3192, 3122, 3199, 3187, 3186, 3176, 3193, 3186, 3176, 3122, 3180, 3185, 3122, 3148, 3197, 3199, 3191, 3197, 3195, 3193, 3153, 3197, 3186, 3197, 3195, 3193, 3182, 481, 494, 484, 498, 495, 489, 484, 430, 481, 496, 496, 430, 449, 496, 496, 492, 489, 483, 481, 500, 489, 495, 494, 464, 481, 483, 491, 481, 487, 485, 461, 481, 494, 481, 487, 485, 498, 2903, 2901, 2884, 2912, 2897, 2899, 2907, 2897, 2903, 2901, 2929, 2882, 2899, 2904, 2905, 2886, 2901, 2937, 2910, 2902, 2911, 1592, 1628, 1658, 1649, 1638, 1649, 1599, 1660, 1649, 1662, 1655, 1599, 1603, 1636, 1634, 1657, 1662, 1655, 1579, 1625, 1593, 1628, 1649, 1662, 1652, 1634, 1663, 1657, 1652, 1599, 1651, 1663, 1662, 1636, 1653, 1662, 1636, 1599, 1632, 1661, 1599, 1600, 1649, 1651, 1659, 1649, 1655, 1653, 1625, 1662, 1654, 1663, 1579, 2267, 2263, 2261, 2269, 2200, 2257, 2262, 2200, 2271, 2269, 2252, 2280, 2265, 2267, 2259, 2265, 2271, 2269, 2297, 2250, 2267, 2256, 2257, 2254, 2269, 2289, 2262, 2270, 2263, 2196, 2200, 2265, 2250, 2267, 2256, 2257, 2254, 2269, 2302, 2257, 2260, 2269, 2280, 2265, 2252, 2256, 2181, 1202, 1214, 1272, 1266, 1279, 1273, 1261, 1187, 1347, 1368, 1406, 1398, 1401, 1398, 24148, 21028, 22209, 22792, 19439, 28938, -30005, 32370, -1514, 28264, 24826, 29576, 32370, 20737, -29996, 25379, 26397, 29576, 32370, 20737, -1536, 18982, -27348, 26396, 22311, 19382, 29576, 32370, 20737, -1536, -27842, 28270, 22311, 19382, 19283, 22444, 21609, 32370, 20737, -24704, -28979, 24281, 21161, 22092, 22917, 19298, 29063, -30138, 32511, -1381, 22643, 28848, 22442, 19259, 22092, 22917, 19298, 29063, -30138, 32511};

    public C0167() {
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
                    System.out.println(Float.decode(C0205.m13270("6lHdp0knzVIqRV")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static void SetStr() {
        String strM13263;
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i > 30 ? 1678 : 1709;
                    break;
                case 204:
                    strM13263 = C0205.m13272(f643short, 0, 33, 3100);
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
                    strM13263 = C0203.m13263(f643short, 33, 37, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP);
                    break;
            }
        }
        className = strM13263;
        methodName = C0205.m13272(f643short, 70, 21, 2864);
        methodSig = C0207.m13281(f643short, 91, 53, 1552);
    }

    public static native PackageInfo backup(Object obj, String str, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x008e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00e5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x013d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0184. Please report as an issue. */
    public static PackageInfo hook(Object obj, String str, int i) {
        String str2 = C0203.m13263(f643short, 144, 47, 2232) + str + C0207.m13281(f643short, 191, 8, 1182) + i;
        C0207.m13281(f643short, 199, 6, 1313);
        PackageInfo packageInfoBackup = backup(obj, str, i);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = packageInfoBackup == null ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = i != 64 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zEquals = C0193.f696.equals(str);
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !zEquals ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            long length = new File(C0193.f696).length();
                                            long length2 = new File(str).length();
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        break;
                                                    case 239:
                                                        i5 = length != length2 ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                String str3 = C0193.f719;
                                int i6 = 48891;
                                while (true) {
                                    i6 ^= 48908;
                                    switch (i6) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i6 = str3 == null ? 48953 : 49635;
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
                                                        boolean zM13233 = C0193.m13233(packageInfoBackup.signatures[0].toByteArray(), false);
                                                        int i8 = 49790;
                                                        while (true) {
                                                            i8 ^= 49807;
                                                            switch (i8) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    C0205.m13272(f643short, 246, 19, 1409);
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
                                                                    C0207.m13281(f643short, 205, 41, 1292);
                                                                    packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f719)};
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
                                            String str4 = C0193.f714;
                                            int i12 = 51712;
                                            while (true) {
                                                i12 ^= 51729;
                                                switch (i12) {
                                                    case 14:
                                                        break;
                                                    case 17:
                                                        i12 = str4 == null ? 51774 : 51805;
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
                                                                    packageInfoBackup.signatures = new Signature[]{new Signature(C0193.f714)};
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
                                            packageInfoBackup.signatures = C0193.f715;
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
