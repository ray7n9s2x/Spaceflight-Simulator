package com.joke.connectdevice.bean;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0032;
import com.joke.basetoollib.C0063;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AutoClickContentBean {
    private int loopInterval = 1000;
    private int loopNum;
    private String planName;
    private List<AutoClickPointerBean> pointerList;
    private int screenPixelHeight;
    private int screenPixelWidth;

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4459(Object obj) {
        if (C0063.m4427() > 0) {
            return ((AutoClickContentBean) obj).screenPixelWidth;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4460(Object obj) {
        if (C0020.m1385() < 0) {
            return ((AutoClickContentBean) obj).planName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static List m4461(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((AutoClickContentBean) obj).pointerList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۧ, reason: contains not printable characters */
    public static int m4462(Object obj) {
        if (C0032.m3184() < 0) {
            return ((AutoClickContentBean) obj).screenPixelHeight;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦ۟ۦ, reason: contains not printable characters */
    public static int m4463(Object obj) {
        if (C0078.m7450() > 0) {
            return ((AutoClickContentBean) obj).loopInterval;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static int m4464(Object obj) {
        if (C0028.m2593() >= 0) {
            return ((AutoClickContentBean) obj).loopNum;
        }
        return 0;
    }

    public int getLoopInterval() {
        return m4463(this);
    }

    public int getLoopNum() {
        return m4464(this);
    }

    public String getPlanName() {
        return m4460(this);
    }

    public List<AutoClickPointerBean> getPointerList() {
        return m4461(this);
    }

    public int getScreenPixelHeight() {
        return m4462(this);
    }

    public int getScreenPixelWidth() {
        return m4459(this);
    }

    public void setLoopInterval(int i) {
        this.loopInterval = i;
    }

    public void setLoopNum(int i) {
        this.loopNum = i;
    }

    public void setPlanName(String str) {
        this.planName = str;
    }

    public void setPointerList(List<AutoClickPointerBean> list) {
        this.pointerList = list;
    }

    public void setScreenPixelHeight(int i) {
        this.screenPixelHeight = i;
    }

    public void setScreenPixelWidth(int i) {
        this.screenPixelWidth = i;
    }
}
