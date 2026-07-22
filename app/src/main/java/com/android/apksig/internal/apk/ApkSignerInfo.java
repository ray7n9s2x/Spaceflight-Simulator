package com.android.apksig.internal.apk;

import com.android.apksig.ApkVerificationIssue;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.util.C0031;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSignerInfo {
    public int index;
    public long timestamp;
    public List<X509Certificate> certs = new ArrayList();
    public List<X509Certificate> certificateLineage = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public void addError(int i, Object... objArr) {
        C0017.m919(C0022.m1698(this), new ApkVerificationIssue(i, objArr));
    }

    public void addInfoMessage(int i, Object... objArr) {
        C0017.m919(C0031.m3086(this), new ApkVerificationIssue(i, objArr));
    }

    public void addWarning(int i, Object... objArr) {
        C0017.m919(C0066.m4822(this), new ApkVerificationIssue(i, objArr));
    }

    public boolean containsErrors() {
        return !C0066.m4881(C0022.m1698(this));
    }

    public boolean containsInfoMessages() {
        return !C0066.m4881(C0031.m3086(this));
    }

    public boolean containsWarnings() {
        return !C0066.m4881(C0066.m4822(this));
    }

    public List<? extends ApkVerificationIssue> getErrors() {
        return C0022.m1698(this);
    }

    public List<? extends ApkVerificationIssue> getInfoMessages() {
        return C0031.m3086(this);
    }

    public List<? extends ApkVerificationIssue> getWarnings() {
        return C0066.m4822(this);
    }
}
