package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.Iterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
class U2 extends Y2 implements IntConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f520short = {2423, 2364, 2417, 2348, 2415, 2413, 2400, 2400, 2405, 2402, 2411, 2348, 2399, 2428, 2405, 2402, 2409, 2408, 2382, 2425, 2410, 2410, 2409, 2430, 2338, 2371, 2410, 2373, 2402, 2424, 2338, 2410, 2403, 2430, 2377, 2413, 2415, 2404, 2340, 2383, 2403, 2402, 2431, 2425, 2401, 2409, 2430, 2341, 3032, 2958, 2982, 2961, 2968, 2963, 2970, 2953, 2965, 3008, 3032, 2969, 3025, 3037, 2974, 2965, 2952, 2963, 2966, 2958, 3008, 3032, 2969, 2976, 3032, 2958, 632, 558, 518, 561, 568, 563, 570, 553, 565, 608, 632, 569, 625, 637, 574, 565, 552, 563, 566, 558, 608, 632, 569, 512, 632, 558, 627, 627, 627};

    /* JADX INFO: renamed from: ۟۠ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m9771(Object obj, Object obj2) {
        if (C0097.m10823() > 0) {
            ((Y2) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m9772(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((Y2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m9773(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((Y2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9774() {
        if (C0089.m8594() < 0) {
            return f520short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m9775(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9776() {
        if (C0088.m8503() > 0) {
            return N3.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9777(Object obj, Object obj2) {
        if (C0101.m11044() <= 0) {
            N3.a((Class) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static j$.util.W m9778(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((U2) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤۡ, reason: contains not printable characters */
    public static void m9779(Object obj) {
        if (C0080.m7553() >= 0) {
            ((Y2) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9780(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.Y2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        for (int i3 = i; i3 < i2; i3++) {
            C0105.m11259(intConsumer, iArr[i3]);
        }
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    public /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m9778(this);
    }

    @Override // j$.util.stream.Y2
    protected final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            m9771(this, (IntConsumer) consumer);
        } else {
            if (m9776()) {
                m9777(C0092.m8727(this), C0103.m11135(m9774(), 0, 48, 2316));
                throw null;
            }
            C0101.m11051((T2) m9778(this), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    protected final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object c(int i) {
        return new int[i];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        m9779(this);
        int[] iArr = (int[]) m9773(this);
        int iM9775 = m9775(this);
        this.b = iM9775 + 1;
        iArr[iM9775] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0080.m7560(m9778(this));
    }

    public j$.util.W y() {
        return new T2(this, 0, m9780(this), 0, m9775(this));
    }

    public final String toString() {
        int[] iArr = (int[]) m9772(this);
        if (iArr.length < 200) {
            return C0086.m8314(C0099.m10897(m9774(), 48, 26, 3069), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(iArr.length), C0102.m11105(m9780(this)), C0091.m8665(iArr)});
        }
        return C0086.m8314(C0095.m9204(m9774(), 74, 29, 605), new Object[]{C0084.m8109(C0092.m8727(this)), C0102.m11105(iArr.length), C0102.m11105(m9780(this)), C0091.m8665(C0099.m10871(iArr, 200))});
    }
}
