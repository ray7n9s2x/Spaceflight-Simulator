package apkvision;

import android.content.Context;
import android.util.Base64;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class YnLbgyrEk {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f7short = {1473, 1482, 1479, 1473, 1481, 1067, 1056, 1069, 1067, 1059, 1069, 1047, 1086, 1048, 1063, 1053, 1033, 1086, 1054, 1063, 1048, 1145, 2544, 2555, 2550, 2544, 2552, 1046, 1053, 1040, 1046, 1054, 1040, 1066, 1027, 1061, 1050, 1056, 1076, 1027, 1059, 1050, 1061, 1095, 2927, 2938, 2820, 2830, 2911, 2896, 2885, 2891, 2916, 2922, 2927, 2897, 2919, 2942, 2943, 2896, 2910, 2896, 2820, 2889, 2932, 2936, 2939, 2924, 2926, 2828, 2919, 2935, 2920, 2829, 2897, 2925, 2921, 2900, 2824, 2925, 2920, 2902, 2910, 2816, 1021, 902, 901, 924, 952, 928, 901, 927, 933, 1012, 910, 954, 1021, 897, 1022, 924, 955, 932, 905, 927, 938, 926, 911, 911, 920, 904, 953, 922, 926, 923, 899, 903, 921, 1021, 1017, 952, 920, 929, 920, 1008, 2028, 2023, 2026, 2028, 2020, 2407, 2412, 2401, 2407, 2415, 2401, 2395, 2418, 2388, 2411, 2385, 2373, 2418, 2386, 2411, 2388, 2357, 3232, 3243, 3238, 3232, 3240, 2401, 2410, 2407, 2401, 2409, 2407, 2397, 2420, 2386, 2413, 2391, 2371, 2420, 2388, 2413, 2386, 2352, 478, 473, 766, 746};

    public static String vPoUAvVoP(String str) {
        return new String(Base64.decode(str.getBytes(), 0));
    }

    public static void vPoUAvVoP(Context context) {
    }

    private static boolean vPoUAvVoP() {
        String strM469 = C0013.m469(f7short, 168, 2, 428);
        String language = Locale.getDefault().getLanguage();
        return strM469.equalsIgnoreCase(language) || C0013.m469(f7short, 170, 2, 651).equalsIgnoreCase(language);
    }
}
