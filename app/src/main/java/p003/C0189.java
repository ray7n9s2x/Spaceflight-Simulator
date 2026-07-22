package p003;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.core.view.InputDeviceCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.ۣ۟۟ۢۧ۟۟۟ۢۧ۠۟۟ۢۧۡ۟۟ۢۧۢ۟۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0189 {

    /* JADX INFO: renamed from: ۟۟۟ۥۤ۟۟۟ۥۥ۟۟۟ۥۦ۟۟۟ۥۧ۟۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Application f667;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f666short = {2549, 2546, 2557, 2540, 2540, 2482, 2547, 2542, 2549, 2555, 2499, 2525, 2540, 2540, 2544, 2549, 2559, 2557, 2536, 2549, 2547, 2546, 1809, 1845, 1810, 1813, 1800, 1813, 1821, 1808, 1853, 1804, 1804, 1808, 1813, 1823, 1821, 1800, 1813, 1811, 1810, 1013, 1018, 1008, 998, 1019, 1021, 1008, 954, 1013, 996, 996, 954, 981, 1015, 992, 1021, 994, 1021, 992, 1005, 960, 1020, 998, 1009, 1013, 1008, 944, 981, 996, 996, 982, 1021, 1018, 1008, 976, 1013, 992, 1013, 2198, 2189, 2219, 2211, 2220, 2211, 817, 830, 820, 802, 831, 825, 820, 894, 817, 800, 800, 894, 785, 819, 804, 825, 806, 825, 804, 809, 772, 824, 802, 821, 817, 820, 1308, 1299, 1305, 1295, 1298, 1300, 1305, 1363, 1308, 1293, 1293, 1363, 1329, 1298, 1308, 1305, 1304, 1305, 1340, 1293, 1302, 2347, 2326, 2343, 2341, 2349, 2343, 2337, 2339, 2357, 2213, 2185, 2232, 2232, 2212, 2209, 2219, 2217, 2236, 2209, 2215, 2214, 2177, 2214, 2222, 2215, 1377, 1357, 1404, 1404, 1352, 1381, 1406, 272, 303, 280, 270, 313, 276, 271, 962, 965, 965, 961, 1013, 991, 985, 975, 1013, 992, 971, 988, 971, -28057, 22576, 22459, 942, 952, 959, 959, 936, 931, 953, 908, 942, 953, 932, 955, 932, 953, 948, 921, 933, 959, 936, 940, 937, 2167, 2136, 2165, 2159, 2164, 2174, 2139, 2154, 2154, 2166, 2163, 2169, 2171, 2158, 2163, 2165, 2164, 760, 767, 759, 766, 1902, 1858, 1907, 1907, 1903, 1898, 1888, 1890, 1911, 1898, 1900, 1901, 3047, 3019, 3046, 3046, 3019, 3066, 3066, 3046, 3043, 3049, 3051, 3070, 3043, 3045, 3044, 3065, 589, 604, 604, 613, 578, 586, 579, 2868, 2872, 2866, 2876, 2840, 2857, 2857, 2869, 2864, 2874, 2872, 2861, 2864, 2870, 2871, 19505, -29763, 21780, 605, 584, 584, 605, 607, 596, 638, 605, 591, 601, 639, 595, 594, 584, 601, 580, 584, -27664, 19740, 584, 596, 597, 591, -29189, 25945, -720, -29763, 19740, 606, 605, 591, 601, 18089, 18171, -32393, 24542, 2201, 2200, 2229, 2180, 2195, 2199, 2178, 2195, -26310, 18390, 2178, 2206, 2207, 2181, 27360, 2178, 2206, 2207, 2181, 2264, 2193, 2195, 2178, 2231, 2182, 2182, 2202, 2207, 2197, 2199, 2178, 2207, 2201, 2200, 2229, 2201, 2200, 2178, 2195, 2190, 2178, 2270, 2271, -30927, 28563, -2054, -32393, 18390, 2178, 2206, 2207, 2181, 2264, 2193, 2195, 2178, 2228, 2199, 2181, 2195, 2229, 2201, 2200, 2178, 2195, 2190, 2178, 2270, 2271, 2268, 2259, 2265, 2255, 2258, 2260, 2265, 2195, 2268, 2253, 2253, 2195, 2300, 2270, 2249, 2260, 2251, 2260, 2249, 2244, 2281, 2261, 2255, 2264, 2268, 2265, 2794, 2812, 2811, 2811, 2796, 2791, 2813, 2760, 2794, 2813, 2784, 2815, 2784, 2813, 2800, 2781, 2785, 2811, 2796, 2792, 2797, 1845, 1818, 1847, 1837, 1846, 1852, 1817, 1832, 1832, 1844, 1841, 1851, 1849, 1836, 1841, 1847, 1846, 1745, 1750, 1758, 1751, 1306, 1301, 1311, 1289, 1300, 1298, 1311, 1365, 1306, 1291, 1291, 1365, 1336, 1300, 1301, 1295, 1310, 1283, 1295, 1330, 1302, 1291, 1303, 1611, 1626, 1613, 1609, 1628, 1613, 1641, 1624, 1624, 1643, 1607, 1606, 1628, 1613, 1616, 1628, 2372, 2389, 2391, 2399, 2389, 2387, 2385, 2429, 2394, 2386, 2395, 2427, 2390, 2398, 2324, 23289, 21808, 22792, 29518, 2767, 2755, 2763, 2764, 2806, 2762, 2768, 2759, 2755, 2758, 2797, 2752, 2760, 2690, 22895, 22182, 23198, 28888, 928, 911, 930, 952, 931, 937, 908, 957, 957, 929, 932, 942, 940, 953, 932, 930, 931, 898, 943, 935, 1005, 20480, 24521, 21489, 31159, 2211, 2232, 2206, 2198, 2201, 2198, 1192, 1209, 1209, 1174, 1209, 1211, 1190, 1194, 1196, 1210, 1210, 30245, 32258, -29934, 32450, 19172, 24873, 26652, -30850, 23390, 1162, 1190, 1191, 1213, 1196, 1201, 1213, 1877, 1882, 1872, 1862, 1883, 1885, 1872, 1818, 1877, 1860, 1860, 1818, 1909, 1879, 1856, 1885, 1858, 1885, 1856, 1869, 1888, 1884, 1862, 1873, 1877, 1872, 3026, 3042, 3028, 3027, 3027, 3012, 3023, 3029, 3040, 3010, 3029, 3016, 3031, 3016, 3029, 3032, 3061, 3017, 3027, 3012, 3008, 3013};

    /* JADX INFO: renamed from: ۟۟۟ۦ۟۟۟۟ۦ۠۟۟۟ۦۡ۟۟۟ۦۢ۟۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String f668 = C0204.m13267(f666short, 0, 22, 2460);

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m13214(Object obj, String str) throws IllegalAccessException, NoSuchFieldException {
        String str2 = "۠ۧ";
        Object obj2 = null;
        Field declaredField = null;
        Class<?> cls = null;
        while (true) {
            switch (C0203.m13265(str2)) {
                case 56327:
                    str2 = "ۧۦۢ";
                    cls = obj.getClass();
                    break;
                case 1748614:
                    return obj2;
                case 1754445:
                    declaredField.setAccessible(true);
                    str2 = "۟ۧۡ";
                    break;
                case 1754595:
                    str2 = "ۧۡۧ";
                    declaredField = cls.getDeclaredField(str);
                    break;
                default:
                    obj2 = declaredField.get(obj);
                    str2 = "ۡ۟ۤ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m13215(String str, Object obj, String str2) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        String str3 = "ۧۥۨ";
        Object obj2 = null;
        Field declaredField = null;
        Class<?> cls = null;
        while (true) {
            switch (C0203.m13265(str3)) {
                case 1750596:
                    str3 = "ۧۨۨ";
                    declaredField = cls.getDeclaredField(str2);
                    break;
                case 1750811:
                    obj2 = declaredField.get(obj);
                    str3 = "ۣۨۤ";
                    break;
                case 1754663:
                    declaredField.setAccessible(true);
                    str3 = "ۣۨ۠";
                    break;
                case 1755465:
                    return obj2;
                default:
                    str3 = "ۣۡۢ";
                    cls = Class.forName(str);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m13216(String str, String str2, Object obj, Class[] clsArr, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        String str3 = "ۧۤۢ";
        Class<?> cls = null;
        Method method = null;
        Object objInvoke = null;
        while (true) {
            switch (C0203.m13265(str3)) {
                case 1747839:
                    str3 = "ۤۢۨ";
                    method = cls.getMethod(str2, clsArr);
                    break;
                case 1750565:
                    return objInvoke;
                case 1754533:
                    cls = Class.forName(str);
                    str3 = "۠ۥۤ";
                    break;
                default:
                    str3 = "ۣ۠ۢ";
                    objInvoke = method.invoke(obj, objArr);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m13217(String str, String str2, Class[] clsArr, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        String str3 = "ۣۡ۟";
        Class<?> cls = null;
        Object objInvoke = null;
        Method method = null;
        while (true) {
            switch (C0203.m13265(str3)) {
                case 1747746:
                    method = cls.getMethod(str2, clsArr);
                    str3 = "ۦۨۥ";
                    break;
                case 1748769:
                    return objInvoke;
                case 1753699:
                    objInvoke = method.invoke(null, objArr);
                    str3 = "ۡۤۤ";
                    break;
                default:
                    cls = Class.forName(str);
                    str3 = "۠ۢۤ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13218(Context context, String str, boolean z) {
        String strM13281;
        String strM132812 = C0207.m13281(f666short, 22, 19, 1916);
        String strM13272 = C0205.m13272(f666short, 41, 38, 916);
        C0205.m13272(f666short, 79, 6, 2292);
        String strM13263 = C0203.m13263(f666short, 85, 26, 848);
        try {
            context.getPackageName();
            try {
                Class<?> cls = Class.forName(C0203.m13263(f666short, 111, 21, 1405));
                Object objM13222 = m13222();
                Field declaredField = objM13222.getClass().getDeclaredField(C0203.m13263(f666short, 132, 9, 2374));
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(objM13222);
                Iterator it = map.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    strM13281 = C0207.m13281(f666short, 141, 16, 2248);
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                                break;
                            case 49:
                                i = !zHasNext ? 1678 : 1709;
                                break;
                            case 204:
                                Object next = it.next();
                                int i2 = 1740;
                                while (true) {
                                    i2 ^= 1757;
                                    switch (i2) {
                                        case 17:
                                            i2 = next == null ? 1802 : 1833;
                                            break;
                                        case 54:
                                            break;
                                        case 471:
                                            break;
                                        case 500:
                                            boolean zEquals = next.equals(context.getPackageName());
                                            int i3 = 1864;
                                            while (true) {
                                                i3 ^= 1881;
                                                switch (i3) {
                                                    case 17:
                                                        i3 = !zEquals ? 48705 : 48736;
                                                        break;
                                                    case 47384:
                                                        break;
                                                    case 47417:
                                                        Object obj = ((WeakReference) map.get(next)).get();
                                                        m13219(C0207.m13281(f666short, 157, 7, 1292), obj, (Object) str);
                                                        m13219(C0207.m13281(f666short, 164, 7, 381), obj, (Object) str);
                                                        ApplicationInfo applicationInfo = (ApplicationInfo) m13214(obj, strM13281);
                                                        applicationInfo.publicSourceDir = str;
                                                        applicationInfo.sourceDir = str;
                                                        int i4 = 48767;
                                                        while (true) {
                                                            i4 ^= 48784;
                                                            switch (i4) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    break;
                                                                case Base64.mimeLineLength /* 76 */:
                                                                    applicationInfo.className = f668;
                                                                    break;
                                                                case 239:
                                                                    i4 = !z ? 48829 : 48860;
                                                                    break;
                                                            }
                                                        }
                                                        C0207.m13281(f666short, 171, 16, 938);
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
                    }
                }
                int i5 = 48891;
                while (true) {
                    i5 ^= 48908;
                    switch (i5) {
                        case 22:
                            break;
                        case 53:
                            Object objM13217 = m13217(strM13263, C0204.m13267(f666short, 187, 21, 973), new Class[0], new Object[0]);
                            Object objM13215 = m13215(strM13263, objM13217, C0205.m13272(f666short, 208, 17, 2074));
                            Object objM132152 = m13215(strM13272, objM13215, C0207.m13281(f666short, 225, 4, 657));
                            m13220(cls.getName(), C0205.m13272(f666short, 229, 12, 1795), objM132152, (Object) null);
                            ((ArrayList) m13215(strM13263, objM13217, C0207.m13281(f666short, 241, 16, 2954))).remove(m13215(strM13263, objM13217, strM132812));
                            ((ApplicationInfo) m13215(cls.getName(), objM132152, strM13281)).className = f668;
                            ((ApplicationInfo) m13215(strM13272, objM13215, C0207.m13281(f666short, InputDeviceCompat.SOURCE_KEYBOARD, 7, 556))).className = f668;
                            Application application = (Application) m13216(cls.getName(), C0205.m13272(f666short, 264, 15, 2905), objM132152, new Class[]{Boolean.TYPE, Instrumentation.class}, new Object[]{false, null});
                            m13220(strM13263, strM132812, objM13217, application);
                            f667 = application;
                            application.onCreate();
                            int i6 = 49666;
                            while (true) {
                                i6 ^= 49683;
                                switch (i6) {
                                    case 17:
                                        i6 = 49697;
                                        break;
                                    case 50:
                                        return;
                                }
                            }
                            break;
                        case 503:
                            if (!z) {
                                i5 = 49635;
                            }
                            break;
                        case 32495:
                            return;
                        default:
                            continue;
                    }
                    i5 = 48953;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            C0207.m13281(f666short, 279, 35, 572);
            C0207.m13281(f666short, 314, 73, 2294);
            int iM13280 = C0207.m13280();
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        System.out.println(Float.decode(C0207.m13279("uvYPyrfH4PWHQjtcDWGYUvSNQO")));
                        break;
                    case 241:
                        i7 = iM13280 < 0 ? 49852 : 49883;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13219(String str, Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
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
                    System.out.println(Integer.decode(C0207.m13279("AUfFLNbpoHVhcxFvA2uMXvzuak")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13220(String str, String str2, Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        String str3 = "ۣۥۥ";
        Class<?> cls = null;
        Field declaredField = null;
        while (true) {
            switch (C0203.m13265(str3)) {
                case 1746787:
                    declaredField.setAccessible(true);
                    str3 = "ۦۨۢ";
                    break;
                case 1750723:
                    cls = Class.forName(str);
                    str3 = "ۦۤ۟";
                    break;
                case 1753569:
                    str3 = "۟ۢۦ";
                    declaredField = cls.getDeclaredField(str2);
                    break;
                case 1753696:
                    declaredField.set(obj, obj2);
                    str3 = "۠ۥ";
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠۟۟۟۟۠۠۟۟۟۠ۡ۟۟۟۠ۢ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static Context m13221() {
        try {
            Class<?> cls = Class.forName(C0207.m13281(f666short, 387, 26, 2237));
            Method declaredMethod = cls.getDeclaredMethod(C0204.m13267(f666short, 413, 21, 2697), new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(C0203.m13263(f666short, 434, 17, 1880));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (obj != null) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        Field declaredField2 = obj.getClass().getDeclaredField(C0203.m13263(f666short, 451, 4, 1720));
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (objInvoke != null) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new NullPointerException(C0203.m13263(f666short, InputDeviceCompat.SOURCE_DPAD, 18, 2722));
                                case 500:
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (obj2 != null) {
                                                    i3 = 48736;
                                                }
                                                break;
                                            case 47384:
                                                throw new NullPointerException(C0204.m13267(f666short, 494, 19, 2356));
                                            case 47417:
                                                Method declaredMethod2 = Class.forName(C0207.m13281(f666short, 455, 23, 1403)).getDeclaredMethod(C0203.m13263(f666short, 478, 16, 1576), objInvoke.getClass(), obj2.getClass());
                                                declaredMethod2.setAccessible(true);
                                                return (Context) declaredMethod2.invoke(null, objInvoke, obj2);
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        throw new NullPointerException(C0207.m13281(f666short, 531, 25, 973));
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C0205.m13272(f666short, 556, 6, 2241);
            C0203.m13263(f666short, 562, 27, 1225);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m13222() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        String str = "ۥ۠ۢ";
        Field declaredField = null;
        Class<?> cls = null;
        Object obj = null;
        String strM13263 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 1748644:
                    strM13263 = C0207.m13281(sArr, 615, 22, 2977);
                    str = "ۣۢ۟";
                    break;
                case 1748889:
                    return obj;
                case 1749574:
                    declaredField = cls.getDeclaredField(strM13263);
                    str = "ۦۨۧ";
                    break;
                case 1751710:
                    obj = declaredField.get(null);
                    str = "ۡۨ۠";
                    break;
                case 1752487:
                    sArr = f666short;
                    str = "ۢ۟ۨ";
                    break;
                case 1753701:
                    declaredField.setAccessible(true);
                    str = "ۤۦ۠";
                    break;
                case 1755615:
                    cls = Class.forName(strM13263);
                    str = "ۨۨۧ";
                    break;
                case 1755623:
                    sArr = f666short;
                    str = "ۣۡ۠";
                    break;
                default:
                    strM13263 = C0203.m13263(sArr, 589, 26, 1844);
                    str = "ۨۨ۟";
                    break;
            }
        }
    }
}
