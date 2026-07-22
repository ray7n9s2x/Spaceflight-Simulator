package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0598p3 extends AbstractC0553g3 implements j$.util.T {
    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m10424(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10425(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0553g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static long[] m10426(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10427(Object obj, Object obj2) {
        if (C0103.m11154() <= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m10428(Object obj, long j) {
        if (C0099.m10878() < 0) {
            return ((Y2) obj).u(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m10429(Object obj) {
        if (C0080.m7553() > 0) {
            ((AbstractC0553g3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m10430(Object obj) {
        if (C0079.m7512() > 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m10431(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0553g3) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10432(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((C0598p3) obj).tryAdvance((DoubleConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10433(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0553g3) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10434(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0553g3) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۡۨ, reason: contains not printable characters */
    public static void m10435(Object obj, Object obj2) {
        if (C0085.m8230() > 0) {
            ((C0598p3) obj).forEachRemaining((DoubleConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۨ۟, reason: contains not printable characters */
    public static InterfaceC0597p2 m10436(Object obj, Object obj2, Object obj3) {
        if (C0103.m11154() < 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨۦ, reason: contains not printable characters */
    public static AbstractC0534d m10437(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0553g3) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10438(Object obj) {
        if (C0092.m8724() < 0) {
            return ((AbstractC0553g3) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10439(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m10440(Object obj) {
        if (C0091.m8708() > 0) {
            return ((Y2) obj).f;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0092.m8739(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0088.m8556(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10435(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m10432(this, (DoubleConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC0553g3
    final AbstractC0553g3 e(j$.util.f0 f0Var) {
        return new C0598p3(m10425(this), f0Var, m10433(this));
    }

    @Override // j$.util.stream.AbstractC0553g3
    final void d() {
        S2 s2 = new S2();
        this.h = s2;
        C0099.m10863(s2);
        this.e = m10427(m10425(this), new C0593o3(s2, 0));
        this.f = new C0519a(2, this);
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.T trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.c0 trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.f0 trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        C0099.m10863(doubleConsumer);
        boolean zM10438 = m10438(this);
        if (zM10438) {
            S2 s2 = (S2) m10437(this);
            long jM10431 = m10431(this);
            int iM10428 = m10428(s2, jM10431);
            if (m10424(s2) == 0 && iM10428 == 0) {
                d = ((double[]) m10430(s2))[(int) jM10431];
            } else {
                d = ((double[][]) m10440(s2))[iM10428][(int) (jM10431 - m10426(s2)[iM10428])];
            }
            C0090.m8634(doubleConsumer, d);
        }
        return zM10438;
    }

    @Override // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (m10437(this) == null && !m10434(this)) {
            C0099.m10863(doubleConsumer);
            m10429(this);
            C0099.m10863(doubleConsumer);
            C0593o3 c0593o3 = new C0593o3(doubleConsumer, 1);
            m10436(m10425(this), m10439(this), c0593o3);
            this.i = true;
            return;
        }
        while (m10432(this, doubleConsumer)) {
        }
    }
}
