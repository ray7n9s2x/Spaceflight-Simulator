package j$.util;

import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.util.function.C0094;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.C0106;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0512l extends C0510j implements List, InterfaceC0652x {
    private static final long serialVersionUID = -283967356065247728L;
    final List b;

    /* JADX INFO: renamed from: ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static List m9276(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((C0512l) obj).b;
        }
        return null;
    }

    C0512l(List list) {
        super(list);
        this.b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || C0084.m8105(m9276(this), obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return C0101.m11048(m9276(this));
    }

    @Override // java.util.List
    public final Object get(int i) {
        return C0094.m9156(m9276(this), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return C0106.m11331(m9276(this), obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return C0083.m8038(m9276(this), obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0511k(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C0511k(this, i);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C0512l(C0103.m11129(m9276(this), i, i2));
    }

    private Object readResolve() {
        List listM9276 = m9276(this);
        return listM9276 instanceof RandomAccess ? new r(listM9276) : this;
    }
}
