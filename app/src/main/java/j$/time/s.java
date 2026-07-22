package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
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
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f447short = {1195, 1206, 1202, 1210, 1820, 1813, 1813, 1792, 1814, 1799, 2934, 2903, 2881, 2903, 2880, 2907, 2899, 2910, 2907, 2888, 2899, 2886, 2907, 2909, 2908, 2834, 2884, 2907, 2899, 2834, 2881, 2903, 2880, 2907, 2899, 2910, 2907, 2888, 2899, 2886, 2907, 2909, 2908, 2834, 2902, 2903, 2910, 2903, 2901, 2899, 2886, 2903};
    private final l a;
    private final A b;

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static s m8181(Object obj, Object obj2, Object obj3) {
        if (C0085.m8230() > 0) {
            return ((s) obj).F((l) obj2, (A) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8182(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            ((l) obj).W((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m8183() {
        if (C0091.m8708() > 0) {
            return f447short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m8184(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            ((A) obj).O((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static A m8185(Object obj) {
        if (C0106.m11345() < 0) {
            return A.N((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static l m8186(Object obj) {
        if (C0088.m8503() > 0) {
            return l.R((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤ۟, reason: contains not printable characters */
    public static A m8187(Object obj) {
        if (C0099.m10878() < 0) {
            return ((s) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static l m8188(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((s) obj).a;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        A aM8187 = m8187(sVar);
        A aM81872 = m8187(this);
        boolean zM10807 = C0097.m10807(aM81872, aM8187);
        l lVarM8188 = m8188(sVar);
        l lVarM81882 = m8188(this);
        if (zM10807) {
            return C0083.m8025(lVarM81882, lVarM8188);
        }
        int iM11272 = C0105.m11272(C0101.m11026(lVarM81882) - (((long) C0088.m8527(aM81872)) * 1000000000), C0101.m11026(lVarM8188) - (((long) C0088.m8527(m8187(sVar))) * 1000000000));
        return iM11272 == 0 ? C0083.m8025(lVarM81882, lVarM8188) : iM11272;
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0084.m8100(this, j, uVar);
    }

    static {
        l lVarM8036 = C0083.m8036();
        A aM7985 = C0082.m7985();
        C0092.m8727(lVarM8036);
        C0080.m7557(lVarM8036, aM7985);
        l lVarM9216 = C0095.m9216();
        A aM8460 = C0087.m8460();
        C0092.m8727(lVarM9216);
        C0080.m7557(lVarM9216, aM8460);
    }

    public static s C(l lVar, A a) {
        return new s(lVar, a);
    }

    private s(l lVar, A a) {
        this.a = (l) C0079.m7494(lVar, C0101.m11060(m8183(), 0, 4, 1247));
        this.b = (A) C0079.m7494(a, C0102.m11094(m8183(), 4, 6, 1907));
    }

    private s F(l lVar, A a) {
        return (m8188(this) == lVar && C0097.m10807(m8187(this), a)) ? this : new s(lVar, a);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? C0101.m11053((j$.time.temporal.a) rVar) || rVar == C0088.m8508() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0088.m8508()) {
                return C0090.m8651((j$.time.temporal.a) rVar);
            }
            l lVarM8188 = m8188(this);
            C0092.m8727(lVarM8188);
            return C0101.m11036(lVarM8188, rVar);
        }
        return C0094.m9149(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0088.m8508()) {
                return C0088.m8527(m8187(this));
            }
            return C0103.m11131(m8188(this), rVar);
        }
        return C0095.m9198(rVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVarM8508 = C0088.m8508();
            l lVarM8188 = m8188(this);
            if (rVar == aVarM8508) {
                return m8181(this, lVarM8188, C0090.m8622(C0081.m7859((j$.time.temporal.a) rVar, j)));
            }
            return m8181(this, C0080.m7549(lVarM8188, j, rVar), m8187(this));
        }
        return (s) C0090.m8657(rVar, this, j);
    }

    public final s D(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return m8181(this, C0081.m7840(m8188(this), j, uVar), m8187(this));
        }
        return (s) C0089.m8580(uVar, this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0084.m8100(C0084.m8100(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0084.m8100(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0081.m7843() || tVar == C0094.m9122()) {
            return m8187(this);
        }
        if (((tVar == C0084.m8090()) || (tVar == C0086.m8277())) || tVar == C0097.m10834()) {
            return null;
        }
        if (tVar == C0081.m7795()) {
            return m8188(this);
        }
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        return C0095.m9223(tVar, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(C0089.m8600(mVar, C0101.m11026(m8188(this)), C0090.m8636()), C0088.m8527(m8187(this)), C0088.m8508());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C0086.m8331(m8188(this), m8188(sVar)) && C0097.m10807(m8187(this), m8187(sVar));
    }

    public final int hashCode() {
        return C0079.m7476(m8188(this)) ^ C0080.m7536(m8187(this));
    }

    public final String toString() {
        String strM8297 = C0086.m8297(m8188(this));
        String strM7990 = C0082.m7990(m8187(this));
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM8297);
        C0101.m11052(sb, strM7990);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0091.m8679(m8183(), 10, 42, 2866));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        m8182(m8188(this), objectOutput);
        m8184(m8187(this), objectOutput);
    }

    static s E(ObjectInput objectInput) {
        return new s(m8186(objectInput), m8185(objectInput));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (s) C0092.m8737(hVar, this);
    }
}
