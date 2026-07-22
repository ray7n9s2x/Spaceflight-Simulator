package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0088;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class A3 extends D3 implements j$.util.T, DoubleConsumer {
    double f;

    /* JADX INFO: renamed from: ۢ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static double m9330(Object obj) {
        return C0081.m7818() <= 0 ? ((A3) obj).f : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final j$.util.f0 c(j$.util.f0 f0Var) {
        return new A3((j$.util.T) f0Var, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        C0090.m8634((DoubleConsumer) obj, m9330(this));
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    @Override // j$.util.stream.D3
    protected final AbstractC0573k3 h(int i) {
        return new C0558h3(i);
    }
}
