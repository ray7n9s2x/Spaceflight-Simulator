package j$.util;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.format.C0083;
import j$.util.function.C0094;
import j$.util.stream.C0099;
import java.io.C0104;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0501a implements f0 {
    private final List a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: ۟۟ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static List m8823(Object obj) {
        if (C0092.m8724() <= 0) {
            return ((C0501a) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8824(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((C0501a) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m8825(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0501a) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8826(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((C0501a) obj).a();
        }
        return 0;
    }

    @Override // j$.util.f0
    public final int characteristics() {
        return 16464;
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

    C0501a(List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    private C0501a(C0501a c0501a, int i, int i2) {
        this.a = m8823(c0501a);
        this.b = i;
        this.c = i2;
    }

    private int a() {
        int iM8824 = m8824(this);
        if (iM8824 >= 0) {
            return iM8824;
        }
        int iM8675 = C0091.m8675(m8823(this));
        this.c = iM8675;
        return iM8675;
    }

    @Override // j$.util.f0
    public final f0 trySplit() {
        int iM8826 = m8826(this);
        int iM8825 = m8825(this);
        int i = (iM8826 + iM8825) >>> 1;
        if (iM8825 >= i) {
            return null;
        }
        this.b = i;
        return new C0501a(this, iM8825, i);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Consumer consumer) {
        C0092.m8727(consumer);
        int iM8826 = m8826(this);
        int iM8825 = m8825(this);
        if (iM8825 >= iM8826) {
            return false;
        }
        this.b = iM8825 + 1;
        try {
            C0083.m8026(consumer, C0094.m9156(m8823(this), iM8825));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Consumer consumer) {
        C0099.m10863(consumer);
        int iM8826 = m8826(this);
        this.b = iM8826;
        for (int iM8825 = m8825(this); iM8825 < iM8826; iM8825++) {
            try {
                C0083.m8026(consumer, C0094.m9156(m8823(this), iM8825));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.f0
    public final long estimateSize() {
        return m8826(this) - m8825(this);
    }
}
