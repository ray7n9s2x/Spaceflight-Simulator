package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.FieldNamingStrategy;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.JsonAdapter;
import com.joke.plugin.gson.annotations.SerializedName;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.Excluder;
import com.joke.plugin.gson.internal.ObjectConstructor;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.internal.reflect.ReflectionAccessor;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f184short = {3205, 3265, 3264, 3270, 3273, 3268, 3287, 3264, 3286, 3205, 3272, 3280, 3273, 3281, 3276, 3285, 3273, 3264, 3205, 3311, 3318, 3306, 3307, 3205, 3267, 3276, 3264, 3273, 3265, 3286, 3205, 3275, 3268, 3272, 3264, 3265, 3205};
    private final ReflectionAccessor accessor = C0035.m3520();
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
        public static boolean m5271(Object obj, Object obj2) {
            if (C0111.m13165() < 0) {
                return ((BoundField) obj).writeField(obj2);
            }
            return false;
        }

        /* JADX INFO: renamed from: ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
        public static void m5272(Object obj, Object obj2, Object obj3) {
            if (C0077.m7272() <= 0) {
                ((BoundField) obj).write((JsonWriter) obj2, obj3);
            }
        }

        /* JADX INFO: renamed from: ۟ۦۥۥۣ, reason: not valid java name and contains not printable characters */
        public static String m5273(Object obj) {
            if (C0077.m7272() < 0) {
                return ((BoundField) obj).name;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
        public static void m5274(Object obj, Object obj2, Object obj3) {
            if (C0063.m4427() > 0) {
                ((BoundField) obj).read((JsonReader) obj2, obj3);
            }
        }

        /* JADX INFO: renamed from: ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
        public static ObjectConstructor m5275(Object obj) {
            if (C0020.m1385() <= 0) {
                return ((Adapter) obj).constructor;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤۦۤۧ, reason: not valid java name and contains not printable characters */
        public static Map m5276(Object obj) {
            if (C0035.m3569() <= 0) {
                return ((Adapter) obj).boundFields;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۡ۟, reason: not valid java name and contains not printable characters */
        public static boolean m5277(Object obj) {
            if (C0027.m2460() >= 0) {
                return ((BoundField) obj).deserialized;
            }
            return false;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) {
            if (t == null) {
                C0034.m3492(jsonWriter);
                return;
            }
            C0026.m2305(jsonWriter);
            try {
                Iterator itM4820 = C0066.m4820(C0111.m13105(m5276(this)));
                while (C0036.m3657(itM4820)) {
                    BoundField boundField = (BoundField) C0071.m6012(itM4820);
                    if (m5271(boundField, t)) {
                        C0031.m3057(jsonWriter, m5273(boundField));
                        m5272(boundField, jsonWriter, t);
                    }
                }
                C0075.m6797(jsonWriter);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            if (C0022.m1758(jsonReader) == C0028.m2553()) {
                C0065.m4645(jsonReader);
                return null;
            }
            T t = (T) C0022.m1703(m5275(this));
            try {
                C0028.m2645(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    BoundField boundField = (BoundField) C0072.m6108(m5276(this), C0018.m1077(jsonReader));
                    if (boundField != null && m5277(boundField)) {
                        m5274(boundField, jsonReader, t);
                    } else {
                        C0038.m3960(jsonReader);
                    }
                }
                C0026.m2322(jsonReader);
                return t;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    private BoundField createBoundField(final Gson gson, final Field field, String str, final TypeToken<?> typeToken, boolean z, boolean z2) {
        final boolean zM1664 = C0022.m1664(C0034.m3474(typeToken));
        JsonAdapter jsonAdapter = (JsonAdapter) C0037.m3791(field, JsonAdapter.class);
        TypeAdapter typeAdapterM5729 = jsonAdapter != null ? C0069.m5729(m5256(this), m5254(this), gson, typeToken, jsonAdapter) : null;
        final boolean z3 = typeAdapterM5729 != null;
        if (typeAdapterM5729 == null) {
            typeAdapterM5729 = C0075.m6819(gson, typeToken);
        }
        final TypeAdapter typeAdapter = typeAdapterM5729;
        return new BoundField(str, z, z2) { // from class: com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            /* JADX INFO: renamed from: ۟ۡ۟۠ۤ, reason: not valid java name and contains not printable characters */
            public static boolean m5264(Object obj) {
                if (C0070.m5903() > 0) {
                    return ((BoundField) obj).serialized;
                }
                return false;
            }

            /* JADX INFO: renamed from: ۟ۡۡۥ۠, reason: not valid java name and contains not printable characters */
            public static Gson m5265(Object obj) {
                if (C0035.m3569() <= 0) {
                    return gson;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
            public static boolean m5266(Object obj) {
                if (C0076.m6903() < 0) {
                    return z3;
                }
                return false;
            }

            /* JADX INFO: renamed from: ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
            public static Field m5267(Object obj) {
                if (C0023.m1921() >= 0) {
                    return field;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۢۨۧ۠, reason: not valid java name and contains not printable characters */
            public static boolean m5268(Object obj) {
                if (C0077.m7272() < 0) {
                    return zM1664;
                }
                return false;
            }

            /* JADX INFO: renamed from: ۧ۠ۡۥ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5269(Object obj) {
                if (C0029.m2791() > 0) {
                    return typeAdapter;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
            public static TypeToken m5270(Object obj) {
                if (C0020.m1385() < 0) {
                    return typeToken;
                }
                return null;
            }

            @Override // com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void read(JsonReader jsonReader, Object obj) throws IllegalAccessException {
                Object objM4557 = C0064.m4557(m5269(this), jsonReader);
                if (objM4557 == null && m5268(this)) {
                    return;
                }
                C0018.m1091(m5267(this), obj, objM4557);
            }

            @Override // com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) {
                C0078.m7431(m5266(this) ? m5269(this) : new TypeAdapterRuntimeTypeWrapper(m5265(this), m5269(this), C0070.m5860(m5270(this))), jsonWriter, C0067.m5443(m5267(this), obj));
            }

            @Override // com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public boolean writeField(Object obj) {
                return m5264(this) && C0067.m5443(m5267(this), obj) != obj;
            }
        };
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static ConstructorConstructor m5254(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((ReflectiveTypeAdapterFactory) obj).constructorConstructor;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static ReflectionAccessor m5255(Object obj) {
        if (C0078.m7450() > 0) {
            return ((ReflectiveTypeAdapterFactory) obj).accessor;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static JsonAdapterAnnotationTypeAdapterFactory m5256(Object obj) {
        if (C0018.m1064() > 0) {
            return ((ReflectiveTypeAdapterFactory) obj).jsonAdapterFactory;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static Excluder m5257(Object obj) {
        if (C0028.m2593() > 0) {
            return ((ReflectiveTypeAdapterFactory) obj).excluder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static List m5258(Object obj, Object obj2) {
        if (C0026.m2298() <= 0) {
            return ((ReflectiveTypeAdapterFactory) obj).getFieldNames((Field) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Map m5259(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0069.m5781() < 0) {
            return ((ReflectiveTypeAdapterFactory) obj).getBoundFields((Gson) obj2, (TypeToken) obj3, (Class) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static BoundField m5260(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2) {
        if (C0020.m1385() <= 0) {
            return ((ReflectiveTypeAdapterFactory) obj).createBoundField((Gson) obj2, (Field) obj3, (String) obj4, (TypeToken) obj5, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5261() {
        if (C0077.m7272() < 0) {
            return f184short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static FieldNamingStrategy m5262(Object obj) {
        if (C0069.m5781() < 0) {
            return ((ReflectiveTypeAdapterFactory) obj).fieldNamingPolicy;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5263(Object obj) {
        if (C0018.m1064() > 0) {
            return ((BoundField) obj).name;
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        return C0068.m5534(field, z, m5257(this));
    }

    public static abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        public abstract void read(JsonReader jsonReader, Object obj);

        public abstract void write(JsonWriter jsonWriter, Object obj);

        public abstract boolean writeField(Object obj);

        public BoundField(String str, boolean z, boolean z2) {
            this.name = str;
            this.serialized = z;
            this.deserialized = z2;
        }
    }

    public static boolean excludeField(Field field, boolean z, Excluder excluder) {
        return (C0031.m3023(excluder, C0111.m13067(field), z) || C0019.m1292(excluder, field, z)) ? false : true;
    }

    private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C0025.m2202(cls)) {
            return linkedHashMap;
        }
        Type typeM5860 = C0070.m5860(typeToken);
        TypeToken<?> typeTokenM3033 = typeToken;
        Class<?> clsM3474 = cls;
        while (clsM3474 != Object.class) {
            Field[] fieldArrM2655 = C0028.m2655(clsM3474);
            int length = fieldArrM2655.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = fieldArrM2655[i];
                boolean zM2270 = C0026.m2270(this, field, true);
                boolean zM22702 = C0026.m2270(this, field, z);
                if (zM2270 || zM22702) {
                    C0026.m2325(m5255(this), field);
                    Type typeM6574 = C0074.m6574(C0070.m5860(typeTokenM3033), clsM3474, C0020.m1431(field));
                    List listM5258 = m5258(this, field);
                    int iM3427 = C0034.m3427(listM5258);
                    BoundField boundField = null;
                    int i2 = 0;
                    while (i2 < iM3427) {
                        String str = (String) C0071.m6078(listM5258, i2);
                        boolean z2 = i2 != 0 ? false : zM2270;
                        int i3 = i2;
                        BoundField boundField2 = boundField;
                        int i4 = iM3427;
                        List list = listM5258;
                        Field field2 = field;
                        boundField = boundField2 == null ? (BoundField) C0035.m3624(linkedHashMap, str, m5260(this, gson, field, str, C0031.m3033(typeM6574), z2, zM22702)) : boundField2;
                        i2 = i3 + 1;
                        zM2270 = z2;
                        listM5258 = list;
                        iM3427 = i4;
                        field = field2;
                    }
                    BoundField boundField3 = boundField;
                    if (boundField3 != null) {
                        StringBuilder sb = new StringBuilder();
                        C0036.m3741(sb, typeM5860);
                        C0077.m7290(sb, C0021.m1650(m5261(), 0, 37, 3237));
                        C0077.m7290(sb, m5263(boundField3));
                        throw new IllegalArgumentException(C0068.m5536(sb));
                    }
                }
                i++;
                z = false;
            }
            typeTokenM3033 = C0031.m3033(C0074.m6574(C0070.m5860(typeTokenM3033), clsM3474, C0074.m6547(clsM3474)));
            clsM3474 = C0034.m3474(typeTokenM3033);
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) C0037.m3791(field, SerializedName.class);
        if (serializedName == null) {
            return C0111.m13086(C0025.m2207(m5262(this), field));
        }
        String strM1850 = C0023.m1850(serializedName);
        String[] strArrM13150 = C0111.m13150(serializedName);
        if (strArrM13150.length == 0) {
            return C0111.m13086(strM1850);
        }
        ArrayList arrayList = new ArrayList(strArrM13150.length + 1);
        C0017.m919(arrayList, strM1850);
        for (String str : strArrM13150) {
            C0017.m919(arrayList, str);
        }
        return arrayList;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    @Override // com.joke.plugin.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class clsM3474 = C0034.m3474(typeToken);
        if (!C0031.m2999(Object.class, clsM3474)) {
            return null;
        }
        return new Adapter(C0033.m3268(m5254(this), typeToken), m5259(this, gson, typeToken, clsM3474));
    }
}
