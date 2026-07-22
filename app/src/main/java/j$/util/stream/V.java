package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class V extends AbstractC0567j2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0524b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC0524b abstractC0524b, InterfaceC0597p2 interfaceC0597p2, int i) {
        super(interfaceC0597p2);
        this.b = i;
        this.c = abstractC0524b;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m9788(Object obj, long j) {
        if (C0094.m9148() >= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m9789(Object obj) {
        if (C0088.m8503() > 0) {
            return ((V) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m9790(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0613t) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9791(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9792(Object obj) {
        if (C0079.m7512() > 0) {
            return ((V) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m9793(Object obj, int i) {
        if (C0093.m9101() >= 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۧۨۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m9794(Object obj) {
        if (C0095.m9210() > 0) {
            return ((W) obj).n;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        switch (m9789(this)) {
            case 5:
                m9788(m9791(this), -1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        switch (m9789(this)) {
            case 0:
                C0083.m8026(m9791(this), C0095.m9220((IntFunction) m9790((C0613t) m9792(this)), i));
                return;
            case 1:
                C0105.m11259((IntConsumer) m9794((W) m9792(this)), i);
                m9793(m9791(this), i);
                return;
            case 2:
                C0092.m8727((C0623v) m9792(this));
                C0099.m10877(null, i);
                throw null;
            case 3:
                C0092.m8727((C0628w) m9792(this));
                C0099.m10919(null, i);
                throw null;
            case 4:
                C0092.m8727((C0618u) m9792(this));
                C0101.m11043(null, i);
                throw null;
            default:
                if (C0085.m8224((IntPredicate) m9794((W) m9792(this)), i)) {
                    m9793(m9791(this), i);
                    return;
                }
                return;
        }
    }
}
