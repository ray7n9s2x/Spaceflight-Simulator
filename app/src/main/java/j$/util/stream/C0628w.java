package j$.util.stream;

import j$.util.C0102;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0628w extends AbstractC0575l0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0628w(AbstractC0524b abstractC0524b, int i, int i2) {
        super(abstractC0524b, i, 1);
        this.m = i2;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۥ, reason: not valid java name and contains not printable characters */
    public static int m10587(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C0628w) obj).m;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0524b
    final InterfaceC0597p2 N(int i, InterfaceC0597p2 interfaceC0597p2) {
        switch (m10587(this)) {
            case 0:
                return new C0608s(this, interfaceC0597p2, 3);
            case 1:
                return new X(0, interfaceC0597p2);
            case 2:
                return new V(this, interfaceC0597p2, 3);
            case 3:
                return new C0550g0(this, interfaceC0597p2, 1);
            case 4:
                return interfaceC0597p2;
            default:
                return new C0550g0(this, interfaceC0597p2, 4);
        }
    }
}
