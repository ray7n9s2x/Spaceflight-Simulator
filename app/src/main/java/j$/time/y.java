package j$.time;

import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
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
import java.io.Serializable;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f464short = {1159, 1190, 1200, 1190, 1201, 1194, 1186, 1199, 1194, 1209, 1186, 1207, 1194, 1196, 1197, 1251, 1205, 1194, 1186, 1251, 1200, 1190, 1201, 1194, 1186, 1199, 1194, 1209, 1186, 1207, 1194, 1196, 1197, 1251, 1191, 1190, 1199, 1190, 1188, 1186, 1207, 1190, 1456, 1419, 1430, 1424, 1429, 1429, 1418, 1431, 1425, 1408, 1409, 1477, 1424, 1419, 1420, 1425, 1503, 1477, 2158, 2133, 2120, 2126, 2123, 2123, 2132, 2121, 2127, 2142, 2143, 2075, 2141, 2130, 2142, 2135, 2143, 2049, 2075, 677, 670, 643, 645, 640, 640, 671, 642, 644, 661, 660, 720, 662, 665, 661, 668, 660, 714, 720, 1631, 1602, 1839, 1577, 1548, 1538, 1565, 1563, 1564, 1541, 1549, 1542, 1564, 1608, 1543, 1542, 1540, 1553, 1608, 1563, 1565, 1560, 1560, 1543, 1562, 1564, 1549, 1548, 1608, 1543, 1542, 1608, 1569, 1595, 1575, 1608, 1548, 1545, 1564, 1549, 1605, 1564, 1537, 1541, 1549};
    private final int a;
    private final int b;

    /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m8370(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((y) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8371() {
        if (C0082.m7983() < 0) {
            return f464short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int[] m8372() {
        if (C0103.m11154() < 0) {
            return x.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static y m8373(Object obj, int i, int i2) {
        if (C0096.m10782() > 0) {
            return ((y) obj).H(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static int m8374(Object obj) {
        if (C0106.m11345() < 0) {
            return ((y) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int[] m8375() {
        if (C0099.m10878() <= 0) {
            return x.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۥ, reason: not valid java name and contains not printable characters */
    public static long m8376(Object obj) {
        if (C0082.m7983() < 0) {
            return ((y) obj).C();
        }
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        int iM8370 = m8370(this) - m8370(yVar);
        return iM8370 == 0 ? m8374(this) - m8374(yVar) : iM8370;
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0088.m8543(this, j, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return C0096.m10755(this, j, uVar);
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        C0101.m11059(oVar, C0104.m11201(), 4, 10, C0095.m9164());
        C0102.m11099(oVar, '-');
        C0086.m8325(oVar, C0094.m9136(), 2);
        C0099.m10889(oVar);
    }

    private y(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private y H(int i, int i2) {
        return (m8370(this) == i && m8374(this) == i2) ? this : new y(i, i2);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0104.m11201() || rVar == C0094.m9136() || rVar == C0088.m8511() || rVar == C0092.m8764() || rVar == C0091.m8664() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == C0092.m8764()) {
            return C0084.m8080(1L, m8370(this) <= 0 ? 1000000000L : 999999999L);
        }
        return C0101.m11036(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return C0092.m8732(C0080.m7584(this, rVar), C0101.m11027(this, rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m8375()[C0105.m11258((j$.time.temporal.a) rVar)];
        if (i == 1) {
            return m8374(this);
        }
        if (i == 2) {
            return m8376(this);
        }
        int iM8370 = m8370(this);
        if (i == 3) {
            if (iM8370 < 1) {
                iM8370 = 1 - iM8370;
            }
            return iM8370;
        }
        if (i == 4) {
            return iM8370;
        }
        if (i == 5) {
            return iM8370 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(C0101.m11024(C0103.m11135(m8371(), 79, 19, 752), rVar));
    }

    private long C() {
        return ((((long) m8370(this)) * 12) + ((long) m8374(this))) - 1;
    }

    public final y I(long j, j$.time.temporal.r rVar) {
        long j2 = j;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (y) C0090.m8657(rVar, this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        C0090.m8635(aVar, j2);
        int i = m8375()[C0105.m11258(aVar)];
        int iM8370 = m8370(this);
        if (i == 1) {
            int i2 = (int) j2;
            C0090.m8635(C0094.m9136(), i2);
            return m8373(this, iM8370, i2);
        }
        if (i == 2) {
            return C0097.m10838(this, j2 - m8376(this));
        }
        int iM8374 = m8374(this);
        if (i == 3) {
            if (iM8370 < 1) {
                j2 = 1 - j2;
            }
            int i3 = (int) j2;
            C0090.m8635(C0104.m11201(), i3);
            return m8373(this, i3, iM8374);
        }
        if (i == 4) {
            int i4 = (int) j2;
            C0090.m8635(C0104.m11201(), i4);
            return m8373(this, i4, iM8374);
        }
        if (i != 5) {
            throw new j$.time.temporal.v(C0101.m11024(C0081.m7837(m8371(), 60, 19, 2107), rVar));
        }
        if (C0101.m11027(this, C0091.m8664()) == j2) {
            return this;
        }
        int i5 = 1 - iM8370;
        C0090.m8635(C0104.m11201(), i5);
        return m8373(this, i5, iM8374);
    }

    public final y D(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (y) C0089.m8580(uVar, this, j);
        }
        switch (m8372()[C0105.m11258((j$.time.temporal.b) uVar)]) {
            case 1:
                return C0097.m10838(this, j);
            case 2:
                return C0094.m9119(this, j);
            case 3:
                return C0094.m9119(this, C0081.m7854(j, 10));
            case 4:
                return C0094.m9119(this, C0081.m7854(j, 100));
            case 5:
                return C0094.m9119(this, C0081.m7854(j, 1000));
            case 6:
                j$.time.temporal.a aVarM8664 = C0091.m8664();
                return C0088.m8543(this, C0086.m8284(C0101.m11027(this, aVarM8664), j), aVarM8664);
            default:
                StringBuilder sb = new StringBuilder(C0100.m10962(m8371(), 42, 18, 1509));
                C0082.m7988(sb, uVar);
                throw new j$.time.temporal.v(C0099.m10924(sb));
        }
    }

    public final y F(long j) {
        return j == 0 ? this : m8373(this, C0081.m7859(C0104.m11201(), ((long) m8370(this)) + j), m8374(this));
    }

    public final y E(long j) {
        if (j == 0) {
            return this;
        }
        long jM8370 = (((long) m8370(this)) * 12) + ((long) (m8374(this) - 1)) + j;
        long j2 = 12;
        return m8373(this, C0081.m7859(C0104.m11201(), C0102.m11106(jM8370, j2)), ((int) C0090.m8641(jM8370, j2)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? C0096.m10755(C0096.m10755(this, Long.MAX_VALUE, bVar), 1L, bVar) : C0096.m10755(this, -j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0086.m8277()) {
            return C0103.m11146();
        }
        if (tVar == C0102.m11078()) {
            return C0089.m8599();
        }
        return C0096.m10784(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!C0102.m11120(C0086.m8323(mVar), C0103.m11146())) {
            throw new DateTimeException(C0102.m11094(m8371(), 101, 42, 1640));
        }
        return C0089.m8600(mVar, m8376(this), C0088.m8511());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return m8370(this) == m8370(yVar) && m8374(this) == m8374(yVar);
    }

    public final int hashCode() {
        return (m8374(this) << 27) ^ m8370(this);
    }

    public final String toString() {
        int iM8370 = m8370(this);
        int iM11238 = C0104.m11238(iM8370);
        StringBuilder sb = new StringBuilder(9);
        if (iM11238 >= 1000) {
            C0099.m10859(sb, iM8370);
        } else if (iM8370 < 0) {
            C0099.m10859(sb, iM8370 - 10000);
            C0099.m10921(sb, 1);
        } else {
            C0099.m10859(sb, iM8370 + 10000);
            C0099.m10921(sb, 0);
        }
        int iM8374 = m8374(this);
        C0101.m11052(sb, iM8374 < 10 ? C0080.m7573(m8371(), 98, 2, 1650) : C0092.m8731(m8371(), 100, 1, 1794));
        C0099.m10859(sb, iM8374);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0097.m10853(m8371(), 0, 42, 1219));
    }

    final void J(DataOutput dataOutput) {
        C0091.m8668(dataOutput, m8370(this));
        C0092.m8730(dataOutput, m8374(this));
    }

    static y G(ObjectInput objectInput) {
        int iM8693 = C0091.m8693(objectInput);
        byte bM11126 = C0103.m11126(objectInput);
        C0090.m8635(C0104.m11201(), iM8693);
        C0090.m8635(C0094.m9136(), bM11126);
        return new y(iM8693, bM11126);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (y) C0092.m8737(hVar, this);
    }
}
