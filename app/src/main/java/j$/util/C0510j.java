package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.io.C0103;
import java.io.C0104;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0510j implements Collection, Serializable, InterfaceC0502b {
    private static final long serialVersionUID = 1820017752578914078L;
    final Collection a;

    /* JADX INFO: renamed from: ۟ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Stream m9256(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((C0510j) obj).stream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static f0 m9257(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((C0510j) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Stream m9258(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C0510j) obj).parallelStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static Collection m9259(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0510j) obj).a;
        }
        return null;
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return C0082.m8000(m9258(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C0081.m7838(m9257(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return C0082.m8000(m9256(this));
    }

    C0510j(Collection collection) {
        C0092.m8727(collection);
        this.a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return C0099.m10876(m9259(this));
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return C0101.m11029(m9259(this));
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C0093.m9061(m9259(this), obj);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0100.m10995(m9259(this));
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0080.m7581(m9259(this), objArr);
    }

    public final String toString() {
        return C0087.m8479(m9259(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0509i(this);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return C0100.m10992(m9259(this), collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable, j$.util.InterfaceC0502b
    public void forEach(Consumer consumer) {
        C0104.m11227(m9259(this), consumer);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.InterfaceC0502b, java.util.Set
    public f0 spliterator() {
        return C0083.m8024(m9259(this));
    }

    @Override // java.util.Collection, j$.util.InterfaceC0502b
    public Stream stream() {
        return C0101.m11030(m9259(this));
    }

    @Override // java.util.Collection, j$.util.InterfaceC0502b
    public Stream parallelStream() {
        Collection collectionM9259 = m9259(this);
        return collectionM9259 instanceof InterfaceC0502b ? C0097.m10852((InterfaceC0502b) collectionM9259) : C0084.m8078(collectionM9259);
    }

    @Override // java.util.Collection
    public final Object[] toArray(IntFunction intFunction) {
        return C0080.m7581(this, (Object[]) C0095.m9220(intFunction, 0));
    }
}
