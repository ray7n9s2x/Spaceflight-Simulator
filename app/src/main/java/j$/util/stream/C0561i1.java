package j$.util.stream;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0561i1 extends C0556h1 implements B0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f541short = {2548, 2498, 2501, 2501, 2514, 2521, 2499, 2455, 2500, 2526, 2509, 2514, 2455, 2450, 2515, 2455, 2526, 2500, 2455, 2523, 2514, 2500, 2500, 2455, 2499, 2527, 2518, 2521, 2455, 2513, 2526, 2511, 2514, 2515, 2455, 2500, 2526, 2509, 2514, 2455, 2450, 2515, 3040, 3010, 3010, 3012, 3025, 3029, 2945, 3012, 3033, 3010, 3012, 3012, 3013, 3012, 3013, 2945, 3015, 3016, 3033, 3012, 3013, 2945, 3026, 3016, 3035, 3012, 2945, 3022, 3015, 2945, 2948, 3013, 1297, 1338, 1328, 1396, 1319, 1341, 1326, 1329, 1396, 1393, 1328, 1396, 1341, 1319, 1396, 1336, 1329, 1319, 1319, 1396, 1312, 1340, 1333, 1338, 1396, 1330, 1341, 1324, 1329, 1328, 1396, 1319, 1341, 1326, 1329, 1396, 1393, 1328, 3039, 3064, 3066, 3060, 3059, 3005, 3054, 3060, 3047, 3064, 3005, 3000, 3065, 3005, 3060, 3054, 3005, 3059, 3058, 3049, 3005, 3064, 3052, 3048, 3068, 3057, 3005, 3049, 3058, 3005, 3067, 3060, 3045, 3064, 3065, 3005, 3054, 3060, 3047, 3064, 3005, 3000, 3065, 1636, 1603, 1625, 1643, 1604, 1621, 1608, 1609, 1635, 1602, 1609, 1608, 1647, 1624, 1604, 1601, 1609, 1608, 1631, 1654, 1544, 1609, 1648, 1654, 1544, 1630, 1648};

    /* JADX INFO: renamed from: ۟ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static H0 m10230(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0561i1) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m10231(Object obj) {
        if (C0088.m8503() > 0) {
            return ((C0556h1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m10232(Object obj) {
        if (C0096.m10782() > 0) {
            return ((C0556h1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m10233() {
        if (C0079.m7512() >= 0) {
            return f541short;
        }
        return null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ L0 a() {
        m10230(this);
        return this;
    }

    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final H0 a() {
        int iM10231 = m10231(this);
        int[] iArrM10232 = m10232(this);
        if (iM10231 >= iArrM10232.length) {
            return this;
        }
        throw new IllegalStateException(C0086.m8314(C0097.m10853(m10233(), 0, 42, 2487), new Object[]{C0102.m11105(m10231(this)), C0102.m11105(iArrM10232.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        int[] iArrM10232 = m10232(this);
        if (j != iArrM10232.length) {
            throw new IllegalStateException(C0086.m8314(C0080.m7573(m10233(), 112, 43, 2973), new Object[]{C0106.m11351(j), C0102.m11105(iArrM10232.length)}));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        int iM10231 = m10231(this);
        int[] iArrM10232 = m10232(this);
        if (iM10231 < iArrM10232.length) {
            this.b = 1 + iM10231;
            iArrM10232[iM10231] = i;
            return;
        }
        throw new IllegalStateException(C0086.m8314(C0086.m8291(m10233(), 42, 32, 2977), new Object[]{C0102.m11105(iArrM10232.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
        int iM10231 = m10231(this);
        int[] iArrM10232 = m10232(this);
        if (iM10231 < iArrM10232.length) {
            throw new IllegalStateException(C0086.m8314(C0085.m8236(m10233(), 74, 38, 1364), new Object[]{C0102.m11105(m10231(this)), C0102.m11105(iArrM10232.length)}));
        }
    }

    @Override // j$.util.stream.C0556h1
    public final String toString() {
        int[] iArrM10232 = m10232(this);
        return C0086.m8314(C0102.m11094(m10233(), ModuleDescriptor.MODULE_VERSION, 27, 1581), new Object[]{C0102.m11105(iArrM10232.length - m10231(this)), C0091.m8665(iArrM10232)});
    }
}
