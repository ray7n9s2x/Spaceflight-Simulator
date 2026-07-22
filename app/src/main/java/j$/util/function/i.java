package j$.util.function;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.temporal.C0086;
import j$.util.C0100;
import j$.util.C0101;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ i(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (C0100.m10973(this)) {
        }
        return C0094.m9150(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0100.m10973(this)) {
        }
        return C0090.m8612(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (C0100.m10973(this)) {
        }
        return C0101.m11031(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (C0100.m10973(this)) {
            case 0:
                return C0086.m8320(C0080.m7565(this), obj) && C0086.m8320(C0095.m9222(this), obj);
            default:
                return C0086.m8320(C0080.m7565(this), obj) || C0086.m8320(C0095.m9222(this), obj);
        }
    }
}
