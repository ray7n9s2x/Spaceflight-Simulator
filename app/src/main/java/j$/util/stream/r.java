package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.chrono.C0081;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiConsumer b;

    public /* synthetic */ r(BiConsumer biConsumer, int i) {
        this.a = i;
        this.b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (C0091.m8682(this)) {
        }
        return C0089.m8571(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (C0091.m8682(this)) {
            case 0:
                C0105.m11267(C0081.m7810(this), obj, obj2);
                break;
            case 1:
                C0105.m11267(C0081.m7810(this), obj, obj2);
                break;
            default:
                C0105.m11267(C0081.m7810(this), obj, obj2);
                break;
        }
        return obj;
    }
}
