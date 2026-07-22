package j$.util.stream;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0551g1 extends O0 implements D0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f537short = {2025, 2015, 2008, 2008, 1999, 1988, 2014, 1930, 2009, 1987, 2000, 1999, 1930, 1935, 1998, 1930, 1987, 2009, 1930, 1990, 1999, 2009, 2009, 1930, 2014, 1986, 1995, 1988, 1930, 1996, 1987, 2002, 1999, 1998, 1930, 2009, 1987, 2000, 1999, 1930, 1935, 1998, 3072, 3106, 3106, 3108, 3121, 3125, 3169, 3108, 3129, 3106, 3108, 3108, 3109, 3108, 3109, 3169, 3111, 3112, 3129, 3108, 3109, 3169, 3122, 3112, 3131, 3108, 3169, 3118, 3111, 3169, 3172, 3109, 459, 480, 490, 430, 509, 487, 500, 491, 430, 427, 490, 430, 487, 509, 430, 482, 491, 509, 509, 430, 506, 486, 495, 480, 430, 488, 487, 502, 491, 490, 430, 509, 487, 500, 491, 430, 427, 490, 2682, 2653, 2655, 2641, 2646, 2584, 2635, 2641, 2626, 2653, 2584, 2589, 2652, 2584, 2641, 2635, 2584, 2646, 2647, 2636, 2584, 2653, 2633, 2637, 2649, 2644, 2584, 2636, 2647, 2584, 2654, 2641, 2624, 2653, 2652, 2584, 2635, 2641, 2626, 2653, 2584, 2589, 2652, 2529, 2510, 2527, 2498, 2499, 2537, 2504, 2499, 2498, 2533, 2514, 2510, 2507, 2499, 2498, 2517, 2556, 2434, 2499, 2554, 2556, 2434, 2516, 2554};

    /* JADX INFO: renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m10123(Object obj) {
        if (C0082.m7983() < 0) {
            return ((O0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m10124() {
        if (C0102.m11109() <= 0) {
            return f537short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m10125(Object obj) {
        if (C0082.m7983() < 0) {
            return ((O0) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ void accept(double d) {
        C0087.m8446();
        throw null;
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        int iM10123 = m10123(this);
        Object[] objArrM10125 = m10125(this);
        if (iM10123 >= objArrM10125.length) {
            return this;
        }
        throw new IllegalStateException(C0086.m8314(C0100.m10962(m10124(), 0, 42, 1962), new Object[]{C0102.m11105(m10123(this)), C0102.m11105(objArrM10125.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        Object[] objArrM10125 = m10125(this);
        if (j != objArrM10125.length) {
            throw new IllegalStateException(C0086.m8314(C0104.m11206(m10124(), 112, 43, 2616), new Object[]{C0106.m11351(j), C0102.m11105(objArrM10125.length)}));
        }
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int iM10123 = m10123(this);
        Object[] objArrM10125 = m10125(this);
        if (iM10123 < objArrM10125.length) {
            this.b = 1 + iM10123;
            objArrM10125[iM10123] = obj;
            return;
        }
        throw new IllegalStateException(C0086.m8314(C0084.m8120(m10124(), 42, 32, 3137), new Object[]{C0102.m11105(objArrM10125.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
        int iM10123 = m10123(this);
        Object[] objArrM10125 = m10125(this);
        if (iM10123 < objArrM10125.length) {
            throw new IllegalStateException(C0086.m8314(C0104.m11206(m10124(), 74, 38, 398), new Object[]{C0102.m11105(m10123(this)), C0102.m11105(objArrM10125.length)}));
        }
    }

    @Override // j$.util.stream.O0
    public final String toString() {
        Object[] objArrM10125 = m10125(this);
        return C0086.m8314(C0085.m8236(m10124(), ModuleDescriptor.MODULE_VERSION, 24, 2471), new Object[]{C0102.m11105(objArrM10125.length - m10123(this)), C0094.m9135(objArrM10125)});
    }
}
