package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import j$.util.C0100;
import java.io.C0104;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class O3 extends AbstractC0552g2 {
    final /* synthetic */ Predicate m;

    /* JADX INFO: renamed from: ۟۠ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static int m9626(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9627(Object obj, Object obj2) {
        if (C0092.m8724() <= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9628(Object obj) {
        if (C0104.m11196() > 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static L0 m9629(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0090.m8624() > 0) {
            return ((O3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9630(Object obj, int i) {
        if (C0082.m7983() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9631() {
        if (C0100.m10983() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۨ, reason: contains not printable characters */
    public static Predicate m9632(Object obj) {
        if (C0099.m10878() < 0) {
            return ((O3) obj).m;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O3(AbstractC0557h2 abstractC0557h2, int i, Predicate predicate) {
        super(abstractC0557h2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9630(m9631(), m9626(abstractC0524b)) ? m9628(m9629(this, abstractC0524b, f0Var, new C0545f0(3))) : new k4(m9627(abstractC0524b, f0Var), m9632(this), 1);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new g4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new C0579m(this, interfaceC0597p2);
    }
}
