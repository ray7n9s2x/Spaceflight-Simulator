package j$.util.stream;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.format.C0083;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.io.C0104;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0584n extends AbstractC0577l2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0584n(AbstractC0524b abstractC0524b, InterfaceC0597p2 interfaceC0597p2, int i) {
        super(interfaceC0597p2);
        this.b = i;
        this.c = abstractC0524b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0584n(InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.b = 0;
    }

    /* JADX INFO: renamed from: ۟۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m10361(Object obj, long j) {
        if (C0102.m11109() <= 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m10362(Object obj) {
        if (C0099.m10878() < 0) {
            return ((C0584n) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m10363(Object obj, long j) {
        if (C0102.m11109() <= 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m10364(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0584n) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m10365(Object obj, double d) {
        if (C0096.m10782() > 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m10366(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((C0613t) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m10367(Object obj, int i) {
        if (C0089.m8594() < 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static void m10368(Object obj) {
        if (C0093.m9101() >= 0) {
            ((InterfaceC0597p2) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m10369(Object obj) {
        if (C0104.m11196() > 0) {
            return ((W) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m10370(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((C0565j0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۧۦ, reason: contains not printable characters */
    public static InterfaceC0597p2 m10371(Object obj) {
        if (C0093.m9101() > 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۧ, reason: contains not printable characters */
    public static Object m10372(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((C0638y) obj).n;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public void k() {
        switch (m10362(this)) {
            case 0:
                this.c = null;
                m10368(m10371(this));
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public void l(long j) {
        switch (m10362(this)) {
            case 0:
                this.c = new HashSet();
                m10361(m10371(this), -1L);
                break;
            case 1:
            default:
                super.l(j);
                break;
            case 2:
                m10361(m10371(this), -1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (m10362(this)) {
            case 0:
                if (!C0088.m8510((HashSet) m10364(this), obj)) {
                    C0091.m8677((HashSet) m10364(this), obj);
                    C0083.m8026(m10371(this), obj);
                }
                break;
            case 1:
                C0083.m8026((Consumer) m10366((C0613t) m10364(this)), obj);
                C0083.m8026(m10371(this), obj);
                break;
            case 2:
                if (C0086.m8320((Predicate) m10366((C0613t) m10364(this)), obj)) {
                    C0083.m8026(m10371(this), obj);
                }
                break;
            case 3:
                C0083.m8026(m10371(this), C0087.m8486((Function) m10366((C0613t) m10364(this)), obj));
                break;
            case 4:
                m10367(m10371(this), C0088.m8537((ToIntFunction) m10369((W) m10364(this)), obj));
                break;
            case 5:
                m10363(m10371(this), C0094.m9161((ToLongFunction) m10370((C0565j0) m10364(this)), obj));
                break;
            default:
                m10365(m10371(this), C0100.m10998((ToDoubleFunction) m10372((C0638y) m10364(this)), obj));
                break;
        }
    }
}
