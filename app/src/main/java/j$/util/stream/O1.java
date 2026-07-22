package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class O1 extends W1 implements V1 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ BiConsumer c;
    final /* synthetic */ BiConsumer d;

    /* JADX INFO: renamed from: ۟ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Supplier m9613(Object obj) {
        if (C0095.m9210() > 0) {
            return ((O1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static BiConsumer m9614(Object obj) {
        if (C0083.m8022() < 0) {
            return ((O1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static BiConsumer m9615(Object obj) {
        if (C0095.m9210() > 0) {
            return ((O1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m9616(Object obj) {
        if (C0096.m10782() > 0) {
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
        C0105.m11267(m9614(this), m9616(this), m9616((O1) v1));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        this.a = C0106.m11328(m9613(this));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0105.m11267(m9615(this), m9616(this), obj);
    }

    O1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = biConsumer2;
    }
}
