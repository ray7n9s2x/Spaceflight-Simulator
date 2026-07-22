package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonDeserializationContext;
import com.joke.plugin.gson.JsonDeserializer;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonSerializationContext;
import com.joke.plugin.gson.JsonSerializer;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context = new GsonContextImpl(this, null);
    private TypeAdapter<T> delegate;
    private final JsonDeserializer<T> deserializer;
    final Gson gson;
    private final JsonSerializer<T> serializer;
    private final TypeAdapterFactory skipPast;
    private final TypeToken<T> typeToken;

    /* JADX INFO: renamed from: com.joke.plugin.gson.internal.bind.TreeTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        private GsonContextImpl() {
        }

        /* JADX INFO: renamed from: ۟ۢ۠ۢۢ, reason: not valid java name and contains not printable characters */
        public static TreeTypeAdapter m5290(Object obj) {
            if (C0017.m846() > 0) {
                return TreeTypeAdapter.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۥ۟ۦ, reason: not valid java name and contains not printable characters */
        public static Gson m5291(Object obj) {
            if (C0075.m6893() > 0) {
                return ((TreeTypeAdapter) obj).gson;
            }
            return null;
        }

        @Override // com.joke.plugin.gson.JsonSerializationContext
        public JsonElement serialize(Object obj) {
            return C0030.m2944(m5291(m5290(this)), obj);
        }

        public /* synthetic */ GsonContextImpl(TreeTypeAdapter treeTypeAdapter, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.joke.plugin.gson.JsonDeserializationContext
        public <R> R deserialize(JsonElement jsonElement, Type type) {
            return (R) C0074.m6464(m5291(m5290(this)), jsonElement, type);
        }

        @Override // com.joke.plugin.gson.JsonSerializationContext
        public JsonElement serialize(Object obj, Type type) {
            return C0065.m4747(m5291(m5290(this)), obj, type);
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {
        private final JsonDeserializer<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final JsonSerializer<?> serializer;

        /* JADX INFO: renamed from: ۟ۥۦۨۥ, reason: not valid java name and contains not printable characters */
        public static JsonDeserializer m5292(Object obj) {
            if (C0064.m4578() >= 0) {
                return ((SingleTypeFactory) obj).deserializer;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
        public static TypeToken m5293(Object obj) {
            if (C0020.m1385() <= 0) {
                return ((SingleTypeFactory) obj).exactType;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
        public static boolean m5294(Object obj) {
            if (C0070.m5903() > 0) {
                return ((SingleTypeFactory) obj).matchRawType;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
        public static Class m5295(Object obj) {
            if (C0066.m4827() > 0) {
                return ((SingleTypeFactory) obj).hierarchyType;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۨۡۢ, reason: not valid java name and contains not printable characters */
        public static JsonSerializer m5296(Object obj) {
            if (C0064.m4578() > 0) {
                return ((SingleTypeFactory) obj).serializer;
            }
            return null;
        }

        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken typeTokenM5293 = m5293(this);
            if (typeTokenM5293 != null ? C0064.m4534(typeTokenM5293, typeToken) || (m5294(this) && C0070.m5860(m5293(this)) == C0034.m3474(typeToken)) : C0031.m2999(m5295(this), C0034.m3474(typeToken))) {
                return new TreeTypeAdapter(m5296(this), m5292(this), gson, typeToken, this);
            }
            return null;
        }

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonSerializer<?> jsonSerializer;
            boolean z2;
            if (obj instanceof JsonSerializer) {
                jsonSerializer = (JsonSerializer) obj;
            } else {
                jsonSerializer = null;
            }
            this.serializer = jsonSerializer;
            JsonDeserializer<?> jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            this.deserializer = jsonDeserializer;
            if (jsonSerializer == null && jsonDeserializer == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C0027.m2523(z2);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static TypeAdapterFactory m5282(Object obj) {
        if (C0063.m4427() > 0) {
            return ((TreeTypeAdapter) obj).skipPast;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠۠, reason: not valid java name and contains not printable characters */
    public static JsonDeserializer m5283(Object obj) {
        if (C0017.m846() >= 0) {
            return ((TreeTypeAdapter) obj).deserializer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static TypeToken m5284(Object obj) {
        if (C0018.m1064() >= 0) {
            return ((TreeTypeAdapter) obj).typeToken;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static GsonContextImpl m5285(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((TreeTypeAdapter) obj).context;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Gson m5286(Object obj) {
        if (C0065.m4647() > 0) {
            return ((TreeTypeAdapter) obj).gson;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static JsonSerializer m5287(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((TreeTypeAdapter) obj).serializer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5288(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((TreeTypeAdapter) obj).delegate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۧ, reason: contains not printable characters */
    public static TypeAdapter m5289(Object obj) {
        if (C0038.m4010() > 0) {
            return ((TreeTypeAdapter) obj).delegate;
        }
        return null;
    }

    private TypeAdapter<T> delegate() {
        TypeAdapter<T> typeAdapterM5289 = m5289(this);
        if (typeAdapterM5289 != null) {
            return typeAdapterM5289;
        }
        TypeAdapter<T> typeAdapterM5746 = C0069.m5746(m5286(this), m5282(this), m5284(this));
        this.delegate = typeAdapterM5746;
        return typeAdapterM5746;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public T read(JsonReader jsonReader) {
        if (m5283(this) == null) {
            return (T) C0064.m4557(m5288(this), jsonReader);
        }
        JsonElement jsonElementM3218 = C0032.m3218(jsonReader);
        if (C0063.m4436(jsonElementM3218)) {
            return null;
        }
        return (T) C0030.m2843(m5283(this), jsonElementM3218, C0070.m5860(m5284(this)), m5285(this));
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) {
        JsonSerializer jsonSerializerM5287 = m5287(this);
        if (jsonSerializerM5287 == null) {
            C0078.m7431(m5288(this), jsonWriter, t);
        } else if (t == null) {
            C0034.m3492(jsonWriter);
        } else {
            C0031.m3059(C0019.m1288(jsonSerializerM5287, t, C0070.m5860(m5284(this)), m5285(this)), jsonWriter);
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        boolean z;
        if (C0070.m5860(typeToken) == C0034.m3474(typeToken)) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, typeToken, z, null);
    }
}
