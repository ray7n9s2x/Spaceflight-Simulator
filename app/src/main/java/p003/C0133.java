package p003;

import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟ۨ۟۟۟۟ۨ۠۟۟۟ۨۡ۟۟۟ۨۢ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0133 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f609short = {2974, 2971, 2960, 2961, 2973, 2944, 2967, 3036, 2971, 2973, 3036, 3003, 2973, 2992, 2944, 2971, 2966, 2965, 2967, 3053, 3058, 3047, 3052, 1834, 1870, 1896, 1891, 1908, 1891, 1837, 1902, 1891, 1900, 1893, 1837, 1873, 1910, 1904, 1899, 1900, 1893, 1849, 1867, 1835, 1870, 1896, 1891, 1908, 1891, 1837, 1899, 1901, 1837, 1860, 1899, 1902, 1895, 1862, 1895, 1905, 1889, 1904, 1899, 1906, 1910, 1901, 1904, 1849, 725, 734, 713, 734, 657, 726, 720, 657, 761, 726, 723, 730, 749, 730, 734, 731, 730, 717, 781, 849, 859, 849, 854, 839, 847, 781, 846, 843, 832, 788, 790, 781, 846, 843, 832, 835, 844, 838, 848, 845, 843, 838, 893, 848, 855, 844, 854, 843, 847, 839, 780, 849, 845};

    public C0133() {
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
                    System.out.println(Long.valueOf(C0207.m13279("TRMTzrIeyBER")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f609short, 0, 19, 3058);
        methodName = C0205.m13272(f609short, 19, 4, 2946);
        methodSig = C0205.m13272(f609short, 23, 45, 1794);
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
                    System.out.println(Float.decode(C0207.m13279("5fxodOdn475")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native FileDescriptor backup(String str, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0074. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x008a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0006. Please report as an issue. */
    public static FileDescriptor hook(String str, int i) {
        boolean z = C0193.f703;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = !z ? 1678 : 1709;
                    break;
                case 204:
                    long length = new File(str).length();
                    long length2 = new File(C0193.f711).length();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = length != length2 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zContains = Log.getStackTraceString(new Throwable()).contains(C0204.m13267(f609short, 68, 18, 703));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !zContains ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            String[] list = C0193.f695.getFilesDir().list();
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        int length3 = list.length;
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i6 = length3 <= 0 ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    str = list[0];
                                                                    int i7 = 49666;
                                                                    while (true) {
                                                                        i7 ^= 49683;
                                                                        switch (i7) {
                                                                            case 17:
                                                                                i7 = 49697;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i5 = list == null ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            str = C0207.m13281(f609short, 86, 35, 802);
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
        return backup(str, i);
    }
}
