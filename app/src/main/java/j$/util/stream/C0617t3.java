package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0617t3 extends AbstractC0553g3 implements j$.util.Z {
    /* JADX INFO: renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10537(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0553g3) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m10538(Object obj, long j) {
        if (C0089.m8594() <= 0) {
            return ((Y2) obj).u(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10539(Object obj, Object obj2, Object obj3) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10540(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10541(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0553g3) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m10542(Object obj) {
        if (C0091.m8708() > 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m10543(Object obj, Object obj2) {
        if (C0099.m10878() < 0) {
            ((C0617t3) obj).forEachRemaining((LongConsumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10544(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0553g3) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static long[] m10545(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m10546(Object obj) {
        if (C0081.m7818() < 0) {
            return ((Y2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10547(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((C0617t3) obj).tryAdvance((LongConsumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۦۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10548(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0524b) obj).S((InterfaceC0597p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10549(Object obj) {
        if (C0100.m10983() > 0) {
            return ((AbstractC0553g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m10550(Object obj) {
        if (C0088.m8503() >= 0) {
            ((AbstractC0553g3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۤ, reason: not valid java name and contains not printable characters */
    public static long m10551(Object obj) {
        if (C0100.m10983() > 0) {
            return ((AbstractC0553g3) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0534d m10552(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0553g3) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m10553(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0088.m8544(this, consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0084.m8102(this, consumer);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        m10543(this, (LongConsumer) obj);
    }

    @Override // j$.util.c0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return m10547(this, (LongConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC0553g3
    final AbstractC0553g3 e(j$.util.f0 f0Var) {
        return new C0617t3(m10549(this), f0Var, m10541(this));
    }

    @Override // j$.util.stream.AbstractC0553g3
    final void d() {
        W2 w2 = new W2();
        this.h = w2;
        C0099.m10863(w2);
        this.e = m10548(m10549(this), new C0612s3(w2, 0));
        this.f = new C0519a(4, this);
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.c0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0553g3, j$.util.f0
    public final j$.util.f0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        C0099.m10863(longConsumer);
        boolean zM10537 = m10537(this);
        if (zM10537) {
            W2 w2 = (W2) m10552(this);
            long jM10551 = m10551(this);
            int iM10538 = m10538(w2, jM10551);
            if (m10553(w2) == 0 && iM10538 == 0) {
                j = ((long[]) m10542(w2))[(int) jM10551];
            } else {
                j = ((long[][]) m10546(w2))[iM10538][(int) (jM10551 - m10545(w2)[iM10538])];
            }
            C0088.m8521(longConsumer, j);
        }
        return zM10537;
    }

    @Override // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (m10552(this) == null && !m10544(this)) {
            C0099.m10863(longConsumer);
            m10550(this);
            C0099.m10863(longConsumer);
            C0612s3 c0612s3 = new C0612s3(longConsumer, 1);
            m10539(m10549(this), m10540(this), c0612s3);
            this.i = true;
            return;
        }
        while (m10547(this, longConsumer)) {
        }
    }
}
