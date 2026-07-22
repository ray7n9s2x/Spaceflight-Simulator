package j$.util.stream;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0547f2 extends AbstractC0557h2 {
    /* JADX INFO: renamed from: ۟۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static j$.util.f0 m10084(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((AbstractC0524b) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m10085() {
        if (C0089.m8594() <= 0) {
            return EnumC0543e3.r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10086(Object obj) {
        if (C0085.m8230() > 0) {
            return ((AbstractC0524b) obj).isParallel();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۨۨ, reason: contains not printable characters */
    public static boolean m10087(Object obj) {
        if (C0092.m8724() < 0) {
            return ((AbstractC0524b) obj).H();
        }
        return false;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !m10087(this) ? this : new C0542e2(this, m10085(), 1);
    }

    @Override // j$.util.stream.AbstractC0524b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0557h2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!m10086(this)) {
            C0088.m8509(m10084(this), consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0557h2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!m10086(this)) {
            C0088.m8509(m10084(this), consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
