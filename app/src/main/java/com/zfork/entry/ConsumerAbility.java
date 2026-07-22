package com.zfork.entry;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.C0351e;
import com.zfork.multiplatforms.android.bomb.RunnableC0346d1;
import com.zfork.multiplatforms.android.bomb.RunnableC0353e1;
import com.zfork.multiplatforms.android.bomb.RunnableC0360f1;
import com.zfork.multiplatforms.android.bomb.RunnableC0367g1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0332b1;
import com.zfork.multiplatforms.android.bomb.ViewOnClickListenerC0386j1;
import com.zfork.multiplatforms.android.bomb.ViewOnLongClickListenerC0339c1;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsumerAbility extends Activity implements Appendable {
    public static boolean g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f221short = {854, 864, 870, 865, 890, 888, 855, 884, 886, 894, 864, 869, 540, 554, 556, 555, 560, 562, 527, 557, 570, 569, 570, 557, 570, 561, 572, 570, 1517, 1481, 1486, 1477, 1005, 967, 964, 970, 991, 962, 965, 972, 998, 974, 965, 990, 1033, 1086, 1078, 1076, 1069, 1086, 1050, 1087, 1064, 1456, 1643, 1636, 1646, 1656, 1637, 1635, 1646, 1572, 1635, 1636, 1662, 1647, 1636, 1662, 1572, 1643, 1641, 1662, 1635, 1637, 1636, 1572, 1605, 1626, 1615, 1604, 1621, 1614, 1605, 1609, 1631, 1607, 1615, 1604, 1630, 2362, 2357, 2367, 2345, 2356, 2354, 2367, 2421, 2354, 2357, 2351, 2366, 2357, 2351, 2421, 2362, 2360, 2351, 2354, 2356, 2357, 2421, 2328, 2313, 2334, 2330, 2319, 2334, 2308, 2335, 2324, 2328, 2318, 2326, 2334, 2325, 2319, 2072, 2071, 2077, 2059, 2070, 2064, 2077, 2135, 2064, 2071, 2061, 2076, 2071, 2061, 2135, 2074, 2072, 2061, 2076, 2078, 2070, 2059, ZipUtils.GP_FLAG_EFS, 2135, 2102, 2089, 2108, 2103, 2104, 2107, 2101, 2108, 2051, 2054, 2051, 1884, 1875, 1881, 1871, 1874, 1876, 1881, 1811, 1876, 1875, 1865, 1880, 1875, 1865, 1811, 1880, 1861, 1865, 1871, 1884, 1811, 1916, 1905, 1905, 1906, 1898, 1890, 1904, 1896, 1905, 1897, 1908, 1901, 1905, 1912, 567, 568, 562, 548, 569, 575, 562, 632, 575, 568, 546, 563, 568, 546, 632, 563, 558, 546, 548, 567, 632, 514, 543, 514, 538, 531, 1821, 1846, 1828, 1820, 1830, 1831, 1827, 1830, 1831, 1810, 1827, 1848, 1917, 1842, 1827, 1848, 1896, 1895, 1901, 1915, 1894, 1888, 1901, 1831, 1888, 1895, 1917, 1900, 1895, 1917, 1831, 1900, 1905, 1917, 1915, 1896, 1831, 1882, 1885, 1883, 1868, 1864, 1860, 2571, 2564, 2574, 2584, 2565, 2563, 2574, 2628, 2563, 2564, 2590, 2575, 2564, 2590, 2628, 2575, 2578, 2590, 2584, 2571, 2628, 2617, 2622, 2616, 2607, 2603, 2599};
    public C0351e a;
    public Uri b;
    public Uri d;
    public Uri f;
    public int c = 0;
    public int e = 0;

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6771() {
        if (C0019.m1311() == 0) {
            return f221short;
        }
        return null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        return this;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        try {
            if (C0063.m4330() >= 30) {
                WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(C0027.m2524(this));
                C0066.m4873(layoutParamsM5516);
                C0078.m7346(C0027.m2524(this), layoutParamsM5516);
            }
            C0351e c0351eM1873 = C0023.m1873(C0018.m965(this));
            Button buttonM4864 = C0066.m4864(c0351eM1873);
            Button buttonM4062 = C0039.m4062(c0351eM1873);
            this.a = c0351eM1873;
            C0065.m4703(this, C0066.m4844(c0351eM1873));
            C0065.m4727(C0030.m2875(c0351eM1873), new ViewOnClickListenerC0332b1(this, 2));
            C0065.m4727(buttonM4062, new ViewOnClickListenerC0332b1(this, 3));
            C0077.m7203(buttonM4062, new ViewOnLongClickListenerC0339c1(this, 1));
            C0065.m4727(C0030.m2859(c0351eM1873), new ViewOnClickListenerC0332b1(this, 4));
            C0065.m4727(C0077.m7230(c0351eM1873), new ViewOnClickListenerC0386j1(this, c0351eM1873, 0));
            C0065.m4727(C0036.m3690(c0351eM1873), new ViewOnClickListenerC0386j1(this, c0351eM1873, 1));
            try {
                Intent intentM13064 = C0111.m13064(this);
                Uri uriM13115 = C0111.m13115(intentM13064);
                if (uriM13115 == null) {
                    uriM13115 = (Uri) C0032.m3250(intentM13064, C0035.m3603(m6771(), 238, 27, 1801));
                }
                if (uriM13115 != null) {
                    C0066.m4868(this, uriM13115, null, false);
                }
            } catch (Exception unused) {
            }
            C0065.m4727(C0071.m6080(c0351eM1873), new ViewOnClickListenerC0332b1(this, 5));
            C0065.m4727(buttonM4864, new ViewOnClickListenerC0332b1(this, 0));
            C0077.m7203(buttonM4864, new ViewOnLongClickListenerC0339c1(this, 0));
            C0065.m4727(C0019.m1190(c0351eM1873), new ViewOnClickListenerC0332b1(this, 1));
            C0065.m4734(new Thread(new RunnableC0360f1(this, 4)));
            C0065.m4734(new Thread(new RunnableC0360f1(this, 1)));
        } catch (Exception unused2) {
        }
    }

    public static String c(String str) {
        try {
            ArrayList arrayList = new ArrayList(C0078.m7380(str));
            for (char c : C0031.m2984(str)) {
                switch (c) {
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        C0017.m919(arrayList, C0066.m4828(m6771(), 44, 9, 1115));
                        break;
                    case 'B':
                        C0017.m919(arrayList, C0025.m2151(m6771(), 32, 12, 939));
                        break;
                    case 'C':
                        C0017.m919(arrayList, C0017.m936(m6771(), 28, 4, 1440));
                        break;
                    case 'D':
                        C0017.m919(arrayList, C0067.m5418(m6771(), 12, 16, 607));
                        break;
                    case 'E':
                        C0017.m919(arrayList, C0066.m4828(m6771(), 0, 12, 789));
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();
            Iterator itM4154 = C0039.m4154(arrayList);
            if (C0036.m3657(itM4154)) {
                Object objM6012 = C0071.m6012(itM4154);
                while (true) {
                    C0038.m3978(sb, (CharSequence) objM6012);
                    if (C0036.m3657(itM4154)) {
                        C0038.m3978(sb, C0067.m5418(m6771(), 53, 1, 1519));
                        objM6012 = C0071.m6012(itM4154);
                    }
                }
            }
            return C0068.m5536(sb);
        } catch (Exception unused) {
            return C0031.m2993();
        }
    }

    public static void d(Activity activity, String str, int i, String str2) {
        String strM625 = str2;
        try {
            Intent intent = new Intent(str);
            boolean zM5838 = C0070.m5838(C0018.m1070(m6771(), 54, 35, 1546), str);
            String strM2321 = C0026.m2321(m6771(), 89, 37, 2395);
            if (zM5838 || C0070.m5838(strM2321, str)) {
                C0033.m3269(C0027.m2409(C0073.m6399(intent, C0030.m2840(m6771(), 126, 32, 2169)), C0023.m1904(m6771(), 158, 3, 2089)), C0019.m1189(m6771(), 161, 35, 1853), true);
                if (C0070.m5838(strM2321, str)) {
                    String strM4757 = C0065.m4757(m6771(), 196, 26, 598);
                    if (strM625 == null) {
                        strM625 = C0016.m625(m6771(), 222, 16, 1875);
                    }
                    C0038.m4025(intent, strM4757, strM625);
                }
            }
            C0016.m651(activity, intent, i);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        try {
            C0351e c0351eM5902 = C0070.m5902(this);
            if (C0024.m1954(C0068.m5681(c0351eM5902))) {
                C0077.m7289(sb, 'A');
            }
            if (C0024.m1954(C0068.m5541(c0351eM5902))) {
                C0077.m7289(sb, 'B');
            }
            if (C0024.m1954(C0111.m13134(c0351eM5902))) {
                C0077.m7289(sb, 'C');
            }
            if (C0024.m1954(C0068.m5657(c0351eM5902))) {
                C0077.m7289(sb, 'D');
            }
            if (C0018.m1063(this) != null) {
                C0077.m7289(sb, 'E');
            }
            if (C0024.m1954(C0068.m5630(c0351eM5902))) {
                C0077.m7289(sb, 'F');
            }
            if (C0024.m1954(C0070.m5855(c0351eM5902))) {
                C0077.m7289(sb, 'G');
            }
            if (C0024.m1954(C0111.m13102(c0351eM5902))) {
                C0077.m7289(sb, 'H');
            }
        } catch (Exception unused) {
        }
        return C0068.m5536(sb);
    }

    public final void e(Uri uri, ApplicationInfo applicationInfo, boolean z) {
        if (!z) {
            C0025.m2123(this, new RunnableC0360f1(this, 0));
        }
        C0065.m4734(new Thread(new RunnableC0367g1(this, z, uri, applicationInfo)));
    }

    public static /* synthetic */ void a(ConsumerAbility consumerAbility) {
        C0030.m2951(consumerAbility);
        try {
            int iM13051 = C0111.m13051(consumerAbility) - 1;
            consumerAbility.e = iM13051;
            if (iM13051 > 0) {
                C0019.m1180(C0039.m4062(C0070.m5902(consumerAbility)), C0019.m1300(C0021.m1548(iM13051)));
            } else {
                C0019.m1180(C0039.m4062(C0070.m5902(consumerAbility)), C0069.m5785());
            }
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (!C0016.m610(this)) {
            String strM1382 = C0020.m1382(C0023.m1789(C0075.m6861(C0070.m5902(this))));
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0020.m1382(charSequence));
            C0077.m7289(sb, '\n');
            C0077.m7290(sb, strM1382);
            C0025.m2123(this, new RunnableC0346d1(this, C0068.m5536(sb), 0));
        }
        return this;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 && intent == null) {
            return;
        }
        Uri uriM13115 = C0111.m13115(intent);
        ClipData clipDataM5702 = C0069.m5702(intent);
        if (uriM13115 == null && clipDataM5702 == null) {
            return;
        }
        C0065.m4734(new Thread(new RunnableC0353e1(this, uriM13115, clipDataM5702, i, intent)));
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            Uri uriM13115 = C0111.m13115(intent);
            if (uriM13115 == null) {
                uriM13115 = (Uri) C0032.m3250(intent, C0066.m4828(m6771(), 265, 27, 2666));
            }
            if (uriM13115 != null) {
                C0066.m4868(this, uriM13115, null, false);
            }
        } catch (Exception unused) {
        }
    }
}
