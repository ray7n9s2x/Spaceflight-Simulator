package j$.util;

import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0509i implements Iterator, InterfaceC0651w {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    /* JADX INFO: renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static Collection m9243(Object obj) {
        if (C0092.m8724() < 0) {
            return ((C0510j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m9244(Object obj) {
        if (C0100.m10983() > 0) {
            return ((C0509i) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡۦ, reason: contains not printable characters */
    public static int m9245(Object obj) {
        if (C0087.m8458() < 0) {
            return ((C0509i) obj).a;
        }
        return 0;
    }

    public C0509i(C0510j c0510j) {
        this.b = C0096.m10762(m9243(c0510j));
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0651w
    public final void forEachRemaining(Consumer consumer) {
        switch (m9245(this)) {
            case 0:
                C0084.m8088(m9244(this), consumer);
                break;
            default:
                C0084.m8088(m9244(this), new C0513m(consumer));
                break;
        }
    }

    public C0509i(C0516p c0516p) {
        this.b = C0096.m10762(m9243(c0516p));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (m9245(this)) {
        }
        return C0087.m8485(m9244(this));
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (m9245(this)) {
            case 0:
                return C0090.m8628(m9244(this));
            default:
                return new C0514n((Map.Entry) C0090.m8628(m9244(this)));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (m9245(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
