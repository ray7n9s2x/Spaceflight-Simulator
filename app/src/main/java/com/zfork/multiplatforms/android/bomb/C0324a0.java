package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import j$.util.Objects;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0324a0 implements InterfaceC0477y3, InterfaceC0415o0, InterfaceC0471x3, InterfaceC0395k4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f301short = {1707, 1700, 1722, 1709, 1698, 1686, 1704, 1724, 1725, 1702, 1686, 1706, 1702, 1703, 1711, 1696, 1710, 2346, 2313, 2332, 2332, 2333, 2354, 2332, 2304};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0324a0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۠۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7026() {
        if (C0026.m2298() < 0) {
            return f301short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7027(Object obj) {
        if (C0021.m1598() < 0) {
            return Objects.toString(obj);
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0477y3
    public void a(Object obj) {
        switch (C0033.m3327(this)) {
            case 0:
                C0027.m2391((DialogC0331b0) C0077.m7201(this), (Activity) obj);
                break;
            default:
                DialogC0445t1 dialogC0445t1 = (DialogC0445t1) C0077.m7201(this);
                C0030.m2951(dialogC0445t1);
                if (C0025.m2170((Integer) obj) == -1) {
                    C0020.m1338(dialogC0445t1);
                }
                break;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0415o0
    public void b(DialogC0421p0 dialogC0421p0, int i) {
        Context contextM1755;
        L lM3367;
        AutoClickPlanBean autoClickPlanBeanM1632;
        switch (C0033.m3327(this)) {
            case 1:
                C0 c0 = (C0) C0077.m7201(this);
                if (i == 3) {
                    C0479z c0479zM1659 = C0022.m1659(c0);
                    if (c0479zM1659 != null) {
                        O1 o1 = (O1) C0064.m4580(c0479zM1659);
                        if (o1 != null ? C0029.m2708(o1) : false) {
                            if (o1 != null) {
                                C0063.m4438(o1);
                            }
                            C0031.m3098(C0033.m3367());
                        }
                    }
                } else {
                    C0030.m2951(c0);
                }
                C0020.m1338(dialogC0421p0);
                break;
            case 2:
            default:
                W1 w1 = (W1) C0077.m7201(this);
                C0030.m2951(w1);
                if (i == 3 && (autoClickPlanBeanM1632 = C0021.m1632((lM3367 = C0033.m3367()))) != null) {
                    C0111.m13159(autoClickPlanBeanM1632, C0025.m2157(w1));
                    lM3367.h = true;
                    for (int i2 = 0; i2 < C0034.m3427(C0072.m6198(C0021.m1632(lM3367))); i2++) {
                        T1 t1 = (T1) C0071.m6078(C0072.m6198(C0021.m1632(lM3367)), i2);
                        if (i2 == C0034.m3427(C0072.m6198(C0021.m1632(lM3367))) - 1) {
                            C0038.m4001(t1, true);
                        } else {
                            C0038.m4001(t1, false);
                        }
                    }
                    break;
                }
                break;
            case 3:
                K0 k0 = (K0) C0077.m7201(this);
                C0030.m2951(k0);
                if (i == 3) {
                    dialogC0421p0.n = true;
                    C0020.m1338(dialogC0421p0);
                    boolean z = !C0016.m700(k0);
                    m7027(C0022.m1755(k0));
                    Context contextM17552 = C0022.m1755(k0);
                    String strM2609 = C0028.m2609(m7026(), 0, 17, 1737);
                    SharedPreferences.Editor editorM2261 = C0026.m2261(C0029.m2737(contextM17552, strM2609, 0));
                    String strM1443 = C0020.m1443(m7026(), 17, 8, 2425);
                    C0111.m13185(editorM2261, strM1443, z);
                    if (!C0021.m1592(editorM2261) && (contextM1755 = C0022.m1755(k0)) != null && !C0038.m3939(strM1443)) {
                        SharedPreferences.Editor editorM22612 = C0026.m2261(C0029.m2737(contextM1755, strM2609, 0));
                        C0111.m13185(editorM22612, strM1443, z);
                        C0072.m6210(editorM22612);
                    }
                    C0026.m2337(new Handler(C0037.m3783()), new H0(0), 1000L);
                }
                break;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0395k4
    public void c(boolean z) {
        switch (C0033.m3327(this)) {
            case 6:
                C0340c2 c0340c2 = (C0340c2) C0077.m7201(this);
                if (!z) {
                    C0030.m2951(c0340c2);
                } else {
                    C0361f2 c0361f2M2528 = C0027.m2528(c0340c2);
                    C0020.m1338(C0025.m2153(c0361f2M2528));
                    if (C0074.m6539(c0361f2M2528) != null) {
                        C0408n c0408nM6120 = C0072.m6120();
                        C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
                        if (c0408n != null) {
                            C0037.m3799(c0408n, true);
                            C0071.m5989((C0408n) C0077.m7207(c0408nM6120), 0, 0);
                        }
                        C0021.m1646(C0074.m6539(c0361f2M2528));
                        C0063.m4382(C0031.m3080(c0361f2M2528), 8);
                        C0063.m4382(C0074.m6539(c0361f2M2528), 0);
                    }
                }
                break;
            default:
                C0361f2 c0361f2 = (C0361f2) C0026.m2314((C0347d2) C0077.m7201(this));
                if (z) {
                    C0021.m1646(C0074.m6539(c0361f2));
                }
                C0064.m4570(C0039.m4155(c0361f2));
                break;
        }
    }

    public void d(C0 c0, Boolean bool, int i, int i2) {
        G0 g0 = (G0) C0077.m7201(this);
        C0030.m2951(g0);
        if (C0065.m4681(bool)) {
            if (i == 0) {
                C0018.m1015(g0).width = -2;
            } else {
                C0018.m1015(g0).width = i2;
            }
        } else if (i == 0) {
            C0018.m1015(g0).width = -2;
        } else {
            C0018.m1015(g0).width = i2;
        }
        C0037.m3792(C0073.m6370(g0), c0, C0018.m1015(g0));
    }
}
