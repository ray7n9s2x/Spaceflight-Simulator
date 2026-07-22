package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.format.C0083;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0621u2 extends AbstractC0572k2 {
    long b;
    long c;
    final /* synthetic */ C0626v2 d;

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m10559(Object obj, long j) {
        if (C0083.m8022() <= 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10560(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static long m10561(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((C0621u2) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10562(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static long m10563(Object obj) {
        if (C0099.m10878() < 0) {
            return ((C0626v2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static long m10564(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((C0626v2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m10565(Object obj, long j) {
        if (C0091.m8708() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static long m10566(long j, long j2, long j3) {
        if (C0105.m11264() > 0) {
            return AbstractC0644z0.A(j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۢۦ, reason: not valid java name and contains not printable characters */
    public static long m10567(Object obj) {
        if (C0105.m11264() > 0) {
            return ((C0621u2) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۦ۟, reason: not valid java name and contains not printable characters */
    public static C0626v2 m10568(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0621u2) obj).d;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0621u2(C0626v2 c0626v2, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0626v2;
        this.b = m10563(c0626v2);
        long jM10564 = m10564(c0626v2);
        this.c = jM10564 < 0 ? Long.MAX_VALUE : jM10564;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10565(m10562(this), m10566(j, m10563(m10568(this)), m10561(this)));
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        long jM10567 = m10567(this);
        if (jM10567 == 0) {
            long jM10561 = m10561(this);
            if (jM10561 > 0) {
                this.c = jM10561 - 1;
                m10559(m10562(this), j);
                return;
            }
            return;
        }
        this.b = jM10567 - 1;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m10561(this) == 0 || m10560(m10562(this));
    }
}
