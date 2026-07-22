package j$.util.concurrent;

import j$.sun.misc.C0079;
import j$.time.zone.C0088;
import j$.util.C0102;
import java.security.PrivilegedAction;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
final class v implements PrivilegedAction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f490short = {1428, 1439, 1416, 1439, 1488, 1419, 1418, 1431, 1426, 1488, 1421, 1435, 1437, 1419, 1420, 1435, 1452, 1439, 1424, 1434, 1425, 1427, 1453, 1435, 1435, 1434};

    /* JADX INFO: renamed from: ۤ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9021() {
        if (C0105.m11264() >= 0) {
            return f490short;
        }
        return null;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return C0079.m7502(C0102.m11068(C0088.m8518(m9021(), 0, 26, 1534)));
    }
}
