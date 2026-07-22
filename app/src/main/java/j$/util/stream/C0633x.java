package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0104;

/* JADX INFO: renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0633x extends AbstractC0562i2 {
    boolean b;
    C0594p c;
    final /* synthetic */ C0638y d;

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10601(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0633x) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۢ, reason: not valid java name and contains not printable characters */
    public static C0638y m10602(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((C0633x) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m10603(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((C0638y) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10604(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10605(Object obj) {
        if (C0089.m8594() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۧۢ, reason: not valid java name and contains not printable characters */
    public static C0594p m10606(Object obj) {
        if (C0084.m8116() > 0) {
            return ((C0633x) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۥ, reason: not valid java name and contains not printable characters */
    public static void m10607(Object obj, long j) {
        if (C0102.m11109() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0633x(C0638y c0638y, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0638y;
        InterfaceC0597p2 interfaceC0597p2M10604 = m10604(this);
        C0099.m10863(interfaceC0597p2M10604);
        this.c = new C0594p(interfaceC0597p2M10604);
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10607(m10604(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        E e = (E) C0095.m9176((C0519a) m10603(m10602(this)), d);
        if (e != null) {
            try {
                boolean zM10601 = m10601(this);
                C0594p c0594pM10606 = m10606(this);
                if (!zM10601) {
                    C0085.m8248(C0087.m8498(e), c0594pM10606);
                } else {
                    j$.util.T tM8308 = C0086.m8308(C0087.m8498(e));
                    while (!m10605(m10604(this)) && C0104.m11219(tM8308, c0594pM10606)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    C0086.m8281(e);
                } catch (Throwable th2) {
                    C0092.m8780(th, th2);
                }
                throw th;
            }
        }
        if (e != null) {
            C0086.m8281(e);
        }
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        this.b = true;
        return m10605(m10604(this));
    }
}
