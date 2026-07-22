package j$.util.concurrent;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.InterfaceC0502b;
import j$.util.f0;
import j$.util.function.C0095;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.io.C0104;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class e extends b implements Set, InterfaceC0502b {
    private static final long serialVersionUID = 2249069246763182397L;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m8896(Object obj) {
        if (C0095.m9210() > 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m8897(Object obj) {
        if (C0105.m11264() > 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۠, reason: not valid java name and contains not printable characters */
    public static f0 m8898(Object obj) {
        if (C0097.m10823() > 0) {
            return ((e) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m8899(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0104.m11196() > 0) {
            return ((ConcurrentHashMap) obj).g(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m8900(Object obj) {
        if (C0083.m8022() < 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8901(Object obj, Object obj2) {
        if (C0083.m8022() <= 0) {
            return ((b) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static l m8902(Object obj) {
        if (C0100.m10983() > 0) {
            return ((p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m8903(Object obj) {
        if (C0093.m9101() > 0) {
            return ((l) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۢۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m8904(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return ((b) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۦ, reason: contains not printable characters */
    public static l[] m8905(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((ConcurrentHashMap) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static Object m8906(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0084.m8116() > 0) {
            return ((ConcurrentHashMap) obj).f(obj2, obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static long m8907(Object obj) {
        if (C0084.m8116() > 0) {
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
        return C0081.m7838(m8898(this));
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
        return m8904(this, (Object[]) C0095.m9220(intFunction, 0));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return m8906(m8900(this), C0099.m10870(entry), C0096.m10785(entry), false) == null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object objM10870;
        Object objM7547;
        Object objM10785;
        return (!(obj instanceof Map.Entry) || (objM10870 = C0099.m10870((entry = (Map.Entry) obj))) == null || (objM7547 = C0080.m7547(m8900(this), objM10870)) == null || (objM10785 = C0096.m10785(entry)) == null || (objM10785 != objM7547 && !C0085.m8250(objM10785, objM7547))) ? false : true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object objM10870;
        Object objM10785;
        return (obj instanceof Map.Entry) && (objM10870 = C0099.m10870((entry = (Map.Entry) obj))) != null && (objM10785 = C0096.m10785(entry)) != null && C0083.m8019(m8900(this), objM10870, objM10785);
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMapM8900 = m8900(this);
        l[] lVarArrM8905 = m8905(concurrentHashMapM8900);
        int length = lVarArrM8905 == null ? 0 : lVarArrM8905.length;
        return new d(lVarArrM8905, length, length, concurrentHashMapM8900);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator itM10762 = C0096.m10762(collection);
        boolean z = false;
        while (C0087.m8485(itM10762)) {
            Map.Entry entry = (Map.Entry) C0090.m8628(itM10762);
            if (m8906(m8900(this), C0099.m10870(entry), C0096.m10785(entry), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMapM8900 = m8900(this);
        C0092.m8727(concurrentHashMapM8900);
        C0092.m8727(predicate);
        l[] lVarArrM8905 = m8905(concurrentHashMapM8900);
        boolean z = false;
        if (lVarArrM8905 != null) {
            p pVar = new p(lVarArrM8905, lVarArrM8905.length, 0, lVarArrM8905.length);
            while (true) {
                l lVarM8902 = m8902(pVar);
                if (lVarM8902 == null) {
                    break;
                }
                Object objM8896 = m8896(lVarM8902);
                Object objM8897 = m8897(lVarM8902);
                if (C0086.m8320(predicate, new AbstractMap.SimpleImmutableEntry(objM8896, objM8897)) && m8899(concurrentHashMapM8900, objM8896, null, objM8897) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArrM8905 = m8905(m8900(this));
        int iM8903 = 0;
        if (lVarArrM8905 != null) {
            p pVar = new p(lVarArrM8905, lVarArrM8905.length, 0, lVarArrM8905.length);
            while (true) {
                l lVarM8902 = m8902(pVar);
                if (lVarM8902 == null) {
                    break;
                }
                iM8903 += m8903(lVarM8902);
            }
        }
        return iM8903;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (m8901(this, set) && C0084.m8124(set, this)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0502b
    public final f0 spliterator() {
        ConcurrentHashMap concurrentHashMapM8900 = m8900(this);
        long jM8907 = m8907(concurrentHashMapM8900);
        l[] lVarArrM8905 = m8905(concurrentHashMapM8900);
        int length = lVarArrM8905 == null ? 0 : lVarArrM8905.length;
        return new f(lVarArrM8905, length, 0, length, jM8907 >= 0 ? jM8907 : 0L, concurrentHashMapM8900);
    }

    @Override // java.lang.Iterable, j$.util.InterfaceC0502b
    public final void forEach(Consumer consumer) {
        C0092.m8727(consumer);
        l[] lVarArrM8905 = m8905(m8900(this));
        if (lVarArrM8905 == null) {
            return;
        }
        p pVar = new p(lVarArrM8905, lVarArrM8905.length, 0, lVarArrM8905.length);
        while (true) {
            l lVarM8902 = m8902(pVar);
            if (lVarM8902 == null) {
                return;
            } else {
                C0083.m8026(consumer, new k(m8896(lVarM8902), m8897(lVarM8902), m8900(this)));
            }
        }
    }
}
