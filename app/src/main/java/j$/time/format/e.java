package j$.time.format;

import j$.time.C0089;
import j$.time.C0092;
import j$.time.temporal.C0085;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.stream.C0099;

/* JADX INFO: loaded from: classes3.dex */
final class e implements g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f420short = {675, 675, 1769};
    private final char a;

    /* JADX INFO: renamed from: ۟ۦۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7881() {
        if (C0101.m11044() < 0) {
            return f420short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۨ, reason: contains not printable characters */
    public static char m7882(Object obj) {
        if (C0088.m8503() >= 0) {
            return ((e) obj).a;
        }
        return (char) 0;
    }

    e(char c) {
        this.a = c;
    }

    @Override // j$.time.format.g
    public final boolean j(q qVar, StringBuilder sb) {
        C0089.m8573(sb, m7882(this));
        return true;
    }

    public final String toString() {
        char cM7882 = m7882(this);
        if (cM7882 == '\'') {
            return C0092.m8731(m7881(), 0, 2, 644);
        }
        String strM8236 = C0085.m8236(m7881(), 2, 1, 1742);
        StringBuilder sb = new StringBuilder(strM8236);
        C0089.m8573(sb, cM7882);
        C0101.m11052(sb, strM8236);
        return C0099.m10924(sb);
    }
}
