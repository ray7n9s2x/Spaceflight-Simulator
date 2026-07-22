package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.util.C0101;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.C0104;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0589o extends AbstractC0552g2 {
    /* JADX INFO: renamed from: ۟ۡۤۨۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10389() {
        if (C0106.m11345() < 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m10390(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۤ, reason: not valid java name and contains not printable characters */
    public static P0 m10391(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            return U((AbstractC0524b) obj, (j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۟, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10392() {
        if (C0101.m11044() <= 0) {
            return EnumC0543e3.DISTINCT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10393(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((P0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static L0 m10394(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0084.m8116() >= 0) {
            return ((AbstractC0524b) obj).y((j$.util.f0) obj2, z, (IntFunction) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10395() {
        if (C0090.m8624() >= 0) {
            return EnumC0543e3.SORTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m10396(Object obj, Object obj2, Object obj3) {
        if (C0105.m11264() >= 0) {
            ((Q) obj).e((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۨۥۢ, reason: contains not printable characters */
    public static boolean m10397(Object obj, int i) {
        if (C0096.m10782() > 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m10398(Object obj, Object obj2, Object obj3) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0644z0) obj).c((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10399(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0524b) obj).T((j$.util.f0) obj2);
        }
        return null;
    }

    static P0 U(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        C0569k c0569k = new C0569k(23);
        C0569k c0569k2 = new C0569k(24);
        C0569k c0569k3 = new C0569k(25);
        C0099.m10863(c0569k);
        C0099.m10863(c0569k2);
        C0099.m10863(c0569k3);
        return new P0((Collection) m10398(new F1(C0091.m8670(), c0569k3, c0569k2, c0569k, 3), abstractC0524b, f0Var));
    }

    @Override // j$.util.stream.AbstractC0524b
    final L0 K(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, IntFunction intFunction) {
        if (m10397(m10392(), m10390(abstractC0524b))) {
            return m10394(abstractC0524b, f0Var, false, intFunction);
        }
        if (m10397(m10389(), m10390(abstractC0524b))) {
            return m10391(abstractC0524b, f0Var);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C0600q0 c0600q0 = new C0600q0(3, atomicBoolean, concurrentHashMap);
        C0099.m10863(c0600q0);
        m10396(new P(c0600q0, false), abstractC0524b, f0Var);
        Set setM11226 = C0104.m11226(concurrentHashMap);
        if (C0106.m11343(atomicBoolean)) {
            HashSet hashSet = new HashSet(setM11226);
            C0091.m8677(hashSet, null);
            setM11226 = hashSet;
        }
        return new P0(setM11226);
    }

    @Override // j$.util.stream.AbstractC0524b
    final j$.util.f0 L(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        if (m10397(m10392(), m10390(abstractC0524b))) {
            return m10399(abstractC0524b, f0Var);
        }
        if (m10397(m10389(), m10390(abstractC0524b))) {
            return m10393(m10391(abstractC0524b, f0Var));
        }
        return new C0588n3(m10399(abstractC0524b, f0Var));
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        C0099.m10863(interfaceC0597p2);
        if (m10397(m10392(), i)) {
            return interfaceC0597p2;
        }
        if (m10397(m10395(), i)) {
            return new C0579m(interfaceC0597p2);
        }
        return new C0584n(interfaceC0597p2);
    }
}
