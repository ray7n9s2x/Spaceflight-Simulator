package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0637x3 extends AbstractC0647z3 implements j$.util.c0 {
    /* JADX INFO: renamed from: ۟۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10634(Object obj, Object obj2) {
        if (C0104.m11196() > 0) {
            return ((AbstractC0637x3) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠۟, reason: not valid java name and contains not printable characters */
    public static long m10635(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0647z3) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m10636(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            ((AbstractC0637x3) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۨ, reason: not valid java name and contains not printable characters */
    public static long m10637(Object obj) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0647z3) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10638(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0647z3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۨ, reason: not valid java name and contains not printable characters */
    public static long m10639(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0647z3) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static long m10640(Object obj) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0647z3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m10641(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0637x3) obj).b();
        }
        return null;
    }

    protected abstract Object b();

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

    AbstractC0637x3(j$.util.c0 c0Var, long j, long j2) {
        super(c0Var, j, j2, 0L, C0088.m8519(C0082.m7979(c0Var), j2));
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(Object obj) {
        long jM10637;
        C0099.m10863(obj);
        long jM10635 = m10635(this);
        long jM10640 = m10640(this);
        if (jM10640 >= jM10635) {
            return false;
        }
        while (true) {
            jM10637 = m10637(this);
            if (jM10640 <= jM10637) {
                break;
            }
            C0083.m8061((j$.util.c0) m10638(this), m10641(this));
            this.d = m10637(this) + 1;
        }
        if (jM10637 >= m10635(this)) {
            return false;
        }
        this.d = jM10637 + 1;
        return C0083.m8061((j$.util.c0) m10638(this), obj);
    }

    @Override // j$.util.c0
    public final void forEachRemaining(Object obj) {
        C0099.m10863(obj);
        long jM10635 = m10635(this);
        long jM10640 = m10640(this);
        if (jM10640 >= jM10635) {
            return;
        }
        long jM10637 = m10637(this);
        if (jM10637 >= jM10635) {
            return;
        }
        if (jM10637 >= jM10640 && C0082.m7979((j$.util.c0) m10638(this)) + jM10637 <= m10639(this)) {
            C0080.m7577((j$.util.c0) m10638(this), obj);
            this.d = m10635(this);
            return;
        }
        while (jM10640 > m10637(this)) {
            C0083.m8061((j$.util.c0) m10638(this), m10641(this));
            this.d = m10637(this) + 1;
        }
        while (m10637(this) < m10635(this)) {
            C0083.m8061((j$.util.c0) m10638(this), obj);
            this.d = m10637(this) + 1;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m10636(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m10634(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        m10636(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return m10634(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        m10636(this, doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return m10634(this, doubleConsumer);
    }
}
