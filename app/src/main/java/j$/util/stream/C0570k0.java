package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0089;
import j$.time.format.C0082;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0570k0 extends AbstractC0580m0 {
    /* JADX INFO: renamed from: ۟ۢۡۢۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10277(Object obj) {
        if (C0098.m10857() < 0) {
            return ((AbstractC0580m0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static BaseStream m10278(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۥ, reason: not valid java name and contains not printable characters */
    public static BaseStream m10279(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10280(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0524b) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.Z m10281(Object obj) {
        if (C0095.m9210() >= 0) {
            return AbstractC0580m0.m10336((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10282(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۣۢ, reason: contains not printable characters */
    public static boolean m10283(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static int m10284() {
        if (C0082.m7983() <= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !m10282(this) ? this : new C0628w(this, m10284(), 4);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        m10278(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        m10279(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m10277(this);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0580m0, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        if (!m10283(this)) {
            C0079.m7485(m10281(m10280(this)), longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0580m0, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (!m10283(this)) {
            C0079.m7485(m10281(m10280(this)), longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
