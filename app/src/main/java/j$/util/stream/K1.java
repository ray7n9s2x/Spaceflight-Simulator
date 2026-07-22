package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class K1 extends W1 implements V1 {
    final /* synthetic */ Object b;
    final /* synthetic */ BiFunction c;
    final /* synthetic */ BinaryOperator d;

    /* JADX INFO: renamed from: ۟۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m9521(Object obj, Object obj2, Object obj3) {
        if (C0079.m7512() >= 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m9522(Object obj) {
        if (C0089.m8594() < 0) {
            return ((K1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m9523(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((K1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۤ, reason: contains not printable characters */
    public static Object m9524(Object obj) {
        if (C0088.m8503() > 0) {
            return ((W1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟۠, reason: not valid java name and contains not printable characters */
    public static BiFunction m9525(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((K1) obj).c;
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

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
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
        this.a = m9521(m9523(this), m9524(this), m9524((K1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = m9522(this);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = C0082.m7970(m9525(this), m9524(this), obj);
    }

    K1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}
