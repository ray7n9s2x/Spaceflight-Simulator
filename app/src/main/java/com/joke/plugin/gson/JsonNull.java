package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.internal.asn1.C0022;
import com.zfork.multiplatforms.android.bomb.C0077;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // com.joke.plugin.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return C0022.m1669(this);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public JsonNull deepCopy() {
        return C0077.m7274();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof JsonNull);
    }

    public int hashCode() {
        return C0037.m3818(JsonNull.class);
    }

    @Deprecated
    public JsonNull() {
    }
}
