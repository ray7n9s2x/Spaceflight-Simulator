package j$.util.stream;

import j$.time.C0090;
import java.io.C0104;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0555h0 extends AbstractC0572k2 {
    /* JADX INFO: renamed from: ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m10179(Object obj, double d) {
        if (C0104.m11196() >= 0) {
            ((InterfaceC0597p2) obj).accept(d);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m10180(Object obj) {
        if (C0090.m8624() >= 0) {
            return ((AbstractC0572k2) obj).a;
        }
        return null;
    }

    @Override // j$.util.stream.InterfaceC0592o2, java.util.function.LongConsumer
    public final void accept(long j) {
        m10179(m10180(this), j);
    }
}
