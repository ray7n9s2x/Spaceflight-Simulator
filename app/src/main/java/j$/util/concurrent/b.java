package j$.util.concurrent;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f487short = {2303, 2248, 2268, 2264, 2244, 2271, 2248, 2249, 2189, 2252, 2271, 2271, 2252, 2260, 2189, 2270, 2244, 2263, 2248, 2189, 2265, 2242, 2242, 2189, 2241, 2252, 2271, 2250, 2248, 864, 855, 835, 839, 859, 832, 855, 854, 786, 851, 832, 832, 851, 843, 786, 833, 859, 840, 855, 786, 838, 861, 861, 786, 862, 851, 832, 853, 855, 262, 1297, 1357, 1361, 1360, 1354, 1305, 1402, 1366, 1365, 1365, 1372, 1370, 1357, 1360, 1366, 1367, 1296, 2151, 2155};
    final ConcurrentHashMap a;

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8884(Object obj, Object obj2) {
        if (C0101.m11044() < 0) {
            return ((b) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m8885(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((b) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8886() {
        if (C0088.m8503() > 0) {
            return f487short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۧ, reason: not valid java name and contains not printable characters */
    public static long m8887(Object obj) {
        if (C0081.m7818() <= 0) {
            return ((ConcurrentHashMap) obj).j();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۨ, reason: contains not printable characters */
    public static boolean m8888(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((b) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡۡ, reason: contains not printable characters */
    public static ConcurrentHashMap m8889(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۨۦ, reason: not valid java name and contains not printable characters */
    public static l[] m8890(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((ConcurrentHashMap) obj).a;
        }
        return null;
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long jM8887 = m8887(m8889(this));
        if (jM8887 < 0) {
            jM8887 = 0;
        }
        String strM8236 = C0085.m8236(m8886(), 0, 29, 2221);
        if (jM8887 > 2147483639) {
            throw new OutOfMemoryError(strM8236);
        }
        int i = (int) jM8887;
        Object[] objArrM10839 = new Object[i];
        Iterator itM8885 = m8885(this);
        int i2 = 0;
        while (C0087.m8485(itM8885)) {
            Object objM8628 = C0090.m8628(itM8885);
            if (i2 == i) {
                if (i >= 2147483639) {
                    throw new OutOfMemoryError(strM8236);
                }
                int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                objArrM10839 = C0097.m10839(objArrM10839, i3);
                i = i3;
            }
            objArrM10839[i2] = objM8628;
            i2++;
        }
        return i2 == i ? objArrM10839 : C0097.m10839(objArrM10839, i2);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long jM8887 = m8887(m8889(this));
        if (jM8887 < 0) {
            jM8887 = 0;
        }
        String strM8291 = C0086.m8291(m8886(), 29, 29, 818);
        if (jM8887 > 2147483639) {
            throw new OutOfMemoryError(strM8291);
        }
        int i = (int) jM8887;
        Object[] objArrM10839 = objArr.length >= i ? objArr : (Object[]) C0088.m8507(C0088.m8554(C0092.m8727(objArr)), i);
        int length = objArrM10839.length;
        Iterator itM8885 = m8885(this);
        int i2 = 0;
        while (C0087.m8485(itM8885)) {
            Object objM8628 = C0090.m8628(itM8885);
            if (i2 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError(strM8291);
                }
                int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrM10839 = C0097.m10839(objArrM10839, i3);
                length = i3;
            }
            objArrM10839[i2] = objM8628;
            i2++;
        }
        if (objArr != objArrM10839 || i2 >= length) {
            return i2 == length ? objArrM10839 : C0097.m10839(objArrM10839, i2);
        }
        objArrM10839[i2] = null;
        return objArrM10839;
    }

    b(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        C0090.m8633(m8889(this));
    }

    @Override // java.util.Collection
    public final int size() {
        return C0094.m9127(m8889(this));
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return C0099.m10867(m8889(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0085.m8236(m8886(), 58, 1, 349));
        Iterator itM8885 = m8885(this);
        if (C0087.m8485(itM8885)) {
            while (true) {
                Object objM8628 = C0090.m8628(itM8885);
                if (objM8628 == this) {
                    objM8628 = C0100.m10962(m8886(), 59, 17, 1337);
                }
                C0082.m7988(sb, objM8628);
                if (!C0087.m8485(itM8885)) {
                    break;
                }
                C0101.m11052(sb, C0094.m9107(m8886(), 76, 2, 2123));
            }
        }
        C0089.m8573(sb, ']');
        return C0099.m10924(sb);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        Iterator itM10762 = C0096.m10762(collection);
        while (C0087.m8485(itM10762)) {
            Object objM8628 = C0090.m8628(itM10762);
            if (objM8628 == null || !m8888(this, objM8628)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        C0092.m8727(collection);
        l[] lVarArrM8890 = m8890(m8889(this));
        boolean zM8884 = false;
        if (lVarArrM8890 == null) {
            return false;
        }
        if ((collection instanceof Set) && C0099.m10876(collection) > lVarArrM8890.length) {
            Iterator itM8885 = m8885(this);
            while (C0087.m8485(itM8885)) {
                if (C0093.m9061(collection, C0090.m8628(itM8885))) {
                    C0091.m8700(itM8885);
                    zM8884 = true;
                }
            }
        } else {
            Iterator itM10762 = C0096.m10762(collection);
            while (C0087.m8485(itM10762)) {
                zM8884 |= m8884(this, C0090.m8628(itM10762));
            }
        }
        return zM8884;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0092.m8727(collection);
        Iterator itM8885 = m8885(this);
        boolean z = false;
        while (C0087.m8485(itM8885)) {
            if (!C0093.m9061(collection, C0090.m8628(itM8885))) {
                C0091.m8700(itM8885);
                z = true;
            }
        }
        return z;
    }
}
