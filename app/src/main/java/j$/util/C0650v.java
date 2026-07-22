package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.chrono.C0081;
import j$.time.format.C0082;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.util.stream.C0098;
import java.util.function.C0106;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0650v implements IntConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f558short = {770, 852, 860, 836, 840, 850, 841, 851, 794, 770, 835, 779, 775, 852, 850, 842, 794, 770, 835, 779, 775, 842, 846, 841, 794, 770, 835, 779, 775, 838, 849, 834, 853, 838, 832, 834, 794, 770, 833, 779, 775, 842, 838, 863, 794, 770, 835, 858};
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۟۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static long m10951(Object obj) {
        if (C0106.m11345() < 0) {
            return ((C0650v) obj).count;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m10952(Object obj) {
        if (C0098.m10857() <= 0) {
            return ((C0650v) obj).max;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static long m10953(Object obj) {
        if (C0081.m7818() < 0) {
            return ((C0650v) obj).sum;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m10954(Object obj) {
        if (C0085.m8230() >= 0) {
            return ((C0650v) obj).min;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m10955() {
        if (C0100.m10983() > 0) {
            return f558short;
        }
        return null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C0082.m7981(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count = m10951(this) + 1;
        this.sum = m10953(this) + ((long) i);
        this.min = C0080.m7578(m10954(this), i);
        this.max = C0106.m11325(m10952(this), i);
    }

    public final void b(C0650v c0650v) {
        this.count = m10951(this) + m10951(c0650v);
        this.sum = m10953(this) + m10953(c0650v);
        this.min = C0080.m7578(m10954(this), m10954(c0650v));
        this.max = C0106.m11325(m10952(this), m10952(c0650v));
    }

    public final String toString() {
        String strM8109 = C0084.m8109(C0650v.class);
        Long lM11351 = C0106.m11351(m10951(this));
        Long lM113512 = C0106.m11351(m10953(this));
        Integer numM11105 = C0102.m11105(m10954(this));
        long jM10951 = m10951(this);
        return C0086.m8314(C0089.m8581(m10955(), 0, 48, 807), new Object[]{strM8109, lM11351, lM113512, numM11105, C0085.m8245(jM10951 > 0 ? m10953(this) / jM10951 : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), C0102.m11105(m10952(this))});
    }
}
