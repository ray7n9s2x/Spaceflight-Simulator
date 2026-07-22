package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class g4 extends AbstractC0529c {
    private final AbstractC0524b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    /* JADX INFO: renamed from: ۟۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10153(Object obj, int i) {
        if (C0079.m7512() > 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static N0 m10154(Object obj, Object obj2, Object obj3) {
        if (C0097.m10823() >= 0) {
            return AbstractC0644z0.I((EnumC0548f3) obj, (L0) obj2, (L0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m10155(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0529c) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10156(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((g4) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10157() {
        if (C0093.m9101() >= 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static IntFunction m10158(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((g4) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0548f3 m10159(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0524b) obj).E();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static L0 m10160(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10161(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static D0 m10162(Object obj, long j, Object obj2) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).J(j, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0546f1 m10163(Object obj) {
        if (C0085.m8230() > 0) {
            return AbstractC0644z0.L((EnumC0548f3) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static long m10164(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((g4) obj).m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m10165(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m10166(Object obj) {
        if (C0080.m7553() > 0) {
            ((AbstractC0529c) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۡۧۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10167(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0529c) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10168(Object obj) {
        if (C0085.m8230() > 0) {
            return ((g4) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10169(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((g4) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m10170(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10171(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m10172(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            ((AbstractC0529c) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۡۦ۟, reason: contains not printable characters */
    public static boolean m10173(Object obj, Object obj2, Object obj3) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0524b) obj).x((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static InterfaceC0597p2 m10174(Object obj, int i, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).N(i, (InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10175(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10176(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((g4) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10177(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10178(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final void h() {
        this.i = true;
        if (m10168(this) && m10169(this)) {
            m10172(this, m10163(m10159(m10176(this))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r60) {
        /*
            r59 = this;
            r9 = r60
            r8 = r59
            j$.util.stream.e r0 = m10171(r8)
            if (r0 != 0) goto Lc
            goto Lb7
        Lc:
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            boolean r0 = m10156(r0)
            j$.util.stream.e r1 = m10175(r8)
            j$.util.stream.g4 r1 = (j$.util.stream.g4) r1
            boolean r1 = m10156(r1)
            r0 = r0 | r1
            r8.n = r0
            boolean r0 = m10168(r8)
            r1 = 0
            if (r0 == 0) goto L3c
            boolean r0 = m10167(r8)
            if (r0 == 0) goto L3c
            r8.m = r1
            j$.util.stream.b r0 = m10176(r8)
            j$.util.stream.f3 r0 = m10159(r0)
            j$.util.stream.f1 r0 = m10163(r0)
            goto Lb4
        L3c:
            boolean r0 = m10168(r8)
            if (r0 == 0) goto L5b
            j$.util.stream.e r0 = m10171(r8)
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            boolean r3 = m10156(r0)
            if (r3 == 0) goto L5b
            long r1 = m10164(r0)
            r8.m = r1
            java.lang.Object r0 = m10155(r0)
            j$.util.stream.L0 r0 = (j$.util.stream.L0) r0
            goto Lb4
        L5b:
            j$.util.stream.e r0 = m10171(r8)
            j$.util.stream.g4 r0 = (j$.util.stream.g4) r0
            long r3 = m10164(r0)
            j$.util.stream.e r5 = m10175(r8)
            j$.util.stream.g4 r5 = (j$.util.stream.g4) r5
            long r6 = m10164(r5)
            long r3 = r3 + r6
            r8.m = r3
            long r3 = m10164(r0)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L81
            java.lang.Object r0 = m10155(r5)
            j$.util.stream.L0 r0 = (j$.util.stream.L0) r0
            goto Lb4
        L81:
            long r3 = m10164(r5)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L90
            java.lang.Object r0 = m10155(r0)
            j$.util.stream.L0 r0 = (j$.util.stream.L0) r0
            goto Lb4
        L90:
            j$.util.stream.b r0 = m10176(r8)
            j$.util.stream.f3 r0 = m10159(r0)
            j$.util.stream.e r1 = m10171(r8)
            j$.util.stream.g4 r1 = (j$.util.stream.g4) r1
            java.lang.Object r1 = m10155(r1)
            j$.util.stream.L0 r1 = (j$.util.stream.L0) r1
            j$.util.stream.e r2 = m10175(r8)
            j$.util.stream.g4 r2 = (j$.util.stream.g4) r2
            java.lang.Object r2 = m10155(r2)
            j$.util.stream.L0 r2 = (j$.util.stream.L0) r2
            j$.util.stream.N0 r0 = m10154(r0, r1, r2)
        Lb4:
            m10172(r8, r0)
        Lb7:
            r0 = 1
            r8.o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.g4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    g4(AbstractC0524b abstractC0524b, AbstractC0524b abstractC0524b2, j$.util.f0 f0Var, IntFunction intFunction) {
        super(abstractC0524b2, f0Var);
        this.j = abstractC0524b;
        this.k = intFunction;
        this.l = m10153(m10157(), m10170(abstractC0524b2));
    }

    g4(g4 g4Var, j$.util.f0 f0Var) {
        super(g4Var, f0Var);
        this.j = m10176(g4Var);
        this.k = m10158(g4Var);
        this.l = m10168(g4Var);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new g4(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final Object j() {
        return m10163(m10159(m10176(this)));
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        D0 d0M10162 = m10162(m10161(this), -1L, m10158(this));
        InterfaceC0597p2 interfaceC0597p2M10174 = m10174(m10176(this), m10170(m10161(this)), d0M10162);
        AbstractC0524b abstractC0524bM10161 = m10161(this);
        boolean zM10173 = m10173(abstractC0524bM10161, m10177(this), m10178(abstractC0524bM10161, interfaceC0597p2M10174));
        this.n = zM10173;
        if (zM10173) {
            m10166(this);
        }
        L0 l0M10160 = m10160(d0M10162);
        this.m = m10165(l0M10160);
        return l0M10160;
    }
}
