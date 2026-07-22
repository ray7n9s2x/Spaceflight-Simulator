package com.joke.plugin.gson.internal.bind;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    private final Gson context;
    private final TypeAdapter<T> delegate;
    private final Type type;

    /* JADX INFO: renamed from: ۟۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Gson m5297(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((TypeAdapterRuntimeTypeWrapper) obj).context;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Type m5298(Object obj, Object obj2, Object obj3) {
        if (C0017.m846() > 0) {
            return ((TypeAdapterRuntimeTypeWrapper) obj).getRuntimeTypeIfMoreSpecific((Type) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5299(Object obj) {
        if (C0074.m6454() < 0) {
            return ((TypeAdapterRuntimeTypeWrapper) obj).delegate;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۦ, reason: not valid java name and contains not printable characters */
    public static Type m5300(Object obj) {
        if (C0016.m717() < 0) {
            return ((TypeAdapterRuntimeTypeWrapper) obj).type;
        }
        return null;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? C0030.m2951(obj) : type : type;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public T read(JsonReader jsonReader) {
        return (T) C0064.m4557(m5299(this), jsonReader);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) {
        TypeAdapter typeAdapterM5299 = m5299(this);
        Type typeM5298 = m5298(this, m5300(this), t);
        if (typeM5298 != m5300(this)) {
            typeAdapterM5299 = C0075.m6819(m5297(this), C0031.m3033(typeM5298));
            if (typeAdapterM5299 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter typeAdapterM52992 = m5299(this);
                if (!(typeAdapterM52992 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapterM5299 = typeAdapterM52992;
                }
            }
        }
        C0078.m7431(typeAdapterM5299, jsonWriter, t);
    }

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.type = type;
    }
}
