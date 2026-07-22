package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type typeM5860 = C0070.m5860(typeToken);
            if (!(typeM5860 instanceof GenericArrayType) && (!(typeM5860 instanceof Class) || !C0111.m13160((Class) typeM5860))) {
                return null;
            }
            Type typeM6820 = C0075.m6820(typeM5860);
            return new ArrayTypeAdapter(gson, C0075.m6819(gson, C0031.m3033(typeM6820)), C0038.m3971(typeM6820));
        }
    };
    private final Class<E> componentType;
    private final TypeAdapter<E> componentTypeAdapter;

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static Class m5209(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ArrayTypeAdapter) obj).componentType;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static TypeAdapter m5210(Object obj) {
        if (C0071.m6069() > 0) {
            return ((ArrayTypeAdapter) obj).componentTypeAdapter;
        }
        return null;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            C0034.m3492(jsonWriter);
            return;
        }
        C0035.m3598(jsonWriter);
        int iM6230 = C0072.m6230(obj);
        for (int i = 0; i < iM6230; i++) {
            C0078.m7431(m5210(this), jsonWriter, C0024.m2034(obj, i));
        }
        C0111.m13071(jsonWriter);
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.componentType = cls;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public Object read(JsonReader jsonReader) {
        if (C0022.m1758(jsonReader) == C0028.m2553()) {
            C0065.m4645(jsonReader);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C0034.m3467(jsonReader);
        while (C0078.m7343(jsonReader)) {
            C0017.m919(arrayList, C0064.m4557(m5210(this), jsonReader));
        }
        C0066.m4839(jsonReader);
        int iM1084 = C0018.m1084(arrayList);
        Object objM3145 = C0032.m3145(m5209(this), iM1084);
        for (int i = 0; i < iM1084; i++) {
            C0027.m2533(objM3145, i, C0064.m4526(arrayList, i));
        }
        return objM3145;
    }
}
