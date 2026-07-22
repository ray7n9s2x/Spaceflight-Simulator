package com.joke.plugin.gson.internal;

import com.android.apksig.C0039;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class LazilyParsedNumber extends Number {
    private final String value;

    /* JADX INFO: renamed from: ۟ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5064(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((LazilyParsedNumber) obj).value;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String strM5064 = m5064(this);
        String strM50642 = m5064((LazilyParsedNumber) obj);
        return strM5064 == strM50642 || C0070.m5838(strM5064, strM50642);
    }

    private Object writeReplace() {
        return new BigDecimal(m5064(this));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return C0028.m2611(m5064(this));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return C0036.m3697(m5064(this));
    }

    public int hashCode() {
        return C0027.m2392(m5064(this));
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return C0039.m4116(m5064(this));
            } catch (NumberFormatException unused) {
                return (int) C0034.m3481(m5064(this));
            }
        } catch (NumberFormatException unused2) {
            return C0025.m2223(new BigDecimal(m5064(this)));
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return C0034.m3481(m5064(this));
        } catch (NumberFormatException unused) {
            return C0068.m5614(new BigDecimal(m5064(this)));
        }
    }

    public String toString() {
        return m5064(this);
    }

    public LazilyParsedNumber(String str) {
        this.value = str;
    }
}
