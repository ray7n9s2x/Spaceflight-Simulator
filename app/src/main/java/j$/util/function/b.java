package j$.util.function;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ b(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (C0090.m8653(this)) {
        }
        return C0089.m8571(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (C0090.m8653(this)) {
            case 0:
                if (C0086.m8293(C0088.m8517(this), obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (C0086.m8293(C0088.m8517(this), obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }
}
