package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0568j3 extends AbstractC0573k3 implements LongConsumer {
    final long[] c;

    /* JADX INFO: renamed from: ۟ۧۢۤۡ, reason: not valid java name and contains not printable characters */
    public static long[] m10259(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C0568j3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m10260(Object obj) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0573k3) obj).b;
        }
        return 0;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    C0568j3(int i) {
        this.c = new long[i];
    }

    @Override // j$.util.stream.AbstractC0573k3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            C0088.m8521(longConsumer, m10259(this)[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int iM10260 = m10260(this);
        this.b = iM10260 + 1;
        m10259(this)[iM10260] = j;
    }
}
