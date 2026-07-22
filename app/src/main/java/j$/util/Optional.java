package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.temporal.C0086;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.NoSuchElementException;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
public final class Optional<T> {
    private final Object a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f484short = {2067, 2098, 2173, 2091, 2108, 2097, 2088, 2104, 2173, 2093, 2095, 2104, 2094, 2104, 2099, 2089, 264, 311, 307, 302, 296, 297, 294, 299, 284, 354, 308, 282, 620, 595, 599, 586, 588, 589, 578, 591, 525, 582, 590, 595, 599, 602};
    private static final Optional b = new Optional();

    /* JADX INFO: renamed from: ۣ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Optional m8815() {
        if (C0103.m11154() < 0) {
            return b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8816() {
        if (C0096.m10782() > 0) {
            return f484short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۡ, reason: contains not printable characters */
    public static Object m8817(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((Optional) obj).a;
        }
        return null;
    }

    private Optional() {
        this.a = null;
    }

    public static Optional a() {
        return m8815();
    }

    private Optional(Object obj) {
        this.a = C0099.m10863(obj);
    }

    public final int hashCode() {
        Object objM8817 = m8817(this);
        if (objM8817 != null) {
            return C0090.m8618(objM8817);
        }
        return 0;
    }

    public static Optional d(Object obj) {
        return new Optional(obj);
    }

    public final Object b() {
        Object objM8817 = m8817(this);
        if (objM8817 != null) {
            return objM8817;
        }
        throw new NoSuchElementException(C0096.m10776(m8816(), 0, 16, 2141));
    }

    public final boolean c() {
        return m8817(this) != null;
    }

    public T orElse(T t) {
        T t2 = (T) m8817(this);
        return t2 != null ? t2 : t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return C0097.m10841(m8817(this), m8817((Optional) obj));
        }
        return false;
    }

    public final String toString() {
        Object objM8817 = m8817(this);
        return objM8817 != null ? C0086.m8314(C0079.m7503(m8816(), 16, 12, 327), new Object[]{objM8817}) : C0106.m11346(m8816(), 28, 14, 547);
    }
}
