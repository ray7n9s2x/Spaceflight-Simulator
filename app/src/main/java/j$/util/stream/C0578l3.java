package j$.util.stream;

import j$.time.C0092;
import j$.time.zone.C0087;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0578l3 extends AbstractC0583m3 implements Consumer {
    final Object[] b;

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m10313(Object obj) {
        if (C0087.m8458() < 0) {
            return ((AbstractC0583m3) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m10314(Object obj) {
        if (C0092.m8724() < 0) {
            return ((C0578l3) obj).b;
        }
        return null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C0099.m10917(this, consumer);
    }

    C0578l3(int i) {
        this.b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int iM10313 = m10313(this);
        this.a = iM10313 + 1;
        m10314(this)[iM10313] = obj;
    }
}
