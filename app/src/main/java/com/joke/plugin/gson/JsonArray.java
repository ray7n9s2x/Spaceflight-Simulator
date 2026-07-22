package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    private final List<JsonElement> elements;

    public JsonArray() {
        this.elements = new ArrayList();
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static List m4993(Object obj) {
        if (C0066.m4827() > 0) {
            return ((JsonArray) obj).elements;
        }
        return null;
    }

    public void add(Boolean bool) {
        C0077.m7162(m4993(this), bool == null ? C0077.m7274() : new JsonPrimitive(bool));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return C0111.m13143(this);
    }

    public boolean remove(JsonElement jsonElement) {
        return C0036.m3765(m4993(this), jsonElement);
    }

    public void add(Character ch) {
        C0077.m7162(m4993(this), ch == null ? C0077.m7274() : new JsonPrimitive(ch));
    }

    public void addAll(JsonArray jsonArray) {
        C0029.m2793(m4993(this), m4993(jsonArray));
    }

    public boolean contains(JsonElement jsonElement) {
        return C0069.m5708(m4993(this), jsonElement);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public JsonArray deepCopy() {
        if (C0025.m2084(m4993(this))) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(C0034.m3427(m4993(this)));
        Iterator itM4732 = C0065.m4732(m4993(this));
        while (C0036.m3657(itM4732)) {
            C0028.m2576(jsonArray, C0071.m6068((JsonElement) C0071.m6012(itM4732)));
        }
        return jsonArray;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && C0111.m13095(m4993((JsonArray) obj), m4993(this)));
    }

    public JsonElement get(int i) {
        return (JsonElement) C0071.m6078(m4993(this), i);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0016.m699((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public BigInteger getAsBigInteger() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0070.m5922((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public boolean getAsBoolean() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0063.m4356((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public byte getAsByte() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0071.m6082((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public char getAsCharacter() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0039.m4141((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public double getAsDouble() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0039.m4058((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public float getAsFloat() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0071.m5963((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public int getAsInt() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0077.m7157((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public long getAsLong() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0030.m2876((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public Number getAsNumber() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0030.m2925((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public short getAsShort() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0033.m3264((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    @Override // com.joke.plugin.gson.JsonElement
    public String getAsString() {
        if (C0034.m3427(m4993(this)) == 1) {
            return C0063.m4311((JsonElement) C0071.m6078(m4993(this), 0));
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return C0029.m2813(m4993(this));
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return C0065.m4732(m4993(this));
    }

    public JsonElement remove(int i) {
        return (JsonElement) C0037.m3901(m4993(this), i);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        return (JsonElement) C0038.m3974(m4993(this), i, jsonElement);
    }

    public int size() {
        return C0034.m3427(m4993(this));
    }

    public JsonArray(int i) {
        this.elements = new ArrayList(i);
    }

    public void add(Number number) {
        C0077.m7162(m4993(this), number == null ? C0077.m7274() : new JsonPrimitive(number));
    }

    public void add(String str) {
        C0077.m7162(m4993(this), str == null ? C0077.m7274() : new JsonPrimitive(str));
    }

    public void add(JsonElement jsonElement) {
        JsonElement jsonElementM7274 = jsonElement;
        if (jsonElementM7274 == null) {
            jsonElementM7274 = C0077.m7274();
        }
        C0077.m7162(m4993(this), jsonElementM7274);
    }
}
