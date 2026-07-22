package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.C0073;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0476y2 implements Consumer {
    public final /* synthetic */ C0451u1 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ A2 c;
    public final /* synthetic */ AtomicInteger d;

    public /* synthetic */ C0476y2(C0451u1 c0451u1, AtomicReference atomicReference, A2 a2, AtomicInteger atomicInteger) {
        this.a = c0451u1;
        this.b = atomicReference;
        this.c = a2;
        this.d = atomicInteger;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Consumer m7144(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return Consumer$CC.$default$andThen((Consumer) obj, (Consumer) obj2);
        }
        return null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return m7144(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C0451u1 c0451u1M2930 = C0030.m2930(this);
        AtomicInteger atomicIntegerM3646 = C0036.m3646(this);
        try {
            C0077.m7241(c0451u1M2930, obj);
        } catch (IOException e) {
            AtomicReference atomicReferenceM629 = C0016.m629(this);
            if (C0073.m6438(atomicReferenceM629) == null) {
                C0025.m2115(atomicReferenceM629, new ArrayList());
            }
            C0077.m7162((List) C0073.m6438(atomicReferenceM629), (IOException) C0073.m6401(C0023.m1816(this), C0021.m1548(C0023.m1928(atomicIntegerM3646)), e));
        }
        C0078.m7379(atomicIntegerM3646);
    }
}
