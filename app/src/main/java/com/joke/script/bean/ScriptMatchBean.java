package com.joke.script.bean;

import android.graphics.Rect;
import com.android.apksig.C0037;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptMatchBean implements Serializable {
    public String content;
    public long duration;
    public ScriptJumpBean failJump;
    public MatchType failType;
    public MatchType matchType;
    public List<Integer> rect;
    public ScriptJumpBean successJump;
    public MatchType successType;
    public ScriptJumpBean timeoutJump;
    public MatchType timeoutType;

    public ScriptMatchBean(String str, Rect rect) {
        this.content = C0031.m2993();
        this.matchType = C0018.m986();
        this.duration = 5000L;
        this.successType = C0111.m13172();
        MatchType matchTypeM1894 = C0023.m1894();
        this.failType = matchTypeM1894;
        this.timeoutType = matchTypeM1894;
        this.content = str;
        ArrayList arrayList = new ArrayList();
        C0017.m919(arrayList, C0021.m1548(C0037.m3831(rect)));
        C0017.m919(arrayList, C0021.m1548(C0067.m5453(rect)));
        C0017.m919(arrayList, C0021.m1548(C0033.m3290(rect)));
        C0017.m919(arrayList, C0021.m1548(C0031.m3096(rect)));
        this.rect = arrayList;
    }

    public ScriptMatchBean() {
        this.content = C0031.m2993();
        this.matchType = C0018.m986();
        this.duration = 5000L;
        this.successType = C0111.m13172();
        MatchType matchTypeM1894 = C0023.m1894();
        this.failType = matchTypeM1894;
        this.timeoutType = matchTypeM1894;
    }
}
