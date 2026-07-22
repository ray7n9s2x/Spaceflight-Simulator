package com.zfork.multiplatforms.android.bomb;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
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
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0472x4 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f375short = {1557, 1541, 1556, 1551, 1558, 1554, 1593, 1538, 1551, 1543, 1546, 1545, 1537, 1593, 1558, 1556, 1545, 1548, 1539, 1541, 1554, 1593, 1557, 1539, 1554, 1554, 1551, 1544, 1537, 1517, 1520, 1520, 1515, 1419, 1435, 1418, 1425, 1416, 1420, 1447, 1433, 1435, 1420, 1425, 1431, 1430, 1447, 1419, 1424, 1433, 1416, 1437, 1947, 1925, 1922, 1928, 1923, 1947, 1209, 1193, 1208, 1189, 1190, 1190, 1173, 1209, 1199, 1214, 1214, 804, 806, 827, 830, 817, 823, 800, 779, 807, 817, 800, 800, 829, 826, 819, 779, 800, 829, 800, 824, 817, 2208, 2210, 2239, 2234, 2229, 2227, 2212, 2191, 2211, 2229, 2212, 2212, 2233, 2238, 2231, 2191, 2238, 2225, 2237, 2229, 1531, 1515, 1530, 1505, 1528, 1532, 1495, 1513, 1515, 1532, 1505, 1511, 1510, 1495, 1517, 1516, 1505, 1532, 1495, 1531, 1504, 1513, 1528, 1517, 474, 472, 453, 448, 463, 457, 478, 501, 473, 463, 478, 478, 451, 452, 461, 501, 457, 453, 479, 452, 478, 2619, 2617, 2596, 2593, 2606, 2600, 2623, 2580, 2616, 2606, 2623, 2623, 2594, 2597, 2604, 2580, 2594, 2597, 2623, 2606, 2617, 2621, 2602, 2599, 2580, 2616, 2623, 2602, 2617, 2623, 2908, 2910, 2883, 2886, 2889, 2895, 2904, 2931, 2911, 2889, 2904, 2904, 2885, 2882, 2891, 2931, 2885, 2882, 2904, 2889, 2910, 2906, 2893, 2880, 2931, 2889, 2882, 2888, 1807, 1805, 1808, 1813, 1818, 1820, 1803, 1824, 1804, 1818, 1803, 1803, 1814, 1809, 1816, 1824, 1820, 1822, 1809, 1820, 1818, 1811, 583, 581, 600, 605, 594, 596, 579, 616, 580, 594, 579, 579, 606, 601, 592, 616, 580, 598, 577, 594, 1674, 1720, 1711, 1724, 1785, 1675, 1724, 1722, 1718, 1707, 1725, 2593, 2582, 2576, 2588, 2561, 2583, 2643, 2592, 2582, 2567, 2567, 2586, 2589, 2580};
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final EditText d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public InterfaceC0466w4 h;
    public ScriptProjectBean i;
    public final LinearLayout j;
    public final Point k;

    /* JADX INFO: renamed from: ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7140() {
        if (C0027.m2460() > 0) {
            return f375short;
        }
        return null;
    }

    public final void a(ScriptProjectBean scriptProjectBean, boolean z) {
        this.i = scriptProjectBean;
        if (z) {
            C0019.m1180(C0066.m4791(this), C0074.m6452(m7140(), 255, 11, 1753));
            C0019.m1180(C0071.m6034(this), C0031.m2993());
            C0038.m3944(C0071.m6034(this), C0021.m1527(C0070.m5909(this)));
        } else {
            C0019.m1180(C0066.m4791(this), C0028.m2609(m7140(), 266, 14, 2675));
            C0019.m1180(C0071.m6034(this), C0021.m1527(C0070.m5909(this)));
        }
        C0019.m1180(C0073.m6410(this), C0078.m7464(C0033.m3252(C0070.m5909(this))));
        C0019.m1180(C0022.m1778(this), C0064.m4588(C0071.m6078(C0024.m1955(C0070.m5909(this)), 0)));
        C0019.m1180(C0073.m6440(this), C0064.m4588(C0071.m6078(C0024.m1955(C0070.m5909(this)), 1)));
    }

    public DialogC0472x4(Activity activity) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        View viewM5715 = C0069.m5715(C0076.m6902(m7140(), 0, 29, 1638));
        if (viewM5715 != null) {
            LinearLayout linearLayout = (LinearLayout) C0029.m2688(viewM5715, C0063.m4315(m7140(), 29, 4, 1439));
            this.j = linearLayout;
            C0039.m4187(linearLayout, C0018.m1059(C0076.m6902(m7140(), 33, 19, 1528)));
            Display displayM5833 = C0069.m5833((WindowManager) C0026.m2310(C0027.m2454(this), C0018.m1070(m7140(), 52, 6, 2028)));
            Point point = new Point();
            this.k = point;
            C0035.m3525(displayM5833, point);
            Point pointM7448 = C0078.m7448(this);
            if (C0068.m5537(pointM7448) > C0025.m2215(pointM7448)) {
                C0016.m687(C0038.m4005(this), new FrameLayout.LayoutParams(C0075.m6777(C0027.m2454(this), 240.0f), C0075.m6777(C0027.m2454(this), 260.0f)));
            }
            ScrollView scrollView = (ScrollView) C0029.m2688(viewM5715, C0019.m1189(m7140(), 58, 11, 1226));
            Point pointM74482 = C0078.m7448(this);
            if (C0068.m5537(pointM74482) > C0025.m2215(pointM74482)) {
                C0016.m687(scrollView, new LinearLayout.LayoutParams(C0075.m6777(C0027.m2454(this), 240.0f), C0075.m6777(C0027.m2454(this), 160.0f)));
            }
            this.a = (TextView) C0029.m2688(viewM5715, C0031.m3047(m7140(), 69, 21, 852));
            EditText editText = (EditText) C0029.m2688(viewM5715, C0076.m6902(m7140(), 90, 20, 2256));
            this.d = editText;
            C0028.m2613(editText, new InputFilter[]{new InputFilter.LengthFilter(30)});
            EditText editTextM6034 = C0071.m6034(this);
            String strM4022 = C0038.m4022(m7140(), 110, 24, 1416);
            C0039.m4187(editTextM6034, C0018.m1059(strM4022));
            EditText editText2 = (EditText) C0029.m2688(viewM5715, C0067.m5418(m7140(), 134, 21, 426));
            this.e = editText2;
            C0039.m4187(editText2, C0018.m1059(strM4022));
            EditText editText3 = (EditText) C0029.m2688(viewM5715, C0022.m1728(m7140(), ModuleDescriptor.MODULE_VERSION, 30, 2635));
            this.f = editText3;
            C0039.m4187(editText3, C0018.m1059(strM4022));
            EditText editText4 = (EditText) C0029.m2688(viewM5715, C0035.m3603(m7140(), 185, 28, 2860));
            this.g = editText4;
            C0039.m4187(editText4, C0018.m1059(strM4022));
            this.b = (TextView) C0029.m2688(viewM5715, C0023.m1904(m7140(), 213, 22, 1919));
            this.c = (TextView) C0029.m2688(viewM5715, C0024.m1945(m7140(), 235, 20, 567));
            C0073.m6392(this, viewM5715);
            C0065.m4727(C0111.m13096(this), new C0347d2(this, 3));
            C0065.m4727(C0028.m2601(this), new ViewOnClickListenerC0391k0(8, this));
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window windowM3064 = C0031.m3064(this);
        if (windowM3064 != null) {
            C0034.m3483(windowM3064, new ColorDrawable(0));
            C0065.m4766(windowM3064, 0.0f);
            WindowManager.LayoutParams layoutParamsM5516 = C0067.m5516(windowM3064);
            Point pointM7448 = C0078.m7448(this);
            if (C0068.m5537(pointM7448) > C0025.m2215(pointM7448)) {
                layoutParamsM5516.gravity = GravityCompat.END;
                layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 240.0f);
                layoutParamsM5516.height = C0075.m6777(C0027.m2454(this), 260.0f);
                layoutParamsM5516.x = C0075.m6777(C0027.m2454(this), 16.0f);
            } else {
                layoutParamsM5516.gravity = 17;
                layoutParamsM5516.width = C0075.m6777(C0027.m2454(this), 304.0f);
                layoutParamsM5516.height = -2;
            }
            C0078.m7346(windowM3064, layoutParamsM5516);
        }
    }
}
