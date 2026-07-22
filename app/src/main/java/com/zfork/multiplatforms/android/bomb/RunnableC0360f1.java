package com.zfork.multiplatforms.android.bomb;

import android.content.Context;
import android.net.Uri;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.ConsumerAbility;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0360f1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f320short = {2083, 2153, 2152, 2165, 790, 798, 853, 780, 798, 786, 776, 787, 782, 853, 777, 798, 797, 791, 798, 792, 783, 786, 788, 789, 853, 825, 788, 788, 783, 776, 783, 777, 794, 779, 824, 791, 794, 776, 776, 300, 305, 300, 292, 313, 317, 264, 293, 293, 706, 734, 727, 714, 723, 662, 731, 727, 725, 743, 729, 712, 712, 753, 726, 721, 716, 3154, 3150, 3143, 3162, 3139, 3078, 3147, 3143, 3141, 3191, 3162, 3149, 3141, 3149, 3141, 3146, 3149, 3162, 3191, 3165, 3162, 3137, 1918, 2912, 2911, 2890, 2909, 2894, 2907, 2886, 2880, 2881, 2831, 2881, 2880, 2907, 2831, 2911, 2890, 2909, 2882, 2886, 2907, 2907, 2890, 2891, 2817};
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsumerAbility b;

    public /* synthetic */ RunnableC0360f1(ConsumerAbility consumerAbility, int i) {
        this.a = i;
        this.b = consumerAbility;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7060() {
        if (C0075.m6893() > 0) {
            return f320short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConsumerAbility consumerAbilityM4065 = C0039.m4065(this);
        switch (C0018.m964(this)) {
            case 0:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4065);
                try {
                    int iM13051 = C0111.m13051(consumerAbilityM4065) + 1;
                    consumerAbilityM4065.e = iM13051;
                    C0019.m1180(C0039.m4062(C0070.m5902(consumerAbilityM4065)), C0019.m1300(C0021.m1548(iM13051)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4065);
                try {
                    File[] fileArrM5776 = C0069.m5776(C0038.m4020(consumerAbilityM4065));
                    if (fileArrM5776 != null) {
                        for (File file : fileArrM5776) {
                            if (C0064.m4629(file)) {
                                C0032.m3207(file);
                            } else {
                                C0065.m4783(file);
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 2:
                C0017.m898(consumerAbilityM4065);
                return;
            case 3:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4065);
                C0030.m2968(C0023.m1884(consumerAbilityM4065, C0024.m1945(m7060(), 88, 24, 2863), 0));
                return;
            default:
                C0023.m1832();
                C0030.m2951(consumerAbilityM4065);
                Uri uri = null;
                if (!C0023.m1832()) {
                    ConsumerAbility.g = true;
                    if (C0063.m4330() >= 28) {
                        byte[] bArrM862 = C0017.m862(C0028.m2618(), 2);
                        File fileM4020 = C0038.m4020(consumerAbilityM4065);
                        if (fileM4020 != null) {
                            StringBuilder sb = new StringBuilder();
                            C0078.m7466(sb, C0074.m6518());
                            C0077.m7290(sb, C0066.m4828(m7060(), 0, 4, 2061));
                            File file2 = new File(fileM4020, C0068.m5536(sb));
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    C0065.m4716(fileOutputStream, bArrM862);
                                    C0063.m4304(fileOutputStream);
                                    try {
                                        C0030.m2878(file2);
                                        break;
                                    } catch (Throwable unused3) {
                                    }
                                    C0030.m2951((Boolean) C0070.m5924(C0073.m6369(C0067.m5448(new DexFile(file2), C0039.m4066(m7060(), 4, 35, 891), null), C0067.m5418(m7060(), 39, 9, 329), null), null, null));
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                    }
                                }
                            } catch (Throwable unused4) {
                                if (C0033.m3343(file2)) {
                                }
                            }
                            if (C0033.m3343(file2)) {
                                C0032.m3207(file2);
                            }
                        }
                    }
                }
                try {
                    String strM1422 = C0020.m1422(C0029.m2737(consumerAbilityM4065, C0034.m3431(m7060(), 48, 17, 696), 0), C0066.m4828(m7060(), 65, 22, 3112), C0031.m2993());
                    if (!C0038.m3939(strM1422)) {
                        Uri uriM1058 = C0018.m1058(strM1422);
                        C0479z c0479zM3658 = C0036.m3658(consumerAbilityM4065, uriM1058);
                        if (C0070.m5944((Context) C0023.m1892(c0479zM3658), (Uri) C0064.m4580(c0479zM3658))) {
                            uri = uriM1058;
                        }
                    }
                } catch (Exception unused5) {
                }
                consumerAbilityM4065.f = uri;
                try {
                    if (C0063.m4330() >= 28) {
                        String[] strArr = {C0035.m3603(m7060(), 87, 1, 1842)};
                        HashSet hashSetM948 = C0017.m948();
                        C0028.m2559(hashSetM948, C0021.m1596(strArr));
                        String[] strArr2 = new String[C0038.m4054(hashSetM948)];
                        C0037.m3819(hashSetM948, strArr2);
                        C0031.m3008(strArr2);
                        return;
                    }
                    return;
                } catch (Throwable unused6) {
                    return;
                }
        }
    }
}
