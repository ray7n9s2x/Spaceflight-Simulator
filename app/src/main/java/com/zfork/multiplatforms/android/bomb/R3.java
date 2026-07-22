package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Message;
import android.view.View;
import com.android.apksig.C0037;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.ScriptRecordType;
import com.joke.script.bean.ScriptTouchBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R3 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f277short = {660, 659, 646, 659, 658, 660, 696, 645, 646, 661, 696, 655, 642, 654, 640, 655, 659, 827, 822, 818, 826, 817, 2132, 2139, 2129, 2119, 2138, 2140, 2129};
    public final /* synthetic */ int a;
    public final /* synthetic */ U3 b;

    public /* synthetic */ R3(U3 u3, int i) {
        this.a = i;
        this.b = u3;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7001() {
        if (C0016.m717() <= 0) {
            return f277short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (C0075.m6852(this)) {
            case 0:
                U3 u3M4740 = C0065.m4740(this);
                u3M4740.w = true;
                C0064.m4570(C0022.m1771(u3M4740));
                C0037.m3851(u3M4740);
                u3M4740.y = true;
                C0063.m4382(C0034.m3468(u3M4740), 8);
                Z4 z4M4451 = C0063.m4451(u3M4740);
                ScriptRecordType scriptRecordTypeM6020 = C0071.m6020(u3M4740);
                C0030.m2951(z4M4451);
                if (C0021.m1573() != scriptRecordTypeM6020 && C0067.m5437() != scriptRecordTypeM6020) {
                    C0064.m4570(C0039.m4186(z4M4451));
                    C0037.m3920(C0064.m4618(), z4M4451);
                }
                break;
            case 1:
                U3 u3M47402 = C0065.m4740(this);
                C0030.m2951(u3M47402);
                int i5 = C0035.m3608()[C0030.m2893(C0071.m6020(u3M47402))];
                if (i5 == 1 || i5 == 2) {
                    ArrayList arrayListM1771 = C0022.m1771(u3M47402);
                    if (C0018.m1084(arrayListM1771) > 0) {
                        ScriptTouchBean scriptTouchBean = (ScriptTouchBean) C0064.m4526(arrayListM1771, 0);
                        ScriptTouchBean scriptTouchBean2 = (ScriptTouchBean) C0064.m4526(arrayListM1771, C0018.m1084(arrayListM1771) - 1);
                        int iM3091 = (int) C0031.m3091(C0065.m4773(scriptTouchBean), C0065.m4773(scriptTouchBean2));
                        int iM30912 = (int) C0031.m3091(C0111.m13158(scriptTouchBean), C0111.m13158(scriptTouchBean2));
                        int iM1735 = (int) C0022.m1735(C0065.m4773(scriptTouchBean), C0065.m4773(scriptTouchBean2));
                        int iM17352 = (int) C0022.m1735(C0111.m13158(scriptTouchBean), C0111.m13158(scriptTouchBean2));
                        Activity activityM3606 = C0035.m3606(u3M47402);
                        int iM3880 = C0037.m3880(C0029.m2720(activityM3606), C0068.m5544(m7001(), 0, 17, 743), C0063.m4315(m7001(), 17, 5, 863), C0068.m5544(m7001(), 22, 7, 2101));
                        int iM3413 = iM3880 > 0 ? C0034.m3413(C0029.m2720(activityM3606), iM3880) : 0;
                        float fM614 = C0016.m614(u3M47402);
                        float fM4086 = C0039.m4086(u3M47402);
                        if (fM614 > fM4086) {
                            float f = iM3091;
                            float f2 = iM3413;
                            i3 = ((int) (f - ((f / fM614) * f2))) - 10;
                            float f3 = iM1735;
                            i4 = ((int) (f3 - ((f3 / fM614) * f2))) + 10;
                            i = iM30912 - 10;
                            i2 = iM17352 + 10;
                        } else {
                            float f4 = iM30912;
                            float f5 = iM3413;
                            i = ((int) (f4 - ((f4 / fM4086) * f5))) - 10;
                            float f6 = iM17352;
                            i2 = ((int) (f6 - ((f6 / fM4086) * f5))) + 10;
                            i3 = iM3091 - 10;
                            i4 = iM1735 + 10;
                        }
                        if (C0072.m6178(u3M47402) != null) {
                            new Rect(i3, i, i4, i2);
                        }
                    } else {
                        T3 t3M6178 = C0072.m6178(u3M47402);
                        if (t3M6178 != null) {
                            C0361f2 c0361f2M3197 = C0032.m3197((C0333b2) t3M6178);
                            C0063.m4382(c0361f2M3197, 0);
                            Message messageM1951 = C0024.m1951();
                            messageM1951.obj = C0023.m1844();
                            C0069.m5762(C0030.m2911(c0361f2M3197), messageM1951);
                            C0034.m3430(c0361f2M3197, C0021.m1573());
                        }
                    }
                }
                u3M47402.w = true;
                C0064.m4570(C0022.m1771(u3M47402));
                C0037.m3851(u3M47402);
                u3M47402.y = true;
                u3M47402.e = true;
                C0063.m4382(C0034.m3468(u3M47402), 8);
                Z4 z4M44512 = C0063.m4451(u3M47402);
                ScriptRecordType scriptRecordTypeM60202 = C0071.m6020(u3M47402);
                C0030.m2951(z4M44512);
                if (C0021.m1573() != scriptRecordTypeM60202 && C0067.m5437() != scriptRecordTypeM60202) {
                    C0064.m4570(C0039.m4186(z4M44512));
                    C0037.m3920(C0064.m4618(), z4M44512);
                }
                break;
            default:
                U3 u3M47403 = C0065.m4740(this);
                u3M47403.w = true;
                C0064.m4570(C0022.m1771(u3M47403));
                C0037.m3851(u3M47403);
                C0063.m4382(C0034.m3468(u3M47403), 8);
                T3 t3M61782 = C0072.m6178(u3M47403);
                if (t3M61782 != null) {
                    C0361f2 c0361f2M31972 = C0032.m3197((C0333b2) t3M61782);
                    C0063.m4382(c0361f2M31972, 0);
                    Message messageM19512 = C0024.m1951();
                    messageM19512.obj = C0023.m1844();
                    C0069.m5762(C0030.m2911(c0361f2M31972), messageM19512);
                    C0034.m3430(c0361f2M31972, C0021.m1573());
                }
                break;
        }
    }
}
