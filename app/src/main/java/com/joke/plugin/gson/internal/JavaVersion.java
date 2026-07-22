package com.joke.plugin.gson.internal;

import com.android.apksig.C0039;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaVersion {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f172short = {1803, 1792, 1815, 1792, 1871, 1815, 1796, 1811, 1810, 1800, 1806, 1807, 1061, 1104, 1057, 1059};
    private static final int majorJavaVersion = m5063();

    public static int getMajorJavaVersion(String str) {
        int iM5060 = m5060(str);
        if (iM5060 == -1) {
            iM5060 = m5061(str);
        }
        if (iM5060 == -1) {
            return 6;
        }
        return iM5060;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static int m5059() {
        if (C0023.m1921() > 0) {
            return majorJavaVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m5060(Object obj) {
        if (C0023.m1921() >= 0) {
            return parseDotted((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5061(Object obj) {
        if (C0072.m6216() >= 0) {
            return extractBeginningInt((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۡ, reason: contains not printable characters */
    public static short[] m5062() {
        if (C0035.m3569() <= 0) {
            return f172short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m5063() {
        if (C0076.m6903() < 0) {
            return determineMajorJavaVersion();
        }
        return 0;
    }

    private static int determineMajorJavaVersion() {
        return C0063.m4357(C0039.m4087(C0023.m1904(m5062(), 0, 12, 1889)));
    }

    private static int extractBeginningInt(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C0078.m7380(str); i++) {
                char cM7212 = C0077.m7212(str, i);
                if (!C0065.m4646(cM7212)) {
                    break;
                }
                C0077.m7289(sb, cM7212);
            }
            return C0039.m4116(C0068.m5536(sb));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean isJava9OrLater() {
        return m5059() >= 9;
    }

    private static int parseDotted(String str) {
        try {
            String[] strArrM2222 = C0025.m2222(str, C0028.m2609(m5062(), 12, 4, 1150));
            int iM4116 = C0039.m4116(strArrM2222[0]);
            return (iM4116 != 1 || strArrM2222.length <= 1) ? iM4116 : C0039.m4116(strArrM2222[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private JavaVersion() {
    }

    public static int getMajorJavaVersion() {
        return m5059();
    }
}
