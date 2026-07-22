package com.joke.plugin.gson;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonElement {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f161short = {1473, 1504, 1531, 1455, 1518, 1455, 1477, 1500, 1472, 1473, 1455, 1486, 1533, 1533, 1518, 1526, 1461, 1455, 1698, 1667, 1688, 1740, 1677, 1740, 1702, 1727, 1699, 1698, 1740, 1698, 1689, 1664, 1664, 1750, 1740, 1280, 1313, 1338, 1390, 1327, 1390, 1284, 1309, 1281, 1280, 1390, 1281, 1324, 1316, 1323, 1325, 1338, 1396, 1390, 2097, 2064, 2059, 2143, 2078, 2143, 2101, 2092, 2096, 2097, 2143, 2095, 2061, 2070, 2066, 2070, 2059, 2070, 2057, 2074, 2117, 2143};

    /* JADX INFO: renamed from: ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m4994() {
        if (C0025.m2132() > 0) {
            return f161short;
        }
        return null;
    }

    public abstract JsonElement deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    @Deprecated
    public char getAsCharacter() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public double getAsDouble() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public String getAsString() {
        throw new UnsupportedOperationException(C0032.m3134(C0030.m2951(this)));
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull() {
        return this instanceof JsonNull;
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            C0020.m1353(jsonWriter, true);
            C0031.m3059(this, jsonWriter);
            return C0067.m5490(stringWriter);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JsonArray getAsJsonArray() {
        if (C0029.m2751(this)) {
            return (JsonArray) this;
        }
        StringBuilder sb = new StringBuilder(C0025.m2151(m4994(), 0, 18, 1423));
        C0036.m3741(sb, this);
        throw new IllegalStateException(C0068.m5536(sb));
    }

    public JsonNull getAsJsonNull() {
        if (C0063.m4436(this)) {
            return (JsonNull) this;
        }
        StringBuilder sb = new StringBuilder(C0067.m5418(m4994(), 18, 17, 1772));
        C0036.m3741(sb, this);
        throw new IllegalStateException(C0068.m5536(sb));
    }

    public JsonObject getAsJsonObject() {
        if (C0066.m4866(this)) {
            return (JsonObject) this;
        }
        StringBuilder sb = new StringBuilder(C0023.m1904(m4994(), 35, 19, 1358));
        C0036.m3741(sb, this);
        throw new IllegalStateException(C0068.m5536(sb));
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (C0063.m4408(this)) {
            return (JsonPrimitive) this;
        }
        StringBuilder sb = new StringBuilder(C0038.m4022(m4994(), 54, 22, 2175));
        C0036.m3741(sb, this);
        throw new IllegalStateException(C0068.m5536(sb));
    }
}
