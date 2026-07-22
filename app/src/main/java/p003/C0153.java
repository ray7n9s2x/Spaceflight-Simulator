package p003;

import java.io.File;
import java.util.zip.ZipFile;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠ۧ۟۟۟۠ۧ۠۟۟۠ۧۡ۟۟۠ۧۢ۟۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0153 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f629short = {1720, 1715, 1700, 1715, 1788, 1703, 1702, 1723, 1726, 1788, 1704, 1723, 1698, 1788, 1672, 1723, 1698, 1684, 1723, 1726, 1719, 2837, 2880, 2887, 2880, 2909, 2839, 2298, 2206, 2232, 2227, 2212, 2227, 2301, 2235, 2237, 2301, 2196, 2235, 2238, 2231, 2281, 2299, 2180};

    public C0153() {
        int iM13280 = C0207.m13280();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13280 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0204.m13269("Y50GrSRPQfT")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۢۤۢ";
        String strM13281 = null;
        String strM13263 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746913:
                    str = "ۣ۠۠";
                    strM13263 = C0203.m13263(sArr, 0, 21, 1746);
                    break;
                case 1747773:
                    className = strM13263;
                    str = "ۧۥۨ";
                    break;
                case 1748797:
                    methodSig = strM132632;
                    str = "ۤ۟ۨ";
                    break;
                case 1749728:
                    str = "۟ۦۨ";
                    sArr = f629short;
                    break;
                case 1749852:
                    str = "ۡۥۡ";
                    strM132632 = C0203.m13263(sArr, 27, 17, 2258);
                    break;
                case 1751498:
                    methodName = strM13281;
                    str = "ۥۧۥ";
                    break;
                case 1751501:
                    return;
                case 1752707:
                    str = "ۢۨۢ";
                    sArr = f629short;
                    break;
                case 1755497:
                    strM13281 = C0207.m13281(sArr, 21, 6, 2857);
                    str = "ۤ۟ۥ";
                    break;
                default:
                    str = "ۨۤۥ";
                    sArr = f629short;
                    break;
            }
        }
    }

    public static native void backup(Object obj, File file);

    public static void hook(Object obj, File file) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = obj == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zEquals = obj.getClass().getName().equals(className);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean z = C0193.f703;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !z ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zEquals2 = file.getPath().equals(C0193.f696);
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = !zEquals2 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    long length = file.length();
                                                                    long length2 = new File(C0193.f696).length();
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = length != length2 ? 49728 : 49759;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case Base64.mimeLineLength /* 76 */:
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        backup(obj, new File(C0193.f711));
                                                        boolean zContainsKey = C0151.getOrigName.containsKey(obj);
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    C0151.getOrigName.put((ZipFile) obj, file.getPath());
                                                                    break;
                                                                case 241:
                                                                    i7 = !zContainsKey ? 49883 : 49852;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = file == null ? 48829 : 48860;
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
            return;
        }
        backup(obj, file);
    }
}
