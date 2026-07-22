package com.zfork.multiplatforms.android.bomb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.util.C0031;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class W0 extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawableM6130 = C0072.m6130(this);
        Paint.FontMetricsInt fontMetricsIntM1628 = C0021.m1628(paint);
        int iM13074 = ((((C0111.m13074(fontMetricsIntM1628) + i4) + i4) + C0018.m1045(fontMetricsIntM1628)) / 2) - (C0031.m3096(C0078.m7461(drawableM6130)) / 2);
        C0037.m3785(canvas);
        C0020.m1394(canvas, f, iM13074);
        C0065.m4701(drawableM6130, canvas);
        C0067.m5455(canvas);
    }
}
