package j$.util.stream;

import j$.time.chrono.C0081;
import j$.util.function.C0095;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
final class D1 extends AbstractC0644z0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    public /* synthetic */ D1(EnumC0548f3 enumC0548f3, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m9375(Object obj) {
        if (C0095.m9210() > 0) {
            return ((D1) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static int m9376(Object obj) {
        if (C0081.m7818() < 0) {
            return ((D1) obj).h;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        switch (m9376(this)) {
            case 0:
                return new U1((LongBinaryOperator) m9375(this));
            case 1:
                return new G1((DoubleBinaryOperator) m9375(this));
            case 2:
                return new L1((BinaryOperator) m9375(this));
            default:
                return new R1((IntBinaryOperator) m9375(this));
        }
    }
}
