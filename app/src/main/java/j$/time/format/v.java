package j$.time.format;

import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.util.function.C0106;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public static final v ALWAYS;
    public static final v EXCEEDS_PAD;
    public static final v NEVER;
    public static final v NORMAL;
    public static final v NOT_NEGATIVE;
    private static final /* synthetic */ v[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f434short = {3282, 3283, 3278, 3281, 3293, 3280, 1218, 1231, 1236, 1218, 1242, 1232, 667, 656, 643, 656, 647, 2520, 2521, 2498, 2505, 2520, 2515, 2513, 2519, 2498, 2527, 2496, 2515, 2795, 2806, 2797, 2795, 2795, 2794, 2813, 2801, 2814, 2799, 2794};

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }

    static {
        v vVar = new v(C0081.m7837(f434short, 0, 6, 3228), 0);
        NORMAL = vVar;
        v vVar2 = new v(C0095.m9204(f434short, 6, 6, 1155), 1);
        ALWAYS = vVar2;
        v vVar3 = new v(C0092.m8731(f434short, 12, 5, 725), 2);
        NEVER = vVar3;
        v vVar4 = new v(C0106.m11346(f434short, 17, 12, 2454), 3);
        NOT_NEGATIVE = vVar4;
        v vVar5 = new v(C0094.m9107(f434short, 29, 11, 2734), 4);
        EXCEEDS_PAD = vVar5;
        a = new v[]{vVar, vVar2, vVar3, vVar4, vVar5};
    }
}
