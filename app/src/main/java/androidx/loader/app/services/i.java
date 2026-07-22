package androidx.loader.app.services;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ i(Context context, Throwable th) {
        this.a = context;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0007.m367(C0008.m405(this), C0008.m398(this));
    }
}
