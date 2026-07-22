package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0102;
import java.io.C0103;
import java.util.function.BinaryOperator;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class S1 extends W1 implements V1, InterfaceC0587n2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjIntConsumer c;
    final /* synthetic */ r d;

    /* JADX INFO: renamed from: ۣ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m9722(Object obj, Object obj2, Object obj3) {
        if (C0102.m11109() <= 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۦ, reason: not valid java name and contains not printable characters */
    public static Supplier m9723(Object obj) {
        if (C0103.m11154() < 0) {
            return ((S1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۥ, reason: not valid java name and contains not printable characters */
    public static ObjIntConsumer m9724(Object obj) {
        if (C0083.m8022() < 0) {
            return ((S1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m9725(Object obj) {
        if (C0084.m8116() > 0) {
            return ((W1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۦ, reason: contains not printable characters */
    public static r m9726(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((S1) obj).d;
        }
        return null;
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

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.a = m9722(m9726(this), m9725(this), m9725((S1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = C0106.m11328(m9723(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        C0092.m8775(m9724(this), m9725(this), i);
    }

    S1(Supplier supplier, ObjIntConsumer objIntConsumer, r rVar) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = rVar;
    }
}
