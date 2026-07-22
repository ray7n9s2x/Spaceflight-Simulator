package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0634x0 implements K3 {
    final EnumC0629w0 a;
    final Supplier b;

    /* JADX INFO: renamed from: ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10608(Object obj, Object obj2, Object obj3) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10609(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0624v0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m10610() {
        if (C0104.m11196() >= 0) {
            return EnumC0543e3.u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۡ۠, reason: contains not printable characters */
    public static int m10611() {
        if (C0085.m8230() >= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ۟۟, reason: contains not printable characters */
    public static Supplier m10612(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0634x0) obj).b;
        }
        return null;
    }

    C0634x0(EnumC0548f3 enumC0548f3, EnumC0629w0 enumC0629w0, Supplier supplier) {
        this.a = enumC0629w0;
        this.b = supplier;
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return m10610() | m10611();
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        AbstractC0624v0 abstractC0624v0 = (AbstractC0624v0) C0106.m11328(m10612(this));
        m10608(abstractC0524b, f0Var, abstractC0624v0);
        return C0079.m7502(m10609(abstractC0624v0));
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        return (Boolean) C0086.m8299(new C0639y0(this, abstractC0524b, f0Var));
    }
}
