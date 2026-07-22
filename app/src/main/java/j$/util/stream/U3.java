package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class U3 extends AbstractC0520a0 implements d4 {
    final /* synthetic */ IntPredicate m;

    /* JADX INFO: renamed from: ۟ۢۡ۠۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9781() {
        if (C0098.m10857() < 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9782(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9783(Object obj) {
        if (C0082.m7983() < 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9784(Object obj) {
        if (C0080.m7553() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9785(Object obj, int i) {
        if (C0081.m7818() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۧۧ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m9786(Object obj) {
        if (C0091.m8708() > 0) {
            return ((U3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡ۠, reason: not valid java name and contains not printable characters */
    public static L0 m9787(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0097.m10823() > 0) {
            return ((U3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(AbstractC0525b0 abstractC0525b0, int i, IntPredicate intPredicate) {
        super(abstractC0525b0, i, 0);
        this.m = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9785(m9781(), m9784(abstractC0524b)) ? m9783(m9787(this, abstractC0524b, f0Var, new C0545f0(11))) : new i4((j$.util.W) m9782(abstractC0524b, f0Var), m9786(this), 0);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new f4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new T3(this, interfaceC0597p2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 j(D0 d0, boolean z) {
        return new T3(this, d0, z);
    }
}
