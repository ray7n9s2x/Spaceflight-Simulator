package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.LinkedTreeMap;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonObject extends JsonElement {
    private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap<>();

    /* JADX INFO: renamed from: ۨۥۨۧ, reason: not valid java name and contains not printable characters */
    public static LinkedTreeMap m4995(Object obj) {
        if (C0073.m6356() < 0) {
            return ((JsonObject) obj).members;
        }
        return null;
    }

    public void addProperty(String str, String str2) {
        C0070.m5904(this, str, str2 == null ? C0077.m7274() : new JsonPrimitive(str2));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return C0028.m2535(this);
    }

    public void add(String str, JsonElement jsonElement) {
        JsonElement jsonElementM7274 = jsonElement;
        LinkedTreeMap linkedTreeMapM4995 = m4995(this);
        if (jsonElementM7274 == null) {
            jsonElementM7274 = C0077.m7274();
        }
        C0028.m2578(linkedTreeMapM4995, str, jsonElementM7274);
    }

    public void addProperty(String str, Number number) {
        C0070.m5904(this, str, number == null ? C0077.m7274() : new JsonPrimitive(number));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        Iterator itM2001 = C0024.m2001(C0033.m3304(m4995(this)));
        while (C0036.m3657(itM2001)) {
            Map.Entry entry = (Map.Entry) C0071.m6012(itM2001);
            C0070.m5904(jsonObject, (String) C0063.m4368(entry), C0071.m6068((JsonElement) C0019.m1293(entry)));
        }
        return jsonObject;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return C0033.m3304(m4995(this));
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && C0023.m1865(m4995((JsonObject) obj), m4995(this)));
    }

    public JsonElement get(String str) {
        return (JsonElement) C0031.m2976(m4995(this), str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) C0031.m2976(m4995(this), str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) C0031.m2976(m4995(this), str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) C0031.m2976(m4995(this), str);
    }

    public boolean has(String str) {
        return C0072.m6132(m4995(this), str);
    }

    public int hashCode() {
        return C0037.m3818(m4995(this));
    }

    public Set<String> keySet() {
        return C0021.m1640(m4995(this));
    }

    public JsonElement remove(String str) {
        return (JsonElement) C0019.m1248(m4995(this), str);
    }

    public int size() {
        return C0016.m608(m4995(this));
    }

    public void addProperty(String str, Boolean bool) {
        C0070.m5904(this, str, bool == null ? C0077.m7274() : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch) {
        C0070.m5904(this, str, ch == null ? C0077.m7274() : new JsonPrimitive(ch));
    }
}
