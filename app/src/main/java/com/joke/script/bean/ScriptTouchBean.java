package com.joke.script.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptTouchBean implements Serializable {
    public int action;
    public long interval;
    public int metaState;
    public float rawX;
    public float rawY;
    public float x;
    public float y;

    public ScriptTouchBean() {
    }

    public ScriptTouchBean(int i, float f, float f2, float f3, float f4, long j, int i2) {
        this.action = i;
        this.rawX = f;
        this.rawY = f2;
        this.x = f3;
        this.y = f4;
        this.interval = j;
        this.metaState = i2;
    }
}
