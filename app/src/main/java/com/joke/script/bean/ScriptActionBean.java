package com.joke.script.bean;

import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.util.C0031;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptActionBean implements Serializable {
    public List<Integer> delay;
    public long duration;
    public List<Integer> interval;
    public ArrayList<ScriptTouchBean> pointList;
    public int shifting;
    public long startMs;
    public String name = C0031.m2993();
    public int count = 1;

    public ScriptActionBean() {
        Integer numM1548 = C0021.m1548(100);
        Integer numM15482 = C0021.m1548(150);
        this.interval = C0021.m1596(new Integer[]{numM1548, numM15482});
        this.duration = 10L;
        this.delay = C0021.m1596(new Integer[]{numM1548, numM15482});
        this.startMs = 0L;
        this.shifting = 5;
        this.pointList = new ArrayList<>();
    }
}
