package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.C0102;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class E1 implements V1, InterfaceC0582m2 {
    private double a;
    final /* synthetic */ double b;
    final /* synthetic */ DoubleBinaryOperator c;

    /* JADX INFO: renamed from: ۟ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9388(Object obj, double d) {
        if (C0100.m10983() > 0) {
            ((E1) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static double m9389(Object obj) {
        return C0102.m11109() <= 0 ? ((E1) obj).a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static DoubleBinaryOperator m9390(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((E1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static double m9391(Object obj) {
        return C0096.m10782() >= 0 ? ((E1) obj).b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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

    E1(double d, DoubleBinaryOperator doubleBinaryOperator) {
        this.b = d;
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        m9388(this, m9389((E1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = m9391(this);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        this.a = C0103.m11175(m9390(this), m9389(this), d);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return C0085.m8245(m9389(this));
    }
}
