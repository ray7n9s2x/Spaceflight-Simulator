package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0106;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class I extends K implements InterfaceC0592o2 {
    static final F c;
    static final F d;

    /* JADX INFO: renamed from: ۟ۤۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m9478(Object obj, Object obj2) {
        if (C0095.m9210() > 0) {
            ((K) obj).accept(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9479(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((K) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m9480(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((K) obj).b;
        }
        return null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        m9478(this, C0106.m11351(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (m9479(this)) {
            return C0081.m7817(C0088.m8558((Long) m9480(this)));
        }
        return null;
    }

    static {
        EnumC0548f3 enumC0548f3M10843 = C0097.m10843();
        c = new F(true, enumC0548f3M10843, C0089.m8601(), new C0599q(7), new C0569k(8));
        d = new F(false, enumC0548f3M10843, C0089.m8601(), new C0599q(7), new C0569k(8));
    }
}
