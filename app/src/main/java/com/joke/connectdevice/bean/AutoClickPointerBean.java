package com.joke.connectdevice.bean;

import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;

/* JADX INFO: loaded from: classes3.dex */
public class AutoClickPointerBean {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f149short = {257, 286, 280, 287, 261, 276, 259, 297, 337, 332, 337, 791, 795, 791, 515, 535, 534, 525, 513, 526, 523, 513, 521, 998, 1017, 1023, 1016, 994, 1011, 996, 975, 950, 939, 950, 392, 388, 392, 1499, 1487, 1486, 1493, 1497, 1494, 1491, 1497, 1489, 681, 694, 691, 702, 703, 671, 692, 702, 650, 693, 691, 692, 686, 703, 680, 642, 762, 743, 762, 401, 413, 401, 3298, 3318, 3319, 3308, 3296, 3311, 3306, 3296, 3304, 1309, 1282, 1287, 1290, 1291, 1323, 1280, 1290, 1342, 1281, 1287, 1280, 1306, 1291, 1308, 1335, 1358, 1363, 1358, 2579, 2591, 2579, 1863, 1875, 1874, 1865, 1861, 1866, 1871, 1861, 1869};
    transient float currPhoneX;
    transient float currPhoneY;
    private long id;
    private String pointerName;
    private int pointerX;
    private int pointerY;
    private float relativePercentX;
    private float relativePercentY;
    private int slideEndPointerX;
    private int slideEndPointerY;
    private float slideEndRelativePercentX;
    private float slideEndRelativePercentY;
    private int clickCnt = 1;
    private int clickIntervalStart = 100;
    private int clickIntervalEnd = 150;
    private int delayStart = 100;
    private int delayEnd = 150;
    private int clickTime = 10;
    private int type = 0;
    private int offset = 5;

