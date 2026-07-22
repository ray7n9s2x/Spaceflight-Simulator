package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0036;
import com.joke.script.bean.C0074;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC0465w3 implements View.OnClickListener {
    public long a = 0;

    public abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jM6518 = C0074.m6518();
        if (jM6518 - C0036.m3670(this) > 2000) {
            this.a = jM6518;
            C0028.m2639(this);
        }
    }
}
