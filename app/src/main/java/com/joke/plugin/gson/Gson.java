package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.CollectionTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.bind.JsonTreeWriter;
import com.joke.plugin.gson.internal.bind.MapTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.plugin.gson.stream.MalformedJsonException;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    final List<TypeAdapterFactory> builderFactories;
    final List<TypeAdapterFactory> builderHierarchyFactories;
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List<TypeAdapterFactory> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, InstanceCreator<?>> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final LongSerializationPolicy longSerializationPolicy;
    final boolean prettyPrinting;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f160short = {2495, 2507, 2539, 2481, 2460, 1350, 1375, 1347, 1346, 1324, 1384, 1379, 1391, 1401, 1377, 1385, 1378, 1400, 1324, 1403, 1389, 1407, 1324, 1378, 1379, 1400, 1324, 1386, 1401, 1376, 1376, 1397, 1324, 1391, 1379, 1378, 1407, 1401, 1377, 1385, 1384, 1314, 1902, 1831, 1853, 1902, 1824, 1825, 1850, 1902, 1839, 1902, 1848, 1839, 1826, 1831, 1834, 1902, 1834, 1825, 1851, 1836, 1826, 1835, 1902, 1848, 1839, 1826, 1851, 1835, 1902, 1839, 1853, 1902, 1854, 1835, 1852, 1902, 1796, 1821, 1793, 1792, 1902, 1853, 1854, 1835, 1837, 1831, 1832, 1831, 1837, 1839, 1850, 1831, 1825, 1824, 1888, 1902, 1818, 1825, 1902, 1825, 1848, 1835, 1852, 1852, 1831, 1834, 1835, 1902, 1850, 1830, 1831, 1853, 1902, 1836, 1835, 1830, 1839, 1848, 1831, 1825, 1852, 1890, 1902, 1851, 1853, 1835, 1902, 1801, 1853, 1825, 1824, 1804, 1851, 1831, 1826, 1834, 1835, 1852, 1888, 1853, 1835, 1852, 1831, 1839, 1826, 1831, 1844, 1835, 1821, 1854, 1835, 1837, 1831, 1839, 1826, 1800, 1826, 1825, 1839, 1850, 1831, 1824, 1833, 1822, 1825, 1831, 1824, 1850, 1816, 1839, 1826, 1851, 1835, 1853, 1894, 1895, 1902, 1827, 1835, 1850, 1830, 1825, 1834, 1888, 575, 525, 525, 539, 524, 522, 535, 529, 528, 571, 524, 524, 529, 524, 606, 598, 569, 557, 561, 560, 606, 588, 592, 582, 592, 590, 592, 591, 599, 580, 606, 2817, 2837, 2825, 2824, 2918, 2926, 2932, 2920, 2942, 2920, 2934, 2920, 2935, 2927, 2918, 2853, 2855, 2856, 2856, 2857, 2866, 2918, 2862, 2855, 2856, 2850, 2858, 2851, 2918, 1154, 1174, 1162, 1163, 1253, 1190, 1188, 1195, 1195, 1194, 1201, 1253, 1206, 1184, 1207, 1196, 1188, 1193, 1196, 1215, 1184, 1253, 700, 712, 744, 690, 671, 420, 420, 2375, 2421, 2421, 2403, 2420, 2418, 2415, 2409, 2408, 2371, 2420, 2420, 2409, 2420, 2342, 2350, 2369, 2389, 2377, 2376, 2342, 2356, 2344, 2366, 2344, 2358, 2344, 2359, 2351, 2364, 2342, 1920, 1970, 1970, 1956, 1971, 1973, 1960, 1966, 1967, 1924, 1971, 1971, 1966, 1971, 2017, 2025, 1926, 1938, 1934, 1935, 2017, 2035, 2031, 2041, 2031, 2033, 2031, 2032, 2024, 2043, 2017, 883, 891, 877, 890, 865, 873, 868, 865, 882, 877, 838, 893, 868, 868, 891, 818, 954, 1008, 1015, 1013, 994, 1017, 996, 1023, 1011, 997, 940, 2531, 2470, 2465, 2492, 2491, 2478, 2465, 2476, 2474, 2444, 2493, 2474, 2478, 2491, 2464, 2493, 2492, 2549, 1356};
    private static final String JSON_NON_EXECUTABLE_PREFIX = C0078.m7427(m4934(), 0, 5, 2454);
    private static final TypeToken<?> NULL_KEY_SURROGATE = C0026.m2249(Object.class);

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> delegate;

        /* JADX INFO: renamed from: ۟۟ۥۦ۟, reason: not valid java name and contains not printable characters */
        public static TypeAdapter m4959(Object obj) {
            if (C0063.m4427() >= 0) {
                return ((FutureTypeAdapter) obj).delegate;
            }
            return null;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            TypeAdapter typeAdapterM4959 = m4959(this);
            if (typeAdapterM4959 != null) {
                return (T) C0064.m4557(typeAdapterM4959, jsonReader);
            }
            throw new IllegalStateException();
        }

        public void setDelegate(TypeAdapter<T> typeAdapter) {
            if (m4959(this) != null) {
                throw new AssertionError();
            }
            this.delegate = typeAdapter;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) {
            TypeAdapter typeAdapterM4959 = m4959(this);
            if (typeAdapterM4959 == null) {
                throw new IllegalStateException();
            }
            C0078.m7431(typeAdapterM4959, jsonWriter, t);
        }
    }

    public Gson() {
        this(C0066.m4832(), C0019.m1318(), C0070.m5897(), false, false, false, true, false, false, false, C0026.m2271(), null, 2, 2, C0037.m3866(), C0037.m3866(), C0037.m3866());
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static JsonAdapterAnnotationTypeAdapterFactory m4925(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Gson) obj).jsonAdapterFactory;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static FieldNamingStrategy m4926(Object obj) {
        if (C0072.m6216() > 0) {
            return ((Gson) obj).fieldNamingStrategy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static TypeToken m4927() {
        if (C0076.m6903() < 0) {
            return NULL_KEY_SURROGATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4928(Object obj) {
        if (C0064.m4578() > 0) {
            return ((Gson) obj).generateNonExecutableJson;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4929(Object obj) {
        if (C0024.m2011() < 0) {
            return ((Gson) obj).serializeNulls;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m4930(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Gson) obj).calls;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static ConstructorConstructor m4931(Object obj) {
        if (C0016.m717() <= 0) {
            return ((Gson) obj).constructorConstructor;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4932(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((Gson) obj).lenient;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static Excluder m4933(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((Gson) obj).excluder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4934() {
        if (C0016.m717() < 0) {
            return f160short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4935(Object obj) {
        if (C0017.m846() >= 0) {
            return atomicLongAdapter((TypeAdapter) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4936(Object obj) {
        if (C0035.m3569() <= 0) {
            return ((Gson) obj).htmlSafe;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4937(Object obj, boolean z) {
        if (C0030.m2940() >= 0) {
            return ((Gson) obj).floatAdapter(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4938(Object obj) {
        if (C0071.m6069() > 0) {
            return atomicLongArrayAdapter((TypeAdapter) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static List m4939(Object obj) {
        if (C0070.m5903() >= 0) {
            return DesugarCollections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static List m4940(Object obj) {
        if (C0067.m5468() < 0) {
            return ((Gson) obj).factories;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m4941(Object obj, boolean z) {
        if (C0076.m6903() < 0) {
            return ((Gson) obj).doubleAdapter(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static boolean m4942(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((Gson) obj).prettyPrinting;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static Map m4943(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((Gson) obj).typeTokenCache;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۡۤ, reason: contains not printable characters */
    public static TypeAdapter m4944(Object obj) {
        if (C0032.m3184() <= 0) {
            return longAdapter((LongSerializationPolicy) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4945(Object obj, Object obj2) {
        if (C0028.m2593() > 0) {
            ((FutureTypeAdapter) obj).setDelegate((TypeAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4946(Object obj, Object obj2) {
        if (C0073.m6356() < 0) {
            assertFullConsumption(obj, (JsonReader) obj2);
        }
    }

    public <T> T fromJson(String str, Class<T> cls) {
        return (T) C0066.m4818(C0073.m6359(cls), C0029.m2806(this, str, cls));
    }

    public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
        boolean z;
        TypeAdapter<T> typeAdapter = (TypeAdapter) C0072.m6108(m4943(this), typeToken == null ? m4927() : typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Object map = (Map) C0016.m641(m4930(this));
        if (map == null) {
            map = new HashMap();
            C0019.m1191(m4930(this), map);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) C0072.m6108(map, typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            C0035.m3624(map, typeToken, futureTypeAdapter2);
            Iterator itM4732 = C0065.m4732(m4940(this));
            while (C0036.m3657(itM4732)) {
                TypeAdapter<T> typeAdapterM6462 = C0074.m6462((TypeAdapterFactory) C0071.m6012(itM4732), this, typeToken);
                if (typeAdapterM6462 != null) {
                    m4945(futureTypeAdapter2, typeAdapterM6462);
                    C0035.m3624(m4943(this), typeToken, typeAdapterM6462);
                    return typeAdapterM6462;
                }
            }
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0018.m1070(m4934(), 217, 29, 2886));
            C0036.m3741(sb, typeToken);
            throw new IllegalArgumentException(C0068.m5536(sb));
        } finally {
            C0065.m4661(map, typeToken);
            if (z) {
                C0023.m1813(m4930(this));
            }
        }
    }

    public String toJson(Object obj) {
        return obj == null ? C0027.m2504(this, C0077.m7274()) : C0030.m2871(this, obj, C0030.m2951(obj));
    }

    public JsonElement toJsonTree(Object obj) {
        return obj == null ? C0077.m7274() : C0065.m4747(this, obj, C0030.m2951(obj));
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (C0022.m1758(jsonReader) == C0036.m3659()) {
                } else {
                    throw new JsonIOException(C0019.m1189(m4934(), 5, 37, 1292));
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
        return C0077.m7296(new TypeAdapter<AtomicLong>() { // from class: com.joke.plugin.gson.Gson.4
            /* JADX INFO: renamed from: ۠۠ۡۤ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m4953(Object obj) {
                if (C0030.m2940() >= 0) {
                    return typeAdapter;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۠ۧۨۡ, reason: not valid java name and contains not printable characters */
            public static void m4954(Object obj, Object obj2, Object obj3) {
                if (C0025.m2132() >= 0) {
                    ((AnonymousClass4) obj).write2((JsonWriter) obj2, (AtomicLong) obj3);
                }
            }

            /* JADX INFO: renamed from: ۨ۠, reason: not valid java name and contains not printable characters */
            public static AtomicLong m4955(Object obj, Object obj2) {
                if (C0076.m6903() <= 0) {
                    return ((AnonymousClass4) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ AtomicLong read(JsonReader jsonReader) {
                return m4955(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicLong atomicLong) {
                m4954(this, jsonWriter, atomicLong);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public AtomicLong read2(JsonReader jsonReader) {
                return new AtomicLong(C0023.m1852((Number) C0064.m4557(m4953(this), jsonReader)));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, AtomicLong atomicLong) {
                C0078.m7431(m4953(this), jsonWriter, C0070.m5853(C0065.m4710(atomicLong)));
            }
        });
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
        return C0077.m7296(new TypeAdapter<AtomicLongArray>() { // from class: com.joke.plugin.gson.Gson.5
            /* JADX INFO: renamed from: ۟ۥۡۥۧ, reason: not valid java name and contains not printable characters */
            public static AtomicLongArray m4956(Object obj, Object obj2) {
                if (C0016.m717() < 0) {
                    return ((AnonymousClass5) obj).read2((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
            public static void m4957(Object obj, Object obj2, Object obj3) {
                if (C0018.m1064() > 0) {
                    ((AnonymousClass5) obj).write2((JsonWriter) obj2, (AtomicLongArray) obj3);
                }
            }

            /* JADX INFO: renamed from: ۦۣ۠۟, reason: contains not printable characters */
            public static TypeAdapter m4958(Object obj) {
                if (C0074.m6454() < 0) {
                    return typeAdapter;
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ AtomicLongArray read(JsonReader jsonReader) {
                return m4956(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
                m4957(this, jsonWriter, atomicLongArray);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public AtomicLongArray read2(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                C0034.m3467(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    C0017.m919(arrayList, C0070.m5853(C0023.m1852((Number) C0064.m4557(m4958(this), jsonReader))));
                }
                C0066.m4839(jsonReader);
                int iM1084 = C0018.m1084(arrayList);
                AtomicLongArray atomicLongArray = new AtomicLongArray(iM1084);
                for (int i = 0; i < iM1084; i++) {
                    C0024.m1932(atomicLongArray, i, C0016.m704((Long) C0064.m4526(arrayList, i)));
                }
                return atomicLongArray;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
                C0035.m3598(jsonWriter);
                int iM3310 = C0033.m3310(atomicLongArray);
                for (int i = 0; i < iM3310; i++) {
                    C0078.m7431(m4958(this), jsonWriter, C0070.m5853(C0065.m4768(atomicLongArray, i)));
                }
                C0111.m13071(jsonWriter);
            }
        });
    }

    private TypeAdapter<Number> doubleAdapter(boolean z) {
        return z ? C0063.m4302() : new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.Gson.1
            /* JADX INFO: renamed from: ۟ۦۢۦۣ, reason: not valid java name and contains not printable characters */
            public static Double m4947(Object obj, Object obj2) {
                if (C0017.m846() >= 0) {
                    return ((AnonymousClass1) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۦ۟ۥۣ, reason: contains not printable characters */
            public static void m4948(Object obj, Object obj2, Object obj3) {
                if (C0030.m2940() >= 0) {
                    ((AnonymousClass1) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ Number read2(JsonReader jsonReader) {
                return m4947(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m4948(this, jsonWriter, number);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0111.m13120(C0025.m2110(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    C0034.m3492(jsonWriter);
                } else {
                    C0034.m3459(C0019.m1261(number));
                    C0071.m5996(jsonWriter, number);
                }
            }
        };
    }

    private TypeAdapter<Number> floatAdapter(boolean z) {
        return z ? C0078.m7352() : new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.Gson.2
            /* JADX INFO: renamed from: ۡۤۦۢ, reason: not valid java name and contains not printable characters */
            public static Float m4949(Object obj, Object obj2) {
                if (C0017.m846() >= 0) {
                    return ((AnonymousClass2) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۦۨ۟, reason: not valid java name and contains not printable characters */
            public static void m4950(Object obj, Object obj2, Object obj3) {
                if (C0035.m3569() <= 0) {
                    ((AnonymousClass2) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ Number read2(JsonReader jsonReader) {
                return m4949(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m4950(this, jsonWriter, number);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0018.m1047((float) C0025.m2110(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    C0034.m3492(jsonWriter);
                } else {
                    C0034.m3459(C0028.m2628(number));
                    C0071.m5996(jsonWriter, number);
                }
            }
        };
    }

    private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == C0026.m2271() ? C0035.m3524() : new TypeAdapter<Number>() { // from class: com.joke.plugin.gson.Gson.3
            /* JADX INFO: renamed from: ۟ۧۥ۠ۤ, reason: not valid java name and contains not printable characters */
            public static Number m4951(Object obj, Object obj2) {
                if (C0038.m4010() > 0) {
                    return ((AnonymousClass3) obj).read((JsonReader) obj2);
                }
                return null;
            }

            /* JADX INFO: renamed from: ۥۦۤ۠, reason: contains not printable characters */
            public static void m4952(Object obj, Object obj2, Object obj3) {
                if (C0037.m3837() < 0) {
                    ((AnonymousClass3) obj).write2((JsonWriter) obj2, (Number) obj3);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) {
                return m4951(this, jsonReader);
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) {
                m4952(this, jsonWriter, number);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.joke.plugin.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) != C0028.m2553()) {
                    return C0070.m5853(C0033.m3379(jsonReader));
                }
                C0065.m4645(jsonReader);
                return null;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    C0034.m3492(jsonWriter);
                } else {
                    C0074.m6506(jsonWriter, C0074.m6524(number));
                }
            }
        };
    }

    public Excluder excluder() {
        return m4933(this);
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return m4926(this);
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        TypeAdapterFactory typeAdapterFactoryM4925 = typeAdapterFactory;
        if (!C0069.m5708(m4940(this), typeAdapterFactoryM4925)) {
            typeAdapterFactoryM4925 = m4925(this);
        }
        Iterator itM4732 = C0065.m4732(m4940(this));
        boolean z = false;
        while (C0036.m3657(itM4732)) {
            TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) C0071.m6012(itM4732);
            if (z) {
                TypeAdapter<T> typeAdapterM6462 = C0074.m6462(typeAdapterFactory2, this, typeToken);
                if (typeAdapterM6462 != null) {
                    return typeAdapterM6462;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactoryM4925) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder(C0074.m6452(m4934(), 246, 22, 1221));
        C0036.m3741(sb, typeToken);
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    public boolean htmlSafe() {
        return m4936(this);
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        C0031.m3022(jsonReader, m4932(this));
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (m4928(this)) {
            C0071.m6090(writer, C0036.m3678(m4934(), 268, 5, 661));
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (m4942(this)) {
            C0068.m5578(jsonWriter, C0064.m4545(m4934(), 273, 2, 388));
        }
        C0032.m3149(jsonWriter, m4929(this));
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return m4929(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0032.m3209(m4934(), 337, 16, 776));
        C0077.m7179(sb, m4929(this));
        C0077.m7290(sb, C0076.m6902(m4934(), 353, 11, 918));
        C0036.m3741(sb, m4940(this));
        C0077.m7290(sb, C0071.m5991(m4934(), 364, 18, 2511));
        C0036.m3741(sb, m4931(this));
        C0077.m7290(sb, C0064.m4545(m4934(), 382, 1, 1329));
        return C0068.m5536(sb);
    }

    public static void checkValidFloatingPoint(double d) {
        if (!C0017.m923(d) && !C0031.m3010(d)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        C0023.m1897(sb, d);
        C0077.m7290(sb, C0072.m6116(m4934(), 42, 144, 1870));
        throw new IllegalArgumentException(C0068.m5536(sb));
    }

    public <T> T fromJson(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) C0028.m2595(this, new StringReader(str), type);
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        C0071.m6072(this, obj, type, stringWriter);
        return C0067.m5490(stringWriter);
    }

    public JsonElement toJsonTree(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        C0039.m4140(this, obj, type, jsonTreeWriter);
        return C0035.m3604(jsonTreeWriter);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) {
        JsonReader jsonReaderM864 = C0017.m864(this, reader);
        Object objM2353 = C0026.m2353(this, jsonReaderM864, cls);
        m4946(objM2353, jsonReaderM864);
        return (T) C0066.m4818(C0073.m6359(cls), objM2353);
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map);
        this.constructorConstructor = constructorConstructor;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        C0017.m919(arrayList, C0070.m5923());
        C0017.m919(arrayList, C0065.m4728());
        C0017.m919(arrayList, excluder);
        C0067.m5504(arrayList, list3);
        C0017.m919(arrayList, C0066.m4867());
        C0017.m919(arrayList, C0035.m3594());
        C0017.m919(arrayList, C0025.m2114());
        C0017.m919(arrayList, C0019.m1215());
        C0017.m919(arrayList, C0035.m3622());
        TypeAdapter typeAdapterM4944 = m4944(longSerializationPolicy);
        C0017.m919(arrayList, C0027.m2459(C0066.m4824(), Long.class, typeAdapterM4944));
        C0017.m919(arrayList, C0027.m2459(C0019.m1278(), Double.class, m4941(this, z7)));
        C0017.m919(arrayList, C0027.m2459(C0068.m5567(), Float.class, m4937(this, z7)));
        C0017.m919(arrayList, C0033.m3253());
        C0017.m919(arrayList, C0075.m6872());
        C0017.m919(arrayList, C0019.m1245());
        C0017.m919(arrayList, C0033.m3340(AtomicLong.class, m4935(typeAdapterM4944)));
        C0017.m919(arrayList, C0033.m3340(AtomicLongArray.class, m4938(typeAdapterM4944)));
        C0017.m919(arrayList, C0063.m4446());
        C0017.m919(arrayList, C0077.m7174());
        C0017.m919(arrayList, C0028.m2659());
        C0017.m919(arrayList, C0027.m2443());
        C0017.m919(arrayList, C0033.m3340(BigDecimal.class, C0074.m6480()));
        C0017.m919(arrayList, C0033.m3340(BigInteger.class, C0039.m4090()));
        C0017.m919(arrayList, C0074.m6467());
        C0017.m919(arrayList, C0029.m2782());
        C0017.m919(arrayList, C0073.m6390());
        C0017.m919(arrayList, C0064.m4496());
        C0017.m919(arrayList, C0070.m5953());
        C0017.m919(arrayList, C0064.m4532());
        C0017.m919(arrayList, C0111.m13188());
        C0017.m919(arrayList, C0072.m6194());
        C0017.m919(arrayList, C0066.m4840());
        C0017.m919(arrayList, C0038.m3945());
        C0017.m919(arrayList, C0025.m2188());
        C0017.m919(arrayList, C0016.m612());
        C0017.m919(arrayList, C0074.m6495());
        C0017.m919(arrayList, C0068.m5595());
        C0017.m919(arrayList, new CollectionTypeAdapterFactory(constructorConstructor));
        C0017.m919(arrayList, new MapTypeAdapterFactory(constructorConstructor, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        C0017.m919(arrayList, jsonAdapterAnnotationTypeAdapterFactory);
        C0017.m919(arrayList, C0073.m6394());
        C0017.m919(arrayList, new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.factories = m4939(arrayList);
    }

    public void toJson(Object obj, Appendable appendable) {
        if (obj != null) {
            C0071.m6072(this, obj, C0030.m2951(obj), appendable);
        } else {
            C0016.m715(this, C0077.m7274(), appendable);
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) {
        try {
            C0039.m4140(this, obj, type, C0026.m2351(this, C0026.m2239(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public <T> T fromJson(Reader reader, Type type) {
        JsonReader jsonReaderM864 = C0017.m864(this, reader);
        T t = (T) C0026.m2353(this, jsonReaderM864, type);
        m4946(t, jsonReaderM864);
        return t;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) {
        String strM3678 = C0036.m3678(m4934(), 306, 31, 1985);
        TypeAdapter typeAdapterM6819 = C0075.m6819(this, C0031.m3033(type));
        boolean zM4080 = C0039.m4080(jsonWriter);
        C0020.m1353(jsonWriter, true);
        boolean zM827 = C0017.m827(jsonWriter);
        C0022.m1723(jsonWriter, m4936(this));
        boolean zM1870 = C0023.m1870(jsonWriter);
        C0032.m3149(jsonWriter, m4929(this));
        try {
            try {
                C0078.m7431(typeAdapterM6819, jsonWriter, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder(strM3678);
                C0077.m7290(sb, C0033.m3375(e2));
                AssertionError assertionError = new AssertionError(C0068.m5536(sb));
                C0070.m5933(assertionError, e2);
                throw assertionError;
            }
        } finally {
            C0020.m1353(jsonWriter, zM4080);
            C0022.m1723(jsonWriter, zM827);
            C0032.m3149(jsonWriter, zM1870);
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) {
        String strM1650 = C0021.m1650(m4934(), 186, 31, 638);
        boolean zM13110 = C0111.m13110(jsonReader);
        boolean z = true;
        C0031.m3022(jsonReader, true);
        try {
            try {
                try {
                    try {
                        C0022.m1758(jsonReader);
                        z = false;
                        return (T) C0064.m4557(C0075.m6819(this, C0031.m3033(type)), jsonReader);
                    } catch (EOFException e) {
                        if (z) {
                            C0031.m3022(jsonReader, zM13110);
                            return null;
                        }
                        throw new JsonSyntaxException(e);
                    } catch (IOException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                } catch (AssertionError e3) {
                    StringBuilder sb = new StringBuilder(strM1650);
                    C0077.m7290(sb, C0033.m3375(e3));
                    AssertionError assertionError = new AssertionError(C0068.m5536(sb));
                    C0070.m5933(assertionError, e3);
                    throw assertionError;
                }
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        } finally {
            C0031.m3022(jsonReader, zM13110);
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return C0075.m6819(this, C0026.m2249(cls));
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) {
        return (T) C0066.m4818(C0073.m6359(cls), C0074.m6464(this, jsonElement, cls));
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        C0016.m715(this, jsonElement, stringWriter);
        return C0067.m5490(stringWriter);
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) {
        if (jsonElement == null) {
            return null;
        }
        return (T) C0026.m2353(this, new JsonTreeReader(jsonElement), type);
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) {
        try {
            C0065.m4749(this, jsonElement, C0026.m2351(this, C0026.m2239(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) {
        String strM2695 = C0029.m2695(m4934(), 275, 31, 2310);
        boolean zM4080 = C0039.m4080(jsonWriter);
        C0020.m1353(jsonWriter, true);
        boolean zM827 = C0017.m827(jsonWriter);
        C0022.m1723(jsonWriter, m4936(this));
        boolean zM1870 = C0023.m1870(jsonWriter);
        C0032.m3149(jsonWriter, m4929(this));
        try {
            try {
                try {
                    C0031.m3059(jsonElement, jsonWriter);
                } catch (AssertionError e) {
                    StringBuilder sb = new StringBuilder(strM2695);
                    C0077.m7290(sb, C0033.m3375(e));
                    AssertionError assertionError = new AssertionError(C0068.m5536(sb));
                    C0070.m5933(assertionError, e);
                    throw assertionError;
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } finally {
            C0020.m1353(jsonWriter, zM4080);
            C0022.m1723(jsonWriter, zM827);
            C0032.m3149(jsonWriter, zM1870);
        }
    }
}
