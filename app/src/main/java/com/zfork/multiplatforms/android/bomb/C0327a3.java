package com.zfork.multiplatforms.android.bomb;

import android.widget.SearchView;
import com.android.apksig.zip.C0033;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.entry.MetaSelectAppAbility;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0327a3 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ MetaSelectAppAbility a;

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        C0033.m3331(C0075.m6835(C0074.m6502(this)), new R1(this, str, 1));
        return false;
    }

    public C0327a3(MetaSelectAppAbility metaSelectAppAbility) {
        this.a = metaSelectAppAbility;
    }
}
