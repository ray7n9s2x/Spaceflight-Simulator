package p003;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟۟ۢ۟۟۟۟ۢ۠۟۟۟ۢۡ۟۟۟ۢۢ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0121 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f597short = {3074, 3086, 3084, 3151, 3090, 3080, 3087, 3078, 3085, 3076, 3151, 3084, 3086, 3077, 3151, 3085, 3086, 3072, 3077, 3076, 3091, 3151, 3092, 3080, 3151, 3116, 3072, 3080, 3087, 3104, 3074, 3093, 3080, 3095, 3080, 3093, 3096, 2195, 2194, 2239, 2190, 2201, 2205, 2184, 2201, 3122, 3158, 3195, 3188, 3198, 3176, 3189, 3187, 3198, 3125, 3189, 3177, 3125, 3160, 3183, 3188, 3198, 3190, 3199, 3105, 3123, 3148, 1876, 1880, 1882, 1874, 1815, 1886, 1881, 1815, 1887, 1880, 1880, 1884, 1896, 1872, 1887, 1896, 1914, 1878, 1886, 1881, 1910, 1876, 1859, 1886, 1857, 1886, 1859, 1870, 1815, 1880, 1881, 1908, 1861, 1874, 1878, 1859, 1874, 753, 746, 716, 708, 715, 708, 2793, 2789, 2791, 2724, 2809, 2787, 2788, 2797, 2790, 2799, 2724, 2791, 2789, 2798, 2724, 2793, 2789, 2808, 2799, 2724, 2778, 2790, 2815, 2797, 2787, 2788, 2761, 2789, 2808, 2799, 2760, 2808, 2787, 2798, 2797, 2799, 1384, 1386, 1403, 1344, 1405, 1382, 1358, 1388, 1403, 1382, 1401, 1382, 1403, 1398, 1345, 1390, 1378, 1386, 1329, 1292, 1303, 1343, 1309, 1290, 1303, 1288, 1303, 1290, 1287, 1328, 1311, 1299, 1307, -1436, 2435, 2523};

    public C0121() {
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
                    System.out.println(Long.valueOf(C0203.m13264("oKik9dF78a9LaKagJKi")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    public static void SetStr() {
        String strM13281 = C0207.m13281(f597short, 0, 37, 3169);
        boolean zM13244 = C0193.m13244(strM13281);
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
                    strM13281 = null;
                    break;
            }
        }
        className = strM13281;
        methodName = C0205.m13272(f597short, 37, 8, 2300);
        methodSig = C0204.m13267(f597short, 45, 22, 3098);
    }

    public static native void backup(Object obj, Bundle bundle);

    public static void hook(Object obj, Bundle bundle) {
        C0205.m13272(f597short, 67, 37, 1847);
        C0205.m13272(f597short, 104, 6, 659);
        backup(obj, bundle);
        try {
            Method declaredMethod = Class.forName(C0204.m13267(f597short, 110, 36, 2698)).getDeclaredMethod(C0207.m13281(f597short, 146, 18, 1295), new Class[0]);
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(obj, new Object[0]);
            String str2 = C0207.m13281(f597short, 164, 16, 1406) + str;
            Intent intent = new Intent();
            intent.setClassName((Context) obj, str);
            ((Context) obj).startActivity(intent);
            ((Activity) obj).finish();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Exception e) {
            String str3 = C0207.m13281(f597short, 180, 2, 2534) + e;
        }
    }
}
