package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0103;
import java.io.Serializable;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.C0105;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0517q implements Map, Serializable, InterfaceC0654z {
    private static final long serialVersionUID = -1034234728574286014L;
    private final SortedMap a;
    private transient Set b;
    private transient Set c;
    private transient Collection d;

    /* JADX INFO: renamed from: ۟۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static SortedMap m9290(Object obj) {
        if (C0084.m8116() > 0) {
            return ((AbstractC0517q) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Set m9291(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0517q) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Set m9292(Object obj) {
        if (C0082.m7983() < 0) {
            return ((AbstractC0517q) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Collection m9293(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((AbstractC0517q) obj).d;
        }
        return null;
    }

    @Override // java.util.Map, j$.util.InterfaceC0654z, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = obj2;
        SortedMap sortedMapM9290 = m9290(this);
        if (sortedMapM9290 instanceof InterfaceC0654z) {
            return C0086.m8303((InterfaceC0654z) sortedMapM9290, obj, obj3);
        }
        if (sortedMapM9290 instanceof ConcurrentMap) {
            Object objM8103 = C0084.m8103((ConcurrentMap) sortedMapM9290, obj);
            if (objM8103 != null) {
                obj3 = objM8103;
            }
        } else {
            Object objM81032 = C0084.m8103(sortedMapM9290, obj);
            if (objM81032 != null || C0089.m8570(sortedMapM9290, obj)) {
                obj3 = objM81032;
            }
        }
        return obj3;
    }

    @Override // java.util.Map, j$.util.InterfaceC0654z, java.util.concurrent.ConcurrentMap
    public final void forEach(BiConsumer biConsumer) {
        SortedMap sortedMapM9290 = m9290(this);
        if (sortedMapM9290 instanceof InterfaceC0654z) {
            C0079.m7479((InterfaceC0654z) sortedMapM9290, biConsumer);
            return;
        }
        if (sortedMapM9290 instanceof ConcurrentMap) {
            C0099.m10863(biConsumer);
            Iterator itM8658 = C0090.m8658(C0103.m11178((ConcurrentMap) sortedMapM9290));
            while (C0087.m8485(itM8658)) {
                Map.Entry entry = (Map.Entry) C0090.m8628(itM8658);
                try {
                    C0105.m11267(biConsumer, C0099.m10870(entry), C0096.m10785(entry));
                } catch (IllegalStateException unused) {
                }
            }
            return;
        }
        C0099.m10863(biConsumer);
        Iterator itM86582 = C0090.m8658(C0103.m11178(sortedMapM9290));
        while (C0087.m8485(itM86582)) {
            Map.Entry entry2 = (Map.Entry) C0090.m8628(itM86582);
            try {
                C0105.m11267(biConsumer, C0099.m10870(entry2), C0096.m10785(entry2));
            } catch (IllegalStateException e) {
                throw new ConcurrentModificationException(e);
            }
        }
    }

    AbstractC0517q(SortedMap sortedMap) {
        C0092.m8727(sortedMap);
        this.a = sortedMap;
    }

    @Override // java.util.Map
    public final int size() {
        return C0093.m9065(m9290(this));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return C0092.m8749(m9290(this));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return C0089.m8570(m9290(this), obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return C0086.m8295(m9290(this), obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return C0084.m8103(m9290(this), obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (m9292(this) == null) {
            this.b = new C0518s(C0094.m9110(m9290(this)));
        }
        return m9292(this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (m9291(this) == null) {
            this.c = new C0516p(C0103.m11178(m9290(this)));
        }
        return m9291(this);
    }

    @Override // java.util.Map
    public final Collection values() {
        if (m9293(this) == null) {
            this.d = new C0510j(C0091.m8718(m9290(this)));
        }
        return m9293(this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || C0079.m7488(m9290(this), obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C0079.m7509(m9290(this));
    }

    public final String toString() {
        return C0087.m8479(m9290(this));
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.InterfaceC0654z, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
