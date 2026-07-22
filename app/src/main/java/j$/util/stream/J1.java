package j$.util.stream;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
final class J1 extends AbstractC0644z0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    /* JADX INFO: renamed from: ۟۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static double m9510(Object obj) {
        return C0096.m10782() > 0 ? ((J1) obj).i : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۦ۟۟۠, reason: contains not printable characters */
    public static DoubleBinaryOperator m9511(Object obj) {
        if (C0098.m10857() < 0) {
            return ((J1) obj).h;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0644z0
    public final V1 f0() {
        return new E1(m9510(this), m9511(this));
    }

    J1(EnumC0548f3 enumC0548f3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }
}
