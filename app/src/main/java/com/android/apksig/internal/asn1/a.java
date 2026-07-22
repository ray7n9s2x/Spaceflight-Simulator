package com.android.apksig.internal.asn1;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.zip.C0034;
import com.joke.plugin.gson.internal.bind.C0068;
import com.zfork.entry.C0075;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static Asn1Field m1505(Object obj) {
        if (C0075.m6893() >= 0) {
            return ((Asn1DerEncoder.AnnotatedField) obj).getAnnotation();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۦ, reason: contains not printable characters */
    public static Asn1Field m1506(Object obj) {
        if (C0034.m3450() > 0) {
            return ((Asn1BerParser.AnnotatedField) obj).getAnnotation();
        }
        return null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0021.m1614(this)) {
            case 0:
                return C0019.m1209(m1506((Asn1BerParser.AnnotatedField) obj)) - C0019.m1209(m1506((Asn1BerParser.AnnotatedField) obj2));
            default:
                C0068.m5648();
                return C0019.m1209(m1505((Asn1DerEncoder.AnnotatedField) obj)) - C0019.m1209(m1505((Asn1DerEncoder.AnnotatedField) obj2));
        }
    }
}
