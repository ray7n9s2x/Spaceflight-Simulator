package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes3.dex */
class S0 extends AbstractC0539e {
    protected final AbstractC0524b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    /* JADX INFO: renamed from: ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m9709(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static L0 m9710(Object obj) {
        if (C0104.m11196() > 0) {
            return ((S0) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static long m9711(Object obj, Object obj2) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0524b) obj).C((j$.util.f0) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m9712(Object obj, Object obj2, Object obj3) {
        if (C0104.m11196() >= 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۨ, reason: not valid java name and contains not printable characters */
    public static LongFunction m9713(Object obj) {
        if (C0102.m11109() < 0) {
            return ((S0) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m9714(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0539e) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9715(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠۟, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m9716(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((S0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m9717(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            ((AbstractC0539e) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9718(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9719(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((S0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static L0 m9720(Object obj) {
        if (C0100.m10983() > 0) {
            return ((D0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m9721(Object obj) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0539e abstractC0539eM9709 = m9709(this);
        if (abstractC0539eM9709 != null) {
            m9717(this, (L0) m9712(m9716(this), (L0) m9714((S0) abstractC0539eM9709), (L0) m9714((S0) m9721(this))));
        }
        super.onCompletion(countedCompleter);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected /* bridge */ /* synthetic */ Object a() {
        return m9710(this);
    }

    S0(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0524b, f0Var);
        this.h = abstractC0524b;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    S0(S0 s0, j$.util.f0 f0Var) {
        super(s0, f0Var);
        this.h = m9719(s0);
        this.i = m9713(s0);
        this.j = m9716(s0);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected AbstractC0539e e(j$.util.f0 f0Var) {
        return new S0(this, f0Var);
    }

    protected final L0 h() {
        D0 d0 = (D0) C0093.m9067(m9713(this), m9711(m9719(this), m9715(this)));
        m9718(m9719(this), m9715(this), d0);
        return m9720(d0);
    }
}
