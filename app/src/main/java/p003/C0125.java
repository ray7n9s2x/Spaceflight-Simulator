package p003;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۤ۟۟۟ۥ۟۟۟ۦ۟۟۟ۧ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0125 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f601short = {2995, 3004, 2998, 2976, 3005, 3003, 2998, 3068, 2995, 2978, 2978, 3068, 2963, 3006, 2999, 2976, 2982, 2966, 3003, 2995, 3006, 3005, 2997, 2115, 2133, 2116, 2148, 2137, 2116, 2140, 2133, 2966, 3058, 3028, 3039, 3016, 3039, 2961, 3026, 3039, 3024, 3033, 2961, 3069, 3030, 3039, 3020, 3053, 3035, 3023, 3019, 3035, 3024, 3037, 3035, 2949, 2967, 3048, 2212, 2216, 2218, 2210, 2279, 2222, 2217, 2279, 2182, 2219, 2210, 2229, 2227, 2179, 2222, 2214, 2219, 2216, 2208, 2200, 2228, 2210, 2227, 2195, 2222, 2227, 2219, 2210, -2083, 907, 912, 950, 958, 945, 958, 774, 769, 769, 773, 817, 815, 770, 779, 796, 794, 810, 775, 783, 770, 769, 777, 817, 797, 779, 794, 826, 775, 794, 770, 779};

    public C0125() {
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
                    System.out.println(Integer.decode(C0203.m13264("d2BSQKUFBpZvW")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۢۨۦ";
        String strM13263 = null;
        String strM13272 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746688:
                    str = "ۧۨۤ";
                    strM13272 = C0205.m13272(sArr, 0, 23, 3026);
                    break;
                case 1746937:
                    strM13263 = C0203.m13263(sArr, 31, 27, AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
                    str = "ۢۢ۠";
                    break;
                case 1749664:
                    methodSig = strM13263;
                    str = "ۥۨۨ";
                    break;
                case 1749856:
                    str = "۟۟۠";
                    sArr = f601short;
                    break;
                case 1751497:
                    methodName = strM13267;
                    str = "ۧۨ۠";
                    break;
                case 1752741:
                    return;
                case 1753481:
                    str = "ۧۥۨ";
                    sArr = f601short;
                    break;
                case 1754655:
                    str = "۟ۧۡ";
                    sArr = f601short;
                    break;
                case 1754659:
                    className = strM13272;
                    str = "ۦۡۤ";
                    break;
                default:
                    str = "ۤ۟ۤ";
                    strM13267 = C0204.m13267(sArr, 23, 8, 2096);
                    break;
            }
        }
    }

    public static native void backup(Object obj, CharSequence charSequence);

    public static void hook(Object obj, CharSequence charSequence) {
        String str = "ۧ۟ۥ";
        StringBuilder sb = null;
        CharSequence charSequenceM13227 = null;
        short[] sArr = null;
        String strM13281 = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1746722:
                    str = "ۢۤ۠";
                    strM13281 = sb.toString();
                    break;
                case 1747656:
                    str = "ۤۨۧ";
                    sArr = f601short;
                    break;
                case 1747684:
                    str = "ۦۣۤ";
                    charSequenceM13227 = C0193.m13227(charSequence, strM13281);
                    break;
                case 1748737:
                    return;
                case 1749726:
                    str = "ۨ۠ۡ";
                    sArr = f601short;
                    break;
                case 1751561:
                    str = "ۣ۠ۧ";
                    strM13281 = C0207.m13281(sArr, 58, 29, 2247);
                    break;
                case 1751779:
                    str = "ۣ۟۠";
                    strM13281 = C0207.m13281(sArr, 87, 6, 1001);
                    break;
                case 1752733:
                    sb.append((Object) charSequence);
                    str = "۠۟ۧ";
                    break;
                case 1753573:
                    backup(obj, charSequenceM13227);
                    str = "ۣۣۡ";
                    break;
                case 1754381:
                    str = "ۤۡۦ";
                    sArr = f601short;
                    break;
                case 1755369:
                    str = "۠۠ۤ";
                    strM13281 = C0205.m13272(sArr, 93, 25, 878);
                    break;
                default:
                    sb = new StringBuilder(strM13281);
                    str = "ۥۨ۠";
                    break;
            }
        }
    }
}
