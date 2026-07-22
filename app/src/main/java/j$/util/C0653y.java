package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import java.io.C0104;
import java.util.function.C0106;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0653y implements LongConsumer, IntConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f560short = {1414, 1488, 1496, 1472, 1484, 1494, 1485, 1495, 1438, 1414, 1479, 1423, 1411, 1488, 1494, 1486, 1438, 1414, 1479, 1423, 1411, 1486, 1482, 1485, 1438, 1414, 1479, 1423, 1411, 1474, 1493, 1478, 1489, 1474, 1476, 1478, 1438, 1414, 1477, 1423, 1411, 1486, 1474, 1499, 1438, 1414, 1479, 1502};
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۟ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static long m10957(Object obj) {
        if (C0104.m11196() >= 0) {
            return ((C0653y) obj).min;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static long m10958(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0653y) obj).sum;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static long m10959(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0653y) obj).count;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static long m10960(Object obj) {
        if (C0102.m11109() < 0) {
            return ((C0653y) obj).max;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m10961() {
        if (C0085.m8230() > 0) {
            return f560short;
        }
        return null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C0092.m8788(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C0090.m8623(this, i);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.count = m10959(this) + 1;
        this.sum = m10958(this) + j;
        this.min = C0088.m8519(m10957(this), j);
        this.max = C0102.m11093(m10960(this), j);
    }

    public final void b(C0653y c0653y) {
        this.count = m10959(this) + m10959(c0653y);
        this.sum = m10958(this) + m10958(c0653y);
        this.min = C0088.m8519(m10957(this), m10957(c0653y));
        this.max = C0102.m11093(m10960(this), m10960(c0653y));
    }

    public final String toString() {
        String strM8109 = C0084.m8109(C0653y.class);
        Long lM11351 = C0106.m11351(m10959(this));
        Long lM113512 = C0106.m11351(m10958(this));
        Long lM113513 = C0106.m11351(m10957(this));
        long jM10959 = m10959(this);
        return C0086.m8314(C0085.m8236(m10961(), 0, 48, 1443), new Object[]{strM8109, lM11351, lM113512, lM113513, C0085.m8245(jM10959 > 0 ? m10958(this) / jM10959 : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), C0106.m11351(m10960(this))});
    }
}
