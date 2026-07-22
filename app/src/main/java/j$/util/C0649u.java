package j$.util;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.sun.nio.cs.C0080;
import j$.time.format.C0083;
import j$.time.format.C0084;
import j$.time.temporal.C0085;
import j$.time.temporal.C0086;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import j$.util.function.C0095;
import java.io.C0104;
import java.util.function.C0105;
import java.util.function.C0106;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0649u implements DoubleConsumer {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f556short = {476, 394, 386, 410, 406, 396, 407, 397, 452, 476, 413, 469, 473, 394, 396, 404, 452, 476, 415, 469, 473, 404, 400, 407, 452, 476, 415, 469, 473, 408, 399, 412, 395, 408, 414, 412, 452, 476, 415, 469, 473, 404, 408, 385, 452, 476, 415, 388};
    private double a;
    private double b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: ۟۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m10942() {
        if (C0088.m8503() > 0) {
            return f556short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m10943(Object obj) {
        if (C0101.m11044() < 0) {
            return ((C0649u) obj).count;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static double m10944(Object obj) {
        return C0095.m9210() >= 0 ? ((C0649u) obj).min : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static double m10945(Object obj) {
        return C0094.m9148() >= 0 ? ((C0649u) obj).b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۧ, reason: not valid java name and contains not printable characters */
    public static double m10946(Object obj) {
        return C0095.m9210() >= 0 ? ((C0649u) obj).sum : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static double m10947(Object obj) {
        return C0104.m11196() > 0 ? ((C0649u) obj).max : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۦ۟ۦ۠, reason: contains not printable characters */
    public static void m10948(Object obj, double d) {
        if (C0085.m8230() >= 0) {
            ((C0649u) obj).c(d);
        }
    }

    /* JADX INFO: renamed from: ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static double m10949(Object obj) {
        return C0106.m11345() <= 0 ? ((C0649u) obj).a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C0106.m11337(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.count = m10943(this) + 1;
        this.b = m10945(this) + d;
        m10948(this, d);
        this.min = C0083.m8074(m10944(this), d);
        this.max = C0080.m7555(m10947(this), d);
    }

    public final void b(C0649u c0649u) {
        this.count = m10943(this) + m10943(c0649u);
        this.b = m10945(this) + m10945(c0649u);
        m10948(this, m10946(c0649u));
        m10948(this, m10949(c0649u));
        this.min = C0083.m8074(m10944(this), m10944(c0649u));
        this.max = C0080.m7555(m10947(this), m10947(c0649u));
    }

    private void c(double d) {
        double dM10949 = d - m10949(this);
        double dM10946 = m10946(this);
        double d2 = dM10946 + dM10949;
        this.a = (d2 - dM10946) - dM10949;
        this.sum = d2;
    }

    public final String toString() {
        double dM10943;
        String strM8109 = C0084.m8109(C0649u.class);
        Long lM11351 = C0106.m11351(m10943(this));
        double dM10946 = m10946(this) + m10949(this);
        if (C0088.m8500(dM10946) && C0105.m11255(m10945(this))) {
            dM10946 = m10945(this);
        }
        Double dM8245 = C0085.m8245(dM10946);
        Double dM82452 = C0085.m8245(m10944(this));
        if (m10943(this) > 0) {
            double dM109462 = m10946(this) + m10949(this);
            if (C0088.m8500(dM109462) && C0105.m11255(m10945(this))) {
                dM109462 = m10945(this);
            }
            dM10943 = dM109462 / m10943(this);
        } else {
            dM10943 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return C0086.m8314(C0094.m9107(m10942(), 0, 48, 505), new Object[]{strM8109, lM11351, dM8245, dM82452, C0085.m8245(dM10943), C0085.m8245(m10947(this))});
    }
}
