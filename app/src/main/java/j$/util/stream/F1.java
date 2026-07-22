package j$.util.stream;

import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
final class F1 extends AbstractC0644z0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ F1(EnumC0548f3 enumC0548f3, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m9419(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((F1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۦ, reason: contains not printable characters */
    public static Object m9420(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((F1) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦ۟, reason: contains not printable characters */
    public static int m9421(Object obj) {
        if (C0102.m11109() <= 0) {
            return ((F1) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤ۠ۧ, reason: contains not printable characters */
    public static Object m9422(Object obj) {
        if (C0101.m11044() < 0) {
            return ((F1) obj).k;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        switch (m9421(this)) {
            case 0:
                return new C1((Supplier) m9419(this), (ObjLongConsumer) m9422(this), (r) m9420(this));
            case 1:
                return new I1((Supplier) m9419(this), (ObjDoubleConsumer) m9422(this), (r) m9420(this));
            case 2:
                return new K1(m9419(this), (BiFunction) m9422(this), (BinaryOperator) m9420(this));
            case 3:
                return new O1((Supplier) m9419(this), (BiConsumer) m9422(this), (BiConsumer) m9420(this));
            default:
                return new S1((Supplier) m9419(this), (ObjIntConsumer) m9422(this), (r) m9420(this));
        }
    }
}
