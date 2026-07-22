package com.google.android.gms.common.data;

import com.zfork.multiplatforms.android.bomb.W4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        W4 w4 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w4.add(arrayList.get(i).freeze());
        }
        return w4;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        W4 w4 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            w4.add(it.next().freeze());
        }
        return w4;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        W4 w4 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            w4.add(e.freeze());
        }
        return w4;
    }
}
