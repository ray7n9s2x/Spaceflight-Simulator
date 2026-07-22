package j$.util;

import j$.sun.nio.cs.C0080;
import j$.time.C0091;
import j$.time.format.C0082;
import j$.time.zone.C0087;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.C0105;

/* JADX INFO: renamed from: j$.util.List$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class List$EL {
    /* JADX INFO: renamed from: ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m8814(Object obj, Object obj2) {
        if (C0082.m7983() <= 0) {
            ((C0512l) obj).sort((Comparator) obj2);
        }
    }

    public static void sort(List list, Comparator comparator) {
        if (list instanceof InterfaceC0652x) {
            m8814((C0512l) ((InterfaceC0652x) list), comparator);
            throw null;
        }
        Object[] objArrM11293 = C0105.m11293(list);
        C0080.m7540(objArrM11293, comparator);
        ListIterator listIteratorM8012 = C0082.m8012(list);
        for (Object obj : objArrM11293) {
            C0091.m8717(listIteratorM8012);
            C0087.m8482(listIteratorM8012, obj);
        }
    }
}
