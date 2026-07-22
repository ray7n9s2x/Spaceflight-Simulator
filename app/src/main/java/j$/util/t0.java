package j$.util;

import j$.sun.nio.cs.C0080;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.util.function.C0095;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Iterator;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f555short = {541, 512, 539, 533, 539, 540, 602, 1041, 1048, 1030, 1048, 1118, 1117, 1110, 1115, 1117, 1040, 3240};
    private static final f0 a = new p0();
    private static final W b = new n0();
    private static final Z c = new o0();
    private static final T d = new m0();

    /* JADX INFO: renamed from: ۟ۥۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Z m10936() {
        if (C0082.m7983() < 0) {
            return c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥ۠, reason: not valid java name and contains not printable characters */
    public static void m10937(int i, int i2, int i3) {
        if (C0106.m11345() < 0) {
            a(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static W m10938() {
        if (C0080.m7553() >= 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static T m10939() {
        if (C0098.m10857() < 0) {
            return d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static f0 m10940() {
        if (C0083.m8022() <= 0) {
            return a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۦ, reason: contains not printable characters */
    public static short[] m10941() {
        if (C0098.m10857() < 0) {
            return f555short;
        }
        return null;
    }

    public static f0 e() {
        return m10940();
    }

    public static W c() {
        return m10938();
    }

    public static Z d() {
        return m10936();
    }

    public static T b() {
        return m10939();
    }

    public static f0 m(Object[] objArr, int i, int i2) {
        m10937(((Object[]) C0099.m10863(objArr)).length, i, i2);
        return new k0(objArr, i, i2, 1040);
    }

    public static W k(int[] iArr, int i, int i2) {
        m10937(((int[]) C0099.m10863(iArr)).length, i, i2);
        return new q0(iArr, i, i2, 1040);
    }

    public static Z l(long[] jArr, int i, int i2) {
        m10937(((long[]) C0099.m10863(jArr)).length, i, i2);
        return new s0(jArr, i, i2, 1040);
    }

    public static T j(double[] dArr, int i, int i2) {
        m10937(((double[]) C0099.m10863(dArr)).length, i, i2);
        return new l0(dArr, i, i2, 1040);
    }

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        StringBuilder sb = new StringBuilder(C0104.m11206(m10941(), 0, 7, 626));
        C0099.m10859(sb, i2);
        C0101.m11052(sb, C0095.m9204(m10941(), 7, 10, 1080));
        C0099.m10859(sb, i3);
        C0101.m11052(sb, C0082.m7966(m10941(), 17, 1, 3201));
        throw new ArrayIndexOutOfBoundsException(C0099.m10924(sb));
    }

    public static Iterator i(f0 f0Var) {
        C0099.m10863(f0Var);
        return new g0(f0Var);
    }

    public static J g(W w) {
        C0099.m10863(w);
        return new h0(w);
    }

    public static N h(Z z) {
        C0099.m10863(z);
        return new i0(z);
    }

    public static F f(T t) {
        C0099.m10863(t);
        return new j0(t);
    }
}
