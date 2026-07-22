package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0640y1 extends Z2 implements L0, D0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f549short = {2439, 2444, 2438, 2448, 2499, 2445, 2444, 2455, 2499, 2437, 2442, 2455, 2673, 2646, 2640, 2631, 2627, 2639, 2562, 2641, 2635, 2648, 2631, 2562, 2631, 2650, 2625, 2631, 2631, 2630, 2641, 2562, 2639, 2627, 2650, 2562, 2627, 2640, 2640, 2627, 2651, 2562, 2641, 2635, 2648, 2631};

    /* JADX INFO: renamed from: ۟۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static long m10652(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0534d) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m10653(Object obj, Object obj2, int i) {
        if (C0094.m9148() >= 0) {
            ((C0640y1) obj).i((Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m10654(Object obj) {
        if (C0103.m11154() < 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m10655(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m10656() {
        if (C0088.m8503() >= 0) {
            return f549short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static L0 m10657(Object obj, long j, long j2, Object obj2) {
        if (C0099.m10878() < 0) {
            return AbstractC0644z0.w((L0) obj, j, j2, (IntFunction) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤ, reason: not valid java name and contains not printable characters */
    public static void m10658(Object obj, long j) {
        if (C0102.m11109() <= 0) {
            ((Z2) obj).s(j);
        }
    }

    /* JADX INFO: renamed from: ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Object[][] m10659(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((Z2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m10660(Object obj) {
        if (C0104.m11196() > 0) {
            ((Z2) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m10661(Object obj) {
        if (C0084.m8116() > 0) {
            return ((Z2) obj).e;
        }
        return null;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return m10657(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        int length = i;
        long j = length;
        long jM10652 = m10652(this) + j;
        if (jM10652 > objArr.length || jM10652 < j) {
            throw new IndexOutOfBoundsException(C0106.m11346(m10656(), 0, 12, 2531));
        }
        if (m10655(this) == 0) {
            C0080.m7558(m10661(this), 0, objArr, length, m10654(this));
            return;
        }
        for (int i2 = 0; i2 < m10655(this); i2++) {
            Object[] objArr2 = m10659(this)[i2];
            C0080.m7558(objArr2, 0, objArr, length, objArr2.length);
            length += m10659(this)[i2].length;
        }
        int iM10654 = m10654(this);
        if (iM10654 > 0) {
            C0080.m7558(m10661(this), 0, objArr, length, iM10654);
        }
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        long jM10652 = m10652(this);
        if (jM10652 >= 2147483639) {
            throw new IllegalArgumentException(C0096.m10776(m10656(), 12, 34, 2594));
        }
        Object[] objArr = (Object[]) C0095.m9220(intFunction, (int) jM10652);
        m10653(this, objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10660(this);
        m10658(this, j);
    }
}
