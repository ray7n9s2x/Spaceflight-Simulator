package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0635x1 extends CountedCompleter implements InterfaceC0597p2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f548short = {1770, 1763, 1763, 1782, 1760, 1777, 1701, 1764, 1771, 1761, 1701, 1769, 1760, 1771, 1762, 1777, 1773, 1701, 1772, 1771, 1777, 1760, 1783, 1779, 1764, 1769, 1701, 1758, 1696, 1761, 1705, 1701, 1696, 1761, 1701, 1710, 1701, 1696, 1761, 1708, 1701, 1772, 1782, 1701, 1771, 1770, 1777, 1701, 1778, 1772, 1777, 1773, 1772, 1771, 1701, 1764, 1783, 1783, 1764, 1788, 1701, 1782, 1772, 1791, 1760, 1701, 1772, 1771, 1777, 1760, 1783, 1779, 1764, 1769, 1701, 1758, 1717, 1705, 1701, 1696, 1761, 1708, 869, 895, 876, 883, 822, 870, 887, 869, 869, 883, 882, 822, 866, 889, 822, 837, 895, 888, 893, 824, 884, 883, 881, 895, 888, 822, 883, 878, 885, 883, 883, 882, 869, 822, 887, 868, 868, 887, 879, 822, 890, 883, 888, 881, 866, 894};
    protected final j$.util.f0 a;
    protected final AbstractC0524b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    /* JADX INFO: renamed from: ۟۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static long m10613(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0635x1) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static long m10614(Object obj) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0635x1) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static long m10615(long j) {
        if (C0093.m9101() > 0) {
            return AbstractC0539e.g(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10616(Object obj, Object obj2, Object obj3) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m10617() {
        if (C0101.m11044() <= 0) {
            return f548short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static long m10618(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0635x1) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0635x1 m10619(Object obj, Object obj2, long j, long j2) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0635x1) obj).b((j$.util.f0) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧۥ, reason: contains not printable characters */
    public static AbstractC0524b m10620(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0635x1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨۥ, reason: contains not printable characters */
    public static j$.util.f0 m10621(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0635x1) obj).a;
        }
        return null;
    }

    public /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    abstract AbstractC0635x1 b(j$.util.f0 f0Var, long j, long j2);

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    AbstractC0635x1(j$.util.f0 f0Var, AbstractC0524b abstractC0524b, int i) {
        this.a = f0Var;
        this.b = abstractC0524b;
        this.c = m10615(C0082.m7979(f0Var));
        this.d = 0L;
        this.e = i;
    }

    AbstractC0635x1(AbstractC0635x1 abstractC0635x1, j$.util.f0 f0Var, long j, long j2, int i) {
        super(abstractC0635x1);
        this.a = f0Var;
        this.b = m10620(abstractC0635x1);
        this.c = m10613(abstractC0635x1);
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(C0086.m8314(C0098.m10856(m10617(), 0, 82, 1669), new Object[]{C0106.m11351(j), C0106.m11351(j), C0106.m11351(j2), C0102.m11105(i)}));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.f0 f0VarM7517;
        j$.util.f0 f0VarM10621 = m10621(this);
        AbstractC0635x1 abstractC0635x1M10619 = this;
        while (C0082.m7979(f0VarM10621) > m10613(abstractC0635x1M10619) && (f0VarM7517 = C0079.m7517(f0VarM10621)) != null) {
            C0105.m11270(abstractC0635x1M10619, 1);
            long jM7979 = C0082.m7979(f0VarM7517);
            C0096.m10779(m10619(abstractC0635x1M10619, f0VarM7517, m10618(abstractC0635x1M10619), jM7979));
            abstractC0635x1M10619 = m10619(abstractC0635x1M10619, f0VarM10621, m10618(abstractC0635x1M10619) + jM7979, m10614(abstractC0635x1M10619) - jM7979);
        }
        m10616(m10620(abstractC0635x1M10619), f0VarM10621, abstractC0635x1M10619);
        C0090.m8609(abstractC0635x1M10619);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        long jM10614 = m10614(this);
        if (j > jM10614) {
            throw new IllegalStateException(C0083.m8037(m10617(), 82, 46, 790));
        }
        int iM10618 = (int) m10618(this);
        this.f = iM10618;
        this.g = iM10618 + ((int) jM10614);
    }
}
