package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes3.dex */
final class K2 extends AbstractC0552g2 {
    private final boolean m;
    private final Comparator n;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static L0 m9526(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m9527() {
        if (C0088.m8503() > 0) {
            return EnumC0543e3.p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m9528() {
        if (C0105.m11264() >= 0) {
            return EnumC0543e3.o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m9529(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            return ((L0) obj).o((IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9530() {
        if (C0095.m9210() > 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m9531(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9532(Object obj, int i) {
        if (C0096.m10782() > 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۨۧ, reason: contains not printable characters */
    public static int m9533() {
        if (C0099.m10878() < 0) {
            return EnumC0543e3.q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9534() {
        if (C0098.m10857() <= 0) {
            return EnumC0543e3.SORTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۧۨ, reason: not valid java name and contains not printable characters */
    public static Comparator m9535(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((K2) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9536(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((K2) obj).m;
        }
        return false;
    }

    K2(AbstractC0557h2 abstractC0557h2) {
        super(abstractC0557h2, m9533() | m9528(), 0);
        this.m = true;
        this.n = C0088.m8512();
    }

    K2(AbstractC0557h2 abstractC0557h2, Comparator comparator) {
        super(abstractC0557h2, m9533() | m9527(), 0);
        this.m = false;
        this.n = (Comparator) C0099.m10863(comparator);
    }

    @Override // j$.util.stream.AbstractC0524b
    public final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        if (m9532(m9534(), i) && m9536(this)) {
            return interfaceC0597p2;
        }
        boolean zM9532 = m9532(m9530(), i);
        Comparator comparatorM9535 = m9535(this);
        if (zM9532) {
            return new P2(interfaceC0597p2, comparatorM9535);
        }
        return new L2(interfaceC0597p2, comparatorM9535);
    }

    @Override // j$.util.stream.AbstractC0524b
    public final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        if (m9532(m9534(), m9531(abstractC0524b)) && m9536(this)) {
            return m9526(abstractC0524b, f0Var, false, intFunction);
        }
        Object[] objArrM9529 = m9529(m9526(abstractC0524b, f0Var, true, intFunction), intFunction);
        C0080.m7540(objArrM9529, m9535(this));
        return new O0(objArrM9529);
    }
}
