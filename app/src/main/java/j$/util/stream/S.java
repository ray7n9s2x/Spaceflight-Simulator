package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class S extends CountedCompleter {
    private final AbstractC0524b a;
    private j$.util.f0 b;
    private final long c;
    private final ConcurrentHashMap d;
    private final Q e;
    private final S f;
    private L0 g;

    /* JADX INFO: renamed from: ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static D0 m9695(Object obj, long j, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0524b) obj).J(j, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static long m9696(Object obj) {
        if (C0096.m10782() > 0) {
            return ((S) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۢ, reason: not valid java name and contains not printable characters */
    public static L0 m9697(Object obj) {
        if (C0091.m8708() > 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9698(Object obj, Object obj2, Object obj3) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Q m9699(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((S) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static long m9700(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9701() {
        if (C0084.m8116() >= 0) {
            return AbstractC0539e.b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9702(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((S) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۥۣ, reason: not valid java name and contains not printable characters */
    public static S m9703(Object obj) {
        if (C0085.m8230() > 0) {
            return ((S) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static void m9704(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            ((L0) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۨ۠, reason: contains not printable characters */
    public static L0 m9705(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((S) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۤ, reason: contains not printable characters */
    public static j$.util.f0 m9706(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((S) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۨ, reason: contains not printable characters */
    public static long m9707(long j) {
        if (C0093.m9101() >= 0) {
            return AbstractC0539e.g(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m9708(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((S) obj).d;
        }
        return null;
    }

    protected S(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, Q q) {
        super(null);
        this.a = abstractC0524b;
        this.b = f0Var;
        this.c = m9707(C0082.m7979(f0Var));
        this.d = new ConcurrentHashMap(C0106.m11325(16, m9701() << 1), 1);
        this.e = q;
        this.f = null;
    }

    S(S s, j$.util.f0 f0Var, S s2) {
        super(s);
        this.a = m9702(s);
        this.b = f0Var;
        this.c = m9696(s);
        this.d = m9708(s);
        this.e = m9699(s);
        this.f = s2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.f0 f0VarM7517;
        j$.util.f0 f0VarM9706 = m9706(this);
        long jM9696 = m9696(this);
        boolean z = false;
        S s = this;
        while (C0082.m7979(f0VarM9706) > jM9696 && (f0VarM7517 = C0079.m7517(f0VarM9706)) != null) {
            S s2 = new S(s, f0VarM7517, m9703(s));
            S s3 = new S(s, f0VarM9706, s2);
            C0105.m11257(s, 1);
            C0105.m11257(s3, 1);
            C0085.m8271(m9708(s), s2, s3);
            if (m9703(s) != null) {
                C0105.m11257(s2, 1);
                if (C0094.m9124(m9708(s), m9703(s), s, s2)) {
                    C0105.m11257(s, -1);
                } else {
                    C0105.m11257(s2, -1);
                }
            }
            if (z) {
                f0VarM9706 = f0VarM7517;
                s = s2;
                s2 = s3;
            } else {
                s = s3;
            }
            z = !z;
            C0096.m10779(s2);
        }
        if (C0088.m8542(s) > 0) {
            C0599q c0599q = new C0599q(9);
            AbstractC0524b abstractC0524bM9702 = m9702(s);
            D0 d0M9695 = m9695(abstractC0524bM9702, m9700(abstractC0524bM9702, f0VarM9706), c0599q);
            m9698(m9702(s), f0VarM9706, d0M9695);
            s.g = m9697(d0M9695);
            s.b = null;
        }
        C0092.m8734(s);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l0M9705 = m9705(this);
        if (l0M9705 != null) {
            m9704(l0M9705, m9699(this));
            this.g = null;
        } else {
            j$.util.f0 f0VarM9706 = m9706(this);
            if (f0VarM9706 != null) {
                m9698(m9702(this), f0VarM9706, m9699(this));
                this.b = null;
            }
        }
        S s = (S) C0101.m11016(m9708(this), this);
        if (s != null) {
            C0092.m8734(s);
        }
    }
}
