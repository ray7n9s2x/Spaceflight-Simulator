package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonDeserializer;
import com.joke.plugin.gson.JsonSerializer;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.annotations.JsonAdapter;
import com.joke.plugin.gson.internal.ConstructorConstructor;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f180short = {1411, 1444, 1468, 1451, 1446, 1443, 1454, 1514, 1451, 1470, 1470, 1455, 1447, 1466, 1470, 1514, 1470, 1445, 1514, 1448, 1443, 1444, 1454, 1514, 1451, 1444, 1514, 1443, 1444, 1465, 1470, 1451, 1444, 1449, 1455, 1514, 1445, 1452, 1514, 2171, 2106, 2088, 2171, 2106, 2171, 2075, 2065, 2088, 2100, 2101, 2074, 2111, 2106, 2091, 2095, 2110, 2089, 2171, 2109, 2100, 2089, 2171, 2294, 2296, 2200, 2194, 2219, 2231, 2230, 2201, 2236, 2233, 2216, 2220, 2237, 2218, 2296, 2222, 2233, 2228, 2221, 2237, 2296, 2229, 2221, 2219, 2220, 2296, 2234, 2237, 2296, 2233, 2296, 2188, 2209, 2216, 2237, 2201, 2236, 2233, 2216, 2220, 2237, 2218, 2292, 2296, 2188, 2209, 2216, 2237, 2201, 2236, 2233, 2216, 2220, 2237, 2218, 2206, 2233, 2235, 2220, 2231, 2218, 2209, 2292, 2296, 2194, 2219, 2231, 2230, 2187, 2237, 2218, 2225, 2233, 2228, 2225, 2210, 2237, 2218, 2296, 2231, 2218, 2296, 2194, 2219, 2231, 2230, 2204, 2237, 2219, 2237, 2218, 2225, 2233, 2228, 2225, 2210, 2237, 2218, 2294};
    private final ConstructorConstructor constructorConstructor;

    /* JADX INFO: renamed from: ۥ۟ۧۧ, reason: contains not printable characters */
    public static ConstructorConstructor m5218(Object obj) {
        if (C0024.m2011() < 0) {
            return ((JsonAdapterAnnotationTypeAdapterFactory) obj).constructorConstructor;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5219() {
        if (C0071.m6069() > 0) {
            return f180short;
        }
        return null;
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.joke.plugin.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) C0030.m2921(C0034.m3474(typeToken), JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return C0069.m5729(this, m5218(this), gson, typeToken, jsonAdapter);
    }

    public TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        JsonSerializer jsonSerializer;
        TypeAdapter<?> treeTypeAdapter;
        Object objM1703 = C0022.m1703(C0033.m3268(constructorConstructor, C0026.m2249(C0072.m6203(jsonAdapter))));
        if (objM1703 instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objM1703;
        } else if (objM1703 instanceof TypeAdapterFactory) {
            treeTypeAdapter = C0074.m6462((TypeAdapterFactory) objM1703, gson, typeToken);
        } else {
            boolean z = objM1703 instanceof JsonSerializer;
            if (!z && !(objM1703 instanceof JsonDeserializer)) {
                StringBuilder sb = new StringBuilder(C0030.m2840(m5219(), 0, 39, 1482));
                C0077.m7290(sb, C0038.m3997(C0030.m2951(objM1703)));
                C0077.m7290(sb, C0063.m4315(m5219(), 39, 23, 2139));
                C0077.m7290(sb, C0063.m4329(typeToken));
                C0077.m7290(sb, C0027.m2404(m5219(), 62, 99, 2264));
                throw new IllegalArgumentException(C0068.m5536(sb));
            }
            JsonDeserializer jsonDeserializer = null;
            if (z) {
                jsonSerializer = (JsonSerializer) objM1703;
            } else {
                jsonSerializer = null;
            }
            if (objM1703 instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer) objM1703;
            }
            treeTypeAdapter = new TreeTypeAdapter<>(jsonSerializer, jsonDeserializer, gson, typeToken, null);
        }
        if (treeTypeAdapter != null && C0022.m1763(jsonAdapter)) {
            return C0077.m7296(treeTypeAdapter);
        }
        return treeTypeAdapter;
    }
}
