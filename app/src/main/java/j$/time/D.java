package j$.time;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.chrono.InterfaceC0489b;
import j$.time.chrono.InterfaceC0492e;
import j$.time.chrono.InterfaceC0498k;
import j$.time.format.C0082;
import j$.time.format.C0083;
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
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements j$.time.temporal.m, InterfaceC0498k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f391short = {496, 499, 511, 509, 496, 472, 509, 488, 505, 456, 501, 497, 505, 3281, 3268, 3269, 3278, 881, 888, 888, 877, 891, 874, 2866, 2865, 2877, 2879, 2866, 2842, 2879, 2858, 2875, 2826, 2871, 2867, 2875, 2624, 2633, 2633, 2652, 2634, 2651, 2342, 2355, 2354, 2361, 1977, 1932, 1933, 1926, 1962, 1927, 1987, 1934, 1942, 1936, 1943, 1987, 1934, 1922, 1943, 1920, 1931, 1987, 1977, 1932, 1933, 1926, 1964, 1925, 1925, 1936, 1926, 1943, 1215, 1182, 1160, 1182, 1161, 1170, 1178, 1175, 1170, 1153, 1178, 1167, 1170, 1172, 1173, 1243, 1165, 1170, 1178, 1243, 1160, 1182, 1161, 1170, 1178, 1175, 1170, 1153, 1178, 1167, 1170, 1172, 1173, 1243, 1183, 1182, 1175, 1182, 1180, 1178, 1167, 1182, 2815, 2812, 2800, 2802, 2815, 2775, 2802, 2791, 2806, 2759, 2810, 2814, 2806, 1081, 1072, 1072, 1061, 1075, 1058, 2321, 2308, 2309, 2318, 966, 979, 978, 985, 2335, 2360, 2336, 2359, 2362, 2367, 2354, 2422, 2352, 2367, 2355, 2362, 2354, 2422, 2417, 2335, 2360, 2341, 2338, 2359, 2360, 2338, 2309, 2355, 2357, 2361, 2360, 2354, 2341, 2417, 2422, 2352, 2361, 2340, 2422, 2353, 2355, 2338, 2430, 2431, 2422, 2363, 2355, 2338, 2366, 2361, 2354, 2426, 2422, 2339, 2341, 2355, 2422, 2353, 2355, 2338, 2330, 2361, 2360, 2353, 2430, 2431, 2422, 2367, 2360, 2341, 2338, 2355, 2359, 2354, 2429, 3178};
    private final j a;
    private final A b;
    private final z c;

    /* JADX INFO: renamed from: ۟ۡ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static z m7602(Object obj) {
        if (C0099.m10878() < 0) {
            return ((D) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static A m7603(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((D) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static j m7604(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((D) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Serializable m7605(Object obj) {
        if (C0103.m11154() < 0) {
            return u.a((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m7606(Object obj, Object obj2) {
        if (C0092.m8724() < 0) {
            ((A) obj).O((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7607() {
        if (C0080.m7553() > 0) {
            return f391short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦ۟, reason: not valid java name and contains not printable characters */
    public static A m7608(Object obj) {
        if (C0090.m8624() > 0) {
            return A.N((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7609() {
        if (C0100.m10983() >= 0) {
            return C.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۡ, reason: contains not printable characters */
    public static void m7610(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((j) obj).T((DataOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۥۧ, reason: contains not printable characters */
    public static l m7611(Object obj) {
        if (C0081.m7818() <= 0) {
            return l.R((ObjectInput) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7612(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            ((z) obj).G((ObjectOutput) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static D m7613(long j, int i, Object obj) {
        if (C0093.m9101() >= 0) {
            return w(j, i, (z) obj);
        }
        return null;
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final /* synthetic */ long B() {
        return C0093.m9080(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return C0099.m10884(this, (InterfaceC0498k) obj);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0095.m9162(this, j, uVar);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0492e y() {
        return m7604(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final j$.time.chrono.n a() {
        return C0090.m8645((h) C0094.m9142(this));
    }

    public static D C(j jVar, z zVar, A a) {
        A aM8613 = a;
        j jVarM11002 = jVar;
        C0079.m7494(jVarM11002, C0099.m10897(m7607(), 0, 13, 412));
        C0079.m7494(zVar, C0097.m10853(m7607(), 13, 4, 3243));
        if (zVar instanceof A) {
            return new D(jVarM11002, zVar, (A) zVar);
        }
        j$.time.zone.f fVarM11198 = C0104.m11198(zVar);
        List listM8032 = C0083.m8032(fVarM11198, jVarM11002);
        if (C0091.m8675(listM8032) == 1) {
            aM8613 = (A) C0094.m9156(listM8032, 0);
        } else if (C0091.m8675(listM8032) == 0) {
            j$.time.zone.b bVarM8771 = C0092.m8771(fVarM11198, jVarM11002);
            jVarM11002 = C0100.m11002(jVarM11002, C0082.m8010(C0089.m8568(bVarM8771)));
            aM8613 = C0090.m8613(bVarM8771);
        } else if (aM8613 == null || !C0087.m8455(listM8032, aM8613)) {
            aM8613 = (A) C0079.m7494((A) C0094.m9156(listM8032, 0), C0100.m10962(m7607(), 17, 6, 798));
        }
        return new D(jVarM11002, zVar, aM8613);
    }

    private static D w(long j, int i, z zVar) {
        A aM7492 = C0079.m7492(C0104.m11198(zVar), C0099.m10879(j, i));
        return new D(C0102.m11100(j, i, aM7492), zVar, aM7492);
    }

    private D(j jVar, z zVar, A a) {
        this.a = jVar;
        this.b = a;
        this.c = zVar;
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
            return C0092.m8757(m7604(this), rVar);
        }
        return C0094.m9149(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m7609()[C0105.m11258((j$.time.temporal.a) rVar)];
            if (i == 1) {
                throw new j$.time.temporal.v(C0105.m11310(m7607(), 143, 70, 2390));
            }
            if (i == 2) {
                return C0088.m8527(m7603(this));
            }
            return C0079.m7515(m7604(this), rVar);
        }
        return C0081.m7832(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m7609()[C0105.m11258((j$.time.temporal.a) rVar)];
        return i != 1 ? i != 2 ? C0084.m8084(m7604(this), rVar) : C0088.m8527(m7603(this)) : C0093.m9080(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final A g() {
        return m7603(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final z q() {
        return m7602(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0498k h(z zVar) {
        C0079.m7494(zVar, C0096.m10776(m7607(), 139, 4, 956));
        return C0091.m8720(m7602(this), zVar) ? this : C0079.m7498(m7604(this), zVar, m7603(this));
    }

    public final j F() {
        return m7604(this);
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final InterfaceC0489b c() {
        return C0086.m8328(m7604(this));
    }

    @Override // j$.time.chrono.InterfaceC0498k
    public final l b() {
        return C0097.m10828(m7604(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return C0079.m7498(C0100.m11000(hVar, C0097.m10828(m7604(this))), m7602(this), m7603(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = m7609()[C0105.m11258(aVar)];
            j jVarM7604 = m7604(this);
            z zVarM7602 = m7602(this);
            if (i == 1) {
                return m7613(j, C0095.m9199(jVarM7604), zVarM7602);
            }
            A aM7603 = m7603(this);
            if (i != 2) {
                return C0079.m7498(C0102.m11077(jVarM7604, j, rVar), zVarM7602, aM7603);
            }
            A aM8622 = C0090.m8622(C0081.m7859(aVar, j));
            return (C0097.m10807(aM8622, aM7603) || !C0087.m8455(C0083.m8032(C0104.m11198(zVarM7602), jVarM7604), aM8622)) ? this : new D(jVarM7604, zVarM7602, aM8622);
        }
        return (D) C0090.m8657(rVar, this, j);
    }

    public final D D(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (D) C0089.m8580(uVar, this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        int iM8050 = C0083.m8050(bVar, C0095.m9215());
        A aM7603 = m7603(this);
        z zVarM7602 = m7602(this);
        j jVarM7604 = m7604(this);
        if (iM8050 >= 0 && bVar != C0082.m8011()) {
            return C0079.m7498(C0092.m8783(jVarM7604, j, uVar), zVarM7602, aM7603);
        }
        j jVarM8783 = C0092.m8783(jVarM7604, j, uVar);
        C0079.m7494(jVarM8783, C0089.m8581(m7607(), 116, 13, 2707));
        C0079.m7494(aM7603, C0097.m10853(m7607(), 129, 6, 1110));
        C0079.m7494(zVarM7602, C0089.m8581(m7607(), 135, 4, 2411));
        if (C0087.m8455(C0083.m8032(C0104.m11198(zVarM7602), jVarM8783), aM7603)) {
            return new D(jVarM8783, zVarM7602, aM7603);
        }
        C0092.m8727(jVarM8783);
        return m7613(C0103.m11133(jVarM8783, aM7603), C0095.m9199(jVarM8783), zVarM7602);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0095.m9162(C0095.m9162(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0095.m9162(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0097.m10834()) {
            return C0086.m8328(m7604(this));
        }
        return C0081.m7849(this, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return C0096.m10758(m7604(this), m7604(d)) && C0097.m10807(m7603(this), m7603(d)) && C0091.m8720(m7602(this), m7602(d));
    }

    public final int hashCode() {
        return (C0103.m11124(m7604(this)) ^ C0080.m7536(m7603(this))) ^ C0086.m8310(C0083.m8053(m7602(this)), 3);
    }

    public final String toString() {
        String strM10766 = C0096.m10766(m7604(this));
        A aM7603 = m7603(this);
        String strM7990 = C0082.m7990(aM7603);
        StringBuilder sb = new StringBuilder();
        C0101.m11052(sb, strM10766);
        C0101.m11052(sb, strM7990);
        String strM10924 = C0099.m10924(sb);
        z zVarM7602 = m7602(this);
        if (aM7603 == zVarM7602) {
            return strM10924;
        }
        String strM11245 = C0104.m11245(zVarM7602);
        StringBuilder sb2 = new StringBuilder();
        C0101.m11052(sb2, strM10924);
        C0101.m11052(sb2, C0086.m8291(m7607(), 213, 1, 2342));
        C0101.m11052(sb2, strM11245);
        C0101.m11052(sb2, C0105.m11310(m7607(), 214, 1, 3127));
        return C0099.m10924(sb2);
    }

    private Object writeReplace() {
        return new u((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0086.m8291(m7607(), 74, 42, 1275));
    }

    final void G(DataOutput dataOutput) {
        m7610(m7604(this), dataOutput);
        m7606(m7603(this), dataOutput);
        m7612(m7602(this), (ObjectOutput) dataOutput);
    }

    static D E(ObjectInput objectInput) {
        C0084.m8089();
        C0094.m9157();
        j jVarM11000 = C0100.m11000(C0079.m7525(C0091.m8693(objectInput), C0103.m11126(objectInput), C0103.m11126(objectInput)), m7611(objectInput));
        A aM7608 = m7608(objectInput);
        z zVar = (z) m7605(objectInput);
        C0079.m7494(jVarM11000, C0086.m8291(m7607(), 23, 13, 2910));
        C0079.m7494(aM7608, C0092.m8731(m7607(), 36, 6, 2607));
        C0079.m7494(zVar, C0081.m7837(m7607(), 42, 4, 2396));
        if ((zVar instanceof A) && !C0097.m10807(aM7608, zVar)) {
            throw new IllegalArgumentException(C0102.m11094(m7607(), 46, 28, 2019));
        }
        return new D(jVarM11000, zVar, aM7608);
    }
}
