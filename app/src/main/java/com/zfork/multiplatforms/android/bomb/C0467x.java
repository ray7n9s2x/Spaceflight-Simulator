package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.ApkVerifier;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.internal.bind.util.C0067;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0467x implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ C0467x(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m7135(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return Predicate$CC.$default$and((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Predicate m7136(Object obj, Object obj2) {
        if (C0111.m13165() < 0) {
            return Predicate$CC.$default$or((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Predicate m7137(Object obj) {
        if (C0067.m5468() <= 0) {
            return Predicate$CC.$default$negate((Predicate) obj);
        }
        return null;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0034.m3455(this);
        return m7135(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0034.m3455(this)) {
        }
        return m7137(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0034.m3455(this);
        return m7136(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (C0034.m3455(this)) {
            case 0:
                return C0064.m4525(C0035.m3549(), (ApkVerifier.Issue) obj);
            case 1:
                return ((R4) obj) == C0028.m2581();
            case 2:
                return C0028.m2581() == ((R4) obj);
            default:
                C0371g5 c0371g5 = (C0371g5) obj;
                return C0029.m2798(c0371g5) > 0 || C0024.m2050(c0371g5) > 0;
        }
    }
}
