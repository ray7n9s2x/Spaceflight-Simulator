package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.KeyConfig;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K4 implements Function {
    public final /* synthetic */ String a;

    /* JADX INFO: renamed from: ۟ۥۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Function m6955(Object obj, Object obj2) {
        if (C0035.m3569() < 0) {
            return Function$CC.$default$compose((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۦ, reason: contains not printable characters */
    public static Function m6956(Object obj, Object obj2) {
        if (C0033.m3358() < 0) {
            return Function$CC.$default$andThen((Function) obj, (Function) obj2);
        }
        return null;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return m6956(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return m6955(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return C0036.m3673((KeyConfig.Kms) obj, C0066.m4806(this));
    }
}
