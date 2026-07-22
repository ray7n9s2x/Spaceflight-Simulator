package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0515o implements f0 {
    final f0 a;

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static f0 m9285(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0515o) obj).a;
        }
        return null;
    }

    C0515o(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0099.m10863(consumer);
        return C0081.m7848(m9285(this), new C0513m(consumer));
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0099.m10863(consumer);
        C0088.m8509(m9285(this), new C0513m(consumer));
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        f0 f0VarM7517 = C0079.m7517(m9285(this));
        if (f0VarM7517 == null) {
            return null;
        }
        return new C0515o(f0VarM7517);
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return C0082.m7979(m9285(this));
    }

    @Override // j$.util.f0
    public final long getExactSizeIfKnown() {
        return C0088.m8548(m9285(this));
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return C0080.m7579(m9285(this));
    }

    @Override // j$.util.f0
    public final boolean hasCharacteristics(int i) {
        return C0088.m8562(m9285(this), i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        return C0097.m10819(m9285(this));
    }
}
