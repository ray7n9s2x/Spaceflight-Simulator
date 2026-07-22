package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0606r2 extends AbstractC0552g2 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m10465(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10466() {
        if (C0093.m9101() >= 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10467(Object obj, Object obj2) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static long m10468(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static L0 m10469(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0093.m9101() > 0) {
            return AbstractC0644z0.E((AbstractC0524b) obj, (j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10470(Object obj) {
        if (C0104.m11196() > 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10471(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m10472(long j, long j2) {
        if (C0082.m7983() < 0) {
            return AbstractC0644z0.B(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۡۧ, reason: not valid java name and contains not printable characters */
    public static long m10473(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0606r2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10474(Object obj, Object obj2, long j, long j2) {
        if (C0085.m8230() >= 0) {
            return AbstractC0644z0.C((EnumC0548f3) obj, (j$.util.f0) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m10475(Object obj, int i) {
        if (C0101.m11044() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۥۥ, reason: not valid java name and contains not printable characters */
    public static long m10476(Object obj) {
        if (C0099.m10878() < 0) {
            return ((C0606r2) obj).n;
        }
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0606r2(AbstractC0557h2 abstractC0557h2, int i, long j, long j2) {
        super(abstractC0557h2, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        long j;
        long j2;
        long jM10468 = m10468(abstractC0524b, f0Var);
        long jM10476 = m10476(this);
        if (jM10468 > 0 && C0088.m8562(f0Var, 16384)) {
            j$.util.f0 f0VarM10467 = m10467(abstractC0524b, f0Var);
            long jM10473 = m10473(this);
            return new C0642y3(f0VarM10467, jM10473, m10472(jM10473, jM10476));
        }
        if (m10475(m10466(), m10465(abstractC0524b))) {
            return m10470((L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, new C0545f0(3), m10473(this), m10476(this))));
        }
        j$.util.f0 f0VarM104672 = m10467(abstractC0524b, f0Var);
        long jM104732 = m10473(this);
        if (jM104732 <= jM10468) {
            long jM8519 = jM10468 - jM104732;
            if (jM10476 >= 0) {
                jM8519 = C0088.m8519(jM10476, jM8519);
            }
            j = jM8519;
            j2 = 0;
        } else {
            j = jM10476;
            j2 = jM104732;
        }
        return new E3(f0VarM104672, j2, j);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        long j;
        long jM8519;
        long jM10468 = m10468(abstractC0524b, f0Var);
        if (jM10468 > 0 && C0088.m8562(f0Var, 16384)) {
            return m10469(abstractC0524b, m10474(m10471(abstractC0524b), f0Var, m10473(this), m10476(this)), true, intFunction);
        }
        if (!m10475(m10466(), m10465(abstractC0524b))) {
            j$.util.f0 f0VarM10467 = m10467(abstractC0524b, f0Var);
            long jM10473 = m10473(this);
            long jM10476 = m10476(this);
            if (jM10473 <= jM10468) {
                jM8519 = jM10476 >= 0 ? C0088.m8519(jM10476, jM10468 - jM10473) : jM10468 - jM10473;
                j = 0;
            } else {
                j = jM10473;
                jM8519 = jM10476;
            }
            return m10469(this, new E3(f0VarM10467, j, jM8519), true, intFunction);
        }
        return (L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, intFunction, m10473(this), m10476(this)));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new C0602q2(this, interfaceC0597p2);
    }
}
