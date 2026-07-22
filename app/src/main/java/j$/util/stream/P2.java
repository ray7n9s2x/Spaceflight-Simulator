package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import java.io.C0103;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class P2 extends D2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f517short = {3179, 3148, 3146, 3165, 3161, 3157, 3096, 3147, 3153, 3138, 3165, 3096, 3165, 3136, 3163, 3165, 3165, 3164, 3147, 3096, 3157, 3161, 3136, 3096, 3161, 3146, 3146, 3161, 3137, 3096, 3147, 3153, 3138, 3165};
    private Object[] d;
    private int e;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m9643(Object obj, long j) {
        if (C0097.m10823() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Comparator m9644(Object obj) {
        if (C0079.m7512() > 0) {
            return ((D2) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9645(Object obj) {
        if (C0099.m10878() <= 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9646() {
        if (C0098.m10857() <= 0) {
            return f517short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9647(Object obj) {
        if (C0082.m7983() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9648(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9649(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((D2) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static int m9650(Object obj) {
        if (C0088.m8503() > 0) {
            return ((P2) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static Object[] m9651(Object obj) {
        if (C0102.m11109() < 0) {
            return ((P2) obj).d;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0100.m10962(m9646(), 0, 34, 3128));
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        int i = 0;
        C0091.m8671(m9651(this), 0, m9650(this), m9644(this));
        long jM9650 = m9650(this);
        InterfaceC0597p2 interfaceC0597p2M9648 = m9648(this);
        m9643(interfaceC0597p2M9648, jM9650);
        if (!m9649(this)) {
            while (i < m9650(this)) {
                C0083.m8026(interfaceC0597p2M9648, m9651(this)[i]);
                i++;
            }
        } else {
            while (i < m9650(this) && !m9647(interfaceC0597p2M9648)) {
                C0083.m8026(interfaceC0597p2M9648, m9651(this)[i]);
                i++;
            }
        }
        m9645(interfaceC0597p2M9648);
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArrM9651 = m9651(this);
        int iM9650 = m9650(this);
        this.e = iM9650 + 1;
        objArrM9651[iM9650] = obj;
    }
}
