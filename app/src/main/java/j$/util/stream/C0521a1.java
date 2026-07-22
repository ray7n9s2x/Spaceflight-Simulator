package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.function.C0094;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0521a1 extends S2 implements F0, A0 {
    /* JADX INFO: renamed from: ۟ۦۦۢۥ, reason: not valid java name and contains not printable characters */
    public static K0 m9929(Object obj, int i) {
        if (C0096.m10782() > 0) {
            return ((C0521a1) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static void m9930(Object obj, long j) {
        if (C0085.m8230() > 0) {
            ((Y2) obj).v(j);
        }
    }

    /* JADX INFO: renamed from: ۥۧۥۧ, reason: contains not printable characters */
    public static void m9931(Object obj) {
        if (C0079.m7512() >= 0) {
            ((Y2) obj).clear();
        }
    }

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final F0 a() {
        return this;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0105.m11261(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0094.m9113(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0091.m8663(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m9929(this, i);
        throw null;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0081.m7836(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final void r(int i, Object obj) {
        super.r(i, (double[]) obj);
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.c0 spliterator() {
        return super.y();
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.f0 spliterator() {
        return super.y();
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m9931(this);
        m9930(this, j);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final Object d() {
        return (double[]) super.d();
    }
}
