package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import java.io.C0103;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class c4 extends A implements d4 {
    /* JADX INFO: renamed from: ۟۠۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10050(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10051(Object obj) {
        if (C0106.m11345() < 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int m10052(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10053(Object obj, int i) {
        if (C0088.m8503() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static L0 m10054(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0082.m7983() <= 0) {
            return ((c4) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧۢ, reason: contains not printable characters */
    public static EnumC0543e3 m10055() {
        if (C0103.m11154() < 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m10053(m10055(), m10052(abstractC0524b)) ? m10051(m10054(this, abstractC0524b, f0Var, new C0545f0(15))) : new h4((j$.util.T) m10050(abstractC0524b, f0Var), 0);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new f4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new b4(this, interfaceC0597p2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 j(D0 d0, boolean z) {
        return new b4(this, d0, z);
    }
}
