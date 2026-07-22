package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class L1 implements V1 {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    /* JADX INFO: renamed from: ۟ۢۧۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m9551(Object obj, Object obj2, Object obj3) {
        if (C0096.m10782() >= 0) {
            return ((BinaryOperator) obj).apply(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m9552(Object obj) {
        if (C0096.m10782() > 0) {
            return ((L1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡ۟, reason: not valid java name and contains not printable characters */
    public static BinaryOperator m9553(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((L1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static void m9554(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            ((L1) obj).accept(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9555(Object obj) {
        if (C0093.m9101() > 0) {
            return ((L1) obj).a;
        }
        return false;
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

    L1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        L1 l1 = (L1) v1;
        if (m9555(l1)) {
            return;
        }
        m9554(this, m9552(l1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (m9555(this)) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = m9551(m9553(this), m9552(this), obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return m9555(this) ? C0084.m8125() : C0096.m10794(m9552(this));
    }
}
