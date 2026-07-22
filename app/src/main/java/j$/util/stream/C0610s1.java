package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0610s1 extends W2 implements J0, C0 {
    /* JADX INFO: renamed from: ۟۠۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static K0 m10506(Object obj, int i) {
        if (C0095.m9210() >= 0) {
            return ((C0610s1) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m10507(Object obj, long j) {
        if (C0084.m8116() > 0) {
            ((Y2) obj).v(j);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m10508(Object obj) {
        if (C0105.m11264() > 0) {
            ((Y2) obj).clear();
        }
    }

    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final J0 a() {
        return this;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return C0095.m9178(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
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

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        m10506(this, i);
        throw null;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        C0106.m11357(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final void e(Object obj) {
        super.e((LongConsumer) obj);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final void r(int i, Object obj) {
        super.r(i, (long[]) obj);
    }

    @Override // j$.util.stream.W2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.c0 spliterator() {
        return super.y();
    }

    @Override // j$.util.stream.W2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.f0 spliterator() {
        return super.y();
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m10508(this);
        m10507(this, j);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.K0
    public final Object d() {
        return (long[]) super.d();
    }
}
