package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.NoSuchElementException;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class A {
    private final boolean a;
    private final double b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f481short = {1987, 2018, 1965, 2043, 2028, 2017, 2040, 2024, 1965, 2045, 2047, 2024, 2046, 2024, 2019, 2041, 412, 419, 423, 442, 444, 445, 434, 447, 407, 444, 422, 433, 447, 438, 392, 3176, 2883, 2940, 2936, 2917, 2915, 2914, 2925, 2912, 2888, 2915, 2937, 2926, 2912, 2921, 2850, 2921, 2913, 2940, 2936, 2933};
    private static final A c = new A();

    /* JADX INFO: renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static double m8796(Object obj) {
        return C0100.m10983() >= 0 ? ((A) obj).b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8797(Object obj) {
        if (C0096.m10782() > 0) {
            return ((A) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static A m8798() {
        if (C0093.m9101() >= 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m8799() {
        if (C0105.m11264() > 0) {
            return f481short;
        }
        return null;
    }

    private A() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static A a() {
        return m8798();
    }

    private A(double d) {
        this.a = true;
        this.b = d;
    }

    public static A d(double d) {
        return new A(d);
    }

    public final double b() {
        if (!m8797(this)) {
            throw new NoSuchElementException(C0094.m9107(m8799(), 0, 16, 1933));
        }
        return m8796(this);
    }

    public final boolean c() {
        return m8797(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        boolean zM8797 = m8797(this);
        if (zM8797 && m8797(a)) {
            if (C0089.m8587(m8796(this), m8796(a)) == 0) {
                return true;
            }
        } else if (zM8797 == m8797(a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!m8797(this)) {
            return 0;
        }
        long jM11203 = C0104.m11203(m8796(this));
        return (int) (jM11203 ^ (jM11203 >>> 32));
    }

    public final String toString() {
        if (m8797(this)) {
            StringBuilder sb = new StringBuilder(C0083.m8037(m8799(), 16, 15, 467));
            C0095.m9209(sb, m8796(this));
            C0101.m11052(sb, C0091.m8679(m8799(), 31, 1, 3125));
            return C0099.m10924(sb);
        }
        return C0085.m8236(m8799(), 32, 20, 2828);
    }
}
