package j$.util.function;

import j$.time.C0089;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.util.stream.C0097;
import j$.util.stream.C0099;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements BiConsumer, BiFunction, Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C0097.m10803(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C0089.m8571(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        C0083.m8026((Consumer) C0106.m11354(this), obj);
        C0083.m8026((Consumer) C0105.m11306(this), obj);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return C0087.m8486((Function) C0105.m11306(this), C0082.m7970((BiFunction) C0106.m11354(this), obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        C0105.m11267((BiConsumer) C0106.m11354(this), obj, obj2);
        C0105.m11267((BiConsumer) C0105.m11306(this), obj, obj2);
    }
}
