package j$.util;

import j$.time.format.C0082;
import j$.util.function.C0094;
import j$.util.stream.C0099;
import java.io.Serializable;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0508h extends RuntimeException {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f498short = {2601, 2578, 2575, 2569, 2572, 2572, 2579, 2574, 2568, 2585, 2584, 2652, 705, 731};

    /* JADX INFO: renamed from: ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m9232() {
        if (C0094.m9148() > 0) {
            return f498short;
        }
        return null;
    }

    public static void a(String str, Serializable serializable) {
        StringBuilder sb = new StringBuilder(C0106.m11346(m9232(), 0, 12, 2684));
        C0101.m11052(sb, str);
        C0101.m11052(sb, C0100.m10962(m9232(), 12, 2, 737));
        C0082.m7988(sb, serializable);
        throw new C0508h(C0099.m10924(sb));
    }
}
