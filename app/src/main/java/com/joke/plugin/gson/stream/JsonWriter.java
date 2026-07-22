package com.joke.plugin.gson.stream;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
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
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f214short = {531, 570, 618, 639, 635, 567, 1069, 1107, 2507, 2507, 1638, 1614, 2880, 2942, 782, 828, 558, 512, 1796, 1854, 837, 876, 809, 809, 810, 890, 2125, 2148, 2081, 2081, 2082, 2164, 1663, 1622, 1555, 1555, 1553, 1557, 2280, 2241, 2180, 2180, 2183, 2256, 2173, 2132, 2065, 2065, 2067, 2070, 965, 597, 591, 590, 538, 519, 519, 538, 596, 591, 598, 598, 1033, 1058, 1076, 1075, 1070, 1065, 1056, 1127, 1079, 1077, 1064, 1061, 1067, 1058, 1066, 1129, 1063, 1086, 1058, 1059, 1101, 1024, 1048, 1054, 1049, 1101, 1029, 1036, 1051, 1032, 1101, 1026, 1027, 1025, 1044, 1101, 1026, 1027, 1032, 1101, 1049, 1026, 1053, 1088, 1025, 1032, 1051, 1032, 1025, 1101, 1051, 1036, 1025, 1048, 1032, 1091, 1483, 1504, 1526, 1521, 1516, 1515, 1506, 1445, 1525, 1527, 1514, 1511, 1513, 1504, 1512, 1451, 2392, 2419, 2405, 2402, 2431, 2424, 2417, 2358, 2406, 2404, 2425, 2420, 2426, 2419, 2427, 2360, 2520, 2557, 2546, 2555, 2544, 2549, 2546, 2555, 2492, 2546, 2557, 2545, 2553, 2470, 2492, 1754, 567, 526, 530, 531, 554, 527, 532, 521, 536, 527, 605, 532, 526, 605, 542, 529, 530, 526, 536, 537, 595, 1192, 1238, 1279, 1208, 1210, 1208, 1202, 2475, 2434, 2501, 2503, 2501, 2510, 2774, 1886, 3079, 3104, 3117, 3105, 3107, 3134, 3106, 3115, 3130, 3115, 3182, 3114, 3105, 3117, 3131, 3107, 3115, 3104, 3130, 2572, 2300, 1926, 1983, 1955, 1954, 1947, 1982, 1957, 1976, 1961, 1982, 2028, 1957, 1983, 2028, 1967, 1952, 1955, 1983, 1961, 1960, 2018, 2856, 2833, 2829, 2828, 2869, 2832, 2827, 2838, 2823, 2832, 2882, 2827, 2833, 2882, 2817, 2830, 2829, 2833, 2823, 2822, 2892, 3188, 3195, 3191, 3199, 3130, 3111, 3111, 3130, 3188, 3183, 3190, 3190, 616, 627, 618, 618, 2927, 943, 949, 1980, 1927, 1951, 1943, 1920, 1947, 1937, 2002, 1924, 1939, 1950, 1927, 1943, 1921, 2002, 1951, 1927, 1921, 1926, 2002, 1936, 1943, 2002, 1940, 1947, 1948, 1947, 1926, 1943, 2014, 2002, 1936, 1927, 1926, 2002, 1925, 1939, 1921, 2002, 2084, 2082, 2085, 2101, 1137, 1142, 1147, 1124, 1138, 1147, 1055, 1080, 1072, 1087, 1080, 1087, 1058, 1071, 707, 740, 748, 739, 740, 739, 766, 755, 1996, 2019, 1996, 637, 582, 606, 598, 577, 602, 592, 531, 581, 594, 607, 582, 598, 576, 531, 606, 582, 576, 583, 531, 593, 598, 531, 597, 602, 605, 602, 583, 598, 543, 531, 593, 582, 583, 531, 580, 594, 576, 531, 1967, 1961, 1966, 1982, 278, 273, 284, 259, 277};
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            m6282()[i] = C0021.m1531(C0031.m3047(m6277(), 0, 6, 591), new Object[]{C0021.m1548(i)});
        }
        String[] strArrM6282 = m6282();
        strArrM6282[34] = C0036.m3678(m6277(), 6, 2, 1137);
        strArrM6282[92] = C0039.m4066(m6277(), 8, 2, 2455);
        strArrM6282[9] = C0076.m6902(m6277(), 10, 2, 1594);
        strArrM6282[8] = C0033.m3330(m6277(), 12, 2, 2844);
        strArrM6282[10] = C0025.m2151(m6277(), 14, 2, 850);
        strArrM6282[13] = C0036.m3678(m6277(), 16, 2, 626);
        strArrM6282[12] = C0065.m4757(m6277(), 18, 2, 1880);
        String[] strArr = (String[]) m6295(strArrM6282);
        HTML_SAFE_REPLACEMENT_CHARS = strArr;
        strArr[60] = C0070.m5942(m6277(), 20, 6, 793);
        strArr[62] = C0063.m4315(m6277(), 26, 6, 2065);
        strArr[38] = C0020.m1443(m6277(), 32, 6, 1571);
        strArr[61] = C0072.m6116(m6277(), 38, 6, 2228);
        strArr[39] = C0068.m5544(m6277(), 44, 6, 2081);
    }

    private JsonWriter close(int i, int i2, String str) throws IOException {
        int iM6297 = m6297(this);
        if (iM6297 != i2 && iM6297 != i) {
            throw new IllegalStateException(C0016.m625(m6277(), 134, 16, 2326));
        }
        if (m6285(this) != null) {
            StringBuilder sb = new StringBuilder(C0028.m2609(m6277(), 150, 15, 2460));
            C0077.m7290(sb, m6285(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        this.stackSize = m6278(this) - 1;
        if (iM6297 == i2) {
            m6290(this);
        }
        C0071.m6090(m6281(this), str);
        return this;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int[] m6275(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((JsonWriter) obj).stack;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6276(Object obj) {
        if (C0036.m3653() < 0) {
            return ((JsonWriter) obj).indent;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6277() {
        if (C0028.m2593() >= 0) {
            return f214short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6278(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((JsonWriter) obj).stackSize;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6279(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((JsonWriter) obj).lenient;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m6280(Object obj) throws IOException {
        if (C0017.m846() >= 0) {
            ((JsonWriter) obj).writeDeferredName();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static Writer m6281(Object obj) {
        if (C0025.m2132() > 0) {
            return ((JsonWriter) obj).out;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String[] m6282() {
        if (C0073.m6356() <= 0) {
            return REPLACEMENT_CHARS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String[] m6283() {
        if (C0064.m4578() >= 0) {
            return HTML_SAFE_REPLACEMENT_CHARS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m6284(Object obj, int i, int i2, Object obj2) {
        if (C0038.m4010() > 0) {
            return ((JsonWriter) obj).close(i, i2, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6285(Object obj) {
        if (C0029.m2791() > 0) {
            return ((JsonWriter) obj).deferredName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6286(Object obj) throws IOException {
        if (C0071.m6069() >= 0) {
            ((JsonWriter) obj).beforeName();
        }
    }

    /* JADX INFO: renamed from: ۠۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static JsonWriter m6287(Object obj, int i, Object obj2) {
        if (C0074.m6454() < 0) {
            return ((JsonWriter) obj).open(i, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m6288(Object obj, int i) {
        if (C0029.m2791() > 0) {
            ((JsonWriter) obj).push(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6289(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((JsonWriter) obj).serializeNulls;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m6290(Object obj) throws IOException {
        if (C0078.m7450() >= 0) {
            ((JsonWriter) obj).newline();
        }
    }

    /* JADX INFO: renamed from: ۢۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m6291(Object obj, Object obj2) throws IOException {
        if (C0017.m846() >= 0) {
            ((JsonWriter) obj).string((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m6292(Object obj, int i) {
        if (C0064.m4578() > 0) {
            ((JsonWriter) obj).replaceTop(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6293(Object obj) {
        if (C0020.m1385() < 0) {
            return ((JsonWriter) obj).separator;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m6294(Object obj) {
        if (C0025.m2132() > 0) {
            return ((JsonWriter) obj).htmlSafe;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۢۧ, reason: contains not printable characters */
    public static Object m6295(Object obj) {
        if (C0037.m3837() < 0) {
            return ((String[]) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟۠, reason: contains not printable characters */
    public static void m6296(Object obj) throws IOException {
        if (C0038.m4010() >= 0) {
            ((JsonWriter) obj).beforeValue();
        }
    }

    /* JADX INFO: renamed from: ۨۧۨ۟, reason: not valid java name and contains not printable characters */
    public static int m6297(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((JsonWriter) obj).peek();
        }
        return 0;
    }

    public JsonWriter endArray() {
        return m6284(this, 1, 2, C0072.m6116(m6277(), 221, 1, 2641));
    }

    public JsonWriter endObject() {
        return m6284(this, 3, 5, C0074.m6452(m6277(), 222, 1, 2177));
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return C0034.m3492(this);
        }
        m6280(this);
        m6296(this);
        m6291(this, str);
        return this;
    }

    private void newline() throws IOException {
        if (m6276(this) == null) {
            return;
        }
        C0071.m6090(m6281(this), C0035.m3603(m6277(), 165, 1, 1744));
        int iM6278 = m6278(this);
        for (int i = 1; i < iM6278; i++) {
            C0071.m6090(m6281(this), m6276(this));
        }
    }

    private int peek() {
        int iM6278 = m6278(this);
        if (iM6278 != 0) {
            return m6275(this)[iM6278 - 1];
        }
        throw new IllegalStateException(C0077.m7205(m6277(), 166, 21, 637));
    }

    private void push(int i) {
        int iM6278 = m6278(this);
        int[] iArrM6275 = m6275(this);
        if (iM6278 == iArrM6275.length) {
            this.stack = C0073.m6314(iArrM6275, iM6278 * 2);
        }
        int[] iArrM62752 = m6275(this);
        int iM62782 = m6278(this);
        this.stackSize = iM62782 + 1;
        iArrM62752[iM62782] = i;
    }

    private void replaceTop(int i) {
        m6275(this)[m6278(this) - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void string(java.lang.String r60) throws java.io.IOException {
        /*
            r59 = this;
            r9 = r60
            r8 = r59
            boolean r0 = m6294(r8)
            if (r0 == 0) goto Lf
            java.lang.String[] r0 = m6283()
            goto L13
        Lf:
            java.lang.String[] r0 = m6282()
        L13:
            java.io.Writer r1 = m6281(r8)
            short[] r47 = m6277()
            r50 = 1162(0x48a, float:1.628E-42)
            r48 = 187(0xbb, float:2.62E-43)
            r49 = 1
            java.lang.String r47 = com.joke.connectdevice.bean.C0064.m4545(r47, r48, r49, r50)
            r2 = r47
            com.joke.plugin.gson.internal.reflect.C0071.m6090(r1, r2)
            int r1 = com.zfork.multiplatforms.android.bomb.C0078.m7380(r9)
            r3 = 0
            r4 = 0
        L33:
            if (r3 >= r1) goto L88
            char r5 = com.zfork.multiplatforms.android.bomb.C0077.m7212(r9, r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L42
            r5 = r0[r5]
            if (r5 != 0) goto L71
            goto L85
        L42:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L5a
            short[] r30 = m6277()
            r33 = 1162(0x48a, float:1.628E-42)
            r31 = 188(0xbc, float:2.63E-43)
            r32 = 6
            java.lang.String r30 = com.joke.script.bean.C0074.m6452(r30, r31, r32, r33)
            r5 = r30
            goto L71
        L5a:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L85
            short[] r35 = m6277()
            r38 = 2551(0x9f7, float:3.575E-42)
            r36 = 194(0xc2, float:2.72E-43)
            r37 = 6
            java.lang.String r35 = com.android.apksig.util.C0031.m3047(r35, r36, r37, r38)
            r5 = r35
        L71:
            if (r4 >= r3) goto L7c
            java.io.Writer r6 = m6281(r8)
            int r7 = r3 - r4
            com.android.apksig.zip.C0033.m3377(r6, r9, r4, r7)
        L7c:
            java.io.Writer r4 = m6281(r8)
            com.joke.plugin.gson.internal.reflect.C0071.m6090(r4, r5)
            int r4 = r3 + 1
        L85:
            int r3 = r3 + 1
            goto L33
        L88:
            if (r4 >= r1) goto L92
            java.io.Writer r0 = m6281(r8)
            int r1 = r1 - r4
            com.android.apksig.zip.C0033.m3377(r0, r9, r4, r1)
        L92:
            java.io.Writer r9 = m6281(r8)
            com.joke.plugin.gson.internal.reflect.C0071.m6090(r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (m6285(this) != null) {
            m6286(this);
            m6291(this, m6285(this));
            this.deferredName = null;
        }
    }

    public void flush() throws IOException {
        if (m6278(this) == 0) {
            throw new IllegalStateException(C0031.m3047(m6277(), 223, 21, 1996));
        }
        C0064.m4505(m6281(this));
    }

    public final boolean getSerializeNulls() {
        return m6289(this);
    }

    public final boolean isHtmlSafe() {
        return m6294(this);
    }

    public boolean isLenient() {
        return m6279(this);
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return C0034.m3492(this);
        }
        m6280(this);
        m6296(this);
        C0034.m3396(m6281(this), str);
        return this;
    }

    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException(C0018.m1070(m6277(), 265, 12, 3098));
        }
        if (m6285(this) != null) {
            throw new IllegalStateException();
        }
        if (m6278(this) == 0) {
            throw new IllegalStateException(C0024.m1945(m6277(), 244, 21, 2914));
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (m6285(this) != null) {
            if (!m6289(this)) {
                this.deferredName = null;
                return this;
            }
            m6280(this);
        }
        m6296(this);
        C0071.m6090(m6281(this), C0027.m2404(m6277(), 277, 4, 518));
        return this;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public JsonWriter(Writer writer) {
        m6288(this, 6);
        this.separator = C0069.m5807(m6277(), 50, 1, 1023);
        this.serializeNulls = true;
        if (writer != null) {
            this.out = writer;
            return;
        }
        throw new NullPointerException(C0024.m1945(m6277(), 51, 11, 570));
    }

    private void beforeName() throws IOException {
        int iM6297 = m6297(this);
        if (iM6297 == 5) {
            C0037.m3835(m6281(this), 44);
        } else if (iM6297 != 3) {
            throw new IllegalStateException(C0018.m1070(m6277(), 62, 16, 1095));
        }
        m6290(this);
        m6292(this, 4);
    }

    private void beforeValue() throws IOException {
        int iM6297 = m6297(this);
        if (iM6297 != 1) {
            if (iM6297 != 2) {
                if (iM6297 != 4) {
                    if (iM6297 != 6) {
                        if (iM6297 == 7) {
                            if (!m6279(this)) {
                                throw new IllegalStateException(C0075.m6791(m6277(), 78, 40, 1133));
                            }
                        } else {
                            throw new IllegalStateException(C0076.m6902(m6277(), 118, 16, 1413));
                        }
                    }
                    m6292(this, 7);
                    return;
                }
                C0034.m3396(m6281(this), m6293(this));
                m6292(this, 5);
                return;
            }
            C0037.m3793(m6281(this), ',');
            m6290(this);
            return;
        }
        m6292(this, 2);
        m6290(this);
    }

    private JsonWriter open(int i, String str) throws IOException {
        m6296(this);
        m6288(this, i);
        C0071.m6090(m6281(this), str);
        return this;
    }

    public JsonWriter beginArray() throws IOException {
        m6280(this);
        return m6287(this, 1, C0066.m4828(m6277(), 200, 1, 2701));
    }

    public JsonWriter beginObject() throws IOException {
        m6280(this);
        return m6287(this, 3, C0032.m3209(m6277(), 201, 1, 1829));
    }

    public final void setIndent(String str) {
        if (C0078.m7380(str) == 0) {
            this.indent = null;
            this.separator = C0032.m3209(m6277(), 281, 1, 2901);
        } else {
            this.indent = str;
            this.separator = C0067.m5418(m6277(), 282, 2, 917);
        }
    }

    public JsonWriter value(boolean z) throws IOException {
        m6280(this);
        m6296(this);
        C0071.m6090(m6281(this), z ? C0032.m3209(m6277(), 391, 4, 2011) : C0020.m1443(m6277(), 395, 5, 368));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C0029.m2767(m6281(this));
        int iM6278 = m6278(this);
        if (iM6278 <= 1 && (iM6278 != 1 || m6275(this)[iM6278 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException(C0024.m1945(m6277(), 202, 19, 3150));
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return C0034.m3492(this);
        }
        m6280(this);
        m6296(this);
        C0071.m6090(m6281(this), C0065.m4681(bool) ? C0034.m3431(m6277(), 323, 4, 2128) : C0017.m936(m6277(), 327, 5, 1047));
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        m6280(this);
        if (!m6279(this) && (C0017.m923(d) || C0031.m3010(d))) {
            StringBuilder sb = new StringBuilder(C0078.m7427(m6277(), 284, 39, 2034));
            C0023.m1897(sb, d);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        m6296(this);
        C0034.m3396(m6281(this), C0019.m1256(d));
        return this;
    }

    public JsonWriter value(long j) throws IOException {
        m6280(this);
        m6296(this);
        C0071.m6090(m6281(this), C0019.m1223(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return C0034.m3492(this);
        }
        m6280(this);
        String strM6524 = C0074.m6524(number);
        if (!m6279(this) && (C0070.m5838(strM6524, C0111.m13097(m6277(), 332, 9, 1110)) || C0070.m5838(strM6524, C0031.m3047(m6277(), 341, 8, 650)) || C0070.m5838(strM6524, C0028.m2609(m6277(), 349, 3, 1922)))) {
            StringBuilder sb = new StringBuilder(C0071.m5991(m6277(), 352, 39, 563));
            C0036.m3741(sb, number);
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        m6296(this);
        C0034.m3396(m6281(this), strM6524);
        return this;
    }
}
