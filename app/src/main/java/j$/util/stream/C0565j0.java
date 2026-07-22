package j$.util.stream;

import j$.time.C0091;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0565j0 extends AbstractC0575l0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0565j0(AbstractC0524b abstractC0524b, int i, Object obj, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m10251(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((C0565j0) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10251(this)) {
            case 0:
                return new C0560i0(this, interfaceC0597p2);
            case 1:
                return new C0550g0(this, interfaceC0597p2, 5);
            case 2:
                return new C0537d2(this, interfaceC0597p2);
            default:
                return new C0584n(this, interfaceC0597p2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565j0(AbstractC0580m0 abstractC0580m0, LongConsumer longConsumer) {
        super(abstractC0580m0, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
