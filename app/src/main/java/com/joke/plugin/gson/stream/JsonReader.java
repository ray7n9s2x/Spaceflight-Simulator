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
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
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
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.JsonReaderInternalAccess;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.JsonTreeReader;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import kotlin.text.Typography;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f211short = {1145, 1037, 1069, 1143, 1114, 3047, 3040, 2990, 2995, 2995, 2990, 3040, 3067, 3042, 3042, 292, 258, 276, 337, 315, 258, 286, 287, 291, 276, 272, 277, 276, 259, 351, 258, 276, 261, 317, 276, 287, 280, 276, 287, 261, 345, 261, 259, 260, 276, 344, 337, 261, 286, 337, 272, 274, 274, 276, 257, 261, 337, 284, 272, 285, 279, 286, 259, 284, 276, 277, 337, 315, 290, 318, 319, 542, 565, 575, 635, 564, 573, 635, 562, 565, 555, 558, 559, 3152, 3157, 3269, 3326, 3300, 3317, 3298, 3325, 3321, 3326, 3313, 3300, 3317, 3316, 3248, 3315, 3327, 3325, 3325, 3317, 3326, 3300, 2045, 1990, 2012, 1997, 2010, 1989, 1985, 1990, 1993, 2012, 1997, 1996, 1928, 2011, 2012, 2010, 1985, 1990, 1999, 1341, 1318, 1343, 1343, 1304, 1283, 1306, 1306, 2488, 2495, 2482, 2477, 2491, 1325, 1322, 1319, 1336, 1326, 2076, 2074, 2077, 2061, 2278, 2272, 2279, 2295, 2999, 2956, 2966, 2951, 2960, 2959, 2955, 2956, 2947, 2966, 2951, 2950, 3010, 2951, 2961, 2945, 2947, 2962, 2951, 3010, 2961, 2951, 2963, 2967, 2951, 2956, 2945, 2951, 306, 283, 1020, 987, 963, 980, 985, 988, 977, 917, 976, 966, 982, 980, 965, 976, 917, 966, 976, 964, 960, 976, 987, 982, 976, 2495, 2436, 2462, 2447, 2456, 2439, 2435, 2436, 2443, 2462, 2447, 2446, 2506, 2457, 2462, 2456, 2435, 2436, 2445, 984, 997, 1005, 1016, 1022, 1001, 1016, 1017, 957, 991, 984, 986, 980, 979, 962, 988, 975, 975, 988, 964, 957, 1023, 1000, 1001, 957, 1002, 1020, 1006, 957, 1924, 1977, 1969, 1956, 1954, 1973, 1956, 1957, 2017, 1923, 1924, 1926, 1928, 1935, 1950, 1934, 1923, 1931, 1924, 1922, 1941, 2017, 1955, 1972, 1973, 2017, 1974, 1952, 1970, 2017, 1543, 1596, 1574, 1591, 1568, 1599, 1595, 1596, 1587, 1574, 1591, 1590, 1650, 1587, 1568, 1568, 1587, 1579, 2808, 2757, 2765, 2776, 2782, 2761, 2776, 2777, 2717, 2714, 2695, 2714, 728, 741, 749, 760, 766, 745, 760, 761, 701, 747, 764, 753, 744, 760, 2913, 2906, 2897, 2892, 2884, 2897, 2903, 2880, 2897, 2896, 2836, 2882, 2901, 2904, 2881, 2897, 2446, 2487, 2475, 2474, 2454, 2465, 2469, 2464, 2465, 2486, 2532, 2477, 2487, 2532, 2471, 2472, 2475, 2487, 2465, 2464, 1916, 1863, 1885, 1868, 1883, 1860, 1856, 1863, 1864, 1885, 1868, 1869, 1801, 1862, 1867, 1859, 1868, 1866, 1885, 573, 512, 520, 541, 539, 524, 541, 540, 600, 534, 537, 533, 541, 1142, 1099, 1091, 1110, 1104, 1095, 1110, 1111, 1043, 1142, 1149, 1143, 1132, 1138, 1121, 1121, 1138, 1130, 1043, 1105, 1094, 1095, 1043, 1092, 1106, 1088, 1043, 3161, 3172, 3180, 3193, 3199, 3176, 3193, 3192, 3132, 3161, 3154, 3160, 3139, 3155, 3166, 3158, 3161, 3167, 3144, 3132, 3198, 3177, 3176, 3132, 3179, 3197, 3183, 3132, 2245, 2144, 2081, 2100, 2144, 2092, 2089, 2094, 2085, 2144, 3029, 2966, 2970, 2969, 2944, 2968, 2971, 3029, 2013, 1933, 1948, 1929, 1941, 2013, 785, 812, 804, 817, 823, 800, 817, 816, 884, 821, 884, 822, 827, 827, 824, 817, 821, 826, 884, 822, 801, 800, 884, 803, 821, 807, 884, 3051, 3030, 3038, 3019, 3021, 3034, 3019, 3018, 2958, 3023, 2958, 3018, 3009, 3035, 3020, 3010, 3019, 2958, 3020, 3035, 3034, 2958, 3033, 3023, 3037, 2958, 2753, 2776, 2756, 2757, 2731, 2797, 2788, 2809, 2793, 2786, 2799, 2808, 2731, 2757, 2794, 2757, 2731, 2794, 2789, 2799, 2731, 2786, 2789, 2797, 2786, 2789, 2786, 2815, 2786, 2798, 2808, 2737, 2731, 2042, 1991, 1999, 2010, 2012, 1995, 2010, 2011, 1951, 2014, 2001, 1951, 2006, 2001, 1995, 1951, 2013, 1994, 1995, 1951, 1992, 2014, 1996, 1951, 1945, 1956, 1964, 1977, 1983, 1960, 1977, 1976, 2044, 1981, 2044, 1968, 1971, 1970, 1979, 2044, 1982, 1961, 1960, 2044, 1963, 1981, 1967, 2044, 2270, 2275, 2283, 2302, 2296, 2287, 2302, 2303, 2235, 2298, 2235, 2293, 2298, 2294, 2302, 2235, 2297, 2286, 2287, 2235, 2284, 2298, 2280, 2235, 2022, 2011, 2003, 1990, 1984, 2007, 1990, 1991, 1923, 1997, 2006, 1999, 1999, 1923, 1985, 2006, 2007, 1923, 2004, 1986, 2000, 1923, 1845, 1800, 1792, 1813, 1811, 1796, 1813, 1812, 1872, 1809, 1872, 1795, 1796, 1794, 1817, 1822, 1815, 1872, 1810, 1797, 1796, 1872, 1799, 1809, 1795, 1872, 1760, 1787, 1762, 1762};
    private static final char[] NON_EXECUTE_PREFIX = C0031.m2984(C0038.m4022(m6270(), 0, 5, 1104));
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    private void consumeNonExecutePrefix() {
        m6269(this, true);
        int iM6246 = m6246(this) - 1;
        this.pos = iM6246;
        char[] cArrM6271 = m6271();
        if (iM6246 + cArrM6271.length > m6255(this) && !m6272(this, cArrM6271.length)) {
            return;
        }
        int i = 0;
        while (true) {
            char[] cArrM62712 = m6271();
            if (i >= cArrM62712.length) {
                this.pos = m6246(this) + cArrM62712.length;
                return;
            } else if (m6249(this)[m6246(this) + i] != cArrM62712[i]) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        m6242(r57);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        /*
            r57 = this;
            r6 = r57
            r0 = 0
            r1 = 0
        L4:
            r2 = 0
        L5:
            int r3 = m6246(r6)
            int r4 = r3 + r2
            int r5 = m6255(r6)
            if (r4 >= r5) goto L56
            char[] r4 = m6249(r6)
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L66
            r4 = 10
            if (r3 == r4) goto L66
            r4 = 12
            if (r3 == r4) goto L66
            r4 = 13
            if (r3 == r4) goto L66
            r4 = 32
            if (r3 == r4) goto L66
            r4 = 35
            if (r3 == r4) goto L52
            r4 = 44
            if (r3 == r4) goto L66
            r4 = 47
            if (r3 == r4) goto L52
            r4 = 61
            if (r3 == r4) goto L52
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L66
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L66
            r4 = 58
            if (r3 == r4) goto L66
            r4 = 59
            if (r3 == r4) goto L52
            switch(r3) {
                case 91: goto L66;
                case 92: goto L52;
                case 93: goto L66;
                default: goto L4f;
            }
        L4f:
            int r2 = r2 + 1
            goto L5
        L52:
            m6242(r6)
            goto L66
        L56:
            char[] r3 = m6249(r6)
            int r3 = r3.length
            if (r2 >= r3) goto L68
            int r3 = r2 + 1
            boolean r3 = m6272(r6, r3)
            if (r3 == 0) goto L66
            goto L5
        L66:
            r1 = r2
            goto L8e
        L68:
            if (r0 != 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = com.joke.script.bean.C0074.m6445(r2, r3)
            r0.<init>(r3)
        L75:
            char[] r3 = m6249(r6)
            int r4 = m6246(r6)
            com.zfork.entry.C0075.m6802(r0, r3, r4, r2)
            int r3 = m6246(r6)
            int r3 = r3 + r2
            r6.pos = r3
            r2 = 1
            boolean r2 = m6272(r6, r2)
            if (r2 != 0) goto L4
        L8e:
            if (r0 != 0) goto L9e
            java.lang.String r0 = new java.lang.String
            char[] r2 = m6249(r6)
            int r3 = m6246(r6)
            r0.<init>(r2, r3, r1)
            goto Lad
        L9e:
            char[] r2 = m6249(r6)
            int r3 = m6246(r6)
            com.zfork.entry.C0075.m6802(r0, r2, r3, r1)
            java.lang.String r0 = com.joke.plugin.gson.internal.bind.C0068.m5536(r0)
        Lad:
            int r2 = m6246(r6)
            int r2 = r2 + r1
            r6.pos = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        m6242(r55);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void skipUnquotedValue() throws java.io.IOException {
        /*
            r55 = this;
            r4 = r55
        L2:
            r0 = 0
        L3:
            int r1 = m6246(r4)
            int r2 = r1 + r0
            int r3 = m6255(r4)
            if (r2 >= r3) goto L5b
            char[] r2 = m6249(r4)
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L53
            r2 = 10
            if (r1 == r2) goto L53
            r2 = 12
            if (r1 == r2) goto L53
            r2 = 13
            if (r1 == r2) goto L53
            r2 = 32
            if (r1 == r2) goto L53
            r2 = 35
            if (r1 == r2) goto L50
            r2 = 44
            if (r1 == r2) goto L53
            r2 = 47
            if (r1 == r2) goto L50
            r2 = 61
            if (r1 == r2) goto L50
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L53
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L53
            r2 = 58
            if (r1 == r2) goto L53
            r2 = 59
            if (r1 == r2) goto L50
            switch(r1) {
                case 91: goto L53;
                case 92: goto L50;
                case 93: goto L53;
                default: goto L4d;
            }
        L4d:
            int r0 = r0 + 1
            goto L3
        L50:
            m6242(r4)
        L53:
            int r1 = m6246(r4)
            int r1 = r1 + r0
            r4.pos = r1
            return
        L5b:
            int r1 = r1 + r0
            r4.pos = r1
            r0 = 1
            boolean r0 = m6272(r4, r0)
            if (r0 != 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    /* JADX INFO: renamed from: ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m6240(Object obj, int i) {
        if (C0071.m6069() >= 0) {
            ((JsonReader) obj).push(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static IOException m6241(Object obj, Object obj2) {
        if (C0064.m4578() > 0) {
            return ((JsonReader) obj).syntaxError((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m6242(Object obj) throws IOException {
        if (C0074.m6454() < 0) {
            ((JsonReader) obj).checkLenient();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6243(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((JsonReader) obj).peekedNumberLength;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m6244(Object obj) {
        if (C0067.m5468() < 0) {
            ((JsonReader) obj).skipToEndOfLine();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6245(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((JsonReader) obj).peekedString;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6246(Object obj) {
        if (C0035.m3569() < 0) {
            return ((JsonReader) obj).pos;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m6247(Object obj) {
        if (C0071.m6069() > 0) {
            return ((JsonReader) obj).nextUnquotedValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int[] m6248(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((JsonReader) obj).pathIndices;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static char[] m6249(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((JsonReader) obj).buffer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m6250(Object obj, char c) throws IOException {
        if (C0068.m5678() > 0) {
            ((JsonReader) obj).skipQuotedValue(c);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int m6251(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((JsonReader) obj).stackSize;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6252(Object obj) throws IOException {
        if (C0063.m4427() > 0) {
            ((JsonReader) obj).skipUnquotedValue();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6253(Object obj) {
        if (C0017.m846() > 0) {
            ((JsonReader) obj).consumeNonExecutePrefix();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6254(Object obj, Object obj2) {
        if (C0036.m3653() <= 0) {
            return ((JsonReader) obj).skipTo((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6255(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((JsonReader) obj).limit;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Reader m6256(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((JsonReader) obj).in;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6257(Object obj) {
        if (C0018.m1064() > 0) {
            return ((JsonReader) obj).lenient;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m6258(Object obj) {
        if (C0077.m7272() < 0) {
            return ((JsonReader) obj).peekNumber();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static char m6259(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((JsonReader) obj).readEscapeCharacter();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int m6260(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((JsonReader) obj).lineNumber;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String[] m6261(Object obj) {
        if (C0077.m7272() < 0) {
            return ((JsonReader) obj).pathNames;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m6262(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((JsonReader) obj).peekKeyword();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static long m6263(Object obj) {
        if (C0016.m717() <= 0) {
            return ((JsonReader) obj).peekedLong;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m6264(Object obj, char c) {
        if (C0030.m2940() > 0) {
            return ((JsonReader) obj).nextQuotedValue(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6265(Object obj) {
        if (C0019.m1311() >= 0) {
            return ((JsonReader) obj).lineStart;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۥ, reason: contains not printable characters */
    public static int[] m6266(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((JsonReader) obj).stack;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static boolean m6267(Object obj, char c) {
        if (C0017.m846() > 0) {
            return ((JsonReader) obj).isLiteral(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦ۠۟, reason: contains not printable characters */
    public static int m6268(Object obj) {
        if (C0074.m6454() < 0) {
            return ((JsonReader) obj).peeked;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۥ, reason: contains not printable characters */
    public static int m6269(Object obj, boolean z) {
        if (C0028.m2593() >= 0) {
            return ((JsonReader) obj).nextNonWhitespace(z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6270() {
        if (C0037.m3837() < 0) {
            return f211short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static char[] m6271() {
        if (C0030.m2940() >= 0) {
            return NON_EXECUTE_PREFIX;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6272(Object obj, int i) {
        if (C0026.m2298() < 0) {
            return ((JsonReader) obj).fillBuffer(i);
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        m6266(this)[0] = 8;
        this.stackSize = 1;
        C0072.m6131(m6256(this));
    }

    public void skipValue() {
        int i = 0;
        do {
            int iM6268 = m6268(this);
            if (iM6268 == 0) {
                iM6268 = C0065.m4745(this);
            }
            if (iM6268 == 3) {
                m6240(this, 1);
            } else if (iM6268 == 1) {
                m6240(this, 3);
            } else if (iM6268 == 4 || iM6268 == 2) {
                this.stackSize = m6251(this) - 1;
                i--;
                this.peeked = 0;
            } else {
                if (iM6268 == 14 || iM6268 == 10) {
                    m6252(this);
                } else if (iM6268 == 8 || iM6268 == 12) {
                    m6250(this, '\'');
                } else if (iM6268 == 9 || iM6268 == 13) {
                    m6250(this, Typography.quote);
                } else if (iM6268 == 16) {
                    this.pos = m6246(this) + m6243(this);
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArrM6248 = m6248(this);
        int iM6251 = m6251(this);
        int i2 = iM6251 - 1;
        iArrM6248[i2] = iArrM6248[i2] + 1;
        m6261(this)[iM6251 - 1] = C0034.m3431(m6270(), 678, 4, 1678);
    }

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.joke.plugin.gson.stream.JsonReader.1

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f212short = {2190, 2227, 2235, 2222, 2216, 2239, 2222, 2223, 2283, 2218, 2283, 2213, 2218, 2214, 2222, 2283, 2217, 2238, 2239, 2283, 2236, 2218, 2232, 2283};

            /* JADX INFO: renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
            public static short[] m6273() {
                if (C0068.m5678() > 0) {
                    return f212short;
                }
                return null;
            }

            /* JADX INFO: renamed from: ۟ۡۧۥۡ, reason: not valid java name and contains not printable characters */
            public static int m6274(Object obj) {
                if (C0016.m717() < 0) {
                    return ((JsonReader) obj).peeked;
                }
                return 0;
            }

            @Override // com.joke.plugin.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    C0026.m2335((JsonTreeReader) jsonReader);
                    return;
                }
                int iM6274 = m6274(jsonReader);
                if (iM6274 == 0) {
                    iM6274 = C0065.m4745(jsonReader);
                }
                if (iM6274 == 13) {
                    jsonReader.peeked = 9;
                    return;
                }
                if (iM6274 == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (iM6274 == 14) {
                        jsonReader.peeked = 10;
                        return;
                    }
                    StringBuilder sb = new StringBuilder(C0074.m6452(m6273(), 0, 24, 2251));
                    C0036.m3741(sb, C0022.m1758(jsonReader));
                    C0077.m7290(sb, C0027.m2498(jsonReader));
                    throw new IllegalStateException(C0068.m5536(sb));
                }
            }
        };
    }

    private void checkLenient() throws IOException {
        if (!m6257(this)) {
            throw m6241(this, C0033.m3330(m6270(), 15, 56, 369));
        }
    }

    private boolean fillBuffer(int i) {
        int iM6255;
        int iM6265;
        int i2 = i;
        char[] cArrM6249 = m6249(this);
        int iM62652 = m6265(this);
        int iM6246 = m6246(this);
        this.lineStart = iM62652 - iM6246;
        int iM62552 = m6255(this);
        if (iM62552 != iM6246) {
            int i3 = iM62552 - iM6246;
            this.limit = i3;
            C0027.m2519(cArrM6249, iM6246, cArrM6249, 0, i3);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader readerM6256 = m6256(this);
            int iM62553 = m6255(this);
            int iM2873 = C0030.m2873(readerM6256, cArrM6249, iM62553, cArrM6249.length - iM62553);
            if (iM2873 == -1) {
                return false;
            }
            iM6255 = m6255(this) + iM2873;
            this.limit = iM6255;
            if (m6260(this) == 0 && (iM6265 = m6265(this)) == 0 && iM6255 > 0 && cArrM6249[0] == 65279) {
                this.pos = m6246(this) + 1;
                this.lineStart = iM6265 + 1;
                i2++;
            }
        } while (iM6255 < i2);
        return true;
    }

    private boolean isLiteral(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m6242(this);
        return false;
    }

    private int nextNonWhitespace(boolean z) throws IOException {
        char[] cArrM6249 = m6249(this);
        int iM6246 = m6246(this);
        int iM6255 = m6255(this);
        while (true) {
            if (iM6246 == iM6255) {
                this.pos = iM6246;
                if (!m6272(this, 1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder sb = new StringBuilder(C0020.m1443(m6270(), 71, 12, 603));
                    C0077.m7290(sb, C0027.m2498(this));
                    throw new EOFException(C0068.m5536(sb));
                }
                iM6246 = m6246(this);
                iM6255 = m6255(this);
            }
            int i = iM6246 + 1;
            char c = cArrM6249[iM6246];
            if (c == '\n') {
                this.lineNumber = m6260(this) + 1;
                this.lineStart = i;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.pos = i;
                    if (i == iM6255) {
                        this.pos = iM6246;
                        boolean zM6272 = m6272(this, 2);
                        this.pos = m6246(this) + 1;
                        if (!zM6272) {
                            return c;
                        }
                    }
                    m6242(this);
                    int iM62462 = m6246(this);
                    char c2 = cArrM6249[iM62462];
                    if (c2 == '*') {
                        this.pos = iM62462 + 1;
                        if (!m6254(this, C0021.m1650(m6270(), 83, 2, 3194))) {
                            throw m6241(this, C0031.m3047(m6270(), 85, 20, 3216));
                        }
                        iM6246 = m6246(this) + 2;
                        iM6255 = m6255(this);
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.pos = iM62462 + 1;
                        m6244(this);
                        iM6246 = m6246(this);
                        iM6255 = m6255(this);
                    }
                } else {
                    if (c != '#') {
                        this.pos = i;
                        return c;
                    }
                    this.pos = i;
                    m6242(this);
                    m6244(this);
                    iM6246 = m6246(this);
                    iM6255 = m6255(this);
                }
            }
            iM6246 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r1 = new java.lang.StringBuilder(com.joke.script.bean.C0074.m6445((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        com.zfork.entry.C0075.m6802(r1, r0, r3, r2 - r3);
        r60.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String nextQuotedValue(char r61) throws java.io.IOException {
        /*
            r60 = this;
            r10 = r61
            r9 = r60
            char[] r0 = m6249(r9)
            r1 = 0
        L9:
            int r2 = m6246(r9)
            int r3 = m6255(r9)
        L11:
            r4 = r3
            r3 = r2
        L13:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L32
            r9.pos = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L2a
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L2a:
            com.zfork.entry.C0075.m6802(r1, r0, r3, r7)
            java.lang.String r10 = com.joke.plugin.gson.internal.bind.C0068.m5536(r1)
            return r10
        L32:
            r8 = 92
            if (r2 != r8) goto L5b
            r9.pos = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L48
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = com.joke.script.bean.C0074.m6445(r7, r5)
            r1.<init>(r4)
        L48:
            com.zfork.entry.C0075.m6802(r1, r0, r3, r2)
            char r2 = m6259(r9)
            com.zfork.multiplatforms.android.bomb.C0077.m7289(r1, r2)
            int r2 = m6246(r9)
            int r3 = m6255(r9)
            goto L11
        L5b:
            r5 = 10
            if (r2 != r5) goto L68
            int r2 = m6260(r9)
            int r2 = r2 + r6
            r9.lineNumber = r2
            r9.lineStart = r7
        L68:
            r2 = r7
            goto L13
        L6a:
            if (r1 != 0) goto L7a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = com.joke.script.bean.C0074.m6445(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7a:
            int r4 = r2 - r3
            com.zfork.entry.C0075.m6802(r1, r0, r3, r4)
            r9.pos = r2
            boolean r2 = m6272(r9, r6)
            if (r2 == 0) goto L88
            goto L9
        L88:
            short[] r19 = m6270()
            r22 = 1960(0x7a8, float:2.747E-42)
            r20 = 105(0x69, float:1.47E-43)
            r21 = 19
            java.lang.String r19 = com.zfork.multiplatforms.android.bomb.C0078.m7427(r19, r20, r21, r22)
            r10 = r19
            java.io.IOException r10 = m6241(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    private int peekKeyword() {
        String strM2695;
        String strM2840;
        int i;
        char c = m6249(this)[m6246(this)];
        if (c == 't' || c == 'T') {
            strM2695 = C0029.m2695(m6270(), 142, 4, 2152);
            strM2840 = C0030.m2840(m6270(), 146, 4, 2226);
            i = 5;
        } else if (c == 'f' || c == 'F') {
            strM2695 = C0064.m4545(m6270(), 132, 5, 2526);
            strM2840 = C0019.m1189(m6270(), 137, 5, 1387);
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            strM2695 = C0033.m3330(m6270(), 124, 4, 1363);
            strM2840 = C0020.m1443(m6270(), 128, 4, 1366);
            i = 7;
        }
        int iM7380 = C0078.m7380(strM2695);
        for (int i2 = 1; i2 < iM7380; i2++) {
            if (m6246(this) + i2 >= m6255(this) && !m6272(this, i2 + 1)) {
                return 0;
            }
            char c2 = m6249(this)[m6246(this) + i2];
            if (c2 != C0077.m7212(strM2695, i2) && c2 != C0077.m7212(strM2840, i2)) {
                return 0;
            }
        }
        if ((m6246(this) + iM7380 < m6255(this) || m6272(this, iM7380 + 1)) && m6267(this, m6249(this)[m6246(this) + iM7380])) {
            return 0;
        }
        this.pos = m6246(this) + iM7380;
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        if (m6267(r69, r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b9, code lost:
    
        r69.peekedLong = r11;
        r69.pos = m6246(r69) + r8;
        r69.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d2, code lost:
    
        r69.peekedNumberLength = r8;
        r69.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int peekNumber() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.plugin.gson.stream.JsonReader.peekNumber():int");
    }

    private void push(int i) {
        int iM6251 = m6251(this);
        int[] iArrM6266 = m6266(this);
        if (iM6251 == iArrM6266.length) {
            int i2 = iM6251 * 2;
            this.stack = C0073.m6314(iArrM6266, i2);
            this.pathIndices = C0073.m6314(m6248(this), i2);
            this.pathNames = (String[]) C0067.m5421(m6261(this), i2);
        }
        int[] iArrM62662 = m6266(this);
        int iM62512 = m6251(this);
        this.stackSize = iM62512 + 1;
        iArrM62662[iM62512] = i;
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        int iM6246 = m6246(this);
        int iM6255 = m6255(this);
        String strM2695 = C0029.m2695(m6270(), 150, 28, 3042);
        if (iM6246 == iM6255 && !m6272(this, 1)) {
            throw m6241(this, strM2695);
        }
        char[] cArrM6249 = m6249(this);
        int iM62462 = m6246(this);
        int i2 = iM62462 + 1;
        this.pos = i2;
        char c = cArrM6249[iM62462];
        if (c == '\n') {
            this.lineNumber = m6260(this) + 1;
            this.lineStart = i2;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                throw m6241(this, C0038.m4022(m6270(), 180, 23, 949));
            }
            if (iM62462 + 5 > m6255(this) && !m6272(this, 4)) {
                throw m6241(this, strM2695);
            }
            int iM62463 = m6246(this);
            int i3 = iM62463 + 4;
            char c2 = 0;
            while (iM62463 < i3) {
                char c3 = m6249(this)[iM62463];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException(C0032.m3232(C0068.m5544(m6270(), 178, 2, 366), new String(m6249(this), m6246(this), 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                iM62463++;
            }
            this.pos = m6246(this) + 4;
            return c2;
        }
        return c;
    }

    private void skipQuotedValue(char c) throws IOException {
        char[] cArrM6249 = m6249(this);
        do {
            int iM6246 = m6246(this);
            int iM6255 = m6255(this);
            while (iM6246 < iM6255) {
                int i = iM6246 + 1;
                char c2 = cArrM6249[iM6246];
                if (c2 == c) {
                    this.pos = i;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = i;
                    m6259(this);
                    iM6246 = m6246(this);
                    iM6255 = m6255(this);
                } else {
                    if (c2 == '\n') {
                        this.lineNumber = m6260(this) + 1;
                        this.lineStart = i;
                    }
                    iM6246 = i;
                }
            }
            this.pos = iM6246;
        } while (m6272(this, 1));
        throw m6241(this, C0072.m6116(m6270(), 203, 19, 2538));
    }

    private void skipToEndOfLine() {
        char c;
        do {
            if (m6246(this) >= m6255(this) && !m6272(this, 1)) {
                return;
            }
            char[] cArrM6249 = m6249(this);
            int iM6246 = m6246(this);
            int i = iM6246 + 1;
            this.pos = i;
            c = cArrM6249[iM6246];
            if (c == '\n') {
                this.lineNumber = m6260(this) + 1;
                this.lineStart = i;
                return;
            }
        } while (c != '\r');
    }

    private IOException syntaxError(String str) throws MalformedJsonException {
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, str);
        C0077.m7290(sb, C0027.m2498(this));
        throw new MalformedJsonException(C0068.m5536(sb));
    }

    public void beginArray() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 3) {
            m6240(this, 1);
            m6248(this)[m6251(this) - 1] = 0;
            this.peeked = 0;
        } else {
            StringBuilder sb = new StringBuilder(C0027.m2404(m6270(), 222, 29, 925));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
    }

    public void beginObject() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 1) {
            m6240(this, 3);
            this.peeked = 0;
        } else {
            StringBuilder sb = new StringBuilder(C0016.m625(m6270(), 251, 30, 1985));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
    }

    public int doPeek() throws IOException {
        int iM6269;
        int[] iArrM6266 = m6266(this);
        int iM6251 = m6251(this);
        int i = iArrM6266[iM6251 - 1];
        if (i == 1) {
            iArrM6266[iM6251 - 1] = 2;
        } else if (i == 2) {
            int iM62692 = m6269(this, true);
            if (iM62692 != 44) {
                if (iM62692 != 59) {
                    if (iM62692 != 93) {
                        throw m6241(this, C0034.m3431(m6270(), 281, 18, 1618));
                    }
                    this.peeked = 4;
                    return 4;
                }
                m6242(this);
            }
        } else {
            if (i == 3 || i == 5) {
                iArrM6266[iM6251 - 1] = 4;
                if (i == 5 && (iM6269 = m6269(this, true)) != 44) {
                    if (iM6269 != 59) {
                        if (iM6269 != 125) {
                            throw m6241(this, C0067.m5418(m6270(), 361, 19, 1833));
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    m6242(this);
                }
                int iM62693 = m6269(this, true);
                if (iM62693 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iM62693 == 39) {
                    m6242(this);
                    this.peeked = 12;
                    return 12;
                }
                String strM3603 = C0035.m3603(m6270(), 380, 13, 632);
                if (iM62693 == 125) {
                    if (i == 5) {
                        throw m6241(this, strM3603);
                    }
                    this.peeked = 2;
                    return 2;
                }
                m6242(this);
                this.pos = m6246(this) - 1;
                if (!m6267(this, (char) iM62693)) {
                    throw m6241(this, strM3603);
                }
                this.peeked = 14;
                return 14;
            }
            if (i == 4) {
                iArrM6266[iM6251 - 1] = 5;
                int iM62694 = m6269(this, true);
                if (iM62694 != 58) {
                    if (iM62694 != 61) {
                        throw m6241(this, C0018.m1070(m6270(), 299, 12, 2749));
                    }
                    m6242(this);
                    if (m6246(this) < m6255(this) || m6272(this, 1)) {
                        char[] cArrM6249 = m6249(this);
                        int iM6246 = m6246(this);
                        if (cArrM6249[iM6246] == '>') {
                            this.pos = iM6246 + 1;
                        }
                    }
                }
            } else if (i == 6) {
                if (m6257(this)) {
                    m6253(this);
                }
                m6266(this)[m6251(this) - 1] = 7;
            } else if (i == 7) {
                if (m6269(this, false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                m6242(this);
                this.pos = m6246(this) - 1;
            } else if (i == 8) {
                throw new IllegalStateException(C0071.m5991(m6270(), 341, 20, 2500));
            }
        }
        int iM62695 = m6269(this, true);
        if (iM62695 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iM62695 == 39) {
            m6242(this);
            this.peeked = 8;
            return 8;
        }
        if (iM62695 != 44 && iM62695 != 59) {
            if (iM62695 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iM62695 != 93) {
                if (iM62695 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos = m6246(this) - 1;
                int iM6262 = m6262(this);
                if (iM6262 != 0) {
                    return iM6262;
                }
                int iM6258 = m6258(this);
                if (iM6258 != 0) {
                    return iM6258;
                }
                if (!m6267(this, m6249(this)[m6246(this)])) {
                    throw m6241(this, C0067.m5418(m6270(), 311, 14, 669));
                }
                m6242(this);
                this.peeked = 10;
                return 10;
            }
            if (i == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i != 1 && i != 2) {
            throw m6241(this, C0021.m1650(m6270(), 325, 16, 2868));
        }
        m6242(this);
        this.pos = m6246(this) - 1;
        this.peeked = 7;
        return 7;
    }

    public void endArray() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 != 4) {
            StringBuilder sb = new StringBuilder(C0020.m1443(m6270(), 393, 27, 1075));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        int iM6251 = m6251(this);
        this.stackSize = iM6251 - 1;
        int[] iArrM6248 = m6248(this);
        int i = iM6251 - 2;
        iArrM6248[i] = iArrM6248[i] + 1;
        this.peeked = 0;
    }

    public void endObject() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 != 2) {
            StringBuilder sb = new StringBuilder(C0078.m7427(m6270(), 420, 28, 3100));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        int iM6251 = m6251(this);
        int i = iM6251 - 1;
        this.stackSize = i;
        m6261(this)[i] = null;
        int[] iArrM6248 = m6248(this);
        int i2 = iM6251 - 2;
        iArrM6248[i2] = iArrM6248[i2] + 1;
        this.peeked = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder(C0029.m2695(m6270(), 448, 1, 2273));
        int iM6251 = m6251(this);
        for (int i = 0; i < iM6251; i++) {
            int i2 = m6266(this)[i];
            if (i2 == 1 || i2 == 2) {
                C0077.m7289(sb, '[');
                C0021.m1551(sb, m6248(this)[i]);
                C0077.m7289(sb, ']');
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                C0077.m7289(sb, '.');
                String str = m6261(this)[i];
                if (str != null) {
                    C0077.m7290(sb, str);
                }
            }
        }
        return C0068.m5536(sb);
    }

    public boolean hasNext() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        return (iM6268 == 2 || iM6268 == 4) ? false : true;
    }

    public final boolean isLenient() {
        return m6257(this);
    }

    public String locationString() {
        int iM6260 = m6260(this) + 1;
        int iM6246 = (m6246(this) - m6265(this)) + 1;
        StringBuilder sb = new StringBuilder(C0063.m4315(m6270(), 449, 9, 2112));
        C0021.m1551(sb, iM6260);
        C0077.m7290(sb, C0064.m4545(m6270(), 458, 8, 3061));
        C0021.m1551(sb, iM6246);
        C0077.m7290(sb, C0065.m4757(m6270(), 466, 6, 2045));
        C0077.m7290(sb, C0064.m4512(this));
        return C0068.m5536(sb);
    }

    public boolean nextBoolean() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 5) {
            this.peeked = 0;
            int[] iArrM6248 = m6248(this);
            int iM6251 = m6251(this) - 1;
            iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
            return true;
        }
        if (iM6268 != 6) {
            StringBuilder sb = new StringBuilder(C0027.m2404(m6270(), 472, 27, 852));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        this.peeked = 0;
        int[] iArrM62482 = m6248(this);
        int iM62512 = m6251(this) - 1;
        iArrM62482[iM62512] = iArrM62482[iM62512] + 1;
        return false;
    }

    public double nextDouble() throws MalformedJsonException {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 15) {
            this.peeked = 0;
            int[] iArrM6248 = m6248(this);
            int iM6251 = m6251(this) - 1;
            iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
            return m6263(this);
        }
        if (iM6268 == 16) {
            this.peekedString = new String(m6249(this), m6246(this), m6243(this));
            this.pos = m6246(this) + m6243(this);
        } else if (iM6268 == 8 || iM6268 == 9) {
            this.peekedString = m6264(this, iM6268 == 8 ? '\'' : Typography.quote);
        } else if (iM6268 == 10) {
            this.peekedString = m6247(this);
        } else if (iM6268 != 11) {
            StringBuilder sb = new StringBuilder(C0075.m6791(m6270(), 499, 26, 2990));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        this.peeked = 11;
        double dM2611 = C0028.m2611(m6245(this));
        if (!m6257(this) && (C0017.m923(dM2611) || C0031.m3010(dM2611))) {
            StringBuilder sb2 = new StringBuilder(C0111.m13097(m6270(), 525, 33, 2699));
            C0023.m1897(sb2, dM2611);
            C0077.m7290(sb2, C0027.m2498(this));
            throw new MalformedJsonException(C0068.m5536(sb2));
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArrM62482 = m6248(this);
        int iM62512 = m6251(this) - 1;
        iArrM62482[iM62512] = iArrM62482[iM62512] + 1;
        return dM2611;
    }

    public int nextInt() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        String strM2321 = C0026.m2321(m6270(), 558, 24, 1983);
        if (iM6268 == 15) {
            long jM6263 = m6263(this);
            int i = (int) jM6263;
            if (jM6263 != i) {
                StringBuilder sb = new StringBuilder(strM2321);
                C0078.m7466(sb, m6263(this));
                C0077.m7290(sb, C0027.m2498(this));
                throw new NumberFormatException(C0068.m5536(sb));
            }
            this.peeked = 0;
            int[] iArrM6248 = m6248(this);
            int iM6251 = m6251(this) - 1;
            iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
            return i;
        }
        if (iM6268 == 16) {
            this.peekedString = new String(m6249(this), m6246(this), m6243(this));
            this.pos = m6246(this) + m6243(this);
        } else {
            if (iM6268 != 8 && iM6268 != 9 && iM6268 != 10) {
                StringBuilder sb2 = new StringBuilder(strM2321);
                C0036.m3741(sb2, C0022.m1758(this));
                C0077.m7290(sb2, C0027.m2498(this));
                throw new IllegalStateException(C0068.m5536(sb2));
            }
            if (iM6268 == 10) {
                this.peekedString = m6247(this);
            } else {
                this.peekedString = m6264(this, iM6268 == 8 ? '\'' : Typography.quote);
            }
            try {
                int iM4116 = C0039.m4116(m6245(this));
                this.peeked = 0;
                int[] iArrM62482 = m6248(this);
                int iM62512 = m6251(this) - 1;
                iArrM62482[iM62512] = iArrM62482[iM62512] + 1;
                return iM4116;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double dM2611 = C0028.m2611(m6245(this));
        int i2 = (int) dM2611;
        if (i2 != dM2611) {
            StringBuilder sb3 = new StringBuilder(strM2321);
            C0077.m7290(sb3, m6245(this));
            C0077.m7290(sb3, C0027.m2498(this));
            throw new NumberFormatException(C0068.m5536(sb3));
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArrM62483 = m6248(this);
        int iM62513 = m6251(this) - 1;
        iArrM62483[iM62513] = iArrM62483[iM62513] + 1;
        return i2;
    }

    public long nextLong() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 15) {
            this.peeked = 0;
            int[] iArrM6248 = m6248(this);
            int iM6251 = m6251(this) - 1;
            iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
            return m6263(this);
        }
        String strM4315 = C0063.m4315(m6270(), 582, 24, 2012);
        if (iM6268 == 16) {
            this.peekedString = new String(m6249(this), m6246(this), m6243(this));
            this.pos = m6246(this) + m6243(this);
        } else {
            if (iM6268 != 8 && iM6268 != 9 && iM6268 != 10) {
                StringBuilder sb = new StringBuilder(strM4315);
                C0036.m3741(sb, C0022.m1758(this));
                C0077.m7290(sb, C0027.m2498(this));
                throw new IllegalStateException(C0068.m5536(sb));
            }
            if (iM6268 == 10) {
                this.peekedString = m6247(this);
            } else {
                this.peekedString = m6264(this, iM6268 == 8 ? '\'' : Typography.quote);
            }
            try {
                long jM3481 = C0034.m3481(m6245(this));
                this.peeked = 0;
                int[] iArrM62482 = m6248(this);
                int iM62512 = m6251(this) - 1;
                iArrM62482[iM62512] = iArrM62482[iM62512] + 1;
                return jM3481;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double dM2611 = C0028.m2611(m6245(this));
        long j = (long) dM2611;
        if (j != dM2611) {
            StringBuilder sb2 = new StringBuilder(strM4315);
            C0077.m7290(sb2, m6245(this));
            C0077.m7290(sb2, C0027.m2498(this));
            throw new NumberFormatException(C0068.m5536(sb2));
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArrM62483 = m6248(this);
        int iM62513 = m6251(this) - 1;
        iArrM62483[iM62513] = iArrM62483[iM62513] + 1;
        return j;
    }

    public String nextName() {
        String strM6264;
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 14) {
            strM6264 = m6247(this);
        } else if (iM6268 == 12) {
            strM6264 = m6264(this, '\'');
        } else {
            if (iM6268 != 13) {
                StringBuilder sb = new StringBuilder(C0018.m1070(m6270(), 606, 24, 2203));
                C0036.m3741(sb, C0022.m1758(this));
                C0077.m7290(sb, C0027.m2498(this));
                throw new IllegalStateException(C0068.m5536(sb));
            }
            strM6264 = m6264(this, Typography.quote);
        }
        this.peeked = 0;
        m6261(this)[m6251(this) - 1] = strM6264;
        return strM6264;
    }

    public void nextNull() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 != 7) {
            StringBuilder sb = new StringBuilder(C0077.m7205(m6270(), 630, 22, 1955));
            C0036.m3741(sb, C0022.m1758(this));
            C0077.m7290(sb, C0027.m2498(this));
            throw new IllegalStateException(C0068.m5536(sb));
        }
        this.peeked = 0;
        int[] iArrM6248 = m6248(this);
        int iM6251 = m6251(this) - 1;
        iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
    }

    public String nextString() {
        String str;
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        if (iM6268 == 10) {
            str = m6247(this);
        } else if (iM6268 == 8) {
            str = m6264(this, '\'');
        } else if (iM6268 == 9) {
            str = m6264(this, Typography.quote);
        } else if (iM6268 == 11) {
            str = m6245(this);
            this.peekedString = null;
        } else if (iM6268 == 15) {
            str = C0019.m1223(m6263(this));
        } else {
            if (iM6268 != 16) {
                StringBuilder sb = new StringBuilder(C0017.m936(m6270(), 652, 26, 1904));
                C0036.m3741(sb, C0022.m1758(this));
                C0077.m7290(sb, C0027.m2498(this));
                throw new IllegalStateException(C0068.m5536(sb));
            }
            str = new String(m6249(this), m6246(this), m6243(this));
            this.pos = m6246(this) + m6243(this);
        }
        this.peeked = 0;
        int[] iArrM6248 = m6248(this);
        int iM6251 = m6251(this) - 1;
        iArrM6248[iM6251] = iArrM6248[iM6251] + 1;
        return str;
    }

    public JsonToken peek() {
        int iM6268 = m6268(this);
        if (iM6268 == 0) {
            iM6268 = C0065.m4745(this);
        }
        switch (iM6268) {
            case 1:
                return C0111.m13035();
            case 2:
                return C0038.m3970();
            case 3:
                return C0029.m2811();
            case 4:
                return C0111.m13111();
            case 5:
            case 6:
                return C0031.m3035();
            case 7:
                return C0028.m2553();
            case 8:
            case 9:
            case 10:
            case 11:
                return C0026.m2284();
            case 12:
            case 13:
            case 14:
                return C0025.m2220();
            case 15:
            case 16:
                return C0022.m1769();
            case 17:
                return C0036.m3659();
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, C0032.m3134(C0030.m2951(this)));
        C0077.m7290(sb, C0027.m2498(this));
        return C0068.m5536(sb);
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader != null) {
            this.in = reader;
            return;
        }
        throw new NullPointerException(C0063.m4315(m6270(), 5, 10, 2958));
    }

    private boolean skipTo(String str) {
        int iM7380 = C0078.m7380(str);
        while (true) {
            if (m6246(this) + iM7380 > m6255(this) && !m6272(this, iM7380)) {
                return false;
            }
            char[] cArrM6249 = m6249(this);
            int iM6246 = m6246(this);
            if (cArrM6249[iM6246] == '\n') {
                this.lineNumber = m6260(this) + 1;
                this.lineStart = iM6246 + 1;
            } else {
                for (int i = 0; i < iM7380; i++) {
                    if (m6249(this)[m6246(this) + i] != C0077.m7212(str, i)) {
                        break;
                    }
                }
                return true;
            }
            this.pos = m6246(this) + 1;
        }
    }
}
