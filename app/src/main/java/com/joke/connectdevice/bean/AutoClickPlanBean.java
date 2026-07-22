package com.joke.connectdevice.bean;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import com.zfork.multiplatforms.android.bomb.T1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AutoClickPlanBean {
    private long id;
    private transient boolean isChecked;
    private transient String jsonRemark;
    private int loopInterval = 1000;
    private int loopNum;
    private transient List<T1> mPointerViewList;
    private String planName;

    /* JADX INFO: renamed from: ۟۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4465(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((AutoClickPlanBean) obj).loopNum;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m4466(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((AutoClickPlanBean) obj).mPointerViewList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4467(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((AutoClickPlanBean) obj).loopInterval;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4468(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((AutoClickPlanBean) obj).jsonRemark;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4469(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((AutoClickPlanBean) obj).planName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠۠, reason: not valid java name and contains not printable characters */
    public static long m4470(Object obj) {
        if (C0037.m3837() < 0) {
            return ((AutoClickPlanBean) obj).id;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4471(Object obj) {
        if (C0069.m5781() <= 0) {
            return ((AutoClickPlanBean) obj).isChecked;
        }
        return false;
    }

    public void addPointerView(T1 t1) {
        if (t1 == null) {
            return;
        }
        if (m4466(this) == null) {
            this.mPointerViewList = new ArrayList();
        }
        C0077.m7162(m4466(this), t1);
    }

    public long getId() {
        return m4470(this);
    }

    public String getJsonRemark() {
        return m4468(this);
    }

    public int getLoopInterval() {
        return m4467(this);
    }

    public int getLoopNum() {
        return m4465(this);
    }

    public String getPlanName() {
        return m4469(this);
    }

    public List<AutoClickPointerBean> getPointerBeanList() {
        if (m4466(this) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < C0034.m3427(m4466(this)); i++) {
            T1 t1 = (T1) C0071.m6078(m4466(this), i);
            if (C0065.m4770(t1) == null) {
                t1.g = new AutoClickPointerBean();
            }
            C0017.m919(arrayList, C0065.m4770(t1));
        }
        return arrayList;
    }

    public List<T1> getPointerViewList() {
        return m4466(this);
    }

    public boolean isChecked() {
        return m4471(this);
    }

    public void removeAllPointer() {
        List listM4466 = m4466(this);
        if (listM4466 == null) {
            return;
        }
        Iterator itM4732 = C0065.m4732(listM4466);
        while (C0036.m3657(itM4732)) {
            T1 t1 = (T1) C0071.m6012(itM4732);
            C0071.m5962(t1);
            C0027.m2512(t1);
        }
        C0063.m4327(m4466(this));
    }

    public void removePointer(T1 t1) {
        List listM4466 = m4466(this);
        if (listM4466 == null) {
            return;
        }
        C0036.m3765(listM4466, t1);
        if (t1 != null) {
            C0071.m5962(t1);
            C0027.m2512(t1);
        }
        for (int i = 0; i < C0034.m3427(m4466(this)); i++) {
            T1 t12 = (T1) C0071.m6078(m4466(this), i);
            if (t12 != null) {
                C0073.m6329(t12, C0078.m7464(i + 1));
            }
        }
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setJsonRemark(String str) {
        this.jsonRemark = str;
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
}
