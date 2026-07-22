package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.android.apksig.kms.KmsType;
import com.android.apksig.zip.C0033;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.script.bean.C0074;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L4 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m6961(Object obj, Object obj2) {
        if (C0037.m3837() < 0) {
            return Predicate$CC.$default$and((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Predicate m6962(Object obj, Object obj2) {
        if (C0033.m3358() <= 0) {
            return Predicate$CC.$default$or((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m6963(Object obj) {
        if (C0066.m4827() > 0) {
            return Predicate$CC.$default$negate((Predicate) obj);
        }
        return null;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0019.m1313(this);
        return m6961(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0019.m1313(this)) {
        }
        return m6963(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0019.m1313(this);
        return m6962(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (C0019.m1313(this)) {
            case 0:
                M4 m4 = (M4) C0066.m4896(this);
                C0030.m2951(m4);
                return C0025.m2111(C0074.m6524((KmsType) obj), C0074.m6519(m4));
            default:
                return C0025.m2111((String) obj, (String) C0066.m4896(this));
        }
    }
}
