package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0100;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0642y3 extends AbstractC0647z3 implements j$.util.f0 {
    /* JADX INFO: renamed from: ۟ۡۨۦ۠, reason: not valid java name and contains not printable characters */
    public static long m10663(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((AbstractC0647z3) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static long m10664(Object obj) {
        if (C0087.m8458() <= 0) {
            return ((AbstractC0647z3) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m10665(Object obj) {
        if (C0079.m7512() > 0) {
            return ((AbstractC0647z3) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦ۟, reason: not valid java name and contains not printable characters */
    public static long m10666(Object obj) {
        if (C0105.m11264() > 0) {
            return ((AbstractC0647z3) obj).d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10667(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0647z3) obj).c;
        }
        return null;
    }

    @Override // j$.util.f0
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0083.m8031(this);
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C0100.m10986(this, i);
    }

    @Override // j$.util.f0
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C0642y3(j$.util.f0 f0Var, long j, long j2) {
        super(f0Var, j, j2, 0L, C0088.m8519(C0082.m7979(f0Var), j2));
    }

    @Override // j$.util.stream.AbstractC0647z3
    protected final j$.util.f0 a(j$.util.f0 f0Var, long j, long j2, long j3, long j4) {
        return new C0642y3(f0Var, j, j2, j3, j4);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        long jM10666;
        C0099.m10863(consumer);
        long jM10664 = m10664(this);
        long jM10665 = m10665(this);
        if (jM10665 >= jM10664) {
            return false;
        }
        while (true) {
            jM10666 = m10666(this);
            if (jM10665 <= jM10666) {
                break;
            }
            C0081.m7848(m10667(this), new C0545f0(8));
            this.d = m10666(this) + 1;
        }
        if (jM10666 >= m10664(this)) {
            return false;
        }
        this.d = jM10666 + 1;
        return C0081.m7848(m10667(this), consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0099.m10863(consumer);
        long jM10664 = m10664(this);
        long jM10665 = m10665(this);
        if (jM10665 >= jM10664) {
            return;
        }
        long jM10666 = m10666(this);
        if (jM10666 >= jM10664) {
            return;
        }
        if (jM10666 >= jM10665 && C0082.m7979(m10667(this)) + jM10666 <= m10663(this)) {
            C0088.m8509(m10667(this), consumer);
            this.d = m10664(this);
            return;
        }
        while (jM10665 > m10666(this)) {
            C0081.m7848(m10667(this), new C0545f0(9));
            this.d = m10666(this) + 1;
        }
        while (m10666(this) < m10664(this)) {
            C0081.m7848(m10667(this), consumer);
            this.d = m10666(this) + 1;
        }
    }
}
