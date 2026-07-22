package com.android.apksig;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Hints {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f31short = {1841, 1832, 1839, 1837, 1832, 1842, 1845, 1903, 1836, 1828, 1845, 1824, 2820, 2838, 2838, 2816, 2833, 2838, 2890, 2822, 2826, 2824, 2891, 2820, 2827, 2817, 2839, 2826, 2828, 2817, 2891, 2829, 2828, 2827, 2833, 2838, 2891, 2837, 2828, 2827, 2838, 2891, 2833, 2845, 2833, 2673, 2677, 2664, 2679, 2667, 2667, 2673, 2682, 2676, 2685, 2230, 2231, 2213, 2254, 2267, 2827, 2853, 2856, 2860, 373, 942, 941, 936, 1004, 956, 933, 930, 1004, 956, 941, 952, 952, 937, 958, 930, 1004, 928, 933, 930, 937, 1004, 1640, 1641, 1659, 1552, 1541, 1565, 1616, 1608, 1614, 1609, 1565, 1631, 1624, 1565, 1614, 1608, 1613, 1613, 1618, 1615, 1609, 1624, 1625};
    public static final String PIN_BYTE_RANGE_ZIP_ENTRY_NAME = C0039.m4066(m582(), 0, 12, 1857);
    public static final String PIN_HINT_ASSET_ZIP_ENTRY_NAME = C0063.m4315(m582(), 12, 33, 2917);

    public static final class PatternWithRange {
        final long offset;
        final Pattern pattern;
        final long size;

        public PatternWithRange(String str) {
            this.pattern = C0039.m4174(str);
            this.offset = 0L;
            this.size = Long.MAX_VALUE;
        }

        /* JADX INFO: renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
        public static long m583(Object obj) {
            if (C0071.m6069() > 0) {
                return ((PatternWithRange) obj).offset;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۥۨۡۡ, reason: contains not printable characters */
        public static long m584(Object obj) {
            if (C0074.m6454() < 0) {
                return ((PatternWithRange) obj).size;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۦۨۤۡ, reason: contains not printable characters */
        public static long m585(Object obj) {
            if (C0071.m6069() >= 0) {
                return ((ByteRange) obj).start;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
        public static Pattern m586(Object obj) {
            if (C0036.m3653() <= 0) {
                return ((PatternWithRange) obj).pattern;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۦۦۥ, reason: not valid java name and contains not printable characters */
        public static long m587(Object obj) {
            if (C0034.m3450() > 0) {
                return ((ByteRange) obj).end;
            }
            return 0L;
        }

        public ByteRange ClampToAbsoluteByteRange(ByteRange byteRange) {
            long jM587 = m587(byteRange);
            long jM585 = m585(byteRange);
            long j = jM587 - jM585;
            long jM583 = m583(this);
            if (j < jM583) {
                return null;
            }
            long j2 = jM585 + jM583;
            return new ByteRange(j2, C0029.m2757(jM587 - j2, m584(this)) + j2);
        }

        public Matcher matcher(CharSequence charSequence) {
            return C0028.m2641(m586(this), charSequence);
        }

        public PatternWithRange(String str, long j, long j2) {
            this.pattern = C0039.m4174(str);
            this.offset = j;
            this.size = j2;
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m580(Object obj) {
        if (C0023.m1921() > 0) {
            return ((ByteRange) obj).start;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤ۠۟, reason: not valid java name and contains not printable characters */
    public static long m581(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((ByteRange) obj).end;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m582() {
        if (C0019.m1311() >= 0) {
            return f31short;
        }
        return null;
    }

    public static final class ByteRange {
        final long end;
        final long start;

        public ByteRange(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    public static byte[] encodeByteRangeList(List<ByteRange> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0034.m3427(list) * 8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            Iterator itM4732 = C0065.m4732(list);
            while (C0036.m3657(itM4732)) {
                ByteRange byteRange = (ByteRange) C0071.m6012(itM4732);
                C0025.m2214(dataOutputStream, (int) C0024.m2026(0L, C0029.m2757(m580(byteRange), 2147483647L)));
                C0025.m2214(dataOutputStream, (int) C0024.m2026(0L, C0029.m2757(m581(byteRange) - m580(byteRange), 2147483647L)));
            }
            return C0077.m7297(byteArrayOutputStream);
        } catch (IOException e) {
            throw new AssertionError(C0066.m4828(m582(), 45, 10, 2584), e);
        }
    }

    public static ArrayList<PatternWithRange> parsePinPatterns(byte[] bArr) {
        ArrayList<PatternWithRange> arrayList = new ArrayList<>();
        try {
            for (String str : C0025.m2222(new String(bArr, C0063.m4315(m582(), 55, 5, 2275)), C0021.m1650(m582(), 60, 1, 2817))) {
                String strM2901 = C0030.m2901(str, C0037.m3829(m582(), 61, 3, 2822), C0031.m2993());
                String[] strArrM2222 = C0025.m2222(strM2901, C0019.m1189(m582(), 64, 1, 341));
                if (strArrM2222.length == 1) {
                    C0017.m919(arrayList, new PatternWithRange(strArrM2222[0]));
                } else {
                    if (strArrM2222.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        C0077.m7290(sb, C0019.m1189(m582(), 65, 21, 972));
                        C0077.m7290(sb, strM2901);
                        throw new AssertionError(C0068.m5536(sb));
                    }
                    long jM3481 = C0034.m3481(strArrM2222[1]);
                    C0017.m919(arrayList, new PatternWithRange(strArrM2222[0], jM3481, C0034.m3481(strArrM2222[2]) - jM3481));
                }
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(C0039.m4066(m582(), 86, 23, 1597), e);
        }
    }
}
