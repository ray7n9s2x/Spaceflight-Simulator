package p003;

import android.app.AlertDialog;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۢۤ۟۟۟ۢۥ۟۟۟ۢۦ۟۟۟ۢۧ۟۟۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0122 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f598short = {2255, 2240, 2250, 2268, 2241, 2247, 2250, 2176, 2255, 2270, 2270, 2176, 2287, 2242, 2251, 2268, 2266, 2282, 2247, 2255, 2242, 2241, 2249, 2186, 2284, 2267, 2247, 2242, 2250, 2251, 2268, 535, 513, 528, 553, 513, 535, 535, 517, 515, 513, 1265, 1173, 1203, 1208, 1199, 1208, 1270, 1205, 1208, 1207, 1214, 1270, 1178, 1201, 1208, 1195, 1162, 1212, 1192, 1196, 1212, 1207, 1210, 1212, 1250, 1264, 1173, 1208, 1207, 1213, 1195, 1206, 1200, 1213, 1270, 1208, 1193, 1193, 1270, 1176, 1205, 1212, 1195, 1197, 1181, 1200, 1208, 1205, 1206, 1214, 1277, 1179, 1196, 1200, 1205, 1213, 1212, 1195, 1250, 2611, 2623, 2621, 2613, 2672, 2617, 2622, 2672, 2577, 2620, 2613, 2594, 2596, 2580, 2617, 2609, 2620, 2623, 2615, 2686, 2578, 2597, 2617, 2620, 2612, 2613, 2594, 2575, 2595, 2613, 2596, 2589, 2613, 2595, 2595, 2609, 2615, 2613, -2742, 2963, 2952, 2990, 2982, 2985, 2982, 735, 728, 728, 732, 744, 758, 731, 722, 709, 707, 755, 734, 726, 731, 728, 720, 744, 757, 706, 734, 731, 723, 722, 709, 744, 708, 722, 707, 762, 722, 708, 708, 726, 720, 722};

    public C0122() {
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
                    System.out.println(Integer.decode(C0204.m13269("7R4cgnOuvg0rT5")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۥۧۥ";
        String strM13281 = null;
        String strM13263 = null;
        String strM13267 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1749577:
                    str = "ۢۦۤ";
                    strM13267 = C0204.m13267(sArr, 31, 10, 612);
                    break;
                case 1749792:
                    methodName = strM13267;
                    str = "ۨ۠ۤ";
                    break;
                case 1751556:
                    strM13281 = C0207.m13281(sArr, 0, 31, 2222);
                    str = "ۨۥۦ";
                    break;
                case 1751654:
                    str = "ۣۧۡ";
                    strM13263 = C0203.m13263(sArr, 41, 59, 1241);
                    break;
                case 1752551:
                    return;
                case 1752707:
                    str = "ۤۡۡ";
                    sArr = f598short;
                    break;
                case 1753667:
                    str = "ۢ۟ۦ";
                    sArr = f598short;
                    break;
                case 1754441:
                    methodSig = strM13263;
                    str = "ۥۢۤ";
                    break;
                case 1755372:
                    str = "ۤۤۦ";
                    sArr = f598short;
                    break;
                default:
                    className = strM13281;
                    str = "ۦۧۤ";
                    break;
            }
        }
    }

    public static native AlertDialog.Builder backup(Object obj, CharSequence charSequence);

    public static AlertDialog.Builder hook(Object obj, CharSequence charSequence) {
        String str = "ۤۢۤ";
        AlertDialog.Builder builderBackup = null;
        StringBuilder sb = null;
        CharSequence charSequenceM13227 = null;
        short[] sArr = null;
        String strM13267 = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56413:
                    sb.append((Object) charSequence);
                    str = "ۦۣ۠";
                    break;
                case 1746975:
                    str = "ۡۧۨ";
                    strM13267 = C0205.m13272(sArr, 100, 39, 2640);
                    break;
                case 1748611:
                    str = "ۦ۠ۨ";
                    strM13267 = C0207.m13281(sArr, 139, 6, 3057);
                    break;
                case 1748735:
                    str = "ۥۥۦ";
                    charSequenceM13227 = C0193.m13227(charSequence, strM13267);
                    break;
                case 1748866:
                    str = "ۣ۠";
                    sb = new StringBuilder(strM13267);
                    break;
                case 1751590:
                    str = "۟ۨۨ";
                    sArr = f598short;
                    break;
                case 1751620:
                    str = "ۧۡ۠";
                    sArr = f598short;
                    break;
                case 1752646:
                    builderBackup = backup(obj, charSequenceM13227);
                    str = "۟۟ۨ";
                    break;
                case 1753449:
                    str = "ۡ۟ۡ";
                    sArr = f598short;
                    break;
                case 1753454:
                    str = "ۣۣۤ";
                    strM13267 = sb.toString();
                    break;
                case 1754438:
                    str = "ۣۡۡ";
                    strM13267 = C0204.m13267(sArr, 145, 35, 695);
                    break;
                default:
                    return builderBackup;
            }
        }
    }
}
