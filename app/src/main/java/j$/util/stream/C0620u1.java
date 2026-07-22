package j$.util.stream;

import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.util.C0102;
import j$.util.function.C0095;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0620u1 extends AbstractC0635x1 implements InterfaceC0587n2 {
    private final int[] h;

    /* JADX INFO: renamed from: ۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m10556(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((C0620u1) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m10557(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0635x1) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۥ, reason: contains not printable characters */
    public static int m10558(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0635x1) obj).f;
        }
        return 0;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C0099.m10866(this, obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0587n2
    public final /* synthetic */ void m(Integer num) {
        C0084.m8112(this, num);
    }

    C0620u1(j$.util.f0 f0Var, AbstractC0524b abstractC0524b, int[] iArr) {
        super(f0Var, abstractC0524b, iArr.length);
        this.h = iArr;
    }

    C0620u1(C0620u1 c0620u1, j$.util.f0 f0Var, long j, long j2) {
        super(c0620u1, f0Var, j, j2, m10556(c0620u1).length);
        this.h = m10556(c0620u1);
    }

    @Override // j$.util.stream.AbstractC0635x1
    final AbstractC0635x1 b(j$.util.f0 f0Var, long j, long j2) {
        return new C0620u1(this, f0Var, j, j2);
    }

    @Override // j$.util.stream.AbstractC0635x1, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        int iM10558 = m10558(this);
        if (iM10558 >= m10557(this)) {
            throw new IndexOutOfBoundsException(C0102.m11091(m10558(this)));
        }
        int[] iArrM10556 = m10556(this);
        this.f = iM10558 + 1;
        iArrM10556[iM10558] = i;
    }
}
