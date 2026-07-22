package j$.util.concurrent;

import j$.time.C0090;
import j$.time.C0091;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.function.C0094;
import j$.util.stream.C0096;
import j$.util.stream.C0097;
import j$.util.stream.C0098;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class q extends l {
    private static final j$.sun.misc.a h;
    private static final long i;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f488short = {889, 890, 886, 894, 838, 865, 884, 865, 880};
    r e;
    volatile r f;
    volatile Thread g;
    volatile int lockState;

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Class m8976(Object obj) {
        if (C0083.m8022() < 0) {
            return ConcurrentHashMap.c(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static r m8977(Object obj, Object obj2) {
        if (C0096.m10782() > 0) {
            return h((r) obj, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8978() {
        if (C0099.m10878() <= 0) {
            return f488short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static r m8979(Object obj, Object obj2) {
        if (C0098.m10857() <= 0) {
            return c((r) obj, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۧ, reason: not valid java name and contains not printable characters */
    public static r m8980(Object obj) {
        if (C0082.m7983() < 0) {
            return ((r) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static r m8981(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((r) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8982(Object obj) {
        if (C0084.m8116() >= 0) {
            return ((r) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static r m8983(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((q) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static r m8984(Object obj) {
        if (C0101.m11044() < 0) {
            return ((q) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static l m8985(Object obj) {
        if (C0096.m10782() > 0) {
            return ((l) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static r m8986(Object obj) {
        if (C0090.m8624() > 0) {
            return ((r) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static j$.sun.misc.a m8987() {
        if (C0083.m8022() <= 0) {
            return h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static r m8988(Object obj, Object obj2) {
        if (C0105.m11264() > 0) {
            return b((r) obj, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static r m8989(Object obj) {
        if (C0091.m8708() > 0) {
            return ((r) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m8990() {
        if (C0090.m8624() >= 0) {
            return ConcurrentHashMap.g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m8991() {
        if (C0085.m8230() > 0) {
            return i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m8992(Object obj) {
        if (C0103.m11154() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int m8993(Object obj, Object obj2) {
        if (C0103.m11154() < 0) {
            return i(obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static r m8994(Object obj, Object obj2) {
        if (C0085.m8230() >= 0) {
            return g((r) obj, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Thread m8995(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((q) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static r m8996(Object obj, int i2, Object obj2, Object obj3) {
        if (C0097.m10823() > 0) {
            return ((r) obj).b(i2, obj2, (Class) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m8997(Object obj) {
        if (C0082.m7983() < 0) {
            return ((q) obj).lockState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8998(Object obj) {
        if (C0105.m11264() >= 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8999(Object obj) {
        if (C0087.m8458() <= 0) {
            ((q) obj).d();
        }
    }

    static int i(Object obj, Object obj2) {
        int iM8726;
        return (obj == null || obj2 == null || (iM8726 = C0092.m8726(C0084.m8091(C0092.m8727(obj)), C0084.m8091(C0092.m8727(obj2)))) == 0) ? C0081.m7863(obj) <= C0081.m7863(obj2) ? -1 : 1 : iM8726;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r7
  0x005b: PHI (r7v3 java.lang.Class) = (r7v2 java.lang.Class), (r7v4 java.lang.Class) binds: [B:24:0x0059, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    q(j$.util.concurrent.r r62) {
        /*
            r61 = this;
            r11 = r62
            r10 = r61
            r0 = -2
            r1 = 0
            r10.<init>(r0, r1, r1)
            r10.f = r11
            r0 = r1
        Lc:
            if (r11 == 0) goto L80
            j$.util.concurrent.l r2 = m8985(r11)
            j$.util.concurrent.r r2 = (j$.util.concurrent.r) r2
            r11.g = r1
            r11.f = r1
            r3 = 0
            if (r0 != 0) goto L21
            r11.e = r1
            r11.i = r3
        L1f:
            r0 = r11
            goto L7c
        L21:
            java.lang.Object r4 = m8992(r11)
            int r5 = m8998(r11)
            r6 = r0
            r7 = r1
        L2b:
            java.lang.Object r8 = m8992(r6)
            int r9 = m8998(r6)
            if (r9 <= r5) goto L37
            r8 = -1
            goto L61
        L37:
            if (r9 >= r5) goto L3b
            r8 = 1
            goto L61
        L3b:
            if (r7 != 0) goto L43
            java.lang.Class r7 = m8976(r4)
            if (r7 == 0) goto L5b
        L43:
            int r9 = m8990()
            if (r8 == 0) goto L58
            java.lang.Class r9 = j$.time.C0092.m8727(r8)
            if (r9 == r7) goto L50
            goto L58
        L50:
            r9 = r4
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = java.io.C0103.m11173(r9, r8)
            goto L59
        L58:
            r9 = 0
        L59:
            if (r9 != 0) goto L60
        L5b:
            int r8 = m8993(r4, r8)
            goto L61
        L60:
            r8 = r9
        L61:
            if (r8 > 0) goto L68
            j$.util.concurrent.r r9 = m8986(r6)
            goto L6c
        L68:
            j$.util.concurrent.r r9 = m8981(r6)
        L6c:
            if (r9 != 0) goto L7e
            r11.e = r6
            if (r8 > 0) goto L75
            r6.f = r11
            goto L77
        L75:
            r6.g = r11
        L77:
            j$.util.concurrent.r r11 = m8979(r0, r11)
            goto L1f
        L7c:
            r11 = r2
            goto Lc
        L7e:
            r6 = r9
            goto L2b
        L80:
            r10.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.<init>(j$.util.concurrent.r):void");
    }

    private final void d() {
        if (C0094.m9145(m8987(), this, m8991(), 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int iM8997 = m8997(this);
            if ((iM8997 & (-3)) == 0) {
                if (C0094.m9145(m8987(), this, m8991(), iM8997, 1)) {
                    break;
                }
            } else if ((iM8997 & 2) == 0) {
                if (C0094.m9145(m8987(), this, m8991(), iM8997, iM8997 | 2)) {
                    this.g = C0106.m11341();
                    z = true;
                }
            } else if (z) {
                C0093.m9087(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    @Override // j$.util.concurrent.l
    final l a(int i2, Object obj) {
        Object objM8992;
        Thread threadM8995;
        Thread threadM89952;
        r rVarM8996 = null;
        if (obj != null) {
            l lVarM8984 = m8984(this);
            while (lVarM8984 != null) {
                int iM8997 = m8997(this);
                if ((iM8997 & 3) != 0) {
                    if (m8998(lVarM8984) == i2 && ((objM8992 = m8992(lVarM8984)) == obj || (objM8992 != null && C0085.m8250(obj, objM8992)))) {
                        return lVarM8984;
                    }
                    lVarM8984 = m8985(lVarM8984);
                } else {
                    j$.sun.misc.a aVarM8987 = m8987();
                    long jM8991 = m8991();
                    if (C0094.m9145(aVarM8987, this, jM8991, iM8997, iM8997 + 4)) {
                        try {
                            r rVarM8983 = m8983(this);
                            if (rVarM8983 != null) {
                                rVarM8996 = m8996(rVarM8983, i2, obj, null);
                            }
                            if (C0087.m8483(aVarM8987, this, jM8991) == 6 && (threadM89952 = m8995(this)) != null) {
                                C0103.m11143(threadM89952);
                            }
                            return rVarM8996;
                        } catch (Throwable th) {
                            if (C0087.m8483(m8987(), this, m8991()) == 6 && (threadM8995 = m8995(this)) != null) {
                                C0103.m11143(threadM8995);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r2
  0x006a: PHI (r2v5 java.lang.Class) = (r2v4 java.lang.Class), (r2v6 java.lang.Class) binds: [B:26:0x0068, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final j$.util.concurrent.r e(int r67, java.lang.Object r68, java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4 A[PHI: r0
  0x00b4: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x00b0, B:51:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean f(j$.util.concurrent.r r62) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }

    static r g(r rVar, r rVar2) {
        r rVarM8981;
        r rVar3 = rVar;
        if (rVar2 != null && (rVarM8981 = m8981(rVar2)) != null) {
            r rVarM8986 = m8986(rVarM8981);
            rVar2.g = rVarM8986;
            if (rVarM8986 != null) {
                rVarM8986.e = rVar2;
            }
            r rVarM8980 = m8980(rVar2);
            rVarM8981.e = rVarM8980;
            if (rVarM8980 == null) {
                rVarM8981.i = false;
                rVar3 = rVarM8981;
            } else if (m8986(rVarM8980) == rVar2) {
                rVarM8980.f = rVarM8981;
            } else {
                rVarM8980.g = rVarM8981;
            }
            rVarM8981.f = rVar2;
            rVar2.e = rVarM8981;
        }
        return rVar3;
    }

    static r h(r rVar, r rVar2) {
        r rVarM8986;
        r rVar3 = rVar;
        if (rVar2 != null && (rVarM8986 = m8986(rVar2)) != null) {
            r rVarM8981 = m8981(rVarM8986);
            rVar2.f = rVarM8981;
            if (rVarM8981 != null) {
                rVarM8981.e = rVar2;
            }
            r rVarM8980 = m8980(rVar2);
            rVarM8986.e = rVarM8980;
            if (rVarM8980 == null) {
                rVarM8986.i = false;
                rVar3 = rVarM8986;
            } else if (m8981(rVarM8980) == rVar2) {
                rVarM8980.g = rVarM8986;
            } else {
                rVarM8980.f = rVarM8986;
            }
            rVarM8986.g = rVar2;
            rVar2.e = rVarM8986;
        }
        return rVar3;
    }

    static r c(r rVar, r rVar2) {
        r rVarM8980;
        r rVar3 = rVar2;
        r rVarM8977 = rVar;
        rVar3.i = true;
        while (true) {
            r rVarM89802 = m8980(rVar3);
            if (rVarM89802 == null) {
                rVar3.i = false;
                return rVar3;
            }
            if (!m8982(rVarM89802) || (rVarM8980 = m8980(rVarM89802)) == null) {
                break;
            }
            r rVarM8986 = m8986(rVarM8980);
            if (rVarM89802 == rVarM8986) {
                r rVarM8981 = m8981(rVarM8980);
                if (rVarM8981 != null && m8982(rVarM8981)) {
                    rVarM8981.i = false;
                    rVarM89802.i = false;
                    rVarM8980.i = true;
                    rVar3 = rVarM8980;
                } else {
                    if (rVar3 == m8981(rVarM89802)) {
                        rVarM8977 = m8994(rVarM8977, rVarM89802);
                        r rVarM89803 = m8980(rVarM89802);
                        rVarM8980 = rVarM89803 == null ? null : m8980(rVarM89803);
                        rVarM89802 = rVarM89803;
                        rVar3 = rVarM89802;
                    }
                    if (rVarM89802 != null) {
                        rVarM89802.i = false;
                        if (rVarM8980 != null) {
                            rVarM8980.i = true;
                            rVarM8977 = m8977(rVarM8977, rVarM8980);
                        }
                    }
                }
            } else if (rVarM8986 != null && m8982(rVarM8986)) {
                rVarM8986.i = false;
                rVarM89802.i = false;
                rVarM8980.i = true;
                rVar3 = rVarM8980;
            } else {
                if (rVar3 == m8986(rVarM89802)) {
                    rVarM8977 = m8977(rVarM8977, rVarM89802);
                    r rVarM89804 = m8980(rVarM89802);
                    rVarM8980 = rVarM89804 == null ? null : m8980(rVarM89804);
                    rVarM89802 = rVarM89804;
                    rVar3 = rVarM89802;
                }
                if (rVarM89802 != null) {
                    rVarM89802.i = false;
                    if (rVarM8980 != null) {
                        rVarM8980.i = true;
                        rVarM8977 = m8994(rVarM8977, rVarM8980);
                    }
                }
            }
        }
        return rVarM8977;
    }

    static r b(r rVar, r rVar2) {
        r rVar3 = rVar2;
        r rVarM8994 = rVar;
        while (rVar3 != null && rVar3 != rVarM8994) {
            r rVarM8980 = m8980(rVar3);
            if (rVarM8980 == null) {
                rVar3.i = false;
                return rVar3;
            }
            if (m8982(rVar3)) {
                rVar3.i = false;
                return rVarM8994;
            }
            r rVarM8986 = m8986(rVarM8980);
            if (rVarM8986 == rVar3) {
                r rVarM8981 = m8981(rVarM8980);
                if (rVarM8981 != null && m8982(rVarM8981)) {
                    rVarM8981.i = false;
                    rVarM8980.i = true;
                    rVarM8994 = m8994(rVarM8994, rVarM8980);
                    rVarM8980 = m8980(rVar3);
                    rVarM8981 = rVarM8980 == null ? null : m8981(rVarM8980);
                }
                if (rVarM8981 != null) {
                    r rVarM89862 = m8986(rVarM8981);
                    r rVarM89812 = m8981(rVarM8981);
                    if ((rVarM89812 == null || !m8982(rVarM89812)) && (rVarM89862 == null || !m8982(rVarM89862))) {
                        rVarM8981.i = true;
                    } else {
                        if (rVarM89812 == null || !m8982(rVarM89812)) {
                            if (rVarM89862 != null) {
                                rVarM89862.i = false;
                            }
                            rVarM8981.i = true;
                            rVarM8994 = m8977(rVarM8994, rVarM8981);
                            rVarM8980 = m8980(rVar3);
                            rVarM8981 = rVarM8980 != null ? m8981(rVarM8980) : null;
                        }
                        if (rVarM8981 != null) {
                            rVarM8981.i = rVarM8980 == null ? false : m8982(rVarM8980);
                            r rVarM89813 = m8981(rVarM8981);
                            if (rVarM89813 != null) {
                                rVarM89813.i = false;
                            }
                        }
                        if (rVarM8980 != null) {
                            rVarM8980.i = false;
                            rVarM8994 = m8994(rVarM8994, rVarM8980);
                        }
                        rVar3 = rVarM8994;
                    }
                }
                rVar3 = rVarM8980;
            } else {
                if (rVarM8986 != null && m8982(rVarM8986)) {
                    rVarM8986.i = false;
                    rVarM8980.i = true;
                    rVarM8994 = m8977(rVarM8994, rVarM8980);
                    rVarM8980 = m8980(rVar3);
                    rVarM8986 = rVarM8980 == null ? null : m8986(rVarM8980);
                }
                if (rVarM8986 != null) {
                    r rVarM89863 = m8986(rVarM8986);
                    r rVarM89814 = m8981(rVarM8986);
                    if ((rVarM89863 == null || !m8982(rVarM89863)) && (rVarM89814 == null || !m8982(rVarM89814))) {
                        rVarM8986.i = true;
                    } else {
                        if (rVarM89863 == null || !m8982(rVarM89863)) {
                            if (rVarM89814 != null) {
                                rVarM89814.i = false;
                            }
                            rVarM8986.i = true;
                            rVarM8994 = m8994(rVarM8994, rVarM8986);
                            rVarM8980 = m8980(rVar3);
                            rVarM8986 = rVarM8980 != null ? m8986(rVarM8980) : null;
                        }
                        if (rVarM8986 != null) {
                            rVarM8986.i = rVarM8980 == null ? false : m8982(rVarM8980);
                            r rVarM89864 = m8986(rVarM8986);
                            if (rVarM89864 != null) {
                                rVarM89864.i = false;
                            }
                        }
                        if (rVarM8980 != null) {
                            rVarM8980.i = false;
                            rVarM8994 = m8977(rVarM8994, rVarM8980);
                        }
                        rVar3 = rVarM8994;
                    }
                }
                rVar3 = rVarM8980;
            }
        }
        return rVarM8994;
    }

    static {
        j$.sun.misc.a aVarM9063 = C0093.m9063();
        h = aVarM9063;
        i = C0092.m8754(aVarM9063, q.class, C0084.m8120(m8978(), 0, 9, 789));
    }
}
