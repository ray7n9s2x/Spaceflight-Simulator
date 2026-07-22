package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.C0101;
import java.io.C0104;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0567j2 implements InterfaceC0587n2 {
    protected final InterfaceC0597p2 a;

    /* JADX INFO: renamed from: ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10255(Object obj) {
        if (C0079.m7512() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m10256(Object obj, long j) {
        if (C0082.m7983() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10257(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m10258(Object obj) {
        if (C0104.m11196() > 0) {
            ((InterfaceC0597p2) obj).k();
        }
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

    public AbstractC0567j2(InterfaceC0597p2 interfaceC0597p2) {
        this.a = (InterfaceC0597p2) C0099.m10863(interfaceC0597p2);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        m10256(m10257(this), j);
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public void k() {
        m10258(m10257(this));
    }

    @Override // j$.util.stream.InterfaceC0597p2
    public boolean n() {
        return m10255(m10257(this));
    }
}
