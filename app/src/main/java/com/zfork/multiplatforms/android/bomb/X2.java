package com.zfork.multiplatforms.android.bomb;

import android.widget.ListView;
import com.android.apksig.internal.jar.C0024;
import com.joke.plugin.gson.internal.reflect.C0071;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListView b;

    public /* synthetic */ X2(ListView listView, int i) {
        this.a = i;
        this.b = listView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listViewM5979 = C0071.m5979(this);
        switch (C0077.m7284(this)) {
            case 0:
                C0077.m7242();
                try {
                    C0024.m2024(listViewM5979);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0077.m7242();
                try {
                    C0024.m2024(listViewM5979);
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
