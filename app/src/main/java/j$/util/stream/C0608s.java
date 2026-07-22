package j$.util.stream;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.util.C0100;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0608s extends AbstractC0562i2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0524b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0608s(AbstractC0524b abstractC0524b, InterfaceC0597p2 interfaceC0597p2, int i) {
        super(interfaceC0597p2);
        this.b = i;
        this.c = abstractC0524b;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m10494(Object obj, long j) {
        if (C0083.m8022() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m10495(Object obj) {
        if (C0094.m9148() > 0) {
            return ((C0638y) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10496(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((C0608s) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m10497(Object obj) {
        if (C0100.m10983() > 0) {
            return ((C0608s) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m10498(Object obj, double d) {
        if (C0105.m11264() >= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10499(Object obj) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۨ, reason: contains not printable characters */
    public static Object m10500(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((C0613t) obj).n;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        switch (m10497(this)) {
            case 4:
                m10494(m10499(this), -1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        switch (m10497(this)) {
            case 0:
                C0083.m8026(m10499(this), C0095.m9176((DoubleFunction) m10500((C0613t) m10496(this)), d));
                return;
            case 1:
                C0092.m8727((C0618u) m10496(this));
                C0105.m11249(null, d);
                throw null;
            case 2:
                C0092.m8727((C0623v) m10496(this));
                C0091.m8660(null, d);
                throw null;
            case 3:
                C0092.m8727((C0628w) m10496(this));
                C0095.m9208(null, d);
                throw null;
            case 4:
                C0092.m8727((C0618u) m10496(this));
                C0099.m10881(null, d);
                throw null;
            default:
                C0090.m8634((DoubleConsumer) m10495((C0638y) m10496(this)), d);
                m10498(m10499(this), d);
                return;
        }
    }
}