    /* JADX INFO: renamed from: ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4472(Object obj) {
        if (C0033.m3358() < 0) {
            return ((AutoClickPointerBean) obj).pointerX;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4473(Object obj) {
        if (C0027.m2460() >= 0) {
            return ((AutoClickPointerBean) obj).delayStart;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4474(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((AutoClickPointerBean) obj).delayEnd;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static float m4475(Object obj) {
        if (C0075.m6893() > 0) {
            return ((AutoClickPointerBean) obj).slideEndRelativePercentX;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4476(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((AutoClickPointerBean) obj).offset;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4477(Object obj) {
        if (C0021.m1598() <= 0) {
            return ((AutoClickPointerBean) obj).slideEndPointerY;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static float m4478(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((AutoClickPointerBean) obj).slideEndRelativePercentY;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static float m4479(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((AutoClickPointerBean) obj).currPhoneX;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static float m4480(Object obj) {
        if (C0066.m4827() > 0) {
            return ((AutoClickPointerBean) obj).relativePercentY;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m4481(Object obj) {
        if (C0076.m6903() < 0) {
            return ((AutoClickPointerBean) obj).clickCnt;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static float m4482(Object obj) {
        if (C0067.m5468() <= 0) {
            return ((AutoClickPointerBean) obj).currPhoneY;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4483(Object obj) {
        if (C0074.m6454() < 0) {
            return ((AutoClickPointerBean) obj).slideEndPointerX;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4484() {
        if (C0072.m6216() > 0) {
            return f149short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4485(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((AutoClickPointerBean) obj).clickTime;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠۠۠, reason: contains not printable characters */
    public static String m4486(Object obj) {
        if (C0027.m2460() > 0) {
            return ((AutoClickPointerBean) obj).pointerName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ, reason: contains not printable characters */
    public static int m4487(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((AutoClickPointerBean) obj).clickIntervalEnd;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۨ, reason: contains not printable characters */
    public static long m4488(Object obj) {
        if (C0063.m4427() > 0) {
            return ((AutoClickPointerBean) obj).id;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۢۨۧ, reason: contains not printable characters */
    public static int m4489(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((AutoClickPointerBean) obj).pointerY;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۣۥ, reason: contains not printable characters */
    public static int m4490(Object obj) {
        if (C0016.m717() < 0) {
            return ((AutoClickPointerBean) obj).clickIntervalStart;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4491(Object obj) {
        if (C0071.m6069() > 0) {
            return ((AutoClickPointerBean) obj).type;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨۦ, reason: not valid java name and contains not printable characters */
    public static float m4492(Object obj) {
        if (C0033.m3358() < 0) {
            return ((AutoClickPointerBean) obj).relativePercentX;
        }
        return 0.0f;
    }

    public int getClickCnt() {
        int iM4481 = m4481(this);
        if (iM4481 == 1 && m4491(this) == 1) {
            return 2;
        }
        return iM4481;
    }

    public int getClickIntervalEnd() {
        return m4487(this);
    }

    public int getClickIntervalStart() {
        return m4490(this);
    }

    public int getClickTime() {
        int iM4485 = m4485(this);
        if (iM4485 != 10) {
            return iM4485;
        }
        int iM4491 = m4491(this);
        if (iM4491 == 3) {
            return 300;
        }
        if (iM4491 == 2) {
            return 1000;
        }
        return iM4485;
    }

    public float getCurrPhoneX() {
        return m4479(this);
    }

    public float getCurrPhoneY() {
        return m4482(this);
    }

    public int getDelayEnd() {
        return m4474(this);
    }

    public int getDelayStart() {
        return m4473(this);
    }

    public long getId() {
        return m4488(this);
    }

    public int getOffset() {
        return m4476(this);
    }

    public String getPointerName() {
        return m4486(this);
    }

    public int getPointerX() {
        if (m4479(this) == 0.0f || m4492(this) == 0.0f) {
            return m4472(this);
        }
        StringBuilder sb = new StringBuilder(C0064.m4545(m4484(), 0, 11, 369));
        C0021.m1551(sb, m4472(this));
        C0077.m7290(sb, C0027.m2404(m4484(), 11, 3, 823));
        C0021.m1551(sb, (int) ((m4472(this) * m4479(this)) / m4492(this)));
        C0036.m3736(C0022.m1728(m4484(), 14, 9, 610), C0068.m5536(sb));
        return (int) ((m4472(this) * m4479(this)) / m4492(this));
    }

    public int getPointerY() {
        if (m4482(this) == 0.0f || m4480(this) == 0.0f) {
            return m4489(this);
        }
        StringBuilder sb = new StringBuilder(C0016.m625(m4484(), 23, 11, 918));
        C0021.m1551(sb, m4489(this));
        C0077.m7290(sb, C0023.m1904(m4484(), 34, 3, 424));
        C0021.m1551(sb, (int) ((m4489(this) * m4482(this)) / m4480(this)));
        C0036.m3736(C0039.m4066(m4484(), 37, 9, 1466), C0068.m5536(sb));
        return (int) ((m4489(this) * m4482(this)) / m4480(this));
    }

    public float getRelativePercentX() {
        return m4492(this);
    }

    public float getRelativePercentY() {
        return m4480(this);
    }

    public int getSlideEndPointerX() {
        if (m4479(this) == 0.0f || m4475(this) == 0.0f) {
            return m4483(this);
        }
        StringBuilder sb = new StringBuilder(C0068.m5544(m4484(), 46, 19, 730));
        C0021.m1551(sb, m4483(this));
        C0077.m7290(sb, C0065.m4757(m4484(), 65, 3, 433));
        C0021.m1551(sb, (int) ((m4483(this) * m4479(this)) / m4475(this)));
        C0036.m3736(C0027.m2404(m4484(), 68, 9, 3203), C0068.m5536(sb));
        return (int) ((m4483(this) * m4479(this)) / m4475(this));
    }

    public int getSlideEndPointerY() {
        if (m4482(this) == 0.0f || m4478(this) == 0.0f) {
            return m4477(this);
        }
        StringBuilder sb = new StringBuilder(C0024.m1945(m4484(), 77, 19, 1390));
        C0021.m1551(sb, m4477(this));
        C0077.m7290(sb, C0071.m5991(m4484(), 96, 3, 2611));
        C0021.m1551(sb, (int) ((m4477(this) * m4482(this)) / m4478(this)));
        C0036.m3736(C0017.m936(m4484(), 99, 9, 1830), C0068.m5536(sb));
        return (int) ((m4477(this) * m4482(this)) / m4478(this));
    }

    public float getSlideEndRelativePercentX() {
        return m4475(this);
    }

    public float getSlideEndRelativePercentY() {
        return m4478(this);
    }

    public int getType() {
        return m4491(this);
    }

    public void setClickCnt(int i) {
        this.clickCnt = i;
    }

    public void setClickIntervalEnd(int i) {
        this.clickIntervalEnd = i;
    }

    public void setClickIntervalStart(int i) {
        this.clickIntervalStart = i;
    }

    public void setClickTime(int i) {
        this.clickTime = i;
    }

    public void setCurrPhoneX(float f) {
        this.currPhoneX = f;
    }

    public void setCurrPhoneY(float f) {
        this.currPhoneY = f;
    }

    public void setDelayEnd(int i) {
        this.delayEnd = i;
    }

    public void setDelayStart(int i) {
        this.delayStart = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setPointerName(String str) {
        this.pointerName = str;
    }

    public void setPointerX(int i) {
        this.pointerX = i;
    }

    public void setPointerY(int i) {
        this.pointerY = i;
    }

    public void setRelativePercentX(float f) {
        this.relativePercentX = f;
    }

    public void setRelativePercentY(float f) {
        this.relativePercentY = f;
    }

    public void setSlideEndPointerX(int i) {
        this.slideEndPointerX = i;
    }

    public void setSlideEndPointerY(int i) {
        this.slideEndPointerY = i;
    }

    public void setSlideEndRelativePercentX(float f) {
        this.slideEndRelativePercentX = f;
    }

    public void setSlideEndRelativePercentY(float f) {
        this.slideEndRelativePercentY = f;
    }

    public void setType(int i) {
        this.type = i;
    }
}
