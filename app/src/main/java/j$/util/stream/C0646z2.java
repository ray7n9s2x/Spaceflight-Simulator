package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0646z2 extends AbstractC0529c {
    private final AbstractC0524b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    /* JADX INFO: renamed from: ۟۠ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m10707(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            ((AbstractC0529c) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static N0 m10708(Object obj, Object obj2, Object obj3) {
        if (C0083.m8022() <= 0) {
            return AbstractC0644z0.I((EnumC0548f3) obj, (L0) obj2, (L0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10709(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static L0 m10710(Object obj, long j, long j2, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((L0) obj).h(j, j2, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static long m10711(Object obj) {
        if (C0094.m9148() > 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static long m10712(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0646z2) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10713(Object obj, int i, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0524b) obj).N(i, (InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10714(Object obj) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static L0 m10715(Object obj) {
        if (C0096.m10782() > 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۡ, reason: not valid java name and contains not printable characters */
    public static long m10716(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((C0646z2) obj).l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۠, reason: not valid java name and contains not printable characters */
    public static void m10717(Object obj) {
        if (C0081.m7818() < 0) {
            ((AbstractC0529c) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m10718(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10719(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m10720(Object obj) {
        if (C0100.m10983() > 0) {
            return ((AbstractC0529c) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۨۢ, reason: not valid java name and contains not printable characters */
    public static long m10721(Object obj, long j) {
        if (C0100.m10983() > 0) {
            return ((C0646z2) obj).k(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10722(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static D0 m10723(Object obj, long j, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0524b) obj).J(j, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0546f1 m10724(Object obj) {
        if (C0087.m8458() <= 0) {
            return AbstractC0644z0.L((EnumC0548f3) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ, reason: not valid java name and contains not printable characters */
    public static long m10725(Object obj) {
        if (C0099.m10878() < 0) {
            return ((C0646z2) obj).n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10726(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0529c) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۨۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10727(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static boolean m10728(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0539e) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۨ۟, reason: contains not printable characters */
    public static int m10729(Object obj) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0524b) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۨۥ, reason: contains not printable characters */
    public static IntFunction m10730(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((C0646z2) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨ, reason: contains not printable characters */
    public static InterfaceC0597p2 m10731(Object obj, Object obj2) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥ۟, reason: contains not printable characters */
    public static AbstractC0524b m10732(Object obj) {
        if (C0082.m7983() < 0) {
            return ((C0646z2) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10733(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0524b) obj).x((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m10734(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۟۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10735() {
        if (C0096.m10782() >= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10736(Object obj, int i) {
        if (C0082.m7983() < 0) {
            return ((EnumC0543e3) obj).s(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10737(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0646z2) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۦ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10738(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).E();
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final void h() {
        this.i = true;
        if (m10737(this)) {
            m10707(this, m10724(m10738(m10732(this))));
        }
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0646z2 c0646z2;
        L0 l0M10724;
        AbstractC0539e abstractC0539eM10709 = m10709(this);
        if (!(abstractC0539eM10709 == null)) {
            this.n = m10725((C0646z2) abstractC0539eM10709) + m10725((C0646z2) m10722(this));
            if (m10726(this)) {
                this.n = 0L;
                l0M10724 = m10724(m10738(m10732(this)));
            } else {
                l0M10724 = m10725(this) == 0 ? m10724(m10738(m10732(this))) : m10725((C0646z2) m10709(this)) == 0 ? (L0) m10720((C0646z2) m10722(this)) : m10708(m10738(m10732(this)), (L0) m10720((C0646z2) m10709(this)), (L0) m10720((C0646z2) m10722(this)));
            }
            L0 l0M10710 = l0M10724;
            if (m10728(this)) {
                l0M10710 = m10710(l0M10710, m10716(this), m10712(this) >= 0 ? C0088.m8519(m10711(l0M10710), m10716(this) + m10712(this)) : m10725(this), m10730(this));
            }
            m10707(this, l0M10710);
            this.o = true;
        }
        if (m10712(this) >= 0 && !m10728(this)) {
            long jM10716 = m10716(this) + m10712(this);
            long jM10725 = m10737(this) ? m10725(this) : m10721(this, jM10716);
            if (jM10725 >= jM10716) {
                m10717(this);
            } else {
                C0646z2 c0646z22 = (C0646z2) ((AbstractC0539e) C0092.m8728(this));
                C0646z2 c0646z23 = this;
                while (true) {
                    if (c0646z22 == null) {
                        if (jM10725 >= jM10716) {
                            break;
                        }
                    } else {
                        if (c0646z23 == m10722(c0646z22) && (c0646z2 = (C0646z2) m10709(c0646z22)) != null) {
                            jM10725 += m10721(c0646z2, jM10716);
                            if (jM10725 >= jM10716) {
                                break;
                            }
                        }
                        c0646z23 = c0646z22;
                        c0646z22 = (C0646z2) ((AbstractC0539e) C0092.m8728(c0646z22));
                    }
                }
                m10717(this);
            }
        }
        super.onCompletion(countedCompleter);
    }

    C0646z2(AbstractC0524b abstractC0524b, AbstractC0524b abstractC0524b2, j$.util.f0 f0Var, IntFunction intFunction, long j, long j2) {
        super(abstractC0524b2, f0Var);
        this.j = abstractC0524b;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    C0646z2(C0646z2 c0646z2, j$.util.f0 f0Var) {
        super(c0646z2, f0Var);
        this.j = m10732(c0646z2);
        this.k = m10730(c0646z2);
        this.l = m10716(c0646z2);
        this.m = m10712(c0646z2);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new C0646z2(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final Object j() {
        return m10724(m10738(m10732(this)));
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        if (m10728(this)) {
            D0 d0M10723 = m10723(m10732(this), m10736(m10735(), m10729(m10732(this))) ? m10718(m10732(this), m10714(this)) : -1L, m10730(this));
            InterfaceC0597p2 interfaceC0597p2M10713 = m10713(m10732(this), m10734(m10727(this)), d0M10723);
            AbstractC0524b abstractC0524bM10727 = m10727(this);
            m10733(abstractC0524bM10727, m10714(this), m10731(abstractC0524bM10727, interfaceC0597p2M10713));
            return m10715(d0M10723);
        }
        D0 d0M107232 = m10723(m10732(this), -1L, m10730(this));
        if (m10716(this) == 0) {
            InterfaceC0597p2 interfaceC0597p2M107132 = m10713(m10732(this), m10734(m10727(this)), d0M107232);
            AbstractC0524b abstractC0524bM107272 = m10727(this);
            m10733(abstractC0524bM107272, m10714(this), m10731(abstractC0524bM107272, interfaceC0597p2M107132));
        } else {
            m10719(m10727(this), m10714(this), d0M107232);
        }
        L0 l0M10715 = m10715(d0M107232);
        this.n = m10711(l0M10715);
        this.o = true;
        this.b = null;
        return l0M10715;
    }

    private long k(long j) {
        if (m10737(this)) {
            return m10725(this);
        }
        C0646z2 c0646z2 = (C0646z2) m10709(this);
        C0646z2 c0646z22 = (C0646z2) m10722(this);
        if (c0646z2 == null || c0646z22 == null) {
            return m10725(this);
        }
        long jM10721 = m10721(c0646z2, j);
        return jM10721 >= j ? jM10721 : jM10721 + m10721(c0646z22, j);
    }
}
