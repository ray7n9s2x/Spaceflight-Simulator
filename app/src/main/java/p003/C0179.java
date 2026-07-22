package p003;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟ۢۢۤ۟۟ۢۢۥ۟۟ۢۢۦ۟۟ۢۢۧ۟۟ۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0179 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f655short = {2698, 2693, 2703, 2713, 2692, 2690, 2703, 2757, 2698, 2715, 2715, 2757, 2730, 2715, 2715, 2695, 2690, 2696, 2698, 2719, 2690, 2692, 2693, 2747, 2698, 2696, 2688, 2698, 2700, 2702, 2726, 2698, 2693, 2698, 2700, 2702, 2713, 2376, 2380, 2396, 2379, 2368, 2416, 2391, 2381, 2396, 2391, 2381, 2424, 2394, 2381, 2384, 2383, 2384, 2381, 2384, 2396, 2378, 3108, 3136, 3181, 3170, 3176, 3198, 3171, 3173, 3176, 3107, 3183, 3171, 3170, 3192, 3177, 3170, 3192, 3107, 3141, 3170, 3192, 3177, 3170, 3192, 3127, 3141, 3109, 3136, 3174, 3181, 3194, 3181, 3107, 3193, 3192, 3173, 3168, 3107, 3136, 3173, 3199, 3192, 3127, 516, 520, 522, 514, 583, 526, 521, 583, 534, 530, 514, 533, 542, 558, 521, 531, 514, 521, 531, 550, 516, 531, 526, 529, 526, 531, 526, 514, 532, 587, 583, 526, 521, 531, 514, 521, 531, 602, 3152, 3164, 3098, 3088, 3101, 3099, 3087, 3137, 2468, 2495, 2457, 2449, 2462, 2449, 1393, 1406, 1396, 1378, 1407, 1401, 1396, 1342, 1401, 1406, 1380, 1397, 1406, 1380, 1342, 1395, 1393, 1380, 1397, 1399, 1407, 1378, 1385, 1342, 1372, 1361, 1349, 1374, 1363, 1368, 1365, 1346, 22895, -30083, 20952, 23976, 24239, 22568, 30459, 24205, 25152, 26571, 2728, 32666, -29837, 25152, 26571, 17834, -32187, 24206, 20762, 17609, 31748, -27910, 21519, 2729, 24081, 32044, 22649, 19882, 943, 930, 950, 941, 928, 939, 934, 945, -785, 19950, 21102, 19657, -29914, 971, 28427, 25324, 22649, 19882, 30055, -25703, 23916, 970, -775, 2607, 23021, -24945, 20990, 27947, 22786, 2606, 17709, -32062, 17415, 17453, 24104, 22703, 30332, 2607, -27759, 17738, 2606, -2787};

    public C0179() {
        int iM13266 = C0204.m13266();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13266 > 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0203.m13264("Sy6ax")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String str = "۟ۨۥ";
        String strM13263 = null;
        String strM13272 = null;
        String strM132632 = null;
        short[] sArr = null;
        while (true) {
            switch (C0203.m13265(str)) {
                case 56388:
                    strM13263 = C0203.m13263(sArr, 58, 43, 3084);
                    str = "ۡۡ۟";
                    break;
                case 1746882:
                    return;
                case 1746972:
                    str = "ۢۨۥ";
                    sArr = f655short;
                    break;
                case 1748671:
                    methodSig = strM13263;
                    str = "۟ۥۨ";
                    break;
                case 1748889:
                    str = "ۦۢۦ";
                    strM13272 = C0205.m13272(sArr, 37, 21, 2361);
                    break;
                case 1749571:
                    str = "ۢۦ";
                    sArr = f655short;
                    break;
                case 1749855:
                    str = "ۣۤ۠";
                    strM132632 = C0203.m13263(sArr, 0, 37, 2795);
                    break;
                case 1751527:
                    className = strM132632;
                    str = "ۥۥۡ";
                    break;
                case 1752641:
                    str = "ۡۨ۠";
                    sArr = f655short;
                    break;
                default:
                    methodName = strM13272;
                    str = "ۢ۟۠";
                    break;
            }
        }
    }

    public static native List<ResolveInfo> backup(Object obj, Intent intent, int i);

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x01f2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0152. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x01d5. Please report as an issue. */
    public static List<ResolveInfo> hook(Object obj, Intent intent, int i) {
        boolean z;
        String str = C0203.m13263(f655short, 101, 38, 615) + intent + C0207.m13281(f655short, 139, 8, 3196) + i;
        C0204.m13267(f655short, 147, 6, 2502);
        List<ResolveInfo> listBackup = backup(obj, intent, i);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = listBackup == null ? 1678 : 1709;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = intent == null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str2 = intent.getPackage();
                                boolean zHasCategory = intent.hasCategory(C0205.m13272(f655short, 153, 32, 1296));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !zHasCategory ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        boolean zEquals = str2.equals(C0193.f713);
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i6 = !zEquals ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i5 = str2 == null ? 48829 : 48860;
                                                        break;
                                                }
                                            }
                                            C0203.m13263(f655short, 185, 24, 2688);
                                            String[] strArr = C0193.f684;
                                            int length = strArr.length;
                                            int i7 = 0;
                                            while (true) {
                                                int i8 = 49666;
                                                while (true) {
                                                    i8 ^= 49683;
                                                    switch (i8) {
                                                        case 17:
                                                            i8 = i7 >= length ? 49728 : 49759;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case Base64.mimeLineLength /* 76 */:
                                                            String str3 = strArr[i7];
                                                            Iterator<ResolveInfo> it = listBackup.iterator();
                                                            while (true) {
                                                                boolean zHasNext = it.hasNext();
                                                                int i9 = 49790;
                                                                while (true) {
                                                                    i9 ^= 49807;
                                                                    switch (i9) {
                                                                        case 18:
                                                                            break;
                                                                        case 51:
                                                                            z = false;
                                                                            break;
                                                                        case 84:
                                                                            ResolveInfo next = it.next();
                                                                            boolean zEquals2 = str3.equals(next.activityInfo.name);
                                                                            int i10 = 49914;
                                                                            while (true) {
                                                                                i10 ^= 49931;
                                                                                switch (i10) {
                                                                                    case 497:
                                                                                        i10 = !zEquals2 ? 50627 : 50658;
                                                                                        break;
                                                                                    case 1711:
                                                                                        break;
                                                                                    case 1736:
                                                                                        break;
                                                                                    case 1769:
                                                                                        boolean zEquals3 = C0193.f713.equals(next.activityInfo.packageName);
                                                                                        int i11 = 50689;
                                                                                        while (true) {
                                                                                            i11 ^= 50706;
                                                                                            switch (i11) {
                                                                                                case 19:
                                                                                                    i11 = !zEquals3 ? 50751 : 50782;
                                                                                                    break;
                                                                                                case 45:
                                                                                                    break;
                                                                                                case 50:
                                                                                                    break;
                                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                                    String str4 = C0203.m13263(f655short, 209, 27, 995) + str3;
                                                                                                    z = true;
                                                                                                    int i12 = 50813;
                                                                                                    while (true) {
                                                                                                        i12 ^= 50830;
                                                                                                        switch (i12) {
                                                                                                            case 18:
                                                                                                                break;
                                                                                                            case 243:
                                                                                                                i12 = 50844;
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 241:
                                                                            i9 = !zHasNext ? 49852 : 49883;
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            int i13 = 51588;
                                                            while (true) {
                                                                i13 ^= 51605;
                                                                switch (i13) {
                                                                    case 17:
                                                                        i13 = !z ? 51681 : 51650;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        boolean zM13244 = C0193.m13244(str3);
                                                                        int i14 = 51712;
                                                                        while (true) {
                                                                            i14 ^= 51729;
                                                                            switch (i14) {
                                                                                case 14:
                                                                                    break;
                                                                                case 17:
                                                                                    i14 = !zM13244 ? 51774 : 51805;
                                                                                    break;
                                                                                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                                                    break;
                                                                                case Base64.mimeLineLength /* 76 */:
                                                                                    ResolveInfo resolveInfo = new ResolveInfo();
                                                                                    ActivityInfo activityInfo = new ActivityInfo();
                                                                                    activityInfo.packageName = C0193.f713;
                                                                                    activityInfo.name = str3;
                                                                                    resolveInfo.activityInfo = activityInfo;
                                                                                    listBackup.add(0, resolveInfo);
                                                                                    String str5 = C0204.m13267(f655short, 236, 19, 2567) + str3;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            int i15 = i7 + 1;
                                                            int i16 = 51836;
                                                            while (true) {
                                                                i16 ^= 51853;
                                                                switch (i16) {
                                                                    case 241:
                                                                        i16 = 52518;
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                }
                                                            }
                                                            i7 = i15;
                                                            break;
                                                        case 83:
                                                            break;
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                boolean zM13232 = C0193.m13232(intent);
                                int i17 = 52611;
                                while (true) {
                                    i17 ^= 52628;
                                    switch (i17) {
                                        case 23:
                                            i17 = !zM13232 ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 116:
                                            boolean zM13250 = C0193.m13250(intent.getPackage());
                                            int i18 = 52735;
                                            while (true) {
                                                i18 ^= 52752;
                                                switch (i18) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                        i18 = !zM13250 ? 52797 : 53479;
                                                        break;
                                                    case 7927:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                listBackup.clear();
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return listBackup;
    }
}
