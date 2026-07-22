package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.concurrent.C0093;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0550g0 extends AbstractC0572k2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0524b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0550g0(AbstractC0524b abstractC0524b, InterfaceC0597p2 interfaceC0597p2, int i) {
        super(interfaceC0597p2);
        this.b = i;
        this.c = abstractC0524b;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10116(Object obj) {
        if (C0098.m10857() < 0) {
            return ((C0550g0) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m10117(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0565j0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m10118(Object obj, long j) {
        if (C0098.m10857() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m10119(Object obj, long j) {
        if (C0079.m7512() >= 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m10120(Object obj) {
        if (C0105.m11264() > 0) {
            return ((C0550g0) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m10121(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((C0613t) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10122(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0572k2, j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        switch (m10120(this)) {
            case 4:
                m10118(m10122(this), -1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (m10120(this)) {
            case 0:
                C0083.m8026(m10122(this), C0093.m9067((LongFunction) m10121((C0613t) m10116(this)), j));
                return;
            case 1:
                C0092.m8727((C0628w) m10116(this));
                C0087.m8447(null, j);
                throw null;
            case 2:
                C0092.m8727((C0623v) m10116(this));
                C0104.m11231(null, j);
                throw null;
            case 3:
                C0092.m8727((C0618u) m10116(this));
                C0087.m8449(null, j);
                throw null;
            case 4:
                C0092.m8727((C0628w) m10116(this));
                C0090.m8632(null, j);
                throw null;
            default:
                C0088.m8521((LongConsumer) m10117((C0565j0) m10116(this)), j);
                m10119(m10122(this), j);
                return;
        }
    }
}
