package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0102;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0537d2 extends AbstractC0577l2 {
    public final /* synthetic */ int b = 1;
    boolean c;
    Object d;
    final /* synthetic */ AbstractC0524b e;

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static Object m10063(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((C0565j0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m10064(Object obj, long j) {
        if (C0103.m11154() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10065(Object obj) {
        if (C0085.m8230() > 0) {
            return ((C0537d2) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m10066(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0638y) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m10067(Object obj) {
        if (C0097.m10823() > 0) {
            return ((W) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m10068(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((C0537d2) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10069(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۡ, reason: contains not printable characters */
    public static AbstractC0524b m10070(Object obj) {
        if (C0080.m7553() > 0) {
            return ((C0537d2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۦ, reason: contains not printable characters */
    public static boolean m10071(Object obj) {
        if (C0090.m8624() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۨ, reason: contains not printable characters */
    public static Object m10072(Object obj) {
        if (C0082.m7983() < 0) {
            return ((C0537d2) obj).d;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537d2(W w, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.e = w;
        InterfaceC0597p2 interfaceC0597p2M10069 = m10069(this);
        C0099.m10863(interfaceC0597p2M10069);
        this.d = new U(interfaceC0597p2M10069);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537d2(C0638y c0638y, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.e = c0638y;
        InterfaceC0597p2 interfaceC0597p2M10069 = m10069(this);
        C0099.m10863(interfaceC0597p2M10069);
        this.d = new C0594p(interfaceC0597p2M10069);
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        switch (m10068(this)) {
            case 0:
                m10064(m10069(this), -1L);
                break;
            case 1:
                m10064(m10069(this), -1L);
                break;
            default:
                m10064(m10069(this), -1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (m10068(this)) {
            case 0:
                LongStream longStream = (LongStream) C0087.m8486((C0519a) m10063((C0565j0) m10070(this)), obj);
                if (longStream != null) {
                    try {
                        boolean zM10065 = m10065(this);
                        C0540e0 c0540e0 = (C0540e0) m10072(this);
                        if (!zM10065) {
                            C0091.m8701(C0081.m7860(longStream), c0540e0);
                        } else {
                            j$.util.Z zM11321 = C0106.m11321(C0081.m7860(longStream));
                            while (!m10071(m10069(this)) && C0091.m8667(zM11321, c0540e0)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            C0086.m8281(longStream);
                            break;
                        } catch (Throwable th2) {
                            C0092.m8780(th, th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (longStream != null) {
                    C0086.m8281(longStream);
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) C0087.m8486((C0519a) m10067((W) m10070(this)), obj);
                if (intStream != null) {
                    try {
                        boolean zM100652 = m10065(this);
                        U u = (U) m10072(this);
                        if (!zM100652) {
                            C0102.m11092(C0080.m7572(intStream), u);
                        } else {
                            j$.util.W wM8301 = C0086.m8301(C0080.m7572(intStream));
                            while (!m10071(m10069(this)) && C0081.m7828(wM8301, u)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            C0086.m8281(intStream);
                            break;
                        } catch (Throwable th4) {
                            C0092.m8780(th3, th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    C0086.m8281(intStream);
                    return;
                }
                return;
            default:
                E e = (E) C0087.m8486((C0519a) m10066((C0638y) m10070(this)), obj);
                if (e != null) {
                    try {
                        boolean zM100653 = m10065(this);
                        C0594p c0594p = (C0594p) m10072(this);
                        if (!zM100653) {
                            C0085.m8248(C0087.m8498(e), c0594p);
                        } else {
                            j$.util.T tM8308 = C0086.m8308(C0087.m8498(e));
                            while (!m10071(m10069(this)) && C0104.m11219(tM8308, c0594p)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            C0086.m8281(e);
                            break;
                        } catch (Throwable th6) {
                            C0092.m8780(th5, th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (e != null) {
                    C0086.m8281(e);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        switch (m10068(this)) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return m10071(m10069(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537d2(C0565j0 c0565j0, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.e = c0565j0;
        InterfaceC0597p2 interfaceC0597p2M10069 = m10069(this);
        C0099.m10863(interfaceC0597p2M10069);
        this.d = new C0540e0(interfaceC0597p2M10069);
    }
}
