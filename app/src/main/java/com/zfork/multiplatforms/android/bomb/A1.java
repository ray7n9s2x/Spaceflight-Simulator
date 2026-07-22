package com.zfork.multiplatforms.android.bomb;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class A1 implements View.OnTouchListener {
    public final /* synthetic */ WindowManager a;
    public final /* synthetic */ WindowManager.LayoutParams b;
    public final /* synthetic */ View c;
    public final /* synthetic */ B1 d;

    public A1(B1 b1, WindowManager windowManager, WindowManager.LayoutParams layoutParams, View view) {
        this.d = b1;
        this.a = windowManager;
        this.b = layoutParams;
        this.c = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WindowManager windowManagerM6826;
        WindowManager.LayoutParams layoutParamsM6477;
        View viewM1623;
        int iM5835 = C0069.m5835(motionEvent);
        B1 b1M1386 = C0020.m1386(this);
        if (iM5835 != 0) {
            if (iM5835 != 1) {
                if (iM5835 != 2) {
                    return false;
                }
                int iM1701 = (int) (C0022.m1701(motionEvent) - C0017.m823(b1M1386));
                int iM602 = (int) (C0016.m602(motionEvent) - C0070.m5927(b1M1386));
                b1M1386.c = C0022.m1701(motionEvent);
                b1M1386.d = C0016.m602(motionEvent);
                if ((C0038.m3989(iM1701) >= 10 || C0038.m3989(iM602) >= 10) && (windowManagerM6826 = C0075.m6826(this)) != null && (layoutParamsM6477 = C0074.m6477(this)) != null && (viewM1623 = C0021.m1623(this)) != null) {
                    int iM5592 = C0068.m5592(layoutParamsM6477);
                    int iM6451 = C0074.m6451(layoutParamsM6477);
                    layoutParamsM6477.x = iM5592 + iM1701;
                    layoutParamsM6477.y = iM6451 + iM602;
                    C0037.m3792(windowManagerM6826, viewM1623, layoutParamsM6477);
                }
            } else {
                int iM17012 = (int) (C0022.m1701(motionEvent) - C0075.m6879(b1M1386));
                int iM6022 = (int) (C0016.m602(motionEvent) - C0077.m7269(b1M1386));
                if (C0038.m3989(iM17012) < 10 && C0038.m3989(iM6022) < 10) {
                    C0017.m829(view);
                }
            }
        } else {
            C0111.m13047(view);
            C0022.m1701(motionEvent);
            C0021.m1608(view);
            C0016.m602(motionEvent);
            C0111.m13047(view);
            C0021.m1608(view);
            b1M1386.a = C0022.m1701(motionEvent);
            b1M1386.b = C0016.m602(motionEvent);
            b1M1386.c = C0022.m1701(motionEvent);
            b1M1386.d = C0016.m602(motionEvent);
        }
        return true;
    }
}
