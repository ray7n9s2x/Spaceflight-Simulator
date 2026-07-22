package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.ObjectConstructor;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final TypeAdapter<E> elementTypeAdapter;

        /* JADX INFO: renamed from: ۟ۦۥۢۨ, reason: not valid java name and contains not printable characters */
        public static TypeAdapter m5212(Object obj) {
            if (C0034.m3450() >= 0) {
                return ((Adapter) obj).elementTypeAdapter;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۢۡ۠, reason: not valid java name and contains not printable characters */
        public static ObjectConstructor m5213(Object obj) {
            if (C0078.m7450() >= 0) {
                return ((Adapter) obj).constructor;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۢۤ, reason: not valid java name and contains not printable characters */
        public static Collection m5214(Object obj, Object obj2) {
            if (C0070.m5903() >= 0) {
                return ((Adapter) obj).read((JsonReader) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
        public static void m5215(Object obj, Object obj2, Object obj3) {
            if (C0038.m4010() >= 0) {
                ((Adapter) obj).write((JsonWriter) obj2, (Collection) obj3);
            }
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
            return m5214(this, jsonReader);
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            m5215(this, jsonWriter, (Collection) obj);
        }

        @Override // com.joke.plugin.gson.TypeAdapter
        public Collection<E> read(JsonReader jsonReader) {
            if (C0022.m1758(jsonReader) == C0028.m2553()) {
                C0065.m4645(jsonReader);
                return null;
            }
            Collection<E> collection = (Collection) C0022.m1703(m5213(this));
            C0034.m3467(jsonReader);
            while (C0078.m7343(jsonReader)) {
                C0037.m3814(collection, C0064.m4557(m5212(this), jsonReader));
            }
            C0066.m4839(jsonReader);
            return collection;
        }

        public void write(JsonWriter jsonWriter, Collection<E> collection) {
            if (collection == null) {
                C0034.m3492(jsonWriter);
                return;
            }
            C0035.m3598(jsonWriter);
            Iterator itM4820 = C0066.m4820(collection);
            while (C0036.m3657(itM4820)) {
                C0078.m7431(m5212(this), jsonWriter, C0071.m6012(itM4820));
            }
            C0111.m13071(jsonWriter);
        }

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.constructor = objectConstructor;
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static ConstructorConstructor m5211(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((CollectionTypeAdapterFactory) obj).constructorConstructor;
        }
        return null;
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.joke.plugin.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type typeM5860 = C0070.m5860(typeToken);
        Class clsM3474 = C0034.m3474(typeToken);
        if (!C0031.m2999(Collection.class, clsM3474)) {
            return null;
        }
        Type typeM4115 = C0039.m4115(typeM5860, clsM3474);
        return new Adapter(gson, typeM4115, C0075.m6819(gson, C0031.m3033(typeM4115)), C0033.m3268(m5211(this), typeToken));
    }
}
