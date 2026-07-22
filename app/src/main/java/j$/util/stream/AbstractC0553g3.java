package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.C0106;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0553g3 implements j$.util.f0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f538short = {1638, 1584, 1560, 1638, 1584, 1566};
    final boolean a;
    final AbstractC0524b b;
    private Supplier c;
    j$.util.f0 d;
    InterfaceC0597p2 e;
    BooleanSupplier f;
    long g;
    AbstractC0534d h;
    boolean i;

    /* JADX INFO: renamed from: ۟۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m10129() {
        if (C0102.m11109() < 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m10130(Object obj) {
        if (C0101.m11044() < 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static long m10131(Object obj) {
        if (C0098.m10857() < 0) {
            return ((AbstractC0553g3) obj).g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m10132() {
        if (C0083.m8022() < 0) {
            return f538short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10133(Object obj, int i) {
        if (C0087.m8458() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC0534d m10134(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0553g3) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10135(Object obj) {
        if (C0088.m8503() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static void m10136(Object obj, long j) {
        if (C0090.m8624() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10137(Object obj) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0553g3) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟۟, reason: not valid java name and contains not printable characters */
    public static long m10138(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((AbstractC0534d) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10139(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0553g3) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10140(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0553g3) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10141(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0553g3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m10142(int i) {
        if (C0090.m8624() >= 0) {
            return EnumC0543e3.w(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۦۡ, reason: not valid java name and contains not printable characters */
    public static BooleanSupplier m10143(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0553g3) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10144(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0553g3) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤ۟۟, reason: contains not printable characters */
    public static void m10145(Object obj) {
        if (C0087.m8458() <= 0) {
            ((AbstractC0553g3) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۥۥۦۧ, reason: contains not printable characters */
    public static void m10146(Object obj) {
        if (C0091.m8708() > 0) {
            ((AbstractC0553g3) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static int m10147(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۨ, reason: contains not printable characters */
    public static AbstractC0524b m10148(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0553g3) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۢ, reason: contains not printable characters */
    public static Supplier m10149(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0553g3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m10150() {
        if (C0106.m11345() < 0) {
            return EnumC0543e3.f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m10151(Object obj) {
        if (C0094.m9148() > 0) {
            ((AbstractC0534d) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0553g3 m10152(Object obj, Object obj2) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0553g3) obj).e((j$.util.f0) obj2);
        }
        return null;
    }

    abstract void d();

    abstract AbstractC0553g3 e(j$.util.f0 f0Var);

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    AbstractC0553g3(AbstractC0524b abstractC0524b, Supplier supplier, boolean z) {
        this.b = abstractC0524b;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    AbstractC0553g3(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, boolean z) {
        this.b = abstractC0524b;
        this.c = null;
        this.d = f0Var;
        this.a = z;
    }

    final void c() {
        if (m10137(this) == null) {
            this.d = (j$.util.f0) C0106.m11328(m10149(this));
            this.c = null;
        }
    }

    final boolean a() {
        AbstractC0534d abstractC0534dM10134 = m10134(this);
        if (abstractC0534dM10134 == null) {
            if (m10140(this)) {
                return false;
            }
            m10146(this);
            m10145(this);
            this.g = 0L;
            m10136(m10141(this), C0088.m8548(m10137(this)));
            return m10144(this);
        }
        long jM10131 = m10131(this) + 1;
        this.g = jM10131;
        boolean z = jM10131 < m10138(abstractC0534dM10134);
        if (z) {
            return z;
        }
        this.g = 0L;
        m10151(m10134(this));
        return m10144(this);
    }

    @Override // j$.util.f0
    public j$.util.f0 trySplit() {
        if (!m10139(this) || m10134(this) != null || m10140(this)) {
            return null;
        }
        m10146(this);
        j$.util.f0 f0VarM7517 = C0079.m7517(m10137(this));
        if (f0VarM7517 == null) {
            return null;
        }
        return m10152(this, f0VarM7517);
    }

    private boolean b() {
        while (m10138(m10134(this)) == 0) {
            if (m10135(m10141(this)) || !C0092.m8745(m10143(this))) {
                if (m10140(this)) {
                    return false;
                }
                m10130(m10141(this));
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        m10146(this);
        return C0082.m7979(m10137(this));
    }

    @Override // j$.util.f0
    public final long getExactSizeIfKnown() {
        m10146(this);
        if (m10133(m10129(), m10147(m10148(this)))) {
            return C0088.m8548(m10137(this));
        }
        return -1L;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        m10146(this);
        int iM10142 = m10142(m10147(m10148(this))) & m10150();
        return (iM10142 & 64) != 0 ? (iM10142 & (-16449)) | (C0080.m7579(m10137(this)) & 16448) : iM10142;
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        if (C0100.m10986(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return C0086.m8314(C0106.m11346(m10132(), 0, 6, 1603), new Object[]{C0084.m8091(C0092.m8727(this)), m10137(this)});
    }
}
