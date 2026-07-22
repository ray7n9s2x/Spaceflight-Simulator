package p003;

import android.content.res.Resources;
import android.widget.ImageView;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢۤ۟۟۟ۢۤ۠۟۟ۢۤۡ۟۟ۢۤۢ۟۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0182 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f658short = {1627, 1620, 1630, 1608, 1621, 1619, 1630, 1556, 1613, 1619, 1630, 1629, 1631, 1614, 1556, 1651, 1623, 1627, 1629, 1631, 1644, 1619, 1631, 1613, 1358, 1368, 1353, 1396, 1360, 1372, 1370, 1368, 1391, 1368, 1358, 1362, 1352, 1359, 1374, 1368, 2766, 2735, 2767, 2736, 685, 673, 675, 683, 750, 679, 672, 750, 701, 683, 698, 647, 675, 687, 681, 683, 668, 683, 701, 673, 699, 700, 685, 683, -556, 1509, 1534, 1496, 1488, 1503, 1488, 2359, 2336, 2358, 2330, 2347, 2340, 2344, 2336, -2465, 1990, 1996, 2032, 1984, 2015, 1994, 1985, 2032, 1987, 1998, 2006, 1984, 2010, 2011, 21116, 24076, 2323, 2323, 2326, 2327, 18122, 27677, 24396, 24538, 24867, -2520, 21718, 28635, 27206};

    public C0182() {
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
                    System.out.println(Integer.parseInt(C0207.m13279("JHtB")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۟۠۠";
        String strM13281 = null;
        String strM13263 = null;
        String strM132812 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746719:
                    str = "ۣۦ۠";
                    sArr = f658short;
                    break;
                case 1748676:
                    str = "ۣۢۡ";
                    sArr = f658short;
                    break;
                case 1748764:
                    methodSig = strM132812;
                    str = "ۣۣۨ";
                    break;
                case 1750626:
                    str = "ۧۢۢ";
                    strM13263 = C0203.m13263(sArr, 24, 16, 1341);
                    break;
                case 1750749:
                    strM13281 = C0207.m13281(sArr, 0, 24, 1594);
                    str = "ۣۨ۟";
                    break;
                case 1750814:
                    return;
                case 1751740:
                    str = "ۡۤ۟";
                    strM132812 = C0207.m13281(sArr, 40, 4, 2790);
                    break;
                case 1754470:
                    str = "ۤۧ۟";
                    sArr = f658short;
                    break;
                case 1754471:
                    methodName = strM13263;
                    str = "ۧۢۡ";
                    break;
                default:
                    className = strM13281;
                    str = "ۡۡۤ";
                    break;
            }
        }
    }

    public static native void backup(Object obj, int i);

    public static void hook(Object obj, int i) {
        String str = C0207.m13281(f658short, 44, 25, 718) + i;
        C0205.m13272(f658short, 69, 6, 1415);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i <= 0 ? 1678 : 1709;
                    break;
                case 204:
                    ImageView imageView = (ImageView) obj;
                    Resources resources = imageView.getResources();
                    String strM13228 = C0193.m13228(resources, i);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = strM13228 == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str2 = C0204.m13267(f658short, 75, 9, 2373) + strM13228;
                                boolean zContains = strM13228.contains(C0205.m13272(f658short, 84, 14, 1967));
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
                                            C0203.m13263(f658short, 98, 15, 2340);
                                            imageView.setImageDrawable(C0193.m13226(resources, C0193.f692));
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
        backup(obj, i);
    }
}
