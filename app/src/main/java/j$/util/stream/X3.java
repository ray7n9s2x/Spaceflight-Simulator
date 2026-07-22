package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;

/* JADX INFO: loaded from: classes3.dex */
final class X3 extends AbstractC0572k2 implements e4 {
    final /* synthetic */ Y3 b;

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Y3 m9857(Object obj) {
        if (C0080.m7553() > 0) {
            return ((X3) obj).b;
        }
        return null;
    }

    @Override // j$.util.stream.e4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X3(Y3 y3, InterfaceC0597p2 interfaceC0597p2, boolean z) {
        super(interfaceC0597p2);
        this.b = y3;
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        C0092.m8727(m9857(this));
        C0090.m8632(null, j);
        throw null;
    }
}
