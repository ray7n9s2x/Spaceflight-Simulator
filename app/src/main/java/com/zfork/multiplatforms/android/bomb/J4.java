package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.JcaSignerEngine;
import com.android.apksig.KeyConfig;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.pkcs7.C0026;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.hawk.cheat.C0076;
import j$.util.function.Function$CC;
import java.security.spec.AlgorithmParameterSpec;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J4 implements Function {
    public final /* synthetic */ String a;
    public final /* synthetic */ AlgorithmParameterSpec b;

    public /* synthetic */ J4(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        this.a = str;
        this.b = algorithmParameterSpec;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Function m6951(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return Function$CC.$default$compose((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static Function m6952(Object obj, Object obj2) {
        if (C0070.m5903() > 0) {
            return Function$CC.$default$andThen((Function) obj, (Function) obj2);
        }
        return null;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return m6952(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return m6951(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new JcaSignerEngine(C0078.m7414((KeyConfig.Jca) obj), C0026.m2339(this), C0020.m1330(this));
    }
}
