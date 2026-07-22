package com.joke.speedfloatingball.bean;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CloudBean {
    private List<String> advertPackageNameList;
    private int appId;
    private String appName;
    private int canceledOnTouchOutsideState;
    private String dialogCancelClickLink;
    private int dialogCancelShowState;
    private String dialogCancelStr;
    private String dialogConfirmClickLink;
    private int dialogConfirmShowState;
    private String dialogConfirmStr;
    private String dialogContent;
    private String dialogProductTitle;
    private int dialogShowNumber;
    private int dialogShowTime;
    private String dialogTitle;
    private String packageName;
    private List<String> packageNameList;
    private String packageUrl;
    private String remark;
    private int splashImgState;
    private String splashImgUrl;
    private int splashStartUpState;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6591(Object obj) {
        if (C0077.m7272() <= 0) {
            return ((CloudBean) obj).dialogContent;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6592(Object obj) {
        if (C0018.m1064() > 0) {
            return ((CloudBean) obj).dialogConfirmStr;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m6593(Object obj) {
        if (C0017.m846() >= 0) {
            return ((CloudBean) obj).dialogTitle;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6594(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((CloudBean) obj).dialogCancelStr;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static List m6595(Object obj) {
        if (C0071.m6069() > 0) {
            return ((CloudBean) obj).packageNameList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6596(Object obj) {
        if (C0076.m6903() < 0) {
            return ((CloudBean) obj).packageUrl;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static String m6597(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((CloudBean) obj).splashImgUrl;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6598(Object obj) {
        if (C0032.m3184() < 0) {
            return ((CloudBean) obj).dialogCancelShowState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m6599(Object obj) {
        if (C0064.m4578() > 0) {
            return ((CloudBean) obj).appId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m6600(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((CloudBean) obj).dialogShowTime;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m6601(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((CloudBean) obj).appName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6602(Object obj) {
        if (C0016.m717() <= 0) {
            return ((CloudBean) obj).remark;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6603(Object obj) {
        if (C0064.m4578() >= 0) {
            return ((CloudBean) obj).dialogCancelClickLink;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6604(Object obj) {
        if (C0074.m6454() <= 0) {
            return ((CloudBean) obj).canceledOnTouchOutsideState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m6605(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((CloudBean) obj).splashStartUpState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6606(Object obj) {
        if (C0024.m2011() <= 0) {
            return ((CloudBean) obj).dialogConfirmShowState;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6607(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((CloudBean) obj).dialogShowNumber;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m6608(Object obj) {
        if (C0063.m4427() >= 0) {
            return ((CloudBean) obj).dialogConfirmClickLink;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static List m6609(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((CloudBean) obj).advertPackageNameList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6610(Object obj) {
        if (C0037.m3837() < 0) {
            return ((CloudBean) obj).dialogProductTitle;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6611(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((CloudBean) obj).packageName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۨ, reason: contains not printable characters */
    public static int m6612(Object obj) {
        if (C0032.m3184() <= 0) {
            return ((CloudBean) obj).splashImgState;
        }
        return 0;
    }

    public List<String> getAdvertPackageNameList() {
        return m6609(this);
    }

    public int getAppId() {
        return m6599(this);
    }

    public String getAppName() {
        return m6601(this);
    }

    public int getCanceledOnTouchOutsideState() {
        return m6604(this);
    }

    public String getDialogCancelClickLink() {
        return m6603(this);
    }

    public int getDialogCancelShowState() {
        return m6598(this);
    }

    public String getDialogCancelStr() {
        return m6594(this);
    }

    public String getDialogConfirmClickLink() {
        return m6608(this);
    }

    public int getDialogConfirmShowState() {
        return m6606(this);
    }

    public String getDialogConfirmStr() {
        return m6592(this);
    }

    public String getDialogContent() {
        return m6591(this);
    }

    public String getDialogProductTitle() {
        return m6610(this);
    }

    public int getDialogShowNumber() {
        return m6607(this);
    }

    public int getDialogShowTime() {
        return m6600(this);
    }

    public String getDialogTitle() {
        return m6593(this);
    }

    public String getPackageName() {
        return m6611(this);
    }

    public List<String> getPackageNameList() {
        return m6595(this);
    }

    public String getPackageUrl() {
        return m6596(this);
    }

    public String getRemark() {
        return m6602(this);
    }

    public int getSplashImgState() {
        return m6612(this);
    }

    public String getSplashImgUrl() {
        return m6597(this);
    }

    public int getSplashStartUpState() {
        return m6605(this);
    }

    public void setAdvertPackageNameList(List<String> list) {
        this.advertPackageNameList = list;
    }

    public void setAppId(int i) {
        this.appId = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCanceledOnTouchOutsideState(int i) {
        this.canceledOnTouchOutsideState = i;
    }

    public void setDialogCancelClickLink(String str) {
        this.dialogCancelClickLink = str;
    }

    public void setDialogCancelShowState(int i) {
        this.dialogCancelShowState = i;
    }

    public void setDialogCancelStr(String str) {
        this.dialogCancelStr = str;
    }

    public void setDialogConfirmClickLink(String str) {
        this.dialogConfirmClickLink = str;
    }

    public void setDialogConfirmShowState(int i) {
        this.dialogConfirmShowState = i;
    }

    public void setDialogConfirmStr(String str) {
        this.dialogConfirmStr = str;
    }

    public void setDialogContent(String str) {
        this.dialogContent = str;
    }

    public void setDialogProductTitle(String str) {
        this.dialogProductTitle = str;
    }

    public void setDialogShowNumber(int i) {
        this.dialogShowNumber = i;
    }

    public void setDialogShowTime(int i) {
        this.dialogShowTime = i;
    }

    public void setDialogTitle(String str) {
        this.dialogTitle = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPackageNameList(List<String> list) {
        this.packageNameList = list;
    }

    public void setPackageUrl(String str) {
        this.packageUrl = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSplashImgState(int i) {
        this.splashImgState = i;
    }

    public void setSplashImgUrl(String str) {
        this.splashImgUrl = str;
    }

    public void setSplashStartUpState(int i) {
        this.splashStartUpState = i;
    }
}
