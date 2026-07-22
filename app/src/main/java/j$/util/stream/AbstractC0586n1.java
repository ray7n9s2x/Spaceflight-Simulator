package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0586n1 extends AbstractC0596p1 implements j$.util.c0 {
    /* JADX INFO: renamed from: ۟۟ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m10376(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0596p1) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static L0 m10377(Object obj) {
        if (C0085.m8230() > 0) {
            return AbstractC0596p1.a((ArrayDeque) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10378(Object obj) {
        if (C0097.m10823() > 0) {
            return ((AbstractC0596p1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10379(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((AbstractC0596p1) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m10380(Object obj, Object obj2) {
        if (C0094.m9148() > 0) {
            ((AbstractC0586n1) obj).forEachRemaining(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10381(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0596p1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۦ, reason: contains not printable characters */
    public static boolean m10382(Object obj, Object obj2) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0586n1) obj).tryAdvance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static L0 m10383(Object obj) {
        if (C0084.m8116() > 0) {
            return ((AbstractC0596p1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static ArrayDeque m10384(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0596p1) obj).b();
        }
        return null;
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(Object obj) {
        K0 k0;
        if (!m10379(this)) {
            return false;
        }
        boolean zM8061 = C0083.m8061((j$.util.c0) m10381(this), obj);
        if (!zM8061) {
            if (m10378(this) == null && (k0 = (K0) m10377(m10376(this))) != null) {
                j$.util.c0 c0VarM8714 = C0091.m8714(k0);
                this.d = c0VarM8714;
                return C0083.m8061(c0VarM8714, obj);
            }
            this.a = null;
        }
        return zM8061;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(Object obj) {
        if (m10383(this) == null) {
            return;
        }
        if (m10381(this) == null) {
            j$.util.f0 f0VarM10378 = m10378(this);
            if (f0VarM10378 == null) {
                ArrayDeque arrayDequeM10384 = m10384(this);
                while (true) {
                    K0 k0 = (K0) m10377(arrayDequeM10384);
                    if (k0 != null) {
                        C0094.m9118(k0, obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                C0080.m7577((j$.util.c0) f0VarM10378, obj);
            }
        } else {
            while (m10382(this, obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m10380(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m10382(this, intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        m10380(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return m10382(this, longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        m10380(this, doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return m10382(this, doubleConsumer);
    }
}
