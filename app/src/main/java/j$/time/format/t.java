package j$.time.format;

import j$.sun.misc.C0079;
import j$.time.C0092;
import j$.util.C0100;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f432short = {499, 466, 468, 478, 474, 470, 475, 484, 451, 462, 475, 466, 492, 391, 412, 410, 409, 490};
    public static final t a = new t();

    /* JADX INFO: renamed from: ۟ۥۥۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7965() {
        if (C0079.m7512() > 0) {
            return f432short;
        }
        return null;
    }

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        C0092.m8727((t) obj);
        return true;
    }

    public final String toString() {
        return C0100.m10962(m7965(), 0, 18, 439);
    }
}
