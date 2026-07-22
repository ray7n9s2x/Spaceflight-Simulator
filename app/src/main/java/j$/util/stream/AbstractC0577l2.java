package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0577l2 implements InterfaceC0597p2 {
    protected final InterfaceC0597p2 a;

    /* JADX INFO: renamed from: ۟۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m10309(Object obj, long j) {
        if (C0095.m9210() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10310(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10311(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m10312(Object obj) {
        if (C0083.m8022() < 0) {
            ((InterfaceC0597p2) obj).k();
        }
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

    public AbstractC0577l2(InterfaceC0597p2 interfaceC0597p2) {
        this.a = (InterfaceC0597p2) C0099.m10863(interfaceC0597p2);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        m10309(m10310(this), j);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void k() {
        m10312(m10310(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public boolean n() {
        return m10311(m10310(this));
    }
}
