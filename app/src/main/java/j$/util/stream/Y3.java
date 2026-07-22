package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.temporal.C0086;
import j$.util.function.C0094;
import java.util.function.C0105;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class Y3 extends AbstractC0575l0 implements d4 {
    /* JADX INFO: renamed from: ۟۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9885() {
        if (C0092.m8724() < 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9886(Object obj, Object obj2) {
        if (C0080.m7553() > 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m9887(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static L0 m9888(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0105.m11264() >= 0) {
            return ((Y3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9889(Object obj, int i) {
        if (C0094.m9148() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۦۣ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9890(Object obj) {
        if (C0105.m11264() > 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9889(m9885(), m9887(abstractC0524b)) ? m9890(m9888(this, abstractC0524b, f0Var, new C0545f0(13))) : new j4((j$.util.Z) m9886(abstractC0524b, f0Var), 0);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new f4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new X3(this, interfaceC0597p2, false);
    }

    @Override // j$.util.stream.d4
    public final e4 j(D0 d0, boolean z) {
        return new X3(this, d0, z);
    }
}
