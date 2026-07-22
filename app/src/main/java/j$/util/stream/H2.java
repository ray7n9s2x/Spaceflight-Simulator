package j$.util.stream;

import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class H2 extends A {
    /* JADX INFO: renamed from: ۟ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int m9472(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9473(Object obj, int i) {
        if (C0095.m9210() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9474() {
        if (C0085.m8230() > 0) {
            return EnumC0543e3.SORTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static L0 m9475(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۟, reason: contains not printable characters */
    public static EnumC0543e3 m9476() {
        if (C0082.m7983() <= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0524b
    public final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        return m9473(m9474(), i) ? interfaceC0597p2 : m9473(m9476(), i) ? new M2(interfaceC0597p2) : new E2(interfaceC0597p2);
    }

    @Override // j$.util.stream.AbstractC0524b
    public final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        if (m9473(m9474(), m9472(abstractC0524b))) {
            return m9475(abstractC0524b, f0Var, false, intFunction);
        }
        double[] dArr = (double[]) C0088.m8561((F0) m9475(abstractC0524b, f0Var, true, intFunction));
        C0103.m11179(dArr);
        return new Y0(dArr);
    }
}
