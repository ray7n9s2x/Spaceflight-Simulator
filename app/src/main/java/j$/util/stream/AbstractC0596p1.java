package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.concurrent.C0093;
import java.io.C0103;
import java.io.C0104;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0596p1 implements j$.util.f0 {
    L0 a;
    int b;
    j$.util.f0 c;
    j$.util.f0 d;
    ArrayDeque e;

    /* JADX INFO: renamed from: ۟۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m10413(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ۟, reason: not valid java name and contains not printable characters */
    public static L0 m10414(Object obj, int i) {
        if (C0100.m10983() >= 0) {
            return ((L0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10415(Object obj) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0596p1) obj).trySplit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m10416(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0596p1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m10417(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0596p1) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m10418(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((L0) obj).q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۡۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10419(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10420(Object obj) {
        if (C0083.m8022() < 0) {
            return ((AbstractC0596p1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static L0 m10421(Object obj) {
        if (C0090.m8624() >= 0) {
            return a((ArrayDeque) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static L0 m10422(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0596p1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10423(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0596p1) obj).c;
        }
        return null;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC0596p1(L0 l0) {
        this.a = l0;
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iM10418 = m10418(m10422(this));
        while (true) {
            iM10418--;
            if (iM10418 < m10416(this)) {
                return arrayDeque;
            }
            C0087.m8457(arrayDeque, m10414(m10422(this), iM10418));
        }
    }

    protected static L0 a(ArrayDeque arrayDeque) {
        while (true) {
            L0 l0 = (L0) C0083.m8054(arrayDeque);
            if (l0 == null) {
                return null;
            }
            if (m10418(l0) != 0) {
                for (int iM10418 = m10418(l0) - 1; iM10418 >= 0; iM10418--) {
                    C0087.m8457(arrayDeque, m10414(l0, iM10418));
                }
            } else if (m10413(l0) > 0) {
                return l0;
            }
        }
    }

    protected final boolean c() {
        if (m10422(this) == null) {
            return false;
        }
        if (m10420(this) != null) {
            return true;
        }
        j$.util.f0 f0VarM10423 = m10423(this);
        if (f0VarM10423 == null) {
            ArrayDeque arrayDequeM10417 = m10417(this);
            this.e = arrayDequeM10417;
            L0 l0M10421 = m10421(arrayDequeM10417);
            if (l0M10421 != null) {
                this.d = m10419(l0M10421);
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = f0VarM10423;
        return true;
    }

    @Override // j$.util.f0
    public final j$.util.f0 trySplit() {
        L0 l0M10422 = m10422(this);
        if (l0M10422 == null || m10420(this) != null) {
            return null;
        }
        j$.util.f0 f0VarM10423 = m10423(this);
        if (f0VarM10423 != null) {
            return C0079.m7517(f0VarM10423);
        }
        if (m10416(this) < m10418(l0M10422) - 1) {
            L0 l0M104222 = m10422(this);
            int iM10416 = m10416(this);
            this.b = iM10416 + 1;
            return m10419(m10414(l0M104222, iM10416));
        }
        L0 l0M10414 = m10414(m10422(this), m10416(this));
        this.a = l0M10414;
        if (m10418(l0M10414) == 0) {
            j$.util.f0 f0VarM10419 = m10419(m10422(this));
            this.c = f0VarM10419;
            return C0079.m7517(f0VarM10419);
        }
        L0 l0M104223 = m10422(this);
        this.b = 1;
        return m10419(m10414(l0M104223, 0));
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        long jM10413 = 0;
        if (m10422(this) == null) {
            return 0L;
        }
        j$.util.f0 f0VarM10423 = m10423(this);
        if (f0VarM10423 != null) {
            return C0082.m7979(f0VarM10423);
        }
        for (int iM10416 = m10416(this); iM10416 < m10418(m10422(this)); iM10416++) {
            jM10413 += m10413(m10414(m10422(this), iM10416));
        }
        return jM10413;
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) m10415(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) m10415(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) m10415(this);
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) m10415(this);
    }
}
