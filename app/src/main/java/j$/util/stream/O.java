package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class O extends Q implements InterfaceC0592o2 {
    final LongConsumer b;

    /* JADX INFO: renamed from: ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static LongConsumer m9606(Object obj) {
        if (C0079.m7512() > 0) {
            return ((O) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9607(Object obj, Object obj2, Object obj3) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static void m9608(Object obj, Object obj2, Object obj3) {
        if (C0079.m7512() > 0) {
            ((Q) obj).e((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9607(abstractC0524b, f0Var, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9608(this, abstractC0524b, f0Var);
        return null;
    }

    O(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        C0088.m8521(m9606(this), j);
    }
}
