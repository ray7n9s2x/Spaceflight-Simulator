package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
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
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptActionBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordBean;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptState;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0361f2 extends FrameLayout {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f321short = {1707, 1674, 1673, 1678, 1690, 1667, 1691, 1743, 1725, 1674, 1676, 1664, 1693, 1675, 1064, 1082, 1069, 1086, 1035, 1065, 1076, 1073, 1086, 1080, 1071, 1121, 3060, 3040, 3041, 2316, 2332, 2317, 2326, 2319, 2315, 2336, 797, 781, 796, 775, 798, 794, 817, 783, 770, 770, 2625, 2678, 2672, 2684, 2657, 2679, 2656, 2611, 2654, 2674, 2667, 2682, 2686, 2662, 2686, 2611, 2677, 2684, 2657, 2611, 2625, 2678, 2672, 2684, 2657, 2679, 2678, 2657, -2798, 2764, 881, 848, 851, 852, 832, 857, 833, 789, 871, 848, 854, 858, 839, 849, 325, 736, 736, 736, 736, 692, 724, 724, 692, 765, 765, 697, 721, 721, 675, 756, 756, 675, 746, 746, 1977, 1961, 1976, 1955, 1978, 1982, 1941, 1955, 1961, 1941, 1976, 1983, 1956, 1956, 1955, 1956, 1965, 1941, 1978, 1963, 1983, 1977, 1967, 1978, 1958, 1963, 1956, 1923, 1966, 1536, 1565, 1536, 1542, 1552, 1553, 1536, 1590, 1553, 1540, 1559, 1553, 2685, 2656, 2685, 2683, 2669, 2668, 2685, 2653, 2678, 2684, 304, 307, 307, 300, 274, 297, 305, 1136, 1136, 1136, 1136, 1060, 1092, 1092, 1060, 1133, 1133, 1065, 1089, 1089, 1075, 1124, 1124, 1075, 1146, 1146};
    public int[] A;
    public int B;
    public int C;
    public String D;
    public H E;
    public String F;
    public String G;
    public int H;
    public long I;
    public boolean J;
    public LinearLayout a;
    public LinearLayout b;
    public LinearLayout c;
    public ImageView d;
    public TextView e;
    public LinearLayout f;
    public LinearLayout g;
    public LinearLayout h;
    public LinearLayout i;
    public ImageView j;
    public ImageView k;
    public TextView l;
    public LinearLayout m;
    public long n;
    public ScriptState o;
    public C0381i2 p;
    public View q;
    public DialogC0472x4 r;
    public DialogC0331b0 s;
    public U3 t;
    public C0425p4 u;
    public ArrayList v;
    public boolean w;
    public HashMap x;
    public ScriptProjectAliasBean y;
    public long z;

    /* JADX INFO: renamed from: ۠ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7061() {
        if (C0063.m4427() >= 0) {
            return f321short;
        }
        return null;
    }

    public void setListener(InterfaceC0431q4 interfaceC0431q4) {
    }

    public static String b(C0361f2 c0361f2, long j) {
        long j2 = j % 3600;
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, C0111.m13184(j2 / 60));
        C0077.m7290(sb, C0016.m625(m7061(), 75, 1, 2806));
        C0077.m7290(sb, C0111.m13184(j2 % 60));
        return C0068.m5536(sb);
    }

    public static String o(long j) {
        if (j >= 0 && j < 10) {
            return C0039.m4094(j, C0017.m936(m7061(), 90, 1, 373));
        }
        StringBuilder sb = new StringBuilder();
        C0078.m7466(sb, j);
        C0077.m7290(sb, C0031.m2993());
        return C0068.m5536(sb);
    }

    public final void e(ScriptProjectAliasBean scriptProjectAliasBean) {
        this.y = scriptProjectAliasBean;
        C0019.m1180(C0017.m903(this), C0021.m1617(scriptProjectAliasBean));
        ScriptProjectBean scriptProjectBeanM1433 = C0020.m1433(C0022.m1755(this), C0036.m3674(scriptProjectAliasBean));
        int i = 0;
        C0063.m4382(C0031.m3080(this), 0);
        C0063.m4382(C0074.m6539(this), 8);
        C0020.m1446(this, false);
        C0070.m5957();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C0016.m641(C0070.m5957());
        C0031.m3001(simpleDateFormat, C0037.m3829(m7061(), 91, 19, 665));
        String strM5925 = C0070.m5925(simpleDateFormat, date);
        this.F = strM5925;
        this.G = strM5925;
        this.H = 0;
        this.J = false;
        this.I = C0036.m3674(scriptProjectAliasBean);
        C0035.m3539(this);
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && C0023.m1859(this) != null) {
            ViewGroup viewGroup = (ViewGroup) C0027.m2395(C0027.m2524(activityM7370));
            if (C0024.m1969(C0023.m1859(this)) != null) {
                C0024.m2073(viewGroup, C0023.m1859(this));
            }
            C0065.m4689(viewGroup, C0023.m1859(this));
        }
        C0038.m3969(C0035.m3616(this), C0070.m5853(C0036.m3674(scriptProjectAliasBean)), C0018.m1065());
        C0039.m4187(C0021.m1626(this), C0071.m6091(C0030.m2840(m7061(), 110, 23, 1994)));
        C0065.m4734(new Thread(new Y1(this, scriptProjectBeanM1433, scriptProjectAliasBean, i)));
    }

    public final void f(boolean z) {
        if (!z) {
            C0381i2 c0381i2M6539 = C0074.m6539(this);
            if (c0381i2M6539 == null || C0074.m6521(c0381i2M6539) != 0) {
                return;
            }
            C0063.m4382(C0031.m3080(this), 0);
            C0063.m4382(C0074.m6539(this), 8);
            C0020.m1446(this, true);
            return;
        }
        if (C0078.m7370(C0028.m2666()) == null) {
            return;
        }
        C0070.m5957();
        if (C0034.m3427(C0069.m5730(C0022.m1755(this))) <= 0 || C0074.m6539(this) == null) {
            C0063.m4382(C0031.m3080(this), 0);
            C0063.m4382(C0074.m6539(this), 8);
            C0020.m1446(this, true);
            return;
        }
        C0408n c0408nM6120 = C0072.m6120();
        C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
        if (c0408n != null) {
            C0037.m3799(c0408n, true);
            C0071.m5989((C0408n) C0077.m7207(c0408nM6120), 0, 0);
        }
        C0063.m4382(C0031.m3080(this), 8);
        C0021.m1646(C0074.m6539(this));
        C0063.m4382(C0074.m6539(this), 0);
    }

    public final void g() {
        HashMap map = new HashMap();
        C0038.m3969(map, C0028.m2609(m7061(), 133, 6, 1994), C0071.m6033(C0023.m1901(this)));
        C0038.m3969(map, C0077.m7205(m7061(), 139, 12, 1637), C0030.m2879(this));
        C0038.m3969(map, C0064.m4545(m7061(), 151, 10, 2584), C0078.m7341(this));
        C0038.m3969(map, C0039.m4066(m7061(), 161, 7, 348), C0078.m7464(C0064.m4530(this)));
    }

    public final void j(boolean z) {
        C0408n c0408nM6120 = C0072.m6120();
        C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
        if (c0408n != null) {
            C0037.m3799(c0408n, false);
        }
        if (!z) {
            C0408n c0408n2 = (C0408n) C0077.m7207(c0408nM6120);
            if (c0408n2 != null) {
                C0071.m5989(c0408n2, 2, C0029.m2788(this));
            }
            C0063.m4382(C0075.m6788(this), 8);
            C0063.m4382(C0069.m5792(this), 0);
            return;
        }
        C0408n c0408n3 = (C0408n) C0077.m7207(c0408nM6120);
        if (c0408n3 != null) {
            C0071.m5989(c0408n3, 1, C0017.m909(this));
        }
        C0063.m4382(C0075.m6788(this), 0);
        C0063.m4382(C0069.m5792(this), 8);
        C0064.m4570(C0039.m4155(this));
    }

    public final void l(long j, List list) {
        Activity activityM7370;
        Activity activityM73702;
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            Boolean boolM1065 = C0018.m1065();
            HashMap mapM3616 = C0035.m3616(this);
            if (!C0037.m3876(boolM1065, C0067.m5420(mapM3616, C0070.m5853(j)))) {
                return;
            }
            ScriptRecordBean scriptRecordBean = (ScriptRecordBean) C0071.m6012(itM4732);
            int i = C0068.m5640()[C0030.m2893(C0066.m4852(scriptRecordBean))];
            if (i == 1 || i == 2) {
                ScriptActionBean scriptActionBeanM1375 = C0020.m1375(scriptRecordBean);
                if (scriptActionBeanM1375 != null) {
                    long jM4307 = C0063.m4307(C0021.m1536(scriptActionBeanM1375));
                    long jM43072 = C0063.m4307(C0035.m3546(scriptActionBeanM1375));
                    long jM3576 = C0035.m3576(scriptActionBeanM1375);
                    if (jM3576 > 0) {
                        long jM1210 = jM3576 - C0019.m1210(scriptActionBeanM1375);
                        long j2 = (jM1210 - jM4307) - jM43072;
                        if (j2 > 0) {
                            C0069.m5794(j2);
                        } else {
                            C0069.m5794(jM1210);
                        }
                    }
                    int iM910 = C0017.m910(scriptActionBeanM1375);
                    if (iM910 == 0) {
                        while (C0037.m3876(C0018.m1065(), C0067.m5420(mapM3616, C0070.m5853(j)))) {
                            if (C0066.m4852(scriptRecordBean) == C0021.m1573()) {
                                C0063.m4393(this, scriptActionBeanM1375);
                            } else {
                                C0069.m5829(this, j, scriptActionBeanM1375);
                            }
                            if (C0026.m2341(this) && (activityM7370 = C0078.m7370(C0028.m2666())) != null) {
                                C0025.m2123(activityM7370, new Z1(this, 2));
                            }
                            C0069.m5794(C0063.m4307(C0021.m1536(scriptActionBeanM1375)));
                        }
                    } else if (iM910 > 0) {
                        for (int i2 = 0; i2 < C0017.m910(scriptActionBeanM1375); i2++) {
                            if (C0066.m4852(scriptRecordBean) == C0021.m1573()) {
                                C0063.m4393(this, scriptActionBeanM1375);
                            } else {
                                C0069.m5829(this, j, scriptActionBeanM1375);
                            }
                            if (C0026.m2341(this) && (activityM73702 = C0078.m7370(C0028.m2666())) != null) {
                                C0025.m2123(activityM73702, new Z1(this, 3));
                            }
                            C0069.m5794(jM4307);
                        }
                        C0069.m5794(jM43072);
                    }
                }
            } else if (i == 3 || i == 4) {
                if (C0067.m5439(scriptRecordBean) != null) {
                    C0039.m4161(C0066.m4797(C0029.m2720(C0022.m1755(this))));
                    try {
                        C0027.m2455(new CountDownLatch(1));
                    } catch (Exception e) {
                        C0033.m3347(e);
                    }
                }
            }
        }
    }

    public final void n() {
        C0070.m5957();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C0016.m641(C0070.m5957());
        C0031.m3001(simpleDateFormat, C0072.m6116(m7061(), 168, 19, 1033));
        this.G = C0070.m5925(simpleDateFormat, date);
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && C0023.m1859(this) != null) {
            C0024.m2073((ViewGroup) C0027.m2395(C0027.m2524(activityM7370)), C0023.m1859(this));
        }
        if (C0069.m5700(this)) {
            return;
        }
        this.J = true;
        C0035.m3539(this);
    }

    public void setBgDrawable(Drawable drawable) {
        LinearLayout linearLayoutM6788 = C0075.m6788(this);
        if (linearLayoutM6788 != null) {
            C0039.m4187(linearLayoutM6788, drawable);
        }
        C0381i2 c0381i2M6539 = C0074.m6539(this);
        if (c0381i2M6539 != null) {
            C0019.m1193(c0381i2M6539, drawable);
        }
    }

    public static void a(C0361f2 c0361f2, ScriptProjectBean scriptProjectBean, InterfaceC0395k4 interfaceC0395k4) {
        String strM1527;
        int iM3427 = C0034.m3427(C0069.m5730(C0022.m1755(c0361f2)));
        if (iM3427 < 20) {
            C0070.m5957();
            if (C0038.m3939(C0021.m1527(scriptProjectBean))) {
                StringBuilder sb = new StringBuilder(C0078.m7427(m7061(), 0, 14, 1775));
                int i = iM3427 + 1;
                C0021.m1551(sb, i);
                strM1527 = C0025.m2136(C0068.m5536(sb), C0069.m5730(C0022.m1755(c0361f2)), i);
            } else {
                strM1527 = C0021.m1527(scriptProjectBean);
            }
            scriptProjectBean.projectName = strM1527;
            if (C0073.m6309(scriptProjectBean) == 0) {
                scriptProjectBean.id = C0074.m6518();
            }
            Context contextM1755 = C0022.m1755(c0361f2);
            SharedPreferences sharedPreferencesM7453 = C0078.m7453(contextM1755);
            if (sharedPreferencesM7453 != null) {
                SharedPreferences.Editor editorM2261 = C0026.m2261(sharedPreferencesM7453);
                StringBuilder sb2 = new StringBuilder(C0038.m4022(m7061(), 14, 12, 1115));
                C0078.m7466(sb2, C0073.m6309(scriptProjectBean));
                C0036.m3736(C0025.m2151(m7061(), 26, 3, 2968), C0068.m5536(sb2));
                StringBuilder sb3 = new StringBuilder(C0039.m4066(m7061(), 29, 7, 2431));
                C0078.m7466(sb3, C0073.m6309(scriptProjectBean));
                C0029.m2704(editorM2261, C0068.m5536(sb3), C0025.m2112(scriptProjectBean));
                List listM5730 = C0069.m5730(contextM1755);
                C0017.m930(listM5730, 0, new ScriptProjectAliasBean(C0073.m6309(scriptProjectBean), C0021.m1527(scriptProjectBean)));
                C0029.m2704(editorM2261, C0076.m6902(m7061(), 36, 10, 878), C0025.m2112(listM5730));
                try {
                    C0021.m1592(editorM2261);
                } catch (Exception e) {
                    C0033.m3347(e);
                }
            }
            C0018.m1041(interfaceC0395k4, true);
            return;
        }
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null) {
            C0030.m2968(C0023.m1884(activityM7370, C0068.m5544(m7061(), 46, 29, 2579), 0));
        }
        C0018.m1041(interfaceC0395k4, false);
    }

    public static String c(String str, List list, int i) {
        Iterator itM4732 = C0065.m4732(list);
        while (C0036.m3657(itM4732)) {
            if (C0070.m5838(C0021.m1617((ScriptProjectAliasBean) C0071.m6012(itM4732)), str)) {
                StringBuilder sb = new StringBuilder(C0065.m4757(m7061(), 76, 14, 821));
                int i2 = i + 1;
                C0021.m1551(sb, i2);
                return C0025.m2136(C0068.m5536(sb), list, i2);
            }
        }
        return str;
    }

    public static long d(List list) {
        if (C0034.m3427(list) == 2) {
            int iM2170 = C0025.m2170((Integer) C0071.m6078(list, 0));
            int iM21702 = C0025.m2170((Integer) C0071.m6078(list, 1));
            int iM6445 = C0074.m6445(iM2170, iM21702);
            int iM3151 = C0032.m3151(iM2170, iM21702);
            return C0032.m3176(new Random(), (iM6445 - iM3151) + 1) + iM3151;
        }
        return 100L;
    }

    public final void h(ScriptActionBean scriptActionBean) {
        ArrayList arrayListM5955;
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && (arrayListM5955 = C0070.m5955(scriptActionBean)) != null && C0018.m1084(arrayListM5955) > 0) {
            C0025.m2123(activityM7370, new X1(this, scriptActionBean, (ScriptTouchBean) C0064.m4526(C0070.m5955(scriptActionBean), 0), activityM7370));
        }
    }

    public final void i(long j, ScriptActionBean scriptActionBean) {
        ArrayList arrayListM5955;
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && (arrayListM5955 = C0070.m5955(scriptActionBean)) != null && C0018.m1084(arrayListM5955) > 0) {
            long jM1210 = C0019.m1210(scriptActionBean) / ((long) C0018.m1084(C0070.m5955(scriptActionBean)));
            for (int i = 0; i < C0018.m1084(C0070.m5955(scriptActionBean)) && C0037.m3876(C0018.m1065(), C0067.m5420(C0035.m3616(this), C0070.m5853(j))); i++) {
                C0025.m2123(activityM7370, new Y1(this, (ScriptTouchBean) C0064.m4526(C0070.m5955(scriptActionBean), i), activityM7370, 1));
                C0069.m5794(jM1210);
            }
        }
    }

    public final void k(ScriptRecordType scriptRecordType) {
        U3 u3M13038;
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && (u3M13038 = C0111.m13038(this)) != null) {
            if (scriptRecordType == C0021.m1573() || scriptRecordType == C0067.m5437()) {
                C0025.m2088(u3M13038, false);
            }
            C0022.m1683(C0111.m13038(this), scriptRecordType);
            C0111.m13038(this).z = 0L;
            ViewGroup viewGroup = (ViewGroup) C0027.m2395(C0027.m2524(activityM7370));
            if (C0024.m1969(C0111.m13038(this)) != null) {
                C0024.m2073(viewGroup, C0111.m13038(this));
            }
            C0065.m4689(viewGroup, C0111.m13038(this));
        }
    }

    public final void m() {
        Activity activityM7370 = C0078.m7370(C0028.m2666());
        if (activityM7370 != null && C0111.m13038(this) != null) {
            C0024.m2073((ViewGroup) C0027.m2395(C0027.m2524(activityM7370)), C0111.m13038(this));
        }
    }
}
