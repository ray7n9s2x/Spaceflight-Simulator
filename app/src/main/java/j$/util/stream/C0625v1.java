package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0625v1 extends AbstractC0635x1 implements InterfaceC0592o2 {
    private final long[] h;

    /* JADX INFO: renamed from: ۟ۦۢۨۡ, reason: not valid java name and contains not printable characters */
    public static long[] m10572(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0625v1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int m10573(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0635x1) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨ۟۟, reason: contains not printable characters */
    public static int m10574(Object obj) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0635x1) obj).g;
        }
        return 0;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    C0625v1(j$.util.f0 f0Var, AbstractC0524b abstractC0524b, long[] jArr) {
        super(f0Var, abstractC0524b, jArr.length);
        this.h = jArr;
    }

    C0625v1(C0625v1 c0625v1, j$.util.f0 f0Var, long j, long j2) {
        super(c0625v1, f0Var, j, j2, m10572(c0625v1).length);
        this.h = m10572(c0625v1);
    }

    @Override // j$.util.stream.AbstractC0635x1
    final AbstractC0635x1 b(j$.util.f0 f0Var, long j, long j2) {
        return new C0625v1(this, f0Var, j, j2);
    }

    @Override // j$.util.stream.AbstractC0635x1, j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        int iM10573 = m10573(this);
        if (iM10573 >= m10574(this)) {
            throw new IndexOutOfBoundsException(C0102.m11091(m10573(this)));
        }
        long[] jArrM10572 = m10572(this);
        this.f = iM10573 + 1;
        jArrM10572[iM10573] = j;
    }
}
