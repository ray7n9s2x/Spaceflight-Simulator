package j$.util.stream;

import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0536d1 extends AbstractC0546f1 implements J0 {
    /* JADX INFO: renamed from: ۟۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static K0 m10061(Object obj, int i) {
        if (C0103.m11154() <= 0) {
            return ((C0536d1) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤ۠, reason: not valid java name and contains not printable characters */
    public static long[] m10062() {
        if (C0104.m11196() >= 0) {
            return AbstractC0644z0.m10703();
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0082.m7995(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9178(this, j, j2);
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m10061(this, i);
        throw null;
    }

    @Override // j$.util.stream.AbstractC0546f1, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0106.m11357(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.L0
    public final j$.util.c0 spliterator() {
        return C0083.m8065();
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return C0083.m8065();
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        return m10062();
    }
}
