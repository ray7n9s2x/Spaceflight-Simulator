package j$.util.stream;

import java.io.C0104;
import java.util.function.BinaryOperator;
import java.util.function.C0105;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes3.dex */
final class Q0 extends S0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q0(AbstractC0524b abstractC0524b, j$.util.f0 f0Var, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(abstractC0524b, f0Var, longFunction, binaryOperator);
        this.k = i;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9661(Object obj) {
        if (C0104.m11196() > 0) {
            return ((Q0) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static L0 m9662(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((S0) obj).h();
        }
        return null;
    }

    @Override // j$.util.stream.S0, j$.util.stream.AbstractC0539e
    protected final AbstractC0539e e(j$.util.f0 f0Var) {
        switch (m9661(this)) {
        }
        return new S0(this, f0Var);
    }

    @Override // j$.util.stream.S0, j$.util.stream.AbstractC0539e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (m9661(this)) {
        }
        return m9662(this);
    }
}
