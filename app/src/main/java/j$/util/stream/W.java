package j$.util.stream;

import j$.util.concurrent.C0093;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class W extends AbstractC0520a0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC0524b abstractC0524b, int i, Object obj, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: renamed from: ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m9801(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((W) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m9801(this)) {
            case 0:
                return new V(this, interfaceC0597p2, 1);
            case 1:
                return new Y(this, interfaceC0597p2);
            case 2:
                return new V(this, interfaceC0597p2, 5);
            case 3:
                return new C0584n(this, interfaceC0597p2, 4);
            default:
                return new C0537d2(this, interfaceC0597p2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC0525b0 abstractC0525b0, IntConsumer intConsumer) {
        super(abstractC0525b0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
