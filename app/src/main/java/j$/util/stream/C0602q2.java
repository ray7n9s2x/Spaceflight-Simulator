package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import java.io.C0104;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0602q2 extends AbstractC0577l2 {
    long b;
    long c;
    final /* synthetic */ C0606r2 d;

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10446(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static long m10447(long j, long j2, long j3) {
        if (C0087.m8458() < 0) {
            return AbstractC0644z0.A(j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10448(Object obj) {
        if (C0087.m8458() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static long m10449(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0606r2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۡ۠, reason: contains not printable characters */
    public static C0606r2 m10450(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((C0602q2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢۡ, reason: contains not printable characters */
    public static long m10451(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0602q2) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۡۦ, reason: contains not printable characters */
    public static void m10452(Object obj, long j) {
        if (C0106.m11345() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۨ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m10453(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0606r2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۤۨ, reason: not valid java name and contains not printable characters */
    public static long m10454(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0602q2) obj).c;
        }
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0602q2(C0606r2 c0606r2, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0606r2;
        this.b = m10453(c0606r2);
        long jM10449 = m10449(c0606r2);
        this.c = jM10449 < 0 ? Long.MAX_VALUE : jM10449;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10452(m10446(this), m10447(j, m10453(m10450(this)), m10454(this)));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long jM10451 = m10451(this);
        if (jM10451 == 0) {
            long jM10454 = m10454(this);
            if (jM10454 > 0) {
                this.c = jM10454 - 1;
                C0083.m8026(m10446(this), obj);
                return;
            }
            return;
        }
        this.b = jM10451 - 1;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m10454(this) == 0 || m10448(m10446(this));
    }
}
