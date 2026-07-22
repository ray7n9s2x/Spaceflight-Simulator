package j$.time;

import com.google.common.base.Ascii;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
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
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements j$.time.temporal.o, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f445short = {1392, 1392, 1566, 1564, 1565, 1543, 1563, 3202, 3239, 3239, 3246, 3244, 3242, 3239, 3307, 3261, 3242, 3239, 3262, 3246, 3307, 3245, 3236, 3257, 3307, 3215, 3242, 3250, 3204, 3245, 3206, 3236, 3237, 3263, 3235, 3307, 3245, 3234, 3246, 3239, 3247, 3303, 3307, 3261, 3242, 3239, 3262, 3246, 3307, 656, 729, 707, 656, 734, 735, 708, 656, 710, 721, 732, 729, 724, 656, 726, 735, 706, 656, 733, 735, 734, 708, 728, 656, 2448, 2481, 2471, 2481, 2470, 2493, 2485, 2488, 2493, 2478, 2485, 2464, 2493, 2491, 2490, 2548, 2466, 2493, 2485, 2548, 2471, 2481, 2470, 2493, 2485, 2488, 2493, 2478, 2485, 2464, 2493, 2491, 2490, 2548, 2480, 2481, 2488, 2481, 2483, 2485, 2464, 2481, 2980, 2975, 2946, 2948, 2945, 2945, 2974, 2947, 2949, 2964, 2965, 3025, 2967, 2968, 2964, 2973, 2965, 3019, 3025, 1092, 1092, 810, 2657, 2684, 1684, 2906, 2943, 2929, 2926, 2920, 2927, 2934, 2942, 2933, 2927, 2875, 2932, 2933, 2935, 2914, 2875, 2920, 2926, 2923, 2923, 2932, 2921, 2927, 2942, 2943, 2875, 2932, 2933, 2875, 2898, 2888, 2900, 2875, 2943, 2938, 2927, 2942, 2870, 2927, 2930, 2934, 2942};
    private final int a;
    private final int b;

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int[] m8166() {
        if (C0098.m10857() <= 0) {
            return m.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m8167(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((p) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m8168() {
        if (C0087.m8458() <= 0) {
            return o.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8169() {
        if (C0080.m7553() > 0) {
            return f445short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m8170(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((p) obj).a;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int iM8170 = m8170(this) - m8170(pVar);
        return iM8170 == 0 ? m8167(this) - m8167(pVar) : iM8170;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        C0091.m8669(oVar, C0102.m11094(m8169(), 0, 2, 1373));
        C0086.m8325(oVar, C0094.m9136(), 2);
        C0102.m11099(oVar, '-');
        C0086.m8325(oVar, C0084.m8118(), 2);
        C0099.m10889(oVar);
    }

    private p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == C0094.m9136() || rVar == C0084.m8118() : rVar != null && C0103.m11161(rVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == C0094.m9136()) {
            return C0105.m11271(rVar);
        }
        if (rVar != C0084.m8118()) {
            return C0101.m11036(this, rVar);
        }
        n nVarM9171 = C0095.m9171(m8170(this));
        C0092.m8727(nVarM9171);
        int i = m8166()[C0105.m11258(nVarM9171)];
        return C0083.m8075(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, C0082.m7982(C0095.m9171(r5)));
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return C0092.m8732(C0079.m7505(this, rVar), C0084.m8097(this, rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        int iM8167;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0095.m9198(rVar, this);
        }
        int i = m8168()[C0105.m11258((j$.time.temporal.a) rVar)];
        if (i == 1) {
            iM8167 = m8167(this);
        } else {
            if (i != 2) {
                throw new j$.time.temporal.v(C0101.m11024(C0091.m8679(m8169(), 115, 19, 3057), rVar));
            }
            iM8167 = m8170(this);
        }
        return iM8167;
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0086.m8277()) {
            return C0103.m11146();
        }
        return C0096.m10784(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!C0102.m11120(C0086.m8323(mVar), C0103.m11146())) {
            throw new DateTimeException(C0091.m8679(m8169(), 140, 42, 2843));
        }
        j$.time.temporal.m mVarM8600 = C0089.m8600(mVar, m8170(this), C0094.m9136());
        j$.time.temporal.a aVarM8118 = C0084.m8118();
        return C0089.m8600(mVarM8600, C0088.m8519(C0088.m8525(C0084.m8099(mVarM8600, aVarM8118)), m8167(this)), aVarM8118);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m8170(this) == m8170(pVar) && m8167(this) == m8167(pVar);
    }

    public final int hashCode() {
        return (m8170(this) << 6) + m8167(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        C0101.m11052(sb, C0079.m7503(m8169(), 134, 2, 1129));
        int iM8170 = m8170(this);
        C0101.m11052(sb, iM8170 < 10 ? C0105.m11310(m8169(), 136, 1, 794) : C0102.m11090());
        C0099.m10859(sb, iM8170);
        int iM8167 = m8167(this);
        C0101.m11052(sb, iM8167 < 10 ? C0101.m11060(m8169(), 137, 2, 2636) : C0103.m11135(m8169(), 139, 1, 1721));
        C0099.m10859(sb, iM8167);
        return C0099.m10924(sb);
    }

    private Object writeReplace() {
        return new u(Ascii.CR, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0088.m8518(m8169(), 73, 42, 2516));
    }

    final void D(DataOutput dataOutput) {
        C0092.m8730(dataOutput, m8170(this));
        C0092.m8730(dataOutput, m8167(this));
    }

    static p C(ObjectInput objectInput) {
        byte bM11126 = C0103.m11126(objectInput);
        byte bM111262 = C0103.m11126(objectInput);
        n nVarM9171 = C0095.m9171(bM11126);
        C0079.m7494(nVarM9171, C0103.m11135(m8169(), 2, 5, 1651));
        C0090.m8635(C0084.m8118(), bM111262);
        if (bM111262 > C0082.m7982(nVarM9171)) {
            String strM8318 = C0086.m8318(nVarM9171);
            StringBuilder sb = new StringBuilder(C0103.m11135(m8169(), 7, 42, 3275));
            C0099.m10859(sb, bM111262);
            C0101.m11052(sb, C0085.m8236(m8169(), 49, 24, 688));
            C0101.m11052(sb, strM8318);
            throw new DateTimeException(C0099.m10924(sb));
        }
        return new p(C0086.m8309(nVarM9171), bM111262);
    }
}
