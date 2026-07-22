package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0562i2 implements InterfaceC0582m2 {
    protected final InterfaceC0597p2 a;

    /* JADX INFO: renamed from: ۟۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m10234(Object obj, long j) {
        if (C0103.m11154() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static void m10235(Object obj) {
        if (C0097.m10823() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10236(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۥۦ, reason: contains not printable characters */
    public static InterfaceC0597p2 m10237(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((AbstractC0562i2) obj).a;
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

    @Override // j$.util.stream.InterfaceC0582m2
    public final /* synthetic */ void p(Double d) {
        C0083.m8041(this, d);
    }

    public AbstractC0562i2(InterfaceC0597p2 interfaceC0597p2) {
        this.a = (InterfaceC0597p2) C0099.m10863(interfaceC0597p2);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        m10234(m10237(this), j);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void k() {
        m10235(m10237(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public boolean n() {
        return m10236(m10237(this));
    }
}
