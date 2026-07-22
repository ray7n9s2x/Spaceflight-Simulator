package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.util.C0100;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class l4 implements j$.util.f0 {
    final j$.util.f0 a;
    final AtomicBoolean b;
    boolean c;
    int d;

    /* JADX INFO: renamed from: ۟ۢ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10315(Object obj, Object obj2) {
        if (C0081.m7818() < 0) {
            return ((l4) obj).c((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10316(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((l4) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10317(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((l4) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۦ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m10318(Object obj) {
        if (C0087.m8458() < 0) {
            return ((l4) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m10319(Object obj) {
        if (C0098.m10857() < 0) {
            return ((l4) obj).d;
        }
        return 0;
    }

    abstract j$.util.f0 c(j$.util.f0 f0Var);

    @Override // j$.util.f0
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public void forEachRemaining(Consumer consumer) {
        while (C0081.m7848(this, consumer)) {
        }
    }

    l4(j$.util.f0 f0Var) {
        this.c = true;
        this.a = f0Var;
        this.b = new AtomicBoolean();
    }

    l4(j$.util.f0 f0Var, l4 l4Var) {
        this.c = true;
        this.a = f0Var;
        C0092.m8727(l4Var);
        this.b = m10318(l4Var);
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return C0082.m7979(m10316(this));
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return C0080.m7579(m10316(this)) & (-16449);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        return C0097.m10819(m10316(this));
    }

    @Override // j$.util.f0
    public j$.util.f0 trySplit() {
        j$.util.f0 f0VarM7517 = C0079.m7517(m10316(this));
        if (f0VarM7517 != null) {
            return m10315(this, f0VarM7517);
        }
        return null;
    }

    final boolean b() {
        return (m10319(this) == 0 && C0106.m11343(m10318(this))) ? false : true;
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) m10317(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) m10317(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) m10317(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) m10317(this);
    }
}
