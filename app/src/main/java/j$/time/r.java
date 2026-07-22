package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f446short = {2829, 2824, 2845, 2828, 2877, 2816, 2820, 2828, 315, 306, 306, 295, 305, 288, 911, 942, 952, 942, 953, 930, 938, 935, 930, 945, 938, 959, 930, 932, 933, 1003, 957, 930, 938, 1003, 952, 942, 953, 930, 938, 935, 930, 945, 938, 959, 930, 932, 933, 1003, 943, 942, 935, 942, 940, 938, 959, 942, 1804, 1803, 1814, 1809, 1796, 1803, 1809, 2971, 2958, 2959, 2948, 2370, 2405, 2429, 2410, 2407, 2402, 2415, 2347, 2413, 2402, 2414, 2407, 2415, 2347, 2348, 2370, 2405, 2424, 2431, 2410, 2405, 2431, 2392, 2414, 2408, 2404, 2405, 2415, 2424, 2348, 2347, 2413, 2404, 2425, 2347, 2412, 2414, 2431, 2339, 2338, 2347, 2406, 2414, 2431, 2403, 2404, 2415, 2343, 2347, 2430, 2424, 2414, 2347, 2412, 2414, 2431, 2375, 2404, 2405, 2412, 2339, 2338, 2347, 2402, 2405, 2424, 2431, 2414, 2410, 2415};
    private final j a;
    private final A b;

    /* JADX INFO: renamed from: ۟۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8172(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            ((A) obj).O((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m8173() {
        if (C0094.m9148() > 0) {
            return f446short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int[] m8174() {
        if (C0105.m11264() > 0) {
            return q.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static r m8175(Object obj, Object obj2, Object obj3) {
        if (C0102.m11109() <= 0) {
            return ((r) obj).G((j) obj2, (A) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static l m8176(Object obj) {
        if (C0105.m11264() >= 0) {
            return l.R((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static j m8177(Object obj) {
        if (C0098.m10857() < 0) {
            return ((r) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static A m8178(Object obj) {
        if (C0079.m7512() > 0) {
            return A.N((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static A m8179(Object obj) {
        if (C0093.m9101() > 0) {
            return ((r) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static void m8180(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            ((j) obj).T((DataOutput) obj2);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iM11272;
        r rVar = (r) obj;
        A aM8179 = m8179(rVar);
        A aM81792 = m8179(this);
        boolean zM10807 = C0097.m10807(aM81792, aM8179);
        j jVarM8177 = m8177(rVar);
        j jVarM81772 = m8177(this);
        if (zM10807) {
            iM11272 = C0082.m7976(jVarM81772, jVarM8177);
        } else {
            C0092.m8727(jVarM81772);
            long jM11133 = C0103.m11133(jVarM81772, aM81792);
            C0092.m8727(jVarM8177);
            iM11272 = C0105.m11272(jM11133, C0103.m11133(jVarM8177, m8179(rVar)));
            if (iM11272 == 0) {
                iM11272 = C0106.m11356(C0097.m10828(jVarM81772)) - C0106.m11356(C0097.m10828(jVarM8177));
            }
        }
        return iM11272 == 0 ? C0082.m7976(jVarM81772, jVarM8177) : iM11272;
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0092.m8735(this, j, uVar);
    }

    static {
        j jVarM8089 = C0084.m8089();
        A aM7985 = C0082.m7985();
        C0092.m8727(jVarM8089);
        C0105.m11266(jVarM8089, aM7985);
        j jVarM8101 = C0084.m8101();
        A aM8460 = C0087.m8460();
        C0092.m8727(jVarM8101);
        C0105.m11266(jVarM8101, aM8460);
    }

    public static r C(j jVar, A a) {
        return new r(jVar, a);
    }

    private r(j jVar, A a) {
        this.a = (j) C0079.m7494(jVar, C0098.m10856(m8173(), 0, 8, 2921));
        this.b = (A) C0079.m7494(a, C0081.m7837(m8173(), 8, 6, 340));
    }

    private r G(j jVar, A a) {
        return (m8177(this) == jVar && C0097.m10807(m8179(this), a)) ? this : new r(jVar, a);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && C0103.m11161(rVar, this));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0101.m11033() || rVar == C0088.m8508()) {
                return C0090.m8651((j$.time.temporal.a) rVar);
            }
            return C0092.m8757(m8177(this), rVar);
        }
        return C0094.m9149(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m8174()[C0105.m11258((j$.time.temporal.a) rVar)];
            if (i == 1) {
                throw new j$.time.temporal.v(C0101.m11060(m8173(), 67, 70, 2315));
            }
            if (i == 2) {
                return C0088.m8527(m8179(this));
            }
            return C0079.m7515(m8177(this), rVar);
        }
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m8174()[C0105.m11258((j$.time.temporal.a) rVar)];
        A aM8179 = m8179(this);
        j jVarM8177 = m8177(this);
        if (i != 1) {
            return i != 2 ? C0084.m8084(jVarM8177, rVar) : C0088.m8527(aM8179);
        }
        C0092.m8727(jVarM8177);
        return C0103.m11133(jVarM8177, aM8179);
    }

    public final j F() {
        return m8177(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return m8175(this, C0102.m11098(m8177(this), hVar), m8179(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = m8174()[C0105.m11258(aVar)];
            A aM8179 = m8179(this);
            j jVarM8177 = m8177(this);
            if (i != 1) {
                if (i == 2) {
                    return m8175(this, jVarM8177, C0090.m8622(C0081.m7859(aVar, j)));
                }
                return m8175(this, C0102.m11077(jVarM8177, j, rVar), aM8179);
            }
            Instant instantM10879 = C0099.m10879(j, C0095.m9199(jVarM8177));
            C0079.m7494(instantM10879, C0096.m10776(m8173(), 56, 7, 1893));
            C0079.m7494(aM8179, C0087.m8474(m8173(), 63, 4, 3041));
            A aM7492 = C0079.m7492(C0104.m11198(aM8179), instantM10879);
            return new r(C0102.m11100(C0088.m8560(instantM10879), C0096.m10754(instantM10879), aM7492), aM7492);
        }
        return (r) C0090.m8657(rVar, this, j);
    }

    public final r D(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return m8175(this, C0092.m8783(m8177(this), j, uVar), m8179(this));
        }
        return (r) C0089.m8580(uVar, this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0092.m8735(C0092.m8735(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0092.m8735(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0081.m7843() || tVar == C0094.m9122()) {
            return m8179(this);
        }
        if (tVar == C0084.m8090()) {
            return null;
        }
        j$.time.temporal.t tVarM10834 = C0097.m10834();
        j jVarM8177 = m8177(this);
        if (tVar == tVarM10834) {
            return C0086.m8328(jVarM8177);
        }
        if (tVar == C0081.m7795()) {
            return C0097.m10828(jVarM8177);
        }
        if (tVar == C0086.m8277()) {
            return C0103.m11146();
        }
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        return C0095.m9223(tVar, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVarM9191 = C0095.m9191();
        j jVarM8177 = m8177(this);
        return C0089.m8600(C0089.m8600(C0089.m8600(mVar, C0086.m8288(C0086.m8328(jVarM8177)), aVarM9191), C0101.m11026(C0097.m10828(jVarM8177)), C0090.m8636()), C0088.m8527(m8179(this)), C0088.m8508());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C0096.m10758(m8177(this), m8177(rVar)) && C0097.m10807(m8179(this), m8179(rVar));
    }

    public final int hashCode() {
        return C0103.m11124(m8177(this)) ^ C0080.m7536(m8179(this));
    }

    public final String toString() {
        String strM10766 = C0096.m10766(m8177(this));
        String strM7990 = C0082.m7990(m8179(this));
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM10766);
        C0101.m11052(sb, strM7990);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0104.m11206(m8173(), 14, 42, 971));
    }

    final void writeExternal(ObjectOutput objectOutput) {
        m8180(m8177(this), objectOutput);
        m8172(m8179(this), objectOutput);
    }

    static r E(ObjectInput objectInput) {
        C0084.m8089();
        C0094.m9157();
        return new r(C0100.m11000(C0079.m7525(C0091.m8693(objectInput), C0103.m11126(objectInput), C0103.m11126(objectInput)), m8176(objectInput)), m8178(objectInput));
    }
}
