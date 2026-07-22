package j$.util.concurrent;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.stream.C0099;

/* JADX INFO: loaded from: classes3.dex */
final class r extends l {
    r e;
    r f;
    r g;
    r h;
    boolean i;

    /* JADX INFO: renamed from: ۟۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static Class m9000(Object obj) {
        if (C0088.m8503() > 0) {
            return ConcurrentHashMap.c(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m9001(Object obj) {
        if (C0094.m9148() >= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static r m9002(Object obj, int i, Object obj2, Object obj3) {
        if (C0091.m8708() >= 0) {
            return ((r) obj).b(i, obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static r m9003(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((r) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int m9004(Object obj) {
        if (C0090.m8624() > 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m9005() {
        if (C0081.m7818() < 0) {
            return ConcurrentHashMap.g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۦۨ, reason: contains not printable characters */
    public static r m9006(Object obj) {
        if (C0082.m7983() <= 0) {
            return ((r) obj).f;
        }
        return null;
    }

    r(int i, Object obj, Object obj2, l lVar, r rVar) {
        super(i, obj, obj2, lVar);
        this.e = rVar;
    }

    @Override // j$.util.concurrent.l
    final l a(int i, Object obj) {
        return m9002(this, i, obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0059 A[PHI: r8
  0x0059: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:30:0x0052, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final j$.util.concurrent.r b(int r57, java.lang.Object r58, java.lang.Class r59) {
        /*
            r56 = this;
            r8 = r59
            r7 = r58
            r6 = r57
            r5 = r56
            if (r7 == 0) goto L64
            r0 = r5
        Lb:
            j$.util.concurrent.r r1 = m9006(r0)
            j$.util.concurrent.r r2 = m9003(r0)
            int r3 = m9004(r0)
            if (r3 <= r6) goto L1a
            goto L32
        L1a:
            if (r3 >= r6) goto L1d
            goto L2e
        L1d:
            java.lang.Object r3 = m9001(r0)
            if (r3 == r7) goto L63
            if (r3 == 0) goto L2c
            boolean r4 = j$.time.temporal.C0085.m8250(r7, r3)
            if (r4 == 0) goto L2c
            goto L63
        L2c:
            if (r1 != 0) goto L30
        L2e:
            r0 = r2
            goto L60
        L30:
            if (r2 != 0) goto L34
        L32:
            r0 = r1
            goto L60
        L34:
            if (r8 != 0) goto L3c
            java.lang.Class r8 = m9000(r7)
            if (r8 == 0) goto L59
        L3c:
            int r0 = m9005()
            if (r3 == 0) goto L51
            java.lang.Class r0 = j$.time.C0092.m8727(r3)
            if (r0 == r8) goto L49
            goto L51
        L49:
            r0 = r7
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = java.io.C0103.m11173(r0, r3)
            goto L52
        L51:
            r0 = 0
        L52:
            if (r0 == 0) goto L59
            if (r0 >= 0) goto L57
            goto L32
        L57:
            r1 = r2
            goto L32
        L59:
            j$.util.concurrent.r r0 = m9002(r2, r6, r7, r8)
            if (r0 == 0) goto L32
            return r0
        L60:
            if (r0 != 0) goto Lb
            goto L64
        L63:
            return r0
        L64:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.b(int, java.lang.Object, java.lang.Class):j$.util.concurrent.r");
    }
}
