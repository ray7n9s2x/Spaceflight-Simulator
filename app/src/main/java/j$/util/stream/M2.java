package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class M2 extends A2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f510short = {1996, 2027, 2029, 2042, 2046, 2034, 1983, 2028, 2038, 2021, 2042, 1983, 2042, 2023, 2044, 2042, 2042, 2043, 2028, 1983, 2034, 2046, 2023, 1983, 2046, 2029, 2029, 2046, 2022, 1983, 2028, 2038, 2021, 2042};
    private double[] c;
    private int d;

    /* JADX INFO: renamed from: ۟۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m9573(Object obj, long j) {
        if (C0090.m8624() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9574(Object obj) {
        if (C0083.m8022() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9575(Object obj) {
        if (C0105.m11264() > 0) {
            return ((M2) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9576(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static double[] m9577(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((M2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m9578(Object obj, double d) {
        if (C0098.m10857() <= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۢۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9579(Object obj) {
        if (C0093.m9101() >= 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9580(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((A2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static short[] m9581() {
        if (C0095.m9210() > 0) {
            return f510short;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0097.m10853(m9581(), 0, 34, 1951));
        }
        this.c = new double[(int) j];
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        int i = 0;
        C0103.m11170(m9577(this), 0, m9575(this));
        long jM9575 = m9575(this);
        InterfaceC0597p2 interfaceC0597p2M9576 = m9576(this);
        m9573(interfaceC0597p2M9576, jM9575);
        if (!m9580(this)) {
            while (i < m9575(this)) {
                m9578(interfaceC0597p2M9576, m9577(this)[i]);
                i++;
            }
        } else {
            while (i < m9575(this) && !m9574(interfaceC0597p2M9576)) {
                m9578(interfaceC0597p2M9576, m9577(this)[i]);
                i++;
            }
        }
        m9579(interfaceC0597p2M9576);
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        double[] dArrM9577 = m9577(this);
        int iM9575 = m9575(this);
        this.d = iM9575 + 1;
        dArrM9577[iM9575] = d;
    }
}
