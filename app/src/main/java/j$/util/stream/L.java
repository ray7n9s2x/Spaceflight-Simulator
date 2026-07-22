package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.util.C0101;
import j$.util.C0102;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.C0106;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class L extends AbstractC0529c {
    private final F j;
    private final boolean k;

    /* JADX INFO: renamed from: ۟۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m9537(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0529c) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m9538(Object obj) {
        if (C0098.m10857() < 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m9539(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9540(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((AbstractC0529c) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m9541(Object obj, Object obj2) {
        if (C0083.m8022() < 0) {
            ((AbstractC0529c) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static F m9542(Object obj) {
        if (C0084.m8116() > 0) {
            return ((L) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9543(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m9544(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((F) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Predicate m9545(Object obj) {
        if (C0082.m7983() < 0) {
            return ((F) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m9546(Object obj) {
        if (C0101.m11044() < 0) {
            ((AbstractC0529c) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۣۦۤۨ, reason: not valid java name and contains not printable characters */
    public static Supplier m9547(Object obj) {
        if (C0104.m11196() > 0) {
            return ((F) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static AbstractC0539e m9548(Object obj) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۡ, reason: contains not printable characters */
    public static boolean m9549(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((L) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9550(Object obj, Object obj2, Object obj3) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    L(F f, boolean z, AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        super(abstractC0524b, f0Var);
        this.k = z;
        this.j = f;
    }

    L(L l, j$.util.f0 f0Var) {
        super(l, f0Var);
        this.k = m9549(l);
        this.j = m9542(l);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new L(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0529c
    protected final Object j() {
        return m9544(m9542(this));
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        AbstractC0524b abstractC0524bM9538 = m9538(this);
        L3 l3 = (L3) C0106.m11328(m9547(m9542(this)));
        m9550(abstractC0524bM9538, m9543(this), l3);
        Object objM11328 = C0106.m11328(l3);
        if (!m9549(this)) {
            if (objM11328 != null) {
                AtomicReference atomicReferenceM9537 = m9537(this);
                while (!C0091.m8661(atomicReferenceM9537, null, objM11328) && C0102.m11096(atomicReferenceM9537) == null) {
                }
            }
            return null;
        }
        if (objM11328 == null) {
            return null;
        }
        AbstractC0539e abstractC0539e = this;
        while (true) {
            if (abstractC0539e != null) {
                AbstractC0539e abstractC0539e2 = (AbstractC0539e) C0092.m8728(abstractC0539e);
                if (abstractC0539e2 != null && m9539(abstractC0539e2) != abstractC0539e) {
                    m9546(this);
                    break;
                }
                abstractC0539e = abstractC0539e2;
            } else {
                AtomicReference atomicReferenceM95372 = m9537(this);
                while (!C0091.m8661(atomicReferenceM95372, null, objM11328) && C0102.m11096(atomicReferenceM95372) == null) {
                }
            }
        }
        return objM11328;
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (m9549(this)) {
            L l = (L) m9539(this);
            L l2 = null;
            while (true) {
                if (l != l2) {
                    Object objM9540 = m9540(l);
                    if (objM9540 != null && C0086.m8320(m9545(m9542(this)), objM9540)) {
                        m9541(this, objM9540);
                        AbstractC0539e abstractC0539e = this;
                        while (true) {
                            if (abstractC0539e != null) {
                                AbstractC0539e abstractC0539e2 = (AbstractC0539e) C0092.m8728(abstractC0539e);
                                if (abstractC0539e2 != null && m9539(abstractC0539e2) != abstractC0539e) {
                                    m9546(this);
                                    break;
                                }
                                abstractC0539e = abstractC0539e2;
                            } else {
                                AtomicReference atomicReferenceM9537 = m9537(this);
                                while (!C0091.m8661(atomicReferenceM9537, null, objM9540) && C0102.m11096(atomicReferenceM9537) == null) {
                                }
                            }
                        }
                    } else {
                        l2 = l;
                        l = (L) m9548(this);
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
