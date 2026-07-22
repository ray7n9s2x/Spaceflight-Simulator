package p003;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢ۠ۤ۟۟ۢ۠ۥ۟۟ۢ۠ۦ۟۟ۢ۠ۧ۟۟ۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0175 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f651short = {3067, 3056, 3047, 3056, 3007, 3044, 3045, 3064, 3069, 3007, 3051, 3064, 3041, 3007, 3019, 3064, 3041, 3028, 3071, 3045, 3043, 3048, 1774, 1772, 1789, 1757, 1760, 1764, 1772, 3260, 3261, 3294, 1692, 1680, 1682, 1690, 1759, 1686, 1681, 1759, 1688, 1690, 1675, 1707, 1686, 1682, 1690, 1747, 1759, 1675, 1687, 1686, 1669, 1730, 1906, 1897, 1871, 1863, 1864, 1863};

    public C0175() {
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
                    System.out.println(Long.decode(C0203.m13264("wvFU4T8xgtnWoPEAEeempKd")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0204.m13267(f651short, 0, 22, 2961);
        methodName = C0207.m13281(f651short, 22, 7, 1673);
        methodSig = C0203.m13263(f651short, 29, 3, 3220);
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
                    System.out.println(Integer.decode(C0203.m13264("lCwnLdE2CPNQRy5QP2pE5slVPXuu")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native long backup(Object obj);

    public static long hook(Object obj) {
        C0207.m13281(f651short, 54, 6, 1808);
        String str = C0204.m13267(f651short, 32, 22, 1791) + obj;
        try {
            boolean z = C0193.f702;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = !z ? 1678 : 1709;
                        break;
                    case 204:
                        ZipFile zipFile = new ZipFile(C0193.f711);
                        ZipEntry entry = zipFile.getEntry(((ZipEntry) obj).getName());
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = entry == null ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    zipFile.close();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    long jBackup = backup(entry);
                                    zipFile.close();
                                    return Long.valueOf(jBackup).longValue();
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backup(obj);
    }
}
