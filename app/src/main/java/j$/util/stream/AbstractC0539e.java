package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0539e extends CountedCompleter {
    private static final int g = C0082.m7968() << 2;
    protected final AbstractC0524b a;
    protected j$.util.f0 b;
    protected long c;
    protected AbstractC0539e d;
    protected AbstractC0539e e;
    private Object f;

    /* JADX INFO: renamed from: ۟۠ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10073(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10074(Object obj, Object obj2) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0539e) obj).e((j$.util.f0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static long m10075(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0539e) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m10076(Object obj) {
        if (C0091.m8708() > 0) {
            return ((AbstractC0539e) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m10077() {
        if (C0099.m10878() <= 0) {
            return g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m10078(Object obj, Object obj2) {
        if (C0105.m11264() >= 0) {
            ((AbstractC0539e) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m10079(long j) {
        if (C0089.m8594() < 0) {
            return g(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10080(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m10081(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0539e) obj).a();
        }
        return null;
    }

    protected abstract Object a();

    protected abstract AbstractC0539e e(j$.util.f0 f0Var);

    protected AbstractC0539e(AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        super(null);
        this.a = abstractC0524b;
        this.b = f0Var;
        this.c = 0L;
    }

    protected AbstractC0539e(AbstractC0539e abstractC0539e, j$.util.f0 f0Var) {
        super(abstractC0539e);
        this.b = f0Var;
        this.a = m10073(abstractC0539e);
        this.c = m10075(abstractC0539e);
    }

    public static int b() {
        return m10077();
    }

    public static long g(long j) {
        long jM10077 = j / ((long) m10077());
        if (jM10077 > 0) {
            return jM10077;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return m10076(this);
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected Object c() {
        return m10076(this);
    }

    protected void f(Object obj) {
        this.f = obj;
    }

    protected final boolean d() {
        return ((AbstractC0539e) C0092.m8728(this)) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.f0 f0VarM7517;
        j$.util.f0 f0VarM10080 = m10080(this);
        long jM7979 = C0082.m7979(f0VarM10080);
        long jM10075 = m10075(this);
        if (jM10075 == 0) {
            jM10075 = m10079(jM7979);
            this.c = jM10075;
        }
        boolean z = false;
        AbstractC0539e abstractC0539e = this;
        while (jM7979 > jM10075 && (f0VarM7517 = C0079.m7517(f0VarM10080)) != null) {
            AbstractC0539e abstractC0539eM10074 = m10074(abstractC0539e, f0VarM7517);
            abstractC0539e.d = abstractC0539eM10074;
            AbstractC0539e abstractC0539eM100742 = m10074(abstractC0539e, f0VarM10080);
            abstractC0539e.e = abstractC0539eM100742;
            C0105.m11270(abstractC0539e, 1);
            if (z) {
                f0VarM10080 = f0VarM7517;
                abstractC0539e = abstractC0539eM10074;
                abstractC0539eM10074 = abstractC0539eM100742;
            } else {
                abstractC0539e = abstractC0539eM100742;
            }
            z = !z;
            C0096.m10779(abstractC0539eM10074);
            jM7979 = C0082.m7979(f0VarM10080);
        }
        m10078(abstractC0539e, m10081(abstractC0539e));
        C0092.m8734(abstractC0539e);
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
