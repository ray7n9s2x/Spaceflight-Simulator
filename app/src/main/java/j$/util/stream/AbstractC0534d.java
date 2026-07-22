package j$.util.stream;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0092;
import j$.time.format.C0084;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0106;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0534d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f532short = {1374, 1403, 1403, 1394, 1392, 1398, 1403, 1335, 1364, 1398, 1383, 1398, 1396, 1406, 1379, 1390, 1325, 1335};
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    /* JADX INFO: renamed from: ۣ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m10056(Object obj) {
        if (C0095.m9210() >= 0) {
            return ((AbstractC0534d) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m10057() {
        if (C0092.m8724() <= 0) {
            return f532short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static long[] m10058(Object obj) {
        if (C0079.m7512() >= 0) {
            return ((AbstractC0534d) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m10059(Object obj) {
        if (C0080.m7553() > 0) {
            return ((AbstractC0534d) obj).b;
        }
        return 0;
    }

    public abstract void clear();

    protected AbstractC0534d() {
        this.a = 4;
    }

    protected AbstractC0534d(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(C0084.m8120(m10057(), 0, 18, 1303));
            C0099.m10859(sb, i);
            throw new IllegalArgumentException(C0099.m10924(sb));
        }
        this.a = C0106.m11325(4, 32 - C0104.m11216(i - 1));
    }

    public final long count() {
        int iM10056 = m10056(this);
        if (iM10056 == 0) {
            return m10059(this);
        }
        return m10058(this)[iM10056] + ((long) m10059(this));
    }
}
