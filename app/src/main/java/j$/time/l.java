package j$.time;

import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.common.base.Ascii;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
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
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    public static final l e;
    public static final l f;
    public static final l g;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f443short = {2303, 2286, 2278, 2299, 2276, 2297, 2282, 2279, 3044, 3039, 3024, 3027, 3037, 3028, 2961, 3013, 3038, 2961, 3038, 3027, 3013, 3024, 3032, 3039, 2961, 3069, 3038, 3026, 3024, 3037, 3045, 3032, 3036, 3028, 2961, 3031, 3011, 3038, 3036, 2961, 3045, 3028, 3036, 3009, 3038, 3011, 3024, 3037, 3056, 3026, 3026, 3028, 3010, 3010, 3038, 3011, 2955, 2961, 2950, 3017, 3008, 2950, 3026, 3039, 3030, 3011, 2950, 529, 554, 567, 561, 564, 564, 555, 566, 560, 545, 544, 612, 546, 557, 545, 552, 544, 638, 612, 665, 702, 678, 689, 700, 697, 692, 752, 694, 697, 693, 700, 692, 752, 759, 669, 697, 691, 674, 703, 671, 694, 660, 689, 681, 759, 752, 694, 703, 674, 752, 695, 693, 676, 760, 761, 752, 701, 693, 676, 696, 703, 692, 764, 752, 677, 675, 693, 752, 695, 693, 676, 668, 703, 702, 695, 760, 761, 752, 697, 702, 675, 676, 693, 689, 692, 1212, 1179, 1155, 1172, 1177, 1180, 1169, 1237, 1171, 1180, 1168, 1177, 1169, 1237, 1234, 1211, 1172, 1179, 1178, 1210, 1171, 1201, 1172, 1164, 1234, 1237, 1171, 1178, 1159, 1237, 1170, 1168, 1153, 1245, 1244, 1237, 1176, 1168, 1153, 1181, 1178, 1169, 1241, 1237, 1152, 1158, 1168, 1237, 1170, 1168, 1153, 1209, 1178, 1179, 1170, 1245, 1244, 1237, 1180, 1179, 1158, 1153, 1168, 1172, 1169, 432, 401, 391, 401, 390, 413, 405, 408, 413, 398, 405, 384, 413, 411, 410, 468, 386, 413, 405, 468, 391, 401, 390, 413, 405, 408, 413, 398, 405, 384, 413, 411, 410, 468, 400, 401, 408, 401, 403, 405, 384, 401, 1177, 1186, 1215, 1209, 1212, 1212, 1187, 1214, 1208, 1193, 1192, 1260, 1209, 1186, 1189, 1208, 1270, 1260, 785, 810, 823, 817, 820, 820, 811, 822, 816, 801, 800, 868, 802, 813, 801, 808, 800, 894, 868, 3254, 2208, 2432, 2442};
    private static final l[] h = new l[24];

    /* JADX INFO: renamed from: ۟۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int[] m8154() {
        if (C0103.m11154() < 0) {
            return k.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int[] m8155() {
        if (C0103.m11154() < 0) {
            return k.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static byte m8156(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((l) obj).a;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static l m8157(int i, int i2, int i3, int i4) {
        if (C0095.m9210() > 0) {
            return D(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8158(Object obj, Object obj2) {
        if (C0096.m10782() >= 0) {
            return ((l) obj).F((j$.time.temporal.r) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static l[] m8159() {
        if (C0098.m10857() <= 0) {
            return h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m8160(Object obj) {
        if (C0088.m8503() > 0) {
            return ((l) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static byte m8161(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((l) obj).c;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static byte m8162(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((l) obj).b;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۨ, reason: contains not printable characters */
    public static short[] m8163() {
        if (C0090.m8624() > 0) {
            return f443short;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C0083.m8025(this, (l) obj);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0080.m7549(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0081.m7840(this, j, uVar);
    }

    static {
        int i = 0;
        while (true) {
            l[] lVarArrM8159 = m8159();
            if (i < lVarArrM8159.length) {
                lVarArrM8159[i] = new l(i, 0, 0, 0);
                i++;
            } else {
                l lVar = lVarArrM8159[0];
                g = lVar;
                l lVar2 = lVarArrM8159[12];
                e = lVar;
                f = new l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static l J(int i) {
        C0090.m8635(C0097.m10797(), i);
        return m8159()[i];
    }

    public static l L(long j) {
        C0090.m8635(C0082.m8014(), j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return m8157(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    public static l K(long j) {
        C0090.m8635(C0090.m8636(), j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m8157(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static l E(j$.time.temporal.o oVar) {
        C0079.m7494(oVar, C0092.m8731(m8163(), 0, 8, 2187));
        l lVar = (l) C0088.m8522(oVar, C0081.m7795());
        if (lVar != null) {
            return lVar;
        }
        String strM8091 = C0084.m8091(C0092.m8727(oVar));
        StringBuilder sb = new StringBuilder(C0099.m10897(m8163(), 8, 50, 2993));
        C0082.m7988(sb, oVar);
        C0101.m11052(sb, C0097.m10853(m8163(), 58, 9, 2982));
        C0101.m11052(sb, strM8091);
        throw new DateTimeException(C0099.m10924(sb));
    }

    private static l D(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return m8159()[i];
        }
        return new l(i, i2, i3, i4);
    }

    private l(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return C0101.m11053((j$.time.temporal.a) rVar);
        }
        return rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return m8158(this, rVar);
        }
        return C0103.m11167(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == C0090.m8636()) {
                return C0101.m11026(this);
            }
            if (rVar == C0083.m8028()) {
                return C0101.m11026(this) / 1000;
            }
            return m8158(this, rVar);
        }
        return C0095.m9198(rVar, this);
    }

    private int F(j$.time.temporal.r rVar) {
        int i = m8155()[C0105.m11258((j$.time.temporal.a) rVar)];
        byte bM8162 = m8162(this);
        int iM8160 = m8160(this);
        byte bM8156 = m8156(this);
        switch (i) {
            case 1:
                return iM8160;
            case 2:
                throw new j$.time.temporal.v(C0080.m7573(m8163(), 152, 65, 1269));
            case 3:
                return iM8160 / 1000;
            case 4:
                throw new j$.time.temporal.v(C0094.m9107(m8163(), 86, 66, 720));
            case 5:
                return iM8160 / DurationKt.NANOS_IN_MILLIS;
            case 6:
                return (int) (C0101.m11026(this) / 1000000);
            case 7:
                return m8161(this);
            case 8:
                return C0102.m11070(this);
            case 9:
                return bM8162;
            case 10:
                return (bM8156 * 60) + bM8162;
            case 11:
                return bM8156 % 12;
            case 12:
                int i2 = bM8156 % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return bM8156;
            case 14:
                if (bM8156 == 0) {
                    return 24;
                }
                return bM8156;
            case 15:
                return bM8156 / 12;
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0079.m7503(m8163(), 67, 19, 580), rVar));
        }
    }

    public final int G() {
        return m8156(this);
    }

    public final int I() {
        return m8161(this);
    }

    public final int H() {
        return m8160(this);
    }

    public final l U(long j, j$.time.temporal.r rVar) {
        long j2 = j;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (l) C0090.m8657(rVar, this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        C0090.m8635(aVar, j2);
        int i = m8155()[C0105.m11258(aVar)];
        byte bM8162 = m8162(this);
        byte bM8161 = m8161(this);
        int iM8160 = m8160(this);
        byte bM8156 = m8156(this);
        switch (i) {
            case 1:
                return C0102.m11079(this, (int) j2);
            case 2:
                return C0085.m8231(j2);
            case 3:
                return C0102.m11079(this, ((int) j2) * 1000);
            case 4:
                return C0085.m8231(j2 * 1000);
            case 5:
                return C0102.m11079(this, ((int) j2) * DurationKt.NANOS_IN_MILLIS);
            case 6:
                return C0085.m8231(j2 * 1000000);
            case 7:
                int i2 = (int) j2;
                if (bM8161 == i2) {
                    return this;
                }
                C0090.m8635(C0094.m9112(), i2);
                return m8157(bM8156, bM8162, i2, iM8160);
            case 8:
                return C0092.m8766(this, j2 - ((long) C0102.m11070(this)));
            case 9:
                int i3 = (int) j2;
                if (bM8162 == i3) {
                    return this;
                }
                C0090.m8635(C0095.m9182(), i3);
                return m8157(bM8156, i3, bM8161, iM8160);
            case 10:
                return C0097.m10837(this, j2 - ((long) ((bM8156 * 60) + bM8162)));
            case 11:
                return C0085.m8253(this, j2 - ((long) (bM8156 % 12)));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return C0085.m8253(this, j2 - ((long) (bM8156 % 12)));
            case 13:
                int i4 = (int) j2;
                if (bM8156 == i4) {
                    return this;
                }
                C0090.m8635(C0097.m10797(), i4);
                return m8157(i4, bM8162, bM8161, iM8160);
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                int i5 = (int) j2;
                if (bM8156 == i5) {
                    return this;
                }
                C0090.m8635(C0097.m10797(), i5);
                return m8157(i5, bM8162, bM8161, iM8160);
            case 15:
                return C0085.m8253(this, (j2 - ((long) (bM8156 / 12))) * 12);
            default:
                throw new j$.time.temporal.v(C0101.m11024(C0092.m8731(m8163(), 277, 19, 836), rVar));
        }
    }

    public final l V(int i) {
        if (m8160(this) == i) {
            return this;
        }
        C0090.m8635(C0090.m8604(), i);
        return m8157(m8156(this), m8162(this), m8161(this), i);
    }

    public final l M(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (m8154()[C0105.m11258((j$.time.temporal.b) uVar)]) {
                case 1:
                    return C0099.m10890(this, j);
                case 2:
                    return C0099.m10890(this, (j % 86400000000L) * 1000);
                case 3:
                    return C0099.m10890(this, (j % 86400000) * 1000000);
                case 4:
                    return C0092.m8766(this, j);
                case 5:
                    return C0097.m10837(this, j);
                case 6:
                    return C0085.m8253(this, j);
                case 7:
                    return C0085.m8253(this, (j % 2) * 12);
                default:
                    StringBuilder sb = new StringBuilder(C0098.m10856(m8163(), AndroidBinXmlParser.Chunk.RES_XML_TYPE_END_ELEMENT, 18, 1228));
                    C0082.m7988(sb, uVar);
                    throw new j$.time.temporal.v(C0099.m10924(sb));
            }
        }
        return (l) C0089.m8580(uVar, this, j);
    }

    public final l N(long j) {
        if (j == 0) {
            return this;
        }
        return m8157(((((int) (j % 24)) + m8156(this)) + 24) % 24, m8162(this), m8161(this), m8160(this));
    }

    public final l O(long j) {
        if (j == 0) {
            return this;
        }
        int iM8156 = (m8156(this) * 60) + m8162(this);
        int i = ((((int) (j % 1440)) + iM8156) + 1440) % 1440;
        return iM8156 == i ? this : m8157(i / 60, i % 60, m8161(this), m8160(this));
    }

    public final l Q(long j) {
        if (j == 0) {
            return this;
        }
        int iM8162 = (m8162(this) * 60) + (m8156(this) * Ascii.DLE) + m8161(this);
        int i = ((((int) (j % 86400)) + iM8162) + 86400) % 86400;
        return iM8162 == i ? this : m8157(i / 3600, (i / 60) % 60, i % 60, m8160(this));
    }

    public final l P(long j) {
        if (j == 0) {
            return this;
        }
        long jM11026 = C0101.m11026(this);
        long j2 = (((j % 86400000000000L) + jM11026) + 86400000000000L) % 86400000000000L;
        return jM11026 == j2 ? this : m8157((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0081.m7840(C0081.m7840(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0081.m7840(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0086.m8277() || tVar == C0084.m8090() || tVar == C0094.m9122() || tVar == C0081.m7843()) {
            return null;
        }
        if (tVar == C0081.m7795()) {
            return this;
        }
        if (tVar == C0097.m10834()) {
            return null;
        }
        if (tVar == C0102.m11078()) {
            return C0086.m8322();
        }
        return C0095.m9223(tVar, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return C0089.m8600(mVar, C0101.m11026(this), C0090.m8636());
    }

    public final int T() {
        return (m8162(this) * 60) + (m8156(this) * Ascii.DLE) + m8161(this);
    }

    public final long S() {
        return (((long) m8161(this)) * 1000000000) + (((long) m8162(this)) * 60000000000L) + (((long) m8156(this)) * 3600000000000L) + ((long) m8160(this));
    }

    public final int C(l lVar) {
        int iM8273 = C0085.m8273(m8156(this), m8156(lVar));
        if (iM8273 != 0) {
            return iM8273;
        }
        int iM82732 = C0085.m8273(m8162(this), m8162(lVar));
        if (iM82732 != 0) {
            return iM82732;
        }
        int iM82733 = C0085.m8273(m8161(this), m8161(lVar));
        return iM82733 == 0 ? C0085.m8273(m8160(this), m8160(lVar)) : iM82733;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return m8156(this) == m8156(lVar) && m8162(this) == m8162(lVar) && m8161(this) == m8161(lVar) && m8160(this) == m8160(lVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (l) C0092.m8737(hVar, this);
    }

    public final int hashCode() {
        long jM11026 = C0101.m11026(this);
        return (int) (jM11026 ^ (jM11026 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte bM8156 = m8156(this);
        C0101.m11052(sb, bM8156 < 10 ? C0098.m10856(m8163(), 296, 1, 3206) : C0102.m11090());
        C0099.m10859(sb, bM8156);
        String strM10776 = C0096.m10776(m8163(), 297, 1, 2202);
        String strM7503 = C0079.m7503(m8163(), 298, 2, 2490);
        byte bM8162 = m8162(this);
        C0101.m11052(sb, bM8162 < 10 ? strM7503 : strM10776);
        C0099.m10859(sb, bM8162);
        byte bM8161 = m8161(this);
        int iM8160 = m8160(this);
        if (bM8161 > 0 || iM8160 > 0) {
            if (bM8161 < 10) {
                strM10776 = strM7503;
            }
            C0101.m11052(sb, strM10776);
            C0099.m10859(sb, bM8161);
            if (iM8160 > 0) {
                C0089.m8573(sb, '.');
                if (iM8160 % DurationKt.NANOS_IN_MILLIS == 0) {
                    C0101.m11052(sb, C0104.m11217(C0102.m11091((iM8160 / DurationKt.NANOS_IN_MILLIS) + 1000), 1));
                } else if (iM8160 % 1000 == 0) {
                    C0101.m11052(sb, C0104.m11217(C0102.m11091((iM8160 / 1000) + DurationKt.NANOS_IN_MILLIS), 1));
                } else {
                    C0101.m11052(sb, C0104.m11217(C0102.m11091(iM8160 + 1000000000), 1));
                }
            }
        }
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0105.m11310(m8163(), 217, 42, 500));
    }

    final void W(DataOutput dataOutput) {
        byte bM8161 = m8161(this);
        byte bM8156 = m8156(this);
        byte bM8162 = m8162(this);
        int iM8160 = m8160(this);
        if (iM8160 != 0) {
            C0092.m8730(dataOutput, bM8156);
            C0092.m8730(dataOutput, bM8162);
            C0092.m8730(dataOutput, bM8161);
            C0091.m8668(dataOutput, iM8160);
            return;
        }
        if (bM8161 != 0) {
            C0092.m8730(dataOutput, bM8156);
            C0092.m8730(dataOutput, bM8162);
            C0092.m8730(dataOutput, ~bM8161);
        } else if (bM8162 == 0) {
            C0092.m8730(dataOutput, ~bM8156);
        } else {
            C0092.m8730(dataOutput, bM8156);
            C0092.m8730(dataOutput, ~bM8162);
        }
    }

    static l R(ObjectInput objectInput) {
        int i;
        int iM8693;
        int iM11126 = C0103.m11126(objectInput);
        int i2 = 0;
        if (iM11126 >= 0) {
            byte bM11126 = C0103.m11126(objectInput);
            if (bM11126 < 0) {
                int i3 = ~bM11126;
                iM8693 = 0;
                i2 = i3;
                i = 0;
            } else {
                byte bM111262 = C0103.m11126(objectInput);
                if (bM111262 < 0) {
                    i = ~bM111262;
                    i2 = bM11126;
                } else {
                    i = bM111262;
                    iM8693 = C0091.m8693(objectInput);
                    i2 = bM11126;
                }
            }
            C0090.m8635(C0097.m10797(), iM11126);
            C0090.m8635(C0095.m9182(), i2);
            C0090.m8635(C0094.m9112(), i);
            C0090.m8635(C0090.m8604(), iM8693);
            return m8157(iM11126, i2, i, iM8693);
        }
        iM11126 = ~iM11126;
        i = 0;
        iM8693 = 0;
        C0090.m8635(C0097.m10797(), iM11126);
        C0090.m8635(C0095.m9182(), i2);
        C0090.m8635(C0094.m9112(), i);
        C0090.m8635(C0090.m8604(), iM8693);
        return m8157(iM11126, i2, i, iM8693);
    }
}
