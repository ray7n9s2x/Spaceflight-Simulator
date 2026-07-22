package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.ApkVerifier;
import com.android.apksig.KeyConfig;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import j$.util.function.Function$CC;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.function.Function;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Function m7105(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            return Function$CC.$default$compose((Function) obj, (Function) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Function m7106(Object obj, Object obj2) {
        if (C0023.m1921() >= 0) {
            return Function$CC.$default$andThen((Function) obj, (Function) obj2);
        }
        return null;
    }

    public final /* synthetic */ Function andThen(Function function) {
        C0035.m3573(this);
        return m7106(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        C0035.m3573(this);
        return m7105(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (C0035.m3573(this)) {
            case 0:
                return C0078.m7414((KeyConfig.Jca) obj);
            case 1:
                return null;
            case 2:
                C0035.m3549();
                return C0065.m4682((ApkVerifier.IssueWithParams) obj);
            case 3:
                return C0078.m7414((KeyConfig.Jca) obj);
            case 4:
                return (X509Certificate) C0066.m4818(X509Certificate.class, (Certificate) obj);
            case 5:
                return C0078.m7414((KeyConfig.Jca) obj);
            default:
                return (Integer) C0111.m13157((Pair) obj);
        }
    }
}
