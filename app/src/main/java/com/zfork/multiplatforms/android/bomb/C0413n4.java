package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0033;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0413n4 extends BaseAdapter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f347short = {3251, 3235, 3250, 3241, 3248, 3252, 3231, 3241, 3252, 3237, 3245, 3231, 3242, 3253, 3245, 3248, 965, 984, 984, 963, 1922, 1939, 1934, 1922, 1665, 1669, 1673, 1679, 1677, 1309, 1293, 1308, 1287, 1310, 1306, 1329, 1287, 1306, 1291, 1283, 1329, 1295, 1293, 1306, 1287, 1281, 1280, 1329, 1309, 1286, 1295, 1310, 1291, 3065, 3049, 3064, 3043, 3066, 3070, 3029, 3040, 3071, 3047, 3066, 3029, 3065, 3055, 3046, 3055, 3049, 3070, 3099, 3083, 3098, 3073, 3096, 3100, 3127, 3074, 3101, 3077, 3096, 3127, 3101, 3078, 3099, 3085, 3076, 3085, 3083, 3100};
    public T a;
    public int b;
    public ArrayList c;

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7096() {
        if (C0063.m4427() >= 0) {
            return f347short;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return C0018.m1084(C0063.m4324(this));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (String) C0064.m4526(C0063.m4324(this), i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0407m4 c0407m4;
        View view2 = view;
        if (view2 == null) {
            c0407m4 = new C0407m4();
            View viewM5715 = C0069.m5715(C0033.m3330(m7096(), 0, 16, 3264));
            if (viewM5715 != null) {
                c0407m4.a = (LinearLayout) C0029.m2688(viewM5715, C0020.m1443(m7096(), 16, 4, 951));
                c0407m4.b = (TextView) C0029.m2688(viewM5715, C0022.m1728(m7096(), 20, 4, 2038));
                c0407m4.c = (ImageView) C0029.m2688(viewM5715, C0074.m6452(m7096(), 24, 5, 1768));
                C0027.m2403(viewM5715, c0407m4);
                view2 = viewM5715;
            }
        } else {
            c0407m4 = (C0407m4) C0021.m1553(view2);
        }
        String str = (String) C0064.m4526(C0063.m4324(this), i);
        C0019.m1180(C0068.m5540(c0407m4), str);
        C0039.m4187(C0017.m886(c0407m4), C0018.m1059(C0021.m1650(m7096(), 29, 24, 1390)));
        if (i == C0024.m2066(this)) {
            C0039.m4187(C0019.m1307(c0407m4), C0071.m6091(C0039.m4066(m7096(), 53, 18, 2954)));
        } else {
            C0039.m4187(C0019.m1307(c0407m4), C0071.m6091(C0024.m1945(m7096(), 71, 20, 3176)));
        }
        ViewGroup.LayoutParams layoutParamsM4105 = C0039.m4105(C0019.m1307(c0407m4));
        layoutParamsM4105.width = C0075.m6777(C0022.m1755(viewGroup), 18.0f);
        layoutParamsM4105.height = C0075.m6777(C0022.m1755(viewGroup), 18.0f);
        C0016.m687(C0019.m1307(c0407m4), layoutParamsM4105);
        C0065.m4727(C0017.m886(c0407m4), new ViewOnClickListenerC0368g2(this, i, str, 2));
        return view2;
    }
}
