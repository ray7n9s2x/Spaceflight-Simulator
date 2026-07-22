package p003;

import android.R;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: ۡۨۥۦۤۡۨۥۦۥۡۨۥۦۦۡۨۥۦۧۡۨۥۦۨ.۟۟۟ۤۤ۟۟۟ۤۥ۟۟۟ۤۦ۟۟۟ۤۧ۟۟۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0126 {
    public static String className;
    public static String methodName;
    public static String methodSig;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f602short = {3037, 3026, 3032, 3022, 3027, 3029, 3032, 2962, 3037, 3020, 3020, 2962, 3069, 3024, 3033, 3022, 3016, 3064, 3029, 3037, 3024, 3027, 3035, 1693, 1670, 1665, 1689, 3121, 3120, 3151, 2769, 2762, 2796, 2788, 2795, 2788, 2896, 2908, 2910, 2902, 2835, 2906, 2909, 2835, 2930, 2911, 2902, 2881, 2887, 2935, 2906, 2898, 2911, 2908, 2900, 2835, 2880, 2907, 2908, 2884, 1120, 1133, 1124, 1139, 1141, 1109, 1128, 1141, 1133, 1124, 2812, 2801, 3177, 3174, 3180, 3194, 3175, 3169, 3180, 27963, -25180, 26473, 27278, 828, 807, 769, 777, 774, 777, -30447, 21345, 18098, 22264, 21691, 23264, 22017, 32383, 2234, 2199, 2206, 2185, 2191, 2239, 2194, 2202, 2199, 2196, 2204, 2260, 2239, 2194, 2202, 2199, 2196, 2204, -2057, -24581, 24770, 27541, -30447, 21345, 18098, 22264, 21691, 18134, 32383, 2226, 2239, 2259, 27931, 25646, 18308, 32211, 29696, 30244, 32383, 2226, 2239, 2258, 28574, -29876, 23341, 24828, -28573, 23671, 25971, 26772, 32383, 28028, 28631, 24956, 21181, 2349, 2336, -2466, 1394, 1379, 1406, 1394, 1326, 2396, -2449, 21157, 18677, 23951, 29156, -1580, 22443, -27851, 23009, 31823, -1598};
    public static String[] getCloseAlertDialogWords = C0112.CW();

    public C0126() {
        int iM13280 = C0207.m13280();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM13280 < 0 ? 1678 : 1709;
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0206.m13276("2pxDYKGevuAsxb9ihalGINANN")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static void SetStr() {
        String strM13263;
        String[] strArr = getCloseAlertDialogWords;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = strArr == null ? 1678 : 1709;
                    break;
                case 204:
                    strM13263 = C0203.m13263(f602short, 0, 23, AuthApiStatusCodes.AUTH_TOKEN_ERROR);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                continue;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM13263 = null;
                    break;
            }
        }
        className = strM13263;
        methodName = C0205.m13272(f602short, 23, 4, 1774);
        methodSig = C0203.m13263(f602short, 27, 3, 3097);
        int iM13266 = C0204.m13266();
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = iM13266 > 0 ? 48705 : 48736;
                    break;
                case 47384:
                    break;
                case 47417:
                    System.out.println(Double.decode(C0207.m13279("skpR3Vc")));
                    break;
                case 47483:
                    break;
            }
            return;
        }
    }

    public static native void backup(Object obj);

    public static void hook(Object obj) {
        C0204.m13267(f602short, 30, 6, 2739);
        C0205.m13272(f602short, 36, 24, 2867);
        backup(obj);
        boolean z = obj instanceof AlertDialog;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !z ? 1678 : 1709;
                    break;
                case 204:
                    AlertDialog alertDialog = (AlertDialog) obj;
                    try {
                        boolean zIsNeedDismiss = isNeedDismiss(alertDialog, alertDialog.getContext().getResources().getIdentifier(C0204.m13267(f602short, 60, 10, InputDeviceCompat.SOURCE_GAMEPAD), C0204.m13267(f602short, 70, 2, 2709), C0205.m13272(f602short, 72, 7, 3080)), C0205.m13272(f602short, 79, 2, 1340));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !zIsNeedDismiss ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zIsNeedDismiss2 = isNeedDismiss(alertDialog, R.id.message, C0207.m13281(f602short, 81, 2, 2785));
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = !zIsNeedDismiss2 ? 48705 : 48736;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        alertDialog.dismiss();
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
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

    public static boolean isNeedDismiss(AlertDialog alertDialog, int i, String str) {
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = i <= 0 ? 1678 : 1709;
                    break;
                case 204:
                    View viewFindViewById = alertDialog.findViewById(i);
                    C0205.m13272(f602short, 83, 6, 862);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = viewFindViewById != null ? 1802 : 1833;
                                break;
                            case 54:
                                break;
                            case 471:
                                String str2 = C0207.m13281(f602short, 150, 5, 2372) + viewFindViewById;
                                boolean z = viewFindViewById instanceof TextView;
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = !z ? 48705 : 48736;
                                            break;
                                        case 47384:
                                            return false;
                                        case 47417:
                                            CharSequence text = ((TextView) viewFindViewById).getText();
                                            boolean zIsEmpty = TextUtils.isEmpty(text);
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        return false;
                                                    case Base64.mimeLineLength /* 76 */:
                                                        String str3 = C0203.m13263(f602short, ModuleDescriptor.MODULE_VERSION, 5, 1286) + str + C0204.m13267(f602short, 160, 2, 2421) + ((Object) text);
                                                        String strReplace = text.toString().toLowerCase().replace(C0193.f694, "");
                                                        String[] strArr = getCloseAlertDialogWords;
                                                        int i6 = 48891;
                                                        while (true) {
                                                            i6 ^= 48908;
                                                            switch (i6) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return false;
                                                                case 503:
                                                                    i6 = strArr == null ? 48953 : 49635;
                                                                    break;
                                                                case 32495:
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
                                                                                    String str4 = strArr[i7];
                                                                                    boolean zContains = strReplace.contains(str4.toLowerCase());
                                                                                    int i9 = 49790;
                                                                                    while (true) {
                                                                                        i9 ^= 49807;
                                                                                        switch (i9) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 51:
                                                                                                i7++;
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
                                                                                            case 84:
                                                                                                String str5 = C0205.m13272(f602short, 162, 10, 1752) + str4;
                                                                                                return true;
                                                                                            case 241:
                                                                                                i9 = !zContains ? 49852 : 49883;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    return false;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i5 = !zIsEmpty ? 48860 : 48829;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                C0205.m13272(f602short, 89, 61, 2299);
                                return false;
                        }
                    }
                    break;
                case 239:
                    return false;
            }
        }
    }
}
