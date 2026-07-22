package com.zfork.multiplatforms.android.bomb;

import android.app.Activity;
import android.view.View;
import android.widget.BaseAdapter;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptProjectAliasBean;
import com.joke.script.bean.ScriptRecordBean;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0349d4 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f313short = {738, 675, 743, 738, 692, 988, 972, 989, 966, 991, 987, 1008, 966, 972, 1008, 988, 991, 966, 961, 961, 970, 989, 1008, 971, 960, 984, 961};
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ BaseAdapter c;

    public /* synthetic */ ViewOnClickListenerC0349d4(C0370g4 c0370g4, int i) {
        this.c = c0370g4;
        this.b = i;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۥ, reason: contains not printable characters */
    public static short[] m7042() {
        if (C0019.m1311() <= 0) {
            return f313short;
        }
        return null;
    }

    public /* synthetic */ ViewOnClickListenerC0349d4(C0370g4 c0370g4, ScriptRecordBean scriptRecordBean, int i) {
        this.c = c0370g4;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM617;
        int iM6172;
        int iM6173;
        int iM5695 = C0069.m5695(this);
        BaseAdapter baseAdapterM4360 = C0063.m4360(this);
        String strM5991 = C0071.m5991(m7042(), 0, 5, 711);
        int i = -1;
        int i2 = 2;
        String strM7205 = C0077.m7205(m7042(), 5, 22, 943);
        int i3 = 0;
        int i4 = 1;
        switch (C0022.m1720(this)) {
            case 0:
                C0408n c0408n = (C0408n) C0023.m1842((C0370g4) baseAdapterM4360);
                if (c0408n != null) {
                    switch (C0070.m5881(c0408n)) {
                        case 5:
                            DialogC0331b0 dialogC0331b0 = (DialogC0331b0) C0077.m7207(c0408n);
                            List listM2173 = C0025.m2173((C0370g4) C0074.m6579(dialogC0331b0));
                            C0037.m3901(listM2173, iM5695);
                            C0370g4 c0370g4 = (C0370g4) C0074.m6579(dialogC0331b0);
                            c0370g4.b = listM2173;
                            C0071.m6031(c0370g4);
                            break;
                        default:
                            DialogC0448t4 dialogC0448t4 = (DialogC0448t4) C0077.m7207(c0408n);
                            List listM21732 = C0025.m2173(C0021.m1532(dialogC0448t4));
                            C0037.m3901(listM21732, iM5695);
                            C0370g4 c0370g4M1532 = C0021.m1532(dialogC0448t4);
                            c0370g4M1532.b = listM21732;
                            C0071.m6031(c0370g4M1532);
                            break;
                    }
                }
                break;
            default:
                C0370g4 c0370g42 = (C0370g4) baseAdapterM4360;
                A4 a4 = (A4) C0023.m1842(c0370g42);
                if (a4 != null) {
                    MatchType matchType = (MatchType) C0071.m6078(C0025.m2173(c0370g42), iM5695);
                    switch (C0039.m4119(a4)) {
                        case 0:
                            C4 c4M1867 = C0023.m1867(a4);
                            C0027.m2441(C0024.m1953(c4M1867), false);
                            C0039.m4187(C0068.m5579(c4M1867), C0071.m6091(strM7205));
                            C0063.m4382(C0032.m3163(c4M1867), 8);
                            c4M1867.F = matchType;
                            C0019.m1180(C0069.m5802(c4M1867), C0070.m5941(matchType));
                            break;
                        case 1:
                            C4 c4M18672 = C0023.m1867(a4);
                            C0027.m2441(C0028.m2599(c4M18672), false);
                            C0039.m4187(C0073.m6319(c4M18672), C0071.m6091(strM7205));
                            C0063.m4382(C0036.m3767(c4M18672), 8);
                            c4M18672.G = matchType;
                            C0063.m4382(C0034.m3457(c4M18672), 8);
                            MatchType matchTypeM3242 = C0032.m3242();
                            if (matchType == matchTypeM3242 || matchType == C0028.m2536()) {
                                C0072.m6111(c4M18672);
                                ArrayList arrayList = new ArrayList();
                                if (matchType == matchTypeM3242) {
                                    List listM3308 = C0033.m3308(C0067.m5412(c4M18672), 0, C0021.m1567(c4M18672));
                                    int i5 = 0;
                                    while (i5 < C0034.m3427(listM3308)) {
                                        ScriptRecordBean scriptRecordBean = (ScriptRecordBean) C0071.m6078(listM3308, i5);
                                        i5++;
                                        C0017.m919(arrayList, C0021.m1531(strM5991, new Object[]{C0021.m1548(i5), C0071.m5975(C0066.m4852(scriptRecordBean))}));
                                    }
                                    ScriptJumpBean scriptJumpBeanM6084 = C0071.m6084(c4M18672);
                                    if (scriptJumpBeanM6084 != null && (iM617 = C0016.m617(scriptJumpBeanM6084)) >= 0) {
                                        i = iM617;
                                    }
                                } else {
                                    List listM5730 = C0069.m5730(C0027.m2454(c4M18672));
                                    ScriptProjectAliasBean scriptProjectAliasBeanM4013 = C0038.m4013(c4M18672);
                                    if (scriptProjectAliasBeanM4013 != null) {
                                        C0036.m3765(listM5730, scriptProjectAliasBeanM4013);
                                    }
                                    for (int i6 = 0; i6 < C0034.m3427(listM5730); i6++) {
                                        ScriptProjectAliasBean scriptProjectAliasBean = (ScriptProjectAliasBean) C0071.m6078(listM5730, i6);
                                        C0017.m919(arrayList, C0021.m1617(scriptProjectAliasBean));
                                        ScriptJumpBean scriptJumpBeanM60842 = C0071.m6084(c4M18672);
                                        if (scriptJumpBeanM60842 != null && C0073.m6313(scriptJumpBeanM60842) == C0036.m3674(scriptProjectAliasBean)) {
                                            i = i6;
                                        }
                                    }
                                }
                                int i7 = i;
                                Activity activityM7370 = C0078.m7370(C0028.m2666());
                                if (activityM7370 != null) {
                                    C0029.m2786(new DialogC0419o4(activityM7370, arrayList, i7, matchType, new B4(c4M18672, matchType, i3)));
                                }
                            } else {
                                C0019.m1180(C0019.m1296(c4M18672), C0070.m5941(matchType));
                                c4M18672.K = null;
                            }
                            break;
                        case 2:
                            C4 c4M18673 = C0023.m1867(a4);
                            C0027.m2441(C0025.m2168(c4M18673), false);
                            C0039.m4187(C0039.m4175(c4M18673), C0071.m6091(strM7205));
                            C0063.m4382(C0020.m1453(c4M18673), 8);
                            c4M18673.H = matchType;
                            MatchType matchTypeM32422 = C0032.m3242();
                            if (matchType == matchTypeM32422 || matchType == C0028.m2536()) {
                                C0072.m6111(c4M18673);
                                ArrayList arrayList2 = new ArrayList();
                                if (matchType == matchTypeM32422) {
                                    List listM33082 = C0033.m3308(C0067.m5412(c4M18673), 0, C0021.m1567(c4M18673));
                                    int i8 = 0;
                                    while (i8 < C0034.m3427(listM33082)) {
                                        ScriptRecordBean scriptRecordBean2 = (ScriptRecordBean) C0071.m6078(listM33082, i8);
                                        i8++;
                                        C0017.m919(arrayList2, C0021.m1531(strM5991, new Object[]{C0021.m1548(i8), C0071.m5975(C0066.m4852(scriptRecordBean2))}));
                                    }
                                    ScriptJumpBean scriptJumpBeanM1438 = C0020.m1438(c4M18673);
                                    if (scriptJumpBeanM1438 != null && (iM6172 = C0016.m617(scriptJumpBeanM1438)) >= 0) {
                                        i = iM6172;
                                    }
                                } else {
                                    List listM57302 = C0069.m5730(C0027.m2454(c4M18673));
                                    ScriptProjectAliasBean scriptProjectAliasBeanM40132 = C0038.m4013(c4M18673);
                                    if (scriptProjectAliasBeanM40132 != null) {
                                        C0036.m3765(listM57302, scriptProjectAliasBeanM40132);
                                    }
                                    while (i3 < C0034.m3427(listM57302)) {
                                        ScriptProjectAliasBean scriptProjectAliasBean2 = (ScriptProjectAliasBean) C0071.m6078(listM57302, i3);
                                        C0017.m919(arrayList2, C0021.m1617(scriptProjectAliasBean2));
                                        ScriptJumpBean scriptJumpBeanM14382 = C0020.m1438(c4M18673);
                                        if (scriptJumpBeanM14382 != null && C0073.m6313(scriptJumpBeanM14382) == C0036.m3674(scriptProjectAliasBean2)) {
                                            i = i3;
                                        }
                                        i3++;
                                    }
                                }
                                int i9 = i;
                                Activity activityM73702 = C0078.m7370(C0028.m2666());
                                if (activityM73702 != null) {
                                    C0029.m2786(new DialogC0419o4(activityM73702, arrayList2, i9, matchType, new B4(c4M18673, matchType, i4)));
                                }
                            } else {
                                C0019.m1180(C0022.m1731(c4M18673), C0070.m5941(matchType));
                                c4M18673.L = null;
                            }
                            break;
                        default:
                            C4 c4M18674 = C0023.m1867(a4);
                            C0027.m2441(C0024.m2049(c4M18674), false);
                            C0039.m4187(C0111.m13138(c4M18674), C0071.m6091(strM7205));
                            C0063.m4382(C0019.m1310(c4M18674), 8);
                            c4M18674.I = matchType;
                            MatchType matchTypeM32423 = C0032.m3242();
                            if (matchType == matchTypeM32423 || matchType == C0028.m2536()) {
                                C0072.m6111(c4M18674);
                                ArrayList arrayList3 = new ArrayList();
                                if (matchType == matchTypeM32423) {
                                    List listM33083 = C0033.m3308(C0067.m5412(c4M18674), 0, C0021.m1567(c4M18674));
                                    int i10 = 0;
                                    while (i10 < C0034.m3427(listM33083)) {
                                        ScriptRecordBean scriptRecordBean3 = (ScriptRecordBean) C0071.m6078(listM33083, i10);
                                        i10++;
                                        C0017.m919(arrayList3, C0021.m1531(strM5991, new Object[]{C0021.m1548(i10), C0071.m5975(C0066.m4852(scriptRecordBean3))}));
                                    }
                                    ScriptJumpBean scriptJumpBeanM7256 = C0077.m7256(c4M18674);
                                    if (scriptJumpBeanM7256 != null && (iM6173 = C0016.m617(scriptJumpBeanM7256)) >= 0) {
                                        i = iM6173;
                                    }
                                } else {
                                    List listM57303 = C0069.m5730(C0027.m2454(c4M18674));
                                    ScriptProjectAliasBean scriptProjectAliasBeanM40133 = C0038.m4013(c4M18674);
                                    if (scriptProjectAliasBeanM40133 != null) {
                                        C0036.m3765(listM57303, scriptProjectAliasBeanM40133);
                                    }
                                    while (i3 < C0034.m3427(listM57303)) {
                                        ScriptProjectAliasBean scriptProjectAliasBean3 = (ScriptProjectAliasBean) C0071.m6078(listM57303, i3);
                                        C0017.m919(arrayList3, C0021.m1617(scriptProjectAliasBean3));
                                        ScriptJumpBean scriptJumpBeanM72562 = C0077.m7256(c4M18674);
                                        if (scriptJumpBeanM72562 != null && C0073.m6313(scriptJumpBeanM72562) == C0036.m3674(scriptProjectAliasBean3)) {
                                            i = i3;
                                        }
                                        i3++;
                                    }
                                }
                                int i11 = i;
                                Activity activityM73703 = C0078.m7370(C0028.m2666());
                                if (activityM73703 != null) {
                                    C0029.m2786(new DialogC0419o4(activityM73703, arrayList3, i11, matchType, new B4(c4M18674, matchType, i2)));
                                }
                            } else {
                                C0019.m1180(C0063.m4381(c4M18674), C0070.m5941(matchType));
                                c4M18674.M = null;
                            }
                            break;
                    }
                }
                break;
        }
    }
}
