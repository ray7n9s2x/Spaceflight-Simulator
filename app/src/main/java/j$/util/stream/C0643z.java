package j$.util.stream;

import j$.time.C0089;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0643z extends B {
    /* JADX INFO: renamed from: ۣ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10668(Object obj) {
        if (C0106.m11345() < 0) {
            return ((AbstractC0524b) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m10669(Object obj) {
        if (C0083.m8022() < 0) {
            return B.m9358((j$.util.f0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m10670() {
        if (C0104.m11196() >= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static BaseStream m10671(Object obj) {
        if (C0095.m9210() > 0) {
            return ((AbstractC0524b) obj).sequential();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۧ, reason: not valid java name and contains not printable characters */
    public static j$.util.T m10672(Object obj) {
        if (C0089.m8594() < 0) {
            return ((B) obj).spliterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10673(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۨ۠, reason: not valid java name and contains not printable characters */
    public static BaseStream m10674(Object obj) {
        if (C0089.m8594() < 0) {
            return ((AbstractC0524b) obj).parallel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10675(Object obj) {
        if (C0096.m10782() > 0) {
            return ((AbstractC0524b) obj).P();
        }
        return null;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !m10673(this) ? this : new C0618u(this, m10670(), 1);
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        m10674(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
        m10671(this);
        return this;
    }

    @Override // j$.util.stream.AbstractC0524b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return m10672(this);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (!m10668(this)) {
            C0097.m10836(m10669(m10675(this)), doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (!m10668(this)) {
            C0097.m10836(m10669(m10675(this)), doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
