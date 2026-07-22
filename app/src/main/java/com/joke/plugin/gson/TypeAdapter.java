package com.joke.plugin.gson;

import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.bind.JsonTreeWriter;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return (T) C0064.m4557(this, new JsonReader(reader));
    }

    public abstract T read(JsonReader jsonReader);

    public final void toJson(Writer writer, T t) {
        C0078.m7431(this, new JsonWriter(writer), t);
    }

    public abstract void write(JsonWriter jsonWriter, T t);

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return (T) C0064.m4557(this, new JsonTreeReader(jsonElement));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.joke.plugin.gson.TypeAdapter.1
            /* JADX INFO: renamed from: ۟ۡۨۡۤ, reason: not valid java name and contains not printable characters */
            public static TypeAdapter m5002(Object obj) {
                if (C0021.m1598() < 0) {
                    return TypeAdapter.this;
                }
                return null;
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) {
                if (t == null) {
                    C0034.m3492(jsonWriter);
                } else {
                    C0078.m7431(m5002(this), jsonWriter, t);
                }
            }

            @Override // com.joke.plugin.gson.TypeAdapter
            public T read(JsonReader jsonReader) {
                if (C0022.m1758(jsonReader) == C0028.m2553()) {
                    C0065.m4645(jsonReader);
                    return null;
                }
                return (T) C0064.m4557(m5002(this), jsonReader);
            }
        };
    }

    public final JsonElement toJsonTree(T t) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            C0078.m7431(this, jsonTreeWriter, t);
            return C0035.m3604(jsonTreeWriter);
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final T fromJson(String str) {
        return (T) C0029.m2816(this, new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            C0068.m5662(this, stringWriter, t);
            return C0067.m5490(stringWriter);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
