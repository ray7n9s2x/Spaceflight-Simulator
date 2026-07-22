package p003;

import android.os.Build;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۦۤ۟۟۟ۦۥ۟۟۟ۦۦ۟۟۟ۦۧ۟۟۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0130 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f606short = {1166, 1171, 1158, 1231, 1152, 1169, 1152, 1154, 1161, 1156, 1231, 1161, 1152, 1171, 1164, 1166, 1167, 1176, 1231, 1170, 1156, 1154, 1172, 1171, 1160, 1173, 1176, 1231, 1172, 1173, 1160, 1165, 1170, 1231, 1195, 1152, 1171, 1204, 1173, 1160, 1165, 1170, 1221, 1207, 1156, 1171, 1155, 1152, 1173, 1160, 1164, 1209, 1236, 1233, 1240, 1186, 1156, 1171, 1173, 1160, 1159, 1160, 1154, 1152, 1173, 1156, 1202, 1204, 1199, 1263, 1202, 1188, 1186, 1204, 1203, 1192, 1205, 1208, 1263, 1201, 1194, 1186, 1202, 1263, 1169, 1162, 1154, 1170, 1270, 1253, 1175, 1188, 1203, 1187, 1184, 1205, 1192, 1196, 1177, 1268, 1265, 1272, 1154, 1188, 1203, 1205, 1192, 1191, 1192, 1186, 1184, 1205, 1188, 1131, 1129, 1144, 1097, 1122, 1135, 1123, 1128, 1129, 1128, 3143, 3142, 3124, 3117, 3097, 3074, 3108, 3116, 3107, 3116, 22732, 21692, 20569, 24464, 19831, 30610, -29613, 30954, -882, 26864, 26210, 29968, 30954, 22425, -29620, 26043, 24965, 29968, 30954, 22425, -872, 19646, -27724, 24964, 20927, 19758, 29968, 30954, 22425, -872, -27226, 26870, 20927, 19758, 19915, 20788, 21233, 30954, 22425, -26344, -30635, 23726, 20702, 21563, 23538, 18709, 29680, -30671, 31880, -1812, 23044, 29383, 21981, 18764, 21563, 23538, 18709, 29680, -30671, 31880, 308, 312, 314, 306, 375, 318, 313, 375, 319, 312, 312, 316, 264, 276, 306, 293, 291, 318, 305, 318, 308, 310, 291, 306, 264, 304, 306, 291, 274, 313, 308, 312, 307, 306, 307};

    public C0130() {
        int iM13273 = C0205.m13273();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13273 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0205.m13270("ZjksnF04gDZjmKXjxMlS")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static void SetStr() {
        String strM13281;
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i > 23 ? 1678 : 1709;
                    break;
                case 204:
                    strM13281 = C0204.m13267(f606short, 0, 66, 1249);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM13281 = C0207.m13281(f606short, 66, 47, 1217);
                    break;
            }
        }
        className = strM13281;
        methodName = C0207.m13281(f606short, 113, 10, 1036);
        methodSig = C0205.m13272(f606short, 123, 4, 3183);
    }

    public static native byte[] backup(Object obj);

    public static byte[] hook(Object obj) {
        byte[] bArrBackup = backup(obj);
        byte[] bArr = C0193.f718;
        C0204.m13267(f606short, WorkQueueKt.MASK, 6, 3195);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = bArr == null ? 1678 : 1709;
                    break;
                case 204:
                    boolean zM13233 = C0193.m13233(bArrBackup, false);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zM13233 ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0205.m13272(f606short, 174, 19, 2038);
                                return bArrBackup;
                            case 500:
                                C0204.m13267(f606short, 133, 41, 916);
                                return C0193.f718;
                        }
                    }
                    break;
                case 239:
                    byte[] bArr2 = C0193.f712;
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = bArr2 == null ? 48705 : 48736;
                                break;
                            case 47384:
                                return bArrBackup;
                            case 47417:
                                boolean zM132332 = C0193.m13233(bArrBackup, false);
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            return bArrBackup;
                                        case Base64.mimeLineLength /* 76 */:
                                            C0203.m13263(f606short, 193, 35, 343);
                                            return C0193.f712;
                                        case 239:
                                            i4 = !zM132332 ? 48829 : 48860;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
