package j$.time.temporal;

import j$.time.C0092;
import j$.time.zone.C0088;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final r a;

    /* JADX INFO: renamed from: ۟ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static k m8201() {
        if (C0088.m8503() > 0) {
            return k.JULIAN_DAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۦ, reason: not valid java name and contains not printable characters */
    public static k m8202() {
        if (C0092.m8724() < 0) {
            return k.MODIFIED_JULIAN_DAY;
        }
        return null;
    }

    static {
        m8201();
        a = m8202();
        m8201();
    }
}
