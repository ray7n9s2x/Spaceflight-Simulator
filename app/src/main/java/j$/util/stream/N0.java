package j$.util.stream;

import j$.time.format.C0083;
import j$.time.zone.C0088;
import j$.util.C0101;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
abstract class N0 implements L0 {
    protected final L0 a;
    protected final L0 b;
    private final long c;

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static long m9586(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((L0) obj).count();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۟, reason: not valid java name and contains not printable characters */
    public static L0 m9587(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((N0) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static L0 m9588(Object obj, int i) {
        if (C0083.m8022() <= 0) {
            return ((N0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static long m9589(Object obj) {
        if (C0105.m11264() > 0) {
            return ((N0) obj).c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۣۦ, reason: not valid java name and contains not printable characters */
    public static L0 m9590(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((N0) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.L0
    public final int q() {
        return 2;
    }

    N0(L0 l0, L0 l02) {
        this.a = l0;
        this.b = l02;
        this.c = m9586(l0) + m9586(l02);
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        if (i == 0) {
            return m9590(this);
        }
        if (i == 1) {
            return m9587(this);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return m9589(this);
    }

    @Override // j$.util.stream.L0
    public /* bridge */ /* synthetic */ K0 b(int i) {
        return (K0) m9588(this, i);
    }
}
