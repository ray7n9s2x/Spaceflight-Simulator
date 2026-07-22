package j$.util;

import j$.sun.nio.cs.C0080;
import j$.time.C0089;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.function.C0094;
import java.io.C0103;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.C0105;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0503c implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0503c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0080.m7590(this)) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) C0089.m8584(this);
                return C0085.m8273(C0088.m8537(toIntFunction, obj), C0088.m8537(toIntFunction, obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) C0089.m8584(this);
                return C0089.m8587(C0100.m10998(toDoubleFunction, obj), C0100.m10998(toDoubleFunction, obj2));
            case 2:
                Function function = (Function) C0089.m8584(this);
                return C0103.m11173((Comparable) C0087.m8486(function, obj), C0087.m8486(function, obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) C0089.m8584(this);
                return C0105.m11272(C0094.m9161(toLongFunction, obj), C0094.m9161(toLongFunction, obj2));
        }
    }
}
