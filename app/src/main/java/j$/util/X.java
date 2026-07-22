package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements Z {
    public final /* synthetic */ Spliterator.OfLong a;

    private /* synthetic */ X(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ Z a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof Y ? C0097.m10850((Y) ofLong) : new X(ofLong);
    }

    @Override // j$.util.f0
    public final /* synthetic */ int characteristics() {
        return C0104.m11199(C0083.m8066(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLongM8066 = C0083.m8066(this);
        if (obj instanceof X) {
            obj = C0083.m8066((X) obj);
        }
        return C0085.m8250(ofLongM8066, obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long estimateSize() {
        return C0102.m11081(C0083.m8066(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0084.m8092(C0083.m8066(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11050(C0083.m8066(this), consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0091.m8696(C0083.m8066(this), longConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ Comparator getComparator() {
        return C0079.m7480(C0083.m8066(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0101.m11019(C0083.m8066(this));
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0095.m9181(C0083.m8066(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0083.m8066(this));
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return C0102.m11087(C0083.m8066(this), obj);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7846(C0083.m8066(this), consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return C0099.m10893(C0083.m8066(this), longConsumer);
    }

    @Override // j$.util.Z, j$.util.c0, j$.util.f0
    public final /* synthetic */ Z trySplit() {
        return C0099.m10891(C0083.m8043(C0083.m8066(this)));
    }

    @Override // j$.util.c0, j$.util.f0
    public final /* synthetic */ c0 trySplit() {
        return C0096.m10769(C0105.m11276(C0083.m8066(this)));
    }

    @Override // j$.util.f0
    public final /* synthetic */ f0 trySplit() {
        return C0084.m8094(C0081.m7852(C0083.m8066(this)));
    }
}
