package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.LazilyParsedNumber;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonPrimitive extends JsonElement {
    private final Object value;

    public JsonPrimitive(Boolean bool) {
        this.value = C0027.m2407(bool);
    }

    /* JADX INFO: renamed from: ۤۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4997(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((JsonPrimitive) obj).value;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4998(Object obj) {
        if (C0072.m6216() >= 0) {
            return isIntegral((JsonPrimitive) obj);
        }
        return false;
    }

    @Override // com.joke.plugin.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != C0030.m2951(obj)) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (m4997(this) == null) {
            return m4997(jsonPrimitive) == null;
        }
        if (m4998(this) && m4998(jsonPrimitive)) {
            return C0023.m1852(C0074.m6457(this)) == C0023.m1852(C0074.m6457(jsonPrimitive));
        }
        Object objM4997 = m4997(this);
        if (!(objM4997 instanceof Number) || !(m4997(jsonPrimitive) instanceof Number)) {
            return C0023.m1865(objM4997, m4997(jsonPrimitive));
        }
        double dM1261 = C0019.m1261(C0074.m6457(this));
        double dM12612 = C0019.m1261(C0074.m6457(jsonPrimitive));
        if (dM1261 != dM12612) {
            return C0017.m923(dM1261) && C0017.m923(dM12612);
        }
        return true;
    }

    private static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Object objM4997 = m4997(jsonPrimitive);
        if (!(objM4997 instanceof Number)) {
            return false;
        }
        Number number = (Number) objM4997;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return C0033.m3271(this);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object objM4997 = m4997(this);
        return objM4997 instanceof BigDecimal ? (BigDecimal) objM4997 : new BigDecimal(C0074.m6524(m4997(this)));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object objM4997 = m4997(this);
        return objM4997 instanceof BigInteger ? (BigInteger) objM4997 : new BigInteger(C0074.m6524(m4997(this)));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public Number getAsNumber() {
        Object objM4997 = m4997(this);
        return objM4997 instanceof String ? new LazilyParsedNumber((String) objM4997) : (Number) objM4997;
    }

    public int hashCode() {
        long jM2589;
        if (m4997(this) == null) {
            return 31;
        }
        if (m4998(this)) {
            jM2589 = C0023.m1852(C0074.m6457(this));
        } else {
            Object objM4997 = m4997(this);
            if (!(objM4997 instanceof Number)) {
                return C0037.m3818(objM4997);
            }
            jM2589 = C0028.m2589(C0019.m1261(C0074.m6457(this)));
        }
        return (int) ((jM2589 >>> 32) ^ jM2589);
    }

    public boolean isBoolean() {
        return m4997(this) instanceof Boolean;
    }

    public boolean isNumber() {
        return m4997(this) instanceof Number;
    }

    public boolean isString() {
        return m4997(this) instanceof String;
    }

    public JsonPrimitive(Number number) {
        this.value = C0027.m2407(number);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public boolean getAsBoolean() {
        if (C0032.m3180(this)) {
            return C0065.m4681((Boolean) m4997(this));
        }
        return C0025.m2121(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public byte getAsByte() {
        if (C0028.m2622(this)) {
            return C0072.m6148(C0074.m6457(this));
        }
        return C0066.m4869(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public char getAsCharacter() {
        return C0077.m7212(C0029.m2759(this), 0);
    }

    @Override // com.joke.plugin.gson.JsonElement
    public double getAsDouble() {
        if (C0028.m2622(this)) {
            return C0019.m1261(C0074.m6457(this));
        }
        return C0028.m2611(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public float getAsFloat() {
        if (C0028.m2622(this)) {
            return C0028.m2628(C0074.m6457(this));
        }
        return C0036.m3697(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public int getAsInt() {
        if (C0028.m2622(this)) {
            return C0069.m5760(C0074.m6457(this));
        }
        return C0039.m4116(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public long getAsLong() {
        if (C0028.m2622(this)) {
            return C0023.m1852(C0074.m6457(this));
        }
        return C0034.m3481(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public short getAsShort() {
        if (C0028.m2622(this)) {
            return C0033.m3276(C0074.m6457(this));
        }
        return C0069.m5698(C0029.m2759(this));
    }

    @Override // com.joke.plugin.gson.JsonElement
    public String getAsString() {
        if (C0028.m2622(this)) {
            return C0074.m6524(C0074.m6457(this));
        }
        if (C0032.m3180(this)) {
            return C0039.m4168((Boolean) m4997(this));
        }
        return (String) m4997(this);
    }

    public JsonPrimitive(String str) {
        this.value = C0027.m2407(str);
    }

    public JsonPrimitive(Character ch) {
        this.value = C0038.m4012((Character) C0027.m2407(ch));
    }
}
