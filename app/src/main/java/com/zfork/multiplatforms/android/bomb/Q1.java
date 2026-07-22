package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.internal.zip.C0029;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.util.C0067;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ Q1(View.OnClickListener onClickListener, int i) {
        this.a = i;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0066.m4860(this)) {
            case 0:
                View.OnClickListener onClickListenerM2822 = C0029.m2822(this);
                if (onClickListenerM2822 != null) {
                    C0067.m5442(onClickListenerM2822, view);
                }
                break;
            default:
                View.OnClickListener onClickListenerM28222 = C0029.m2822(this);
                if (onClickListenerM28222 != null) {
                    C0067.m5442(onClickListenerM28222, view);
                }
                break;
        }
    }
}
