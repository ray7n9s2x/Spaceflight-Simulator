package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import j$.util.concurrent.C0093;
import java.io.C0103;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class a4 extends A {
    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9935(Object obj, int i) {
        if (C0106.m11345() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static L0 m9936(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0098.m10857() <= 0) {
            return ((a4) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9937() {
        if (C0093.m9101() >= 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9938(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9939(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥ, reason: contains not printable characters */
    public static j$.util.f0 m9940(Object obj) {
        if (C0103.m11154() < 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9935(m9937(), m9938(abstractC0524b)) ? m9940(m9936(this, abstractC0524b, f0Var, new C0545f0(14))) : new h4((j$.util.T) m9939(abstractC0524b, f0Var), 1);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new g4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new Z3(this, interfaceC0597p2);
    }
}
