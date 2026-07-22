package j$.util.stream;

import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import java.util.function.C0105;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class W3 extends AbstractC0575l0 {
    /* JADX INFO: renamed from: ۟۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9819(Object obj) {
        if (C0085.m8230() > 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9820(Object obj, int i) {
        if (C0098.m10857() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨ۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9821() {
        if (C0087.m8458() < 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9822(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۨ, reason: contains not printable characters */
    public static int m9823(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static L0 m9824(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0105.m11264() >= 0) {
            return ((W3) obj).K((AbstractC0524b) obj2, (j$.util.f0) obj3, (IntFunction) obj4);
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return m9820(m9821(), m9823(abstractC0524b)) ? m9819(m9824(this, abstractC0524b, f0Var, new C0545f0(12))) : new j4((j$.util.Z) m9822(abstractC0524b, f0Var), 1);
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        return (L0) C0086.m8299(new g4(this, abstractC0524b, f0Var, intFunction));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        return new V3(this, interfaceC0597p2);
    }
}
