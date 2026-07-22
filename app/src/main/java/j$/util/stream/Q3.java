package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class Q3 extends AbstractC0552g2 implements d4 {
    final /* synthetic */ Predicate m;

    /* JADX INFO: renamed from: ۟ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9674(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9675(Object obj, int i) {
        if (C0098.m10857() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Predicate m9676(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((Q3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9677() {
        if (C0093.m9101() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m9678(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9679(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥ۠, reason: not valid java name and contains not printable characters */
    public static L0 m9680(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0106.m11345() <= 0) {
            return ((Q3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(AbstractC0557h2 abstractC0557h2, int i, Predicate predicate) {
        super(abstractC0557h2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9675(m9677(), m9678(abstractC0524b)) ? m9679(m9680(this, abstractC0524b, f0Var, new C0545f0(3))) : new k4(m9674(abstractC0524b, f0Var), m9676(this), 0);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new f4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new P3(this, interfaceC0597p2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 j(D0 d0, boolean z) {
        return new P3(this, d0, z);
    }
}
