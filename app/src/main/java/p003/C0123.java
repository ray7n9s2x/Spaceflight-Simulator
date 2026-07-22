package p003;

import android.app.AlertDialog;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣ۟۟۟ۤ۟۟۟ۥۣ۟۟۟ۦۣۣ۟۟۟ۧ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0123 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f599short = {3000, 2999, 3005, 2987, 2998, 2992, 3005, 3063, 3000, 2985, 2985, 3063, 2968, 2997, 3004, 2987, 2989, 2973, 2992, 3000, 2997, 2998, 3006, 3069, 2971, 2988, 2992, 2997, 3005, 3004, 2987, 2050, 2068, 2053, 2085, 2072, 2053, 2077, 2068, 745, 653, 683, 672, 695, 672, 750, 685, 672, 687, 678, 750, 642, 681, 672, 691, 658, 676, 688, 692, 676, 687, 674, 676, 762, 744, 653, 672, 687, 677, 691, 686, 680, 677, 750, 672, 689, 689, 750, 640, 685, 676, 691, 693, 645, 680, 672, 685, 686, 678, 741, 643, 692, 680, 685, 677, 676, 691, 762, 745, 741, 743, 751, 682, 739, 740, 682, 715, 742, 751, 760, 766, 718, 739, 747, 742, 741, 749, 676, 712, 767, 739, 742, 750, 751, 760, 725, 761, 751, 766, 734, 739, 766, 742, 751, -624, 3075, 3096, 3134, 3126, 3129, 3126, 1910, 1905, 1905, 1909, 1857, 1887, 1906, 1915, 1900, 1898, 1882, 1911, 1919, 1906, 1905, 1913, 1857, 1884, 1899, 1911, 1906, 1914, 1915, 1900, 1857, 1901, 1915, 1898, 1866, 1911, 1898, 1906, 1915};

    public C0123() {
        int iM13266 = C0204.m13266();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13266 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(C0203.m13264("iTDIz1l4f3mzfJb5cYT"));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        className = C0205.m13272(f599short, 0, 31, 3033);
        methodName = C0203.m13263(f599short, 31, 8, 2161);
        methodSig = C0205.m13272(f599short, 39, 59, 705);
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
                    System.out.println(Float.valueOf(C0207.m13279("2ztZHFAFYeSX2Obvgt1dKyf")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static native AlertDialog.Builder backup(Object obj, CharSequence charSequence);

    public static AlertDialog.Builder hook(Object obj, CharSequence charSequence) {
        String str = "ۧۡ";
        StringBuilder sb = null;
        CharSequence charSequenceM13227 = null;
        AlertDialog.Builder builderBackup = null;
        short[] sArr = null;
        String strM13281 = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56538:
                    str = "ۡۤ۠";
                    sArr = f599short;
                    break;
                case 1747686:
                    str = "ۥۨ۟";
                    strM13281 = sb.toString();
                    break;
                case 1747714:
                    sb = new StringBuilder(strM13281);
                    str = "ۥۦۡ";
                    break;
                case 1748765:
                    str = "ۣ۠ۡ";
                    strM13281 = C0204.m13267(sArr, 98, 37, 650);
                    break;
                case 1748804:
                    str = "ۥۤۡ";
                    sArr = f599short;
                    break;
                case 1749574:
                    str = "ۨۥۨ";
                    builderBackup = backup(obj, charSequenceM13227);
                    break;
                case 1749765:
                    str = "ۣۢ۟";
                    charSequenceM13227 = C0193.m13227(charSequence, strM13281);
                    break;
                case 1752552:
                    str = "ۢۥۨ";
                    strM13281 = C0207.m13281(sArr, 141, 33, 1822);
                    break;
                case 1752610:
                    str = "۠۠ۦ";
                    strM13281 = C0207.m13281(sArr, 135, 6, 3169);
                    break;
                case 1752672:
                    sb.append((Object) charSequence);
                    str = "ۡۥۨ";
                    break;
                case 1752732:
                    str = "ۥۢۥ";
                    sArr = f599short;
                    break;
                default:
                    return builderBackup;
            }
        }
    }
}
