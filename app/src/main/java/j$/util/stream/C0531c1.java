package j$.util.stream;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0531c1 extends AbstractC0546f1 implements H0 {
    /* JADX INFO: renamed from: ۥۢۨۧ, reason: contains not printable characters */
    public static int[] m10037() {
        if (C0101.m11044() <= 0) {
            return AbstractC0644z0.m10702();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥ۟, reason: not valid java name and contains not printable characters */
    public static K0 m10038(Object obj, int i) {
        if (C0092.m8724() < 0) {
            return ((C0531c1) obj).b(i);
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0102.m11063(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9205(this, j, j2);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m10038(this, i);
        throw null;
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7856(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0095.m9202();
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0095.m9202();
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        return m10037();
    }
}
