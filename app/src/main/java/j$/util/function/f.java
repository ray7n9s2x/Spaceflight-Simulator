package j$.util.function;

import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import java.util.function.C0105;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements IntPredicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ f(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.a = i;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (C0096.m10764(this)) {
        }
        return C0087.m8481(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (C0096.m10764(this)) {
        }
        return C0105.m11268(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (C0096.m10764(this)) {
        }
        return C0097.m10847(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (C0096.m10764(this)) {
            case 0:
                return C0085.m8224(C0101.m11057(this), i) || C0085.m8224(C0083.m8027(this), i);
            default:
                return C0085.m8224(C0101.m11057(this), i) && C0085.m8224(C0083.m8027(this), i);
        }
    }
}
