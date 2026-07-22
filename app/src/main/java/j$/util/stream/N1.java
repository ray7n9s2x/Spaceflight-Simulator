package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class N1 extends W1 implements V1 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ BiConsumer c;
    final /* synthetic */ BinaryOperator d;

    /* JADX INFO: renamed from: ۟ۥۡۡۡ, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m9591(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((N1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۨ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m9592(Object obj) {
        if (C0090.m8624() > 0) {
            return ((N1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static Supplier m9593(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((N1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m9594(Object obj, Object obj2, Object obj3) {
        if (C0105.m11264() > 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m9595(Object obj) {
        if (C0084.m8116() > 0) {
            return ((W1) obj).a;
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
        this.a = m9594(m9591(this), m9595(this), m9595((N1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = C0106.m11328(m9593(this));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0105.m11267(m9592(this), m9595(this), obj);
    }

    N1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }
}
