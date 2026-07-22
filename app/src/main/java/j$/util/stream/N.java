package j$.util.stream;

import j$.time.format.C0082;
import j$.time.format.C0084;
import java.util.function.C0105;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class N extends Q implements InterfaceC0587n2 {
    final IntConsumer b;

    /* JADX INFO: renamed from: ۨ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9583(Object obj, Object obj2, Object obj3) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static IntConsumer m9584(Object obj) {
        if (C0098.m10857() < 0) {
            return ((N) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9585(Object obj, Object obj2, Object obj3) {
        if (C0082.m7983() <= 0) {
            ((Q) obj).e((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9583(abstractC0524b, f0Var, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9585(this, abstractC0524b, f0Var);
        return null;
    }

    N(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        C0105.m11259(m9584(this), i);
    }
}
