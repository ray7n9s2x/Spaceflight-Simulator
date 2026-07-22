package j$.util.stream;

import j$.util.C0101;
import j$.util.C0102;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0545f0 implements LongBinaryOperator, Consumer, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0545f0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        C0101.m11054(this);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (C0101.m11054(this)) {
            case 2:
                break;
            case 8:
                break;
        }
        return C0099.m10917(this, consumer);
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (C0101.m11054(this)) {
            case 0:
                return C0102.m11093(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (C0101.m11054(this)) {
            case 3:
                return new Object[i];
            case 4:
                return new Object[i];
            case 5:
                return new Integer[i];
            case 6:
                return new Long[i];
            case 7:
                return new Double[i];
            case 8:
            case 9:
            default:
                return new Double[i];
            case 10:
                return new Integer[i];
            case 11:
                return new Integer[i];
            case 12:
                return new Long[i];
            case 13:
                return new Long[i];
            case 14:
                return new Double[i];
        }
    }
}
