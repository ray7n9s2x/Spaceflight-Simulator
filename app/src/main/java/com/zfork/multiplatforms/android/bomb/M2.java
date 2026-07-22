package com.zfork.multiplatforms.android.bomb;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class M2 implements HostnameVerifier {
    public final /* synthetic */ int a;

    public /* synthetic */ M2(int i) {
        this.a = i;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (C0078.m7438(this)) {
        }
        return true;
    }
}
