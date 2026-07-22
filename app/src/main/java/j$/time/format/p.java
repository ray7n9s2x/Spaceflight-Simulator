package j$.time.format;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0091;
import j$.time.Instant;
import j$.time.chrono.InterfaceC0489b;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.z;
import j$.util.C0100;
import j$.util.C0101;
import j$.util.C0102;
import j$.util.concurrent.C0093;
import j$.util.function.C0095;
import j$.util.stream.C0099;
import java.io.C0103;

/* JADX INFO: loaded from: classes3.dex */
final class p implements j$.time.temporal.o {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f430short = {962, 917, 907, 918, 906, 962, 897, 906, 912, 909, 908, 909, 910, 909, 901, 923, 962, 606, 521, 535, 522, 534, 606, 516, 529, 528, 539, 606};
    final /* synthetic */ InterfaceC0489b a;
    final /* synthetic */ Instant b;
    final /* synthetic */ j$.time.chrono.n c;
    final /* synthetic */ z d;

    /* JADX INFO: renamed from: ۟ۡۧۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7953() {
        if (C0091.m8708() >= 0) {
            return f430short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Instant m7954(Object obj) {
        if (C0082.m7983() < 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۨ, reason: not valid java name and contains not printable characters */
    public static j$.time.chrono.n m7955(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0489b m7956(Object obj) {
        if (C0100.m10983() >= 0) {
            return ((p) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static z m7957(Object obj) {
        if (C0080.m7553() >= 0) {
            return ((p) obj).d;
        }
        return null;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return C0103.m11167(this, rVar);
    }

    p(InterfaceC0489b interfaceC0489b, Instant instant, j$.time.chrono.n nVar, z zVar) {
        this.a = interfaceC0489b;
        this.b = instant;
        this.c = nVar;
        this.d = zVar;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC0489b interfaceC0489bM7956 = m7956(this);
        if (interfaceC0489bM7956 != null && C0079.m7519(rVar)) {
            return C0080.m7571(interfaceC0489bM7956, rVar);
        }
        return C0090.m8646(m7954(this), rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        InterfaceC0489b interfaceC0489bM7956 = m7956(this);
        if (interfaceC0489bM7956 != null && C0079.m7519(rVar)) {
            return C0084.m8099(interfaceC0489bM7956, rVar);
        }
        return C0101.m11036(m7954(this), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        InterfaceC0489b interfaceC0489bM7956 = m7956(this);
        if (interfaceC0489bM7956 != null && C0079.m7519(rVar)) {
            return C0100.m11007(interfaceC0489bM7956, rVar);
        }
        return C0083.m8016(m7954(this), rVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == C0086.m8277()) {
            return m7955(this);
        }
        if (tVar == C0084.m8090()) {
            return m7957(this);
        }
        if (tVar == C0102.m11078()) {
            return C0090.m8647(m7954(this), tVar);
        }
        return C0095.m9223(tVar, this);
    }

    public final String toString() {
        String strM10924;
        String strM11090 = C0102.m11090();
        j$.time.chrono.n nVarM7955 = m7955(this);
        if (nVarM7955 != null) {
            StringBuilder sb = new StringBuilder(C0093.m9062(m7953(), 0, 17, 994));
            C0082.m7988(sb, nVarM7955);
            strM10924 = C0099.m10924(sb);
        } else {
            strM10924 = strM11090;
        }
        z zVarM7957 = m7957(this);
        if (zVarM7957 != null) {
            StringBuilder sb2 = new StringBuilder(C0085.m8236(m7953(), 17, 11, 638));
            C0082.m7988(sb2, zVarM7957);
            strM11090 = C0099.m10924(sb2);
        }
        StringBuilder sb3 = new StringBuilder();
        C0082.m7988(sb3, m7954(this));
        C0101.m11052(sb3, strM10924);
        C0101.m11052(sb3, strM11090);
        return C0099.m10924(sb3);
    }
}
