package com.zfork.multiplatforms.android.bomb;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.speedfloatingball.bean.CloudBean;
import com.zfork.entry.C0075;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0348d3 extends FrameLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f312short = {566, 569, 563, 549, 568, 574, 563, 633, 574, 569, 547, 562, 569, 547, 633, 566, 564, 547, 574, 568, 569, 633, 513, 542, 530, 512, 1376, 1393, 1393, 1389, 1384, 1378, 1376, 1397, 1384, 1390, 1391, 1326, 1399, 1391, 1381, 1327, 1376, 1391, 1381, 1395, 1390, 1384, 1381, 1327, 1393, 1376, 1378, 1386, 1376, 1382, 1380, 1324, 1376, 1395, 1378, 1385, 1384, 1399, 1380, 2244, 2264, 2264, 2268, 2271, 2198, 2179, 2179, 2248, 2243, 2267, 2242, 2240, 2243, 2253, 2248, 2178, 2251, 2253, 2241, 2249, 2247, 2245, 2240, 2240, 2249, 2270, 2253, 2268, 2268, 2178, 2255, 2243, 2241, 2179, 2248, 2243, 2267, 2242, 2240, 2243, 2253, 2248, 2179, 2251, 2253, 2241, 2249, 2177, 2247, 2245, 2240, 2240, 2249, 2270, 2177, 2266, 2201, 2178, 2206, 2178, 2207, 2177, 2273, 2275, 2280, 2207, 2177, 2251, 2253, 2241, 2249, 2247, 2245, 2240, 2240, 2249, 2270, 2253, 2268, 2268, 2178, 2255, 2243, 2241, 2178, 2253, 2268, 2247, 2660, 2627, 2654, 2649, 2636, 2625, 2625, 2573, 2666, 2636, 2624, 2632, 2662, 2628, 2625, 2625, 2632, 2655, 2573, 2636, 2653, 2653, 1012, 975, 962, 984, 987, 967, 970, 978, 1012, 965, 970, 966, 974, 1017, 1021, 1017, 1009, 971, 992, 1005, 996, 1009, 2531, 2546, 2546, 2542, 2539, 2529, 2531, 2550, 2539, 2541, 2540, 2477, 2541, 2529, 2550, 2535, 2550, 2479, 2545, 2550, 2544, 2535, 2531, 2543, 1107, 1092, 1101, 1088, 1109, 1096, 1111, 1092, 1150, 1105, 1088, 1109, 1097, 1912, 1853, 1853, 1853, 1853, 1853, 1853, 1853, 1853, 1283, 1304, 1350, 1305, 1305, 1305, 1305, 1305, 1305, 2361, 2364, 2360, 2358, 2316, 2367, 2364, 2356, 2364, 2316, 2362, 2352, 2364, 2365, 2429, 2339, 2365, 2356, 2428, 2408, 2409, 2383, 3204, 3234, 3246, 3238, 3208, 3242, 3247, 3247, 3238, 3249, 399, 415, 415, 415, 415, 415, 415, 1105, 1136, 1121, 1136, 1142, 1121, 1077, 1121, 1149, 1140, 1121, 1077, 1132, 1146, 1120, 1127, 1077, 1137, 1136, 1123, 1148, 1142, 1136, 1077, 1149, 1140, 1126, 1077, 1147, 1146, 1121, 1077, 1148, 1147, 1126, 1121, 1140, 1145, 1145, 1136, 1137, 1077, 1121, 1149, 1136, 1077, 1106, 1108, 1112, 1104, 1118, 1116, 1113, 1113, 1104, 1095, 1077, 1108, 1093, 1093, 1083, 1077, 1093, 1145, 1136, 1140, 1126, 1136, 1077, 1148, 1147, 1126, 1121, 1140, 1145, 1145, 1077, 1106, 1108, 1112, 1104, 1118, 1116, 1113, 1113, 1104, 1095, 1077, 1108, 1093, 1093, 1077, 1143, 1136, 1139, 1146, 1127, 1136, 1077, 1126, 1121, 1140, 1127, 1121, 1148, 1147, 1138, 1077, 1121, 1149, 1136, 1077, 1138, 1140, 1144, 1136, 1882, 1917, 1888, 1895, 1906, 1919, 1919, 2576, 2571, 2678, 2678, 2673, 2674, 2566, 2759, 2775, 2774, 2775, 2774, 2775, 2774, 883, 849, 862, 851, 853, 860};
    public ProgressBar a;
    public TextView b;
    public CloudBean c;
    public TextView d;
    public C0324a0 e;
    public boolean f;

    public static Uri c(Context context, File file) throws Throwable {
        Uri uri = null;
        if (context == null || file == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        C0072.m6229(contentValues, C0065.m4757(m7041(), 176, 13, 939), C0018.m1025(file));
        C0072.m6229(contentValues, C0038.m4022(m7041(), 189, 9, 916), C0069.m5807(m7041(), 198, 24, 2434));
        C0072.m6229(contentValues, C0038.m4022(m7041(), 222, 13, 1057), C0072.m6233());
        Uri uriM934 = C0017.m934(C0028.m2615(context), C0071.m6036(), contentValues);
        if (uriM934 == null) {
            return null;
        }
        try {
            OutputStream outputStreamM1402 = C0020.m1402(C0028.m2615(context), uriM934);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    C0016.m667(fileInputStream, outputStreamM1402);
                    try {
                        C0024.m1958(fileInputStream);
                        if (outputStreamM1402 != null) {
                            try {
                                C0075.m6780(outputStreamM1402);
                            } catch (Exception unused) {
                            }
                        }
                        return uriM934;
                    } catch (Throwable th) {
                        th = th;
                        uri = uriM934;
                        if (outputStreamM1402 != null) {
                            try {
                                C0075.m6780(outputStreamM1402);
                            } catch (Throwable th2) {
                                C0072.m6234(th, th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused2) {
            return uri;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7041() {
        if (C0111.m13165() <= 0) {
            return f312short;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0452 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zfork.multiplatforms.android.bomb.C0348d3.b():void");
    }

    public static void a(C0348d3 c0348d3, File file) {
        C0030.m2951(c0348d3);
        String strM5544 = C0068.m5544(m7041(), 0, 26, 599);
        boolean zM3343 = C0033.m3343(file);
        Integer numM1548 = C0021.m1548(-1);
        C0324a0 c0324a0M4658 = C0065.m4658(c0348d3);
        if (!zM3343) {
            if (c0324a0M4658 != null) {
                C0033.m3278(c0324a0M4658, numM1548);
                return;
            }
            return;
        }
        try {
            Context contextM1755 = C0022.m1755(c0348d3);
            Intent intent = new Intent();
            C0070.m5947(intent, strM5544);
            int iM4330 = C0063.m4330();
            String strM4066 = C0039.m4066(m7041(), 26, 39, 1281);
            if (iM4330 >= 24) {
                C0020.m1322(intent, 268435457);
                Uri uriM7163 = C0077.m7163(C0022.m1755(c0348d3), file);
                if (uriM7163 == null) {
                    Context contextM17552 = C0022.m1755(c0348d3);
                    C0039.m4158(file);
                    CloudBean cloudBeanM3929 = C0038.m3929(c0348d3);
                    try {
                        String strM5418 = C0067.m5418(m7041(), 65, 89, 2220);
                        if (!C0038.m3939(C0063.m4340(cloudBeanM3929))) {
                            strM5418 = C0063.m4340(cloudBeanM3929);
                        }
                        C0070.m5954(contextM17552, new Intent(strM5544, C0018.m1058(strM5418)));
                    } catch (Exception unused) {
                        if (c0324a0M4658 != null) {
                            C0033.m3278(c0324a0M4658, numM1548);
                        }
                    }
                    if (c0324a0M4658 != null) {
                        C0033.m3278(c0324a0M4658, numM1548);
                        return;
                    }
                    return;
                }
                C0023.m1891(intent, uriM7163, strM4066);
            } else {
                C0023.m1891(intent, C0017.m940(file), strM4066);
            }
            C0070.m5954(contextM1755, C0070.m5930(intent, C0077.m7205(m7041(), 154, 22, 2605)));
            if (c0324a0M4658 != null) {
                C0033.m3278(c0324a0M4658, numM1548);
            }
        } catch (Throwable unused2) {
            if (c0324a0M4658 != null) {
                C0033.m3278(c0324a0M4658, numM1548);
            }
        }
    }
}
