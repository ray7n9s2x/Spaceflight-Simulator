package j$.util;

import j$.util.stream.Stream;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return C0100.m10985(C0105.m11295(tArr, 0, tArr.length), false);
    }
}
