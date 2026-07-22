package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import java.io.C0103;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements f0 {
    public final /* synthetic */ Spliterator a;

    private /* synthetic */ d0(Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ f0 a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof e0 ? C0079.m7520((e0) spliterator) : spliterator instanceof Spliterator.OfPrimitive ? C0096.m10769((Spliterator.OfPrimitive) spliterator) : new d0(spliterator);
    }

    @Override // j$.util.f0
    public final /* synthetic */ int characteristics() {
        return C0104.m11199(C0085.m8263(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliteratorM8263 = C0085.m8263(this);
        if (obj instanceof d0) {
            obj = C0085.m8263((d0) obj);
        }
        return C0085.m8250(spliteratorM8263, obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long estimateSize() {
        return C0102.m11081(C0085.m8263(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0106.m11340(C0085.m8263(this), consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ Comparator getComparator() {
        return C0079.m7480(C0085.m8263(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0101.m11019(C0085.m8263(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0095.m9181(C0085.m8263(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0085.m8263(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0105.m11308(C0085.m8263(this), consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ f0 trySplit() {
        return C0084.m8094(C0103.m11125(C0085.m8263(this)));
    }
}
