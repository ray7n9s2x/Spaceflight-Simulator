package com.zfork.multiplatforms.android.bomb;

import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import j$.util.function.Function$CC;
import java.nio.file.Path;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I3 implements Function {
    /* JADX INFO: renamed from: ۟ۥۥۨۨ, reason: not valid java name and contains not printable characters */
    public static Function m6941(Object obj, Object obj2) {
        if (C0067.m5468() <= 0) {
            return Function$CC.$default$andThen((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static Function m6942(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return Function$CC.$default$compose((Function) obj, (Function) obj2);
        }
        return null;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return m6941(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return C0069.m5751((Path) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return m6942(this, function);
    }
}
