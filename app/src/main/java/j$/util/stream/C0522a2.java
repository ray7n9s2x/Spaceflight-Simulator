package j$.util.stream;

import j$.time.chrono.C0081;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0522a2 extends AbstractC0527b2 {
    /* JADX INFO: renamed from: ۟ۥۢۤۦ, reason: not valid java name and contains not printable characters */
    public static long m9932(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0527b2) obj).b;
        }
        return 0L;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return C0106.m11351(m9932(this));
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b = m9932(this) + m9932((AbstractC0527b2) v1);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b = m9932(this) + 1;
    }
}
