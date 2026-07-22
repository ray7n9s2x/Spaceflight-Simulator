package androidx.loader.app.services;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ h(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0007.m379(C0006.m327(this), C0006.m333(this), view);
    }
}
