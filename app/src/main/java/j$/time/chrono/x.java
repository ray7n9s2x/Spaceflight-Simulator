package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends AbstractC0488a implements Serializable {
    private static final long serialVersionUID = 459996390165777884L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f413short = {2164, 2133, 2115, 2133, 2114, 2137, 2129, 2140, 2137, 2122, 2129, 2116, 2137, 2143, 2142, 2064, 2118, 2137, 2129, 2064, 2115, 2133, 2114, 2137, 2129, 2140, 2137, 2122, 2129, 2116, 2137, 2143, 2142, 2064, 2132, 2133, 2140, 2133, 2135, 2129, 2116, 2133, 1539, 1576, 1593, 1576, 1575, 1580, 1594, 1580, 796, 807, 826, 828, 825, 825, 806, 827, 829, 812, 813, 873, 815, 800, 812, 805, 813, 883, 873, 1058, 1065, 1080, 1065, 1062, 1069, 1083, 1069};
    public static final x d = new x();

    /* JADX INFO: renamed from: ۟۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7774() {
        if (C0087.m8458() <= 0) {
            return z.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7775() {
        if (C0098.m10857() < 0) {
            return w.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7776(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((A) obj).o();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m7777() {
        if (C0082.m7983() <= 0) {
            return A.C();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static A m7778() {
        if (C0102.m11109() <= 0) {
            return A.l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧ۟, reason: not valid java name and contains not printable characters */
    public static long m7779() {
        if (C0104.m11196() > 0) {
            return A.D();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7780() {
        if (C0083.m8022() < 0) {
            return f413short;
        }
        return null;
    }

    private x() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return C0085.m8236(m7780(), 42, 8, 1609);
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return C0102.m11094(m7780(), 69, 8, 1096);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0489b l(j$.time.temporal.o oVar) {
        if (oVar instanceof z) {
            return (z) oVar;
        }
        return new z(C0080.m7570(oVar));
    }

    @Override // j$.time.chrono.n
    public final o A(int i) {
        return C0082.m7986(i);
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        switch (m7775()[C0105.m11258(aVar)]) {
            case 1:
            case 2:
            case 3:
            case 4:
                StringBuilder sb = new StringBuilder(C0101.m11060(m7780(), 50, 19, 841));
                C0082.m7988(sb, aVar);
                throw new j$.time.temporal.v(C0099.m10924(sb));
            case 5:
                return C0083.m8075(m7779(), 999999999 - C0097.m10813(m7776(m7778())));
            case 6:
                return C0083.m8075(m7777(), C0088.m8525(C0090.m8651(C0090.m8620())));
            case 7:
                return C0084.m8080(C0097.m10813(m7774()), 999999999L);
            case 8:
                return C0084.m8080(C0094.m9140(C0079.m7483()), C0094.m9140(m7778()));
            default:
                return C0090.m8651(aVar);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0086.m8291(m7780(), 0, 42, 2096));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
