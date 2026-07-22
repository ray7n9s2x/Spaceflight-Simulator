package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.util.function.C0105;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class H extends K implements InterfaceC0587n2 {
    static final F c;
    static final F d;

    /* JADX INFO: renamed from: ۟۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9464(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((K) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m9465(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            ((K) obj).accept(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۡ۠, reason: contains not printable characters */
    public static Object m9466(Object obj) {
        if (C0079.m7512() > 0) {
            return ((K) obj).b;
        }
        return null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        m9465(this, C0102.m11105(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (m9464(this)) {
            return C0097.m10820(C0081.m7858((Integer) m9466(this)));
        }
        return null;
    }

    static {
        EnumC0548f3 enumC0548f3M7521 = C0079.m7521();
        c = new F(true, enumC0548f3M7521, C0105.m11283(), new C0599q(6), new C0569k(7));
        d = new F(false, enumC0548f3M7521, C0105.m11283(), new C0599q(6), new C0569k(7));
    }
}
