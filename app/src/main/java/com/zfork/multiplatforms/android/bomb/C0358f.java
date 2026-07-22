package com.zfork.multiplatforms.android.bomb;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import com.StefMorojna.SpaceflightSimulator.R;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0064;
import com.joke.script.bean.C0074;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0358f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f318short = {2480, 2452, 2446, 2446, 2452, 2451, 2458, 2525, 2447, 2456, 2444, 2440, 2452, 2447, 2456, 2457, 2525, 2443, 2452, 2456, 2442, 2525, 2442, 2452, 2441, 2453, 2525, 2484, 2489, 2503, 2525};
    public final LinearLayout a;
    public final Button b;
    public final ListView c;
    public final SearchView d;

    public static C0358f a(LayoutInflater layoutInflater) {
        View viewM3295 = C0033.m3295(layoutInflater, R.attr.actionBarPopupTheme, null, false);
        int i = R.array.hide_fingerprint_instantly_prefixes;
        Button button = (Button) C0017.m922(viewM3295, R.array.hide_fingerprint_instantly_prefixes);
        if (button != null) {
            i = 2130903070;
            ListView listView = (ListView) C0017.m922(viewM3295, 2130903070);
            if (listView != null) {
                i = 2130903072;
                SearchView searchView = (SearchView) C0017.m922(viewM3295, 2130903072);
                if (searchView != null) {
                    return new C0358f((LinearLayout) viewM3295, button, listView, searchView);
                }
            }
        }
        throw new NullPointerException(C0032.m3232(C0064.m4545(m7058(), 0, 31, 2557), C0035.m3565(C0018.m1003(viewM3295), i)));
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7058() {
        if (C0074.m6454() < 0) {
            return f318short;
        }
        return null;
    }

    public C0358f(LinearLayout linearLayout, Button button, ListView listView, SearchView searchView) {
        this.a = linearLayout;
        this.b = button;
        this.c = listView;
        this.d = searchView;
    }
}
