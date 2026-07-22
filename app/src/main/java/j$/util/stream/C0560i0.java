package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0560i0 extends AbstractC0572k2 {
    boolean b;
    C0540e0 c;
    final /* synthetic */ C0565j0 d;

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m10223(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0565j0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10224(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۡ, reason: not valid java name and contains not printable characters */
    public static C0565j0 m10225(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0560i0) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10226(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C0560i0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m10227(Object obj, long j) {
        if (C0104.m11196() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۤۦۨۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10228(Object obj) {
        if (C0092.m8724() < 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۦ, reason: not valid java name and contains not printable characters */
    public static C0540e0 m10229(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0560i0) obj).c;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0560i0(C0565j0 c0565j0, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.d = c0565j0;
        InterfaceC0597p2 interfaceC0597p2M10228 = m10228(this);
        C0099.m10863(interfaceC0597p2M10228);
        this.c = new C0540e0(interfaceC0597p2M10228);
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10227(m10228(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        LongStream longStream = (LongStream) C0093.m9067((C0519a) m10223(m10225(this)), j);
        if (longStream != null) {
            try {
                boolean zM10226 = m10226(this);
                C0540e0 c0540e0M10229 = m10229(this);
                if (!zM10226) {
                    C0091.m8701(C0081.m7860(longStream), c0540e0M10229);
                } else {
                    j$.util.Z zM11321 = C0106.m11321(C0081.m7860(longStream));
                    while (!m10224(m10228(this)) && C0091.m8667(zM11321, c0540e0M10229)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    C0086.m8281(longStream);
                } catch (Throwable th2) {
                    C0092.m8780(th, th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            C0086.m8281(longStream);
        }
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        this.b = true;
        return m10224(m10228(this));
    }
}
