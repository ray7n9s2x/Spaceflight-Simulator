package j$.util.stream;

import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class P extends Q {
    final Consumer b;

    /* JADX INFO: renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Consumer m9633(Object obj) {
        if (C0106.m11345() < 0) {
            return ((P) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9634(Object obj, Object obj2, Object obj3) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9635(Object obj, Object obj2, Object obj3) {
        if (C0084.m8116() > 0) {
            ((Q) obj).e((AbstractC0524b) obj2, (j$.util.f0) obj3);
        }
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9634(abstractC0524b, f0Var, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        m9635(this, abstractC0524b, f0Var);
        return null;
    }

    P(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0083.m8026(m9633(this), obj);
    }
}
