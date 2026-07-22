package p003;

import android.content.pm.Signature;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۦ۟۟۟ۢۦ۠۟۟ۢۦۡ۟۟ۢۦۢ۟۟ۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0187 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f663short = {938, 939, 953, 978, 967, 1780, 1734, 2772, 2756, 2523, 2527, 1050, 32589, 20542, -1239, 3192, 3171, 3141, 3149, 3138, 3149, 18825, 29662, 1681, 1683, 1666, 1719, 1670, 1693, 1701, 1695, 1681, 1688, 1712, 1668, 1689, 1691, 1717, 1689, 1688, 1680, 1695, 1681, -31423, 22881, 1758, 19056, 28711, 1384, 1386, 1403, 1358, 1407, 1380, 1372, 1382, 1384, 1377, 1369, 1342, -31048, 23192, 1319, 17813, 32706, 2701, 2703, 2718, 2731, 2714, 2689, 2745, 2691, 2701, 2692, 2748, 2779, -30371, 22844, 2754, 2285, 29626, 23753, 18213, 26795, 20981, -31263, -2082, 23339, -30663, 25701, 28621, 2226, 2293, 29626, 23753, 28029, 24716, 2284, -25524, 21309, 23387, 23489, 2219, 2230, 2221, 2211, 2282, 2213, 2228, 2223, 27346, 22925, 31595, 29626, 23753, 23754, 32320, 23489, 2214, 2213, 2231, 2209, 2282, 2213, 2228, 2223, 2285, -2104, 27346, 28219, 27558, 2288, 18158, 27971, 17970, 18306, 28654, 29626, 23753, 2213, 2228, 2223, 2284, 28621, 2226, 2293, 29626, 23753, 28029, 24716, 18128, 28219, 27558, 32320, 28395, 22962, 17938, 27971, 17970, 27273, 23339, 17953, -29837, 23314, 23284, 29626, 23753, 18213, 26795, 2285, 2284, -25524, 21309, 27349, 18218, 28157, 23489, 2214, 2213, 2231, 2209, 2282, 2213, 2228, 2223, 2285, 19190, 28833, 1518, 1516, 1533, 1480, 1529, 1506, 1498, 1504, 1518, 1511, 1503, 1467, 1503, 1466, -31170, 23070, 1441, 26342, 27393, -31273, -25662, 17777, 32550, 2665, 2667, 2682, 2654, 2671, 2669, 2661, 2671, 2665, 2667, 2631, 2656, 2664, 2657, -30279, 21913, 2598, 2648, 2620, 26648, 27889, 26988, 29040, 24067, 28553, 17656, 2599, 2668, 2671, 2685, 2667, 2592, 2671, 2686, 2661, 29040, 24067, 2598, 17736, 23366, -31219, 32550, 2665, 2667, 2682, 2654, 2671, 2669, 2661, 2671, 2665, 2667, 2631, 2656, 2664, 2657, 23846, 2623, 2620, 2592, 2622, 2597, 30453, 29905, 17412, 17684, 21887, 24259, 22979, 22026, 17645, 32264, -31287, 29040, 2599, -2814, 21388, 28050, 27681, 27940, 29040, 24067, 2671, 2686, 2661, -2814, 23009, -29965, 17684, -32091, 29040, 24067, 25142, 21965, 24623, 23897, 17700, -32053, 26654, -29595, -29595, 29040, 24067, -2814, 20978, -29702, 2663, 2685, 2627, 2679, 2653, 2663, 2665, 2656, 25135, -28542, 17411, -31287, 26954, 22981, 17445, 32370, 2877, 2879, 2862, 2826, 2875, 2873, 2865, 2875, 2877, 2879, 2835, 2868, 2876, 2869, -30483, 21709, 2872, 2875, 2857, 2879, 2932, 2875, 2858, 2865, 28708, 24407, -3008, 19333, 29138, 1181, 1183, 1166, 1194, 1179, 1177, 1169, 1179, 1181, 1183, 1203, 1172, 1180, 1173, -30899, 23405, 1176, 1179, 1161, 1183, 1236, 1179, 1162, 1169, 32644, 20727, 24011, -30241, -1034, -29906, 21028, 1172, 1167, 1174, 1174, 313, 278, 284, 266, 279, 273, 284, 309, 281, 278, 273, 286, 285, 267, 268, 342, 256, 277, 276, 2843};

    /* JADX INFO: renamed from: ۟۟۟ۥ۟۟۟۟ۥ۠۟۟۟ۥۡ۟۟۟ۥۢ۟۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    private static final byte[] f664 = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0067. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m13205(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        int i3 = 0;
        while (true) {
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                        break;
                    case 49:
                        i4 = i3 >= length ? 1678 : 1709;
                        break;
                    case 204:
                        byte b = bArr[i3];
                        int i5 = (b >> 4) & 15;
                        int i6 = i3 * 2;
                        int i7 = 1740;
                        while (true) {
                            i7 ^= 1757;
                            switch (i7) {
                                case 17:
                                    i7 = i5 < 10 ? 1802 : 1833;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i = i5 + 48;
                                    break;
                                case 500:
                                    i = (i5 + 97) - 10;
                                    int i8 = 1864;
                                    while (true) {
                                        i8 ^= 1881;
                                        switch (i8) {
                                            case 17:
                                                i8 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        cArr[i6] = (char) i;
                        int i9 = b & Ascii.SI;
                        int i10 = 48767;
                        while (true) {
                            i10 ^= 48784;
                            switch (i10) {
                                case 14:
                                    break;
                                case 45:
                                    i2 = i9 + 48;
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    i2 = (i9 + 97) - 10;
                                    int i11 = 48891;
                                    while (true) {
                                        i11 ^= 48908;
                                        switch (i11) {
                                            case 22:
                                                break;
                                            case 503:
                                                i11 = 48922;
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 239:
                                    i10 = i9 < 10 ? 48829 : 48860;
                                    break;
                            }
                        }
                        cArr[i6 + 1] = (char) i2;
                        i3++;
                        int i12 = 49666;
                        while (true) {
                            i12 ^= 49683;
                            switch (i12) {
                                case 17:
                                    i12 = 49697;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return new String(cArr);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x003b. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m13206(Certificate[] certificateArr, String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = certificateArr == null ? 1678 : 1709;
                    break;
                case 204:
                    try {
                        boolean zEquals = str.equals(C0193.f711);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (zEquals) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    boolean zEquals2 = str.equals(C0193.f717);
                                    int i3 = 48891;
                                    while (true) {
                                        i3 ^= 48908;
                                        switch (i3) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (zEquals2) {
                                                    i3 = 49635;
                                                }
                                                break;
                                            case 32495:
                                                C0193.f718 = certificateArr[0].getEncoded();
                                                int i4 = 49666;
                                                while (true) {
                                                    i4 ^= 49683;
                                                    switch (i4) {
                                                        case 17:
                                                            i4 = 49697;
                                                            break;
                                                        case 50:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48953;
                                    }
                                    break;
                                case 500:
                                    C0193.f712 = certificateArr[0].getEncoded();
                                    C0193.f715 = new Signature[certificateArr.length];
                                    int i5 = 0;
                                    while (true) {
                                        int length = certificateArr.length;
                                        int i6 = 1864;
                                        while (true) {
                                            i6 ^= 1881;
                                            switch (i6) {
                                                case 17:
                                                    i6 = i5 >= length ? 48705 : 48736;
                                                    break;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    C0193.f715[i5] = new Signature(m13205(certificateArr[i5].getEncoded()));
                                                    i5++;
                                                    int i7 = 48767;
                                                    while (true) {
                                                        i7 ^= 48784;
                                                        switch (i7) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i7 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۟۟۠۟۟۟۟ۡ۟۟۟۟ۢ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Certificate[] m13207(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        int i;
        int i2;
        int i3;
        Certificate[] certificates;
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                while (true) {
                    try {
                        int i4 = bufferedInputStream.read(bArr, 0, bArr.length);
                        int i5 = 1616;
                        while (true) {
                            i5 ^= 1633;
                            switch (i5) {
                                case 14:
                                    break;
                                case 49:
                                    i5 = i4 == -1 ? 1678 : 1709;
                                    break;
                                case 204:
                                    int i6 = 1740;
                                    while (true) {
                                        i6 ^= 1757;
                                        switch (i6) {
                                            case 17:
                                                i6 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = jarEntry == null ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                certificates = null;
                                                break;
                                            case 47417:
                                                certificates = jarEntry.getCertificates();
                                                int i8 = 48767;
                                                while (true) {
                                                    i8 ^= 48784;
                                                    switch (i8) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i8 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    bufferedInputStream.close();
                                    int i9 = 48891;
                                    while (true) {
                                        i9 ^= 48908;
                                        switch (i9) {
                                            case 22:
                                                break;
                                            case 53:
                                                return certificates;
                                            case 503:
                                                i9 = inputStream == null ? 48953 : 49635;
                                                break;
                                            case 32495:
                                                inputStream.close();
                                                return certificates;
                                        }
                                    }
                                    break;
                            }
                        }
                    } finally {
                        while (true) {
                            switch (i3) {
                                case 17:
                                    continue;
                                case 50:
                            }
                        }
                    }
                }
            } finally {
                while (true) {
                    switch (i) {
                        case 18:
                            break;
                        case 51:
                            break;
                        case 84:
                            try {
                                while (true) {
                                    switch (i2) {
                                        case 497:
                                            continue;
                                        case 1711:
                                            break;
                                    }
                                }
                            } catch (Throwable th) {
                                break;
                            }
                            break;
                        case 241:
                            if (inputStream == null) {
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a3, code lost:
    
        r2 = r2 ^ 52628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
    
        switch(r2) {
            case 23: goto L365;
            case 54: goto L366;
            default: goto L368;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ab, code lost:
    
        r2 = 52642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01af, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:
    
        r0 = 53758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b6, code lost:
    
        r0 = r0 ^ 53775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ba, code lost:
    
        switch(r0) {
            case 1009: goto L370;
            case 1703: goto L371;
            default: goto L373;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01be, code lost:
    
        r0 = 54440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c2, code lost:
    
        r1 = r2.startsWith(p003.C0205.m13272(p003.C0187.f663short, 9, 2, 2454));
        r0 = 52735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d4, code lost:
    
        r0 = r0 ^ 52752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d8, code lost:
    
        switch(r0) {
            case 14: goto L385;
            case 45: goto L388;
            case 1007: goto L386;
            case 7927: goto L387;
            default: goto L389;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01dc, code lost:
    
        r0 = 52797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e0, code lost:
    
        if (r1 == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e2, code lost:
    
        r0 = 53479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e6, code lost:
    
        r0 = new android.content.pm.Signature(android.util.Base64.decode(r2, 0)).toCharsString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f4, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f7, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fd, code lost:
    
        r1 = 53510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0200, code lost:
    
        r1 = r1 ^ 53527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0204, code lost:
    
        switch(r1) {
            case 17: goto L321;
            case 50: goto L322;
            case 83: goto L324;
            case 116: goto L323;
            default: goto L328;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0208, code lost:
    
        if (r4 == null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020a, code lost:
    
        r1 = 53603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020e, code lost:
    
        r1 = 53572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0212, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0215, code lost:
    
        r1 = 53634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0218, code lost:
    
        r1 = r1 ^ 53651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021c, code lost:
    
        switch(r1) {
            case 17: goto L331;
            case 50: goto L332;
            default: goto L334;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0220, code lost:
    
        r1 = 53665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0224, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0225, code lost:
    
        r1.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0228, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0229, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022a, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022b, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x022e, code lost:
    
        r0 = 54533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0231, code lost:
    
        r0 = r0 ^ 54550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0235, code lost:
    
        switch(r0) {
            case 19: goto L360;
            case 50: goto L361;
            default: goto L363;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0239, code lost:
    
        r0 = 54564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x023e, code lost:
    
        r1.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0241, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0242, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0243, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0244, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0247, code lost:
    
        r0 = 54657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024a, code lost:
    
        r0 = r0 ^ 54674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x024e, code lost:
    
        switch(r0) {
            case 19: goto L355;
            case 50: goto L356;
            default: goto L358;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0252, code lost:
    
        r0 = 54688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0256, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0257, code lost:
    
        r1.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x025a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x025b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025c, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x025d, code lost:
    
        r0 = 55432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0260, code lost:
    
        r0 = r0 ^ 55449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0264, code lost:
    
        switch(r0) {
            case 17: goto L336;
            case 62: goto L337;
            case 95: goto L338;
            case 124: goto L213;
            default: goto L342;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0268, code lost:
    
        if (r4 != null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x026a, code lost:
    
        r0 = 55525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x026e, code lost:
    
        r0 = 55494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0272, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0275, code lost:
    
        r0 = 55556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0278, code lost:
    
        r0 = r0 ^ 55573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x027c, code lost:
    
        switch(r0) {
            case 17: goto L345;
            case 54: goto L346;
            default: goto L348;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0280, code lost:
    
        r0 = 55587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0285, code lost:
    
        r1.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0288, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x028a, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x028b, code lost:
    
        r1 = 55680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x028e, code lost:
    
        r1 = r1 ^ 55697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0292, code lost:
    
        switch(r1) {
            case 17: goto L350;
            case 1467: goto L351;
            default: goto L353;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0296, code lost:
    
        r1 = 56362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02a0, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02a1, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02a3, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02a4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02a6, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02a7, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02a9, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02aa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ac, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02ad, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02b0, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02b1, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02b5, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02b8, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r4 = p003.C0193.f695.getAssets().open(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r5 = new java.io.BufferedInputStream(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r6 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r7 = new java.io.BufferedOutputStream(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r3 = new byte[1048576];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r8 = r5.read(r3);
        r2 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r2 = r2 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        switch(r2) {
            case 14: goto L252;
            case 45: goto L250;
            case 76: goto L254;
            case 239: goto L253;
            default: goto L256;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r2 = 48829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r8 == (-1)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r2 = 48860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01a3, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r7.write(r3, 0, r8);
        r2 = 48891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01b6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r2 = r2 ^ 48908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        switch(r2) {
            case 22: goto L251;
            case 503: goto L396;
            default: goto L397;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r2 = 48922;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r7.flush();
        r2 = r6.toString(p003.C0207.m13281(p003.C0187.f663short, 0, 5, 1023)).replace(p003.C0207.m13281(p003.C0187.f663short, 5, 2, 1704), "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        r0 = 49666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        r0 = r0 ^ 49683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        switch(r0) {
            case 17: goto L262;
            case 50: goto L263;
            case 76: goto L225;
            case 83: goto L264;
            default: goto L268;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (r2 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        r0 = 49759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r0 = 49728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        r3 = r2.startsWith(p003.C0205.m13272(p003.C0187.f663short, 7, 2, 2709));
        r0 = 49790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r0 = r0 ^ 49807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        switch(r0) {
            case 18: goto L271;
            case 51: goto L274;
            case 84: goto L273;
            case 241: goto L272;
            default: goto L275;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r0 = 49852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r3 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r0 = 49883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        r8 = new java.io.DataInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(r2, 0)));
        r9 = r8.read() & 255;
        r10 = new byte[r9][];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        r3 = 49914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        r3 = r3 ^ 49931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        switch(r3) {
            case 497: goto L284;
            case 1711: goto L285;
            case 1736: goto L282;
            case 1769: goto L286;
            default: goto L287;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
    
        if (r0 >= r9) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010d, code lost:
    
        r3 = 50658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0111, code lost:
    
        r3 = 50627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
    
        r3 = new byte[r8.readInt()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        r10[r0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        r8.readFully(r3);
        r0 = r0 + 1;
        r3 = 50689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
    
        r3 = r3 ^ 50706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        switch(r3) {
            case 19: goto L380;
            case 50: goto L283;
            default: goto L381;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        r3 = 50720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
    
        r3 = r12.equals(p003.C0193.f711);
        r0 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        r0 = r0 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013e, code lost:
    
        switch(r0) {
            case 18: goto L294;
            case 53: goto L297;
            case 243: goto L295;
            case 4075: goto L296;
            default: goto L298;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        r0 = 50875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
    
        if (r3 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0148, code lost:
    
        r0 = 51557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        p003.C0193.f715 = new android.content.pm.Signature[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0150, code lost:
    
        r0 = 51588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
    
        r0 = r0 ^ 51605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        switch(r0) {
            case 17: goto L307;
            case 54: goto L308;
            case 87: goto L305;
            case 116: goto L309;
            default: goto L310;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
    
        if (r1 >= r9) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015d, code lost:
    
        r0 = 51681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0161, code lost:
    
        r0 = 51650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0165, code lost:
    
        p003.C0193.f715[r1] = new android.content.pm.Signature(r10[r1]);
        r1 = r1 + 1;
        r0 = 51712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        r0 = r0 ^ 51729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0179, code lost:
    
        switch(r0) {
            case 14: goto L306;
            case 15: goto L376;
            case 16: goto L376;
            case 17: goto L375;
            default: goto L376;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017d, code lost:
    
        r0 = 51743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0181, code lost:
    
        r0 = new android.content.pm.Signature(r10[0]).toCharsString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018d, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0190, code lost:
    
        r1 = 51836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        r1 = r1 ^ 51853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0197, code lost:
    
        switch(r1) {
            case 241: goto L317;
            case 1963: goto L221;
            default: goto L319;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019b, code lost:
    
        r1 = 52518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019f, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a0, code lost:
    
        r2 = 52611;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0231 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۟۟۠۟۟۟ۡ۟۟۟ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m13208(java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003.C0187.m13208(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r0.append(r8);
        r0.append(r3);
        r0.append(r1);
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: ۣ۟۟۟۟۟۠۟۟ۡ۟۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m13209(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003.C0187.m13209(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۟۟۟۟ۤ۟۟۟۟ۥ۟۟۟۟ۦ۟۟۟۟ۧ۟۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m13210(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003.C0187.m13210(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0100. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0118. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۟۠۟۟۟۟۠۠۟۟۟۠ۡ۟۟۟۠ۢ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m13211(String str) {
        int i;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, C0207.m13281(f663short, 417, 1, 2921));
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile.seek(randomAccessFile.length() - 6);
                randomAccessFile.readFully(byteBufferAllocate.array(), 0, 6);
                long jM13212 = C0188.m13212(byteBufferAllocate.getInt());
                short s = byteBufferAllocate.getShort();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                            break;
                        case 49:
                            i2 = s == 0 ? 1678 : 1709;
                            break;
                        case 204:
                            randomAccessFile.close();
                            return null;
                        case 239:
                            randomAccessFile.seek(jM13212 - 16);
                            randomAccessFile.readFully(byteBufferAllocate.array(), 0, 16);
                            boolean zEquals = Arrays.equals(byteBufferAllocate.array(), f664);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zEquals ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        randomAccessFile.seek(jM13212 - 24);
                                        randomAccessFile.readFully(byteBufferAllocate.array(), 0, 8);
                                        byteBufferAllocate.rewind();
                                        long j = byteBufferAllocate.getLong();
                                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(((int) j) + 8);
                                        byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                                        randomAccessFile.seek(jM13212 - ((long) byteBufferAllocate2.capacity()));
                                        randomAccessFile.readFully(byteBufferAllocate2.array(), 0, byteBufferAllocate2.capacity());
                                        long j2 = byteBufferAllocate2.getLong();
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = j == j2 ? 48705 : 48736;
                                                    break;
                                                case 47384:
                                                    while (true) {
                                                        int iRemaining = byteBufferAllocate2.remaining();
                                                        int i5 = 48767;
                                                        while (true) {
                                                            i5 ^= 48784;
                                                            switch (i5) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    break;
                                                                case Base64.mimeLineLength /* 76 */:
                                                                    j = byteBufferAllocate2.getLong();
                                                                    int i6 = byteBufferAllocate2.getInt();
                                                                    int i7 = 48891;
                                                                    while (true) {
                                                                        i7 ^= 48908;
                                                                        switch (i7) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                break;
                                                                            case 503:
                                                                                i7 = i6 == 1896449818 ? 48953 : 49635;
                                                                                break;
                                                                            case 32495:
                                                                                int i8 = 49666;
                                                                                while (true) {
                                                                                    i8 ^= 49683;
                                                                                    switch (i8) {
                                                                                        case 17:
                                                                                            i8 = i6 != -262969152 ? 49728 : 49759;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case Base64.mimeLineLength /* 76 */:
                                                                                            int i9 = 49790;
                                                                                            while (true) {
                                                                                                i9 ^= 49807;
                                                                                                switch (i9) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 241:
                                                                                                        i9 = 49821;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 83:
                                                                                            byteBufferAllocate2.position((byteBufferAllocate2.position() + ((int) j)) - 4);
                                                                                            int i10 = 49914;
                                                                                            while (true) {
                                                                                                i10 ^= 49931;
                                                                                                switch (i10) {
                                                                                                    case 497:
                                                                                                        i10 = 50596;
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i5 = iRemaining <= 24 ? 48829 : 48860;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    byteBufferAllocate2.position(byteBufferAllocate2.position() + 12);
                                                    byteBufferAllocate2.position(byteBufferAllocate2.position() + byteBufferAllocate2.getInt() + 4);
                                                    j = byteBufferAllocate2.getInt();
                                                    byte[] bArr = new byte[(int) j];
                                                    byteBufferAllocate2.get(bArr);
                                                    String strM13205 = m13205(bArr);
                                                    randomAccessFile.close();
                                                    return strM13205;
                                                case 47417:
                                                    randomAccessFile.close();
                                                    return null;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 500:
                                        randomAccessFile.close();
                                        return null;
                                }
                            }
                            break;
                    }
                }
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    i = 50689;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                while (true) {
                    i ^= 50706;
                    switch (i) {
                        case 19:
                            i = 50720;
                            break;
                        case 50:
                            throw th;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
    }
}
