package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class O2 extends C2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f515short = {1118, 1145, 1151, 1128, 1132, 1120, 1069, 1150, 1124, 1143, 1128, 1069, 1128, 1141, 1134, 1128, 1128, 1129, 1150, 1069, 1120, 1132, 1141, 1069, 1132, 1151, 1151, 1132, 1140, 1069, 1150, 1124, 1143, 1128};
    private long[] c;
    private int d;

    /* JADX INFO: renamed from: ۟۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9617(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static long[] m9618(Object obj) {
        if (C0095.m9210() > 0) {
            return ((O2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9619(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((C2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9620(Object obj) {
        if (C0100.m10983() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m9621(Object obj, long j) {
        if (C0085.m8230() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9622(Object obj) {
        if (C0090.m8624() >= 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۦۦۢۤ, reason: contains not printable characters */
    public static void m9623(Object obj, long j) {
        if (C0098.m10857() <= 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9624(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((O2) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m9625() {
        if (C0104.m11196() >= 0) {
            return f515short;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0105.m11310(m9625(), 0, 34, 1037));
        }
        this.c = new long[(int) j];
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        int i = 0;
        C0082.m8003(m9618(this), 0, m9624(this));
        long jM9624 = m9624(this);
        InterfaceC0597p2 interfaceC0597p2M9617 = m9617(this);
        m9621(interfaceC0597p2M9617, jM9624);
        if (!m9619(this)) {
            while (i < m9624(this)) {
                m9623(interfaceC0597p2M9617, m9618(this)[i]);
                i++;
            }
        } else {
            while (i < m9624(this) && !m9620(interfaceC0597p2M9617)) {
                m9623(interfaceC0597p2M9617, m9618(this)[i]);
                i++;
            }
        }
        m9622(interfaceC0597p2M9617);
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArrM9618 = m9618(this);
        int iM9624 = m9624(this);
        this.d = iM9624 + 1;
        jArrM9618[iM9624] = j;
    }
}
