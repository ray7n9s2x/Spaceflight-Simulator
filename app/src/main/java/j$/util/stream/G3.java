package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
abstract class G3 {
    protected final j$.util.f0 a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    /* JADX INFO: renamed from: ۟ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9450(Object obj) {
        if (C0094.m9148() > 0) {
            return ((G3) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static F3 m9451() {
        if (C0095.m9210() > 0) {
            return F3.UNLIMITED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9452(Object obj) {
        if (C0084.m8116() > 0) {
            return ((G3) obj).m9463trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static F3 m9453() {
        if (C0095.m9210() >= 0) {
            return F3.NO_MORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9454(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((G3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۤ, reason: not valid java name and contains not printable characters */
    public static long m9455(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((G3) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m9456(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((G3) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9457(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            return ((G3) obj).c((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static AtomicLong m9458(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((G3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۢ, reason: not valid java name and contains not printable characters */
    public static F3 m9459() {
        if (C0106.m11345() <= 0) {
            return F3.MAYBE_MORE;
        }
        return null;
    }

    protected abstract j$.util.f0 c(j$.util.f0 f0Var);

    G3(j$.util.f0 f0Var, long j, long j2) {
        long j3 = j;
        this.a = f0Var;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j3 + j2 : j3);
    }

    G3(j$.util.f0 f0Var, G3 g3) {
        this.a = f0Var;
        this.b = m9450(g3);
        this.e = m9458(g3);
        this.d = m9455(g3);
        this.c = m9456(g3);
    }

    protected final long b(long j) {
        AtomicLong atomicLongM9458;
        long jM8550;
        boolean zM9450;
        long jM8519;
        do {
            atomicLongM9458 = m9458(this);
            jM8550 = C0088.m8550(atomicLongM9458);
            zM9450 = m9450(this);
            if (jM8550 != 0) {
                jM8519 = C0088.m8519(jM8550, j);
                if (jM8519 <= 0) {
                    break;
                }
            } else {
                if (zM9450) {
                    return j;
                }
                return 0L;
            }
        } while (!C0084.m8081(atomicLongM9458, jM8550, jM8550 - jM8519));
        if (zM9450) {
            return C0102.m11093(j - jM8519, 0L);
        }
        long jM9455 = m9455(this);
        return jM8550 > jM9455 ? C0102.m11093(jM8519 - (jM8550 - jM9455), 0L) : jM8519;
    }

    protected final F3 d() {
        if (C0088.m8550(m9458(this)) > 0) {
            return m9459();
        }
        return m9450(this) ? m9451() : m9453();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final j$.util.f0 m9463trySplit() {
        j$.util.f0 f0VarM7517;
        if (C0088.m8550(m9458(this)) == 0 || (f0VarM7517 = C0079.m7517(m9454(this))) == null) {
            return null;
        }
        return m9457(this, f0VarM7517);
    }

    public final long estimateSize() {
        return C0082.m7979(m9454(this));
    }

    public final int characteristics() {
        return C0080.m7579(m9454(this)) & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m9462trySplit() {
        return (j$.util.c0) m9452(this);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m9460trySplit() {
        return (j$.util.W) m9452(this);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m9461trySplit() {
        return (j$.util.Z) m9452(this);
    }

    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) m9452(this);
    }
}
