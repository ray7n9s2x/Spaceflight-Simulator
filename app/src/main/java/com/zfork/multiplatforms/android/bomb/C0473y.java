package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0037;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0036;
import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0473y implements IntPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ C0473y(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m7141(Object obj) {
        if (C0037.m3837() <= 0) {
            return IntPredicate$CC.$default$negate((IntPredicate) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۨ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m7142(Object obj, Object obj2) {
        if (C0036.m3653() < 0) {
            return IntPredicate$CC.$default$and((IntPredicate) obj, (IntPredicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static IntPredicate m7143(Object obj, Object obj2) {
        if (C0031.m3075() >= 0) {
            return IntPredicate$CC.$default$or((IntPredicate) obj, (IntPredicate) obj2);
        }
        return null;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        C0022.m1745(this);
        return m7142(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (C0022.m1745(this)) {
        }
        return m7141(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        C0022.m1745(this);
        return m7143(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (C0022.m1745(this)) {
            case 0:
                if (i == -1029262406) {
                }
                break;
            default:
                if (i == -1029262406) {
                }
                break;
        }
        return false;
    }
}
