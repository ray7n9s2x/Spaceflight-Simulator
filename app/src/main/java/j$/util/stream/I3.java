package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class I3 extends AbstractC0553g3 {
    /* JADX INFO: renamed from: ۟۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9491(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0553g3) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9492(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9493(Object obj) {
        if (C0103.m11154() < 0) {
            ((AbstractC0553g3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static long m9494(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0534d) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9495(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0553g3) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9496(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static Object[][] m9497(Object obj) {
        if (C0087.m8458() < 0) {
            return ((Z2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9498(Object obj, Object obj2) {
        if (C0088.m8503() > 0) {
            return ((I3) obj).tryAdvance((Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0534d m9499(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0553g3) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9500(Object obj, Object obj2) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static long m9501(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0553g3) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m9502(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((Z2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9503(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0553g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9504(Object obj, Object obj2, Object obj3) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۡ, reason: not valid java name and contains not printable characters */
    public static long[] m9505(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m9506(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0553g3) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m9507(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0553g3
    final AbstractC0553g3 e(j$.util.f0 f0Var) {
        return new I3(m9503(this), f0Var, m9491(this));
    }

    @Override // j$.util.stream.AbstractC0553g3
    final void d() {
        Z2 z2 = new Z2();
        this.h = z2;
        C0099.m10863(z2);
        this.e = m9500(m9503(this), new H3(z2, 0));
        this.f = new C0519a(5, this);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        C0099.m10863(consumer);
        boolean zM9506 = m9506(this);
        if (zM9506) {
            Z2 z2 = (Z2) m9499(this);
            long jM9501 = m9501(this);
            if (m9507(z2) != 0) {
                if (jM9501 >= m9494(z2)) {
                    throw new IndexOutOfBoundsException(C0099.m10925(jM9501));
                }
                for (int i = 0; i <= m9507(z2); i++) {
                    long j = m9505(z2)[i];
                    Object[] objArr = m9497(z2)[i];
                    if (jM9501 < ((long) objArr.length) + j) {
                        obj = objArr[(int) (jM9501 - j)];
                    }
                }
                throw new IndexOutOfBoundsException(C0099.m10925(jM9501));
            }
            if (jM9501 < m9492(z2)) {
                obj = m9502(z2)[(int) jM9501];
            } else {
                throw new IndexOutOfBoundsException(C0099.m10925(jM9501));
            }
            C0083.m8026(consumer, obj);
        }
        return zM9506;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        if (m9499(this) == null && !m9495(this)) {
            C0099.m10863(consumer);
            m9493(this);
            C0099.m10863(consumer);
            H3 h3 = new H3(consumer, 1);
            m9504(m9503(this), m9496(this), h3);
            this.i = true;
            return;
        }
        while (m9498(this, consumer)) {
        }
    }
}
