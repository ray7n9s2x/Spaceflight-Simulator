package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.zone.C0087;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0631w2 extends AbstractC0562i2 {
    long b;
    long c;
    final /* synthetic */ C0636x2 d;

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10591(Object obj) {
        if (C0089.m8594() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m10592(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((C0636x2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۤ, reason: not valid java name and contains not printable characters */
    public static long m10593(long j, long j2, long j3) {
        if (C0105.m11264() > 0) {
            return AbstractC0644z0.A(j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static long m10594(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((C0631w2) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10595(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static C0636x2 m10596(Object obj) {
        if (C0087.m8458() < 0) {
            return ((C0631w2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static void m10597(Object obj, long j) {
        if (C0091.m8708() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static long m10598(Object obj) {
        if (C0091.m8708() > 0) {
            return ((C0636x2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m10599(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0631w2) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m10600(Object obj, double d) {
        if (C0096.m10782() >= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0631w2(C0636x2 c0636x2, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0636x2;
        this.b = m10598(c0636x2);
        long jM10592 = m10592(c0636x2);
        this.c = jM10592 < 0 ? Long.MAX_VALUE : jM10592;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10597(m10595(this), m10593(j, m10598(m10596(this)), m10599(this)));
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        long jM10594 = m10594(this);
        if (jM10594 == 0) {
            long jM10599 = m10599(this);
            if (jM10599 > 0) {
                this.c = jM10599 - 1;
                m10600(m10595(this), d);
                return;
            }
            return;
        }
        this.b = jM10594 - 1;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m10599(this) == 0 || m10591(m10595(this));
    }
}
