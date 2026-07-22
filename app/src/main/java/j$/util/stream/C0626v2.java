package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0626v2 extends AbstractC0575l0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: renamed from: ۣۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10575() {
        if (C0087.m8458() <= 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static long m10576(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((C0626v2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static long m10577(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((C0626v2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static long m10578(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static J0 m10579(Object obj, Object obj2, boolean z) {
        if (C0106.m11345() <= 0) {
            return AbstractC0644z0.H((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10580(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0524b) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۥ, reason: contains not printable characters */
    public static long m10581(long j, long j2) {
        if (C0079.m7512() > 0) {
            return AbstractC0644z0.B(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۥۡۥ, reason: contains not printable characters */
    public static int m10582(Object obj) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10583(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10584(Object obj, int i) {
        if (C0087.m8458() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۨۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10585(Object obj, Object obj2, long j, long j2) {
        if (C0092.m8724() < 0) {
            return AbstractC0644z0.C((EnumC0548f3) obj, (j$.util.f0) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10586(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0626v2(AbstractC0580m0 abstractC0580m0, int i, long j, long j2) {
        super(abstractC0580m0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        long j;
        long j2;
        long jM10578 = m10578(abstractC0524b, f0Var);
        long jM10577 = m10577(this);
        if (jM10578 > 0 && C0088.m8562(f0Var, 16384)) {
            j$.util.Z z = (j$.util.Z) m10586(abstractC0524b, f0Var);
            long jM10576 = m10576(this);
            return new C0632w3(z, jM10576, m10581(jM10576, jM10577));
        }
        if (m10584(m10575(), m10582(abstractC0524b))) {
            return m10583((L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, new C0545f0(6), m10576(this), m10577(this))));
        }
        j$.util.Z z2 = (j$.util.Z) m10586(abstractC0524b, f0Var);
        long jM105762 = m10576(this);
        if (jM105762 <= jM10578) {
            long jM8519 = jM10578 - jM105762;
            if (jM10577 >= 0) {
                jM8519 = C0088.m8519(jM10577, jM8519);
            }
            j = jM8519;
            j2 = 0;
        } else {
            j = jM10577;
            j2 = jM105762;
        }
        return new C3(z2, j2, j);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        long jM8519;
        long j;
        long jM10578 = m10578(abstractC0524b, f0Var);
        if (jM10578 > 0 && C0088.m8562(f0Var, 16384)) {
            return m10579(abstractC0524b, m10585(m10580(abstractC0524b), f0Var, m10576(this), m10577(this)), true);
        }
        if (!m10584(m10575(), m10582(abstractC0524b))) {
            j$.util.Z z = (j$.util.Z) m10586(abstractC0524b, f0Var);
            long jM10576 = m10576(this);
            long jM10577 = m10577(this);
            if (jM10576 <= jM10578) {
                jM8519 = jM10577 >= 0 ? C0088.m8519(jM10577, jM10578 - jM10576) : jM10578 - jM10576;
                j = 0;
            } else {
                jM8519 = jM10577;
                j = jM10576;
            }
            return m10579(this, new C3(z, j, jM8519), true);
        }
        return (L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, intFunction, m10576(this), m10577(this)));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new C0621u2(this, interfaceC0597p2);
    }
}
