package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.util.C0027;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class i5 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (C0027.m2432(this)) {
        }
        return new SimpleDateFormat();
    }
}
