package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import com.android.apksig.kms.C0030;
import com.zfork.entry.ConsumerAbility;
import com.zfork.entry.SignatureCreatorAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0367g1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f323short = {3023, 3060, 3065, 3043, 3040, 3068, 3057, 3049, 3023, 3070, 3057, 3069, 3061, 2139, 2148, 2161, 2150, 2165, 2144, 2173, 2171, 2170, 2100, 2151, 2145, 2167, 2167, 2161, 2151, 2151, 2104, 2100, 2175, 2161, 2157, 2100, 2144, 2157, 2148, 2161, 2094, 2100, 2085, 2074, 2063, 2072, 2059, 2078, 2051, 2053, 2052, 2122, 2052, 2053, 2078, 2122, 2074, 2063, 2072, 2055, 2051, 2078, 2078, 2063, 2062, 2116, 2839, 2837, 2839, 2844, 2833, 2859, 1318, 1321, 1324, 1317, 874, 785, 877, 874, 877, 876, 879, 877, 796, 878, 795, 998, 8996, 793, 792, 789, 788, 847, 784, 881, 786, 8983, 791, -812, 8997, 794, 780, 781, 783, 13115, 13114, -976, 782, -978, 779, -981, 8979, 849, 902, 13104, 13107, -963, -982, 797, 799, 778, 787, 9001, 9000, 9005, 9004, 796, 876, 2471, 2536, 2553, 2530, 1851, 1802, 1793, 1811, 1866, 1797, 1812, 1807, 3155, 3100, 3085, 3094, 3155, 3148, 652, 679, 693, 643, 690, 681, 748, 675, 690, 681, 3144, 3136, 3153, 3140, 962, 981, 988, 977, 964, 985, 966, 981, 1007, 960, 977, 964, 984, 810, 818, 824, 882, 829, 818, 824, 814, 819, 821, 824, 882, 824, 819, 831, 809, 817, 825, 818, 808, 883, 824, 821, 814, 825, 831, 808, 819, 814, 805, 1227, 1273, 1262, 1277, 1276, 1208, 1273, 1256, 1267, 1208, 1278, 1265, 1268, 1277, 1208, 2812, 2728, 2739, 2812};
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0367g1(ConsumerAbility consumerAbility, boolean z, Uri uri, ApplicationInfo applicationInfo) {
        this.c = consumerAbility;
        this.b = z;
        this.d = uri;
        this.e = applicationInfo;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7063() {
        if (C0030.m2940() > 0) {
            return f323short;
        }
        return null;
    }

    public /* synthetic */ RunnableC0367g1(SignatureCreatorAbility signatureCreatorAbility, C0344d c0344d, boolean z, String str) {
        this.c = signatureCreatorAbility;
        this.d = c0344d;
        this.b = z;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03ae A[Catch: all -> 0x01f9, Exception -> 0x01fc, TRY_LEAVE, TryCatch #7 {Exception -> 0x01fc, blocks: (B:38:0x01a1, B:40:0x01ad, B:42:0x01b3, B:45:0x01d2, B:51:0x0200, B:54:0x022c, B:56:0x0248, B:58:0x0261, B:60:0x0281, B:63:0x029a, B:65:0x02a2, B:67:0x02db, B:68:0x02e5, B:71:0x0302, B:104:0x03ae, B:109:0x0405, B:126:0x0421, B:125:0x041e, B:75:0x031d, B:77:0x032f, B:79:0x033b, B:85:0x035b, B:88:0x0363, B:93:0x0390, B:82:0x0354, B:99:0x039f, B:101:0x03a5, B:59:0x027c, B:127:0x0422), top: B:153:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029a A[Catch: all -> 0x01f9, Exception -> 0x01fc, TRY_ENTER, TryCatch #7 {Exception -> 0x01fc, blocks: (B:38:0x01a1, B:40:0x01ad, B:42:0x01b3, B:45:0x01d2, B:51:0x0200, B:54:0x022c, B:56:0x0248, B:58:0x0261, B:60:0x0281, B:63:0x029a, B:65:0x02a2, B:67:0x02db, B:68:0x02e5, B:71:0x0302, B:104:0x03ae, B:109:0x0405, B:126:0x0421, B:125:0x041e, B:75:0x031d, B:77:0x032f, B:79:0x033b, B:85:0x035b, B:88:0x0363, B:93:0x0390, B:82:0x0354, B:99:0x039f, B:101:0x03a5, B:59:0x027c, B:127:0x0422), top: B:153:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031d A[Catch: all -> 0x01f9, Exception -> 0x01fc, TRY_ENTER, TryCatch #7 {Exception -> 0x01fc, blocks: (B:38:0x01a1, B:40:0x01ad, B:42:0x01b3, B:45:0x01d2, B:51:0x0200, B:54:0x022c, B:56:0x0248, B:58:0x0261, B:60:0x0281, B:63:0x029a, B:65:0x02a2, B:67:0x02db, B:68:0x02e5, B:71:0x0302, B:104:0x03ae, B:109:0x0405, B:126:0x0421, B:125:0x041e, B:75:0x031d, B:77:0x032f, B:79:0x033b, B:85:0x035b, B:88:0x0363, B:93:0x0390, B:82:0x0354, B:99:0x039f, B:101:0x03a5, B:59:0x027c, B:127:0x0422), top: B:153:0x01a1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.RunnableC0367g1.run():void");
    }
}
