package j$.util;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.util.concurrent.C0093;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0648t extends AbstractC0517q implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;
    private final SortedMap e;

    /* JADX INFO: renamed from: ۧۦۧ۠, reason: not valid java name and contains not printable characters */
    public static SortedMap m10935(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((C0648t) obj).e;
        }
        return null;
    }

    C0648t(SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C0085.m8228(m10935(this));
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C0648t(C0089.m8592(m10935(this), obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C0648t(C0086.m8298(m10935(this), obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C0648t(C0103.m11148(m10935(this), obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return C0093.m9064(m10935(this));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return C0099.m10882(m10935(this));
    }
}
