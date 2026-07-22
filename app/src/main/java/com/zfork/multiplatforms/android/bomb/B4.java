package com.zfork.multiplatforms.android.bomb;

import android.widget.TextView;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.MatchType;
import com.joke.script.bean.ScriptJumpBean;
import com.joke.script.bean.ScriptProjectAliasBean;

/* JADX INFO: loaded from: classes3.dex */
public final class B4 implements InterfaceC0401l4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MatchType b;
    public final /* synthetic */ C4 c;

    public /* synthetic */ B4(C4 c4, MatchType matchType, int i) {
        this.a = i;
        this.c = c4;
        this.b = matchType;
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0401l4
    public final void c(int i, String str) {
        switch (C0068.m5599(this)) {
            case 0:
                C4 c4M1697 = C0022.m1697(this);
                TextView textViewM1296 = C0019.m1296(c4M1697);
                MatchType matchTypeM6107 = C0072.m6107(this);
                C0019.m1180(textViewM1296, C0070.m5941(matchTypeM6107));
                if (matchTypeM6107 == C0032.m3242()) {
                    C0063.m4382(C0034.m3457(c4M1697), 0);
                    C0019.m1180(C0034.m3457(c4M1697), str);
                    ScriptJumpBean scriptJumpBean = new ScriptJumpBean();
                    scriptJumpBean.scriptActionIndex = i;
                    c4M1697.K = scriptJumpBean;
                } else {
                    ScriptJumpBean scriptJumpBean2 = new ScriptJumpBean();
                    scriptJumpBean2.scriptProjectId = C0036.m3674((ScriptProjectAliasBean) C0071.m6078(C0069.m5730(C0027.m2454(c4M1697)), i));
                    c4M1697.K = scriptJumpBean2;
                }
                C0029.m2786(c4M1697);
                break;
            case 1:
                C4 c4M16972 = C0022.m1697(this);
                TextView textViewM1731 = C0022.m1731(c4M16972);
                MatchType matchTypeM61072 = C0072.m6107(this);
                C0019.m1180(textViewM1731, C0070.m5941(matchTypeM61072));
                ScriptJumpBean scriptJumpBean3 = new ScriptJumpBean();
                if (matchTypeM61072 == C0032.m3242()) {
                    scriptJumpBean3.scriptActionIndex = i;
                } else {
                    scriptJumpBean3.scriptProjectId = C0036.m3674((ScriptProjectAliasBean) C0071.m6078(C0069.m5730(C0027.m2454(c4M16972)), i));
                }
                c4M16972.L = scriptJumpBean3;
                C0029.m2786(c4M16972);
                break;
            default:
                C4 c4M16973 = C0022.m1697(this);
                TextView textViewM4381 = C0063.m4381(c4M16973);
                MatchType matchTypeM61073 = C0072.m6107(this);
                C0019.m1180(textViewM4381, C0070.m5941(matchTypeM61073));
                ScriptJumpBean scriptJumpBean4 = new ScriptJumpBean();
                if (matchTypeM61073 == C0032.m3242()) {
                    scriptJumpBean4.scriptActionIndex = i;
                } else {
                    scriptJumpBean4.scriptProjectId = C0036.m3674((ScriptProjectAliasBean) C0071.m6078(C0069.m5730(C0027.m2454(c4M16973)), i));
                }
                c4M16973.M = scriptJumpBean4;
                C0029.m2786(c4M16973);
                break;
        }
    }

    @Override // com.zfork.multiplatforms.android.bomb.InterfaceC0401l4
    public final void cancel() {
        switch (C0068.m5599(this)) {
            case 0:
                C4 c4M1697 = C0022.m1697(this);
                ScriptJumpBean scriptJumpBeanM6084 = C0071.m6084(c4M1697);
                if (scriptJumpBeanM6084 != null && C0016.m617(scriptJumpBeanM6084) >= 0) {
                    C0063.m4382(C0034.m3457(c4M1697), 0);
                }
                C0029.m2786(c4M1697);
                break;
            case 1:
                C0029.m2786(C0022.m1697(this));
                break;
            default:
                C0029.m2786(C0022.m1697(this));
                break;
        }
    }
}
