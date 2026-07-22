package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.util.concurrent.C0093;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class G extends K implements InterfaceC0582m2 {
    static final F c;
    static final F d;

    /* JADX INFO: renamed from: ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9433(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((K) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤۤۧ, reason: contains not printable characters */
    public static Object m9434(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((K) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۧ, reason: contains not printable characters */
    public static void m9435(Object obj, Object obj2) {
        if (C0093.m9101() >= 0) {
            ((K) obj).accept(obj2);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0597p2
    public final void accept(double d2) {
        m9435(this, C0085.m8245(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (m9433(this)) {
            return C0097.m10831(C0090.m8616((Double) m9434(this)));
        }
        return null;
    }

    static {
        EnumC0548f3 enumC0548f3M7527 = C0079.m7527();
        c = new F(true, enumC0548f3M7527, C0079.m7523(), new C0599q(5), new C0569k(6));
        d = new F(false, enumC0548f3M7527, C0079.m7523(), new C0599q(5), new C0569k(6));
    }
}
