package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.function.C0094;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0579m extends AbstractC0577l2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    public /* synthetic */ C0579m(InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m10320(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((O3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10321(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0579m) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m10322(Object obj, long j) {
        if (C0081.m7818() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m10323(Object obj) {
        if (C0081.m7818() < 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10324(Object obj) {
        if (C0083.m8022() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m10325(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((C0579m) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10326(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m10327(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((C0613t) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m10328(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0579m) obj).d;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579m(O3 o3, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = o3;
        this.c = true;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        switch (m10325(this)) {
            case 0:
                this.c = false;
                this.d = null;
                m10322(m10326(this), -1L);
                break;
            case 1:
                m10322(m10326(this), -1L);
                break;
            default:
                m10322(m10326(this), -1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (m10325(this)) {
            case 0:
                InterfaceC0597p2 interfaceC0597p2M10326 = m10326(this);
                if (obj == null) {
                    if (m10321(this)) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    C0083.m8026(interfaceC0597p2M10326, null);
                    return;
                }
                Object objM10328 = m10328(this);
                if (objM10328 == null || !C0085.m8250(obj, objM10328)) {
                    this.d = obj;
                    C0083.m8026(interfaceC0597p2M10326, obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) C0087.m8486((C0519a) m10327((C0613t) m10328(this)), obj);
                if (stream != null) {
                    try {
                        boolean zM10321 = m10321(this);
                        InterfaceC0597p2 interfaceC0597p2M103262 = m10326(this);
                        if (!zM10321) {
                            C0088.m8566((Stream) C0102.m11075(stream), interfaceC0597p2M103262);
                        } else {
                            j$.util.f0 f0VarM11114 = C0102.m11114((Stream) C0102.m11075(stream));
                            while (!m10324(interfaceC0597p2M103262) && C0081.m7848(f0VarM11114, interfaceC0597p2M103262)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            C0086.m8281(stream);
                            break;
                        } catch (Throwable th2) {
                            C0092.m8780(th, th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    C0086.m8281(stream);
                    return;
                }
                return;
            default:
                if (m10321(this)) {
                    boolean zM8320 = C0086.m8320(m10320((O3) m10328(this)), obj);
                    this.c = zM8320;
                    if (zM8320) {
                        C0083.m8026(m10326(this), obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public boolean n() {
        switch (m10325(this)) {
            case 1:
                this.c = true;
                return m10324(m10326(this));
            case 2:
                return !m10321(this) || m10324(m10326(this));
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public void k() {
        switch (m10325(this)) {
            case 0:
                this.c = false;
                this.d = null;
                m10323(m10326(this));
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579m(C0613t c0613t, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0613t;
    }
}
