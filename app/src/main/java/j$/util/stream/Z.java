package j$.util.stream;

import j$.time.C0091;
import j$.time.format.C0083;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0105;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
final class Z extends AbstractC0525b0 {
    /* JADX INFO: renamed from: ۟۠۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static BaseStream m9891(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static j$.util.W m9892(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((AbstractC0525b0) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9893() {
        if (C0083.m8022() < 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m9894(Object obj) {
        if (C0094.m9148() > 0) {
            return ((AbstractC0524b) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static BaseStream m9895(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static j$.util.W m9896(Object obj) {
        if (C0091.m8708() > 0) {
            return AbstractC0525b0.m10002((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9897(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۤۨ, reason: contains not printable characters */
    public static boolean m9898(Object obj) {
        if (C0097.m10823() >= 0) {
            return ((AbstractC0524b) obj).isParallel();
        }
        return false;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !m9897(this) ? this : new C0623v(this, m9893(), 2);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        m9895(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        m9891(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m9892(this);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0525b0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (!m9898(this)) {
            C0093.m9078(m9896(m9894(this)), intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0525b0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (!m9898(this)) {
            C0093.m9078(m9896(m9894(this)), intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
