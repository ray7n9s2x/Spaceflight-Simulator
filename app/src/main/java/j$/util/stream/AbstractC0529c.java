package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0529c extends AbstractC0539e {
    protected final AtomicReference h;
    protected volatile boolean i;

    /* JADX INFO: renamed from: ۟۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10020(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10021(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0529c) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static long m10022(Object obj) {
        if (C0090.m8624() > 0) {
            return ((AbstractC0539e) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static long m10023(long j) {
        if (C0105.m11264() >= 0) {
            return AbstractC0539e.g(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10024(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((AbstractC0539e) obj).e((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10025(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m10026(Object obj, Object obj2) {
        if (C0087.m8458() < 0) {
            ((AbstractC0529c) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m10027(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0529c) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m10028(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0529c) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m10029(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((AbstractC0529c) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m10030(Object obj) {
        if (C0097.m10823() > 0) {
            ((AbstractC0529c) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۡۥ, reason: contains not printable characters */
    public static Object m10031(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((AbstractC0539e) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10032(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0539e) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10033(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    protected abstract Object j();

    protected AbstractC0529c(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        super(abstractC0524b, f0Var);
        this.h = new AtomicReference(null);
    }

    protected AbstractC0529c(AbstractC0529c abstractC0529c, j$.util.f0 f0Var) {
        super(abstractC0529c, f0Var);
        this.h = m10028(abstractC0529c);
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objM11096;
        j$.util.f0 f0VarM7517;
        j$.util.f0 f0VarM10033 = m10033(this);
        long jM7979 = C0082.m7979(f0VarM10033);
        long jM10022 = m10022(this);
        if (jM10022 == 0) {
            jM10022 = m10023(jM7979);
            this.c = jM10022;
        }
        AtomicReference atomicReferenceM10028 = m10028(this);
        boolean z = false;
        AbstractC0529c abstractC0529c = this;
        while (true) {
            objM11096 = C0102.m11096(atomicReferenceM10028);
            if (objM11096 != null) {
                break;
            }
            boolean zM10021 = m10021(abstractC0529c);
            if (!zM10021) {
                CountedCompleter countedCompleterM8728 = C0092.m8728(abstractC0529c);
                while (true) {
                    AbstractC0529c abstractC0529c2 = (AbstractC0529c) ((AbstractC0539e) countedCompleterM8728);
                    if (zM10021 || abstractC0529c2 == null) {
                        break;
                    }
                    zM10021 = m10021(abstractC0529c2);
                    countedCompleterM8728 = C0092.m8728(abstractC0529c2);
                }
            }
            if (zM10021) {
                objM11096 = m10029(abstractC0529c);
                break;
            }
            if (jM7979 <= jM10022 || (f0VarM7517 = C0079.m7517(f0VarM10033)) == null) {
                break;
            }
            AbstractC0529c abstractC0529c3 = (AbstractC0529c) m10024(abstractC0529c, f0VarM7517);
            abstractC0529c.d = abstractC0529c3;
            AbstractC0529c abstractC0529c4 = (AbstractC0529c) m10024(abstractC0529c, f0VarM10033);
            abstractC0529c.e = abstractC0529c4;
            C0105.m11270(abstractC0529c, 1);
            if (z) {
                f0VarM10033 = f0VarM7517;
                abstractC0529c = abstractC0529c3;
                abstractC0529c3 = abstractC0529c4;
            } else {
                abstractC0529c = abstractC0529c4;
            }
            z = !z;
            C0096.m10779(abstractC0529c3);
            jM7979 = C0082.m7979(f0VarM10033);
        }
        objM11096 = m10031(abstractC0529c);
        m10026(abstractC0529c, objM11096);
        C0092.m8734(abstractC0529c);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final void f(Object obj) {
        if (!m10032(this)) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReferenceM10028 = m10028(this);
            while (!C0091.m8661(atomicReferenceM10028, null, obj) && C0102.m11096(atomicReferenceM10028) == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return m10027(this);
    }

    @Override // j$.util.stream.AbstractC0539e
    public final Object c() {
        if (m10032(this)) {
            Object objM11096 = C0102.m11096(m10028(this));
            return objM11096 == null ? m10029(this) : objM11096;
        }
        return super.c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        AbstractC0529c abstractC0529c = this;
        for (AbstractC0529c abstractC0529c2 = (AbstractC0529c) ((AbstractC0539e) C0092.m8728(this)); abstractC0529c2 != null; abstractC0529c2 = (AbstractC0529c) ((AbstractC0539e) C0092.m8728(abstractC0529c2))) {
            if (m10025(abstractC0529c2) == abstractC0529c) {
                AbstractC0529c abstractC0529c3 = (AbstractC0529c) m10020(abstractC0529c2);
                if (!m10021(abstractC0529c3)) {
                    m10030(abstractC0529c3);
                }
            }
            abstractC0529c = abstractC0529c2;
        }
    }
}
