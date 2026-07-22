package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0624v0 implements InterfaceC0597p2 {
    boolean a;
    boolean b;

    /* JADX INFO: renamed from: ۟ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10570(Object obj) {
        if (C0087.m8458() < 0) {
            return ((EnumC0629w0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static boolean m10571(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0624v0) obj).a;
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

    AbstractC0624v0(EnumC0629w0 enumC0629w0) {
        this.b = !m10570(enumC0629w0);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return m10571(this);
    }
}
