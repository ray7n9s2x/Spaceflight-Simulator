package j$.util.concurrent;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.C0100;
import j$.util.InterfaceC0502b;
import j$.util.f0;
import j$.util.function.C0094;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class s extends b implements InterfaceC0502b {
    private static final long serialVersionUID = 2249069246763182397L;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m9007(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((s) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9008(Object obj) {
        if (C0080.m7553() > 0) {
            return ((h) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m9009(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۦ, reason: not valid java name and contains not printable characters */
    public static l m9010(Object obj) {
        if (C0092.m8724() < 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9011(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0081.m7818() < 0) {
            return ((ConcurrentHashMap) obj).g(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m9012(Object obj) {
        if (C0100.m10983() > 0) {
            ((a) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static long m9013(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((ConcurrentHashMap) obj).j();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m9014(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static f0 m9015(Object obj) {
        if (C0091.m8708() >= 0) {
            return ((s) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m9016(Object obj) {
        if (C0106.m11345() <= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static l[] m9017(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((ConcurrentHashMap) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m9018(Object obj, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((b) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9019(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((a) obj).hasNext();
        }
        return false;
    }

    @Override // java.util.Collection, j$.util.InterfaceC0502b
    public final /* synthetic */ Stream parallelStream() {
        return C0084.m8078(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return C0082.m8000(C0084.m8078(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(m9015(this));
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
        return m9018(this, (Object[]) C0095.m9220(intFunction, 0));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return C0105.m11263(m9016(this), obj);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        a aVar;
        if (obj == null) {
            return false;
        }
        Object objM9007 = m9007(this);
        do {
            aVar = (a) objM9007;
            if (!m9019(aVar)) {
                return false;
            }
        } while (!C0085.m8250(obj, m9008((h) objM9007)));
        m9012(aVar);
        return true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMapM9016 = m9016(this);
        l[] lVarArrM9017 = m9017(concurrentHashMapM9016);
        int length = lVarArrM9017 == null ? 0 : lVarArrM9017.length;
        return new h(lVarArrM9017, length, length, concurrentHashMapM9016, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0092.m8727(collection);
        Object objM9007 = m9007(this);
        boolean z = false;
        while (true) {
            a aVar = (a) objM9007;
            if (!m9019(aVar)) {
                return z;
            }
            if (C0093.m9061(collection, m9008((h) objM9007))) {
                m9012(aVar);
                z = true;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMapM9016 = m9016(this);
        C0092.m8727(concurrentHashMapM9016);
        C0092.m8727(predicate);
        l[] lVarArrM9017 = m9017(concurrentHashMapM9016);
        boolean z = false;
        if (lVarArrM9017 != null) {
            p pVar = new p(lVarArrM9017, lVarArrM9017.length, 0, lVarArrM9017.length);
            while (true) {
                l lVarM9010 = m9010(pVar);
                if (lVarM9010 == null) {
                    break;
                }
                Object objM9009 = m9009(lVarM9010);
                Object objM9014 = m9014(lVarM9010);
                if (C0086.m8320(predicate, objM9014) && m9011(concurrentHashMapM9016, objM9009, null, objM9014) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.InterfaceC0502b, java.util.Set
    public final f0 spliterator() {
        ConcurrentHashMap concurrentHashMapM9016 = m9016(this);
        long jM9013 = m9013(concurrentHashMapM9016);
        l[] lVarArrM9017 = m9017(concurrentHashMapM9016);
        int length = lVarArrM9017 == null ? 0 : lVarArrM9017.length;
        return new j(lVarArrM9017, length, 0, length, jM9013 < 0 ? 0L : jM9013, 1);
    }

    @Override // java.lang.Iterable, j$.util.InterfaceC0502b
    public final void forEach(Consumer consumer) {
        C0092.m8727(consumer);
        l[] lVarArrM9017 = m9017(m9016(this));
        if (lVarArrM9017 == null) {
            return;
        }
        p pVar = new p(lVarArrM9017, lVarArrM9017.length, 0, lVarArrM9017.length);
        while (true) {
            l lVarM9010 = m9010(pVar);
            if (lVarM9010 == null) {
                return;
            } else {
                C0083.m8026(consumer, m9014(lVarM9010));
            }
        }
    }
}
