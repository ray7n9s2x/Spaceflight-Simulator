package com.joke.plugin.gson.internal.bind.util;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class ISO8601Utils {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f202short = {2279, 2278, 2289, 2351, 2350, 2361, 1395, 1367, 1357, 1363, 1375, 1354, 1373, 1366, 1367, 1360, 1369, 1310, 1354, 1367, 1363, 1371, 1310, 1348, 1361, 1360, 1371, 1310, 1367, 1360, 1370, 1367, 1373, 1375, 1354, 1361, 1356, 1284, 1310, 2740, 2750, 2727, 2655, 2655, 1512, 1487, 1495, 1472, 1485, 1480, 1477, 1409, 1493, 1480, 1484, 1476, 1409, 1499, 1486, 1487, 1476, 1409, 1480, 1487, 1477, 1480, 1474, 1472, 1493, 1486, 1491, 1409, 1414, 379, 1711, 1716, 1716, 1716, 1716, 2112, 2139, 2139, 2129, 2139, 2139, 3227, 584, 527, 513, 542, 525, 518, 580, 584, 538, 525, 539, 519, 516, 542, 525, 539, 584, 540, 519, 584, 3298, 3267, 3212, 3288, 3269, 3265, 3273, 3212, 3286, 3267, 3266, 3273, 3212, 3269, 3266, 3272, 3269, 3279, 3277, 3288, 3267, 3294, 3204, 2566, 1373, 1168, 1207, 1215, 1210, 1203, 1202, 1270, 1186, 1209, 1270, 1190, 1207, 1188, 1189, 1203, 1270, 1202, 1207, 1186, 1203, 1270, 1165, 1562, 1661, 1639, 575, 536, 512, 535, 538, 543, 530, 598, 536, 515, 539, 532, 531, 516, 588, 598};
    private static final String UTC_ID = C0039.m4066(m5403(), 0, 3, 2226);
    private static final TimeZone TIMEZONE_UTC = C0020.m1335(C0033.m3330(m5403(), 3, 3, 2426));

    public static String format(Date date) {
        return C0072.m6206(date, false, m5400());
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static void m5398(Object obj, int i, int i2) {
        if (C0021.m1598() < 0) {
            padInt((StringBuilder) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5399(Object obj, int i, char c) {
        if (C0027.m2460() >= 0) {
            return checkOffset((String) obj, i, c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۨ, reason: not valid java name and contains not printable characters */
    public static TimeZone m5400() {
        if (C0063.m4427() >= 0) {
            return TIMEZONE_UTC;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5401(Object obj, int i) {
        if (C0063.m4427() >= 0) {
            return indexOfNonDigit((String) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static int m5402(Object obj, int i, int i2) {
        if (C0021.m1598() <= 0) {
            return parseInt((String) obj, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5403() {
        if (C0039.m4109() > 0) {
            return f202short;
        }
        return null;
    }

    public static String format(Date date, boolean z) {
        return C0072.m6206(date, z, m5400());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r70, java.text.ParsePosition r71) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > C0078.m7380(str) || i > i2) {
            throw new NumberFormatException(str);
        }
        String strM2609 = C0028.m2609(m5403(), 156, 16, 630);
        if (i < i2) {
            i4 = i + 1;
            int iM2959 = C0030.m2959(C0077.m7212(str, i), 10);
            if (iM2959 < 0) {
                StringBuilder sb = new StringBuilder(strM2609);
                C0077.m7290(sb, C0032.m3220(str, i, i2));
                throw new NumberFormatException(C0068.m5536(sb));
            }
            i3 = -iM2959;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iM29592 = C0030.m2959(C0077.m7212(str, i4), 10);
            if (iM29592 < 0) {
                StringBuilder sb2 = new StringBuilder(strM2609);
                C0077.m7290(sb2, C0032.m3220(str, i, i2));
                throw new NumberFormatException(C0068.m5536(sb2));
            }
            i3 = (i3 * 10) - iM29592;
            i4 = i5;
        }
        return -i3;
    }

    private static boolean checkOffset(String str, int i, char c) {
        if (i < C0078.m7380(str) && C0077.m7212(str, i) == c) {
            return true;
        }
        return false;
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, C0077.m7270());
        C0069.m5824(gregorianCalendar, date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (C0067.m5476(timeZone) == 0 ? 1 : 6));
        m5398(sb, C0063.m4425(gregorianCalendar, 1), 4);
        C0077.m7289(sb, '-');
        m5398(sb, C0063.m4425(gregorianCalendar, 2) + 1, 2);
        C0077.m7289(sb, '-');
        m5398(sb, C0063.m4425(gregorianCalendar, 5), 2);
        C0077.m7289(sb, 'T');
        m5398(sb, C0063.m4425(gregorianCalendar, 11), 2);
        C0077.m7289(sb, ':');
        m5398(sb, C0063.m4425(gregorianCalendar, 12), 2);
        C0077.m7289(sb, ':');
        m5398(sb, C0063.m4425(gregorianCalendar, 13), 2);
        if (z) {
            C0077.m7289(sb, '.');
            m5398(sb, C0063.m4425(gregorianCalendar, 14), 3);
        }
        int iM3515 = C0035.m3515(timeZone, C0027.m2405(gregorianCalendar));
        if (iM3515 != 0) {
            int i = iM3515 / 60000;
            int iM3989 = C0038.m3989(i / 60);
            int iM39892 = C0038.m3989(i % 60);
            C0077.m7289(sb, iM3515 >= 0 ? '+' : '-');
            m5398(sb, iM3989, 2);
            C0077.m7289(sb, ':');
            m5398(sb, iM39892, 2);
        } else {
            C0077.m7289(sb, 'Z');
        }
        return C0068.m5536(sb);
    }

    private static int indexOfNonDigit(String str, int i) {
        for (int i2 = i; i2 < C0078.m7380(str); i2++) {
            char cM7212 = C0077.m7212(str, i2);
            if (cM7212 < '0' || cM7212 > '9') {
                return i2;
            }
        }
        return C0078.m7380(str);
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String strM4886 = C0066.m4886(i);
        for (int iM7380 = i2 - C0078.m7380(strM4886); iM7380 > 0; iM7380--) {
            C0077.m7289(sb, '0');
        }
        C0077.m7290(sb, strM4886);
    }
}
