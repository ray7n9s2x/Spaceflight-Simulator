package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.io.C0103;
import java.io.C0104;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends AbstractC0491d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f409short = {2921, 2888, 2910, 2888, 2911, 2884, 2892, 2881, 2884, 2903, 2892, 2905, 2884, 2882, 2883, 2829, 2907, 2884, 2892, 2829, 2910, 2888, 2911, 2884, 2892, 2881, 2884, 2903, 2892, 2905, 2884, 2882, 2883, 2829, 2889, 2888, 2881, 2888, 2890, 2892, 2905, 2888, 2286, 2261, 2248, 2254, 2251, 2251, 2260, 2249, 2255, 2270, 2271, 2203, 2269, 2258, 2270, 2263, 2271, 2177, 2203, 2039, 1996, 2001, 2007, 2002, 2002, 1997, 2000, 2006, 1991, 1990, 1922, 1988, 1995, 1991, 1998, 1990, 1944, 1922, 2962, 2985, 2996, 2994, 2999, 2999, 2984, 2997, 2995, 2978, 2979, 3047, 2977, 2990, 2978, 2987, 2979, 3069, 3047};
    private final transient q a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    /* JADX INFO: renamed from: ۟۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int[] m7755(Object obj, int i) {
        if (C0079.m7512() >= 0) {
            return ((q) obj).C(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static long m7756(Object obj, int i, int i2, int i3) {
        if (C0103.m11154() < 0) {
            return ((q) obj).w(i, i2, i3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7757(Object obj) {
        if (C0083.m8022() < 0) {
            return ((s) obj).J();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۢ, reason: not valid java name and contains not printable characters */
    public static int[] m7758() {
        if (C0091.m8708() >= 0) {
            return r.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static s m7759(Object obj, int i, int i2, int i3) {
        if (C0081.m7818() <= 0) {
            return ((s) obj).O(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7760(Object obj) {
        if (C0101.m11044() < 0) {
            return ((s) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int m7761(Object obj) {
        if (C0102.m11109() < 0) {
            return ((s) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m7762(Object obj, int i, int i2) {
        if (C0106.m11345() < 0) {
            return ((q) obj).D(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7763() {
        if (C0106.m11345() <= 0) {
            return f409short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7764(Object obj) {
        if (C0080.m7553() > 0) {
            return ((s) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7765(Object obj, long j) {
        if (C0090.m8624() > 0) {
            return ((q) obj).n(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static s m7766(Object obj, long j) {
        if (C0105.m11264() > 0) {
            return ((s) obj).N(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static s m7767(Object obj, long j) {
        if (C0106.m11345() < 0) {
            return ((s) obj).M(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0494g m7768(Object obj, Object obj2) {
        if (C0106.m11345() <= 0) {
            return C0494g.D((InterfaceC0489b) obj, (j$.time.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int m7769(Object obj, int i) {
        if (C0080.m7553() > 0) {
            return ((q) obj).E(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ, reason: not valid java name and contains not printable characters */
    public static int m7770(Object obj, int i, int i2) {
        if (C0105.m11264() > 0) {
            return ((q) obj).v(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static q m7771(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((s) obj).a;
        }
        return null;
    }

    @Override // j$.time.chrono.AbstractC0491d
    final /* bridge */ /* synthetic */ InterfaceC0489b F(long j) {
        return m7767(this, j);
    }

    @Override // j$.time.chrono.AbstractC0491d
    final /* bridge */ /* synthetic */ InterfaceC0489b G(long j) {
        return m7766(this, j);
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final n a() {
        return m7771(this);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ InterfaceC0489b d(long j, j$.time.temporal.r rVar) {
        return C0102.m11074(this, j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0102.m11074(this, j, rVar);
    }

    static s K(q qVar, int i, int i2, int i3) {
        return new s(qVar, i, i2, i3);
    }

    static s L(q qVar, long j) {
        return new s(qVar, j);
    }

    private s(q qVar, int i, int i2, int i3) {
        m7756(qVar, i, i2, i3);
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private s(q qVar, long j) {
        int[] iArrM7755 = m7755(qVar, (int) j);
        this.a = qVar;
        this.b = iArrM7755[0];
        this.c = iArrM7755[1];
        this.d = iArrM7755[2];
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final o D() {
        return C0090.m8619();
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0094.m9149(rVar, this);
        }
        if (!C0092.m8767(this, rVar)) {
            throw new j$.time.temporal.v(C0101.m11024(C0095.m9204(m7763(), 61, 19, 1954), rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = m7758()[C0105.m11258(aVar)];
        int iM7764 = m7764(this);
        return i != 1 ? i != 2 ? i != 3 ? C0084.m8119(m7771(this), aVar) : C0084.m8080(1L, 5L) : C0084.m8080(1L, m7769(r3, iM7764)) : C0084.m8080(1L, m7762(r3, iM7764, m7760(this)));
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m7758()[C0105.m11258((j$.time.temporal.a) rVar)];
        int iM7760 = m7760(this);
        int iM7761 = m7761(this);
        int iM7764 = m7764(this);
        switch (i) {
            case 1:
                return iM7761;
            case 2:
                return m7757(this);
            case 3:
                return ((iM7761 - 1) / 7) + 1;
            case 4:
                return ((int) C0090.m8641(C0102.m11089(this) + 3, 7)) + 1;
            case 5:
                return ((iM7761 - 1) % 7) + 1;
            case 6:
                return ((m7757(this) - 1) % 7) + 1;
            case 7:
                return C0102.m11089(this);
            case 8:
                return ((m7757(this) - 1) / 7) + 1;
            case 9:
                return iM7760;
            case 10:
                return ((((long) iM7764) * 12) + ((long) iM7760)) - 1;
            case 11:
                return iM7764;
            case 12:
                return iM7764;
            case 13:
                return iM7764 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0089.m8581(m7763(), 80, 19, 3015), rVar));
        }
    }

    public final s P(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (s) super.d(j, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        q qVarM7771 = m7771(this);
        C0100.m10984(C0084.m8119(qVarM7771, aVar), j, aVar);
        int i = (int) j;
        int i2 = m7758()[C0105.m11258(aVar)];
        int iM7761 = m7761(this);
        int iM7760 = m7760(this);
        int iM7764 = m7764(this);
        switch (i2) {
            case 1:
                return m7759(this, iM7764, iM7760, i);
            case 2:
                return m7767(this, C0080.m7578(i, m7769(qVarM7771, iM7764)) - m7757(this));
            case 3:
                return m7767(this, (j - C0097.m10855(this, C0091.m8699())) * 7);
            case 4:
                return m7767(this, j - ((long) (((int) C0090.m8641(C0102.m11089(this) + 3, 7)) + 1)));
            case 5:
                return m7767(this, j - C0097.m10855(this, C0093.m9075()));
            case 6:
                return m7767(this, j - C0097.m10855(this, C0084.m8122()));
            case 7:
                return new s(qVarM7771, j);
            case 8:
                return m7767(this, (j - C0097.m10855(this, C0080.m7563())) * 7);
            case 9:
                return m7759(this, iM7764, i, iM7761);
            case 10:
                return m7766(this, j - (((((long) iM7764) * 12) + ((long) iM7760)) - 1));
            case 11:
                if (iM7764 < 1) {
                    i = 1 - i;
                }
                return m7759(this, i, iM7760, iM7761);
            case 12:
                return m7759(this, i, iM7760, iM7761);
            case 13:
                return m7759(this, 1 - iM7764, iM7760, iM7761);
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0086.m8291(m7763(), 42, 19, 2235), rVar));
        }
    }

    private s O(int i, int i2, int i3) {
        int i4 = i3;
        q qVarM7771 = m7771(this);
        int iM7762 = m7762(qVarM7771, i, i2);
        if (i4 > iM7762) {
            i4 = iM7762;
        }
        return new s(qVarM7771, i, i2, i4);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b I(j$.time.temporal.p pVar) {
        return (s) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (s) super.I(hVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final long t() {
        return m7756(m7771(this), m7764(this), m7760(this), m7761(this));
    }

    private int J() {
        return m7770(m7771(this), m7764(this), m7760(this)) + m7761(this);
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b H(long j) {
        if (j == 0) {
            return this;
        }
        long jM7764 = ((long) m7764(this)) + ((long) ((int) j));
        int i = (int) jM7764;
        if (jM7764 == i) {
            return m7759(this, i, m7760(this), m7761(this));
        }
        throw new ArithmeticException();
    }

    final s N(long j) {
        if (j == 0) {
            return this;
        }
        long jM7764 = (((long) m7764(this)) * 12) + ((long) (m7760(this) - 1)) + j;
        return m7759(this, m7765(m7771(this), C0102.m11106(jM7764, 12L)), ((int) C0090.m8641(jM7764, 12L)) + 1, m7761(this));
    }

    final s M(long j) {
        return new s(m7771(this), C0102.m11089(this) + j);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final InterfaceC0489b e(long j, j$.time.temporal.u uVar) {
        return (s) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (s) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b E(long j, j$.time.temporal.u uVar) {
        return (s) super.E(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (s) super.E(j, bVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return m7764(this) == m7764(sVar) && m7760(this) == m7760(sVar) && m7761(this) == m7761(sVar) && C0104.m11205(m7771(this), m7771(sVar));
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final int hashCode() {
        int iM11084 = C0102.m11084(C0100.m10975(m7771(this)));
        int iM7764 = m7764(this);
        return (iM11084 ^ (iM7764 & (-2048))) ^ (((iM7764 << 11) + (m7760(this) << 6)) + m7761(this));
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final InterfaceC0492e u(j$.time.l lVar) {
        return m7768(this, lVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0089.m8581(m7763(), 0, 42, 2861));
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C0104.m11197(objectOutput, m7771(this));
        C0091.m8668(objectOutput, C0103.m11167(this, C0104.m11201()));
        C0092.m8730(objectOutput, C0103.m11167(this, C0094.m9136()));
        C0092.m8730(objectOutput, C0103.m11167(this, C0084.m8118()));
    }
}
