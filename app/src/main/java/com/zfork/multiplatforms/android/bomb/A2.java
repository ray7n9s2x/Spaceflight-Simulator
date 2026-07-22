package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import j$.util.function.BiFunction$CC;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A2 implements BiFunction {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f229short = {1225, 1266, 1259, 1259, 604, 522, 601, 602, 604, 597, 541, 579, 601, 604, 522};

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6906() {
        if (C0077.m7272() < 0) {
            return f229short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static BiFunction m6907(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return BiFunction$CC.$default$andThen((BiFunction) obj, (Function) obj2);
        }
        return null;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return m6907(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        C0025.m2170(num);
        IOException iOException = (IOException) obj2;
        String strM3603 = C0035.m3603(m6906(), 0, 4, 1159);
        String strM3134 = iOException == null ? strM3603 : C0032.m3134(C0030.m2951(iOException));
        if (iOException != null) {
            strM3603 = C0033.m3375(iOException);
        }
        return new C0470x2(C0021.m1531(C0111.m13097(m6906(), 4, 11, 633), new Object[]{strM3134, num, strM3603}), iOException);
    }
}
