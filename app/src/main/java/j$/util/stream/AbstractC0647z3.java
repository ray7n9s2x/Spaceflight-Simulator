package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0647z3 {
    final long a;
    final long b;
    j$.util.f0 c;
    long d;
    long e;

    /* JADX INFO: renamed from: ۟ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static long m10739(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0647z3) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10740(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0647z3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10741(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0647z3) obj).m10749trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10742(Object obj, Object obj2, long j, long j2, long j3, long j4) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0647z3) obj).a((j$.util.f0) obj2, j, j2, j3, j4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static long m10743(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0647z3) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static long m10744(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0647z3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۡۥۧ, reason: not valid java name and contains not printable characters */
    public static long m10745(Object obj) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0647z3) obj).b;
        }
        return 0L;
    }

    protected abstract j$.util.f0 a(j$.util.f0 f0Var, long j, long j2, long j3, long j4);

    AbstractC0647z3(j$.util.f0 f0Var, long j, long j2, long j3, long j4) {
        this.c = f0Var;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final j$.util.f0 m10749trySplit() {
        long jM10743 = m10743(this);
        if (m10744(this) >= jM10743 || m10739(this) >= jM10743) {
            return null;
        }
        while (true) {
            j$.util.f0 f0VarM7517 = C0079.m7517(m10740(this));
            if (f0VarM7517 == null) {
                return null;
            }
            long jM7979 = C0082.m7979(f0VarM7517) + m10739(this);
            long jM8519 = C0088.m8519(jM7979, m10745(this));
            long jM10744 = m10744(this);
            if (jM10744 >= jM8519) {
                this.d = jM8519;
            } else {
                long jM10745 = m10745(this);
                if (jM8519 >= jM10745) {
                    this.c = f0VarM7517;
                    this.e = jM8519;
                } else {
                    long jM10739 = m10739(this);
                    if (jM10739 >= jM10744 && jM7979 <= jM10745) {
                        this.d = jM8519;
                        return f0VarM7517;
                    }
                    this.d = jM8519;
                    return m10742(this, f0VarM7517, jM10744, jM10745, jM10739, jM8519);
                }
            }
        }
    }

    public final long estimateSize() {
        long jM10743 = m10743(this);
        long jM10744 = m10744(this);
        if (jM10744 < jM10743) {
            return jM10743 - C0102.m11093(jM10744, m10739(this));
        }
        return 0L;
    }

    public final int characteristics() {
        return C0080.m7579(m10740(this));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m10748trySplit() {
        return (j$.util.c0) m10741(this);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m10746trySplit() {
        return (j$.util.W) m10741(this);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m10747trySplit() {
        return (j$.util.Z) m10741(this);
    }

    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) m10741(this);
    }
}
