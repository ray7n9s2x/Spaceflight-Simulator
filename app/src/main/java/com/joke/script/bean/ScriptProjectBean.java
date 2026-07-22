package com.joke.script.bean;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.apksig.C0039;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptProjectBean implements Serializable {
    public int count;
    public int h;
    public long id;
    public List<Integer> interval;
    public String projectName;
    public List<ScriptRecordBean> recordList;
    public int w;

    public ScriptProjectBean() {
        this.id = 0L;
        this.projectName = C0031.m2993();
        this.count = 0;
        this.interval = C0021.m1596(new Integer[]{C0021.m1548(50), C0021.m1548(100)});
    }

    public ScriptProjectBean(Context context, String str, List<ScriptRecordBean> list) {
        this.id = 0L;
        this.projectName = C0031.m2993();
        this.count = 0;
        this.interval = C0021.m1596(new Integer[]{C0021.m1548(50), C0021.m1548(100)});
        this.projectName = str;
        this.recordList = list;
        DisplayMetrics displayMetricsM4797 = C0066.m4797(C0029.m2720(context));
        this.w = C0039.m4161(displayMetricsM4797);
        this.h = C0068.m5638(displayMetricsM4797);
    }
}
