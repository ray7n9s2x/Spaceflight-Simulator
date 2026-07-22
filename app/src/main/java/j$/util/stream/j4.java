package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class j4 extends l4 implements LongConsumer, j$.util.Z {
    long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(j$.util.f0 f0Var, int i) {
        super(f0Var);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(j$.util.f0 f0Var, l4 l4Var, int i) {
        super(f0Var, l4Var);
        this.f = i;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10261(Object obj) {
        if (C0089.m8594() < 0) {
            return ((l4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10262(Object obj, Object obj2) {
        if (C0100.m10983() >= 0) {
            return ((j4) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۨ, reason: not valid java name and contains not printable characters */
    public static long m10263(Object obj) {
        if (C0104.m11196() > 0) {
            return ((j4) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10264(Object obj) {
        if (C0099.m10878() < 0) {
            return ((l4) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10265(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((l4) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static int m10266(Object obj) {
        if (C0080.m7553() > 0) {
            return ((l4) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m10267(Object obj) {
        if (C0098.m10857() < 0) {
            return ((l4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m10268(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((j4) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥ, reason: not valid java name and contains not printable characters */
    public static void m10269(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            ((j4) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10270(Object obj) {
        if (C0096.m10782() > 0) {
            return ((j4) obj).trySplit();
        }
        return null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10269(this, (LongConsumer) obj);
    }

    @Override // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (C0091.m8667(this, longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (m10266(this) + 1) & 63;
        this.e = j;
    }

    @Override // j$.util.stream.l4
    final j$.util.f0 c(j$.util.f0 f0Var) {
        switch (m10268(this)) {
            case 0:
                return new j4((j$.util.Z) f0Var, this, 0);
            default:
                return new j4((j$.util.Z) f0Var, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        switch (m10268(this)) {
            case 1:
                return m10270(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (m10268(this)) {
            case 1:
                return m10270(this);
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (m10268(this)) {
            case 0:
                boolean zM10264 = m10264(this);
                j$.util.f0 f0VarM10261 = m10261(this);
                if (zM10264) {
                    this.c = false;
                    boolean zM8667 = C0091.m8667((j$.util.Z) f0VarM10261, this);
                    if (zM8667 && m10265(this)) {
                        C0090.m8632(null, m10263(this));
                        throw null;
                    }
                    if (!zM8667) {
                        return zM8667;
                    }
                    C0088.m8521(longConsumer, m10263(this));
                    return zM8667;
                }
                return C0091.m8667((j$.util.Z) f0VarM10261, longConsumer);
            default:
                if (m10264(this) && m10265(this) && C0091.m8667((j$.util.Z) m10261(this), this)) {
                    C0090.m8632(null, m10263(this));
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.l4, j$.util.f0
    public j$.util.Z trySplit() {
        switch (m10268(this)) {
            case 1:
                if (C0106.m11343(m10267(this))) {
                    return null;
                }
                return (j$.util.Z) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (m10268(this)) {
            case 1:
                m10262(this, (LongConsumer) obj);
                return false;
            default:
                return m10262(this, (LongConsumer) obj);
        }
    }
}
