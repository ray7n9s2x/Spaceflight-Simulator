package j$.util.stream;

import j$.time.C0091;
import j$.time.format.C0084;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class J extends K {
    static final F c;
    static final F d;

    /* JADX INFO: renamed from: ۡ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9508(Object obj) {
        if (C0098.m10857() < 0) {
            return ((K) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۧ۠, reason: contains not printable characters */
    public static Object m9509(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((K) obj).b;
        }
        return null;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (m9508(this)) {
            return C0096.m10794(m9509(this));
        }
        return null;
    }

    static {
        EnumC0548f3 enumC0548f3M8670 = C0091.m8670();
        c = new F(true, enumC0548f3M8670, C0084.m8125(), new C0599q(8), new C0569k(9));
        d = new F(false, enumC0548f3M8670, C0084.m8125(), new C0599q(8), new C0569k(9));
    }
}
