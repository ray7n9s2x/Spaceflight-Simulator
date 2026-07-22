package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class R1 implements V1, InterfaceC0587n2 {
    private boolean a;
    private int b;
    final /* synthetic */ IntBinaryOperator c;

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static IntBinaryOperator m9683(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((R1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m9684(Object obj, int i) {
        if (C0099.m10878() < 0) {
            ((R1) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9685(Object obj) {
        if (C0092.m8724() < 0) {
            return ((R1) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9686(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((R1) obj).b;
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

    R1(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        R1 r1 = (R1) v1;
        if (m9685(r1)) {
            return;
        }
        m9684(this, m9686(r1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        if (m9685(this)) {
            this.a = false;
            this.b = i;
        } else {
            this.b = C0095.m9179(m9683(this), m9686(this), i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return m9685(this) ? C0105.m11283() : C0097.m10820(m9686(this));
    }
}
