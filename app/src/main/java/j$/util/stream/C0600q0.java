package j$.util.stream;

import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.zone.C0087;
import j$.util.C0101;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.C0105;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0600q0 implements Supplier, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0600q0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m10441(Object obj, Object obj2, Object obj3) {
        if (C0101.m11044() <= 0) {
            ((C0588n3) obj).b((Consumer) obj2, obj3);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0081.m7816(this)) {
        }
        return C0099.m10917(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (C0081.m7816(this)) {
            case 0:
                return new C0609s0((EnumC0629w0) C0105.m11301(this), (IntPredicate) C0091.m8710(this));
            default:
                return new C0604r0((EnumC0629w0) C0105.m11301(this), (Predicate) C0091.m8710(this));
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (C0081.m7816(this)) {
            case 2:
                m10441((C0588n3) C0105.m11301(this), (Consumer) C0091.m8710(this), obj);
                break;
            case 3:
                if (obj != null) {
                    C0095.m9227((ConcurrentHashMap) C0091.m8710(this), obj, C0087.m8480());
                } else {
                    C0104.m11194((AtomicBoolean) C0105.m11301(this), true);
                }
                break;
            default:
                C0105.m11267((BiConsumer) C0105.m11301(this), C0091.m8710(this), obj);
                break;
        }
    }
}
