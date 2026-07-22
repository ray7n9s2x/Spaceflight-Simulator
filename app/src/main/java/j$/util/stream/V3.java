package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.util.concurrent.C0093;

/* JADX INFO: loaded from: classes3.dex */
final class V3 extends AbstractC0572k2 {
    boolean b;
    final /* synthetic */ W3 c;

    /* JADX INFO: renamed from: ۟ۢۤۥۣ, reason: not valid java name and contains not printable characters */
    public static W3 m9796(Object obj) {
        if (C0079.m7512() > 0) {
            return ((V3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m9797(Object obj, long j) {
        if (C0093.m9101() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9798(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۟۠, reason: contains not printable characters */
    public static InterfaceC0597p2 m9799(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9800(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((V3) obj).b;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V3(W3 w3, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.c = w3;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m9797(m9799(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (m9800(this)) {
            C0092.m8727(m9796(this));
            C0090.m8632(null, j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return !m9800(this) || m9798(m9799(this));
    }
}
