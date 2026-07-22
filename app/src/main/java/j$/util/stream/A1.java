package j$.util.stream;

import j$.time.C0090;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0100;
import java.io.C0103;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
class A1 extends CountedCompleter {
    protected final L0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX INFO: renamed from: ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m9321(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((L0) obj).q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int m9322(Object obj) {
        if (C0104.m11196() > 0) {
            return ((A1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9323(Object obj) {
        if (C0084.m8116() > 0) {
            return ((A1) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9324(Object obj, Object obj2, int i) {
        if (C0083.m8022() <= 0) {
            ((L0) obj).i((Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۢۨۦۢ, reason: not valid java name and contains not printable characters */
    public static L0 m9325(Object obj, int i) {
        if (C0103.m11154() <= 0) {
            return ((L0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۠, reason: contains not printable characters */
    public static Object m9326(Object obj) {
        if (C0087.m8458() < 0) {
            return ((A1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static A1 m9327(Object obj, int i, int i2) {
        if (C0104.m11196() > 0) {
            return ((A1) obj).a(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static long m9328(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static L0 m9329(Object obj) {
        if (C0100.m10983() > 0) {
            return ((A1) obj).a;
        }
        return null;
    }

    public A1(L0 l0, Object obj, int i) {
        this.c = i;
        this.a = l0;
        this.b = 0;
        this.d = obj;
    }

    A1(A1 a1, L0 l0, int i, byte b) {
        super(a1);
        this.a = l0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a1M9327 = this;
        while (m9321(m9329(a1M9327)) != 0) {
            C0105.m11270(a1M9327, m9321(m9329(a1M9327)) - 1);
            int i = 0;
            int iM9328 = 0;
            while (i < m9321(m9329(a1M9327)) - 1) {
                A1 a1M93272 = m9327(a1M9327, i, m9322(a1M9327) + iM9328);
                iM9328 = (int) (((long) iM9328) + m9328(m9329(a1M93272)));
                C0096.m10779(a1M93272);
                i++;
            }
            a1M9327 = m9327(a1M9327, i, m9322(a1M9327) + iM9328);
        }
        switch (m9323(a1M9327)) {
            case 0:
                C0087.m8493((K0) m9329(a1M9327), m9322(a1M9327), m9326(a1M9327));
                break;
            default:
                m9324(m9329(a1M9327), (Object[]) m9326(a1M9327), m9322(a1M9327));
                break;
        }
        C0090.m8609(a1M9327);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a1, L0 l0, int i) {
        this(a1, l0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) m9326(a1);
    }

    final A1 a(int i, int i2) {
        switch (m9323(this)) {
            case 0:
                return new A1(this, C0083.m8042((K0) m9329(this), i), i2);
            default:
                return new A1(this, m9325(m9329(this), i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a1, K0 k0, int i) {
        this(a1, k0, i, (byte) 0);
        this.c = 0;
        this.d = m9326(a1);
    }
}
