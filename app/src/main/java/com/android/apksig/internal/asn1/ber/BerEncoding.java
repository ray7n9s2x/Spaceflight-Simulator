package com.android.apksig.internal.asn1.ber;

import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.common.base.Ascii;
import com.joke.connectdevice.bean.C0064;
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
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BerEncoding {
    public static final int ID_FLAG_CONSTRUCTED_ENCODING = 32;
    public static final int TAG_CLASS_APPLICATION = 1;
    public static final int TAG_CLASS_CONTEXT_SPECIFIC = 2;
    public static final int TAG_CLASS_PRIVATE = 3;
    public static final int TAG_CLASS_UNIVERSAL = 0;
    public static final int TAG_NUMBER_BIT_STRING = 3;
    public static final int TAG_NUMBER_BOOLEAN = 1;
    public static final int TAG_NUMBER_GENERALIZED_TIME = 24;
    public static final int TAG_NUMBER_INTEGER = 2;
    public static final int TAG_NUMBER_NULL = 5;
    public static final int TAG_NUMBER_OBJECT_IDENTIFIER = 6;
    public static final int TAG_NUMBER_OCTET_STRING = 4;
    public static final int TAG_NUMBER_SEQUENCE = 16;
    public static final int TAG_NUMBER_SET = 17;
    public static final int TAG_NUMBER_UTC_TIME = 23;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f90short = {2449, 2474, 2487, 2481, 2484, 2484, 2475, 2486, 2480, 2465, 2464, 2532, 2480, 2469, 2467, 2532, 2471, 2472, 2469, 2487, 2487, 2558, 2532, 1524, 1487, 1490, 1492, 1489, 1489, 1486, 1491, 1493, 1476, 1477, 1409, 1477, 1472, 1493, 1472, 1409, 1493, 1496, 1489, 1476, 1435, 1409, 2458, 2584, 2586, 2561, 2590, 2569, 2588, 2573, 2455, 2476, 2481, 2487, 2482, 2482, 2477, 2480, 2486, 2471, 2470, 2530, 2486, 2491, 2482, 2471, 2530, 2465, 2478, 2467, 2481, 2481, 2552, 2530, 915, 898, 898, 926, 923, 913, 915, 902, 923, 925, 924, 2675, 2664, 2671, 2672, 2659, 2676, 2677, 2663, 2666, 2457, 2513, 1765, 1768, 1760, 1775, 1769, 1790, 1674, 1763, 1774, 1775, 1764, 1790, 1763, 1772, 1763, 1775, 1784, 1095, 1116, 1093, 1093, 2725, 2729, 2750, 2735, 2750, 2762, 2745, 2750, 2744, 2723, 2724, 2733, 1224, 1219, 1246, 1194, 1241, 1246, 1240, 1219, 1220, 1229, 2673, 2678, 2668, 2685, 2687, 2685, 2666, 832, 845, 845, 846, 839, 835, 844, 3135, 3133, 3126, 3133, 3114, 3129, 3124, 3121, 3106, 3133, 3132, 3160, 3116, 3121, 3125, 3133, 2661, 2660, 2675, 2576, 2660, 2681, 2685, 2677, 2672, 2662, 2679, 2539, 2557, 2537, 2541, 2557, 2550, 2555, 2557};

    public static int getTagClass(byte b) {
        return (b & 255) >> 6;
    }

    public static int getTagNumber(byte b) {
        return b & Ascii.US;
    }

    public static boolean isConstructed(byte b) {
        return (b & 32) != 0;
    }

    public static byte setTagClass(byte b, int i) {
        return (byte) ((b & 63) | (i << 6));
    }

    public static byte setTagNumber(byte b, int i) {
        return (byte) ((b & (-32)) | i);
    }

    /* JADX INFO: renamed from: ۢۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1509() {
        if (C0035.m3569() < 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static short[] m1510() {
        if (C0018.m1064() > 0) {
            return f90short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۧ, reason: contains not printable characters */
    public static int[] m1511() {
        if (C0070.m5903() >= 0) {
            return AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.asn1.ber.BerEncoding$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass;
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        /* JADX INFO: renamed from: ۟۟ۧۦۤ, reason: not valid java name and contains not printable characters */
        public static int[] m1512() {
            if (C0068.m5678() > 0) {
                return $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۦۡۥۢ, reason: not valid java name and contains not printable characters */
        public static int[] m1513() {
            if (C0020.m1385() < 0) {
                return $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass;
            }
            return null;
        }

        static {
            int[] iArr = new int[C0017.m872().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass = iArr;
            try {
                iArr[C0030.m2893(C0035.m3630())] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m1513()[C0030.m2893(C0022.m1736())] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m1513()[C0030.m2893(C0064.m4581())] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m1513()[C0030.m2893(C0074.m6577())] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C0074.m6478().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr2;
            try {
                iArr2[C0030.m2893(C0019.m1179())] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m1512()[C0030.m2893(C0070.m5879())] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m1512()[C0030.m2893(C0030.m2863())] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m1512()[C0030.m2893(C0067.m5426())] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                m1512()[C0030.m2893(C0032.m3160())] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                m1512()[C0030.m2893(C0073.m6354())] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                m1512()[C0030.m2893(C0019.m1252())] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                m1512()[C0030.m2893(C0066.m4885())] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                m1512()[C0030.m2893(C0069.m5753())] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                m1512()[C0030.m2893(C0072.m6207())] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static int getTagClass(Asn1TagClass asn1TagClass) {
        int i = m1509()[C0030.m2893(asn1TagClass)];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    StringBuilder sb = new StringBuilder(C0070.m5942(m1510(), 0, 23, 2500));
                    C0036.m3741(sb, asn1TagClass);
                    throw new IllegalArgumentException(C0068.m5536(sb));
                }
            }
        }
        return i2;
    }

    public static int getTagNumber(Asn1Type asn1Type) {
        switch (m1511()[C0030.m2893(asn1Type)]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                StringBuilder sb = new StringBuilder(C0033.m3330(m1510(), 23, 23, 1441));
                C0036.m3741(sb, asn1Type);
                throw new IllegalArgumentException(C0068.m5536(sb));
        }
    }

    public static String tagClassToString(int i) {
        if (i == 0) {
            return C0078.m7427(m1510(), 89, 9, 2598);
        }
        if (i == 1) {
            return C0020.m1443(m1510(), 78, 11, 978);
        }
        if (i == 2) {
            return C0031.m2993();
        }
        if (i == 3) {
            return C0028.m2609(m1510(), 47, 7, 2632);
        }
        throw new IllegalArgumentException(C0071.m6038(i, C0035.m3603(m1510(), 54, 24, 2498)));
    }

    public static String tagNumberToString(int i) {
        if (i == 16) {
            return C0039.m4066(m1510(), 184, 8, 2488);
        }
        if (i == 17) {
            return C0038.m4022(m1510(), 181, 3, 2595);
        }
        if (i == 23) {
            return C0064.m4545(m1510(), 173, 8, 2608);
        }
        if (i == 24) {
            return C0021.m1650(m1510(), 157, 16, 3192);
        }
        switch (i) {
            case 1:
                return C0064.m4545(m1510(), 150, 7, 770);
            case 2:
                return C0020.m1443(m1510(), 143, 7, 2616);
            case 3:
                return C0026.m2321(m1510(), 133, 10, 1162);
            case 4:
                return C0111.m13097(m1510(), 121, 12, 2794);
            case 5:
                return C0027.m2404(m1510(), 117, 4, 1033);
            case 6:
                return C0075.m6791(m1510(), 100, 17, 1706);
            default:
                StringBuilder sb = new StringBuilder(C0067.m5418(m1510(), 98, 2, 2473));
                C0077.m7290(sb, C0021.m1651(i));
                return C0068.m5536(sb);
        }
    }

    public static String tagClassAndNumberToString(int i, int i2) {
        String strM4061 = C0039.m4061(i);
        String strM637 = C0016.m637(i2);
        if (!C0077.m7292(strM4061)) {
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, strM4061);
            C0077.m7290(sb, C0016.m625(m1510(), 46, 1, 2490));
            C0077.m7290(sb, strM637);
            return C0068.m5536(sb);
        }
        return strM637;
    }
}
