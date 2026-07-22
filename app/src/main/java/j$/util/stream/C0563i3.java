package j$.util.stream;

import j$.time.C0089;
import j$.time.format.C0082;
import java.util.function.C0105;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0563i3 extends AbstractC0573k3 implements IntConsumer {
    final int[] c;

    /* JADX INFO: renamed from: ۟۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int[] m10238(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0563i3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m10239(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0573k3) obj).b;
        }
        return 0;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    C0563i3(int i) {
        this.c = new int[i];
    }

    @Override // j$.util.stream.AbstractC0573k3
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            C0105.m11259(intConsumer, m10238(this)[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int iM10239 = m10239(this);
        this.b = iM10239 + 1;
        m10238(this)[iM10239] = i;
    }
}
