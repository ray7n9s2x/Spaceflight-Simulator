package j$.util;

import j$.time.C0090;
import j$.time.format.C0083;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class n0 extends AbstractC0505e implements W {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.AbstractC0505e, j$.util.T, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ W trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0505e, j$.util.T, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ c0 trySplit() {
        return null;
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
        return false;
    }

    @Override // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer) {
        C0099.m10863(intConsumer);
    }
}
