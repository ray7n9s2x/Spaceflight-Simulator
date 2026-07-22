package p003;

import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟۠۟ۡ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0117 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f593short = {2355, 2367, 2365, 2430, 2358, 2361, 2342, 2357, 2336, 2364, 2353, 2345, 2430, 2365, 2367, 2356, 2430, 2306, 2333, 2307, 2430, 2361, 2366, 2340, 2357, 2338, 2366, 2353, 2364, 2430, 2332, 2367, 2359, 2367, 2306, 2333, 2307, 2600, 2579, 2580, 2572, 2910, 2874, 2844, 2839, 2816, 2839, 2905, 2819, 2818, 2847, 2842, 2905, 2837, 2841, 2840, 2837, 2819, 2820, 2820, 2835, 2840, 2818, 2905, 2853, 2835, 2843, 2839, 2822, 2846, 2841, 2820, 2835, 2893, 2874, 2844, 2839, 2816, 2839, 2905, 2842, 2839, 2840, 2833, 2905, 2853, 2818, 2820, 2847, 2840, 2833, 2893, 2861, 2868, 2879, 2879, 2860, 2911, 2848, 1556, 1551, 1577, 1569, 1582, 1569, 769, 781, 783, 775, 834, 779, 780, 834, 814, 781, 773, 781, 816, 815, 817, 829, 817, 778, 781, 789};

    public C0117() {
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
                    System.out.println(Float.valueOf(C0204.m13269("yAt")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "ۣۣ۟";
        String strM13281 = null;
        String strM13263 = null;
        String strM13272 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56452:
                    className = strM13263;
                    str = "۠ۢۧ";
                    break;
                case 1747749:
                    str = "ۣ۠ۡ";
                    sArr = f593short;
                    break;
                case 1747774:
                    str = "ۨۦ۠";
                    strM13272 = C0205.m13272(sArr, 37, 4, 2683);
                    break;
                case 1747904:
                    strM13281 = C0207.m13281(sArr, 41, 58, 2934);
                    str = "ۣۡ۟";
                    break;
                case 1748613:
                    methodSig = strM13281;
                    str = "ۨۤۢ";
                    break;
                case 1748893:
                    str = "ۤۨ";
                    strM13263 = C0203.m13263(sArr, 0, 37, 2384);
                    break;
                case 1750535:
                    str = "ۡۨۤ";
                    sArr = f593short;
                    break;
                case 1755494:
                    return;
                case 1755554:
                    methodName = strM13272;
                    str = "ۨ۠ۡ";
                    break;
                default:
                    str = "۠ۧۧ";
                    sArr = f593short;
                    break;
            }
        }
    }

    public static native void backup(Semaphore semaphore, String str, byte[] bArr, int i, int i2, boolean z);

    public static void hook(Semaphore semaphore, String str, byte[] bArr, int i, int i2, boolean z) {
        short[] sArr = null;
        String str2 = "ۣۣۤ";
        while (true) {
            switch (C0203.m13265(str2)) {
                case 1747805:
                    C0205.m13272(sArr, LocationRequest.PRIORITY_NO_POWER, 20, 866);
                    str2 = "ۧۥ۟";
                    break;
                case 1751620:
                    sArr = f593short;
                    str2 = "ۧ۟ۤ";
                    break;
                case 1754380:
                    C0207.m13281(sArr, 99, 6, 1654);
                    str2 = "۠ۥۤ";
                    break;
                case 1754561:
                    return;
                default:
                    sArr = f593short;
                    str2 = "۠ۤۡ";
                    break;
            }
        }
    }
}
