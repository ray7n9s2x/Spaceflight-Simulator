package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.util.C0101;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class B3 extends D3 implements j$.util.W, IntConsumer {
    int f;

    /* JADX INFO: renamed from: ۠ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m9363(Object obj) {
        if (C0092.m8724() < 0) {
            return ((B3) obj).f;
        }
        return 0;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final j$.util.f0 c(j$.util.f0 f0Var) {
        return new B3((j$.util.W) f0Var, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        C0105.m11259((IntConsumer) obj, m9363(this));
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    @Override // j$.util.stream.D3
    protected final AbstractC0573k3 h(int i) {
        return new C0563i3(i);
    }
}
