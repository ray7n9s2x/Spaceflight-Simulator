package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0091;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class I2 extends AbstractC0520a0 {
    /* JADX INFO: renamed from: ۟۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9486() {
        if (C0100.m10983() >= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۡ, reason: not valid java name and contains not printable characters */
    public static int m9487(Object obj) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9488(Object obj, int i) {
        if (C0101.m11044() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static L0 m9489(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9490() {
        if (C0096.m10782() > 0) {
            return EnumC0543e3.SORTED;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    public final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        return m9488(m9490(), i) ? interfaceC0597p2 : m9488(m9486(), i) ? new N2(interfaceC0597p2) : new F2(interfaceC0597p2);
    }

    @Override // j$.util.stream.AbstractC0524b
    public final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        if (m9488(m9490(), m9487(abstractC0524b))) {
            return m9489(abstractC0524b, f0Var, false, intFunction);
        }
        int[] iArr = (int[]) C0088.m8561((H0) m9489(abstractC0524b, f0Var, true, intFunction));
        C0091.m8666(iArr);
        return new C0556h1(iArr);
    }
}
