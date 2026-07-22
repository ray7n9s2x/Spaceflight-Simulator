package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import java.io.C0103;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class K implements L3 {
    boolean a;
    Object b;

    /* JADX INFO: renamed from: ۟۠ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9519(Object obj, Object obj2) {
        if (C0080.m7553() >= 0) {
            ((K) obj).accept(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9520(Object obj) {
        if (C0103.m11154() < 0) {
            return ((K) obj).a;
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
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
    public final /* synthetic */ void l(long j) {
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (m9520(this)) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m9520(this);
    }

    public /* bridge */ /* synthetic */ void m(Integer num) {
        m9519(this, num);
    }

    public /* bridge */ /* synthetic */ void j(Long l) {
        m9519(this, l);
    }

    public /* bridge */ /* synthetic */ void p(Double d) {
        m9519(this, d);
    }
}
