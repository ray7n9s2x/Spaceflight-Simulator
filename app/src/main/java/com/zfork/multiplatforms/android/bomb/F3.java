package com.zfork.multiplatforms.android.bomb;

import androidx.appcompat.app.AppCompatDelegate;
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
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
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
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class F3 implements AutoCloseable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f242short = {783, 772, 787, 772, 843, 790, 789, 768, 774, 780, 771, 780, 774, 772, 785, 780, 778, 779, 843, 787, 768, 791, 790, 780, 778, 779, 425, 438, 729, 722, 735, 723, 728, 725, 722, 731, 2790, 2805, 2739, 2736, 2741, 2741, 2740, 2786, 2803, 2785, 2785, 2728, 1528, 1535, 1519, 1506, 1509, 2808, 2786, 2771, 2804, 2812, 2809, 2800, 2801, 2741, 2785, 2810, 2741, 2791, 2800, 2804, 2801, 2741, 2095, 2101, 2166, 2170, 2171, 2150, 2170, 2169, 2160, 2101, 2166, 2169, 2170, 2150, 2160, 2161, 3044, 3070, 2989, 2986, 3007, 2992, 3002, 3007, 2988, 3002, 3070, 2999, 2992, 2990, 2987, 2986, 3070, 3005, 2994, 2993, 2989, 3003, 3002, 2510, 2497, 2500, 2509, 2450, 842, 848, 842, 783, 772, 782, 842, 773, 780, 842, 780, 771, 774, 783, 842, 792, 783, 779, 777, 770, 783, 782, 842, 771, 772, 842, 398, 389, 413, 465, 2729, 2739, 2806, 2813, 2789, 2810, 2785, 2812, 2813, 2814, 2806, 2813, 2791, 2739, 2789, 2802, 2785, 2810, 2802, 2801, 2815, 2806, 2739, 2418, 2364, 2365, 2342, 2418, 2337, 2338, 2359, 2353, 2363, 2356, 2363, 2359, 2358, 1632, 1627, 1606, 1600, 1605, 1605, 1626, 1607, 1601, 1616, 1617, 1557, 1605, 1620, 1606, 1606, 1602, 1626, 1607, 1617, 1557, 1606, 1605, 1616, 1622, 1557, 1619, 1626, 1607, 1557, 2380, 2403, 2400, 2428, 2410, 2411};
    public final Charset a;
    public final HashMap b = new HashMap();
    public boolean c;

    public static char[] c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    /* JADX INFO: renamed from: ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6927() {
        if (C0019.m1311() == 0) {
            return f242short;
        }
        return null;
    }

    public final void b(ArrayList arrayList, char[] cArr, Charset... charsetArr) {
        if (charsetArr.length > 0) {
            for (Charset charset : charsetArr) {
                try {
                    C0066.m4793(arrayList, C0017.m825(C0111.m13177(cArr, charset)));
                } catch (IOException unused) {
                }
            }
        }
        C0066.m4793(arrayList, cArr);
        Charset charsetM7177 = C0077.m7177(this);
        if (charsetM7177 != null) {
            try {
                C0066.m4793(arrayList, C0017.m825(C0111.m13177(cArr, charsetM7177)));
            } catch (IOException unused2) {
            }
        }
        try {
            C0066.m4793(arrayList, C0017.m825(C0111.m13177(cArr, C0022.m1684())));
        } catch (IOException unused3) {
        }
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        InputStream pushbackInputStream = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iM3071 = C0031.m3071(pushbackInputStream);
            if (iM3071 == -1 || iM3071 == 10) {
                break;
            }
            if (iM3071 == 13) {
                int iM30712 = C0031.m3071(pushbackInputStream);
                if (iM30712 == -1 || iM30712 == 10) {
                    break;
                }
                if (!(pushbackInputStream instanceof PushbackInputStream)) {
                    pushbackInputStream = new PushbackInputStream(pushbackInputStream);
                }
                C0071.m6042((PushbackInputStream) pushbackInputStream, iM30712);
            }
            C0070.m5921(byteArrayOutputStream, iM3071);
        }
        return C0077.m7297(byteArrayOutputStream);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        HashMap mapM1866 = C0023.m1866(this);
        Iterator itM4820 = C0066.m4820(C0020.m1411(mapM1866));
        while (C0036.m3657(itM4820)) {
            try {
                C0024.m1958((InputStream) C0071.m6012(itM4820));
            } catch (IOException unused) {
            }
        }
        C0067.m5425(mapM1866);
        this.c = true;
    }

    public final ArrayList e(String str, String str2, Charset... charsetArr) throws IOException {
        if (C0070.m5946(this)) {
            throw new IllegalStateException(C0028.m2609(m6927(), 211, 6, 2319));
        }
        if (C0019.m1242(str, C0021.m1650(m6927(), 43, 5, 2706))) {
            char[] cArrM2984 = C0031.m2984(C0071.m6056(str, 5));
            ArrayList arrayList = new ArrayList(3);
            C0024.m1971(this, arrayList, cArrM2984, charsetArr);
            return arrayList;
        }
        boolean zM5838 = C0070.m5838(C0064.m4545(m6927(), 48, 5, 1419), str);
        String strM4828 = C0066.m4828(m6927(), 53, 2, 2754);
        String strM48282 = C0066.m4828(m6927(), 55, 15, 2709);
        if (zM5838) {
            Console consoleM2104 = C0025.m2104();
            if (consoleM2104 != null) {
                StringBuilder sb = new StringBuilder();
                C0077.m7290(sb, str2);
                C0077.m7290(sb, strM4828);
                char[] cArrM3267 = C0033.m3267(consoleM2104, C0068.m5536(sb), new Object[0]);
                if (cArrM3267 == null) {
                    throw new IOException(C0074.m6503(strM48282, str2, C0069.m5807(m6927(), 70, 16, 2069)));
                }
                ArrayList arrayList2 = new ArrayList(3);
                C0024.m1971(this, arrayList2, cArrM3267, charsetArr);
                return arrayList2;
            }
            PrintStream printStreamM3219 = C0032.m3219();
            StringBuilder sb2 = new StringBuilder();
            C0077.m7290(sb2, str2);
            C0077.m7290(sb2, strM4828);
            C0065.m4767(printStreamM3219, C0068.m5536(sb2));
            byte[] bArrM3737 = C0036.m3737(C0073.m6312());
            if (bArrM3737.length != 0) {
                return C0078.m7428(this, bArrM3737, C0022.m1684(), charsetArr);
            }
            throw new IOException(C0074.m6503(strM48282, str2, C0022.m1728(m6927(), 86, 23, 3038)));
        }
        if (C0019.m1242(str, C0018.m1070(m6927(), AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 5, 2472))) {
            File fileM1893 = C0023.m1893(new File(C0071.m6056(str, 5)));
            HashMap mapM1866 = C0023.m1866(this);
            Object fileInputStream = (InputStream) C0067.m5420(mapM1866, fileM1893);
            if (fileInputStream == null) {
                fileInputStream = new FileInputStream(fileM1893);
                C0038.m3969(mapM1866, fileM1893, fileInputStream);
            }
            byte[] bArrM37372 = C0036.m3737(fileInputStream);
            if (bArrM37372.length != 0) {
                return C0078.m7428(this, bArrM37372, C0022.m1684(), charsetArr);
            }
            StringBuilder sb3 = new StringBuilder(strM48282);
            C0077.m7290(sb3, str2);
            C0077.m7290(sb3, C0063.m4315(m6927(), 114, 26, 874));
            C0036.m3741(sb3, fileM1893);
            throw new IOException(C0068.m5536(sb3));
        }
        if (!C0019.m1242(str, C0022.m1728(m6927(), 140, 4, 491))) {
            StringBuilder sb4 = new StringBuilder(C0075.m6791(m6927(), 181, 30, 1589));
            C0077.m7290(sb4, str2);
            C0077.m7290(sb4, strM4828);
            C0077.m7290(sb4, str);
            throw new IOException(C0068.m5536(sb4));
        }
        String strM3020 = C0031.m3020(C0071.m6056(str, 4));
        if (strM3020 != null) {
            char[] cArrM29842 = C0031.m2984(strM3020);
            ArrayList arrayList3 = new ArrayList(3);
            C0024.m1971(this, arrayList3, cArrM29842, charsetArr);
            return arrayList3;
        }
        StringBuilder sb5 = new StringBuilder(strM48282);
        C0077.m7290(sb5, str2);
        C0077.m7290(sb5, C0030.m2840(m6927(), 144, 23, 2707));
        C0077.m7290(sb5, strM3020);
        C0077.m7290(sb5, C0019.m1189(m6927(), 167, 14, 2386));
        throw new IOException(C0068.m5536(sb5));
    }

    public final ArrayList f(byte[] bArr, Charset charset, Charset... charsetArr) {
        ArrayList arrayList = new ArrayList(4);
        try {
            CharsetDecoder charsetDecoderM1277 = C0019.m1277(charset);
            CodingErrorAction codingErrorActionM13142 = C0111.m13142();
            CharBuffer charBufferM1860 = C0023.m1860(C0028.m2638(C0070.m5864(charsetDecoderM1277, codingErrorActionM13142), codingErrorActionM13142), C0020.m1393(bArr));
            char[] cArr = new char[C0071.m5984(charBufferM1860)];
            C0067.m5465(charBufferM1860, cArr);
            C0024.m1971(this, arrayList, cArr, charsetArr);
        } catch (IOException unused) {
        }
        C0066.m4793(arrayList, C0017.m825(bArr));
        return arrayList;
    }

    public F3() {
        boolean z;
        Charset charsetM666;
        String strM4087 = C0039.m4087(C0078.m7427(m6927(), 0, 26, 869));
        if (strM4087 == null) {
            z = true;
        } else {
            z = !C0019.m1242(strM4087, C0032.m3209(m6927(), 26, 2, 408));
        }
        Charset charsetM1684 = null;
        if (!z) {
            try {
                Method methodM6369 = C0073.m6369(Console.class, C0019.m1189(m6927(), 28, 8, 700), null);
                C0035.m3619(methodM6369, true);
                String str = (String) C0070.m5924(methodM6369, null, null);
                if (str == null) {
                    charsetM1684 = C0022.m1684();
                } else {
                    if (C0025.m2111(C0027.m2404(m6927(), 36, 7, 2693), str)) {
                        charsetM666 = C0018.m1069();
                    } else {
                        charsetM666 = C0016.m666(str);
                    }
                    charsetM1684 = charsetM666;
                }
            } catch (IllegalArgumentException | ReflectiveOperationException unused) {
            }
        }
        this.a = charsetM1684;
    }

    public static void a(ArrayList arrayList, char[] cArr) {
        Iterator itM4154 = C0039.m4154(arrayList);
        while (C0036.m3657(itM4154)) {
            if (C0069.m5770(cArr, (char[]) C0071.m6012(itM4154))) {
                return;
            }
        }
        C0017.m919(arrayList, cArr);
    }

    public static byte[] d(char[] cArr, Charset charset) {
        CharsetEncoder charsetEncoderM690 = C0016.m690(charset);
        CodingErrorAction codingErrorActionM13142 = C0111.m13142();
        ByteBuffer byteBufferM6490 = C0074.m6490(C0024.m1993(C0024.m1978(charsetEncoderM690, codingErrorActionM13142), codingErrorActionM13142), C0032.m3152(cArr));
        byte[] bArr = new byte[C0071.m5984(byteBufferM6490)];
        C0029.m2812(byteBufferM6490, bArr);
        return bArr;
    }
}
