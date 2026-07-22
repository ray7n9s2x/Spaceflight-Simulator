package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.zone.C0088;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class R2 extends X2 implements j$.util.T {
    final /* synthetic */ S2 g;

    /* JADX INFO: renamed from: ۦۦۣۨ, reason: contains not printable characters */
    public static S2 m9687(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((R2) obj).g;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        C0090.m8634((DoubleConsumer) obj2, ((double[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 b(Object obj, int i, int i2) {
        return C0080.m7537((double[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(S2 s2, int i, int i2, int i3, int i4) {
        super(s2, i, i2, i3, i4);
        this.g = s2;
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 c(int i, int i2, int i3, int i4) {
        return new R2(m9687(this), i, i2, i3, i4);
    }
}
