package j$.util;

import j$.time.C0090;
import j$.time.temporal.C0086;
import j$.time.zone.C0087;
import java.io.C0103;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0504d implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0504d(Comparator comparator, Object obj, int i) {
        this.a = i;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0103.m11147(this)) {
            case 0:
                int iM8293 = C0086.m8293(C0102.m11101(this), obj, obj2);
                return iM8293 != 0 ? iM8293 : C0086.m8293((Comparator) C0090.m8605(this), obj, obj2);
            default:
                Function function = (Function) C0090.m8605(this);
                return C0086.m8293(C0102.m11101(this), C0087.m8486(function, obj), C0087.m8486(function, obj2));
        }
    }
}
