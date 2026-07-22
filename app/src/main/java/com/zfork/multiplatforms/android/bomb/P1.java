package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends FrameLayout {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f273short = {1758, 1745, 1763, 1757, 1737, 1736, 1747, 1759, 1744, 1749, 1759, 1751, 1763, 1754, 1744, 1747, 1757, 1736, 1763, 1757, 1737, 1736, 1747, 1763, 1759, 1744, 1749, 1759, 1751, 1763, 1740, 1747, 1749, 1746, 1736, 1753, 1742, 1763, 1758, 1755, 1763, 1759, 1748, 1753, 1759, 1751, 1753, 1752, 1682, 1740, 1746, 1755, 1320, 1319, 1301, 1323, 1343, 1342, 1317, 1321, 1318, 1315, 1321, 1313, 1301, 1324, 1318, 1317, 1323, 1342, 1301, 1323, 1343, 1342, 1317, 1301, 1321, 1318, 1315, 1321, 1313, 1301, 1338, 1317, 1315, 1316, 1342, 1327, 1336, 1301, 1320, 1325, 1301, 1321, 1314, 1327, 1321, 1313, 1327, 1326, 1380, 1338, 1316, 1325, 2997, 3002, 2952, 2998, 2978, 2979, 3000, 2996, 3003, 3006, 2996, 3004, 2952, 2993, 3003, 3000, 2998, 2979, 2952, 2998, 2978, 2979, 3000, 2952, 2996, 3003, 3006, 2996, 3004, 2952, 2983, 3000, 3006, 3001, 2979, 2994, 2981, 2952, 2997, 2992, 3065, 2983, 3001, 2992};
    public final TextView a;
    public final ImageView b;

    /* JADX INFO: renamed from: ۠ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6996() {
        if (C0063.m4427() >= 0) {
            return f273short;
        }
        return null;
    }

    public TextView getTextView() {
        return C0018.m1026(this);
    }

    public void setFocus(boolean z) {
        ImageView imageViewM3175 = C0032.m3175(this);
        if (imageViewM3175 == null) {
            return;
        }
        if (z) {
            C0022.m1755(this);
            C0030.m2951(C0072.m6184());
            C0016.m713(imageViewM3175, C0069.m5749(C0030.m2840(m6996(), 52, 52, 1354)));
        } else {
            C0022.m1755(this);
            C0030.m2951(C0072.m6184());
            C0016.m713(imageViewM3175, C0069.m5749(C0029.m2695(m6996(), 104, 44, 3031)));
        }
    }

    public void setText(String str) {
        if (C0018.m1026(this) == null || C0038.m3939(str)) {
            return;
        }
        C0019.m1180(C0018.m1026(this), str);
    }

    public P1(Activity activity) {
        super(activity);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        C0016.m687(relativeLayout, new RelativeLayout.LayoutParams(C0035.m3620(22, activity), C0035.m3620(22, activity)));
        this.b = new ImageView(activity);
        C0016.m687(C0032.m3175(this), new RelativeLayout.LayoutParams(C0035.m3620(22, activity), C0035.m3620(22, activity)));
        ImageView imageViewM3175 = C0032.m3175(this);
        C0030.m2951(C0072.m6184());
        C0016.m713(imageViewM3175, C0069.m5749(C0076.m6902(m6996(), 0, 52, 1724)));
        TextView textView = new TextView(activity);
        this.a = textView;
        C0027.m2442(textView, ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C0111.m13050(layoutParams, 13);
        C0016.m687(C0018.m1026(this), layoutParams);
        C0016.m722(C0018.m1026(this), 2, 10.0f);
        C0065.m4689(relativeLayout, C0032.m3175(this));
        C0065.m4689(relativeLayout, C0018.m1026(this));
        C0065.m4689(this, relativeLayout);
    }
}
