package j$.util.stream;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.temporal.C0085;
import java.io.C0104;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class P3 extends AbstractC0577l2 implements e4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Q3 e;

    /* JADX INFO: renamed from: ۟۠۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static long m9652(Object obj) {
        if (C0085.m8230() > 0) {
            return ((P3) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9653(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((AbstractC0577l2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9654(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((P3) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static Predicate m9655(Object obj) {
        if (C0099.m10878() <= 0) {
            return ((Q3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۥ, reason: contains not printable characters */
    public static boolean m9656(Object obj) {
        if (C0104.m11196() > 0) {
            return ((P3) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۧۨ, reason: not valid java name and contains not printable characters */
    public static Q3 m9657(Object obj) {
        if (C0089.m8594() <= 0) {
            return ((P3) obj).e;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P3(Q3 q3, InterfaceC0597p2 interfaceC0597p2, boolean z) {
        super(interfaceC0597p2);
        this.e = q3;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r58) {
        /*
            r57 = this;
            r7 = r58
            r6 = r57
            boolean r0 = m9656(r6)
            if (r0 != 0) goto L1f
            j$.util.stream.Q3 r0 = m9657(r6)
            java.util.function.Predicate r0 = m9655(r0)
            boolean r0 = j$.time.temporal.C0086.m8320(r0, r7)
            r1 = r0 ^ 1
            r6.c = r1
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            boolean r1 = m9654(r6)
            if (r1 == 0) goto L31
            if (r0 != 0) goto L31
            long r2 = m9652(r6)
            r4 = 1
            long r2 = r2 + r4
            r6.b = r2
        L31:
            if (r1 != 0) goto L35
            if (r0 == 0) goto L3c
        L35:
            j$.util.stream.p2 r0 = m9653(r6)
            j$.time.format.C0083.m8026(r0, r7)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.P3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.e4
    public final long f() {
        return m9652(this);
    }
}
