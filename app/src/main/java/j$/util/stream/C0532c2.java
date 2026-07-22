package j$.util.stream;

import j$.time.C0090;
import j$.time.chrono.C0081;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0532c2 extends AbstractC0539e {
    private final AbstractC0644z0 h;

    /* JADX INFO: renamed from: ۟۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10039(Object obj, Object obj2, Object obj3) {
        if (C0101.m11044() <= 0) {
            return ((AbstractC0524b) obj).R((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10040(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0539e) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static V1 m10041(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((AbstractC0644z0) obj).f0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10042(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0539e) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m10043(Object obj, Object obj2) {
        if (C0090.m8624() > 0) {
            ((AbstractC0539e) obj).f(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m10044(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((AbstractC0539e) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0644z0 m10045(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((C0532c2) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0524b m10046(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0539e) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m10047(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            ((V1) obj).g((V1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0539e m10048(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0539e) obj).d;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0539e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0539e abstractC0539eM10048 = m10048(this);
        if (abstractC0539eM10048 != null) {
            V1 v1 = (V1) m10044((C0532c2) abstractC0539eM10048);
            m10047(v1, (V1) m10044((C0532c2) m10042(this)));
            m10043(this, v1);
        }
        super.onCompletion(countedCompleter);
    }

    C0532c2(AbstractC0644z0 abstractC0644z0, AbstractC0524b abstractC0524b, j$.util.f0 f0Var) {
        super(abstractC0524b, f0Var);
        this.h = abstractC0644z0;
    }

    C0532c2(C0532c2 c0532c2, j$.util.f0 f0Var) {
        super(c0532c2, f0Var);
        this.h = m10045(c0532c2);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        return new C0532c2(this, f0Var);
    }

    @Override // j$.util.stream.AbstractC0539e
    protected final Object a() {
        AbstractC0524b abstractC0524bM10046 = m10046(this);
        V1 v1M10041 = m10041(m10045(this));
        m10039(abstractC0524bM10046, m10040(this), v1M10041);
        return v1M10041;
    }
}
