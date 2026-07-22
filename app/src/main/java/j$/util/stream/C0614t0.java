package j$.util.stream;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0614t0 extends AbstractC0624v0 implements InterfaceC0592o2 {
    /* JADX INFO: renamed from: ۟۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10521(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0624v0) obj).a;
        }
        return false;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    @Override // j$.util.stream.AbstractC0624v0, j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (m10521(this)) {
            return;
        }
        C0090.m8632(null, j);
        throw null;
    }
}
