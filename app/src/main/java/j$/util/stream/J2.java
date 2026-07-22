package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.zone.C0088;
import j$.util.C0101;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class J2 extends AbstractC0575l0 {
    /* JADX INFO: renamed from: ۟ۤۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9512() {
        if (C0079.m7512() >= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9513() {
        if (C0098.m10857() < 0) {
            return EnumC0543e3.SORTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9514(Object obj, int i) {
        if (C0092.m8724() <= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۤ۠, reason: not valid java name and contains not printable characters */
    public static L0 m9515(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9516(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    public final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        return m9514(m9513(), i) ? interfaceC0597p2 : m9514(m9512(), i) ? new O2(interfaceC0597p2) : new G2(interfaceC0597p2);
    }

    @Override // j$.util.stream.AbstractC0524b
    public final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        if (m9514(m9513(), m9516(abstractC0524b))) {
            return m9515(abstractC0524b, f0Var, false, intFunction);
        }
        long[] jArr = (long[]) C0088.m8561((J0) m9515(abstractC0524b, f0Var, true, intFunction));
        C0090.m8630(jArr);
        return new C0601q1(jArr);
    }
}
