package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class J2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f257short = {814, 882, 873, 864, 883, 868, 869, 862, 881, 883, 868, 871, 882, 303, 303, 303, 374, 366, 362, 302, 374, 310, 317, 300, 263, 313, 296, 296, 286, 305, 298, 299, 300, 273, 310, 305, 300, 305, 313, 308, 305, 290, 317, 316, 971, 984, 969, 962, 963, 988, 975, 993, 975, 979, 2247, 2248, 2242, 2260, 2249, 2255, 2242, 2184, 2247, 2262, 2262, 2184, 2279, 2245, 2258, 2255, 2256, 2255, 2258, 2271, 2290, 2254, 2260, 2243, 2247, 2242, 1203, 1189, 1186, 1186, 1205, 1214, 1188, 1169, 1203, 1188, 1209, 1190, 1209, 1188, 1193, 1156, 1208, 1186, 1205, 1201, 1204, 3176, 3140, 3177, 3177, 3140, 3189, 3189, 3177, 3180, 3174, 3172, 3185, 3180, 3178, 3179, 3190, 2921, 2930, 2925, 2867, 2943, 2932, 2936, 2931, 2923, 2936, 2931, 2932, 2937, 2930, 2867, 2928, 2920, 2931, 2937, 2930, 2867, 2928, 2940, 2931, 2932, 2939, 2936, 2926, 2921, 2867, 2896, 2920, 2931, 2937, 2930, 2900, 2931, 2921, 2936, 2927, 2928, 2936, 2937, 2932, 2940, 2927, 2916, 1483, 1495, 1495, 1491, 1488, 1433, 1420, 1420, 1486, 1484, 1479, 1474, 1491, 1480, 1477, 1474, 1485, 1488, 1421, 1472, 1484, 1486, 1420, 1492, 1478, 1473, 1532, 1477, 1482, 1487, 1478, 1488, 1420, 1506, 1479, 1488, 1421, 1495, 1499, 1495};
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = 0;
    public G0 h;

    /* JADX INFO: renamed from: ۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6946() {
        if (C0031.m3075() >= 0) {
            return f257short;
        }
        return null;
    }

    public final Activity b() {
        ArrayList arrayListM3583 = C0035.m3583(this);
        Activity activity = !C0066.m4881(arrayListM3583) ? (Activity) C0064.m4526(arrayListM3583, C0018.m1084(arrayListM3583) - 1) : null;
        if (activity == null || C0016.m610(activity) || C0074.m6509(activity)) {
            return null;
        }
        return activity;
    }

    public static void a(Application application, String str) {
        try {
            InputStream inputStreamM5812 = C0069.m5812(C0036.m3768(application), str);
            try {
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, C0018.m1006(C0075.m6799(application)));
                C0077.m7290(sb, C0037.m3829(m6946(), 0, 13, 769));
                File file = new File(C0068.m5536(sb));
                if (!C0033.m3343(file)) {
                    C0019.m1226(file);
                }
                File file2 = new File(file, str);
                C0039.m4158(file2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        C0016.m667(inputStreamM5812, fileOutputStream);
                        C0063.m4304(fileOutputStream);
                    } catch (Throwable th) {
                        try {
                            C0063.m4304(fileOutputStream);
                        } catch (Throwable th2) {
                            C0072.m6234(th, th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                }
                if (inputStreamM5812 != null) {
                    C0024.m1958(inputStreamM5812);
                }
            } finally {
            }
        } catch (Exception unused2) {
        }
        C0072.m6210(C0111.m13185(C0026.m2261(C0029.m2737(application, C0023.m1904(m6946(), 13, 31, 344), 0)), C0033.m3330(m6946(), 44, 10, 938), true));
    }

    public final void c(Application application, String str) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List list;
        int i2 = 1;
        if (C0038.m3939(str)) {
            this.c = true;
        } else {
            try {
                Class clsM4101 = C0039.m4101(C0019.m1189(m6946(), 54, 26, 2214));
                Method methodM6369 = C0073.m6369(clsM4101, C0037.m3829(m6946(), 80, 21, 1232), null);
                C0035.m3619(methodM6369, true);
                Object objM5924 = C0070.m5924(methodM6369, null, null);
                Field fieldM5765 = C0069.m5765(clsM4101, C0071.m5991(m6946(), 101, 16, 3077));
                C0035.m3619(fieldM5765, true);
                list = (List) C0067.m5443(fieldM5765, objM5924);
            } catch (Exception unused) {
            }
            if (list == null || C0034.m3427(list) <= 1) {
                i = 0;
            } else {
                Iterator itM4732 = C0065.m4732(list);
                while (C0036.m3657(itM4732)) {
                    try {
                        Application application2 = (Application) C0071.m6012(itM4732);
                        if (!C0070.m5838(C0038.m3957(application2), C0038.m3957(application))) {
                            C0017.m904(C0068.m5667(application2), new ComponentName(C0038.m3957(application2), C0077.m7205(m6946(), 117, 47, 2845)), 0);
                            i = 2;
                            break;
                        }
                    } catch (Exception unused2) {
                        i = 1;
                    }
                }
                i = 1;
            }
            this.g = i;
            for (char c : C0031.m2984(str)) {
                switch (c) {
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        this.c = true;
                        break;
                    case 'B':
                        if (C0021.m1547(this) == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.b = z;
                        break;
                    case 'C':
                        if (C0021.m1547(this) != 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.d = z2;
                        break;
                    case 'F':
                        if (C0021.m1547(this) == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.e = z3;
                        break;
                    case 'G':
                        if (C0021.m1547(this) == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f = z4;
                        break;
                }
            }
        }
        if (C0027.m2493(this)) {
            T tM2649 = C0028.m2649();
            C0030.m2951(tM2649);
            C0063.m4410(C0068.m5544(m6946(), 164, 40, 1443), new n5(new C0450u0(tM2649, application, 7), i2));
        }
        C0029.m2823(application, new H2(this));
    }
}
