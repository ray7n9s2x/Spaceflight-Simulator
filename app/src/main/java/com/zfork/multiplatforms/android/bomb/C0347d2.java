package com.zfork.multiplatforms.android.bomb;

import android.os.Message;
import android.view.KeyEvent;
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
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
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
import com.joke.script.bean.ScriptMatchBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptProjectBean;
import com.joke.script.bean.ScriptRecordBean;
import com.zfork.entry.C0075;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0347d2 extends AbstractViewOnClickListenerC0465w3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f311short = {260, 296, 317, 298, 289, 288, 295, 302, 361, 298, 294, 295, 317, 300, 295, 317, 361, 298, 296, 295, 295, 294, 317, 361, 299, 300, 361, 300, 292, 313, 317, 304};
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ C0347d2(KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7040() {
        if (C0025.m2132() >= 0) {
            return f311short;
        }
        return null;
    }

    @Override // com.zfork.multiplatforms.android.bomb.AbstractViewOnClickListenerC0465w3
    public final void a() {
        String strM2993 = C0031.m2993();
        switch (C0019.m1260(this)) {
            case 0:
                C0361f2 c0361f2 = (C0361f2) C0026.m2314(this);
                if (C0030.m2868(c0361f2) != C0073.m6418()) {
                    Message messageM1951 = C0024.m1951();
                    messageM1951.obj = C0074.m6446();
                    C0069.m5762(C0030.m2911(c0361f2), messageM1951);
                    C0077.m7300(c0361f2);
                    if (C0018.m1084(C0039.m4155(c0361f2)) > 0) {
                        C0030.m2950(c0361f2, new ScriptProjectBean(C0022.m1755(c0361f2), strM2993, C0039.m4155(c0361f2)), new C0324a0(7, this));
                    }
                    if (C0074.m6539(c0361f2) != null) {
                        C0408n c0408nM6120 = C0072.m6120();
                        C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
                        if (c0408n != null) {
                            C0037.m3799(c0408n, true);
                            C0071.m5989((C0408n) C0077.m7207(c0408nM6120), 0, 0);
                        }
                        C0063.m4382(C0031.m3080(c0361f2), 8);
                        C0063.m4382(C0074.m6539(c0361f2), 0);
                    }
                }
                break;
            case 1:
                DialogC0389j4 dialogC0389j4 = (DialogC0389j4) C0026.m2314(this);
                C0068.m5645(dialogC0389j4).name = C0023.m1802(C0074.m6524(C0075.m6801(C0066.m4897(dialogC0389j4))));
                C0068.m5645(dialogC0389j4).count = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0033.m3325(dialogC0389j4)))));
                int iM4116 = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0111.m13135(dialogC0389j4)))));
                int iM41162 = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0016.m648(dialogC0389j4)))));
                ArrayList arrayList = new ArrayList();
                C0017.m919(arrayList, C0021.m1548(iM4116));
                C0017.m919(arrayList, C0021.m1548(iM41162));
                ScriptActionBean scriptActionBeanM5645 = C0068.m5645(dialogC0389j4);
                scriptActionBeanM5645.interval = arrayList;
                scriptActionBeanM5645.duration = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0038.m4021(dialogC0389j4)))));
                int iM41163 = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0022.m1747(dialogC0389j4)))));
                int iM41164 = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0068.m5566(dialogC0389j4)))));
                ArrayList arrayList2 = new ArrayList();
                C0017.m919(arrayList2, C0021.m1548(iM41163));
                C0017.m919(arrayList2, C0021.m1548(iM41164));
                ScriptActionBean scriptActionBeanM56452 = C0068.m5645(dialogC0389j4);
                scriptActionBeanM56452.delay = arrayList2;
                scriptActionBeanM56452.shifting = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0073.m6326(dialogC0389j4)))));
                C0479z c0479zM2894 = C0030.m2894(dialogC0389j4);
                if (c0479zM2894 != null) {
                    C0069.m5726(c0479zM2894, C0038.m3963(dialogC0389j4), new ScriptRecordBean(C0064.m4577(dialogC0389j4), C0068.m5645(dialogC0389j4)));
                }
                break;
            case 2:
                DialogC0448t4 dialogC0448t4 = (DialogC0448t4) C0026.m2314(this);
                C0408n c0408nM2650 = C0028.m2650(dialogC0448t4);
                if (c0408nM2650 != null) {
                    int iM5858 = C0070.m5858(dialogC0448t4);
                    ScriptProjectBean scriptProjectBeanM6525 = C0074.m6525(dialogC0448t4);
                    C0408n c0408nM61202 = C0072.m6120();
                    if (((C0408n) C0077.m7207(c0408nM61202)) != null) {
                        C0063.m4382(C0022.m1686(), 0);
                        C0037.m3799((C0408n) C0077.m7207(c0408nM61202), true);
                    }
                    C0070.m5957();
                    C0381i2 c0381i2 = (C0381i2) C0077.m7207(c0408nM2650);
                    List listM2173 = C0025.m2173(C0024.m1983(c0381i2));
                    C0037.m3901(listM2173, iM5858);
                    C0017.m930(listM2173, iM5858, new ScriptProjectAliasBean(C0073.m6309(scriptProjectBeanM6525), C0021.m1527(scriptProjectBeanM6525)));
                    C0063.m4313(C0022.m1755(c0381i2), scriptProjectBeanM6525);
                    C0071.m6031(C0024.m1983(c0381i2));
                    C0020.m1338(C0070.m5854(c0381i2));
                }
                break;
            case 3:
                DialogC0472x4 dialogC0472x4 = (DialogC0472x4) C0026.m2314(this);
                C0070.m5909(dialogC0472x4).projectName = C0023.m1802(C0074.m6524(C0075.m6801(C0071.m6034(dialogC0472x4))));
                String strM1802 = C0023.m1802(C0074.m6524(C0075.m6801(C0073.m6410(dialogC0472x4))));
                if (C0038.m3939(strM1802)) {
                    C0070.m5909(dialogC0472x4).count = 0;
                } else {
                    C0070.m5909(dialogC0472x4).count = C0039.m4116(strM1802);
                }
                String strM18022 = C0023.m1802(C0074.m6524(C0075.m6801(C0022.m1778(dialogC0472x4))));
                String strM18023 = C0023.m1802(C0074.m6524(C0075.m6801(C0073.m6440(dialogC0472x4))));
                int iM41165 = C0039.m4116(strM18022);
                int iM41166 = C0039.m4116(strM18023);
                ArrayList arrayList3 = new ArrayList();
                C0017.m919(arrayList3, C0021.m1548(iM41165));
                C0017.m919(arrayList3, C0021.m1548(iM41166));
                ScriptProjectBean scriptProjectBeanM5909 = C0070.m5909(dialogC0472x4);
                scriptProjectBeanM5909.interval = arrayList3;
                InterfaceC0466w4 interfaceC0466w4M5450 = C0067.m5450(dialogC0472x4);
                if (interfaceC0466w4M5450 != null) {
                    C0077.m7238(interfaceC0466w4M5450, scriptProjectBeanM5909);
                }
                break;
            case 4:
                C4 c4 = (C4) C0026.m2314(this);
                C0063.m4437(c4).content = C0023.m1802(C0074.m6524(C0075.m6801(C0075.m6894(c4))));
                if (!C0038.m3939(C0077.m7265(C0063.m4437(c4)))) {
                    ScriptMatchBean scriptMatchBeanM4437 = C0063.m4437(c4);
                    scriptMatchBeanM4437.matchType = C0065.m4771(c4);
                    scriptMatchBeanM4437.duration = C0039.m4116(C0023.m1802(C0074.m6524(C0075.m6801(C0025.m2102(c4)))));
                    ScriptMatchBean scriptMatchBeanM44372 = C0063.m4437(c4);
                    scriptMatchBeanM44372.successType = C0030.m2870(c4);
                    scriptMatchBeanM44372.failType = C0063.m4430(c4);
                    scriptMatchBeanM44372.timeoutType = C0029.m2741(c4);
                    scriptMatchBeanM44372.successJump = C0071.m6084(c4);
                    C0479z c0479zM2105 = C0025.m2105(c4);
                    if (c0479zM2105 != null) {
                        C0069.m5726(c0479zM2105, C0021.m1567(c4), new ScriptRecordBean(C0034.m3495(c4), scriptMatchBeanM44372));
                    }
                } else {
                    C0030.m2968(C0023.m1884(C0027.m2454(c4), C0077.m7205(m7040(), 0, 32, 329), 0));
                }
                break;
            default:
                C0479z c0479zM2418 = C0027.m2418((D4) C0026.m2314(this));
                if (c0479zM2418 != null) {
                    Message messageM19512 = C0024.m1951();
                    messageM19512.obj = C0074.m6446();
                    C0340c2 c0340c2 = (C0340c2) C0064.m4580(c0479zM2418);
                    C0069.m5762(C0030.m2911(C0027.m2528(c0340c2)), messageM19512);
                    C0361f2 c0361f2M2528 = C0027.m2528(c0340c2);
                    C0077.m7300(c0361f2M2528);
                    C0030.m2950(c0361f2M2528, new ScriptProjectBean(C0022.m1755(c0361f2M2528), strM2993, C0039.m4155(c0361f2M2528)), new C0450u0(c0479zM2418, (D4) C0023.m1892(c0479zM2418), 5));
                }
                break;
        }
    }
}
