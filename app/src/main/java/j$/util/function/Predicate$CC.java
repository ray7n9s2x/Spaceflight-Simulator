package j$.util.function;

import j$.util.stream.C0099;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        C0099.m10863(predicate2);
        return new i(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new g(predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        C0099.m10863(predicate2);
        return new i(predicate, predicate2, 1);
    }
}
