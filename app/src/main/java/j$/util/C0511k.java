package j$.util;

import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0084;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import java.io.C0103;
import java.io.C0104;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0511k implements ListIterator, InterfaceC0651w {
    private final ListIterator a;

    /* JADX INFO: renamed from: ۟۠ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static ListIterator m9270(Object obj) {
        if (C0093.m9101() >= 0) {
            return ((C0511k) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static List m9271(Object obj) {
        if (C0104.m11196() > 0) {
            return ((C0512l) obj).b;
        }
        return null;
    }

    C0511k(C0512l c0512l, int i) {
        this.a = C0101.m11058(m9271(c0512l), i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return C0103.m11140(m9270(this));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C0091.m8717(m9270(this));
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return C0096.m10778(m9270(this));
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return C0081.m7814(m9270(this));
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return C0094.m9158(m9270(this));
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return C0100.m10963(m9270(this));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0651w
    public final void forEachRemaining(Consumer consumer) {
        C0084.m8088(m9270(this), consumer);
    }
}
