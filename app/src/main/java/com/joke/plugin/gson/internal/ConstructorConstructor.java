package com.joke.plugin.gson.internal;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.InstanceCreator;
import com.joke.plugin.gson.JsonIOException;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.internal.reflect.ReflectionAccessor;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstructorConstructor {
    private final ReflectionAccessor accessor = C0035.m3520();
    private final Map<Type, InstanceCreator<?>> instanceCreators;

    private <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls) {
        try {
            final Constructor constructorM4300 = C0063.m4300(cls, null);
            if (!C0036.m3704(constructorM4300)) {
                C0026.m2325(m5022(this), constructorM4300);
            }
            return new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.3

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f170short = {1985, 1942, 1928, 1941, 1929, 1985, 1935, 1934, 1985, 1920, 1939, 1926, 1938, 3294, 3321, 3313, 3316, 3325, 3324, 3256, 3308, 3319, 3256, 3313, 3318, 3310, 3319, 3315, 3325, 3256};

                /* JADX INFO: renamed from: ۟ۢۦۦۡ, reason: not valid java name and contains not printable characters */
                public static short[] m5033() {
                    if (C0029.m2791() >= 0) {
                        return f170short;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۦۣۣۤ, reason: contains not printable characters */
                public static Constructor m5034(Object obj) {
                    if (C0017.m846() > 0) {
                        return constructorM4300;
                    }
                    return null;
                }

                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    String strM2404 = C0027.m2404(m5033(), 0, 13, 2017);
                    String strM5991 = C0071.m5991(m5033(), 13, 17, 3224);
                    try {
                        return (T) C0019.m1220(m5034(this), null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        StringBuilder sb = new StringBuilder(strM5991);
                        C0036.m3741(sb, m5034(this));
                        C0077.m7290(sb, strM2404);
                        throw new RuntimeException(C0068.m5536(sb), e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sb2 = new StringBuilder(strM5991);
                        C0036.m3741(sb2, m5034(this));
                        C0077.m7290(sb2, strM2404);
                        throw new RuntimeException(C0068.m5536(sb2), C0029.m2710(e3));
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Map m5020(Object obj) {
        if (C0039.m4109() >= 0) {
            return ((ConstructorConstructor) obj).instanceCreators;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static ObjectConstructor m5021(Object obj, Object obj2, Object obj3) {
        if (C0064.m4578() >= 0) {
            return ((ConstructorConstructor) obj).newDefaultImplementationConstructor((Type) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static ReflectionAccessor m5022(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((ConstructorConstructor) obj).accessor;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static ObjectConstructor m5023(Object obj, Object obj2, Object obj3) {
        if (C0016.m717() <= 0) {
            return ((ConstructorConstructor) obj).newUnsafeAllocator((Type) obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۡ, reason: not valid java name and contains not printable characters */
    public static ObjectConstructor m5024(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            return ((ConstructorConstructor) obj).newDefaultConstructor((Class) obj2);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newDefaultImplementationConstructor(final Type type, Class<? super T> cls) {
        if (C0031.m2999(Collection.class, cls)) {
            return C0031.m2999(SortedSet.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.4
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new TreeSet();
                }
            } : C0031.m2999(EnumSet.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.5

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f171short = {2331, 2364, 2340, 2355, 2366, 2363, 2358, 2418, 2327, 2364, 2343, 2367, 2305, 2359, 2342, 2418, 2342, 2347, 2338, 2359, 2408, 2418};

                /* JADX INFO: renamed from: ۟ۢۦۡۨ, reason: not valid java name and contains not printable characters */
                public static Type m5035(Object obj) {
                    if (C0035.m3569() < 0) {
                        return type;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۟ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
                public static short[] m5036() {
                    if (C0070.m5903() > 0) {
                        return f171short;
                    }
                    return null;
                }

                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    Type typeM5035 = m5035(this);
                    boolean z = typeM5035 instanceof ParameterizedType;
                    String strM4022 = C0038.m4022(m5036(), 0, 22, 2386);
                    if (!z) {
                        StringBuilder sb = new StringBuilder(strM4022);
                        C0077.m7290(sb, C0074.m6524(m5035(this)));
                        throw new JsonIOException(C0068.m5536(sb));
                    }
                    Type type2 = C0023.m1911((ParameterizedType) typeM5035)[0];
                    if (type2 instanceof Class) {
                        return (T) C0028.m2648((Class) type2);
                    }
                    StringBuilder sb2 = new StringBuilder(strM4022);
                    C0077.m7290(sb2, C0074.m6524(m5035(this)));
                    throw new JsonIOException(C0068.m5536(sb2));
                }
            } : C0031.m2999(Set.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.6
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new LinkedHashSet();
                }
            } : C0031.m2999(Queue.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.7
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new ArrayDeque();
                }
            } : new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.8
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new ArrayList();
                }
            };
        }
        if (C0031.m2999(Map.class, cls)) {
            return C0031.m2999(ConcurrentNavigableMap.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.9
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new ConcurrentSkipListMap();
                }
            } : C0031.m2999(ConcurrentMap.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.10
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new ConcurrentHashMap();
                }
            } : C0031.m2999(SortedMap.class, cls) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.11
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || C0031.m2999(String.class, C0034.m3474(C0031.m3033(C0023.m1911((ParameterizedType) type)[0])))) ? new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.13
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new LinkedTreeMap();
                }
            } : new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.12
                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new LinkedHashMap();
                }
            };
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(final Type type, final Class<? super T> cls) {
        return new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.14

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f169short = {1847, 1804, 1795, 1792, 1806, 1799, 1858, 1814, 1805, 1858, 1803, 1804, 1812, 1805, 1801, 1799, 1858, 1804, 1805, 1871, 1795, 1808, 1797, 1809, 1858, 1793, 1805, 1804, 1809, 1814, 1808, 1815, 1793, 1814, 1805, 1808, 1858, 1796, 1805, 1808, 1858, 2288, 2302, 2188, 2235, 2233, 2231, 2221, 2218, 2235, 2220, 2231, 2224, 2233, 2302, 2239, 2224, 2302, 2199, 2224, 2221, 2218, 2239, 2224, 2237, 2235, 2205, 2220, 2235, 2239, 2218, 2225, 2220, 2302, 2217, 2231, 2218, 2230, 2302, 2201, 2221, 2225, 2224, 2302, 2232, 2225, 2220, 2302, 2218, 2230, 2231, 2221, 2302, 2218, 2215, 2222, 2235, 2302, 2227, 2239, 2215, 2302, 2232, 2231, 2214, 2302, 2218, 2230, 2231, 2221, 2302, 2222, 2220, 2225, 2236, 2226, 2235, 2227, 2288};
            private final UnsafeAllocator unsafeAllocator = C0063.m4308();

            /* JADX INFO: renamed from: ۟۟ۧ۟۠, reason: not valid java name and contains not printable characters */
            public static Type m5027(Object obj) {
                if (C0020.m1385() < 0) {
                    return type;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۤۧۡۤ, reason: not valid java name and contains not printable characters */
            public static UnsafeAllocator m5028(Object obj) {
                if (C0033.m3358() < 0) {
                    return ((AnonymousClass14) obj).unsafeAllocator;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۡۧۦۥ, reason: not valid java name and contains not printable characters */
            public static Class m5029(Object obj) {
                if (C0076.m6903() <= 0) {
                    return cls;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۥۢۨۥ, reason: contains not printable characters */
            public static short[] m5030() {
                if (C0019.m1311() <= 0) {
                    return f169short;
                }
                return null;
            }

            @Override // com.joke.plugin.gson.internal.ObjectConstructor
            public T construct() {
                try {
                    return (T) C0034.m3470(m5028(this), m5029(this));
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder(C0032.m3209(m5030(), 0, 41, 1890));
                    C0036.m3741(sb, m5027(this));
                    C0077.m7290(sb, C0064.m4545(m5030(), 41, 78, 2270));
                    throw new RuntimeException(C0068.m5536(sb), e);
                }
            }
        };
    }

    public String toString() {
        return C0074.m6524(m5020(this));
    }

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map) {
        this.instanceCreators = map;
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        final Type typeM5860 = C0070.m5860(typeToken);
        Class clsM3474 = C0034.m3474(typeToken);
        final InstanceCreator instanceCreator = (InstanceCreator) C0072.m6108(m5020(this), typeM5860);
        if (instanceCreator != null) {
            return new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.1
                /* JADX INFO: renamed from: ۣ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
                public static InstanceCreator m5025(Object obj) {
                    if (C0068.m5678() >= 0) {
                        return instanceCreator;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۟ۦۢۥ۟, reason: not valid java name and contains not printable characters */
                public static Type m5026(Object obj) {
                    if (C0073.m6356() < 0) {
                        return typeM5860;
                    }
                    return null;
                }

                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) C0035.m3639(m5025(this), m5026(this));
                }
            };
        }
        final InstanceCreator instanceCreator2 = (InstanceCreator) C0072.m6108(m5020(this), clsM3474);
        if (instanceCreator2 != null) {
            return new ObjectConstructor<T>() { // from class: com.joke.plugin.gson.internal.ConstructorConstructor.2
                /* JADX INFO: renamed from: ۢۨۨ۟, reason: not valid java name and contains not printable characters */
                public static Type m5031(Object obj) {
                    if (C0072.m6216() > 0) {
                        return typeM5860;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۦۢۨۤ, reason: contains not printable characters */
                public static InstanceCreator m5032(Object obj) {
                    if (C0028.m2593() > 0) {
                        return instanceCreator2;
                    }
                    return null;
                }

                @Override // com.joke.plugin.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) C0035.m3639(m5032(this), m5031(this));
                }
            };
        }
        ObjectConstructor<T> objectConstructorM5024 = m5024(this, clsM3474);
        if (objectConstructorM5024 != null) {
            return objectConstructorM5024;
        }
        ObjectConstructor<T> objectConstructorM5021 = m5021(this, typeM5860, clsM3474);
        if (objectConstructorM5021 != null) {
            return objectConstructorM5021;
        }
        return m5023(this, typeM5860, clsM3474);
    }
}
