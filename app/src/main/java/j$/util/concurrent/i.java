package j$.util.concurrent;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0102;
import j$.util.InterfaceC0502b;
import j$.util.f0;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends b implements Set, InterfaceC0502b {
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: ۟ۡۦۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m8929(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((h) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m8930(Object obj) {
        if (C0095.m9210() > 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m8931(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((b) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static l m8932(Object obj) {
        if (C0106.m11345() < 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static l[] m8933(Object obj) {
        if (C0106.m11345() < 0) {
            return ((ConcurrentHashMap) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8934(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8935(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            return ((b) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static boolean m8936(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((a) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m8937(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0096.m10782() > 0) {
            return ((ConcurrentHashMap) obj).g(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m8938(Object obj) {
        if (C0106.m11345() < 0) {
            ((a) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۨۨ۠۟, reason: not valid java name and contains not printable characters */
    public static long m8939(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((ConcurrentHashMap) obj).j();
        }
        return 0L;
    }

    @Override // java.util.Collection, j$.util.InterfaceC0502b
    public final /* synthetic */ Stream parallelStream() {
        return C0084.m8078(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return C0082.m8000(C0084.m8078(this));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(C0105.m11269(this));
    }

    @Override // java.util.Collection, j$.util.InterfaceC0502b
    public final /* synthetic */ Stream stream() {
        return C0097.m10826(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return C0082.m8000(C0097.m10826(this));
    }

    @Override // java.util.Collection
    public final Object[] toArray(IntFunction intFunction) {
        return m8931(this, (Object[]) C0095.m9220(intFunction, 0));
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        C0099.m10863(predicate);
        Object objM10880 = C0099.m10880(this);
        boolean z = false;
        while (true) {
            a aVar = (a) objM10880;
            if (!m8936(aVar)) {
                return z;
            }
            if (C0086.m8320(predicate, m8929((h) objM10880))) {
                m8938(aVar);
                z = true;
            }
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        return m8937(m8934(this), obj, null, null) != null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return C0102.m11082(m8934(this), obj);
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMapM8934 = m8934(this);
        l[] lVarArrM8933 = m8933(concurrentHashMapM8934);
        int length = lVarArrM8933 == null ? 0 : lVarArrM8933.length;
        return new h(lVarArrM8933, length, length, concurrentHashMapM8934, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object objM10880 = C0099.m10880(this);
        int iM8618 = 0;
        while (m8936((a) objM10880)) {
            iM8618 += C0090.m8618(m8929((h) objM10880));
        }
        return iM8618;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (m8935(this, set) && C0084.m8124(set, this)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0502b
    public final f0 spliterator() {
        ConcurrentHashMap concurrentHashMapM8934 = m8934(this);
        long jM8939 = m8939(concurrentHashMapM8934);
        l[] lVarArrM8933 = m8933(concurrentHashMapM8934);
        int length = lVarArrM8933 == null ? 0 : lVarArrM8933.length;
        return new j(lVarArrM8933, length, 0, length, jM8939 < 0 ? 0L : jM8939, 0);
    }

    @Override // java.lang.Iterable, j$.util.InterfaceC0502b
    public final void forEach(Consumer consumer) {
        C0092.m8727(consumer);
        l[] lVarArrM8933 = m8933(m8934(this));
        if (lVarArrM8933 == null) {
            return;
        }
        p pVar = new p(lVarArrM8933, lVarArrM8933.length, 0, lVarArrM8933.length);
        while (true) {
            l lVarM8932 = m8932(pVar);
            if (lVarM8932 == null) {
                return;
            } else {
                C0083.m8026(consumer, m8930(lVarM8932));
            }
        }
    }
}
