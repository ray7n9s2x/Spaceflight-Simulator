package j$.util.concurrent;

import androidx.core.internal.view.SupportMenu;
import com.google.common.primitives.Ints;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.InterfaceC0654z;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC0654z {
    private static final j$.sun.misc.a h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient s e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f486short = {1893, 1907, 1905, 1915, 1907, 1912, 1890, 1893, 1405, 1387, 1385, 1379, 1387, 1376, 1402, 1347, 1391, 1405, 1381, 2534, 2544, 2546, 2552, 2544, 2555, 2529, 2502, 2557, 2556, 2547, 2529, 3310, 3316, 3303, 3320, 3294, 3305, 3313, 2499, 2501, 2518, 2521, 2500, 2513, 2514, 2501, 2558, 2521, 2515, 2514, 2511, 1155, 1152, 1170, 1156, 1186, 1166, 1172, 1167, 1173, 3279, 3273, 3264, 3264, 3295, 3310, 3289, 3295, 3285, 2371, 2388, 2393, 2368, 2384, 2525, 2510, 2510, 2525, 2501, 2460, 2517, 2514, 2520, 2521, 2500, 2460, 2511, 2527, 2525, 2512, 2521, 2460, 2514, 2515, 2504, 2460, 2525, 2460, 2508, 2515, 2507, 2521, 2510, 2460, 2515, 2522, 2460, 2504, 2507, 2515, 2647, 2625, 2627, 2633, 2625, 2634, 2640, 2647, 1804, 1818, 1816, 1810, 1818, 1809, 1803, 1836, 1815, 1814, 1817, 1803, 814, 824, 826, 816, 824, 819, 809, 784, 828, 814, 822, 2371, 2420, 2418, 2404, 2403, 2402, 2424, 2407, 2420, 2353, 2404, 2401, 2421, 2416, 2405, 2420, 573, 522, 524, 538, 541, 540, 518, 537, 522, 591, 538, 543, 523, 526, 539, 522, 2636, 2683, 2685, 2667, 2668, 2669, 2679, 2664, 2683, 2622, 2667, 2670, 2682, 2687, 2666, 2683, 907, 956, 954, 940, 939, 938, 944, 943, 956, 1017, 940, 937, 957, 952, 941, 956, 1859, 1908, 1906, 1892, 1891, 1890, 1912, 1895, 1908, 1841, 1892, 1889, 1909, 1904, 1893, 1908, 2911, 2920, 2926, 2936, 2943, 2942, 2916, 2939, 2920, 2861, 2936, 2941, 2921, 2924, 2937, 2920, 1432, 1455, 1449, 1471, 1464, 1465, 1443, 1468, 1455, 1514, 1471, 1466, 1454, 1451, 1470, 1455, 1094, 1137, 1143, 1121, 1126, 1127, 1149, 1122, 1137, 1076, 1121, 1124, 1136, 1141, 1120, 1137, 3106, 1172, 1224, 1236, 1237, 1231, 1180, 1265, 1245, 1228, 1173, 2428, 2416};
    static final int g = C0082.m7993(C0092.m8747());

    static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8827(Object obj) {
        if (C0102.m11109() < 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8828(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() <= 0) {
            ((ConcurrentHashMap) obj).m((l[]) obj2, (l[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static l[] m8829(Object obj) {
        if (C0093.m9101() > 0) {
            return ((ConcurrentHashMap) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static l m8830(Object obj) {
        if (C0104.m11196() > 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m8831(Object obj) {
        if (C0101.m11044() < 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static l[] m8832(Object obj) {
        if (C0104.m11196() > 0) {
            return ((ConcurrentHashMap) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8833(Object obj, int i2, Object obj2) {
        if (C0106.m11345() <= 0) {
            return b((l[]) obj, i2, (l) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static i m8834(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((ConcurrentHashMap) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static long m8835(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((c) obj).value;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static l m8836(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((l) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8837(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((ConcurrentHashMap) obj).transferIndex;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m8838(Object obj, int i2) {
        if (C0101.m11044() < 0) {
            ((ConcurrentHashMap) obj).o(i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static e m8839(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((ConcurrentHashMap) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8840(Object obj) {
        if (C0079.m7512() > 0) {
            return ((ConcurrentHashMap) obj).cellsBusy;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m8841() {
        if (C0100.m10983() >= 0) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static r m8842(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((q) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m8843(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0090.m8624() > 0) {
            return ((ConcurrentHashMap) obj).f(obj2, obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static c[] m8844(Object obj) {
        if (C0096.m10782() > 0) {
            return ((ConcurrentHashMap) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8845() {
        if (C0102.m11109() <= 0) {
            z.g();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8846() {
        if (C0085.m8230() >= 0) {
            return n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۨ, reason: not valid java name and contains not printable characters */
    public static r m8847(Object obj, int i2, Object obj2, Object obj3) {
        if (C0093.m9101() >= 0) {
            return ((r) obj).b(i2, obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۧ, reason: not valid java name and contains not printable characters */
    public static r m8848(Object obj, int i2, Object obj2, Object obj3) {
        if (C0097.m10823() >= 0) {
            return ((q) obj).e(i2, obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m8849() {
        if (C0080.m7553() >= 0) {
            return z.c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static long m8850() {
        if (C0082.m7983() < 0) {
            return m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m8851(Object obj, long j2, int i2) {
        if (C0103.m11154() < 0) {
            ((ConcurrentHashMap) obj).a(j2, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m8852(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0104.m11196() > 0) {
            return ((ConcurrentHashMap) obj).g(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static l[] m8853(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((g) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8854(int i2) {
        if (C0106.m11345() <= 0) {
            return i(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m8855() {
        if (C0097.m10823() >= 0) {
            return o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static r m8856(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((q) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static l[] m8857(Object obj) {
        if (C0084.m8116() > 0) {
            return ((ConcurrentHashMap) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.sun.misc.a m8858() {
        if (C0094.m9148() > 0) {
            return h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static long m8859(Object obj) {
        if (C0083.m8022() < 0) {
            return ((ConcurrentHashMap) obj).baseCount;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static l[] m8860(Object obj, Object obj2, Object obj3) {
        if (C0089.m8594() <= 0) {
            return ((ConcurrentHashMap) obj).d((l[]) obj2, (l) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m8861() {
        if (C0080.m7553() >= 0) {
            return i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m8862() {
        if (C0084.m8116() >= 0) {
            return k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8863(int i2) {
        if (C0084.m8116() >= 0) {
            return z.a(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۥۢ, reason: not valid java name and contains not printable characters */
    public static void m8864(Object obj, Object obj2, int i2) {
        if (C0084.m8116() > 0) {
            ((ConcurrentHashMap) obj).n((l[]) obj2, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static l m8865(Object obj) {
        if (C0089.m8594() < 0) {
            return p((r) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8866(Object obj, int i2, Object obj2) {
        if (C0085.m8230() >= 0) {
            h((l[]) obj, i2, (l) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8867() {
        if (C0098.m10857() <= 0) {
            return f486short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۨ, reason: contains not printable characters */
    public static int m8868(Object obj) {
        if (C0081.m7818() < 0) {
            return ((ConcurrentHashMap) obj).sizeCtl;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۤ, reason: contains not printable characters */
    public static int m8869() {
        if (C0084.m8116() >= 0) {
            return g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۧ, reason: contains not printable characters */
    public static boolean m8870(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((q) obj).f((r) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static l m8871(Object obj, int i2, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((l) obj).a(i2, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static Object m8872(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧ۟, reason: contains not printable characters */
    public static l m8873(Object obj, int i2) {
        if (C0083.m8022() < 0) {
            return k((l[]) obj, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨ۠, reason: not valid java name and contains not printable characters */
    public static s m8874(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((ConcurrentHashMap) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static long m8875() {
        if (C0094.m9148() >= 0) {
            return l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧۥۢ, reason: not valid java name and contains not printable characters */
    public static long m8876(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((ConcurrentHashMap) obj).j();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static int m8877(int i2) {
        if (C0087.m8458() < 0) {
            return l(i2);
        }
        return 0;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField(C0089.m8581(m8867(), 0, 8, 1814), n[].class);
        Class clsM11254 = C0105.m11254();
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField(C0084.m8120(m8867(), 8, 11, 1294), clsM11254), new ObjectStreamField(C0082.m7966(m8867(), 19, 12, 2453), clsM11254)};
        j$.sun.misc.a aVarM9063 = C0093.m9063();
        h = aVarM9063;
        i = C0092.m8754(aVarM9063, ConcurrentHashMap.class, C0093.m9062(m8867(), 31, 7, 3229));
        j = C0092.m8754(aVarM9063, ConcurrentHashMap.class, C0093.m9062(m8867(), 38, 13, 2487));
        k = C0092.m8754(aVarM9063, ConcurrentHashMap.class, C0099.m10897(m8867(), 51, 9, 1249));
        l = C0092.m8754(aVarM9063, ConcurrentHashMap.class, C0106.m11346(m8867(), 60, 9, 3244));
        m = C0092.m8754(aVarM9063, c.class, C0091.m8679(m8867(), 69, 5, 2357));
        n = C0102.m11108(aVarM9063, l[].class);
        int iM8608 = C0090.m8608(aVarM9063, l[].class);
        if (((iM8608 - 1) & iM8608) != 0) {
            throw new ExceptionInInitializerError(C0097.m10853(m8867(), 74, 36, 2492));
        }
        o = 31 - C0104.m11216(iM8608);
    }

    private static final int l(int i2) {
        int iM11216 = (-1) >>> C0104.m11216(i2 - 1);
        if (iM11216 < 0) {
            return 1;
        }
        return iM11216 >= 1073741824 ? Ints.MAX_POWER_OF_TWO : 1 + iM11216;
    }

    static Class c(Object obj) {
        Type[] typeArrM9091;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class clsM8727 = C0092.m8727(obj);
        if (clsM8727 == String.class) {
            return clsM8727;
        }
        Type[] typeArrM8033 = C0083.m8033(clsM8727);
        if (typeArrM8033 == null) {
            return null;
        }
        for (Type type : typeArrM8033) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (C0103.m11151(parameterizedType) == Comparable.class && (typeArrM9091 = C0093.m9091(parameterizedType)) != null && typeArrM9091.length == 1 && typeArrM9091[0] == clsM8727) {
                    return clsM8727;
                }
            }
        }
        return null;
    }

    static final l k(l[] lVarArr, int i2) {
        return (l) C0081.m7794(m8858(), lVarArr, (((long) i2) << m8855()) + ((long) m8846()));
    }

    static final boolean b(l[] lVarArr, int i2, l lVar) {
        return C0079.m7489(m8858(), lVarArr, (((long) i2) << m8855()) + ((long) m8846()), lVar);
    }

    static final void h(l[] lVarArr, int i2, l lVar) {
        C0082.m8006(m8858(), lVarArr, (((long) i2) << m8855()) + ((long) m8846()), lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2, int i3) {
        int i4 = i2;
        if (i4 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i4 < i3 ? i3 : i4) / 0.75f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? Ints.MAX_POWER_OF_TWO : m8877((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jM8876 = m8876(this);
        if (jM8876 < 0) {
            return 0;
        }
        if (jM8876 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM8876;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return m8876(this) <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int length;
        l lVarM8873;
        Object objM8872;
        int iM8854 = m8854(C0090.m8618(obj));
        l[] lVarArrM8857 = m8857(this);
        if (lVarArrM8857 != null && (length = lVarArrM8857.length) > 0 && (lVarM8873 = m8873(lVarArrM8857, (length - 1) & iM8854)) != null) {
            int iM8827 = m8827(lVarM8873);
            if (iM8827 == iM8854) {
                Object objM88722 = m8872(lVarM8873);
                if (objM88722 == obj || (objM88722 != null && C0085.m8250(obj, objM88722))) {
                    return m8831(lVarM8873);
                }
            } else if (iM8827 < 0) {
                l lVarM8871 = m8871(lVarM8873, iM8854, obj);
                if (lVarM8871 != null) {
                    return m8831(lVarM8871);
                }
                return null;
            }
            while (true) {
                lVarM8873 = m8836(lVarM8873);
                if (lVarM8873 == null) {
                    break;
                }
                if (m8827(lVarM8873) == iM8854 && ((objM8872 = m8872(lVarM8873)) == obj || (objM8872 != null && C0085.m8250(obj, objM8872)))) {
                    break;
                }
            }
            return m8831(lVarM8873);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C0080.m7547(this, obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        C0092.m8727(obj);
        l[] lVarArrM8857 = m8857(this);
        if (lVarArrM8857 != null) {
            p pVar = new p(lVarArrM8857, lVarArrM8857.length, 0, lVarArrM8857.length);
            while (true) {
                l lVarM8830 = m8830(pVar);
                if (lVarM8830 == null) {
                    break;
                }
                Object objM8831 = m8831(lVarM8830);
                if (objM8831 == obj) {
                    return true;
                }
                if (objM8831 != null && C0085.m8250(obj, objM8831)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return m8843(this, obj, obj2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        r7 = m8831(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r62 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        r6.c = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        throw new java.lang.IllegalStateException(j$.time.format.C0082.m7966(m8867(), 221, 16, 2829));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.lang.Object r60, java.lang.Object r61, boolean r62) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8838(this, C0093.m9065(map));
        Iterator itM8658 = C0090.m8658(C0103.m11178(map));
        while (C0087.m8485(itM8658)) {
            Map.Entry entry = (Map.Entry) C0090.m8628(itM8658);
            m8843(this, C0099.m10870(entry), C0096.m10785(entry), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        return m8852(this, obj, null, null);
    }

    final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        l lVarM8873;
        boolean z;
        Object objM8831;
        r rVarM8847;
        Object objM8872;
        int iM8854 = m8854(C0090.m8618(obj));
        l[] lVarArrM8857 = m8857(this);
        while (true) {
            if (lVarArrM8857 == null || (length = lVarArrM8857.length) == 0 || (lVarM8873 = m8873(lVarArrM8857, (i2 = (length - 1) & iM8854))) == null) {
                break;
            }
            int iM8827 = m8827(lVarM8873);
            if (iM8827 == -1) {
                lVarArrM8857 = m8860(this, lVarArrM8857, lVarM8873);
            } else {
                synchronized (lVarM8873) {
                    try {
                        if (m8873(lVarArrM8857, i2) == lVarM8873) {
                            z = true;
                            if (iM8827 >= 0) {
                                l lVar = null;
                                l lVar2 = lVarM8873;
                                while (true) {
                                    if (m8827(lVar2) != iM8854 || ((objM8872 = m8872(lVar2)) != obj && (objM8872 == null || !C0085.m8250(obj, objM8872)))) {
                                        l lVarM8836 = m8836(lVar2);
                                        if (lVarM8836 == null) {
                                            break;
                                        }
                                        lVar = lVar2;
                                        lVar2 = lVarM8836;
                                    }
                                }
                                objM8831 = m8831(lVar2);
                                if (obj3 != null && obj3 != objM8831 && (objM8831 == null || !C0085.m8250(obj3, objM8831))) {
                                    objM8831 = null;
                                } else if (obj2 != null) {
                                    lVar2.c = obj2;
                                } else if (lVar != null) {
                                    lVar.d = m8836(lVar2);
                                } else {
                                    m8866(lVarArrM8857, i2, m8836(lVar2));
                                }
                            } else if (lVarM8873 instanceof q) {
                                q qVar = (q) lVarM8873;
                                r rVarM8842 = m8842(qVar);
                                if (rVarM8842 != null && (rVarM8847 = m8847(rVarM8842, iM8854, obj, null)) != null) {
                                    objM8831 = m8831(rVarM8847);
                                    if (obj3 == null || obj3 == objM8831 || (objM8831 != null && C0085.m8250(obj3, objM8831))) {
                                        if (obj2 != null) {
                                            rVarM8847.c = obj2;
                                        } else if (m8870(qVar, rVarM8847)) {
                                            m8866(lVarArrM8857, i2, m8865(m8856(qVar)));
                                        }
                                    }
                                }
                                objM8831 = null;
                            } else if (lVarM8873 instanceof m) {
                                throw new IllegalStateException(C0089.m8581(m8867(), 237, 16, 1482));
                            }
                        }
                        z = false;
                        objM8831 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (objM8831 != null) {
                        if (obj2 == null) {
                            m8851(this, -1L, -1);
                        }
                        return objM8831;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l lVarM8873;
        l lVarM8856;
        l[] lVarArrM8857 = m8857(this);
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (lVarArrM8857 != null && i2 < lVarArrM8857.length) {
                lVarM8873 = m8873(lVarArrM8857, i2);
                if (lVarM8873 == null) {
                    i2++;
                } else {
                    int iM8827 = m8827(lVarM8873);
                    if (iM8827 == -1) {
                        break;
                    }
                    synchronized (lVarM8873) {
                        try {
                            if (m8873(lVarArrM8857, i2) == lVarM8873) {
                                if (iM8827 >= 0) {
                                    lVarM8856 = lVarM8873;
                                } else {
                                    lVarM8856 = lVarM8873 instanceof q ? m8856((q) lVarM8873) : null;
                                }
                                while (lVarM8856 != null) {
                                    j2--;
                                    lVarM8856 = m8836(lVarM8856);
                                }
                                m8866(lVarArrM8857, i2, null);
                                i2++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArrM8857 = m8860(this, lVarArrM8857, lVarM8873);
        }
        if (j2 != 0) {
            m8851(this, j2, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVarM8834 = m8834(this);
        if (iVarM8834 != null) {
            return iVarM8834;
        }
        i iVar = new i(this);
        this.d = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s sVarM8874 = m8874(this);
        if (sVarM8874 != null) {
            return sVarM8874;
        }
        s sVar = new s(this);
        this.e = sVar;
        return sVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVarM8839 = m8839(this);
        if (eVarM8839 != null) {
            return eVarM8839;
        }
        e eVar = new e(this);
        this.f = eVar;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArrM8857 = m8857(this);
        int iM8618 = 0;
        if (lVarArrM8857 != null) {
            p pVar = new p(lVarArrM8857, lVarArrM8857.length, 0, lVarArrM8857.length);
            while (true) {
                l lVarM8830 = m8830(pVar);
                if (lVarM8830 == null) {
                    break;
                }
                iM8618 += C0090.m8618(m8831(lVarM8830)) ^ C0090.m8618(m8872(lVarM8830));
            }
        }
        return iM8618;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArrM8857 = m8857(this);
        int length = lVarArrM8857 == null ? 0 : lVarArrM8857.length;
        p pVar = new p(lVarArrM8857, length, 0, length);
        StringBuilder sb = new StringBuilder(C0101.m11060(m8867(), 269, 1, 3161));
        l lVarM8830 = m8830(pVar);
        if (lVarM8830 != null) {
            while (true) {
                Object objM8872 = m8872(lVarM8830);
                Object objM8831 = m8831(lVarM8830);
                String strM10776 = C0096.m10776(m8867(), 270, 10, 1212);
                if (objM8872 == this) {
                    objM8872 = strM10776;
                }
                C0082.m7988(sb, objM8872);
                C0089.m8573(sb, '=');
                if (objM8831 == this) {
                    objM8831 = strM10776;
                }
                C0082.m7988(sb, objM8831);
                lVarM8830 = m8830(pVar);
                if (lVarM8830 == null) {
                    break;
                }
                C0101.m11052(sb, C0095.m9204(m8867(), 280, 2, 2384));
            }
        }
        C0089.m8573(sb, '}');
        return C0099.m10924(sb);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objM10785;
        Object objM7547;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArrM8857 = m8857(this);
        int length = lVarArrM8857 == null ? 0 : lVarArrM8857.length;
        p pVar = new p(lVarArrM8857, length, 0, length);
        while (true) {
            l lVarM8830 = m8830(pVar);
            if (lVarM8830 != null) {
                Object objM8831 = m8831(lVarM8830);
                Object objM8103 = C0084.m8103(map, m8872(lVarM8830));
                if (objM8103 == null || (objM8103 != objM8831 && !C0085.m8250(objM8103, objM8831))) {
                    break;
                }
            } else {
                Iterator itM8658 = C0090.m8658(C0103.m11178(map));
                while (C0087.m8485(itM8658)) {
                    Map.Entry entry = (Map.Entry) C0090.m8628(itM8658);
                    Object objM10870 = C0099.m10870(entry);
                    if (objM10870 == null || (objM10785 = C0096.m10785(entry)) == null || (objM7547 = C0080.m7547(this, objM10870)) == null || (objM10785 != objM7547 && !C0085.m8250(objM10785, objM7547))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        n[] nVarArr = new n[16];
        for (int i6 = 0; i6 < 16; i6++) {
            nVarArr[i6] = new n();
        }
        ObjectOutputStream.PutField putFieldM7799 = C0081.m7799(objectOutputStream);
        C0093.m9069(putFieldM7799, C0096.m10776(m8867(), 110, 8, 2596), nVarArr);
        C0082.m7998(putFieldM7799, C0085.m8236(m8867(), 118, 12, 1919), i4);
        C0082.m7998(putFieldM7799, C0081.m7837(m8867(), 130, 11, 861), i5);
        C0102.m11069(objectOutputStream);
        l[] lVarArrM8857 = m8857(this);
        if (lVarArrM8857 != null) {
            p pVar = new p(lVarArrM8857, lVarArrM8857.length, 0, lVarArrM8857.length);
            while (true) {
                l lVarM8830 = m8830(pVar);
                if (lVarM8830 == null) {
                    break;
                }
                C0105.m11291(objectOutputStream, m8872(lVarM8830));
                C0105.m11291(objectOutputStream, m8831(lVarM8830));
            }
        }
        C0105.m11291(objectOutputStream, null);
        C0105.m11291(objectOutputStream, null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        boolean z;
        boolean z2;
        Object objM8872;
        this.sizeCtl = -1;
        C0080.m7587(objectInputStream);
        long j3 = 0;
        long j4 = 0;
        l lVar = null;
        while (true) {
            Object objM9073 = C0093.m9073(objectInputStream);
            Object objM90732 = C0093.m9073(objectInputStream);
            j2 = 1;
            if (objM9073 == null || objM90732 == null) {
                break;
            }
            j4++;
            lVar = new l(m8854(C0090.m8618(objM9073)), objM9073, objM90732, lVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) (((double) (j4 / 0.75f)) + 1.0d);
        int iM8877 = j5 >= 1073741824 ? Ints.MAX_POWER_OF_TWO : m8877((int) j5);
        l[] lVarArr = new l[iM8877];
        int i2 = iM8877 - 1;
        while (lVar != null) {
            l lVarM8836 = m8836(lVar);
            int iM8827 = m8827(lVar);
            int i3 = iM8827 & i2;
            l lVarM8873 = m8873(lVarArr, i3);
            if (lVarM8873 == null) {
                z2 = true;
            } else {
                Object objM88722 = m8872(lVar);
                if (m8827(lVarM8873) >= 0) {
                    int i4 = 0;
                    for (l lVarM88362 = lVarM8873; lVarM88362 != null; lVarM88362 = m8836(lVarM88362)) {
                        if (m8827(lVarM88362) == iM8827 && ((objM8872 = m8872(lVarM88362)) == objM88722 || (objM8872 != null && C0085.m8250(objM88722, objM8872)))) {
                            z = false;
                            break;
                        }
                        i4++;
                    }
                    z = true;
                    if (!z || i4 < 8) {
                        z2 = z;
                    } else {
                        long j6 = j3 + 1;
                        lVar.d = lVarM8873;
                        l lVarM88363 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVarM88363 != null) {
                            long j7 = j6;
                            r rVar3 = new r(m8827(lVarM88363), m8872(lVarM88363), m8831(lVarM88363), null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.d = rVar3;
                            }
                            lVarM88363 = m8836(lVarM88363);
                            rVar2 = rVar3;
                            j6 = j7;
                        }
                        m8866(lVarArr, i3, new q(rVar));
                        j3 = j6;
                    }
                } else if (m8848((q) lVarM8873, iM8827, objM88722, m8831(lVar)) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            j2 = 1;
            if (z2) {
                j3++;
                lVar.d = lVarM8873;
                m8866(lVarArr, i3, lVar);
            }
            lVar = lVarM8836;
        }
        this.a = lVarArr;
        this.sizeCtl = iM8877 - (iM8877 >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.InterfaceC0654z
    public final Object putIfAbsent(Object obj, Object obj2) {
        return m8843(this, obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        C0092.m8727(obj);
        return (obj2 == null || m8852(this, obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m8852(this, obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return m8852(this, obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.InterfaceC0654z
    public final Object getOrDefault(Object obj, Object obj2) {
        Object objM7547 = C0080.m7547(this, obj);
        return objM7547 == null ? obj2 : objM7547;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.InterfaceC0654z
    public final void forEach(BiConsumer biConsumer) {
        C0092.m8727(biConsumer);
        l[] lVarArrM8857 = m8857(this);
        if (lVarArrM8857 == null) {
            return;
        }
        p pVar = new p(lVarArrM8857, lVarArrM8857.length, 0, lVarArrM8857.length);
        while (true) {
            l lVarM8830 = m8830(pVar);
            if (lVarM8830 == null) {
                return;
            } else {
                C0105.m11267(biConsumer, m8872(lVarM8830), m8831(lVarM8830));
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction) {
        C0092.m8727(biFunction);
        l[] lVarArrM8857 = m8857(this);
        if (lVarArrM8857 == null) {
            return;
        }
        p pVar = new p(lVarArrM8857, lVarArrM8857.length, 0, lVarArrM8857.length);
        while (true) {
            l lVarM8830 = m8830(pVar);
            if (lVarM8830 == null) {
                return;
            }
            Object objM8831 = m8831(lVarM8830);
            Object objM8872 = m8872(lVarM8830);
            do {
                Object objM7970 = C0082.m7970(biFunction, objM8872, objM8831);
                C0092.m8727(objM7970);
                if (m8852(this, objM8872, objM7970, objM8831) == null) {
                    objM8831 = C0080.m7547(this, objM8872);
                }
            } while (objM8831 != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
    
        r5 = m8831(r5);
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r63, java.util.function.Function r64) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        throw new java.lang.IllegalStateException(j$.time.temporal.C0086.m8291(m8867(), 205, 16, 1809));
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r65, java.util.function.BiFunction r66) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object objM8872;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM8854 = m8854(C0090.m8618(obj));
        l[] lVarArrM8857 = m8857(this);
        int i2 = 0;
        Object objM7970 = null;
        int i3 = 0;
        while (true) {
            if (lVarArrM8857 != null) {
                int length = lVarArrM8857.length;
                if (length != 0) {
                    int i4 = (length - 1) & iM8854;
                    l lVarM8873 = m8873(lVarArrM8857, i4);
                    if (lVarM8873 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (m8833(lVarArrM8857, i4, mVar)) {
                                    try {
                                        objM7970 = C0082.m7970(biFunction, obj, null);
                                        if (objM7970 != null) {
                                            lVar = new l(iM8854, obj, objM7970);
                                            i3 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        m8866(lVarArrM8857, i4, lVar);
                                        i2 = 1;
                                    } catch (Throwable th) {
                                        m8866(lVarArrM8857, i4, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i2 != 0) {
                        }
                    } else {
                        int iM8827 = m8827(lVarM8873);
                        if (iM8827 == -1) {
                            lVarArrM8857 = m8860(this, lVarArrM8857, lVarM8873);
                        } else {
                            synchronized (lVarM8873) {
                                try {
                                    if (m8873(lVarArrM8857, i4) == lVarM8873) {
                                        if (iM8827 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = lVarM8873;
                                            i2 = 1;
                                            while (true) {
                                                if (m8827(lVar3) != iM8854 || ((objM8872 = m8872(lVar3)) != obj && (objM8872 == null || !C0085.m8250(obj, objM8872)))) {
                                                    l lVarM8836 = m8836(lVar3);
                                                    if (lVarM8836 == null) {
                                                        Object objM79702 = C0082.m7970(biFunction, obj, null);
                                                        if (objM79702 == null) {
                                                            objM7970 = objM79702;
                                                        } else {
                                                            if (m8836(lVar3) != null) {
                                                                throw new IllegalStateException(C0084.m8120(m8867(), 141, 16, 2321));
                                                            }
                                                            lVar3.d = new l(iM8854, obj, objM79702);
                                                            objM7970 = objM79702;
                                                            i3 = 1;
                                                        }
                                                    } else {
                                                        i2++;
                                                        lVar2 = lVar3;
                                                        lVar3 = lVarM8836;
                                                    }
                                                }
                                            }
                                            Object objM79703 = C0082.m7970(biFunction, obj, m8831(lVar3));
                                            if (objM79703 != null) {
                                                lVar3.c = objM79703;
                                                objM7970 = objM79703;
                                            } else {
                                                l lVarM88362 = m8836(lVar3);
                                                if (lVar2 != null) {
                                                    lVar2.d = lVarM88362;
                                                } else {
                                                    m8866(lVarArrM8857, i4, lVarM88362);
                                                }
                                                objM7970 = objM79703;
                                                i3 = -1;
                                            }
                                        } else if (lVarM8873 instanceof q) {
                                            q qVar = (q) lVarM8873;
                                            r rVarM8842 = m8842(qVar);
                                            r rVarM8847 = rVarM8842 != null ? m8847(rVarM8842, iM8854, obj, null) : null;
                                            Object objM79704 = C0082.m7970(biFunction, obj, rVarM8847 == null ? null : m8831(rVarM8847));
                                            if (objM79704 != null) {
                                                if (rVarM8847 != null) {
                                                    rVarM8847.c = objM79704;
                                                } else {
                                                    m8848(qVar, iM8854, obj, objM79704);
                                                    i3 = 1;
                                                }
                                            } else if (rVarM8847 != null) {
                                                if (m8870(qVar, rVarM8847)) {
                                                    m8866(lVarArrM8857, i4, m8865(m8856(qVar)));
                                                }
                                                i3 = -1;
                                            }
                                            objM7970 = objM79704;
                                            i2 = 1;
                                        } else if (lVarM8873 instanceof m) {
                                            throw new IllegalStateException(C0085.m8236(m8867(), 157, 16, 623));
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m8864(this, lVarArrM8857, i4);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrM8857 = m8829(this);
        }
        if (i3 != 0) {
            m8851(this, i3, i2);
        }
        return objM7970;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        throw new java.lang.IllegalStateException(j$.time.C0091.m8679(m8867(), 253, 16, 1044));
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r69, java.lang.Object r70, java.util.function.BiFunction r71) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    private final l[] e() {
        while (true) {
            l[] lVarArrM8857 = m8857(this);
            if (lVarArrM8857 != null && lVarArrM8857.length != 0) {
                return lVarArrM8857;
            }
            int iM8868 = m8868(this);
            if (iM8868 < 0) {
                C0092.m8774();
            } else if (C0094.m9145(m8858(), this, m8861(), iM8868, -1)) {
                try {
                    l[] lVarArrM88572 = m8857(this);
                    if (lVarArrM88572 == null || lVarArrM88572.length == 0) {
                        int i2 = iM8868 > 0 ? iM8868 : 16;
                        l[] lVarArr = new l[i2];
                        this.a = lVarArr;
                        iM8868 = i2 - (i2 >>> 2);
                        lVarArrM88572 = lVarArr;
                    }
                    this.sizeCtl = iM8868;
                    return lVarArrM88572;
                } catch (Throwable th) {
                    this.sizeCtl = iM8868;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (m8844(r76) != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0181, code lost:
    
        r76.c = (j$.util.concurrent.c[]) j$.util.stream.C0097.m10839(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r77, int r79) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    final l[] d(l[] lVarArr, l lVar) {
        int iM8868;
        if (lVar instanceof g) {
            l[] lVarArrM8853 = m8853((g) lVar);
            int iM11216 = C0104.m11216(lVarArr.length) | 32768;
            while (true) {
                if (lVarArrM8853 != m8832(this) || m8857(this) != lVarArr || (iM8868 = m8868(this)) >= 0 || (iM8868 >>> 16) != iM11216 || iM8868 == iM11216 + 1 || iM8868 == SupportMenu.USER_MASK + iM11216 || m8837(this) <= 0) {
                    break;
                }
                if (C0094.m9145(m8858(), this, m8861(), iM8868, iM8868 + 1)) {
                    m8828(this, lVarArr, lVarArrM8853);
                    break;
                }
            }
            return lVarArrM8853;
        }
        return m8857(this);
    }

    private final void o(int i2) {
        int length;
        int iM8877 = i2 >= 536870912 ? Ints.MAX_POWER_OF_TWO : m8877(i2 + (i2 >>> 1) + 1);
        while (true) {
            int iM8868 = m8868(this);
            if (iM8868 < 0) {
                return;
            }
            l[] lVarArrM8857 = m8857(this);
            if (lVarArrM8857 == null || (length = lVarArrM8857.length) == 0) {
                int i3 = iM8868 > iM8877 ? iM8868 : iM8877;
                if (C0094.m9145(m8858(), this, m8861(), iM8868, -1)) {
                    try {
                        if (m8857(this) == lVarArrM8857) {
                            this.a = new l[i3];
                            iM8868 = i3 - (i3 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = iM8868;
                    }
                } else {
                    continue;
                }
            } else {
                if (iM8877 <= iM8868 || length >= 1073741824) {
                    return;
                }
                if (lVarArrM8857 == m8857(this)) {
                    if (C0094.m9145(m8858(), this, m8861(), iM8868, ((C0104.m11216(length) | 32768) << 16) + 2)) {
                        m8828(this, lVarArrM8857, null);
                    }
                }
            }
        }
    }

    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i2;
        int i3;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i4;
        Object qVar;
        Object qVar2;
        l lVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int iM8869 = m8869();
        int i6 = iM8869 > 1 ? (length >>> 3) / iM8869 : length;
        int i7 = i6 < 16 ? 16 : i6;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i8 = 0;
        int i9 = 0;
        boolean zM8833 = true;
        boolean z = false;
        while (true) {
            if (zM8833) {
                int i10 = i9 - 1;
                if (i10 >= i8 || z) {
                    i8 = i8;
                    i9 = i10;
                    zM8833 = false;
                } else {
                    int iM8837 = m8837(concurrentHashMap2);
                    if (iM8837 <= 0) {
                        i9 = -1;
                    } else {
                        j$.sun.misc.a aVarM8858 = m8858();
                        long jM8841 = m8841();
                        int i11 = iM8837 > i7 ? iM8837 - i7 : 0;
                        int i12 = i8;
                        if (C0094.m9145(aVarM8858, this, jM8841, iM8837, i11)) {
                            i9 = iM8837 - 1;
                            i8 = i11;
                        } else {
                            i8 = i12;
                            i9 = i10;
                        }
                    }
                    zM8833 = false;
                }
            } else {
                int i13 = i8;
                r rVar = null;
                l lVar2 = null;
                if (i9 < 0 || i9 >= length || (i4 = i9 + length) >= length2) {
                    i2 = i7;
                    i3 = length2;
                    gVar = gVar2;
                    if (z) {
                        this.b = null;
                        this.a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    j$.sun.misc.a aVarM88582 = m8858();
                    long jM8861 = m8861();
                    int iM8868 = m8868(concurrentHashMap);
                    int i14 = i9;
                    if (!C0094.m9145(aVarM88582, this, jM8861, iM8868, iM8868 - 1)) {
                        i9 = i14;
                    } else {
                        if (iM8868 - 2 != ((C0104.m11216(length) | 32768) << 16)) {
                            return;
                        }
                        i9 = length;
                        zM8833 = true;
                        z = true;
                    }
                } else {
                    l lVarM8873 = m8873(lVarArr4, i9);
                    if (lVarM8873 == null) {
                        zM8833 = m8833(lVarArr4, i9, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i2 = i7;
                        i3 = length2;
                        gVar = gVar2;
                    } else {
                        int iM8827 = m8827(lVarM8873);
                        if (iM8827 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i2 = i7;
                            i3 = length2;
                            gVar = gVar2;
                            zM8833 = true;
                        } else {
                            synchronized (lVarM8873) {
                                try {
                                    if (m8873(lVarArr4, i9) == lVarM8873) {
                                        if (iM8827 >= 0) {
                                            int i15 = iM8827 & length;
                                            l lVar3 = lVarM8873;
                                            for (l lVarM8836 = m8836(lVarM8873); lVarM8836 != null; lVarM8836 = m8836(lVarM8836)) {
                                                int iM88272 = m8827(lVarM8836) & length;
                                                if (iM88272 != i15) {
                                                    lVar3 = lVarM8836;
                                                    i15 = iM88272;
                                                }
                                            }
                                            if (i15 == 0) {
                                                lVar = null;
                                                lVar2 = lVar3;
                                            } else {
                                                lVar = lVar3;
                                            }
                                            l lVarM88362 = lVarM8873;
                                            while (lVarM88362 != lVar3) {
                                                int iM88273 = m8827(lVarM88362);
                                                Object objM8872 = m8872(lVarM88362);
                                                int i16 = i7;
                                                Object objM8831 = m8831(lVarM88362);
                                                if ((iM88273 & length) == 0) {
                                                    i5 = length2;
                                                    lVar2 = new l(iM88273, objM8872, objM8831, lVar2);
                                                } else {
                                                    i5 = length2;
                                                    lVar = new l(iM88273, objM8872, objM8831, lVar);
                                                }
                                                lVarM88362 = m8836(lVarM88362);
                                                i7 = i16;
                                                length2 = i5;
                                            }
                                            i2 = i7;
                                            i3 = length2;
                                            m8866(lVarArr3, i9, lVar2);
                                            m8866(lVarArr3, i4, lVar);
                                            m8866(lVarArr4, i9, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i2 = i7;
                                            i3 = length2;
                                            if (lVarM8873 instanceof q) {
                                                q qVar3 = (q) lVarM8873;
                                                r rVar2 = null;
                                                r rVar3 = null;
                                                l lVarM8856 = m8856(qVar3);
                                                int i17 = 0;
                                                int i18 = 0;
                                                r rVar4 = null;
                                                while (lVarM8856 != null) {
                                                    q qVar4 = qVar3;
                                                    int iM88274 = m8827(lVarM8856);
                                                    g gVar3 = gVar2;
                                                    r rVar5 = new r(iM88274, m8872(lVarM8856), m8831(lVarM8856), null, null);
                                                    if ((iM88274 & length) == 0) {
                                                        rVar5.h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.d = rVar5;
                                                        }
                                                        i17++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.d = rVar5;
                                                        }
                                                        i18++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVarM8856 = m8836(lVarM8856);
                                                    qVar3 = qVar4;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar5 = qVar3;
                                                g gVar4 = gVar2;
                                                if (i17 <= 6) {
                                                    qVar = m8865(rVar);
                                                } else {
                                                    qVar = i18 != 0 ? new q(rVar) : qVar5;
                                                }
                                                if (i18 <= 6) {
                                                    qVar2 = m8865(rVar4);
                                                } else {
                                                    qVar2 = i17 != 0 ? new q(rVar4) : qVar5;
                                                }
                                                m8866(lVarArr3, i9, qVar);
                                                m8866(lVarArr3, i4, qVar2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                m8866(lVarArr4, i9, gVar);
                                            }
                                        }
                                        zM8833 = true;
                                    } else {
                                        i2 = i7;
                                        i3 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i8 = i13;
                i7 = i2;
                length2 = i3;
            }
        }
    }

    final long j() {
        c[] cVarArrM8844 = m8844(this);
        long jM8859 = m8859(this);
        if (cVarArrM8844 != null) {
            for (c cVar : cVarArrM8844) {
                if (cVar != null) {
                    jM8859 += m8835(cVar);
                }
            }
        }
        return jM8859;
    }

    private final void n(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            m8838(this, length << 1);
            return;
        }
        l lVarM8873 = m8873(lVarArr, i2);
        if (lVarM8873 == null || m8827(lVarM8873) < 0) {
            return;
        }
        synchronized (lVarM8873) {
            try {
                if (m8873(lVarArr, i2) == lVarM8873) {
                    r rVar = null;
                    l lVarM8836 = lVarM8873;
                    r rVar2 = null;
                    while (lVarM8836 != null) {
                        r rVar3 = new r(m8827(lVarM8836), m8872(lVarM8836), m8831(lVarM8836), null, null);
                        rVar3.h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.d = rVar3;
                        }
                        lVarM8836 = m8836(lVarM8836);
                        rVar2 = rVar3;
                    }
                    m8866(lVarArr, i2, new q(rVar));
                }
            } finally {
            }
        }
    }

    static l p(r rVar) {
        l lVarM8836 = rVar;
        l lVar = null;
        l lVar2 = null;
        while (lVarM8836 != null) {
            l lVar3 = new l(m8827(lVarM8836), m8872(lVarM8836), m8831(lVarM8836));
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.d = lVar3;
            }
            lVarM8836 = m8836(lVarM8836);
            lVar2 = lVar3;
        }
        return lVar;
    }
}
