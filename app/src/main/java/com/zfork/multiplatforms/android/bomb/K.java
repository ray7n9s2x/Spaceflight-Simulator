package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.zip.C0033;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends Thread {
    public final /* synthetic */ L a;

    public K(L l) {
        this.a = l;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C0024.m2006(C0021.m1524(this), this);
        } catch (Exception e) {
            C0033.m3347(e);
        }
    }
}
