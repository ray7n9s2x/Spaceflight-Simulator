package j$.util;

import j$.time.chrono.C0081;
import java.io.C0103;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class r extends C0512l implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static List m9301(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0512l) obj).b;
        }
        return null;
    }

    @Override // j$.util.C0512l, java.util.List
    public final List subList(int i, int i2) {
        return new r(C0103.m11129(m9301(this), i, i2));
    }

    private Object writeReplace() {
        return new C0512l(m9301(this));
    }
}
