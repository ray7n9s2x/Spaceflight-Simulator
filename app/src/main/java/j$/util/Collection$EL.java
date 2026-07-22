package j$.util;

import j$.time.C0090;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Collection$EL {
    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof InterfaceC0502b ? C0099.m10883((InterfaceC0502b) collection) : C0097.m10826(collection);
    }

    public static f0 b(Collection collection) {
        if (collection instanceof InterfaceC0502b) {
            return C0102.m11088((InterfaceC0502b) collection);
        }
        if (collection instanceof LinkedHashSet) {
            return new r0(17, (Collection) C0099.m10863((LinkedHashSet) collection));
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new P(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return new r0(1, (Collection) C0099.m10863((Set) collection));
        }
        if (!(collection instanceof List)) {
            return new r0(0, (Collection) C0099.m10863(collection));
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0501a(list) : new r0(16, (Collection) C0099.m10863(list));
    }

    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0502b) {
            C0102.m11097((InterfaceC0502b) collection, consumer);
            return;
        }
        C0099.m10863(consumer);
        Iterator itM10762 = C0096.m10762(collection);
        while (C0087.m8485(itM10762)) {
            C0083.m8026(consumer, C0090.m8628(itM10762));
        }
    }
}
