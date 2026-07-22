package com.android.apksig.internal.apk;

import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0071;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigResult {
    public final int signatureSchemeVersion;
    public boolean verified;
    public final List<ApkSignerInfo> mSigners = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public void addError(int i, Object... objArr) {
        C0017.m919(C0036.m3743(this), new ApkVerificationIssue(i, objArr));
    }

    public void addWarning(int i, Object... objArr) {
        C0017.m919(C0017.m860(this), new ApkVerificationIssue(i, objArr));
    }

    public boolean containsErrors() {
        if (!C0066.m4881(C0036.m3743(this))) {
            return true;
        }
        if (C0025.m2084(C0111.m13075(this))) {
            return false;
        }
        Iterator itM4732 = C0065.m4732(C0111.m13075(this));
        while (C0036.m3657(itM4732)) {
            if (C0030.m2931((ApkSignerInfo) C0071.m6012(itM4732))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsWarnings() {
        if (!C0066.m4881(C0017.m860(this))) {
            return true;
        }
        if (C0025.m2084(C0111.m13075(this))) {
            return false;
        }
        Iterator itM4732 = C0065.m4732(C0111.m13075(this));
        while (C0036.m3657(itM4732)) {
            if (C0068.m5624((ApkSignerInfo) C0071.m6012(itM4732))) {
                return true;
            }
        }
        return false;
    }

    public List<? extends ApkVerificationIssue> getErrors() {
        return C0036.m3743(this);
    }

    public List<? extends ApkVerificationIssue> getWarnings() {
        return C0017.m860(this);
    }

    public ApkSigResult(int i) {
        this.signatureSchemeVersion = i;
    }
}
