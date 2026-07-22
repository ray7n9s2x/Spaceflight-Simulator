package j$.util.stream;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0605r1 extends C0601q1 implements C0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f546short = {2012, 2026, 2029, 2029, 2042, 2033, 2027, 1983, 2028, 2038, 2021, 2042, 1983, 1978, 2043, 1983, 2038, 2028, 1983, 2035, 2042, 2028, 2028, 1983, 2027, 2039, 2046, 2033, 1983, 2041, 2038, 2023, 2042, 2043, 1983, 2028, 2038, 2021, 2042, 1983, 1978, 2043, 1456, 1426, 1426, 1428, 1409, 1413, 1489, 1428, 1417, 1426, 1428, 1428, 1429, 1428, 1429, 1489, 1431, 1432, 1417, 1428, 1429, 1489, 1410, 1432, 1419, 1428, 1489, 1438, 1431, 1489, 1492, 1429, 319, 276, 286, 346, 265, 275, 256, 287, 346, 351, 286, 346, 275, 265, 346, 278, 287, 265, 265, 346, 270, 274, 283, 276, 346, 284, 275, 258, 287, 286, 346, 265, 275, 256, 287, 346, 351, 286, 3086, 3113, 3115, 3109, 3106, 3180, 3135, 3109, 3126, 3113, 3180, 3177, 3112, 3180, 3109, 3135, 3180, 3106, 3107, 3128, 3180, 3113, 3133, 3129, 3117, 3104, 3180, 3128, 3107, 3180, 3114, 3109, 3124, 3113, 3112, 3180, 3135, 3109, 3126, 3113, 3180, 3177, 3112, 962, 993, 992, 1001, 968, 999, 1014, 1003, 1002, 960, 993, 1002, 1003, 972, 1019, 999, 994, 1002, 1003, 1020, 981, 939, 1002, 979, 981, 939, 1021, 979};

    /* JADX INFO: renamed from: ۟ۡ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m10461() {
        if (C0104.m11196() > 0) {
            return f546short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static long[] m10462(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((C0601q1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int m10463(Object obj) {
        if (C0089.m8594() < 0) {
            return ((C0601q1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static J0 m10464(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((C0605r1) obj).a();
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0095.m9221(this, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0592o2
    public final /* synthetic */ void j(Long l) {
        C0087.m8445(this, l);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ L0 a() {
        m10464(this);
        return this;
    }

    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final J0 a() {
        int iM10463 = m10463(this);
        long[] jArrM10462 = m10462(this);
        if (iM10463 >= jArrM10462.length) {
            return this;
        }
        throw new IllegalStateException(C0086.m8314(C0080.m7573(m10461(), 0, 42, 1951), new Object[]{C0102.m11105(m10463(this)), C0102.m11105(jArrM10462.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        long[] jArrM10462 = m10462(this);
        if (j != jArrM10462.length) {
            throw new IllegalStateException(C0086.m8314(C0096.m10776(m10461(), 112, 43, 3148), new Object[]{C0106.m11351(j), C0102.m11105(jArrM10462.length)}));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0597p2, j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        int iM10463 = m10463(this);
        long[] jArrM10462 = m10462(this);
        if (iM10463 < jArrM10462.length) {
            this.b = 1 + iM10463;
            jArrM10462[iM10463] = j;
            return;
        }
        throw new IllegalStateException(C0086.m8314(C0105.m11310(m10461(), 42, 32, 1521), new Object[]{C0102.m11105(jArrM10462.length)}));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public final void k() {
        int iM10463 = m10463(this);
        long[] jArrM10462 = m10462(this);
        if (iM10463 < jArrM10462.length) {
            throw new IllegalStateException(C0086.m8314(C0088.m8518(m10461(), 74, 38, 378), new Object[]{C0102.m11105(m10463(this)), C0102.m11105(jArrM10462.length)}));
        }
    }

    @Override // j$.util.stream.C0601q1
    public final String toString() {
        long[] jArrM10462 = m10462(this);
        return C0086.m8314(C0092.m8731(m10461(), ModuleDescriptor.MODULE_VERSION, 28, 910), new Object[]{C0102.m11105(jArrM10462.length - m10463(this)), C0106.m11353(jArrM10462)});
    }
}
