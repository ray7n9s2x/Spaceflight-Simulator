package j$.util.stream;

import j$.time.C0092;
import j$.util.C0102;

/* JADX INFO: loaded from: classes3.dex */
final class b4 extends AbstractC0562i2 implements e4 {
    final /* synthetic */ c4 b;

    /* JADX INFO: renamed from: ۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static c4 m10019(Object obj) {
        if (C0102.m11109() < 0) {
            return ((b4) obj).b;
        }
        return null;
    }

    @Override // j$.util.stream.e4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b4(c4 c4Var, InterfaceC0597p2 interfaceC0597p2, boolean z) {
        super(interfaceC0597p2);
        this.b = c4Var;
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        C0092.m8727(m10019(this));
        C0099.m10881(null, d);
        throw null;
    }
}
