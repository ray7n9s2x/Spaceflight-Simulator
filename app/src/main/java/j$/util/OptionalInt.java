package j$.util;

import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OptionalInt {
    private final boolean a;
    private final int b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f485short = {2352, 2321, 2398, 2312, 2335, 2322, 2315, 2331, 2398, 2318, 2316, 2331, 2317, 2331, 2320, 2314, 1259, 1236, 1232, 1229, 1227, 1226, 1221, 1224, 1261, 1226, 1232, 1279, 1915, 3154, 3181, 3177, 3188, 3186, 3187, 3196, 3185, 3156, 3187, 3177, 3123, 3192, 3184, 3181, 3177, 3172};
    private static final OptionalInt c = new OptionalInt();

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static OptionalInt m8818() {
        if (C0094.m9148() >= 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8819() {
        if (C0093.m9101() >= 0) {
            return f485short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8820(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((OptionalInt) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۟۟, reason: contains not printable characters */
    public static boolean m8821(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((OptionalInt) obj).a;
        }
        return false;
    }

    private OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static OptionalInt empty() {
        return m8818();
    }

    private OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }

    public static OptionalInt of(int i) {
        return new OptionalInt(i);
    }

    public int getAsInt() {
        if (!m8821(this)) {
            throw new NoSuchElementException(C0097.m10853(m8819(), 0, 16, 2430));
        }
        return m8820(this);
    }

    public boolean isPresent() {
        return m8821(this);
    }

    public int orElse(int i) {
        return m8821(this) ? m8820(this) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        boolean zM8821 = m8821(this);
        if (zM8821 && m8821(optionalInt)) {
            if (m8820(this) == m8820(optionalInt)) {
                return true;
            }
        } else if (zM8821 == m8821(optionalInt)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (m8821(this)) {
            return m8820(this);
        }
        return 0;
    }

    public final String toString() {
        if (m8821(this)) {
            StringBuilder sb = new StringBuilder(C0096.m10776(m8819(), 16, 12, 1188));
            C0099.m10859(sb, m8820(this));
            C0101.m11052(sb, C0081.m7837(m8819(), 28, 1, 1830));
            return C0099.m10924(sb);
        }
        return C0103.m11135(m8819(), 29, 17, 3101);
    }
}
