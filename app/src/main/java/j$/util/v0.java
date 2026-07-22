package j$.util;

import j$.time.C0089;
import j$.time.format.C0082;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.stream.C0099;

/* JADX INFO: loaded from: classes3.dex */
abstract class v0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f559short = {2189, 2265, 2271, 2244, 2269, 2266, 2244, 2271, 2248, 2189, 2265, 2271, 2244, 2269, 2269, 2248, 2249, 2189, 2255, 2264, 2265, 2189, 2241, 2242, 2250, 2250, 2244, 2243, 2250, 2189, 2243, 2242, 2265, 2189, 2270, 2264, 2269, 2269, 2242, 2271, 2265, 2248, 2249, 2199, 2189};
    static final boolean a = C0089.m8595((Boolean) C0089.m8602(new u0()));

    /* JADX INFO: renamed from: ۣ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m10956() {
        if (C0088.m8503() > 0) {
            return f559short;
        }
        return null;
    }

    static void a(Class cls, String str) {
        StringBuilder sb = new StringBuilder();
        C0082.m7988(sb, cls);
        C0101.m11052(sb, C0094.m9107(m10956(), 0, 45, 2221));
        C0101.m11052(sb, str);
        throw new UnsupportedOperationException(C0099.m10924(sb));
    }
}
