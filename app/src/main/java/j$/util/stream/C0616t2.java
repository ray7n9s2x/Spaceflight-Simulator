package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.io.C0103;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0616t2 extends AbstractC0520a0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static long m10525(long j, long j2) {
        if (C0090.m8624() >= 0) {
            return AbstractC0644z0.B(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static long m10526(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0616t2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10527(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10528(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0524b) obj).F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10529(Object obj, int i) {
        if (C0085.m8230() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m10530(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static H0 m10531(Object obj, Object obj2, boolean z) {
        if (C0080.m7553() > 0) {
            return AbstractC0644z0.G((AbstractC0524b) obj, (j$.util.f0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
    public static long m10532(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0616t2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static long m10533(Object obj, Object obj2) {
        if (C0103.m11154() < 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static j$.util.f0 m10534(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static j$.util.f0 m10535(Object obj, Object obj2, long j, long j2) {
        if (C0106.m11345() < 0) {
            return AbstractC0644z0.C((EnumC0548f3) obj, (j$.util.f0) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10536() {
        if (C0096.m10782() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0616t2(AbstractC0525b0 abstractC0525b0, int i, long j, long j2) {
        super(abstractC0525b0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        long j;
        long j2;
        long jM10533 = m10533(abstractC0524b, f0Var);
        long jM10526 = m10526(this);
        if (jM10533 > 0 && C0088.m8562(f0Var, 16384)) {
            j$.util.W w = (j$.util.W) m10534(abstractC0524b, f0Var);
            long jM10532 = m10532(this);
            return new C0627v3(w, jM10532, m10525(jM10532, jM10526));
        }
        if (m10529(m10536(), m10530(abstractC0524b))) {
            return m10527((L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, new C0545f0(5), m10532(this), m10526(this))));
        }
        j$.util.W w2 = (j$.util.W) m10534(abstractC0524b, f0Var);
        long jM105322 = m10532(this);
        if (jM105322 <= jM10533) {
            long jM8519 = jM10533 - jM105322;
            if (jM10526 >= 0) {
                jM8519 = C0088.m8519(jM10526, jM8519);
            }
            j = jM8519;
            j2 = 0;
        } else {
            j = jM10526;
            j2 = jM105322;
        }
        return new B3(w2, j2, j);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        long jM8519;
        long j;
        long jM10533 = m10533(abstractC0524b, f0Var);
        if (jM10533 > 0 && C0088.m8562(f0Var, 16384)) {
            return m10531(abstractC0524b, m10535(m10528(abstractC0524b), f0Var, m10532(this), m10526(this)), true);
        }
        if (!m10529(m10536(), m10530(abstractC0524b))) {
            j$.util.W w = (j$.util.W) m10534(abstractC0524b, f0Var);
            long jM10532 = m10532(this);
            long jM10526 = m10526(this);
            if (jM10532 <= jM10533) {
                jM8519 = jM10526 >= 0 ? C0088.m8519(jM10526, jM10533 - jM10532) : jM10533 - jM10532;
                j = 0;
            } else {
                jM8519 = jM10526;
                j = jM10532;
            }
            return m10531(this, new B3(w, j, jM8519), true);
        }
        return (L0) C0086.m8299(new C0646z2(this, abstractC0524b, f0Var, intFunction, m10532(this), m10526(this)));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new C0611s2(this, interfaceC0597p2);
    }
}
