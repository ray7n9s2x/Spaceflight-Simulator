package j$.util.concurrent;

import j$.sun.nio.cs.C0080;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.stream.C0099;
import java.io.C0104;

/* JADX INFO: loaded from: classes3.dex */
final class g extends l {
    final l[] e;

    /* JADX INFO: renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m8917(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static l m8918(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((l) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static l m8919(Object obj, int i, Object obj2) {
        if (C0099.m10878() <= 0) {
            return ((l) obj).a(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8920(Object obj) {
        if (C0081.m7818() < 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۧ۠, reason: not valid java name and contains not printable characters */
    public static l m8921(Object obj, int i) {
        if (C0104.m11196() > 0) {
            return ConcurrentHashMap.k((l[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۨۤ, reason: not valid java name and contains not printable characters */
    public static l[] m8922(Object obj) {
        if (C0083.m8022() < 0) {
            return ((g) obj).e;
        }
        return null;
    }

    g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final l a(int i, Object obj) {
        int length;
        l lVarM8921;
        Object objM8917;
        l[] lVarArrM8922 = m8922(this);
        loop0: while (obj != null && lVarArrM8922 != null && (length = lVarArrM8922.length) != 0 && (lVarM8921 = m8921(lVarArrM8922, (length - 1) & i)) != null) {
            do {
                int iM8920 = m8920(lVarM8921);
                if (iM8920 == i && ((objM8917 = m8917(lVarM8921)) == obj || (objM8917 != null && C0085.m8250(obj, objM8917)))) {
                    return lVarM8921;
                }
                if (iM8920 < 0) {
                    if (lVarM8921 instanceof g) {
                        lVarArrM8922 = m8922((g) lVarM8921);
                    } else {
                        return m8919(lVarM8921, i, obj);
                    }
                } else {
                    lVarM8921 = m8918(lVarM8921);
                }
            } while (lVarM8921 != null);
        }
        return null;
    }
}
