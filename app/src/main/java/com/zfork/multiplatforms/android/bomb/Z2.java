package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.widget.AdapterView;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.zfork.entry.MetaSelectAppAbility;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z2 implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ MetaSelectAppAbility a;

    public /* synthetic */ Z2(MetaSelectAppAbility metaSelectAppAbility) {
        this.a = metaSelectAppAbility;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C0077.m7242();
        C0030.m2918(C0025.m2180(this));
        return true;
    }
}
