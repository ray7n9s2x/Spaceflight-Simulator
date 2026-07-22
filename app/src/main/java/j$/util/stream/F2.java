package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class F2 extends B2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f506short = {2012, 2043, 2045, 2026, 2030, 2018, 1967, 2044, 2022, 2037, 2026, 1967, 2026, 2039, 2028, 2026, 2026, 2027, 2044, 1967, 2018, 2030, 2039, 1967, 2030, 2045, 2045, 2030, 2038, 1967, 2044, 2022, 2037, 2026};
    private U2 c;

    /* JADX INFO: renamed from: ۟۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9423(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((B2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m9424(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9425() {
        if (C0093.m9101() >= 0) {
            return f506short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9426(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static U2 m9427(Object obj) {
        if (C0080.m7553() > 0) {
            return ((F2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9428(Object obj, int i) {
        if (C0083.m8022() <= 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m9429(Object obj, long j) {
        if (C0092.m8724() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9430(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m9431(Object obj, int i) {
        if (C0080.m7553() >= 0) {
            ((U2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static void m9432(Object obj) {
        if (C0096.m10782() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.U2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        ?? y2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0091.m8679(m9425(), 0, 34, 1935));
        }
        if (j <= 0) {
            y2 = new Y2();
        } else {
            y2 = new U2((int) j);
        }
        this.c = y2;
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        int[] iArr = (int[]) m9424(m9427(this));
        C0091.m8666(iArr);
        long length = iArr.length;
        InterfaceC0597p2 interfaceC0597p2M9426 = m9426(this);
        m9429(interfaceC0597p2M9426, length);
        int i = 0;
        if (!m9423(this)) {
            int length2 = iArr.length;
            while (i < length2) {
                m9428(interfaceC0597p2M9426, iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (m9430(interfaceC0597p2M9426)) {
                    break;
                }
                m9428(interfaceC0597p2M9426, i2);
                i++;
            }
        }
        m9432(interfaceC0597p2M9426);
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        m9431(m9427(this), i);
    }
}
