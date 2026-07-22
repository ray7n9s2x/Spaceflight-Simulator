package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.stream.C0099;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends AbstractC0488a implements Serializable {
    private static final long serialVersionUID = -1440403870442975015L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f411short = {1006, 975, 985, 975, 984, 963, 971, 966, 963, 976, 971, 990, 963, 965, 964, 906, 988, 963, 971, 906, 985, 975, 984, 963, 971, 966, 963, 976, 971, 990, 963, 965, 964, 906, 974, 975, 966, 975, 973, 971, 990, 975, 2933, 2898, 2890, 2909, 2896, 2901, 2904, 2844, 2905, 2894, 2909, 2822, 2844, 889, 867, 895, 2114, 2136, 2116, 2067, 2077, 2075, 2074};
    public static final u d = new u();

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7772() {
        if (C0082.m7983() < 0) {
            return f411short;
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final o A(int i) {
        if (i == 0) {
            return C0105.m11253();
        }
        if (i == 1) {
            return C0088.m8501();
        }
        StringBuilder sb = new StringBuilder(C0091.m8679(m7772(), 42, 13, 2876));
        C0099.m10859(sb, i);
        throw new DateTimeException(C0099.m10924(sb));
    }

    private u() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return C0105.m11310(m7772(), 55, 3, 816);
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return C0087.m8474(m7772(), 58, 7, 2091);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0489b l(j$.time.temporal.o oVar) {
        return C0080.m7570(oVar);
    }

    @Override // j$.time.chrono.AbstractC0488a, j$.time.chrono.n
    public final InterfaceC0492e o(j$.time.j jVar) {
        return C0079.m7486(jVar);
    }

    public static boolean m(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0101.m11060(m7772(), 0, 42, 938));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
