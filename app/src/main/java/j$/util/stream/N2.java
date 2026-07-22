package j$.util.stream;

import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.function.C0094;
import java.io.C0103;

/* JADX INFO: loaded from: classes3.dex */
final class N2 extends B2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f512short = {1125, 1090, 1092, 1107, 1111, 1115, 1046, 1093, 1119, 1100, 1107, 1046, 1107, 1102, 1109, 1107, 1107, 1106, 1093, 1046, 1115, 1111, 1102, 1046, 1111, 1092, 1092, 1111, 1103, 1046, 1093, 1119, 1100, 1107};
    private int[] c;
    private int d;

    /* JADX INFO: renamed from: ۟۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9596(Object obj) {
        if (C0092.m8724() < 0) {
            return ((B2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9597(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((N2) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m9598() {
        if (C0088.m8503() > 0) {
            return f512short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9599(Object obj) {
        if (C0085.m8230() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9600(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int[] m9601(Object obj) {
        if (C0101.m11044() < 0) {
            return ((N2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9602(Object obj) {
        if (C0094.m9148() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9603(Object obj, int i) {
        if (C0094.m9148() >= 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۧۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m9604(Object obj, long j) {
        if (C0087.m8458() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0084.m8120(m9598(), 0, 34, 1078));
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        int i = 0;
        C0099.m10934(m9601(this), 0, m9597(this));
        long jM9597 = m9597(this);
        InterfaceC0597p2 interfaceC0597p2M9600 = m9600(this);
        m9604(interfaceC0597p2M9600, jM9597);
        if (!m9596(this)) {
            while (i < m9597(this)) {
                m9603(interfaceC0597p2M9600, m9601(this)[i]);
                i++;
            }
        } else {
            while (i < m9597(this) && !m9602(interfaceC0597p2M9600)) {
                m9603(interfaceC0597p2M9600, m9601(this)[i]);
                i++;
            }
        }
        m9599(interfaceC0597p2M9600);
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        int[] iArrM9601 = m9601(this);
        int iM9597 = m9597(this);
        this.d = iM9597 + 1;
        iArrM9601[iM9597] = i;
    }
}
