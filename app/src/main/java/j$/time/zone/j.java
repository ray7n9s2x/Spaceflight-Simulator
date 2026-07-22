package j$.time.zone;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f473short = {2622, 2603, 2602, 2593, 2573, 2592, 2747, 2714, 2773, 2689, 2716, 2712, 2704, 2776, 2703, 2714, 2715, 2704, 2773, 2705, 2708, 2689, 2708, 2773, 2707, 2716, 2713, 2704, 2694, 2773, 2695, 2704, 2706, 2716, 2694, 2689, 2704, 2695, 2704, 2705, 1866, 1905, 1908, 1905, 1904, 1896, 1905, 1855, 1899, 1910, 1906, 1914, 1842, 1893, 1904, 1905, 1914, 1855, 1878, 1883, 1829, 1855, 2498, 2496, 2525, 2500, 2523, 2518, 2519, 2496, 2423, 2402, 2403, 2408, 2372, 2409, 2956, 2999, 3000, 3003, 2997, 3004, 3065, 2989, 2998, 3065, 2987, 3004, 3006, 2992, 2986, 2989, 3004, 2987, 3065, 2979, 2998, 2999, 3004, 3065, 3000, 2986, 3065, 2998, 2999, 3004, 3065, 3000, 2997, 2987, 3004, 3000, 3005, 2976, 3065, 2987, 3004, 3006, 2992, 2986, 2989, 3004, 2987, 3004, 3005, 3065, 2990, 2992, 2989, 2993, 3065, 2989, 2993, 3000, 2989, 3065, 2960, 2973, 3043, 3065, 2168, 2164, 2103, 2081, 2086, 2086, 2097, 2106, 2080, 2104, 2093, 2164, 2104, 2107, 2101, 2096, 2109, 2106, 2099, 2164, 2098, 2086, 2107, 2105, 2164, 2084, 2086, 2107, 2082, 2109, 2096, 2097, 2086, 2158, 2164};

    /* JADX INFO: renamed from: ۟۠ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArrayList m8440() {
        if (C0080.m7553() >= 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8441() {
        if (C0080.m7553() >= 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8442() {
        if (C0093.m9101() > 0) {
            return f473short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Set m8443(Object obj) {
        if (C0102.m11109() < 0) {
            return ((j) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۧ, reason: not valid java name and contains not printable characters */
    public static f m8444(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((j) obj).b((String) obj2);
        }
        return null;
    }

    protected abstract f b(String str);

    protected abstract Set c();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        b = new ConcurrentHashMap(512, 2);
        ArrayList arrayList = new ArrayList();
        C0089.m8602(new h(arrayList));
        C0094.m9139(copyOnWriteArrayList, arrayList);
    }

    public static f a(String str, boolean z) {
        C0079.m7494(str, C0102.m11094(m8442(), 0, 6, 2628));
        ConcurrentHashMap concurrentHashMapM8441 = m8441();
        j jVar = (j) C0080.m7547(concurrentHashMapM8441, str);
        if (jVar != null) {
            return m8444(jVar, str);
        }
        if (C0099.m10867(concurrentHashMapM8441)) {
            throw new g(C0092.m8731(m8442(), 6, 34, 2805));
        }
        throw new g(C0094.m9125(C0080.m7573(m8442(), 40, 22, 1823), str));
    }

    public static void d(j jVar) {
        C0079.m7494(jVar, C0079.m7503(m8442(), 62, 8, 2482));
        synchronized (j.class) {
            try {
                Iterator itM8658 = C0090.m8658(m8443(jVar));
                while (C0087.m8485(itM8658)) {
                    String str = (String) C0090.m8628(itM8658);
                    C0079.m7494(str, C0085.m8236(m8442(), 70, 6, 2317));
                    if (((j) C0095.m9227(m8441(), str, jVar)) != null) {
                        StringBuilder sb = new StringBuilder();
                        C0101.m11052(sb, C0092.m8731(m8442(), 76, 64, 3033));
                        C0101.m11052(sb, str);
                        C0101.m11052(sb, C0101.m11060(m8442(), 140, 35, 2132));
                        C0082.m7988(sb, jVar);
                        throw new g(C0099.m10924(sb));
                    }
                }
                C0087.m8448(new HashSet(C0104.m11226(m8441())));
            } catch (Throwable th) {
                throw th;
            }
        }
        C0105.m11273(m8440(), jVar);
    }
}
