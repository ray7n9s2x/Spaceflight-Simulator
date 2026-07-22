package com.joke.script.bean;

import android.graphics.Rect;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptLocalBean {
    private Rect rect;
    private String text;

    /* JADX INFO: renamed from: ۟۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static Rect m6441(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((ScriptLocalBean) obj).rect;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static String m6442(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((ScriptLocalBean) obj).text;
        }
        return null;
    }

    public Rect getRect() {
        return m6441(this);
    }

    public String getText() {
        return m6442(this);
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    public void setText(String str) {
        this.text = str;
    }
}
