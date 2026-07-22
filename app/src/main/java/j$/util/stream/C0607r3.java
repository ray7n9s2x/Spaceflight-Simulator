package j$.util.stream;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0607r3 extends AbstractC0553g3 implements j$.util.W {
    /* JADX INFO: renamed from: ۟۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10477(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0553g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10478(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((C0607r3) obj).tryAdvance((IntConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m10479(Object obj) {
        if (C0105.m11264() > 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m10480(Object obj, Object obj2) {
        if (C0082.m7983() < 0) {
            ((C0607r3) obj).forEachRemaining((IntConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0534d m10481(Object obj) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0553g3) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10482(Object obj) {
        if (C0088.m8503() > 0) {
            return ((AbstractC0553g3) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۦ, reason: not valid java name and contains not printable characters */
    public static long m10483(Object obj) {
        if (C0092.m8724() < 0) {
            return ((AbstractC0553g3) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10484(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0553g3) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long[] m10485(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10486(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0553g3) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10487(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10488(Object obj, Object obj2) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m10489(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((Y2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۤ, reason: contains not printable characters */
    public static void m10490(Object obj) {
        if (C0087.m8458() < 0) {
            ((AbstractC0553g3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m10491(Object obj, long j) {
        if (C0099.m10878() <= 0) {
            return ((Y2) obj).u(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10492(Object obj, Object obj2, Object obj3) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int m10493(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0101.m11051(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0090.m8625(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10480(this, (IntConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m10478(this, (IntConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC0553g3
    final AbstractC0553g3 e(j$.util.f0 f0Var) {
        return new C0607r3(m10477(this), f0Var, m10484(this));
    }

    @Override // j$.util.stream.AbstractC0553g3
    final void d() {
        U2 u2 = new U2();
        this.h = u2;
        C0099.m10863(u2);
        this.e = m10488(m10477(this), new C0603q3(u2, 0));
        this.f = new C0519a(3, this);
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.c0 trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        C0099.m10863(intConsumer);
        boolean zM10482 = m10482(this);
        if (zM10482) {
            U2 u2 = (U2) m10481(this);
            long jM10483 = m10483(this);
            int iM10491 = m10491(u2, jM10483);
            if (m10493(u2) == 0 && iM10491 == 0) {
                i = ((int[]) m10479(u2))[(int) jM10483];
            } else {
                i = ((int[][]) m10489(u2))[iM10491][(int) (jM10483 - m10485(u2)[iM10491])];
            }
            C0105.m11259(intConsumer, i);
        }
        return zM10482;
    }

    @Override // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (m10481(this) == null && !m10486(this)) {
            C0099.m10863(intConsumer);
            m10490(this);
            C0099.m10863(intConsumer);
            C0603q3 c0603q3 = new C0603q3(intConsumer, 1);
            m10492(m10477(this), m10487(this), c0603q3);
            this.i = true;
            return;
        }
        while (m10478(this, intConsumer)) {
        }
    }
}
