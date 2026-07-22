package j$.time.zone;

import j$.sun.misc.C0079;
import j$.time.format.C0084;
import java.util.function.C0105;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;
    private static final /* synthetic */ d[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f468short = {2003, 2002, 1989, 780, 794, 791, 791, 407, 400, 389, 394, 384, 389, 406, 384};

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }

    static {
        d dVar = new d(C0105.m11310(f468short, 0, 3, 1926), 0);
        UTC = dVar;
        d dVar2 = new d(C0079.m7503(f468short, 3, 4, 859), 1);
        WALL = dVar2;
        d dVar3 = new d(C0084.m8120(f468short, 7, 8, 452), 2);
        STANDARD = dVar3;
        a = new d[]{dVar, dVar2, dVar3};
    }
}
