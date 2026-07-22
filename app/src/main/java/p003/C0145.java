package p003;

import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣۣ۟۟۠ۤ۟۟۠ۥۣ۟۟۠ۦۣۣ۟۟۠ۧ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0145 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f621short = {2620, 2611, 2617, 2607, 2610, 2612, 2617, 2675, 2602, 2612, 2617, 2618, 2616, 2601, 2675, 2569, 2616, 2597, 2601, 2571, 2612, 2616, 2602, 3070, 3068, 3053, 3021, 3068, 3041, 3053, 2222, 2223, 2250, 2284, 2279, 2288, 2279, 2217, 2282, 2279, 2280, 2273, 2217, 2245, 2286, 2279, 2292, 2261, 2275, 2295, 2291, 2275, 2280, 2277, 2275, 2237, 1856, 1863, 1863, 1859, 1911, 1916, 1869, 1872, 1884, 1918, 1857, 1869, 1887, 1911, 1871, 1869, 1884, 1916, 1869, 1872, 1884};

    public C0145() {
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
                    System.out.println(Double.decode(C0206.m13276("uY6TIdjkrQ02")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۡۢ";
        String strM13263 = null;
        String strM132632 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746873:
                    methodSig = strM132632;
                    str = "۟ۧۤ";
                    break;
                case 1746940:
                    return;
                case 1747868:
                    str = "ۨۡۤ";
                    sArr = f621short;
                    break;
                case 1748857:
                    str = "۟ۥ۟";
                    strM132632 = C0203.m13263(sArr, 30, 26, 2182);
                    break;
                case 1748896:
                    className = strM13267;
                    str = "۠ۦۢ";
                    break;
                case 1750596:
                    str = "ۧ۠ۥ";
                    sArr = f621short;
                    break;
                case 1752671:
                    str = "ۡۧ۟";
                    sArr = f621short;
                    break;
                case 1753577:
                    methodName = strM13263;
                    str = "ۥۦ۠";
                    break;
                case 1754412:
                    str = "ۡۨۧ";
                    strM13267 = C0204.m13267(sArr, 0, 23, 2653);
                    break;
                default:
                    strM13263 = C0203.m13263(sArr, 23, 7, 2969);
                    str = "ۦۤۧ";
                    break;
            }
        }
    }

    public static native CharSequence backup(Object obj);

    public static CharSequence hook(Object obj) {
        CharSequence charSequenceBackup = backup(obj);
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceBackup);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zIsEmpty ? 1709 : 1678;
                    break;
                case 204:
                    CharSequence charSequenceM13227 = C0193.m13227(charSequenceBackup, C0205.m13272(f621short, 56, 21, 1832));
                    boolean zEquals = charSequenceBackup.equals(charSequenceM13227);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zEquals ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                ((TextView) obj).setText(charSequenceM13227);
                                return charSequenceM13227;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return charSequenceBackup;
    }
}
