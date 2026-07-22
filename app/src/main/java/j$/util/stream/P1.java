package j$.util.stream;

import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class P1 implements V1, InterfaceC0587n2 {
    private int a;
    final /* synthetic */ int b;
    final /* synthetic */ IntBinaryOperator c;

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m9639(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((P1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static IntBinaryOperator m9640(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((P1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m9641(Object obj, int i) {
        if (C0100.m10983() > 0) {
            ((P1) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۢۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9642(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((P1) obj).a;
        }
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    P1(int i, IntBinaryOperator intBinaryOperator) {
        this.b = i;
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        m9641(this, m9642((P1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = m9639(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        this.a = C0095.m9179(m9640(this), m9642(this), i);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return C0102.m11105(m9642(this));
    }
}
