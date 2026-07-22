package j$.time.format;

import j$.sun.nio.cs.C0080;
import j$.time.C0090;
import j$.time.temporal.C0085;
import j$.time.zone.C0087;
import j$.time.zone.C0088;
import j$.util.C0101;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.io.C0103;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.C0105;
import java.util.function.C0106;

/* JADX INFO: loaded from: classes3.dex */
final class s {
    private final Map a;

    /* JADX INFO: renamed from: ۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static Comparator m7962() {
        if (C0105.m11264() >= 0) {
            return c.m7879();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۦ, reason: contains not printable characters */
    public static int m7963() {
        if (C0082.m7983() <= 0) {
            return c.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۦ, reason: contains not printable characters */
    public static Map m7964(Object obj) {
        if (C0085.m8230() > 0) {
            return ((s) obj).a;
        }
        return null;
    }

    s(Map map) {
        this.a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator itM8658 = C0090.m8658(C0103.m11178(map));
        while (C0087.m8485(itM8658)) {
            Map.Entry entry = (Map.Entry) C0090.m8628(itM8658);
            HashMap map3 = new HashMap();
            Iterator itM86582 = C0090.m8658(C0103.m11178((Map) C0096.m10785(entry)));
            while (C0087.m8485(itM86582)) {
                Map.Entry entry2 = (Map.Entry) C0090.m8628(itM86582);
                String str = (String) C0096.m10785(entry2);
                String str2 = (String) C0096.m10785(entry2);
                Long l = (Long) C0099.m10870(entry2);
                m7963();
                C0088.m8552(map3, str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(C0080.m7548(map3));
            C0101.m11018(arrayList2, m7962());
            C0088.m8552(map2, (w) C0099.m10870(entry), arrayList2);
            C0083.m8040(arrayList, arrayList2);
            C0088.m8552(map2, null, arrayList);
        }
        C0101.m11018(arrayList, m7962());
    }

    final String a(long j, w wVar) {
        Map map = (Map) C0084.m8103(m7964(this), wVar);
        if (map != null) {
            return (String) C0084.m8103(map, C0106.m11351(j));
        }
        return null;
    }
}
