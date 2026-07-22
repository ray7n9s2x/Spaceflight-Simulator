package j$.util;

import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class m0 extends AbstractC0505e implements T {
    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
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
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.AbstractC0505e, j$.util.T, j$.util.c0, j$.util.f0
    public final /* bridge */ /* synthetic */ T trySplit() {
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

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
        return false;
    }

    @Override // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C0099.m10863(doubleConsumer);
    }
}
