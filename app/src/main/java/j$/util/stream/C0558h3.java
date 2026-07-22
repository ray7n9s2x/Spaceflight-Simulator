package j$.util.stream;

import j$.time.C0090;
import j$.time.zone.C0088;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0558h3 extends AbstractC0573k3 implements DoubleConsumer {
    final double[] c;

    /* JADX INFO: renamed from: ۡۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m10211(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0573k3) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۨۦ, reason: not valid java name and contains not printable characters */
    public static double[] m10212(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((C0558h3) obj).c;
        }
        return null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    C0558h3(int i) {
        this.c = new double[i];
    }

    @Override // j$.util.stream.AbstractC0573k3
    final void b(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            C0090.m8634(doubleConsumer, m10212(this)[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int iM10211 = m10211(this);
        this.b = iM10211 + 1;
        m10212(this)[iM10211] = d;
    }
}
