package com.zfork.entry;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.H0;
import com.zfork.multiplatforms.android.bomb.o5;
import java.io.InputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SupplierComponentFactory extends AppComponentFactory {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f223short = {1387, 1402, 1358, 1394, 1406, 1407, 1399, 1400, 1398, 1380, 1379, 1392, 1381, 1400, 1406, 1407, 1343, 1403, 1378, 1406, 1407, 2672, 2671, 2663, 2674, 2679, 2675, 2685, 2663, 2667, 2672, 2679, 2671, 523, 532, 540, 539, 526, 527, 540, 519, 514, 535, 514, 2814, 1575, 1595, 1586, 1583, 1590, 1651, 1598, 1586, 1584, 1538, 1596, 1581, 1581, 1556, 1587, 1588, 1577, 1331, 1331, 1331, 1386, 1394, 1398, 1330, 1386, 1322, 1313, 1328, 1307, 1317, 1332, 1332, 1282, 1325, 1334, 1335, 1328, 1293, 1322, 1325, 1328, 1325, 1317, 1320, 1325, 1342, 1313, 1312, 1026, 3005};
    public boolean a = false;

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6773() {
        if (C0070.m5903() > 0) {
            return f223short;
        }
        return null;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        String str2;
        InputStream inputStreamM5812;
        boolean zM1751 = C0022.m1751(this);
        this.a = true;
        if (!zM1751) {
            String strM2993 = C0031.m2993();
            try {
                Application applicationM3817 = C0037.m3817();
                if (applicationM3817 != null) {
                    try {
                        inputStreamM5812 = C0069.m5812(C0036.m3768(applicationM3817), C0071.m5991(m6773(), 0, 21, 1297));
                    } catch (Exception unused) {
                        str2 = strM2993;
                    }
                    try {
                        str2 = new String(C0027.m2456(inputStreamM5812, false));
                        if (inputStreamM5812 != null) {
                            try {
                                C0024.m1958(inputStreamM5812);
                            } catch (Exception unused2) {
                            }
                        }
                        if (!C0077.m7292(str2)) {
                            JSONObject jSONObject = new JSONObject(str2);
                            String strM5502 = C0067.m5502(jSONObject, C0029.m2695(m6773(), 21, 12, 2616), strM2993);
                            String strM55022 = C0067.m5502(jSONObject, C0021.m1650(m6773(), 33, 11, 579), strM2993);
                            C0068.m5591(C0019.m1297(), applicationM3817, strM5502);
                            if (!C0038.m3939(strM5502)) {
                                if (C0038.m3939(strM55022) || !C0028.m2625(strM5502, C0067.m5418(m6773(), 44, 1, 2746))) {
                                    if (C0028.m2625(strM5502, C0028.m2609(m6773(), 93, 1, 1095))) {
                                        C0021.m1624(applicationM3817);
                                    }
                                } else if (!C0066.m4848(C0029.m2737(applicationM3817, C0067.m5418(m6773(), 45, 17, 1629), 0), C0069.m5807(m6773(), 62, 31, 1348), false)) {
                                    try {
                                        C0067.m5459(applicationM3817, strM55022);
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (C0028.m2625(strM5502, C0016.m625(m6773(), 94, 1, 3061))) {
                                    C0066.m4814();
                                    Handler handler = new Handler(C0018.m1071(applicationM3817));
                                    C0026.m2337(handler, new H0(2), 3200L);
                                    C0026.m2337(handler, new H0(2), 6400L);
                                }
                            }
                        }
                    } finally {
                    }
                }
            } catch (Exception unused4) {
            }
        }
        return super.instantiateActivity(classLoader, str, intent);
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        Application applicationInstantiateApplication = super.instantiateApplication(classLoader, str);
        o5.e = applicationInstantiateApplication;
        return applicationInstantiateApplication;
    }
}
