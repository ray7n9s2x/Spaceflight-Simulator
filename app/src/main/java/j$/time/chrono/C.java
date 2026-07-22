package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.DateTimeException;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.stream.C0099;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends AbstractC0488a implements Serializable {
    private static final long serialVersionUID = 1039765215346859963L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f395short = {2865, 2832, 2822, 2832, 2823, 2844, 2836, 2841, 2844, 2831, 2836, 2817, 2844, 2842, 2843, 2901, 2819, 2844, 2836, 2901, 2822, 2832, 2823, 2844, 2836, 2841, 2844, 2831, 2836, 2817, 2844, 2842, 2843, 2901, 2833, 2832, 2841, 2832, 2834, 2836, 2817, 2832, 554, 525, 533, 514, 527, 522, 519, 579, 518, 529, 514, 601, 579, 1528, 1500, 1499, 1490, 1472, 1498, 1006, 1011, 1023};
    public static final C d = new C();

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7633() {
        if (C0091.m8708() > 0) {
            return f395short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int[] m7634() {
        if (C0094.m9148() >= 0) {
            return B.a;
        }
        return null;
    }

    private C() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return C0094.m9107(m7633(), 55, 6, 1461);
    }

    @Override // j$.time.chrono.n
    public final o A(int i) {
        if (i == 0) {
            return C0091.m8688();
        }
        if (i == 1) {
            return C0079.m7518();
        }
        StringBuilder sb = new StringBuilder(C0104.m11206(m7633(), 42, 13, 611));
        C0099.m10859(sb, i);
        throw new DateTimeException(C0099.m10924(sb));
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return C0091.m8679(m7633(), 61, 3, 924);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0489b l(j$.time.temporal.o oVar) {
        if (oVar instanceof E) {
            return (E) oVar;
        }
        return new E(C0080.m7570(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i = m7634()[C0105.m11258(aVar)];
        if (i == 1) {
            j$.time.temporal.w wVarM8651 = C0090.m8651(C0088.m8511());
            return C0084.m8080(C0092.m8744(wVarM8651) - 22932, C0088.m8525(wVarM8651) - 22932);
        }
        if (i == 2) {
            j$.time.temporal.w wVarM86512 = C0090.m8651(C0104.m11201());
            return C0083.m8075(C0088.m8525(wVarM86512) - 1911, (-C0092.m8744(wVarM86512)) + 1912);
        }
        if (i == 3) {
            j$.time.temporal.w wVarM86513 = C0090.m8651(C0104.m11201());
            return C0084.m8080(C0092.m8744(wVarM86513) - 1911, C0088.m8525(wVarM86513) - 1911);
        }
        return C0090.m8651(aVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0089.m8581(m7633(), 0, 42, 2933));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
