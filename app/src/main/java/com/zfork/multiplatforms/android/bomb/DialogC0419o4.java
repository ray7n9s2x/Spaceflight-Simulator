package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.MatchType;
import com.zfork.entry.C0075;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC0419o4 extends Dialog {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f350short = {2767, 2783, 2766, 2773, 2764, 2760, 2787, 2776, 2773, 2781, 2768, 2771, 2779, 2787, 2774, 2761, 2769, 2764, 705, 732, 732, 711, 279, 264, 272, 269, 290, 265, 276, 265, 273, 280, 1572, 1595, 1571, 1598, 1553, 1581, 1570, 1569, 1597, 1579, 1773, 1789, 1772, 1783, 1774, 1770, 1729, 1783, 1789, 1729, 1789, 1778, 1777, 1773, 1787, 754, 738, 755, 744, 753, 757, 734, 736, 738, 757, 744, 750, 751, 734, 754, 745, 736, 753, 740, 1178, 1157, 1181, 1152, 1199, 1180, 1177, 1155, 1156, 765, 715, 706, 715, 717, 730, 654, 719, 654, 704, 705, 714, 715, 938, 924, 917, 924, 922, 909, 985, 920, 985, 939, 924, 922, 918, 907, 925};
    public final TextView a;
    public final ImageView b;
    public final ListView c;
    public final C0413n4 d;
    public final InterfaceC0401l4 e;

    /* JADX INFO: renamed from: ۤۥۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7099() {
        if (C0078.m7450() > 0) {
            return f350short;
        }
        return null;
    }

    public DialogC0419o4(Activity activity, ArrayList arrayList, int i, MatchType matchType, InterfaceC0401l4 interfaceC0401l4) {
        super(activity);
        this.e = interfaceC0401l4;
        View viewM5715 = C0069.m5715(C0028.m2609(m7099(), 0, 18, 2748));
        if (viewM5715 != null) {
            LinearLayout linearLayout = (LinearLayout) C0029.m2688(viewM5715, C0068.m5544(m7099(), 18, 4, 691));
            this.a = (TextView) C0029.m2688(viewM5715, C0022.m1728(m7099(), 22, 10, 381));
            ImageView imageView = (ImageView) C0029.m2688(viewM5715, C0065.m4757(m7099(), 32, 10, 1614));
            this.b = imageView;
            C0039.m4187(imageView, C0071.m6091(C0029.m2695(m7099(), 42, 15, 1694)));
            ViewGroup.LayoutParams layoutParamsM4105 = C0039.m4105(C0039.m4129(this));
            layoutParamsM4105.width = C0075.m6777(C0027.m2454(this), 20.0f);
            layoutParamsM4105.height = C0075.m6777(C0027.m2454(this), 20.0f);
            C0016.m687(C0039.m4129(this), layoutParamsM4105);
            C0039.m4187(linearLayout, C0018.m1059(C0075.m6791(m7099(), 57, 19, 641)));
            this.c = (ListView) C0029.m2688(viewM5715, C0020.m1443(m7099(), 76, 9, 1264));
            C0073.m6392(this, viewM5715);
            if (matchType == C0032.m3242()) {
                C0019.m1180(C0021.m1559(this), C0078.m7427(m7099(), 85, 13, 686));
            } else {
                C0019.m1180(C0021.m1559(this), C0023.m1904(m7099(), 98, 15, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW));
            }
            C0413n4 c0413n4 = new C0413n4();
            c0413n4.c = arrayList;
            c0413n4.b = i;
            this.d = c0413n4;
            C0019.m1314(C0019.m1302(this), c0413n4);
            C0036.m3688(this).a = new T(this, 4);
            C0065.m4727(C0039.m4129(this), new ViewOnClickListenerC0391k0(7, this));
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
