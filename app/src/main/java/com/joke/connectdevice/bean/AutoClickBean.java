package com.joke.connectdevice.bean;

import com.android.apksig.apk.C0016;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.reflect.C0071;

/* JADX INFO: loaded from: classes3.dex */
public class AutoClickBean {
    private long id;
    private String planContent;
    private String planName;
    private int resolutionHeight;
    private int resolutionWidth;

    /* JADX INFO: renamed from: ۟۠ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4454(Object obj) {
        if (C0016.m717() <= 0) {
            return ((AutoClickBean) obj).planName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static long m4455(Object obj) {
        if (C0030.m2940() > 0) {
            return ((AutoClickBean) obj).id;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4456(Object obj) {
        if (C0071.m6069() >= 0) {
            return ((AutoClickBean) obj).planContent;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4457(Object obj) {
        if (C0066.m4827() > 0) {
            return ((AutoClickBean) obj).resolutionHeight;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4458(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((AutoClickBean) obj).resolutionWidth;
        }
        return 0;
    }

    public long getId() {
        return m4455(this);
    }

    public String getPlanContent() {
        return m4456(this);
    }

    public String getPlanName() {
        return m4454(this);
    }

    public int getResolutionHeight() {
        return m4457(this);
    }

    public int getResolutionWidth() {
        return m4458(this);
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setPlanContent(String str) {
        this.planContent = str;
    }

    public void setPlanName(String str) {
        this.planName = str;
    }

    public void setResolutionHeight(int i) {
        this.resolutionHeight = i;
    }

    public void setResolutionWidth(int i) {
        this.resolutionWidth = i;
    }
}
