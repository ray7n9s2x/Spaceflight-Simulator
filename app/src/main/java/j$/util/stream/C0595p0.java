package j$.util.stream;

import java.io.C0104;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0595p0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC0629w0 b;

    public /* synthetic */ C0595p0(EnumC0629w0 enumC0629w0, int i) {
        this.a = i;
        this.b = enumC0629w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (C0104.m11218(this)) {
            case 0:
                return new C0614t0(C0096.m10760(this));
            default:
                return new C0619u0(C0096.m10760(this));
        }
    }
}
