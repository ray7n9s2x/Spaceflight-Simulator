package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0094;
import java.io.C0103;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class E3 extends G3 implements j$.util.f0, Consumer {
    Object f;

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m9402(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0578l3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9403(Object obj) {
        if (C0103.m11154() < 0) {
            return ((G3) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static F3 m9404(Object obj) {
        if (C0081.m7818() < 0) {
            return ((G3) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static F3 m9405() {
        if (C0084.m8116() > 0) {
            return F3.NO_MORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m9406(Object obj) {
        if (C0094.m9148() > 0) {
            return ((E3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static F3 m9407() {
        if (C0099.m10878() < 0) {
            return F3.MAYBE_MORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9408(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((G3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static long m9409(Object obj, long j) {
        if (C0088.m8503() >= 0) {
            return ((G3) obj).b(j);
        }
        return 0L;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0099.m10863(consumer);
        while (m9404(this) != m9405() && C0081.m7848(m9408(this), this)) {
            if (m9409(this, 1L) == 1) {
                C0083.m8026(consumer, m9406(this));
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0099.m10863(consumer);
        C0578l3 c0578l3 = null;
        while (true) {
            F3 f3M9404 = m9404(this);
            if (f3M9404 == m9405()) {
                return;
            }
            F3 f3M9407 = m9407();
            j$.util.f0 f0VarM9408 = m9408(this);
            if (f3M9404 == f3M9407) {
                int iM9403 = m9403(this);
                if (c0578l3 == null) {
                    c0578l3 = new C0578l3(iM9403);
                } else {
                    c0578l3.a = 0;
                }
                long j = 0;
                while (C0081.m7848(f0VarM9408, c0578l3)) {
                    j++;
                    if (j >= iM9403) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jM9409 = m9409(this, j);
                for (int i = 0; i < jM9409; i++) {
                    C0083.m8026(consumer, m9402(c0578l3)[i]);
                }
            } else {
                C0088.m8509(f0VarM9408, consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.G3
    protected final j$.util.f0 c(j$.util.f0 f0Var) {
        return new E3(f0Var, this);
    }
}
