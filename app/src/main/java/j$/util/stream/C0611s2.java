package j$.util.stream;

import j$.time.C0089;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import java.io.C0103;
import java.io.C0104;

/* JADX INFO: renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0611s2 extends AbstractC0567j2 {
    long b;
    long c;
    final /* synthetic */ C0616t2 d;

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static long m10509(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((C0611s2) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0616t2 m10510(Object obj) {
        if (C0083.m8022() < 0) {
            return ((C0611s2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static long m10511(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0611s2) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static long m10512(Object obj) {
        if (C0082.m7983() < 0) {
            return ((C0616t2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static long m10513(Object obj) {
        if (C0103.m11154() < 0) {
            return ((C0616t2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10514(Object obj) {
        if (C0104.m11196() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m10515(Object obj, long j) {
        if (C0085.m8230() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static long m10516(long j, long j2, long j3) {
        if (C0097.m10823() > 0) {
            return AbstractC0644z0.A(j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨۨ۠, reason: contains not printable characters */
    public static InterfaceC0597p2 m10517(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m10518(Object obj, int i) {
        if (C0082.m7983() < 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0611s2(C0616t2 c0616t2, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0616t2;
        this.b = m10513(c0616t2);
        long jM10512 = m10512(c0616t2);
        this.c = jM10512 < 0 ? Long.MAX_VALUE : jM10512;
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10515(m10517(this), m10516(j, m10513(m10510(this)), m10509(this)));
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        long jM10511 = m10511(this);
        if (jM10511 == 0) {
            long jM10509 = m10509(this);
            if (jM10509 > 0) {
                this.c = jM10509 - 1;
                m10518(m10517(this), i);
                return;
            }
            return;
        }
        this.b = jM10511 - 1;
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m10509(this) == 0 || m10514(m10517(this));
    }
}
