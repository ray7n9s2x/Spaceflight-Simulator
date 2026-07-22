package p003;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۠ۡ۟۟۟۠ۡ۠۟۟۠ۡۡ۟۟۠ۡۢ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0140 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f616short = {2586, 2577, 2566, 2577, 2654, 2563, 2581, 2579, 2565, 2562, 2585, 2564, 2569, 2654, 2621, 2581, 2563, 2563, 2577, 2583, 2581, 2612, 2585, 2583, 2581, 2563, 2564, 639, 613, 595, 615, 611, 631, 634, 1097, 1082, 1059, 1082, 1059, 1096, 1083};

    public C0140() {
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
                    System.out.println(Long.decode(C0206.m13276("qx2S9eh8Fu3yWQfZg0")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۤۡ";
        String strM13272 = null;
        String strM13267 = null;
        String strM132722 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56296:
                    methodName = strM13272;
                    str = "ۢۡۢ";
                    break;
                case 56445:
                    str = "ۨۤۧ";
                    sArr = f616short;
                    break;
                case 56449:
                    return;
                case 1746719:
                    methodSig = strM13267;
                    str = "ۤۥ";
                    break;
                case 1746876:
                    className = strM132722;
                    str = "ۨۢۥ";
                    break;
                case 1749635:
                    str = "ۥۡۧ";
                    sArr = f616short;
                    break;
                case 1750533:
                    strM13272 = C0205.m13272(sArr, 27, 7, 534);
                    str = "۟ۧ";
                    break;
                case 1752523:
                    str = "۟۠۠";
                    strM13267 = C0204.m13267(sArr, 34, 7, 1121);
                    break;
                case 1755435:
                    str = "ۣ۟ۡ";
                    sArr = f616short;
                    break;
                default:
                    str = "۟ۥۢ";
                    strM132722 = C0205.m13272(sArr, 0, 27, 2672);
                    break;
            }
        }
    }

    public static native boolean backup(byte[] bArr, byte[] bArr2);

    public static boolean hook(byte[] bArr, byte[] bArr2) {
        return true;
    }
}
