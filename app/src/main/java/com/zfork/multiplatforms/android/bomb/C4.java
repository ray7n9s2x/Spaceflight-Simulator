package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.apksig.C0037;
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
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptRecordBean;
import com.joke.script.bean.ScriptRecordType;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class C4 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f234short = {3045, 3061, 3044, 3071, 3046, 3042, 3017, 3058, 3071, 3063, 3066, 3065, 3057, 3017, 3046, 3044, 3065, 3046, 3059, 3044, 3042, 3055, 3017, 3059, 3058, 3071, 3042, 3111, 3130, 3130, 3105, 999, 1015, 998, 1021, 996, 992, 971, 1013, 1015, 992, 1021, 1019, 1018, 971, 999, 1020, 1013, 996, 1009, 591, 594, 591, 599, 606, 2878, 2876, 2849, 2878, 2859, 2876, 2874, 2871, 2833, 2877, 2861, 2876, 2849, 2850, 2850, 1614, 1612, 1617, 1614, 1627, 1612, 1610, 1607, 1633, 1616, 1631, 1619, 1627, 1549, 1551, 1554, 1549, 1560, 1551, 1545, 1540, 1570, 1547, 1564, 1553, 1544, 1560, 569, 553, 568, 547, 570, 574, 533, 555, 553, 574, 547, 549, 548, 533, 559, 558, 547, 574, 533, 569, 546, 555, 570, 559, 1808, 1810, 1807, 1808, 1797, 1810, 1812, 1817, 1855, 1805, 1807, 1796, 1797, 1855, 1812, 1797, 1816, 1812, 1855, 1804, 1793, 1817, 1807, 1813, 1812, 2393, 2395, 2374, 2393, 2380, 2395, 2397, 2384, 2422, 2372, 2374, 2381, 2380, 2422, 2397, 2380, 2385, 2397, 2987, 2985, 2996, 2987, 3006, 2985, 2991, 2978, 2948, 2998, 2996, 3007, 3006, 2948, 2994, 2998, 3002, 3004, 3006, 1957, 1973, 1956, 1983, 1958, 1954, 1929, 1983, 1973, 1929, 1957, 1958, 1983, 1976, 1976, 1971, 1956, 1929, 1970, 1977, 1953, 1976, 1557, 1559, 1546, 1557, 1536, 1559, 1553, 1564, 1594, 1544, 1546, 1537, 1536, 1594, 1545, 1548, 1558, 1553, 2621, 2605, 2620, 2599, 2622, 2618, 2577, 2607, 2605, 2618, 2599, 2593, 2592, 2577, 2622, 2620, 2593, 2622, 2603, 2620, 2618, 2615, 2577, 2594, 2599, 2621, 2618, 2577, 2621, 2598, 2607, 2622, 2603, 2956, 2958, 2963, 2956, 2969, 2958, 2952, 2949, 2979, 2952, 2965, 2961, 2969, 2979, 2960, 2965, 2961, 2965, 2952, 1915, 1913, 1892, 1915, 1902, 1913, 1919, 1906, 1876, 1912, 1918, 1896, 1896, 1902, 1912, 1912, 1876, 1919, 1902, 1907, 1919, 1876, 1895, 1898, 1906, 1892, 1918, 1919, 1021, 1023, 994, 1021, 1000, 1023, 1017, 1012, 978, 1022, 1016, 1006, 1006, 1000, 1022, 1022, 978, 1017, 1000, 1013, 1017, 2369, 2371, 2398, 2369, 2388, 2371, 2373, 2376, 2414, 2370, 2372, 2386, 2386, 2388, 2370, 2370, 2414, 2392, 2396, 2384, 2390, 2388, 1614, 1612, 1617, 1614, 1627, 1612, 1610, 1607, 1633, 1613, 1611, 1629, 1629, 1627, 1613, 1613, 1633, 1618, 1623, 1613, 1610, 1650, 1648, 1645, 1650, 1639, 1648, 1654, 1659, 1629, 1649, 1655, 1633, 1633, 1639, 1649, 1649, 1629, 1644, 1639, 1658, 1654, 1629, 1654, 1639, 1658, 1654, 1279, 1277, 1248, 1279, 1258, 1277, 1275, 1270, 1232, 1257, 1262, 1254, 1251, 1232, 1275, 1258, 1271, 1275, 1232, 1251, 1262, 1270, 1248, 1274, 1275, 2159, 2157, 2160, 2159, 2170, 2157, 2155, 2150, 2112, 2169, 2174, 2166, 2163, 2112, 2155, 2170, 2151, 2155, 2188, 2190, 2195, 2188, 2201, 2190, 2184, 2181, 2211, 2202, 2205, 2197, 2192, 2211, 2197, 2193, 2205, 2203, 2201, 2115, 2113, 2140, 2115, 2134, 2113, 2119, 2122, 2156, 2133, 2130, 2138, 2143, 2156, 2143, 2138, 2112, 2119, 1735, 1733, 1752, 1735, 1746, 1733, 1731, 1742, 1768, 1731, 1758, 1754, 1746, 1752, 1730, 1731, 1768, 1731, 1746, 1743, 1731, 1768, 1755, 1750, 1742, 1752, 1730, 1731, 3088, 3090, 3087, 3088, 3077, 3090, 3092, 3097, 3135, 3092, 3081, 3085, 3077, 3087, 3093, 3092, 3135, 3092, 3077, 3096, 3092, 2038, 2036, 2025, 2038, 2019, 2036, 2034, 2047, 2009, 2034, 2031, 2027, 2019, 2025, 2035, 2034, 2009, 2031, 2027, 2023, 2017, 2019, 2984, 2986, 2999, 2984, 3005, 2986, 2988, 2977, 2951, 2988, 2993, 2997, 3005, 2999, 2989, 2988, 2951, 2996, 2993, 2987, 2988, 2361, 2363, 2342, 2361, 2348, 2363, 2365, 2352, 2326, 2346, 2344, 2343, 2346, 2348, 2341, 1433, 1435, 1414, 1433, 1420, 1435, 1437, 1424, 1462, 1434, 1416, 1439, 1420, 2305, 2336, 2347, 2346, 2415, 2410, 2347, 2415, 2407, 2410, 2364, 2406, 2415, 2335, 2365, 2336, 2367, 2346, 2365, 2363, 2358, 2415, 2332, 2346, 2363, 2363, 2342, 2337, 2344, 1847, 1792, 1798, 1802, 1794, 1803, 1804, 1823, 1792, 1861, 1809, 1792, 1821, 1809, 2041, 1998, 1992, 1988, 1996, 1989, 1986, 2001, 1998, 1931, 1999, 1986, 1996, 1986, 2015, 1994, 1991, 1814, 1879, 1811, 1814, 1856};
    public final TextView A;
    public final ScriptRecordType B;
    public final ScriptMatchBean C;
    public final int D;
    public C0479z E;
    public MatchType F;
    public MatchType G;
    public MatchType H;
    public MatchType I;
    public final List J;
    public ScriptJumpBean K;
    public ScriptJumpBean L;
    public ScriptJumpBean M;
    public ScriptProjectAliasBean N;
    public final TextView a;
    public final TextView b;
    public final EditText c;
    public final RelativeLayout d;
    public final TextView e;
    public final ImageView f;
    public final ListView g;
    public final C0370g4 h;
    public final EditText i;
    public final RelativeLayout j;
    public final TextView k;
    public final ImageView l;
    public final ListView m;
    public final TextView n;
    public final C0370g4 o;
    public final RelativeLayout p;
    public final TextView q;
    public final ImageView r;
    public final ListView s;
    public final C0370g4 t;
    public final RelativeLayout u;
    public final TextView v;
    public final ImageView w;
    public final ListView x;
    public final C0370g4 y;
    public final TextView z;

    /* JADX INFO: renamed from: ۡۨۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6914() {
        if (C0065.m4647() >= 0) {
            return f234short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4(Activity activity, List list, ScriptRecordType scriptRecordType, ScriptMatchBean scriptMatchBean, int i) {
        int iM617;
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        int i2 = 1;
        MatchType matchTypeM986 = C0018.m986();
        this.F = matchTypeM986;
        MatchType matchTypeM13172 = C0111.m13172();
        this.G = matchTypeM13172;
        MatchType matchTypeM1894 = C0023.m1894();
        this.H = matchTypeM1894;
        this.I = matchTypeM1894;
        this.B = scriptRecordType;
        this.C = scriptMatchBean;
        this.J = list;
        this.D = i;
        View viewM5715 = C0069.m5715(C0032.m3209(m6914(), 0, 27, 2966));
        if (viewM5715 != null) {
            C0039.m4187((LinearLayout) C0029.m2688(viewM5715, C0038.m4022(m6914(), 27, 4, 3157)), C0018.m1059(C0063.m4315(m6914(), 31, 19, 916)));
            this.a = (TextView) C0029.m2688(viewM5715, C0034.m3431(m6914(), 50, 5, 571));
            ScrollView scrollView = (ScrollView) C0029.m2688(viewM5715, C0024.m1945(m6914(), 55, 15, 2894));
            DisplayMetrics displayMetricsM4797 = C0066.m4797(C0029.m2720(C0027.m2454(this)));
            int iM4161 = C0039.m4161(displayMetricsM4797);
            int iM5638 = C0068.m5638(displayMetricsM4797);
            ViewGroup.LayoutParams layoutParamsM4105 = C0039.m4105(scrollView);
            if (iM4161 > iM5638) {
                layoutParamsM4105.height = C0075.m6777(C0027.m2454(this), 200.0f);
            } else {
                layoutParamsM4105.height = C0075.m6777(C0027.m2454(this), 246.0f);
            }
            C0016.m687(scrollView, layoutParamsM4105);
            this.b = (TextView) C0029.m2688(viewM5715, C0023.m1904(m6914(), 70, 13, 1598));
            EditText editText = (EditText) C0029.m2688(viewM5715, C0023.m1904(m6914(), 83, 14, 1661));
            this.c = editText;
            String strM6452 = C0074.m6452(m6914(), 97, 24, 586);
            C0039.m4187(editText, C0018.m1059(strM6452));
            RelativeLayout relativeLayout = (RelativeLayout) C0029.m2688(viewM5715, C0032.m3209(m6914(), 121, 25, 1888));
            this.d = relativeLayout;
            C0039.m4187(relativeLayout, C0018.m1059(strM6452));
            this.e = (TextView) C0029.m2688(viewM5715, C0078.m7427(m6914(), 146, 18, 2345));
            ImageView imageView = (ImageView) C0029.m2688(viewM5715, C0018.m1070(m6914(), 164, 19, 3035));
            this.f = imageView;
            String strM3603 = C0035.m3603(m6914(), 183, 22, 2006);
            C0039.m4187(imageView, C0071.m6091(strM3603));
            ViewGroup.LayoutParams layoutParamsM41052 = C0039.m4105(C0068.m5579(this));
            layoutParamsM41052.width = C0075.m6777(C0027.m2454(this), 8.0f);
            layoutParamsM41052.height = C0075.m6777(C0027.m2454(this), 8.0f);
            C0016.m687(C0068.m5579(this), layoutParamsM41052);
            ListView listView = (ListView) C0029.m2688(viewM5715, C0023.m1904(m6914(), 205, 18, 1637));
            this.g = listView;
            String strM5942 = C0070.m5942(m6914(), 223, 33, 2638);
            C0039.m4187(listView, C0018.m1059(strM5942));
            EditText editText2 = (EditText) C0029.m2688(viewM5715, C0023.m1904(m6914(), 256, 19, 3068));
            this.i = editText2;
            C0039.m4187(editText2, C0018.m1059(strM6452));
            RelativeLayout relativeLayout2 = (RelativeLayout) C0029.m2688(viewM5715, C0076.m6902(m6914(), 275, 28, 1803));
            this.j = relativeLayout2;
            C0039.m4187(relativeLayout2, C0018.m1059(strM6452));
            this.k = (TextView) C0029.m2688(viewM5715, C0023.m1904(m6914(), 303, 21, 909));
            ImageView imageView2 = (ImageView) C0029.m2688(viewM5715, C0031.m3047(m6914(), 324, 22, 2353));
            this.l = imageView2;
            C0039.m4187(imageView2, C0071.m6091(strM3603));
            ViewGroup.LayoutParams layoutParamsM41053 = C0039.m4105(C0073.m6319(this));
            layoutParamsM41053.width = C0075.m6777(C0027.m2454(this), 8.0f);
            layoutParamsM41053.height = C0075.m6777(C0027.m2454(this), 8.0f);
            C0016.m687(C0073.m6319(this), layoutParamsM41053);
            ListView listView2 = (ListView) C0029.m2688(viewM5715, C0023.m1904(m6914(), 346, 21, 1598));
            this.m = listView2;
            C0039.m4187(listView2, C0018.m1059(strM5942));
            this.n = (TextView) C0029.m2688(viewM5715, C0065.m4757(m6914(), 367, 26, 1538));
            RelativeLayout relativeLayout3 = (RelativeLayout) C0029.m2688(viewM5715, C0075.m6791(m6914(), 393, 25, 1167));
            this.p = relativeLayout3;
            C0039.m4187(relativeLayout3, C0018.m1059(strM6452));
            this.q = (TextView) C0029.m2688(viewM5715, C0018.m1070(m6914(), 418, 18, 2079));
            ImageView imageView3 = (ImageView) C0029.m2688(viewM5715, C0026.m2321(m6914(), 436, 19, 2300));
            this.r = imageView3;
            C0039.m4187(imageView3, C0071.m6091(strM3603));
            ViewGroup.LayoutParams layoutParamsM41054 = C0039.m4105(C0039.m4175(this));
            layoutParamsM41054.width = C0075.m6777(C0027.m2454(this), 8.0f);
            layoutParamsM41054.height = C0075.m6777(C0027.m2454(this), 8.0f);
            C0016.m687(C0039.m4175(this), layoutParamsM41054);
            ListView listView3 = (ListView) C0029.m2688(viewM5715, C0069.m5807(m6914(), 455, 18, 2099));
            this.s = listView3;
            C0039.m4187(listView3, C0018.m1059(strM5942));
            RelativeLayout relativeLayout4 = (RelativeLayout) C0029.m2688(viewM5715, C0111.m13097(m6914(), 473, 28, 1719));
            this.u = relativeLayout4;
            C0039.m4187(relativeLayout4, C0018.m1059(strM6452));
            this.v = (TextView) C0029.m2688(viewM5715, C0025.m2151(m6914(), 501, 21, 3168));
            ImageView imageView4 = (ImageView) C0029.m2688(viewM5715, C0026.m2321(m6914(), 522, 22, 1926));
            this.w = imageView4;
            C0039.m4187(imageView4, C0071.m6091(strM3603));
            ViewGroup.LayoutParams layoutParamsM41055 = C0039.m4105(C0111.m13138(this));
            layoutParamsM41055.width = C0075.m6777(C0027.m2454(this), 8.0f);
            layoutParamsM41055.height = C0075.m6777(C0027.m2454(this), 8.0f);
            C0016.m687(C0111.m13138(this), layoutParamsM41055);
            ListView listView4 = (ListView) C0029.m2688(viewM5715, C0076.m6902(m6914(), 544, 21, 3032));
            this.x = listView4;
            C0039.m4187(listView4, C0018.m1059(strM5942));
            this.z = (TextView) C0029.m2688(viewM5715, C0034.m3431(m6914(), 565, 15, 2377));
            this.A = (TextView) C0029.m2688(viewM5715, C0020.m1443(m6914(), 580, 13, 1513));
            C0073.m6392(this, viewM5715);
            C0019.m1180(C0027.m2505(this), C0021.m1531(C0039.m4066(m6914(), 593, 29, 2383), new Object[]{C0021.m1548(i + 1), C0071.m5975(scriptRecordType)}));
            List listM1596 = C0021.m1596(new MatchType[]{matchTypeM13172, C0075.m6848(), C0032.m3242(), matchTypeM1894, C0028.m2536()});
            if (scriptRecordType == C0030.m2852()) {
                C0019.m1180(C0021.m1627(this), C0034.m3431(m6914(), 622, 14, 1893));
            } else {
                C0019.m1180(C0021.m1627(this), C0064.m4545(m6914(), 636, 17, 1963));
            }
            C0019.m1180(C0075.m6894(this), C0077.m7265(scriptMatchBean));
            int i3 = 2;
            this.h = new C0370g4(C0021.m1596(new MatchType[]{matchTypeM986, C0070.m5862()}), i3);
            this.o = new C0370g4(listM1596, i3);
            this.t = new C0370g4(listM1596, i3);
            this.y = new C0370g4(listM1596, i3);
            C0019.m1314(C0032.m3163(this), C0029.m2696(this));
            C0019.m1314(C0036.m3767(this), C0025.m2176(this));
            C0019.m1314(C0020.m1453(this), C0024.m2028(this));
            C0019.m1314(C0019.m1310(this), C0019.m1290(this));
            MatchType matchTypeM1908 = C0023.m1908(scriptMatchBean);
            this.F = matchTypeM1908;
            C0019.m1180(C0069.m5802(this), C0070.m5941(matchTypeM1908));
            C0019.m1180(C0025.m2102(this), C0071.m6033(C0075.m6783(scriptMatchBean)));
            MatchType matchTypeM3198 = C0032.m3198(scriptMatchBean);
            this.G = matchTypeM3198;
            C0019.m1180(C0019.m1296(this), C0070.m5941(matchTypeM3198));
            MatchType matchTypeM3869 = C0037.m3869(scriptMatchBean);
            this.H = matchTypeM3869;
            C0019.m1180(C0022.m1731(this), C0070.m5941(matchTypeM3869));
            MatchType matchTypeM4690 = C0065.m4690(scriptMatchBean);
            this.I = matchTypeM4690;
            C0019.m1180(C0063.m4381(this), C0070.m5941(matchTypeM4690));
            ScriptJumpBean scriptJumpBeanM4068 = C0039.m4068(scriptMatchBean);
            this.K = scriptJumpBeanM4068;
            if (scriptJumpBeanM4068 != null && (iM617 = C0016.m617(scriptJumpBeanM4068)) >= 0 && iM617 < C0034.m3427(list)) {
                String strM1531 = C0021.m1531(C0075.m6791(m6914(), 653, 5, 1843), new Object[]{C0021.m1548(C0016.m617(C0071.m6084(this)) + 1), C0071.m5975(C0066.m4852((ScriptRecordBean) C0071.m6078(list, C0016.m617(C0071.m6084(this)))))});
                C0063.m4382(C0034.m3457(this), 0);
                C0019.m1180(C0034.m3457(this), strM1531);
            }
            C0065.m4727(C0078.m7344(this), new C0347d2(this, 4));
            C0065.m4727(C0037.m3889(this), new ViewOnClickListenerC0484z4(this, 0));
            C0065.m4727(C0024.m1953(this), new ViewOnClickListenerC0484z4(this, i2));
            C0065.m4727(C0028.m2599(this), new ViewOnClickListenerC0484z4(this, 2));
            C0065.m4727(C0025.m2168(this), new ViewOnClickListenerC0484z4(this, 3));
            C0065.m4727(C0024.m2049(this), new ViewOnClickListenerC0484z4(this, 4));
            C0029.m2696(this).c = new A4(this, 0);
            C0025.m2176(this).c = new A4(this, 1);
            C0024.m2028(this).c = new A4(this, 2);
            C0019.m1290(this).c = new A4(this, 3);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0017.m944(this, false);
        Window windowM3064 = C0031.m3064(this);
        C0034.m3483(windowM3064, new ColorDrawable(0));
        C0065.m4766(windowM3064, 0.0f);
    }
}
