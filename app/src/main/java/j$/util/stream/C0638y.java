package j$.util.stream;

import j$.time.zone.C0088;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0638y extends A {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0638y(AbstractC0524b abstractC0524b, int i, Object obj, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: renamed from: ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m10642(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0638y) obj).m;
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638y(B b, DoubleConsumer doubleConsumer) {
        super(b, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10642(this)) {
            case 0:
                return new C0633x(this, interfaceC0597p2);
            case 1:
                return new C0608s(this, interfaceC0597p2, 5);
            case 2:
                return new C0584n(this, interfaceC0597p2, 6);
            default:
                return new C0537d2(this, interfaceC0597p2);
        }
    }
}
