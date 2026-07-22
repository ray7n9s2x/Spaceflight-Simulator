package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.temporal.C0086;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0103;
import java.util.function.C0106;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class F implements K3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9410(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9411(Object obj, int i) {
        if (C0103.m11154() < 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9412() {
        if (C0102.m11109() < 0) {
            return EnumC0543e3.u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m9413(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((F) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9414() {
        if (C0098.m10857() <= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9415(Object obj) {
        if (C0089.m8594() < 0) {
            return ((F) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Supplier m9416(Object obj) {
        if (C0102.m11109() < 0) {
            return ((F) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9417() {
        if (C0095.m9210() > 0) {
            return EnumC0543e3.ORDERED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢ, reason: contains not printable characters */
    public static int m9418(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    F(boolean z, EnumC0548f3 enumC0548f3, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : m9414()) | m9412();
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return m9415(this);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        L3 l3 = (L3) C0106.m11328(m9416(this));
        m9410(abstractC0524b, f0Var, l3);
        Object objM11328 = C0106.m11328(l3);
        return objM11328 != null ? objM11328 : m9413(this);
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return C0086.m8299(new L(this, m9411(m9417(), m9418(abstractC0524b)), abstractC0524b, f0Var));
    }
}
