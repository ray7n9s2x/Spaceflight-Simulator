package j$.util.concurrent;

import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.zone.C0087;
import j$.util.C0101;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
abstract class t {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f489short = {1782, 1773, 1780, 1780};

    /* JADX INFO: renamed from: ۨ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m9020() {
        if (C0106.m11345() < 0) {
            return f489short;
        }
        return null;
    }

    static String a(Object obj, Object obj2) {
        String strM8479;
        String strM84792;
        String strM11060 = C0101.m11060(m9020(), 0, 4, 1688);
        if (obj == null || (strM8479 = C0087.m8479(obj)) == null) {
            strM8479 = strM11060;
        }
        int iM8751 = C0092.m8751(strM8479);
        if (obj2 != null && (strM84792 = C0087.m8479(obj2)) != null) {
            strM11060 = strM84792;
        }
        int iM87512 = C0092.m8751(strM11060);
        char[] cArr = new char[iM8751 + iM87512 + 1];
        C0080.m7568(strM8479, 0, iM8751, cArr, 0);
        cArr[iM8751] = '=';
        C0080.m7568(strM11060, 0, iM87512, cArr, iM8751 + 1);
        return new String(cArr);
    }
}
