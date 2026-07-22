package j$.util.stream;

import j$.time.zone.C0088;
import j$.util.C0102;
import j$.util.function.C0095;

/* JADX INFO: loaded from: classes3.dex */
final class X extends AbstractC0567j2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.b = i;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9825(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9826(Object obj) {
        if (C0088.m8503() > 0) {
            return ((X) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9827(Object obj, long j) {
        if (C0097.m10823() > 0) {
            ((InterfaceC0597p2) obj).accept(j);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9828(Object obj, double d) {
        if (C0102.m11109() <= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        switch (m9826(this)) {
            case 0:
                m9827(m9825(this), i);
                break;
            default:
                m9828(m9825(this), i);
                break;
        }
    }
}
