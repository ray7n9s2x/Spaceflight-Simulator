package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.widget.AdapterView;
import com.android.apksig.internal.zip.C0029;
import com.joke.connectdevice.bean.AutoClickPlanBean;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0427q0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C0444t0 a;

    public C0427q0(C0444t0 c0444t0) {
        this.a = c0444t0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AutoClickPlanBean autoClickPlanBean = (AutoClickPlanBean) C0029.m2807(adapterView, i);
        InterfaceC0477y3 interfaceC0477y3M5543 = C0068.m5543(C0073.m6307(this));
        if (interfaceC0477y3M5543 != null) {
            C0111.m13070(interfaceC0477y3M5543, autoClickPlanBean);
        }
    }
}
