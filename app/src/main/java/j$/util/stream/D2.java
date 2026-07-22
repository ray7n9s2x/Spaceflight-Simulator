package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
abstract class D2 extends AbstractC0577l2 {
    protected final Comparator b;
    protected boolean c;

    D2(InterfaceC0597p2 interfaceC0597p2, Comparator comparator) {
        super(interfaceC0597p2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC0577l2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
