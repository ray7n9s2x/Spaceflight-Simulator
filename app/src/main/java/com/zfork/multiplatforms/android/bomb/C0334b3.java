package com.zfork.multiplatforms.android.bomb;

import android.content.pm.ApplicationInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.MetaSelectAppAbility;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0334b3 extends BaseAdapter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f305short = {1622, 1650, 1640, 1640, 1650, 1653, 1660, 1595, 1641, 1662, 1642, 1646, 1650, 1641, 1662, 1663, 1595, 1645, 1650, 1662, 1644, 1595, 1644, 1650, 1647, 1651, 1595, 1618, 1631, 1569, 1595};
    public final MetaSelectAppAbility a;
    public ArrayList b;

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7031(Object obj) {
        if (C0038.m4010() > 0) {
            return C0032.m3236(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7032() {
        if (C0069.m5781() < 0) {
            return f305short;
        }
        return null;
    }

    public final void a(int i, C0365g c0365g) {
        MetaSelectAppAbility metaSelectAppAbilityM1340 = C0020.m1340(this);
        try {
            ApplicationInfo applicationInfo = (ApplicationInfo) C0064.m4526(C0078.m7409(this), i);
            C0016.m713(C0024.m1984(c0365g), C0077.m7247(applicationInfo, C0068.m5667(metaSelectAppAbilityM1340)));
            C0019.m1180(C0066.m4894(c0365g), C0063.m4440(applicationInfo, C0068.m5667(metaSelectAppAbilityM1340)));
            TextView textViewM6174 = C0072.m6174(c0365g);
            StringBuilder sb = new StringBuilder();
            C0077.m7290(sb, C0016.m703(applicationInfo));
            C0077.m7289(sb, '(');
            C0021.m1551(sb, C0022.m1724(applicationInfo));
            C0077.m7289(sb, ')');
            C0019.m1180(textViewM6174, C0068.m5536(sb));
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return C0018.m1084(C0078.m7409(this));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (ApplicationInfo) C0064.m4526(C0078.m7409(this), i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            C0063.m4415(this, i, (C0365g) C0021.m1553(view));
            return view;
        }
        View viewM3295 = C0033.m3295(C0025.m2091(C0020.m1340(this)), (((2132701681 ^ 7567) ^ 7135) ^ m7031(C0111.m13098())) ^ m7031(C0027.m2520()), null, false);
        int i2 = 2130903069;
        ImageView imageView = (ImageView) C0017.m922(viewM3295, 2130903069);
        if (imageView != null) {
            i2 = 2130903075;
            TextView textView = (TextView) C0017.m922(viewM3295, 2130903075);
            if (textView != null) {
                i2 = 2130903076;
                TextView textView2 = (TextView) C0017.m922(viewM3295, 2130903076);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewM3295;
                    C0365g c0365g = new C0365g(linearLayout, imageView, textView, textView2);
                    C0027.m2403(linearLayout, c0365g);
                    C0063.m4415(this, i, c0365g);
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException(C0032.m3232(C0017.m936(m7032(), 0, 31, 1563), C0035.m3565(C0018.m1003(viewM3295), i2)));
    }

    public C0334b3(MetaSelectAppAbility metaSelectAppAbility, ArrayList arrayList) {
        this.a = metaSelectAppAbility;
        this.b = arrayList;
    }
}
