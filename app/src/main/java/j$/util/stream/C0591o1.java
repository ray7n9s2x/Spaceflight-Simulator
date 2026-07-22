package j$.util.stream;

import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import java.util.ArrayDeque;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0591o1 extends AbstractC0596p1 {
    /* JADX INFO: renamed from: ۟۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10401(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return ((C0591o1) obj).tryAdvance((Consumer) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10402(Object obj) {
        if (C0102.m11109() < 0) {
            return ((AbstractC0596p1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10403(Object obj) {
        if (C0081.m7818() < 0) {
            return ((L0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۨ, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m10404(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0596p1) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10405(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0596p1) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10406(Object obj) {
        if (C0081.m7818() < 0) {
            return ((AbstractC0596p1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧ۟, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m10407(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0596p1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۥ, reason: contains not printable characters */
    public static void m10408(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            ((L0) obj).forEach((Consumer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢۤ۠, reason: not valid java name and contains not printable characters */
    public static L0 m10409(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0596p1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣ۟, reason: not valid java name and contains not printable characters */
    public static L0 m10410(Object obj) {
        if (C0100.m10983() >= 0) {
            return AbstractC0596p1.a((ArrayDeque) obj);
        }
        return null;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        L0 l0M10410;
        if (!m10405(this)) {
            return false;
        }
        boolean zM7848 = C0081.m7848(m10402(this), consumer);
        if (!zM7848) {
            if (m10406(this) == null && (l0M10410 = m10410(m10407(this))) != null) {
                j$.util.f0 f0VarM10403 = m10403(l0M10410);
                this.d = f0VarM10403;
                return C0081.m7848(f0VarM10403, consumer);
            }
            this.a = null;
        }
        return zM7848;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        if (m10409(this) == null) {
            return;
        }
        if (m10402(this) == null) {
            j$.util.f0 f0VarM10406 = m10406(this);
            if (f0VarM10406 == null) {
                ArrayDeque arrayDequeM10404 = m10404(this);
                while (true) {
                    L0 l0M10410 = m10410(arrayDequeM10404);
                    if (l0M10410 != null) {
                        m10408(l0M10410, consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                C0088.m8509(f0VarM10406, consumer);
            }
        } else {
            while (m10401(this, consumer)) {
            }
        }
    }
}
