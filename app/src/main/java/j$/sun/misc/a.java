package j$.sun.misc;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0104;
import java.lang.reflect.Field;
import java.util.function.C0105;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final a b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f385short = {1273, 1237, 1231, 1238, 1246, 1236, 1181, 1230, 1178, 1245, 1247, 1230, 1178, 1230, 1234, 1247, 1178, 1263, 1236, 1225, 1243, 1244, 1247, 2520, 2500, 2505, 2553, 2498, 2527, 2509, 2506, 2505, 2122, 2150, 2172, 2149, 2157, 2151, 2094, 2173, 2089, 2159, 2144, 2151, 2157, 2089, 2173, 2145, 2156, 2089, 2140, 2151, 2170, 2152, 2159, 2156, 2108, 2078, 2065, 2065, 2064, 2059, 2143, 2073, 2070, 2065, 2075, 2143, 2073, 2070, 2074, 2067, 2075, 2117};
    private final Unsafe a;

    /* JADX INFO: renamed from: ۟ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static Field m7468() {
        if (C0095.m9210() > 0) {
            return i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7469() {
        if (C0093.m9101() > 0) {
            return f385short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static Unsafe m7470(Object obj) {
        if (C0101.m11044() < 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static a m7471() {
        if (C0100.m10983() >= 0) {
            return b;
        }
        return null;
    }

    static {
        Field fieldM7468 = m7468();
        C0105.m11304(fieldM7468, true);
        try {
            b = new a((Unsafe) C0091.m8713(fieldM7468, null));
        } catch (IllegalAccessException e) {
            throw new AssertionError(C0085.m8236(m7469(), 0, 23, 1210), e);
        }
    }

    a(Unsafe unsafe) {
        this.a = unsafe;
    }

    private static Field i() {
        try {
            return C0085.m8269(Unsafe.class, C0092.m8731(m7469(), 23, 9, 2476));
        } catch (NoSuchFieldException e) {
            for (Field field : C0096.m10753(Unsafe.class)) {
                if (C0091.m8705(C0104.m11192(field)) && C0080.m7576(Unsafe.class, C0104.m11186(field))) {
                    return field;
                }
            }
            throw new AssertionError(C0082.m7966(m7469(), 32, 24, 2057), e);
        }
    }

    public static a h() {
        return m7471();
    }

    public final int f(Object obj, long j) {
        int iM10994;
        do {
            iM10994 = C0100.m10994(m7470(this), obj, j);
        } while (!C0083.m8039(m7470(this), obj, j, iM10994, iM10994 - 4));
        return iM10994;
    }

    public final long k(Field field) {
        return C0092.m8758(m7470(this), field);
    }

    public final long j(Class cls, String str) {
        try {
            return C0082.m7989(this, C0085.m8269(cls, str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(C0095.m9204(m7469(), 56, 18, 2175), e);
        }
    }

    public final int a(Class cls) {
        return C0101.m11023(m7470(this), cls);
    }

    public final int b(Class cls) {
        return C0093.m9071(m7470(this), cls);
    }

    public final Object g(Object obj, long j) {
        return C0099.m10895(m7470(this), obj, j);
    }

    public final void l(Object obj, long j, Object obj2) {
        C0095.m9170(m7470(this), obj, j, obj2);
    }

    public final boolean c(Object obj, long j, int i, int i2) {
        return C0083.m8039(m7470(this), obj, j, i, i2);
    }

    public final boolean d(Object obj, long j, long j2, long j3) {
        return C0102.m11083(m7470(this), obj, j, j2, j3);
    }

    public final boolean e(Object obj, long j, Object obj2) {
        return C0104.m11244(m7470(this), obj, j, obj2);
    }
}
