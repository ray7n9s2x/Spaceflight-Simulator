package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordBean;
import com.zfork.entry.C0075;
import java.util.List;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0368g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ViewOnClickListenerC0368g2(C0370g4 c0370g4, ScriptRecordBean scriptRecordBean, int i) {
        this.a = 1;
        this.c = c0370g4;
        this.d = scriptRecordBean;
        this.b = i;
    }

    public /* synthetic */ ViewOnClickListenerC0368g2(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0071.m6005(this)) {
            case 0:
                C0381i2 c0381i2 = (C0381i2) C0077.m7245((T) C0067.m5428(this));
                if (C0070.m5854(c0381i2) != null) {
                    if (((C0408n) C0077.m7207(C0072.m6120())) != null) {
                        C0063.m4382(C0022.m1686(), 8);
                    }
                    DialogC0448t4 dialogC0448t4M5854 = C0070.m5854(c0381i2);
                    ScriptProjectBean scriptProjectBeanM1433 = C0020.m1433(C0027.m2454(dialogC0448t4M5854), C0036.m3674((ScriptProjectAliasBean) C0035.m3528(this)));
                    dialogC0448t4M5854.k = scriptProjectBeanM1433;
                    dialogC0448t4M5854.i = C0075.m6794(this);
                    if (scriptProjectBeanM1433 != null) {
                        C0019.m1180(C0025.m2167(dialogC0448t4M5854), C0021.m1527(scriptProjectBeanM1433));
                        C0370g4 c0370g4M1532 = C0021.m1532(dialogC0448t4M5854);
                        c0370g4M1532.b = C0075.m6790(C0074.m6525(dialogC0448t4M5854));
                        C0071.m6031(c0370g4M1532);
                    }
                    C0029.m2786(C0070.m5854(c0381i2));
                }
                PopupWindow popupWindowM4846 = C0066.m4846(c0381i2);
                if (popupWindowM4846 != null) {
                    C0073.m6305(popupWindowM4846);
                    c0381i2.h = null;
                }
                break;
            case 1:
                C0408n c0408n = (C0408n) C0023.m1842((C0370g4) C0067.m5428(this));
                if (c0408n != null) {
                    ScriptRecordBean scriptRecordBean = (ScriptRecordBean) C0035.m3528(this);
                    int iM6794 = C0075.m6794(this);
                    switch (C0070.m5881(c0408n)) {
                        case 5:
                            DialogC0331b0 dialogC0331b0 = (DialogC0331b0) C0077.m7207(c0408n);
                            C0072.m6111(dialogC0331b0);
                            Activity activityM7370 = C0078.m7370(C0028.m2666());
                            int i = C0032.m3190()[C0030.m2893(C0066.m4852(scriptRecordBean))];
                            if (i == 1 || i == 2) {
                                if (activityM7370 != null) {
                                    DialogC0389j4 dialogC0389j4 = new DialogC0389j4(activityM7370, C0066.m4852(scriptRecordBean), C0020.m1375(scriptRecordBean), iM6794);
                                    dialogC0389j4.v = new C0479z(c0408n, dialogC0389j4, 6);
                                    C0029.m2786(dialogC0389j4);
                                }
                            } else if (i == 3 || i == 4) {
                                List list = (List) C0072.m6209(C0025.m2173((C0370g4) C0074.m6579(dialogC0331b0)));
                                if (activityM7370 != null) {
                                    C4 c4 = new C4(activityM7370, list, C0066.m4852(scriptRecordBean), C0067.m5439(scriptRecordBean), iM6794);
                                    c4.E = new C0479z(c0408n, c4, 7);
                                    C0029.m2786(c4);
                                }
                            }
                            break;
                        default:
                            DialogC0448t4 dialogC0448t4 = (DialogC0448t4) C0077.m7207(c0408n);
                            C0072.m6111(dialogC0448t4);
                            Activity activityM73702 = C0078.m7370(C0028.m2666());
                            int i2 = C0063.m4346()[C0030.m2893(C0066.m4852(scriptRecordBean))];
                            if (i2 == 1 || i2 == 2) {
                                if (activityM73702 != null) {
                                    DialogC0389j4 dialogC0389j42 = new DialogC0389j4(activityM73702, C0066.m4852(scriptRecordBean), C0020.m1375(scriptRecordBean), iM6794);
                                    dialogC0389j42.v = new C0479z(c0408n, dialogC0389j42, 8);
                                    C0029.m2786(dialogC0389j42);
                                }
                            } else if (i2 == 3 || i2 == 4) {
                                List list2 = (List) C0072.m6209(C0025.m2173(C0021.m1532(dialogC0448t4)));
                                if (activityM73702 != null) {
                                    C4 c42 = new C4(activityM73702, list2, C0066.m4852(scriptRecordBean), C0067.m5439(scriptRecordBean), iM6794);
                                    ScriptProjectBean scriptProjectBeanM6525 = C0074.m6525(dialogC0448t4);
                                    c42.N = new ScriptProjectAliasBean(C0073.m6309(scriptProjectBeanM6525), C0021.m1527(scriptProjectBeanM6525));
                                    c42.E = new C0479z(c0408n, c42, 9);
                                    C0029.m2786(c42);
                                }
                            }
                            break;
                    }
                }
                break;
            default:
                T tM3281 = C0033.m3281((C0413n4) C0067.m5428(this));
                if (tM3281 != null) {
                    C0033.m3365(tM3281, C0075.m6794(this), (String) C0035.m3528(this));
                }
                break;
        }
    }
}
