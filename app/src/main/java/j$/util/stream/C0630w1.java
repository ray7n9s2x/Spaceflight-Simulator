package j$.util.stream;

import j$.time.C0090;
import j$.util.C0102;
import j$.util.function.C0095;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0630w1 extends AbstractC0635x1 {
    private final Object[] h;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m10588(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0635x1) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m10589(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0635x1) obj).f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۤ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m10590(Object obj) {
        if (C0090.m8624() > 0) {
            return ((C0630w1) obj).h;
        }
        return null;
    }

    C0630w1(j$.util.f0 f0Var, AbstractC0524b abstractC0524b, Object[] objArr) {
        super(f0Var, abstractC0524b, objArr.length);
        this.h = objArr;
    }

    C0630w1(C0630w1 c0630w1, j$.util.f0 f0Var, long j, long j2) {
        super(c0630w1, f0Var, j, j2, m10590(c0630w1).length);
        this.h = m10590(c0630w1);
    }

    @Override // j$.util.stream.AbstractC0635x1
    final AbstractC0635x1 b(j$.util.f0 f0Var, long j, long j2) {
        return new C0630w1(this, f0Var, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int iM10589 = m10589(this);
        if (iM10589 >= m10588(this)) {
            throw new IndexOutOfBoundsException(C0102.m11091(m10589(this)));
        }
        Object[] objArrM10590 = m10590(this);
        this.f = iM10589 + 1;
        objArrM10590[iM10589] = obj;
    }
}
