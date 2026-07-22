package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class T1 implements V1, InterfaceC0592o2 {
    private long a;
    final /* synthetic */ long b;
    final /* synthetic */ LongBinaryOperator c;

    /* JADX INFO: renamed from: ۟ۤۤۥۤ, reason: not valid java name and contains not printable characters */
    public static LongBinaryOperator m9754(Object obj) {
        if (C0085.m8230() > 0) {
            return ((T1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m9755(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((T1) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m9756(Object obj, long j) {
        if (C0089.m8594() < 0) {
            ((T1) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static long m9757(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((T1) obj).b;
        }
        return 0L;
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

    T1(long j, LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        m9756(this, m9755((T1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = m9757(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = C0080.m7585(m9754(this), m9755(this), j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return C0106.m11351(m9755(this));
    }
}
