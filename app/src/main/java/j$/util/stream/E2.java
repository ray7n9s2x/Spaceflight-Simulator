package j$.util.stream;

import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class E2 extends A2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f505short = {2057, 2094, 2088, 2111, 2107, 2103, 2170, 2089, 2099, 2080, 2111, 2170, 2111, 2082, 2105, 2111, 2111, 2110, 2089, 2170, 2103, 2107, 2082, 2170, 2107, 2088, 2088, 2107, 2083, 2170, 2089, 2099, 2080, 2111};
    private S2 c;

    /* JADX INFO: renamed from: ۟ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static S2 m9392(Object obj) {
        if (C0083.m8022() < 0) {
            return ((E2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9393(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m9394(Object obj) {
        if (C0100.m10983() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m9395() {
        if (C0104.m11196() > 0) {
            return f505short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m9396(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9397(Object obj) {
        if (C0097.m10823() > 0) {
            return ((A2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static boolean m9398(Object obj) {
        if (C0088.m8503() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m9399(Object obj, long j) {
        if (C0094.m9148() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9400(Object obj, double d) {
        if (C0103.m11154() <= 0) {
            ((S2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9401(Object obj, double d) {
        if (C0082.m7983() < 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.S2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        ?? y2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0105.m11310(m9395(), 0, 34, 2138));
        }
        if (j <= 0) {
            y2 = new Y2();
        } else {
            y2 = new S2((int) j);
        }
        this.c = y2;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        double[] dArr = (double[]) m9396(m9392(this));
        C0103.m11179(dArr);
        long length = dArr.length;
        InterfaceC0597p2 interfaceC0597p2M9393 = m9393(this);
        m9399(interfaceC0597p2M9393, length);
        int i = 0;
        if (!m9397(this)) {
            int length2 = dArr.length;
            while (i < length2) {
                m9401(interfaceC0597p2M9393, dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (m9398(interfaceC0597p2M9393)) {
                    break;
                }
                m9401(interfaceC0597p2M9393, d);
                i++;
            }
        }
        m9394(interfaceC0597p2M9393);
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        m9400(m9392(this), d);
    }
}
