package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.util.C0102;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class G1 implements V1, InterfaceC0582m2 {
    private boolean a;
    private double b;
    final /* synthetic */ DoubleBinaryOperator c;

    /* JADX INFO: renamed from: ۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static DoubleBinaryOperator m9436(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((G1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static double m9437(Object obj) {
        return C0097.m10823() > 0 ? ((G1) obj).b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9438(Object obj, double d) {
        if (C0102.m11109() < 0) {
            ((G1) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠۟, reason: contains not printable characters */
    public static boolean m9439(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((G1) obj).a;
        }
        return false;
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

    G1(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        G1 g1 = (G1) v1;
        if (m9439(g1)) {
            return;
        }
        m9438(this, m9437(g1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = true;
        this.b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        if (m9439(this)) {
            this.a = false;
            this.b = d;
        } else {
            this.b = C0103.m11175(m9436(this), m9437(this), d);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return m9439(this) ? C0079.m7523() : C0097.m10831(m9437(this));
    }
}
