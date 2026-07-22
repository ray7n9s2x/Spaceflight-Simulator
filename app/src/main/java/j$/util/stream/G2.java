package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.temporal.C0085;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class G2 extends C2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f508short = {2409, 2382, 2376, 2399, 2395, 2391, 2330, 2377, 2387, 2368, 2399, 2330, 2399, 2370, 2393, 2399, 2399, 2398, 2377, 2330, 2391, 2395, 2370, 2330, 2395, 2376, 2376, 2395, 2371, 2330, 2377, 2387, 2368, 2399};
    private W2 c;

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9440(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((C2) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m9441(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m9442(Object obj) {
        if (C0081.m7818() <= 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static W2 m9443(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((G2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m9444(Object obj) {
        if (C0089.m8594() < 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9445(Object obj, long j) {
        if (C0098.m10857() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9446() {
        if (C0094.m9148() > 0) {
            return f508short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9447(Object obj, long j) {
        if (C0101.m11044() < 0) {
            ((W2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣۥۡۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9448(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static void m9449(Object obj, long j) {
        if (C0080.m7553() > 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.W2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        ?? y2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException(C0080.m7573(m9446(), 0, 34, 2362));
        }
        if (j <= 0) {
            y2 = new Y2();
        } else {
            y2 = new W2((int) j);
        }
        this.c = y2;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void k() {
        long[] jArr = (long[]) m9444(m9443(this));
        C0090.m8630(jArr);
        long length = jArr.length;
        InterfaceC0597p2 interfaceC0597p2M9448 = m9448(this);
        m9445(interfaceC0597p2M9448, length);
        int i = 0;
        if (!m9440(this)) {
            int length2 = jArr.length;
            while (i < length2) {
                m9449(interfaceC0597p2M9448, jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (m9441(interfaceC0597p2M9448)) {
                    break;
                }
                m9449(interfaceC0597p2M9448, j);
                i++;
            }
        }
        m9442(interfaceC0597p2M9448);
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        m9447(m9443(this), j);
    }
}
