package com.zfork.multiplatforms.android.bomb;

import android.app.Dialog;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0397l0 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ C0397l0(Dialog dialog, int i) {
        this.a = i;
        this.b = dialog;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        switch (C0020.m1425(this)) {
            case 0:
                super.onProgressChanged(webView, i);
                DialogC0403m0 dialogC0403m0 = (DialogC0403m0) C0039.m4097(this);
                if (i >= 99) {
                    C0063.m4382(C0028.m2610(dialogC0403m0), 8);
                } else if (C0016.m655(C0028.m2610(dialogC0403m0)) == 8) {
                    C0063.m4382(C0028.m2610(dialogC0403m0), 0);
                    C0036.m3677(C0028.m2610(dialogC0403m0), i);
                }
                break;
            default:
                super.onProgressChanged(webView, i);
                DialogC0403m0 dialogC0403m02 = (DialogC0403m0) C0039.m4097(this);
                if (i >= 99) {
                    C0063.m4382(C0028.m2610(dialogC0403m02), 8);
                } else if (C0016.m655(C0028.m2610(dialogC0403m02)) == 8) {
                    C0063.m4382(C0028.m2610(dialogC0403m02), 0);
                    C0036.m3677(C0028.m2610(dialogC0403m02), i);
                }
                break;
        }
    }
}
