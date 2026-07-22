package j$.util.stream;

import j$.time.C0091;
import java.io.C0103;
import java.io.C0104;

/* JADX INFO: loaded from: classes3.dex */
final class H1 extends AbstractC0644z0 {
    public final /* synthetic */ int h;

    public /* synthetic */ H1(int i) {
        this.h = i;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9467(Object obj) {
        if (C0104.m11196() > 0) {
            return ((H1) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int m9468() {
        if (C0096.m10782() >= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۥۧ, reason: contains not printable characters */
    public static int m9469(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۥۦ, reason: contains not printable characters */
    public static boolean m9470(Object obj, int i) {
        if (C0091.m8708() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9471() {
        if (C0103.m11154() <= 0) {
            return EnumC0543e3.SIZED;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        switch (m9467(this)) {
            case 0:
                return new Z1();
            case 1:
                return new X1();
            case 2:
                return new C0522a2();
            default:
                return new Y1();
        }
    }

    @Override // j$.util.stream.AbstractC0644z0, j$.util.stream.K3
    public final Object b(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        switch (m9467(this)) {
            case 0:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            case 1:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            case 2:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            default:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
        }
        return (Long) super.b(abstractC0524b, f0Var);
    }

    @Override // j$.util.stream.AbstractC0644z0, j$.util.stream.K3
    public final Object c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        switch (m9467(this)) {
            case 0:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            case 1:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            case 2:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
            default:
                if (!m9470(m9471(), m9469(abstractC0524b))) {
                }
                break;
        }
        return (Long) super.c(abstractC0524b, f0Var);
    }

    @Override // j$.util.stream.AbstractC0644z0, j$.util.stream.K3
    public final int d() {
        switch (m9467(this)) {
        }
        return m9468();
    }
}
