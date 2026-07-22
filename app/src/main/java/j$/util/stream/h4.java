package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class h4 extends l4 implements DoubleConsumer, j$.util.T {
    double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(j$.util.f0 f0Var, int i) {
        super(f0Var);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(j$.util.f0 f0Var, l4 l4Var, int i) {
        super(f0Var, l4Var);
        this.f = i;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m10213(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((h4) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m10214(Object obj) {
        if (C0096.m10782() > 0) {
            return ((l4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m10215(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            ((h4) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10216(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((l4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10217(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((l4) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m10218(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((h4) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static int m10219(Object obj) {
        if (C0091.m8708() > 0) {
            return ((l4) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m10220(Object obj) {
        if (C0095.m9210() > 0) {
            return ((h4) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10221(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((l4) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۦۨ, reason: not valid java name and contains not printable characters */
    public static double m10222(Object obj) {
        return C0087.m8458() < 0 ? ((h4) obj).e : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10215(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (C0104.m11219(this, doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (m10219(this) + 1) & 63;
        this.e = d;
    }

    @Override // j$.util.stream.l4
    final j$.util.f0 c(j$.util.f0 f0Var) {
        switch (m10220(this)) {
            case 0:
                return new h4((j$.util.T) f0Var, this, 0);
            default:
                return new h4((j$.util.T) f0Var, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        switch (m10220(this)) {
            case 1:
                return m10218(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (m10220(this)) {
            case 1:
                return m10218(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (m10220(this)) {
            case 0:
                boolean zM10221 = m10221(this);
                j$.util.f0 f0VarM10216 = m10216(this);
                if (zM10221) {
                    this.c = false;
                    boolean zM11219 = C0104.m11219((j$.util.T) f0VarM10216, this);
                    if (zM11219 && m10217(this)) {
                        C0099.m10881(null, m10222(this));
                        throw null;
                    }
                    if (!zM11219) {
                        return zM11219;
                    }
                    C0090.m8634(doubleConsumer, m10222(this));
                    return zM11219;
                }
                return C0104.m11219((j$.util.T) f0VarM10216, doubleConsumer);
            default:
                if (m10221(this) && m10217(this) && C0104.m11219((j$.util.T) m10216(this), this)) {
                    C0099.m10881(null, m10222(this));
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public j$.util.T trySplit() {
        switch (m10220(this)) {
            case 1:
                if (C0106.m11343(m10214(this))) {
                    return null;
                }
                return (j$.util.T) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (m10220(this)) {
            case 1:
                m10213(this, (DoubleConsumer) obj);
                return false;
            default:
                return m10213(this, (DoubleConsumer) obj);
        }
    }
}
