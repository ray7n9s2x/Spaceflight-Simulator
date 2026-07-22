package com.joke.basetoollib;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;

/* JADX INFO: loaded from: classes3.dex */
public class LoadDrawableUtils {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f147short = {3252, 3298, 3319, 3318, 745, 763, 763, 749, 764, 763, 679, 754, 739, 748, 762, 745, 767, 745, 746, 740, 749, 679, 3112, 3190, 3176, 3169, 949, 929, 928, 2792, 2773, 2766, 2760, 2781, 2777, 2756, 2754, 2755, 2711, 1617, 1603, 1603, 1621, 1604, 1603, 1567, 1610, 1627, 1620, 1602, 1617, 1607, 1617, 1618, 1628, 1621, 1567, 2825, 2911, 2890, 2891, 2074, 2059, 2052, 2066, 2049, 2071, 2049, 2050, 2060, 2053, 2127, 1300, 1346, 1367, 1366, 2491, 2473, 2473, 2495, 2478, 2473, 2549, 2464, 2481, 2486, 2491, 2467, 2485, 2479, 2478, 2549, 1341, 1343, 1326, 1302, 1339, 1315, 1333, 1327, 1326, 1402, 1311, 1314, 1337, 1343, 1322, 1326, 1331, 1333, 1332, 1376, 1554, 1542, 1543};
    private Context context;

    public /* synthetic */ LoadDrawableUtils(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static View m4291(Object obj, Object obj2) {
        if (C0027.m2460() >= 0) {
            return ((LoadDrawableUtils) obj).getLayout((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Drawable m4292(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return ((LoadDrawableUtils) obj).getDrawableLayout((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static Context m4293(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((LoadDrawableUtils) obj).context;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4294() {
        if (C0031.m3075() >= 0) {
            return f147short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m4295(Object obj, Object obj2) {
        if (C0068.m5678() >= 0) {
            return ((LoadDrawableUtils) obj).getDrawabLayoutEndXml((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static LoadDrawableUtils m4296() {
        if (C0025.m2132() > 0) {
            return LoadDrawableUtilsHolder.m4297();
        }
        return null;
    }

    public static class LoadDrawableUtilsHolder {
        private static final LoadDrawableUtils INSTANCE = new LoadDrawableUtils(0);

        /* JADX INFO: renamed from: ۡۡۧۨ, reason: not valid java name and contains not printable characters */
        public static LoadDrawableUtils m4297() {
            if (C0029.m2791() >= 0) {
                return INSTANCE;
            }
            return null;
        }

        private LoadDrawableUtilsHolder() {
        }
    }

    private LoadDrawableUtils() {
    }

    private Drawable getDrawabLayoutEndXml(String str) {
        String strM3232 = str;
        String strM4828 = C0066.m4828(m4294(), 0, 4, 3226);
        String strM3678 = C0036.m3678(m4294(), 4, 18, 648);
        try {
            if (!C0019.m1242(strM3232, strM3678)) {
                strM3232 = C0032.m3232(strM3678, strM3232);
            }
            if (!C0072.m6150(strM3232, strM4828)) {
                strM3232 = C0032.m3232(strM3232, strM4828);
            }
            AssetManager assetManagerM3768 = C0036.m3768(m4293(this));
            if (assetManagerM3768 != null) {
                return C0029.m2722(C0029.m2720(m4293(this)), C0028.m2583(assetManagerM3768, strM3232));
            }
            return null;
        } catch (Exception e) {
            C0033.m3347(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.drawable.Drawable getDrawableLayout(java.lang.String r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joke.basetoollib.LoadDrawableUtils.getDrawableLayout(java.lang.String):android.graphics.drawable.Drawable");
    }

    private View getLayout(String str) {
        String strM3232 = str;
        String strM6116 = C0072.m6116(m4294(), 72, 4, 1338);
        String strM1650 = C0021.m1650(m4294(), 76, 16, 2522);
        try {
            if (!C0019.m1242(strM3232, strM1650)) {
                strM3232 = C0032.m3232(strM1650, strM3232);
            }
            if (!C0072.m6150(strM3232, strM6116)) {
                strM3232 = C0032.m3232(strM3232, strM6116);
            }
            AssetManager assetManagerM3768 = C0036.m3768(m4293(this));
            if (assetManagerM3768 != null) {
                return C0063.m4332(C0025.m2091(m4293(this)), C0028.m2583(assetManagerM3768, strM3232), null);
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0075.m6791(m4294(), 92, 20, 1370));
            C0036.m3741(sb, e);
            C0036.m3736(C0024.m1945(m4294(), 112, 3, 1662), C0068.m5536(sb));
            C0033.m3347(e);
            return null;
        }
    }

    public void initContext(Context context) {
        this.context = context;
    }

    public static LoadDrawableUtils getInstance() {
        return m4296();
    }

    public Drawable getDrawabXmlLayout(String str) {
        return m4295(this, str);
    }

    public Drawable getDrawable(String str) {
        return m4292(this, str);
    }

    public View getView(String str) {
        return m4291(this, str);
    }
}
