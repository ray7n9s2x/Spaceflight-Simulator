package com.zfork.multiplatforms.android.bomb;

import android.widget.AbsListView;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0432r0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ int a;

    public /* synthetic */ C0432r0(int i) {
        this.a = i;
    }

    private final void a(AbsListView absListView, int i, int i2, int i3) {
    }

    private final void b(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0029.m2792(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        switch (C0029.m2792(this)) {
            case 0:
                C0479z c0479zM4409 = C0063.m4409();
                if (i == 1 || i == 2) {
                    C0479z c0479z = (C0479z) C0023.m1892(c0479zM4409);
                    if (c0479z != null) {
                        C0030.m2951(c0479z);
                        C0.N = true;
                    }
                } else {
                    C0479z c0479z2 = (C0479z) C0023.m1892(c0479zM4409);
                    if (c0479z2 != null) {
                        C0030.m2951(c0479z2);
                        C0.N = false;
                    }
                }
                break;
            default:
                C0408n c0408nM6120 = C0072.m6120();
                if (i == 1 || i == 2) {
                    C0408n c0408n = (C0408n) C0077.m7207(c0408nM6120);
                    if (c0408n != null) {
                        C0030.m2951(c0408n);
                        C0.N = true;
                    }
                } else {
                    C0408n c0408n2 = (C0408n) C0077.m7207(c0408nM6120);
                    if (c0408n2 != null) {
                        C0030.m2951(c0408n2);
                        C0.N = false;
                    }
                }
                break;
        }
    }
}
