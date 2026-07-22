package j$.util.stream;

import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0546f1 implements L0 {
    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static L0 m10083(Object obj, long j, long j2, Object obj2) {
        if (C0103.m11154() <= 0) {
            return AbstractC0644z0.w((L0) obj, j, j2, (IntFunction) obj2);
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.L0
    public /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return m10083(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) C0095.m9220(intFunction, 0);
    }

    public final void r(int i, Object obj) {
    }
}
