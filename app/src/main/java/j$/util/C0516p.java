package j$.util;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.io.C0104;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0516p extends C0518s {
    private static final long serialVersionUID = 7854390611657943733L;

    /* JADX INFO: renamed from: ۣ۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Collection m9286(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((C0510j) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9287(Object obj, Object obj2) {
        if (C0089.m8594() < 0) {
            return ((C0516p) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static f0 m9288(Object obj) {
        if (C0094.m9148() > 0) {
            return ((C0516p) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9289(Object obj, Object obj2) {
        if (C0104.m11196() >= 0) {
            return ((C0516p) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    @Override // j$.util.C0510j, java.lang.Iterable, j$.util.InterfaceC0502b
    public final void forEach(Consumer consumer) {
        C0099.m10863(consumer);
        C0104.m11227(m9286(this), new C0513m(consumer));
    }

    @Override // j$.util.C0510j, java.util.Collection, java.lang.Iterable, j$.util.InterfaceC0502b, java.util.Set
    public final f0 spliterator() {
        return new C0515o(C0083.m8024(m9286(this)));
    }

    @Override // j$.util.C0510j, java.util.Collection, j$.util.InterfaceC0502b
    public final Stream stream() {
        return C0100.m10985(m9288(this), false);
    }

    @Override // j$.util.C0510j, java.util.Collection, j$.util.InterfaceC0502b
    public final Stream parallelStream() {
        return C0100.m10985(m9288(this), true);
    }

    @Override // j$.util.C0510j, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0509i(this);
    }

    @Override // j$.util.C0510j, java.util.Collection
    public final Object[] toArray() {
        Object[] objArrM10995 = C0100.m10995(m9286(this));
        for (int i = 0; i < objArrM10995.length; i++) {
            objArrM10995[i] = new C0514n((Map.Entry) objArrM10995[i]);
        }
        return objArrM10995;
    }

    @Override // j$.util.C0510j, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArrM7581 = C0080.m7581(m9286(this), objArr.length == 0 ? objArr : C0097.m10839(objArr, 0));
        for (int i = 0; i < objArrM7581.length; i++) {
            objArrM7581[i] = new C0514n((Map.Entry) objArrM7581[i]);
        }
        if (objArrM7581.length > objArr.length) {
            return objArrM7581;
        }
        C0080.m7558(objArrM7581, 0, objArr, 0, objArrM7581.length);
        if (objArr.length > objArrM7581.length) {
            objArr[objArrM7581.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C0510j, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return C0093.m9061(m9286(this), new C0514n((Map.Entry) obj));
    }

    @Override // j$.util.C0510j, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator itM10762 = C0096.m10762(collection);
        while (C0087.m8485(itM10762)) {
            if (!m9287(this, C0090.m8628(itM10762))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C0518s, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (C0096.m10752(set) != C0099.m10876(m9286(this))) {
            return false;
        }
        return m9289(this, set);
    }
}
