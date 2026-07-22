package j$.util;

import j$.time.format.C0083;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class p0 extends AbstractC0505e implements f0 {
    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0099.m10863(consumer);
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0099.m10863(consumer);
    }
}
