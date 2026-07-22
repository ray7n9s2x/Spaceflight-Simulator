package j$.util.stream;

import j$.time.format.C0083;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0623v extends AbstractC0520a0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0623v(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static int m10569(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((C0623v) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10569(this)) {
            case 0:
                return new C0608s(this, interfaceC0597p2, 2);
            case 1:
                return new V(this, interfaceC0597p2, 2);
            case 2:
                return interfaceC0597p2;
            default:
                return new C0550g0(this, interfaceC0597p2, 2);
        }
    }
}
