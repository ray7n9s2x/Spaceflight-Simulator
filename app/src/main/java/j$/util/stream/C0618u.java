package j$.util.stream;

import j$.util.concurrent.C0093;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0618u extends A {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0618u(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int m10554(Object obj) {
        if (C0093.m9101() > 0) {
            return ((C0618u) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10554(this)) {
            case 0:
                return new C0608s(this, interfaceC0597p2, 1);
            case 1:
                return interfaceC0597p2;
            case 2:
                return new C0608s(this, interfaceC0597p2, 4);
            case 3:
                return new X(1, interfaceC0597p2);
            case 4:
                return new V(this, interfaceC0597p2, 4);
            case 5:
                return new C0555h0(interfaceC0597p2);
            default:
                return new C0550g0(this, interfaceC0597p2, 3);
        }
    }
}
