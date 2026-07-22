package com.teamcuriosity.addons;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class DocLocation {
    public final String docId;
    public final Uri docUri;

    public DocLocation(Uri uri, String str) {
        this.docUri = uri;
        this.docId = str;
    }
}
