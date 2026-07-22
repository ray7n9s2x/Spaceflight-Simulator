package j$.time.temporal;

import j$.time.C0089;
import j$.time.C0090;
import j$.time.C0092;
import j$.util.stream.C0097;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final r a = m8199();
    public static final r b = m8198();
    public static final r c = m8197();

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static h m8197() {
        if (C0097.m10823() > 0) {
            return h.WEEK_BASED_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۥ, reason: not valid java name and contains not printable characters */
    public static h m8198() {
        if (C0089.m8594() < 0) {
            return h.WEEK_OF_WEEK_BASED_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static h m8199() {
        if (C0092.m8724() <= 0) {
            return h.QUARTER_OF_YEAR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠, reason: not valid java name and contains not printable characters */
    public static i m8200() {
        if (C0090.m8624() >= 0) {
            return i.WEEK_BASED_YEARS;
        }
        return null;
    }

    static {
        m8200();
        m8200();
    }
}
