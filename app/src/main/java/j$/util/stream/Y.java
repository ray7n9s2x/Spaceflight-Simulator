package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;

/* JADX INFO: loaded from: classes3.dex */
final class Y extends AbstractC0567j2 {
    boolean b;
    U c;
    final /* synthetic */ W d;

    /* JADX INFO: renamed from: ۟۟ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9858(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static U m9859(Object obj) {
        if (C0097.m10823() > 0) {
            return ((Y) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m9860(Object obj, long j) {
        if (C0099.m10878() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9861(Object obj) {
        if (C0099.m10878() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m9862(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((W) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9863(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((Y) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۧۤ, reason: not valid java name and contains not printable characters */
    public static W m9864(Object obj) {
        if (C0094.m9148() > 0) {
            return ((Y) obj).d;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(W w, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = w;
        InterfaceC0597p2 interfaceC0597p2M9858 = m9858(this);
        C0099.m10863(interfaceC0597p2M9858);
        this.c = new U(interfaceC0597p2M9858);
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m9860(m9858(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        IntStream intStream = (IntStream) C0095.m9220((R0) m9862(m9864(this)), i);
        if (intStream != null) {
            try {
                boolean zM9863 = m9863(this);
                U uM9859 = m9859(this);
                if (!zM9863) {
                    C0102.m11092(C0080.m7572(intStream), uM9859);
                } else {
                    j$.util.W wM8301 = C0086.m8301(C0080.m7572(intStream));
                    while (!m9861(m9858(this)) && C0081.m7828(wM8301, uM9859)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    C0086.m8281(intStream);
                } catch (Throwable th2) {
                    C0092.m8780(th, th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            C0086.m8281(intStream);
        }
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        this.b = true;
        return m9861(m9858(this));
    }
}
