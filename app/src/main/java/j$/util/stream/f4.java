package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class f4 extends AbstractC0539e {
    private final AbstractC0524b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    /* JADX INFO: renamed from: ۟۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10088() {
        if (C0103.m11154() < 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m10089(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0524b) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m10090(Object obj, int i) {
        if (C0099.m10878() < 0) {
            return ((EnumC0543e3) obj).s(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static long m10091(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static e4 m10092(Object obj, Object obj2, boolean z) {
        if (C0097.m10823() >= 0) {
            return ((d4) obj).j((D0) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10093(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10094(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((f4) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10095(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m10096(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static long m10097(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((e4) obj).f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static N0 m10098(Object obj, Object obj2, Object obj3) {
        if (C0083.m8022() <= 0) {
            return AbstractC0644z0.I((EnumC0548f3) obj, (L0) obj2, (L0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10099(Object obj) {
        if (C0103.m11154() < 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static L0 m10100(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10101(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0524b) obj).E();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static long m10102(Object obj) {
        if (C0092.m8724() < 0) {
            return ((f4) obj).k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10103(Object obj, int i) {
        if (C0093.m9101() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨۢ, reason: not valid java name and contains not printable characters */
    public static long m10104(Object obj, Object obj2) {
        if (C0084.m8116() > 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static void m10105(Object obj, Object obj2) {
        if (C0094.m9148() >= 0) {
            ((AbstractC0539e) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10106() {
        if (C0092.m8724() <= 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨۥ, reason: not valid java name and contains not printable characters */
    public static IntFunction m10107(Object obj) {
        if (C0080.m7553() > 0) {
            return ((f4) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static long m10108(Object obj) {
        if (C0095.m9210() > 0) {
            return ((f4) obj).l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10109(Object obj) {
        if (C0103.m11154() < 0) {
            return ((f4) obj).j;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10110(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10111(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0539e) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10112(Object obj, Object obj2, Object obj3) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static L0 m10113(Object obj, long j, long j2, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((L0) obj).h(j, j2, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static Object m10114(Object obj) {
        if (C0098.m10857() < 0) {
            return ((AbstractC0539e) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۧۡ, reason: not valid java name and contains not printable characters */
    public static D0 m10115(Object obj, long j, Object obj2) {
        if (C0092.m8724() < 0) {
            return ((AbstractC0524b) obj).J(j, (IntFunction) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l0M10098;
        AbstractC0539e abstractC0539eM10110 = m10110(this);
        if (abstractC0539eM10110 != null) {
            if (m10109(this)) {
                f4 f4Var = (f4) abstractC0539eM10110;
                long jM10108 = m10108(f4Var);
                this.l = jM10108;
                if (jM10108 == m10102(f4Var)) {
                    this.l = jM10108 + m10108((f4) m10099(this));
                }
            }
            f4 f4Var2 = (f4) abstractC0539eM10110;
            long jM10102 = m10102(f4Var2);
            f4 f4Var3 = (f4) m10099(this);
            this.k = jM10102 + m10102(f4Var3);
            if (m10102(f4Var2) == 0) {
                l0M10098 = (L0) m10114(f4Var3);
            } else if (m10102(f4Var3) == 0) {
                l0M10098 = (L0) m10114(f4Var2);
            } else {
                l0M10098 = m10098(m10101(m10094(this)), (L0) m10114((f4) m10110(this)), (L0) m10114((f4) m10099(this)));
            }
            L0 l0M10113 = l0M10098;
            if (m10111(this) && m10109(this)) {
                l0M10113 = m10113(l0M10113, m10108(this), m10091(l0M10113), m10107(this));
            }
            m10105(this, l0M10113);
        }
        super.onCompletion(countedCompleter);
    }

    f4(AbstractC0524b abstractC0524b, AbstractC0524b abstractC0524b2, j$.util.f0 f0Var, IntFunction intFunction) {
        super(abstractC0524b2, f0Var);
        this.h = abstractC0524b;
        this.i = intFunction;
        this.j = m10103(m10106(), m10096(abstractC0524b2));
    }

    f4(f4 f4Var, j$.util.f0 f0Var) {
        super(f4Var, f0Var);
        this.h = m10094(f4Var);
        this.i = m10107(f4Var);
        this.j = m10109(f4Var);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new f4(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        boolean zM10111 = m10111(this);
        D0 d0M10115 = m10115(m10093(this), (!zM10111 && m10109(this) && m10090(m10088(), m10089(m10094(this)))) ? m10104(m10094(this), m10095(this)) : -1L, m10107(this));
        e4 e4VarM10092 = m10092((d4) m10094(this), d0M10115, m10109(this) && !zM10111);
        m10112(m10093(this), m10095(this), e4VarM10092);
        L0 l0M10100 = m10100(d0M10115);
        this.k = m10091(l0M10100);
        this.l = m10097(e4VarM10092);
        return l0M10100;
    }
}
