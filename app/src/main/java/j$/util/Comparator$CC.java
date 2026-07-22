package j$.util;

import j$.util.concurrent.C0093;
import j$.util.stream.C0099;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC {
    /* JADX INFO: renamed from: ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0507g m8813() {
        if (C0093.m9101() >= 0) {
            return EnumC0507g.INSTANCE;
        }
        return null;
    }

    public static Comparator a() {
        return m8813();
    }

    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        C0099.m10863(function);
        return new C0503c(2, function);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        C0099.m10863(toLongFunction);
        return new C0503c(3, toLongFunction);
    }
}
