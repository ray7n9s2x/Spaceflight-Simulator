package j$.util.stream;

import j$.sun.misc.C0079;
import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.function.C0095;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class T3 extends AbstractC0567j2 implements e4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ U3 e;

    /* JADX INFO: renamed from: ۟۠ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9759(Object obj) {
        if (C0099.m10878() < 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9760(Object obj, int i) {
        if (C0095.m9210() > 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m9761(Object obj) {
        if (C0085.m8230() > 0) {
            return ((T3) obj).b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m9762(Object obj) {
        if (C0101.m11044() <= 0) {
            return ((T3) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static U3 m9763(Object obj) {
        if (C0100.m10983() > 0) {
            return ((T3) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9764(Object obj) {
        if (C0079.m7512() > 0) {
            return ((T3) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۤۤ, reason: contains not printable characters */
    public static IntPredicate m9765(Object obj) {
        if (C0090.m8624() > 0) {
            return ((U3) obj).m;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T3(U3 u3, InterfaceC0597p2 interfaceC0597p2, boolean z) {
        super(interfaceC0597p2);
        this.e = u3;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(int r58) {
        /*
            r57 = this;
            r7 = r58
            r6 = r57
            boolean r0 = m9762(r6)
            if (r0 != 0) goto L1f
            j$.util.stream.U3 r0 = m9763(r6)
            java.util.function.IntPredicate r0 = m9765(r0)
            boolean r0 = j$.time.temporal.C0085.m8224(r0, r7)
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
            boolean r1 = m9764(r6)
            if (r1 == 0) goto L31
            if (r0 != 0) goto L31
            long r2 = m9761(r6)
            r4 = 1
            long r2 = r2 + r4
            r6.b = r2
        L31:
            if (r1 != 0) goto L35
            if (r0 == 0) goto L3c
        L35:
            j$.util.stream.p2 r0 = m9759(r6)
            m9760(r0, r7)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.T3.accept(int):void");
    }

    @Override // j$.util.stream.e4
    public final long f() {
        return m9761(this);
    }
}
