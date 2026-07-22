package androidx.loader.app.services;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ k(Context context, Exception exc) {
        this.a = context;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0007.m380(C0005.m275(this), C0006.m318(this));
    }
}
