package j$.time.zone;

import j$.sun.misc.C0079;
import j$.time.chrono.C0081;
import j$.time.format.C0083;
import j$.time.temporal.C0085;
import j$.util.C0101;
import j$.util.stream.C0096;
import j$.util.stream.C0099;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class i extends j {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f472short = {513, 544, 571, 623, 558, 623, 557, 570, 550, 547, 571, 610, 550, 545, 623, 571, 550, 546, 554, 623, 565, 544, 545, 554, 629, 623};
    private final Set c;

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static Set m8438(Object obj) {
        if (C0096.m10782() >= 0) {
            return ((i) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟۠, reason: contains not printable characters */
    public static short[] m8439() {
        if (C0081.m7818() <= 0) {
            return f472short;
        }
        return null;
    }

    i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : C0083.m8072()) {
            C0088.m8514(linkedHashSet, str);
        }
        this.c = C0087.m8448(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set c() {
        return m8438(this);
    }

    @Override // j$.time.zone.j
    protected final f b(String str) {
        if (C0085.m8225(m8438(this), str)) {
            return new f(C0096.m10792(str));
        }
        StringBuilder sb = new StringBuilder(C0079.m7503(m8439(), 0, 26, 591));
        C0101.m11052(sb, str);
        throw new g(C0099.m10924(sb));
    }
}
