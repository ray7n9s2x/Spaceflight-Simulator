package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.stream.C0097;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Spliterator {
    public final /* synthetic */ f0 a;

    private /* synthetic */ e0(f0 f0Var) {
        this.a = f0Var;
    }

    public static /* synthetic */ Spliterator a(f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        return f0Var instanceof d0 ? C0085.m8263((d0) f0Var) : f0Var instanceof c0 ? C0085.m8270((c0) f0Var) : new e0(f0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return C0080.m7579(C0079.m7520(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f0 f0VarM7520 = C0079.m7520(this);
        if (obj instanceof e0) {
            obj = C0079.m7520((e0) obj);
        }
        return C0085.m8250(f0VarM7520, obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return C0082.m7979(C0079.m7520(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8509(C0079.m7520(this), consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return C0097.m10819(C0079.m7520(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0088.m8548(C0079.m7520(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0088.m8562(C0079.m7520(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0079.m7520(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7848(C0079.m7520(this), consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0081.m7838(C0079.m7517(C0079.m7520(this)));
    }
}
