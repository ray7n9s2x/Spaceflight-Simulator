package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import java.io.C0104;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class k4 extends l4 implements Consumer {
    final Predicate e;
    Object f;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10289(Object obj) {
        if (C0090.m8624() > 0) {
            return ((l4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m10290(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((l4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10291(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((l4) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10292(Object obj) {
        if (C0081.m7818() < 0) {
            return ((l4) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static int m10293(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((k4) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m10294(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((l4) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m10295(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((k4) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۧۡ, reason: contains not printable characters */
    public static Predicate m10296(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((k4) obj).e;
        }
        return null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(j$.util.f0 f0Var, Predicate predicate, int i) {
        super(f0Var);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(j$.util.f0 f0Var, k4 k4Var, int i) {
        super(f0Var, k4Var);
        this.g = i;
        this.e = m10296(k4Var);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (m10294(this) + 1) & 63;
        this.f = obj;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        boolean zM7848;
        boolean zM8320;
        switch (m10293(this)) {
            case 0:
                boolean zM10292 = m10292(this);
                j$.util.f0 f0VarM10289 = m10289(this);
                if (zM10292) {
                    boolean z = false;
                    this.c = false;
                    while (true) {
                        zM7848 = C0081.m7848(f0VarM10289, this);
                        if (zM7848 && m10291(this) && C0086.m8320(m10296(this), m10295(this))) {
                            z = true;
                        }
                    }
                    if (!zM7848) {
                        return zM7848;
                    }
                    if (z) {
                        C0104.m11194(m10290(this), true);
                    }
                    C0083.m8026(consumer, m10295(this));
                    return zM7848;
                }
                return C0081.m7848(f0VarM10289, consumer);
            default:
                if (m10292(this) && m10291(this) && C0081.m7848(m10289(this), this)) {
                    zM8320 = C0086.m8320(m10296(this), m10295(this));
                    if (zM8320) {
                        C0083.m8026(consumer, m10295(this));
                        return true;
                    }
                } else {
                    zM8320 = true;
                }
                this.c = false;
                if (!zM8320) {
                    C0104.m11194(m10290(this), true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public j$.util.f0 trySplit() {
        switch (m10293(this)) {
            case 1:
                if (!C0106.m11343(m10290(this))) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.l4
    final j$.util.f0 c(j$.util.f0 f0Var) {
        switch (m10293(this)) {
            case 0:
                return new k4(f0Var, this, 0);
            default:
                return new k4(f0Var, this, 1);
        }
    }
}
