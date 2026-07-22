package j$.util.stream;

import j$.time.C0091;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import java.io.C0103;
import java.util.function.C0106;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class S3 extends AbstractC0520a0 {
    final /* synthetic */ IntPredicate m;

    /* JADX INFO: renamed from: ۟ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m9737(Object obj) {
        if (C0087.m8458() < 0) {
            return ((S3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9738(Object obj) {
        if (C0091.m8708() > 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥ۠, reason: not valid java name and contains not printable characters */
    public static L0 m9739(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0096.m10782() > 0) {
            return ((S3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9740(Object obj, int i) {
        if (C0103.m11154() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int m9741(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static EnumC0543e3 m9742() {
        if (C0085.m8230() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9743(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S3(AbstractC0525b0 abstractC0525b0, int i, IntPredicate intPredicate) {
        super(abstractC0525b0, i, 0);
        this.m = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9740(m9742(), m9741(abstractC0524b)) ? m9738(m9739(this, abstractC0524b, f0Var, new C0545f0(10))) : new i4((j$.util.W) m9743(abstractC0524b, f0Var), m9737(this), 1);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new g4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new R3(this, interfaceC0597p2);
    }
}
