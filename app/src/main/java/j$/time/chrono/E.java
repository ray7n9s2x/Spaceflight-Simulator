package j$.time.chrono;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.C0104;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends AbstractC0491d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f396short = {491, 497, 493, 454, 483, 502, 487, 3264, 3297, 3319, 3297, 3318, 3309, 3301, 3304, 3309, 3326, 3301, 3312, 3309, 3307, 3306, 3236, 3314, 3309, 3301, 3236, 3319, 3297, 3318, 3309, 3301, 3304, 3309, 3326, 3301, 3312, 3309, 3307, 3306, 3236, 3296, 3297, 3304, 3297, 3299, 3301, 3312, 3297, 3318, 3277, 3280, 3286, 3283, 3283, 3276, 3281, 3287, 3270, 3271, 3203, 3269, 3274, 3270, 3279, 3271, 3225, 3203};
    private final transient j$.time.h a;

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static C0494g m7636(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            return C0494g.D((InterfaceC0489b) obj, (j$.time.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static j$.time.h m7637(Object obj) {
        if (C0101.m11044() < 0) {
            return ((E) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m7638() {
        if (C0093.m9101() > 0) {
            return D.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7639() {
        if (C0097.m10823() > 0) {
            return f396short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥ۟, reason: contains not printable characters */
    public static E m7640(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((E) obj).L((j$.time.h) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7641(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((E) obj).J();
        }
        return 0;
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ InterfaceC0489b d(long j, j$.time.temporal.r rVar) {
        return C0095.m9180(this, j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final /* bridge */ /* synthetic */ j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return C0095.m9180(this, j, rVar);
    }

    E(j$.time.h hVar) {
        C0079.m7494(hVar, C0094.m9107(m7639(), 0, 7, 386));
        this.a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC0489b
    public final n a() {
        return C0080.m7562();
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final int hashCode() {
        C0092.m8727(C0080.m7562());
        return C0083.m8056(m7637(this)) ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final o D() {
        return m7641(this) >= 1 ? C0079.m7518() : C0091.m8688();
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C0094.m9149(rVar, this);
        }
        if (!C0092.m8767(this, rVar)) {
            throw new j$.time.temporal.v(C0101.m11024(C0103.m11135(m7639(), 49, 19, 3235), rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = m7638()[C0105.m11258(aVar)];
        if (i == 1 || i == 2 || i == 3) {
            return C0105.m11289(m7637(this), rVar);
        }
        if (i != 4) {
            return C0083.m8067(C0080.m7562(), aVar);
        }
        j$.time.temporal.w wVarM8651 = C0090.m8651(C0104.m11201());
        return C0084.m8080(1L, m7641(this) <= 0 ? (-C0092.m8744(wVarM8651)) + 1912 : C0088.m8525(wVarM8651) - 1911);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m7638()[C0105.m11258((j$.time.temporal.a) rVar)];
            if (i == 4) {
                int iM7641 = m7641(this);
                if (iM7641 < 1) {
                    iM7641 = 1 - iM7641;
                }
                return iM7641;
            }
            j$.time.h hVarM7637 = m7637(this);
            if (i == 5) {
                return ((((long) m7641(this)) * 12) + ((long) C0105.m11298(hVarM7637))) - 1;
            }
            if (i == 6) {
                return m7641(this);
            }
            if (i != 7) {
                return C0104.m11214(hVarM7637, rVar);
            }
            return m7641(this) < 1 ? 0 : 1;
        }
        return C0095.m9198(rVar, this);
    }

    private int J() {
        return C0097.m10813(m7637(this)) - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.E K(long r60, j$.time.temporal.r r62) {
        /*
            r59 = this;
            r11 = r62
            r9 = r60
            r8 = r59
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto La8
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = j$.time.format.C0084.m8086(r8, r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L16
            return r8
        L16:
            int[] r1 = m7638()
            int r2 = java.util.function.C0105.m11258(r0)
            r2 = r1[r2]
            j$.time.h r3 = m7637(r8)
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L58
            r7 = 5
            if (r2 == r7) goto L31
            if (r2 == r5) goto L58
            if (r2 == r4) goto L58
            goto L70
        L31:
            j$.time.chrono.C r11 = j$.sun.nio.cs.C0080.m7562()
            j$.time.temporal.w r11 = j$.time.format.C0083.m8067(r11, r0)
            j$.util.C0100.m10984(r11, r9, r0)
            int r11 = m7641(r8)
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = java.util.function.C0105.m11298(r3)
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = java.io.C0103.m11174(r3, r9)
            j$.time.chrono.E r9 = m7640(r8, r9)
            return r9
        L58:
            j$.time.chrono.C r2 = j$.sun.nio.cs.C0080.m7562()
            j$.time.temporal.w r2 = j$.time.format.C0083.m8067(r2, r0)
            int r2 = j$.time.C0092.m8732(r2, r9, r0)
            int r0 = java.util.function.C0105.m11258(r0)
            r0 = r1[r0]
            if (r0 == r6) goto L93
            if (r0 == r5) goto L88
            if (r0 == r4) goto L79
        L70:
            j$.time.h r9 = java.util.function.C0105.m11302(r3, r9, r11)
            j$.time.chrono.E r9 = m7640(r8, r9)
            return r9
        L79:
            int r9 = m7641(r8)
            int r9 = 1912 - r9
            j$.time.h r9 = j$.sun.nio.cs.C0080.m7574(r3, r9)
            j$.time.chrono.E r9 = m7640(r8, r9)
            return r9
        L88:
            int r2 = r2 + 1911
            j$.time.h r9 = j$.sun.nio.cs.C0080.m7574(r3, r2)
            j$.time.chrono.E r9 = m7640(r8, r9)
            return r9
        L93:
            int r9 = m7641(r8)
            r10 = 1
            if (r9 < r10) goto L9d
            int r2 = r2 + 1911
            goto L9f
        L9d:
            int r2 = 1912 - r2
        L9f:
            j$.time.h r9 = j$.sun.nio.cs.C0080.m7574(r3, r2)
            j$.time.chrono.E r9 = m7640(r8, r9)
            return r9
        La8:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.E r9 = (j$.time.chrono.E) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.E.K(long, j$.time.temporal.r):j$.time.chrono.E");
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b I(j$.time.temporal.p pVar) {
        return (E) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (E) super.I(hVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b H(long j) {
        return m7640(this, C0084.m8108(m7637(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b G(long j) {
        return m7640(this, C0103.m11174(m7637(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d
    final InterfaceC0489b F(long j) {
        return m7640(this, C0094.m9137(m7637(this), j));
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b, j$.time.temporal.m
    public final InterfaceC0489b e(long j, j$.time.temporal.u uVar) {
        return (E) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (E) super.e(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final InterfaceC0489b E(long j, j$.time.temporal.u uVar) {
        return (E) super.E(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (E) super.E(j, bVar);
    }

    private E L(j$.time.h hVar) {
        return C0085.m8243(hVar, m7637(this)) ? this : new E(hVar);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final long t() {
        return C0086.m8288(m7637(this));
    }

    @Override // j$.time.chrono.AbstractC0491d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            return C0085.m8243(m7637(this), m7637((E) obj));
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C0099.m10897(m7639(), 7, 42, 3204));
    }

    private Object writeReplace() {
        return new G((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0491d, j$.time.chrono.InterfaceC0489b
    public final InterfaceC0492e u(j$.time.l lVar) {
        return m7636(this, lVar);
    }
}
