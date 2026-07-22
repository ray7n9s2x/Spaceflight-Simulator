package j$.util.stream;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class Z0 extends Y0 implements A0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f526short = {1514, 1500, 1499, 1499, 1484, 1479, 1501, 1417, 1498, 1472, 1491, 1484, 1417, 1420, 1485, 1417, 1472, 1498, 1417, 1477, 1484, 1498, 1498, 1417, 1501, 1473, 1480, 1479, 1417, 1487, 1472, 1489, 1484, 1485, 1417, 1498, 1472, 1491, 1484, 1417, 1420, 1485, 1885, 1919, 1919, 1913, 1900, 1896, 1852, 1913, 1892, 1919, 1913, 1913, 1912, 1913, 1912, 1852, 1914, 1909, 1892, 1913, 1912, 1852, 1903, 1909, 1894, 1913, 1852, 1907, 1914, 1852, 1849, 1912, 1750, 1789, 1783, 1715, 1760, 1786, 1769, 1782, 1715, 1718, 1783, 1715, 1786, 1760, 1715, 1791, 1782, 1760, 1760, 1715, 1767, 1787, 1778, 1789, 1715, 1781, 1786, 1771, 1782, 1783, 1715, 1760, 1786, 1769, 1782, 1715, 1718, 1783, 825, 798, 796, 786, 789, 859, 776, 786, 769, 798, 859, 862, 799, 859, 786, 776, 859, 789, 788, 783, 859, 798, 778, 782, 794, 791, 859, 783, 788, 859, 797, 786, 771, 798, 799, 859, 776, 786, 769, 798, 859, 862, 799, 2712, 2739, 2729, 2750, 2736, 2745, 2714, 2741, 2724, 2745, 2744, 2706, 2739, 2744, 2745, 2718, 2729, 2741, 2736, 2744, 2745, 2734, 2695, 2809, 2744, 2689, 2695, 2809, 2735, 2689};

    /* JADX INFO: renamed from: ۟ۡ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m9899(Object obj) {
        if (C0080.m7553() > 0) {
            return ((Y0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۨ, reason: not valid java name and contains not printable characters */
    public static F0 m9900(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((Z0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣ۟, reason: contains not printable characters */
    public static short[] m9901() {
        if (C0103.m11154() < 0) {
            return f526short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static double[] m9902(Object obj) {
        if (C0079.m7512() > 0) {
            return ((Y0) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(int i) {
        C0089.m8569();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        C0092.m8759();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0105.m11261(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ L0 a() {
        m9900(this);
        return this;
    }

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final F0 a() {
        int iM9899 = m9899(this);
        double[] dArrM9902 = m9902(this);
        if (iM9899 >= dArrM9902.length) {
            return this;
        }
        throw new IllegalStateException(C0086.m8314(C0102.m11094(m9901(), 0, 42, 1449), new Object[]{C0102.m11105(m9899(this)), C0102.m11105(dArrM9902.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        double[] dArrM9902 = m9902(this);
        if (j != dArrM9902.length) {
            throw new IllegalStateException(C0086.m8314(C0088.m8518(m9901(), 112, 43, 891), new Object[]{C0106.m11351(j), C0102.m11105(dArrM9902.length)}));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        int iM9899 = m9899(this);
        double[] dArrM9902 = m9902(this);
        if (iM9899 < dArrM9902.length) {
            this.b = 1 + iM9899;
            dArrM9902[iM9899] = d;
            return;
        }
        throw new IllegalStateException(C0086.m8314(C0096.m10776(m9901(), 42, 32, 1820), new Object[]{C0102.m11105(dArrM9902.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
        int iM9899 = m9899(this);
        double[] dArrM9902 = m9902(this);
        if (iM9899 < dArrM9902.length) {
            throw new IllegalStateException(C0086.m8314(C0097.m10853(m9901(), 74, 38, 1683), new Object[]{C0102.m11105(m9899(this)), C0102.m11105(dArrM9902.length)}));
        }
    }

    @Override // j$.util.stream.Y0
    public final String toString() {
        double[] dArrM9902 = m9902(this);
        return C0086.m8314(C0079.m7503(m9901(), ModuleDescriptor.MODULE_VERSION, 30, 2780), new Object[]{C0102.m11105(dArrM9902.length - m9899(this)), C0089.m8574(dArrM9902)});
    }
}
