package j$.util.stream;

import java.io.C0103;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0613t extends AbstractC0552g2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0613t(AbstractC0524b abstractC0524b, int i, Object obj, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: renamed from: ۥۣۤۦ, reason: contains not printable characters */
    public static int m10520(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0613t) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10520(this)) {
            case 0:
                return new C0608s(this, interfaceC0597p2, 0);
            case 1:
                return new V(this, interfaceC0597p2, 0);
            case 2:
                return new C0550g0(this, interfaceC0597p2, 0);
            case 3:
                return new C0584n(this, interfaceC0597p2, 1);
            case 4:
                return new C0584n(this, interfaceC0597p2, 2);
            case 5:
                return new C0584n(this, interfaceC0597p2, 3);
            default:
                return new C0579m(this, interfaceC0597p2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613t(AbstractC0557h2 abstractC0557h2, Consumer consumer) {
        super(abstractC0557h2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
