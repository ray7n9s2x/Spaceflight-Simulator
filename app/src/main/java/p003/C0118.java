package p003;

import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟۠ۤ۟۟۟۠ۥ۟۟۟۠ۦ۟۟۟۠ۧ۟۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0118 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f594short = {927, 923, 925, 918, 927, 980, 905, 915, 919, 906, 918, 927, 980, 905, 926, 913, 905, 980, 919, 923, 916, 923, 925, 927, 980, 956, 923, 913, 927, 955, 921, 910, 915, 908, 915, 910, 899, 498, 499, 463, 504, 494, 488, 496, 504, 2676, 2677, 2570, 1493, 1497, 1499, 1491, 1430, 1503, 1496, 1430, 1502, 1497, 1497, 1501, 1513, 1409, 1409, 1412, 1413, 1513, 1520, 1495, 1501, 1491, 1527, 1493, 1474, 1503, 1472, 1503, 1474, 1487, 1430, 1497, 1496, 1508, 1491, 1477, 1475, 1499, 1491, 2056, 2067, 2101, 2109, 2098, 2109, 1686, 1681, 1668, 1687, 1681, 1698, 1668, 1672, 1664, 1620, 1548};

    public C0118() {
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
                    System.out.println(C0205.m13270("1Roky5mD1feDsMqteFmTK1I2t"));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    public static void SetStr() {
        String strM13267 = C0204.m13267(f594short, 0, 37, PointerIconCompat.TYPE_ZOOM_IN);
        boolean zM13244 = C0193.m13244(strM13267);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zM13244 ? 1678 : 1709;
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
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
        methodName = C0204.m13267(f594short, 37, 8, 413);
        methodSig = C0203.m13263(f594short, 45, 3, 2652);
    }

    public static native void backup(Object obj);

    public static void hook(Object obj) {
        C0207.m13281(f594short, 48, 39, 1462);
        C0207.m13281(f594short, 87, 6, 2154);
        backup(obj);
        try {
            boolean zEquals = obj.getClass().getName().equals(className);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (zEquals) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        Method declaredMethod = obj.getClass().getDeclaredMethod(C0207.m13281(f594short, 93, 9, 1765), new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(obj, new Object[0]);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    return;
                            }
                        }
                        break;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            String str = C0207.m13281(f594short, 102, 2, 1585) + e;
        }
    }
}
