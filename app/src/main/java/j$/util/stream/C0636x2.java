package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0636x2 extends A {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: renamed from: ۟۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10622() {
        if (C0090.m8624() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static long m10623(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10624(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0524b) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static F0 m10625(Object obj, Object obj2, boolean z) {
        if (C0092.m8724() < 0) {
            return AbstractC0644z0.F((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static long m10626(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0636x2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10627(Object obj, Object obj2, long j, long j2) {
        if (C0088.m8503() >= 0) {
            return AbstractC0644z0.C((EnumC0548f3) obj, (j$.util.f0) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10628(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static long m10629(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0636x2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10630(Object obj, int i) {
        if (C0095.m9210() > 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۡ۠, reason: contains not printable characters */
    public static int m10631(Object obj) {
        if (C0083.m8022() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static long m10632(long j, long j2) {
        if (C0094.m9148() >= 0) {
            return AbstractC0644z0.B(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۥۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10633(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0636x2(B b, int i, long j, long j2) {
        super(b, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        long j;
        long j2;
        long jM10623 = m10623(abstractC0524b, f0Var);
        long jM10629 = m10629(this);
        if (jM10623 > 0 && C0088.m8562(f0Var, 16384)) {
            j$.util.T t = (j$.util.T) m10633(abstractC0524b, f0Var);
            long jM10626 = m10626(this);
            return new C0622u3(t, jM10626, m10632(jM10626, jM10629));
        }
        if (m10630(m10622(), m10631(abstractC0524b))) {
            return m10628((L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, new C0545f0(7), m10626(this), m10629(this))));
        }
        j$.util.T t2 = (j$.util.T) m10633(abstractC0524b, f0Var);
        long jM106262 = m10626(this);
        if (jM106262 <= jM10623) {
            long jM8519 = jM10623 - jM106262;
            if (jM10629 >= 0) {
                jM8519 = C0088.m8519(jM10629, jM8519);
            }
            j = jM8519;
            j2 = 0;
        } else {
            j = jM10629;
            j2 = jM106262;
        }
        return new A3(t2, j2, j);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        long jM8519;
        long j;
        long jM10623 = m10623(abstractC0524b, f0Var);
        if (jM10623 > 0 && C0088.m8562(f0Var, 16384)) {
            return m10625(abstractC0524b, m10627(m10624(abstractC0524b), f0Var, m10626(this), m10629(this)), true);
        }
        if (!m10630(m10622(), m10631(abstractC0524b))) {
            j$.util.T t = (j$.util.T) m10633(abstractC0524b, f0Var);
            long jM10626 = m10626(this);
            long jM10629 = m10629(this);
            if (jM10626 <= jM10623) {
                jM8519 = jM10629 >= 0 ? C0088.m8519(jM10629, jM10623 - jM10626) : jM10623 - jM10626;
                j = 0;
            } else {
                jM8519 = jM10629;
                j = jM10626;
            }
            return m10625(this, new A3(t, j, jM8519), true);
        }
        return (L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, intFunction, m10626(this), m10629(this)));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new C0631w2(this, interfaceC0597p2);
    }
}
