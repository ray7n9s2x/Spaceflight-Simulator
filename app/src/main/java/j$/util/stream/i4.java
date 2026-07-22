package j$.util.stream;

import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import java.io.C0103;
import java.io.C0104;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class i4 extends l4 implements IntConsumer, j$.util.W {
    final IntPredicate e;
    int f;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: ۟۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10240(Object obj) {
        if (C0106.m11345() < 0) {
            return ((l4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.W m10241(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((i4) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m10242(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((i4) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m10243(Object obj) {
        if (C0093.m9101() > 0) {
            return ((i4) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m10244(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((l4) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10245(Object obj) {
        if (C0085.m8230() > 0) {
            return ((l4) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۧ, reason: not valid java name and contains not printable characters */
    public static void m10246(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            ((i4) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10247(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            return ((i4) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۥۦ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m10248(Object obj) {
        if (C0096.m10782() > 0) {
            return ((l4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۡ, reason: contains not printable characters */
    public static IntPredicate m10249(Object obj) {
        if (C0082.m7983() < 0) {
            return ((i4) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10250(Object obj) {
        if (C0099.m10878() < 0) {
            return ((l4) obj).c;
        }
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10246(this, (IntConsumer) obj);
    }

    @Override // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (C0081.m7828(this, intConsumer)) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(j$.util.W w, IntPredicate intPredicate, int i) {
        super(w);
        this.g = i;
        this.e = intPredicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(j$.util.W w, i4 i4Var, int i) {
        super(w, i4Var);
        this.g = i;
        this.e = m10249(i4Var);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (m10244(this) + 1) & 63;
        this.f = i;
    }

    @Override // j$.util.stream.l4
    final j$.util.f0 c(j$.util.f0 f0Var) {
        switch (m10243(this)) {
            case 0:
                return new i4((j$.util.W) f0Var, this, 0);
            default:
                return new i4((j$.util.W) f0Var, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        switch (m10243(this)) {
            case 1:
                return m10241(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (m10243(this)) {
            case 1:
                return m10241(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zM7828;
        boolean zM8224;
        switch (m10243(this)) {
            case 0:
                boolean zM10250 = m10250(this);
                j$.util.f0 f0VarM10240 = m10240(this);
                if (zM10250) {
                    boolean z = false;
                    this.c = false;
                    while (true) {
                        zM7828 = C0081.m7828((j$.util.W) f0VarM10240, this);
                        if (zM7828 && m10245(this) && C0085.m8224(m10249(this), m10242(this))) {
                            z = true;
                        }
                    }
                    if (!zM7828) {
                        return zM7828;
                    }
                    if (z) {
                        C0104.m11194(m10248(this), true);
                    }
                    C0105.m11259(intConsumer, m10242(this));
                    return zM7828;
                }
                return C0081.m7828((j$.util.W) f0VarM10240, intConsumer);
            default:
                if (m10250(this) && m10245(this) && C0081.m7828((j$.util.W) m10240(this), this)) {
                    zM8224 = C0085.m8224(m10249(this), m10242(this));
                    if (zM8224) {
                        C0105.m11259(intConsumer, m10242(this));
                        return true;
                    }
                } else {
                    zM8224 = true;
                }
                this.c = false;
                if (!zM8224) {
                    C0104.m11194(m10248(this), true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public j$.util.W trySplit() {
        switch (m10243(this)) {
            case 1:
                if (C0106.m11343(m10248(this))) {
                    return null;
                }
                return (j$.util.W) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m10247(this, (IntConsumer) obj);
    }
}
