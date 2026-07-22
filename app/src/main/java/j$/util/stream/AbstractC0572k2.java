package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0572k2 implements InterfaceC0592o2 {
    protected final InterfaceC0597p2 a;

    /* JADX INFO: renamed from: ۟ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10285(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10286(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m10287(Object obj, long j) {
        if (C0098.m10857() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۨۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m10288(Object obj) {
        if (C0093.m9101() > 0) {
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

    public AbstractC0572k2(InterfaceC0597p2 interfaceC0597p2) {
        this.a = (InterfaceC0597p2) C0099.m10863(interfaceC0597p2);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        m10287(m10285(this), j);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void k() {
        m10288(m10285(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public boolean n() {
        return m10286(m10285(this));
    }
}
