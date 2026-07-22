package j$.time.format;

import j$.time.zone.C0088;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    private static final Comparator b;
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ s a;

    /* JADX INFO: renamed from: ۟ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Comparator m7879() {
        if (C0088.m8503() > 0) {
            return b;
        }
        return null;
    }

    static {
        new ConcurrentHashMap(16, 2);
        b = new r();
    }

    c(s sVar) {
        this.a = sVar;
    }
}
