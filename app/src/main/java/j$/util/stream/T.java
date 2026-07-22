package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.concurrent.CountedCompleter;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class T extends CountedCompleter {
    private j$.util.f0 a;
    private final InterfaceC0597p2 b;
    private final AbstractC0524b c;
    private long d;

    /* JADX INFO: renamed from: ۟۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9744(Object obj) {
        if (C0101.m11044() < 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨ۟, reason: not valid java name and contains not printable characters */
    public static long m9745(Object obj) {
        if (C0098.m10857() < 0) {
            return ((T) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9746(Object obj, Object obj2, Object obj3) {
        if (C0105.m11264() > 0) {
            ((AbstractC0524b) obj).w((j$.util.f0) obj2, (InterfaceC0597p2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static EnumC0543e3 m9747() {
        if (C0104.m11196() > 0) {
            return EnumC0543e3.SHORT_CIRCUIT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m9748(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((AbstractC0524b) obj).G();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9749(Object obj, int i) {
        if (C0093.m9101() >= 0) {
            return ((EnumC0543e3) obj).n(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static AbstractC0524b m9750(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((T) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9751(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((T) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9752(Object obj) {
        if (C0088.m8503() > 0) {
            return ((T) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static long m9753(long j) {
        if (C0094.m9148() >= 0) {
            return AbstractC0539e.g(j);
        }
        return 0L;
    }

    T(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, InterfaceC0597p2 interfaceC0597p2) {
        super(null);
        this.b = interfaceC0597p2;
        this.c = abstractC0524b;
        this.a = f0Var;
        this.d = 0L;
    }

    T(T t, j$.util.f0 f0Var) {
        super(t);
        this.a = f0Var;
        this.b = m9752(t);
        this.d = m9745(t);
        this.c = m9750(t);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.f0 f0VarM7517;
        j$.util.f0 f0VarM9751 = m9751(this);
        long jM7979 = C0082.m7979(f0VarM9751);
        long jM9745 = m9745(this);
        if (jM9745 == 0) {
            jM9745 = m9753(jM7979);
            this.d = jM9745;
        }
        boolean zM9749 = m9749(m9747(), m9748(m9750(this)));
        InterfaceC0597p2 interfaceC0597p2M9752 = m9752(this);
        boolean z = false;
        T t = this;
        while (true) {
            if (zM9749 && m9744(interfaceC0597p2M9752)) {
                break;
            }
            if (jM7979 <= jM9745 || (f0VarM7517 = C0079.m7517(f0VarM9751)) == null) {
                break;
            }
            T t2 = new T(t, f0VarM7517);
            C0105.m11257(t, 1);
            if (z) {
                f0VarM9751 = f0VarM7517;
            } else {
                T t3 = t;
                t = t2;
                t2 = t3;
            }
            z = !z;
            C0096.m10779(t);
            t = t2;
            jM7979 = C0082.m7979(f0VarM9751);
        }
        m9746(m9750(t), f0VarM9751, interfaceC0597p2M9752);
        t.a = null;
        C0090.m8609(t);
    }
}
