package j$.util.function;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.zone.C0087;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ d(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (C0080.m7582(this)) {
        }
        return C0092.m8725(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (C0080.m7582(this)) {
        }
        return C0092.m8738(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (C0080.m7582(this)) {
            case 0:
                return C0087.m8486(C0079.m7493(this), C0087.m8486(C0080.m7538(this), obj));
            default:
                return C0087.m8486(C0080.m7538(this), C0087.m8486(C0079.m7493(this), obj));
        }
    }
}
