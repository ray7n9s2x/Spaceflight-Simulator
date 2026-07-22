package j$.util.stream;

import j$.time.C0090;
import j$.util.C0100;
import j$.util.C0101;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class T2 extends X2 implements j$.util.W {
    final /* synthetic */ U2 g;

    /* JADX INFO: renamed from: ۢۢۦ۠, reason: not valid java name and contains not printable characters */
    public static U2 m9758(Object obj) {
        if (C0101.m11044() < 0) {
            return ((T2) obj).g;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        C0105.m11259((IntConsumer) obj2, ((int[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 b(Object obj, int i, int i2) {
        return C0100.m10980((int[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T2(U2 u2, int i, int i2, int i3, int i4) {
        super(u2, i, i2, i3, i4);
        this.g = u2;
    }

    @Override // j$.util.stream.X2
    final j$.util.c0 c(int i, int i2, int i3, int i4) {
        return new T2(m9758(this), i, i2, i3, i4);
    }
}
