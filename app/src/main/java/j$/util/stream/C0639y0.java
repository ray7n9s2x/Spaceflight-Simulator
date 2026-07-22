package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.C0106;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0639y0 extends AbstractC0529c {
    private final C0634x0 j;

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10643(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0629w0 m10644(Object obj) {
        if (C0080.m7553() > 0) {
            return ((C0634x0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10645(Object obj) {
        if (C0093.m9101() > 0) {
            return ((EnumC0629w0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m10646(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0529c) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10647(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0624v0) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10648(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10649(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static Supplier m10650(Object obj) {
        if (C0106.m11345() < 0) {
            return ((C0634x0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static C0634x0 m10651(Object obj) {
        if (C0096.m10782() > 0) {
            return ((C0639y0) obj).j;
        }
        return null;
    }

    C0639y0(C0634x0 c0634x0, AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        super(abstractC0524b, f0Var);
        this.j = c0634x0;
    }

    C0639y0(C0639y0 c0639y0, j$.util.f0 f0Var) {
        super(c0639y0, f0Var);
        this.j = m10651(c0639y0);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new C0639y0(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        AbstractC0524b abstractC0524bM10643 = m10643(this);
        AbstractC0624v0 abstractC0624v0 = (AbstractC0624v0) C0106.m11328(m10650(m10651(this)));
        m10649(abstractC0524bM10643, m10648(this), abstractC0624v0);
        boolean zM10647 = m10647(abstractC0624v0);
        if (zM10647 == m10645(m10644(m10651(this)))) {
            Boolean boolM7502 = C0079.m7502(zM10647);
            AtomicReference atomicReferenceM10646 = m10646(this);
            while (!C0091.m8661(atomicReferenceM10646, null, boolM7502) && C0102.m11096(atomicReferenceM10646) == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final Object j() {
        return C0079.m7502(!m10645(m10644(m10651(this))));
    }
}
