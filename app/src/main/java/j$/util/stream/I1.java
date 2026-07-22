package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0088;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class I1 extends W1 implements V1, InterfaceC0582m2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjDoubleConsumer c;
    final /* synthetic */ r d;

    /* JADX INFO: renamed from: ۣ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m9481(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() >= 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m9482(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((W1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۢ, reason: not valid java name and contains not printable characters */
    public static r m9483(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((I1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۨ, reason: contains not printable characters */
    public static ObjDoubleConsumer m9484(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((I1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Supplier m9485(Object obj) {
        if (C0092.m8724() < 0) {
            return ((I1) obj).b;
        }
        return null;
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

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.a = m9481(m9483(this), m9482(this), m9482((I1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = C0106.m11328(m9485(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        C0088.m8546(m9484(this), m9482(this), d);
    }

    I1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, r rVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = rVar;
    }
}
