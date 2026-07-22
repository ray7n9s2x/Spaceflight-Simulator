package j$.util;

import j$.time.format.C0083;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
final class P extends r0 {
    final /* synthetic */ SortedSet f;

    /* JADX INFO: renamed from: ۟ۡ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static SortedSet m8822(Object obj) {
        if (C0083.m8022() < 0) {
            return ((P) obj).f;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(SortedSet sortedSet, Collection collection) {
        super(21, collection);
        this.f = sortedSet;
    }

    @Override // j$.util.r0, j$.util.f0
    public final Comparator getComparator() {
        return C0102.m11080(m8822(this));
    }
}
