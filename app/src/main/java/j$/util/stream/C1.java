package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.BinaryOperator;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class C1 extends W1 implements V1, InterfaceC0592o2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjLongConsumer c;
    final /* synthetic */ r d;

    /* JADX INFO: renamed from: ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static r m9367(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Supplier m9368(Object obj) {
        if (C0092.m8724() < 0) {
            return ((C1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m9369(Object obj, Object obj2, Object obj3) {
        if (C0081.m7818() < 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m9370(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((W1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ObjLongConsumer m9371(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((C1) obj).c;
        }
        return null;
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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.a = m9369(m9367(this), m9370(this), m9370((C1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = C0106.m11328(m9368(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        C0092.m8787(m9371(this), m9370(this), j);
    }

    C1(Supplier supplier, ObjLongConsumer objLongConsumer, r rVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = rVar;
    }
}
