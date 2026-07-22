package com.zfork.multiplatforms.android.bomb;

import androidx.appcompat.app.AppCompatDelegate;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.security.spec.ECParameterSpec;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M3 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f266short = {2674, 2685, 2679, 2657, 2684, 2682, 2679, 2621, 2674, 2659, 2659, 2621, 2642, 2659, 2659, 2687, 2682, 2672, 2674, 2663, 2682, 2684, 2685, 1144, 1139, 1124, 1139, 1084, 1121, 1122, 1143, 1137, 1147, 1140, 1147, 1137, 1139, 1126, 1147, 1149, 1148, 1084, 1124, 1143, 1120, 1121, 1147, 1149, 1148, 1309, 1282, 1306, 1493, 1447, 863, 861, 844, 891, 845, 842, 846, 861, 886, 857, 853, 861, 2486, 2528, 2486, 2551, 2486, 2467, 2471, 2551, 2486, 2528, 1817, 1826, 1837, 1838, 1824, 1833, 1900, 1848, 1827, 1900, 1839, 1854, 1833, 1837, 1848, 1833, 1900, 1848, 1833, 1825, 1852, 1827, 1854, 1837, 1854, 1845, 1900, 1834, 1829, 1824, 1833, 1910, 1900, 1549, 1590, 1593, 1594, 1588, 1597, 1656, 1580, 1591, 1656, 1595, 1578, 1597, 1593, 1580, 1597, 1656, 1580, 1597, 1589, 1576, 1591, 1578, 1593, 1578, 1569, 1656, 1598, 1585, 1588, 1597};

    static {
        try {
            C0030.m2914(C0031.m3047(m6965(), 0, 23, 2579), false, C0072.m6235() == null ? C0068.m5683() : (ClassLoader) C0019.m1200(new L3()));
        } catch (Throwable unused) {
            String[] strArrM6507 = C0074.m6507(C0029.m2697(C0022.m1728(m6965(), 23, 26, 1042), C0031.m3047(m6965(), 49, 3, 1324)), C0077.m7205(m6965(), 52, 2, 1417), -1);
            int[] iArr = new int[strArrM6507.length];
            for (int i = 0; i < strArrM6507.length; i++) {
                iArr[i] = C0039.m4116(strArrM6507[i]);
            }
            if (iArr[0] == 1) {
                int i2 = iArr[1];
            }
        }
        try {
            C0035.m3619(C0073.m6369(ECParameterSpec.class, C0016.m625(m6965(), 54, 12, 824), null), true);
        } catch (Exception unused2) {
        }
    }

    public static File b(String str, String str2, File file) throws IOException {
        C0030.m2951(file);
        long jM6518 = C0074.m6518();
        String strM1025 = C0018.m1025(new File(str));
        IOException e = null;
        for (int i = 0; i < 10000; i++) {
            String strM6016 = C0071.m6016(C0077.m7270(), C0026.m2321(m6965(), 66, 10, 2451), new Object[]{strM1025, C0070.m5853(jM6518), C0021.m1548(i), str2});
            File file2 = new File(file, strM6016);
            if (!C0070.m5838(strM6016, C0018.m1025(file2))) {
                StringBuilder sb = new StringBuilder(C0076.m6902(m6965(), 76, 33, 1868));
                C0036.m3741(sb, file2);
                throw new IOException(C0068.m5536(sb));
            }
            try {
                if (C0024.m1936(file2)) {
                    return C0023.m1893(file2);
                }
                continue;
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        throw new IOException(C0026.m2321(m6965(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 31, 1624));
    }

    /* JADX INFO: renamed from: ۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6965() {
        if (C0029.m2791() >= 0) {
            return f266short;
        }
        return null;
    }

    public static boolean a(File file) {
        if (C0064.m4615(file)) {
            return true;
        }
        Set setM1541 = C0021.m1541(C0027.m2458(file), new LinkOption[0]);
        EnumSet enumSetM3122 = C0032.m3122(C0063.m4325(), C0021.m1542(), C0022.m1682());
        if (C0017.m866(setM1541, enumSetM3122)) {
            return false;
        }
        EnumSet enumSetM1997 = C0024.m1997(setM1541);
        C0028.m2559(enumSetM1997, enumSetM3122);
        C0036.m3642(C0027.m2458(file), enumSetM1997);
        return C0064.m4615(file);
    }
}
