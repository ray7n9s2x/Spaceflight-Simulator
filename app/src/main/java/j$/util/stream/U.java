package j$.util.stream;

import j$.time.format.C0082;
import j$.time.zone.C0087;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements IntConsumer {
    public final /* synthetic */ InterfaceC0597p2 a;

    /* JADX INFO: renamed from: ۦ۟ۧ۟, reason: contains not printable characters */
    public static void m9766(Object obj, int i) {
        if (C0096.m10782() > 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        m9766(C0087.m8476(this), i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }
}
