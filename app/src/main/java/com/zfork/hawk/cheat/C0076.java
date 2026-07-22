package com.zfork.hawk.cheat;

import com.android.apksig.C0038;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.zfork.hawk.cheat.۟ۤۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0076 {

    /* JADX INFO: renamed from: ۟ۡۥۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean f226 = true;

    /* JADX INFO: renamed from: ۣ۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6901(String str) {
        String strM2993 = C0031.m2993();
        String strM29932 = C0031.m2993();
        for (int i = 0; i < 15; i++) {
            strM2993 = C0077.m7301(C0030.m2967(C0030.m2967(new StringBuffer(), strM2993), C0021.m1651(i)));
            strM29932 = C0077.m7301(C0027.m2461(C0030.m2967(new StringBuffer(), strM29932), ((int) (C0038.m3986() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0078.m7380(str) / 2);
        for (int i2 = 0; i2 < C0078.m7380(str); i2 += 2) {
            C0070.m5921(byteArrayOutputStream, (C0024.m2051(strM2993, C0077.m7212(str, i2)) << 4) | C0024.m2051(strM2993, C0077.m7212(str, i2 + 1)));
        }
        byte[] bArrM7297 = C0077.m7297(byteArrayOutputStream);
        int length = bArrM7297.length;
        int iM7380 = C0078.m7380(strM29932);
        while (length > 0) {
            bArrM7297[-1] = (byte) (bArrM7297[-1] ^ C0077.m7212(strM29932, (-1) % iM7380));
        }
        for (int iM73802 = 0; iM73802 < bArrM7297.length; iM73802 = C0078.m7380(C0031.m2993()) + 1) {
        }
        return new String(bArrM7297);
    }

    /* JADX INFO: renamed from: ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6903() {
        return (-1749602) ^ C0032.m3236((Object) "ۢ۠۠");
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6902(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
