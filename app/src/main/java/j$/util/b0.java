package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Spliterator.OfPrimitive {
    public final /* synthetic */ c0 a;

    private /* synthetic */ b0(c0 c0Var) {
        this.a = c0Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var instanceof a0 ? C0081.m7820((a0) c0Var) : c0Var instanceof T ? C0089.m8578((T) c0Var) : c0Var instanceof W ? C0086.m8319((W) c0Var) : c0Var instanceof Z ? C0094.m9132((Z) c0Var) : new b0(c0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return C0080.m7579(C0088.m8529(this));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c0 c0VarM8529 = C0088.m8529(this);
        if (obj instanceof b0) {
            obj = C0088.m8529((b0) obj);
        }
        return C0085.m8250(c0VarM8529, obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return C0082.m7979(C0088.m8529(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        C0080.m7577(C0088.m8529(this), obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8509(C0088.m8529(this), consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return C0097.m10819(C0088.m8529(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0088.m8548(C0088.m8529(this));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0088.m8562(C0088.m8529(this), i);
    }

    public final /* synthetic */ int hashCode() {
        return C0090.m8618(C0088.m8529(this));
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return C0083.m8061(C0088.m8529(this), obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0081.m7848(C0088.m8529(this), consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0085.m8270(C0095.m9212(C0088.m8529(this)));
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0081.m7838(C0079.m7517(C0088.m8529(this)));
    }
}
