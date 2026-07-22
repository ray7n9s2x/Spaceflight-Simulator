package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class U1 implements V1, InterfaceC0592o2 {
    private boolean a;
    private long b;
    final /* synthetic */ LongBinaryOperator c;

    /* JADX INFO: renamed from: ۟ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static long m9767(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((U1) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۤ, reason: contains not printable characters */
    public static void m9768(Object obj, long j) {
        if (C0103.m11154() <= 0) {
            ((U1) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9769(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((U1) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۢۢ, reason: not valid java name and contains not printable characters */
    public static LongBinaryOperator m9770(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((U1) obj).c;
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

    U1(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        U1 u1 = (U1) v1;
        if (m9769(u1)) {
            return;
        }
        m9768(this, m9767(u1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (m9769(this)) {
            this.a = false;
            this.b = j;
        } else {
            this.b = C0080.m7585(m9770(this), m9767(this), j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return m9769(this) ? C0089.m8601() : C0081.m7817(m9767(this));
    }
}
