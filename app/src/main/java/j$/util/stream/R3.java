package j$.util.stream;

import j$.time.C0089;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.util.concurrent.C0093;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes3.dex */
final class R3 extends AbstractC0567j2 {
    boolean b;
    final /* synthetic */ S3 c;

    /* JADX INFO: renamed from: ۟ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m9688(Object obj, int i) {
        if (C0089.m8594() <= 0) {
            ((InterfaceC0597p2) obj).accept(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC0597p2 m9689(Object obj) {
        if (C0098.m10857() < 0) {
            return ((AbstractC0567j2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۦ, reason: not valid java name and contains not printable characters */
    public static S3 m9690(Object obj) {
        if (C0083.m8022() <= 0) {
            return ((R3) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m9691(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((S3) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9692(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((R3) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9693(Object obj) {
        if (C0093.m9101() > 0) {
            return ((InterfaceC0597p2) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m9694(Object obj, long j) {
        if (C0084.m8116() > 0) {
            ((InterfaceC0597p2) obj).l(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R3(S3 s3, InterfaceC0597p2 interfaceC0597p2) {
        super(interfaceC0597p2);
        this.c = s3;
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final void l(long j) {
        m9694(m9689(this), -1L);
    }

    @Override // j$.util.stream.InterfaceC0587n2, j$.util.stream.InterfaceC0597p2
    public final void accept(int i) {
        if (m9692(this)) {
            boolean zM8224 = C0085.m8224(m9691(m9690(this)), i);
            this.b = zM8224;
            if (zM8224) {
                m9688(m9689(this), i);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0567j2, j$.util.stream.InterfaceC0597p2
    public final boolean n() {
        return !m9692(this) || m9693(m9689(this));
    }
}
