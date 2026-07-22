package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟ۤ۟۟۟۟ۤ۠۟۟۟ۤۡ۟۟۟ۤۢ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0124 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f600short = {1891, 1900, 1894, 1904, 1901, 1899, 1894, 1836, 1891, 1906, 1906, 1836, 1859, 1902, 1895, 1904, 1910, 1862, 1899, 1891, 1902, 1901, 1893, 2569, 2591, 2574, 2615, 2591, 2569, 2569, 2587, 2589, 2591, 330, 302, 264, 259, 276, 259, 333, 270, 259, 268, 261, 333, 289, 266, 259, 272, 305, 263, 275, 279, 263, 268, 257, 263, 345, 331, 308, 2705, 2717, 2719, 2711, 2770, 2715, 2716, 2770, 2739, 2718, 2711, 2688, 2694, 2742, 2715, 2707, 2718, 2717, 2709, 2733, 2689, 2711, 2694, 2751, 2711, 2689, 2689, 2707, 2709, 2711, -2584, 1476, 1503, 1529, 1521, 1534, 1521, 264, 271, 271, 267, 319, 289, 268, 261, 274, 276, 292, 265, 257, 268, 271, 263, 319, 275, 261, 276, 301, 261, 275, 275, 257, 263, 261};

    public C0124() {
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
                    System.out.println(Integer.decode(C0204.m13269("SOWHxaH")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۨۦۣ";
        String strM13263 = null;
        String strM13272 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56444:
                    return;
                case 1748707:
                    strM13263 = C0203.m13263(sArr, 33, 27, 354);
                    str = "ۧ۠ۦ";
                    break;
                case 1748711:
                    str = "ۦۦۨ";
                    sArr = f600short;
                    break;
                case 1748799:
                    methodName = strM13267;
                    str = "ۢۥۣ";
                    break;
                case 1749760:
                    str = "ۡۢۤ";
                    sArr = f600short;
                    break;
                case 1753640:
                    str = "ۡۥۣ";
                    strM13267 = C0204.m13267(sArr, 23, 10, 2682);
                    break;
                case 1754413:
                    methodSig = strM13263;
                    str = "ۤ۠";
                    break;
                case 1755371:
                    className = strM13272;
                    str = "ۡۢۨ";
                    break;
                case 1755557:
                    str = "ۦۡۦ";
                    sArr = f600short;
                    break;
                default:
                    str = "ۣۨ۠";
                    strM13272 = C0205.m13272(sArr, 0, 23, 1794);
                    break;
            }
        }
    }

    public static native void backup(Object obj, CharSequence charSequence);

    public static void hook(Object obj, CharSequence charSequence) {
        String str = "۟ۤۧ";
        CharSequence charSequenceM13227 = null;
        StringBuilder sb = null;
        short[] sArr = null;
        String strM13267 = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56289:
                    backup(obj, charSequenceM13227);
                    str = "ۡ۟ۨ";
                    break;
                case 1746850:
                    str = "ۤ۟ۡ";
                    sArr = f600short;
                    break;
                case 1748618:
                    return;
                case 1751494:
                    str = "ۣۤۤ";
                    strM13267 = C0204.m13267(sArr, 60, 31, 2802);
                    break;
                case 1751621:
                    str = "ۦۢ۠";
                    sb = new StringBuilder(strM13267);
                    break;
                case 1752646:
                    str = "ۣۨۡ";
                    strM13267 = sb.toString();
                    break;
                case 1753447:
                    str = "ۧۥۡ";
                    strM13267 = C0204.m13267(sArr, 97, 27, 352);
                    break;
                case 1753508:
                    sb.append((Object) charSequence);
                    str = "ۦۤۦ";
                    break;
                case 1753539:
                    str = "ۥۥۦ";
                    strM13267 = C0204.m13267(sArr, 91, 6, 1446);
                    break;
                case 1753576:
                    str = "ۦۣ۠";
                    sArr = f600short;
                    break;
                case 1754563:
                    charSequenceM13227 = C0193.m13227(charSequence, strM13267);
                    str = "۟۠";
                    break;
                default:
                    str = "ۦ۠ۡ";
                    sArr = f600short;
                    break;
            }
        }
    }
}
