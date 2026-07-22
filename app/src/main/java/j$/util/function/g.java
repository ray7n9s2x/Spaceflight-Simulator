package j$.util.function;

import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.stream.C0097;
import java.util.function.C0105;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements IntPredicate, Predicate {
    public final /* synthetic */ Object a;

    public /* synthetic */ g(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C0087.m8481(this, intPredicate);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return C0094.m9150(this, predicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return C0105.m11268(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate m9106negate() {
        return C0090.m8612(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C0097.m10847(this, intPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C0101.m11031(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !C0086.m8320((Predicate) C0101.m11017(this), obj);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !C0085.m8224((IntPredicate) C0101.m11017(this), i);
    }
}
