package j$.util.stream;

import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import java.util.function.C0106;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class Y1 extends AbstractC0527b2 implements InterfaceC0587n2 {
    /* JADX INFO: renamed from: ۟ۥ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m9869(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0527b2) obj).b;
        }
        return 0L;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return C0106.m11351(m9869(this));
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b = m9869(this) + m9869((AbstractC0527b2) v1);
    }

    @Override // j$.util.stream.AbstractC0527b2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        this.b = m9869(this) + 1;
    }
}
