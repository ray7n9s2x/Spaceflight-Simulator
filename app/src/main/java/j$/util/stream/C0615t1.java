package j$.util.stream;

import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0615t1 extends AbstractC0635x1 implements InterfaceC0582m2 {
    private final double[] h;

    /* JADX INFO: renamed from: ۣ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static double[] m10522(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((C0615t1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static int m10523(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0635x1) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m10524(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0635x1) obj).f;
        }
        return 0;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0105.m11261(this, obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    C0615t1(j$.util.f0 f0Var, AbstractC0524b abstractC0524b, double[] dArr) {
        super(f0Var, abstractC0524b, dArr.length);
        this.h = dArr;
    }

    C0615t1(C0615t1 c0615t1, j$.util.f0 f0Var, long j, long j2) {
        super(c0615t1, f0Var, j, j2, m10522(c0615t1).length);
        this.h = m10522(c0615t1);
    }

    @Override // j$.util.stream.AbstractC0635x1
    final AbstractC0635x1 b(j$.util.f0 f0Var, long j, long j2) {
        return new C0615t1(this, f0Var, j, j2);
    }

    @Override // j$.util.stream.AbstractC0635x1, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        int iM10524 = m10524(this);
        if (iM10524 >= m10523(this)) {
            throw new IndexOutOfBoundsException(C0102.m11091(m10524(this)));
        }
        double[] dArrM10522 = m10522(this);
        this.f = iM10524 + 1;
        dArrM10522[iM10524] = d;
    }
}
