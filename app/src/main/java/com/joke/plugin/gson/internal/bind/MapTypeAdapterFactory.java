package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
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
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonPrimitive;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.ObjectConstructor;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonToken;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f183short = {3181, 3190, 3183, 3183, 3170, 3187, 3190, 3178, 3183, 3173, 3175, 3186, 3171, 3110, 3181, 3171, 3199, 3132, 3110};
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final TypeAdapter<K> keyTypeAdapter;
        private final TypeAdapter<V> valueTypeAdapter;

        /* JADX INFO: renamed from: ۟ۤۨۦ۟, reason: not valid java name and contains not printable characters */
        public static short[] m5242() {
            if (C0075.m6893() > 0) {
                return f183short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۦۡ, reason: not valid java name and contains not printable characters */
        public static MapTypeAdapterFactory m5243(Object obj) {
            if (C0032.m3184() < 0) {
                return MapTypeAdapterFactory.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۨۢۡ, reason: not valid java name and contains not printable characters */
        public static boolean m5244(Object obj) {
            if (C0025.m2132() >= 0) {
                return ((MapTypeAdapterFactory) obj).complexMapKeySerialization;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
        public static TypeAdapter m5245(Object obj) {
            if (C0077.m7272() <= 0) {
                return ((Adapter) obj).keyTypeAdapter;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۨۡۨ, reason: contains not printable characters */
        public static Map m5246(Object obj, Object obj2) {
            if (C0065.m4647() >= 0) {
                return ((Adapter) obj).read((JsonReader) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦ۟ۨ۠, reason: contains not printable characters */
        public static ObjectConstructor m5247(Object obj) {
            if (C0070.m5903() >= 0) {
                return ((Adapter) obj).constructor;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۢۢ۠, reason: not valid java name and contains not printable characters */
        public static void m5248(Object obj, Object obj2, Object obj3) {
            if (C0030.m2940() >= 0) {
                ((Adapter) obj).write((JsonWriter) obj2, (Map) obj3);
            }
        }

        /* JADX INFO: renamed from: ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
        public static TypeAdapter m5249(Object obj) {
            if (C0073.m6356() < 0) {
                return ((Adapter) obj).valueTypeAdapter;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۥۥ۟, reason: not valid java name and contains not printable characters */
        public static String m5250(Object obj, Object obj2) {
            if (C0027.m2460() > 0) {
                return ((Adapter) obj).keyToString((JsonElement) obj2);
            }
            return null;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
            return m5246(this, jsonReader);
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            m5248(this, jsonWriter, (Map) obj);
        }

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.constructor = objectConstructor;
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public Map<K, V> read(JsonReader jsonReader) {
            JsonToken jsonTokenM1758 = C0022.m1758(jsonReader);
            if (jsonTokenM1758 == C0028.m2553()) {
                C0065.m4645(jsonReader);
                return null;
            }
            Map<K, V> map = (Map) C0022.m1703(m5247(this));
            JsonToken jsonTokenM2811 = C0029.m2811();
            String strM1904 = C0023.m1904(m5242(), 4, 15, 3078);
            if (jsonTokenM1758 == jsonTokenM2811) {
                C0034.m3467(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    C0034.m3467(jsonReader);
                    Object objM4557 = C0064.m4557(m5245(this), jsonReader);
                    if (C0035.m3624(map, objM4557, C0064.m4557(m5249(this), jsonReader)) != null) {
                        StringBuilder sb = new StringBuilder(strM1904);
                        C0036.m3741(sb, objM4557);
                        throw new JsonSyntaxException(C0068.m5536(sb));
                    }
                    C0066.m4839(jsonReader);
                }
                C0066.m4839(jsonReader);
            } else {
                C0028.m2645(jsonReader);
                while (C0078.m7343(jsonReader)) {
                    C0026.m2233(C0026.m2334(), jsonReader);
                    Object objM45572 = C0064.m4557(m5245(this), jsonReader);
                    if (C0035.m3624(map, objM45572, C0064.m4557(m5249(this), jsonReader)) != null) {
                        StringBuilder sb2 = new StringBuilder(strM1904);
                        C0036.m3741(sb2, objM45572);
                        throw new JsonSyntaxException(C0068.m5536(sb2));
                    }
                }
                C0026.m2322(jsonReader);
            }
            return map;
        }

        public void write(JsonWriter jsonWriter, Map<K, V> map) {
            if (map == null) {
                C0034.m3492(jsonWriter);
                return;
            }
            if (!m5244(m5243(this))) {
                C0026.m2305(jsonWriter);
                Iterator itM2001 = C0024.m2001(C0064.m4524(map));
                while (C0036.m3657(itM2001)) {
                    Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
                    C0031.m3057(jsonWriter, C0064.m4588(C0063.m4368(entry)));
                    C0078.m7431(m5249(this), jsonWriter, C0019.m1293(entry));
                }
                C0075.m6797(jsonWriter);
                return;
            }
            ArrayList arrayList = new ArrayList(C0035.m3518(map));
            ArrayList arrayList2 = new ArrayList(C0035.m3518(map));
            Iterator itM20012 = C0024.m2001(C0064.m4524(map));
            int i = 0;
            boolean z = false;
            while (C0036.m3657(itM20012)) {
                Map.Entry entry2 = (Map.Entry) C0071.m6012(itM20012);
                JsonElement jsonElementM5784 = C0069.m5784(m5245(this), C0063.m4368(entry2));
                C0017.m919(arrayList, jsonElementM5784);
                C0017.m919(arrayList2, C0019.m1293(entry2));
                z |= C0029.m2751(jsonElementM5784) || C0066.m4866(jsonElementM5784);
            }
            if (!z) {
                C0026.m2305(jsonWriter);
                int iM1084 = C0018.m1084(arrayList);
                while (i < iM1084) {
                    C0031.m3057(jsonWriter, m5250(this, (JsonElement) C0064.m4526(arrayList, i)));
                    C0078.m7431(m5249(this), jsonWriter, C0064.m4526(arrayList2, i));
                    i++;
                }
                C0075.m6797(jsonWriter);
                return;
            }
            C0035.m3598(jsonWriter);
            int iM10842 = C0018.m1084(arrayList);
            while (i < iM10842) {
                C0035.m3598(jsonWriter);
                C0031.m3059((JsonElement) C0064.m4526(arrayList, i), jsonWriter);
                C0078.m7431(m5249(this), jsonWriter, C0064.m4526(arrayList2, i));
                C0111.m13071(jsonWriter);
                i++;
            }
            C0111.m13071(jsonWriter);
        }

        private String keyToString(JsonElement jsonElement) {
            if (C0063.m4408(jsonElement)) {
                JsonPrimitive jsonPrimitiveM2238 = C0026.m2238(jsonElement);
                if (C0028.m2622(jsonPrimitiveM2238)) {
                    return C0064.m4588(C0074.m6457(jsonPrimitiveM2238));
                }
                if (C0032.m3180(jsonPrimitiveM2238)) {
                    return C0077.m7277(C0111.m13034(jsonPrimitiveM2238));
                }
                if (C0077.m7307(jsonPrimitiveM2238)) {
                    return C0029.m2759(jsonPrimitiveM2238);
                }
                throw new AssertionError();
            }
            if (C0063.m4436(jsonElement)) {
                return C0066.m4828(m5242(), 0, 4, 3075);
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5240(Object obj, Object obj2, Object obj3) {
        if (C0075.m6893() > 0) {
            return ((MapTypeAdapterFactory) obj).getKeyAdapter((Gson) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static ConstructorConstructor m5241(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((MapTypeAdapterFactory) obj).constructorConstructor;
        }
        return null;
    }

    private TypeAdapter<?> getKeyAdapter(Gson gson, Type type) {
        return (type == C0024.m2007() || type == Boolean.class) ? C0038.m3923() : C0075.m6819(gson, C0031.m3033(type));
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z;
    }

    @Override // com.joke.plugin.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type typeM5860 = C0070.m5860(typeToken);
        if (!C0031.m2999(Map.class, C0034.m3474(typeToken))) {
            return null;
        }
        Type[] typeArrM4403 = C0063.m4403(typeM5860, C0038.m3971(typeM5860));
        return new Adapter(gson, typeArrM4403[0], m5240(this, gson, typeArrM4403[0]), typeArrM4403[1], C0075.m6819(gson, C0031.m3033(typeArrM4403[1])), C0033.m3268(m5241(this), typeToken));
    }
}
