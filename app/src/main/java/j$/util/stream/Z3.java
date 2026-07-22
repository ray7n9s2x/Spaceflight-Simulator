package j$.util.stream;

import j$.time.C0092;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import java.io.C0103;
import java.io.C0104;

/* JADX INFO: loaded from: classes3.dex */
final class Z3 extends AbstractC0562i2 {
    boolean b;
    final /* synthetic */ a4 c;

    /* JADX INFO: renamed from: ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9914(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0562i2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9915(Object obj) {
        if (C0102.m11109() < 0) {
            return ((Z3) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9916(Object obj, long j) {
        if (C0103.m11154() < 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static a4 m9917(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((Z3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9918(Object obj) {
        if (C0104.m11196() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z3(a4 a4Var, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.c = a4Var;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m9916(m9914(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0582m2, j$.util.stream.InterfaceC0597p2
    public final void accept(double d) {
        if (m9915(this)) {
            C0092.m8727(m9917(this));
            C0099.m10881(null, d);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0562i2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return !m9915(this) || m9918(m9914(this));
    }
}
