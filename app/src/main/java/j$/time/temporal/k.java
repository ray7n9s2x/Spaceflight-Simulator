package j$.time.temporal;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.DateTimeException;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.function.C0095;
import java.io.C0103;

/* JADX INFO: loaded from: classes3.dex */
enum k implements r {
    JULIAN_DAY(C0089.m8581(f456short, 0, 9, 366), 2440588),
    MODIFIED_JULIAN_DAY(C0103.m11135(f456short, 38, 17, 3034), 40587),
    RATA_DIE(C0088.m8518(f456short, 63, 7, 1719), 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f456short = {292, 283, 258, 263, 271, 256, 298, 271, 279, 3272, 3287, 3278, 3275, 3267, 3276, 3293, 3270, 3267, 3291, 3190, 3188, 3199, 3186, 3197, 3186, 3198, 3199, 3172, 3185, 3182, 3191, 3186, 3194, 3189, 3172, 3199, 3194, 3170, 2967, 2997, 3006, 2995, 3004, 2995, 3007, 3006, 2960, 2991, 2998, 2995, 3003, 2996, 2974, 3003, 2979, 1513, 1530, 1519, 1530, 1508, 1535, 1522, 1534, 1765, 1750, 1731, 1750, 1779, 1758, 1746, 3285, 3314, 3306, 3325, 3312, 3317, 3320, 3260, 3306, 3325, 3312, 3305, 3321, 3238, 3260, 2206, 2995, 2952, 2965, 2963, 2966, 2966, 2953, 2964, 2962, 2947, 2946, 3014, 2944, 2959, 2947, 2954, 2946, 3036, 3014};
    private final transient String a;
    private final transient w b;
    private final transient long c;

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = w.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.r
    public final w j() {
        return this.b;
    }

    @Override // j$.time.temporal.r
    public final boolean m(o oVar) {
        return oVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final w s(o oVar) {
        if (!oVar.f(a.EPOCH_DAY)) {
            throw new DateTimeException(C0095.m9204(f456short, 86, 19, 3046) + this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.r
    public final long k(o oVar) {
        return oVar.s(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.r
    public final m n(m mVar, long j) {
        if (!this.b.i(j)) {
            throw new DateTimeException(C0082.m7966(f456short, 70, 15, 3228) + this.a + C0080.m7573(f456short, 85, 1, 2238) + j);
        }
        return mVar.d(j$.com.android.tools.r8.a.l(j, this.c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
