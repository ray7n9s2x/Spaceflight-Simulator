package j$.util.stream;

import j$.time.C0089;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.util.C0101;

/* JADX INFO: loaded from: classes3.dex */
abstract class N3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f513short = {2183, 2259, 2261, 2254, 2263, 2256, 2254, 2261, 2242, 2183, 2259, 2261, 2254, 2263, 2263, 2242, 2243, 2183, 2245, 2258, 2259, 2183, 2251, 2248, 2240, 2240, 2254, 2249, 2240, 2183, 2249, 2248, 2259, 2183, 2260, 2258, 2263, 2263, 2248, 2261, 2259, 2242, 2243, 2205, 2183};
    static final boolean a = C0089.m8595((Boolean) C0089.m8602(new M3()));

    /* JADX INFO: renamed from: ۥۥۢۥ, reason: contains not printable characters */
    public static short[] m9605() {
        if (C0091.m8708() > 0) {
            return f513short;
        }
        return null;
    }

    static void a(Class cls, String str) {
        StringBuilder sb = new StringBuilder();
        C0082.m7988(sb, cls);
        C0101.m11052(sb, C0091.m8679(m9605(), 0, 45, 2215));
        C0101.m11052(sb, str);
        throw new UnsupportedOperationException(C0099.m10924(sb));
    }
}
