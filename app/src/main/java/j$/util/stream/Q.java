package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class Q implements K3, L3 {
    private final boolean a;

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9658(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((Q) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨ۠۟, reason: contains not printable characters */
    public static InterfaceC0597p2 m9659(Object obj, Object obj2) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9660() {
        if (C0084.m8116() > 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    public /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

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

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    protected Q(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.K3
    public final int d() {
        if (m9658(this)) {
            return 0;
        }
        return m9660();
    }

    public final void e(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        if (m9658(this)) {
            C0086.m8299(new S(abstractC0524b, f0Var, this));
        } else {
            C0086.m8299(new T(abstractC0524b, f0Var, m9659(abstractC0524b, this)));
        }
    }
}
