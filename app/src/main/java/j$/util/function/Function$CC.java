package j$.util.function;

import j$.util.stream.C0099;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$compose(Function function, Function function2) {
        C0099.m10863(function2);
        return new d(function, function2, 1);
    }

    public static Function $default$andThen(Function function, Function function2) {
        C0099.m10863(function2);
        return new d(function, function2, 0);
    }
}
