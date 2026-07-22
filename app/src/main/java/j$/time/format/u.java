package j$.time.format;

import j$.time.zone.C0088;
import j$.util.stream.C0097;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public static final u LENIENT;
    public static final u SMART;
    public static final u STRICT;
    private static final /* synthetic */ u[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f433short = {1231, 1224, 1230, 1237, 1247, 1224, 837, 859, 855, 836, 834, 3114, 3107, 3112, 3119, 3107, 3112, 3122};

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) a.clone();
    }

    static {
        u uVar = new u(C0097.m10853(f433short, 0, 6, 1180), 0);
        STRICT = uVar;
        u uVar2 = new u(C0088.m8518(f433short, 6, 5, 790), 1);
        SMART = uVar2;
        u uVar3 = new u(C0084.m8120(f433short, 11, 7, 3174), 2);
        LENIENT = uVar3;
        a = new u[]{uVar, uVar2, uVar3};
    }
}
