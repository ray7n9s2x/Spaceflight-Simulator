package j$.util;

import java.util.List;
import java.util.RandomAccess;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public class DesugarCollections {
    public static <T> List<T> unmodifiableList(List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C0512l(list);
        }
        return new r(list);
    }

    public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> sortedMap) {
        return new C0648t(sortedMap);
    }
}
