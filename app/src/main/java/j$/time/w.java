package j$.time;

import com.google.common.base.Ascii;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f463short = {1021, 988, 970, 988, 971, 976, 984, 981, 976, 963, 984, 973, 976, 982, 983, 921, 975, 976, 984, 921, 970, 988, 971, 976, 984, 981, 976, 963, 984, 973, 976, 982, 983, 921, 989, 988, 981, 988, 990, 984, 973, 988, 3289, 3298, 3327, 3321, 3324, 3324, 3299, 3326, 3320, 3305, 3304, 3244, 3321, 3298, 3301, 3320, 3254, 3244, 2420, 2383, 2386, 2388, 2385, 2385, 2382, 2387, 2389, 2372, 2373, 2305, 2375, 2376, 2372, 2381, 2373, 2331, 2305, 1089, 1146, 1127, 1121, 1124, 1124, 1147, 1126, 1120, 1137, 1136, 1076, 1138, 1149, 1137, 1144, 1136, 1070, 1076, 318, 283, 277, 266, 268, 267, 274, 282, 273, 267, 351, 272, 273, 275, 262, 351, 268, 266, 271, 271, 272, 269, 267, 282, 283, 351, 272, 273, 351, 310, 300, 304, 351, 283, 286, 267, 282, 338, 267, 278, 274, 282};
    private final int a;

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m8364() {
        if (C0095.m9210() >= 0) {
            return v.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int[] m8365() {
        if (C0080.m7553() > 0) {
            return v.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8366(Object obj) {
        if (C0094.m9148() > 0) {
            return ((w) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8367() {
        if (C0099.m10878() < 0) {
            return f463short;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m8366(this) - m8366((w) obj);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0082.m7996(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0104.m11247(this, j, uVar);
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        C0101.m11059(oVar, C0104.m11201(), 4, 10, C0095.m9164());
        C0099.m10889(oVar);
    }

    public static w C(int i) {
        C0090.m8635(C0104.m11201(), i);
        return new w(i);
    }

    private w(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0104.m11201() || rVar == C0092.m8764() || rVar == C0091.m8664() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == C0092.m8764()) {
            return C0084.m8080(1L, m8366(this) <= 0 ? 1000000000L : 999999999L);
        }
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return C0092.m8732(C0087.m8494(this, rVar), C0088.m8565(this, rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m8365()[C0105.m11258((j$.time.temporal.a) rVar)];
        int iM8366 = m8366(this);
        if (i == 1) {
            if (iM8366 < 1) {
                iM8366 = 1 - iM8366;
            }
            return iM8366;
        }
        if (i == 2) {
            return iM8366;
        }
        if (i == 3) {
            return iM8366 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(C0101.m11024(C0092.m8731(m8367(), 79, 19, 1044), rVar));
    }

    public final w F(long j, j$.time.temporal.r rVar) {
        long j2 = j;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (w) C0090.m8657(rVar, this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        C0090.m8635(aVar, j2);
        int i = m8365()[C0105.m11258(aVar)];
        int iM8366 = m8366(this);
        if (i == 1) {
            if (iM8366 < 1) {
                j2 = 1 - j2;
            }
            return C0096.m10783((int) j2);
        }
        if (i == 2) {
            return C0096.m10783((int) j2);
        }
        if (i == 3) {
            return C0088.m8565(this, C0091.m8664()) == j2 ? this : C0096.m10783(1 - iM8366);
        }
        throw new j$.time.temporal.v(C0101.m11024(C0095.m9204(m8367(), 60, 19, 2337), rVar));
    }

    public final w D(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (w) C0089.m8580(uVar, this, j);
        }
        int i = m8364()[C0105.m11258((j$.time.temporal.b) uVar)];
        if (i == 1) {
            return C0101.m11025(this, j);
        }
        if (i == 2) {
            return C0101.m11025(this, C0081.m7854(j, 10));
        }
        if (i == 3) {
            return C0101.m11025(this, C0081.m7854(j, 100));
        }
        if (i == 4) {
            return C0101.m11025(this, C0081.m7854(j, 1000));
        }
        if (i == 5) {
            j$.time.temporal.a aVarM8664 = C0091.m8664();
            return C0082.m7996(this, C0086.m8284(C0088.m8565(this, aVarM8664), j), aVarM8664);
        }
        StringBuilder sb = new StringBuilder(C0083.m8037(m8367(), 42, 18, 3212));
        C0082.m7988(sb, uVar);
        throw new j$.time.temporal.v(C0099.m10924(sb));
    }

    public final w E(long j) {
        return j == 0 ? this : C0096.m10783(C0081.m7859(C0104.m11201(), ((long) m8366(this)) + j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0104.m11247(C0104.m11247(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0104.m11247(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0086.m8277()) {
            return C0103.m11146();
        }
        if (tVar == C0102.m11078()) {
            return C0106.m11311();
        }
        return C0096.m10784(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!C0102.m11120(C0086.m8323(mVar), C0103.m11146())) {
            throw new DateTimeException(C0084.m8120(m8367(), 98, 42, 383));
        }
        return C0089.m8600(mVar, m8366(this), C0104.m11201());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return m8366(this) == m8366((w) obj);
        }
        return false;
    }

    public final int hashCode() {
        return m8366(this);
    }

    public final String toString() {
        return C0102.m11091(m8366(this));
    }

    private Object writeReplace() {
        return new u(Ascii.VT, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0098.m10856(m8367(), 0, 42, 953));
    }

    final void G(DataOutput dataOutput) {
        C0091.m8668(dataOutput, m8366(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (w) C0092.m8737(hVar, this);
    }
}
