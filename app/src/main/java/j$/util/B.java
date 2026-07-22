package j$.util;

import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.util.NoSuchElementException;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class B {
    private final boolean a;
    private final long b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f482short = {396, 429, 482, 436, 419, 430, 439, 423, 482, 434, 432, 423, 433, 423, 428, 438, 1518, 1489, 1493, 1480, 1486, 1487, 1472, 1485, 1517, 1486, 1487, 1478, 1530, 3275, 2256, 2287, 2283, 2294, 2288, 2289, 2302, 2291, 2259, 2288, 2289, 2296, 2225, 2298, 2290, 2287, 2283, 2278};
    private static final B c = new B();

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static long m8800(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((B) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static B m8801() {
        if (C0106.m11345() <= 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8802() {
        if (C0094.m9148() > 0) {
            return f482short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8803(Object obj) {
        if (C0088.m8503() > 0) {
            return ((B) obj).a;
        }
        return false;
    }

    private B() {
        this.a = false;
        this.b = 0L;
    }

    public static B a() {
        return m8801();
    }

    private B(long j) {
        this.a = true;
        this.b = j;
    }

    public static B d(long j) {
        return new B(j);
    }

    public final long b() {
        if (!m8803(this)) {
            throw new NoSuchElementException(C0105.m11310(m8802(), 0, 16, 450));
        }
        return m8800(this);
    }

    public final boolean c() {
        return m8803(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        boolean zM8803 = m8803(this);
        if (zM8803 && m8803(b)) {
            if (m8800(this) == m8800(b)) {
                return true;
            }
        } else if (zM8803 == m8803(b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!m8803(this)) {
            return 0;
        }
        long jM8800 = m8800(this);
        return (int) (jM8800 ^ (jM8800 >>> 32));
    }

    public final String toString() {
        if (m8803(this)) {
            StringBuilder sb = new StringBuilder(C0086.m8291(m8802(), 16, 13, 1441));
            C0087.m8489(sb, m8800(this));
            C0101.m11052(sb, C0086.m8291(m8802(), 29, 1, 3222));
            return C0099.m10924(sb);
        }
        return C0098.m10856(m8802(), 30, 18, 2207);
    }
}
