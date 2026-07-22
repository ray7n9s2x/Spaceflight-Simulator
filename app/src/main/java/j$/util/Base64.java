package j$.util;

import j$.sun.misc.C0079;
import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.C0092;
import j$.time.format.C0082;
import j$.time.format.C0083;
import j$.util.concurrent.C0093;
import j$.util.function.C0094;
import java.util.function.C0105;

/* JADX INFO: loaded from: classes3.dex */
public class Base64 {
    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Decoder m8804() {
        if (C0092.m8724() < 0) {
            return Decoder.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۦ, reason: not valid java name and contains not printable characters */
    public static Encoder m8805() {
        if (C0093.m9101() >= 0) {
            return Encoder.c;
        }
        return null;
    }

    public static Encoder getEncoder() {
        return m8805();
    }

    public static Decoder getDecoder() {
        return m8804();
    }

    public static class Encoder {
        private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        private static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        static final Encoder c = new Encoder();

        /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
        public static char[] m8811() {
            if (C0094.m9148() >= 0) {
                return a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
        public static char[] m8812() {
            if (C0090.m8624() > 0) {
                return b;
            }
            return null;
        }

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArrM8626 = new byte[length];
            int length2 = bArr.length;
            char[] cArrM8811 = m8811();
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int iM7578 = C0080.m7578(i2 + i, i);
                int i4 = i2;
                int i5 = i3;
                while (i4 < iM7578) {
                    int i6 = i4 + 2;
                    int i7 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
                    i4 += 3;
                    int i8 = i7 | (bArr[i6] & 255);
                    bArrM8626[i5] = (byte) cArrM8811[(i8 >>> 18) & 63];
                    bArrM8626[i5 + 1] = (byte) cArrM8811[(i8 >>> 12) & 63];
                    int i9 = i5 + 3;
                    bArrM8626[i5 + 2] = (byte) cArrM8811[(i8 >>> 6) & 63];
                    i5 += 4;
                    bArrM8626[i9] = (byte) cArrM8811[i8 & 63];
                }
                int i10 = ((iM7578 - i2) / 3) * 4;
                i3 += i10;
                if (i10 == -1 && iM7578 < length2) {
                    throw null;
                }
                i2 = iM7578;
            }
            if (i2 < length2) {
                int i11 = i2 + 1;
                int i12 = bArr[i2] & 255;
                int i13 = i3 + 1;
                bArrM8626[i3] = (byte) cArrM8811[i12 >> 2];
                if (i11 == length2) {
                    bArrM8626[i13] = (byte) cArrM8811[(i12 << 4) & 63];
                    int i14 = i3 + 3;
                    bArrM8626[i3 + 2] = kotlin.io.encoding.Base64.padSymbol;
                    i3 += 4;
                    bArrM8626[i14] = kotlin.io.encoding.Base64.padSymbol;
                } else {
                    int i15 = bArr[i11] & 255;
                    bArrM8626[i13] = (byte) cArrM8811[((i12 << 4) & 63) | (i15 >> 4)];
                    int i16 = i3 + 3;
                    bArrM8626[i3 + 2] = (byte) cArrM8811[(i15 << 2) & 63];
                    i3 += 4;
                    bArrM8626[i16] = kotlin.io.encoding.Base64.padSymbol;
                }
            }
            if (i3 != length) {
                bArrM8626 = C0090.m8626(bArrM8626, i3);
            }
            return new String(bArrM8626, 0, 0, bArrM8626.length);
        }
    }

    public static class Decoder {
        private static final int[] a;
        private static final int[] b;
        static final Decoder c;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f483short = {2780, 2811, 2789, 2784, 2785, 2741, 2807, 2796, 2785, 2800, 2741, 2804, 2791, 2791, 2804, 2796, 2741, 2813, 2804, 2790, 2741, 2786, 2791, 2810, 2811, 2802, 2741, 2721, 2744, 2807, 2796, 2785, 2800, 2741, 2800, 2811, 2801, 2812, 2811, 2802, 2741, 2784, 2811, 2812, 2785, 695, 658, 658, 667, 665, 671, 658, 734, 668, 671, 653, 667, 712, 714, 734, 669, 662, 671, 652, 671, 669, 650, 667, 652, 734, 3001, 2974, 2944, 2949, 2948, 3024, 2962, 2953, 2948, 2965, 3024, 2961, 2946, 2946, 2961, 2953, 3024, 2968, 2961, 2947, 3024, 2969, 2974, 2963, 2975, 2946, 2946, 2965, 2963, 2948, 3024, 2965, 2974, 2964, 2969, 2974, 2967, 3024, 2962, 2953, 2948, 2965, 3024, 2961, 2948, 3024, 3155, 3198, 3180, 3179, 3135, 3178, 3185, 3190, 3179, 3135, 3195, 3184, 3194, 3180, 3135, 3185, 3184, 3179, 3135, 3191, 3198, 3177, 3194, 3135, 3194, 3185, 3184, 3178, 3192, 3191, 3135, 3177, 3198, 3187, 3190, 3195, 3135, 3197, 3190, 3179, 3180, 894, 857, 839, 834, 835, 791, 853, 846, 835, 850, 876, 874, 791, 836, 863, 856, 834, 859, 851, 791, 854, 835, 791, 859, 850, 854, 836, 835, 791, 863, 854, 833, 850, 791, 773, 791, 853, 846, 835, 850, 836, 791, 849, 856, 837, 791, 853, 854, 836, 850, 769, 771, 791, 853, 846, 835, 850, 836};

        /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
        public static int[] m8806() {
            if (C0083.m8022() <= 0) {
                return a;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
        public static int[] m8807() {
            if (C0105.m11264() >= 0) {
                return b;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۤ۟ۤ, reason: not valid java name and contains not printable characters */
        public static char[] m8808() {
            if (C0082.m7983() < 0) {
                return Encoder.m8811();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۡ۟۠۟, reason: not valid java name and contains not printable characters */
        public static char[] m8809() {
            if (C0079.m7512() >= 0) {
                return Encoder.m8812();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۥۧۡ, reason: contains not printable characters */
        public static short[] m8810() {
            if (C0105.m11264() > 0) {
                return f483short;
            }
            return null;
        }

        static {
            int[] iArr = new int[256];
            a = iArr;
            C0083.m8060(iArr, -1);
            for (int i = 0; i < 64; i++) {
                m8806()[m8808()[i]] = i;
            }
            m8806()[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            C0083.m8060(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                m8807()[m8809()[i2]] = i2;
            }
            m8807()[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        
            if (r10 != 18) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[PHI: r9 r11
  0x00a6: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v9 int) binds: [B:21:0x0049, B:23:0x004d, B:30:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r11v6 int) = (r11v1 int), (r11v1 int), (r11v9 int) binds: [B:21:0x0049, B:23:0x004d, B:30:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] decode(java.lang.String r70) {
            /*
                Method dump skipped, instruction units count: 439
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }
}
