package com.zfork.multiplatforms.android.bomb;

import android.view.View;
import android.widget.TextView;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0409n0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f346short = {2026, 2021, 2007, 2025, 2045, 2044, 2023, 2027, 2020, 2017, 2027, 2019, 2007, 2033, 2029, 2043, 2007, 2027, 2016, 2029, 2027, 2019, 2026, 2023, 2032, 1958, 2040, 2022, 2031, 1889, 1902, 1884, 1890, 1910, 1911, 1900, 1888, 1903, 1898, 1888, 1896, 1884, 1901, 1900, 1884, 1888, 1899, 1894, 1888, 1896, 1889, 1900, 1915, 1837, 1907, 1901, 1892};
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogC0421p0 b;

    public /* synthetic */ ViewOnClickListenerC0409n0(DialogC0421p0 dialogC0421p0, int i) {
        this.a = i;
        this.b = dialogC0421p0;
    }

    /* JADX INFO: renamed from: ۠ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7093() {
        if (C0077.m7272() < 0) {
            return f346short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0028.m2590(this)) {
            case 0:
                DialogC0421p0 dialogC0421p0M911 = C0017.m911(this);
                InterfaceC0415o0 interfaceC0415o0M4095 = C0039.m4095(dialogC0421p0M911);
                if (interfaceC0415o0M4095 != null) {
                    C0016.m668(interfaceC0415o0M4095, dialogC0421p0M911, 2);
                }
                if (!C0111.m13076(dialogC0421p0M911)) {
                    C0020.m1338(dialogC0421p0M911);
                }
                break;
            case 1:
                DialogC0421p0 dialogC0421p0M9112 = C0017.m911(this);
                InterfaceC0415o0 interfaceC0415o0M40952 = C0039.m4095(dialogC0421p0M9112);
                if (interfaceC0415o0M40952 != null) {
                    C0016.m668(interfaceC0415o0M40952, dialogC0421p0M9112, 3);
                }
                if (!C0111.m13076(dialogC0421p0M9112)) {
                    C0020.m1338(dialogC0421p0M9112);
                }
                break;
            case 2:
                DialogC0421p0 dialogC0421p0M9113 = C0017.m911(this);
                InterfaceC0415o0 interfaceC0415o0M40953 = C0039.m4095(dialogC0421p0M9113);
                if (interfaceC0415o0M40953 != null) {
                    C0016.m668(interfaceC0415o0M40953, dialogC0421p0M9113, 3);
                }
                if (!C0111.m13076(dialogC0421p0M9113)) {
                    C0020.m1338(dialogC0421p0M9113);
                }
                break;
            default:
                DialogC0421p0 dialogC0421p0M9114 = C0017.m911(this);
                boolean zM4651 = C0065.m4651(dialogC0421p0M9114);
                dialogC0421p0M9114.k = !zM4651;
                if (!zM4651) {
                    TextView textViewM3440 = C0034.m3440(dialogC0421p0M9114);
                    C0030.m2951(C0072.m6184());
                    C0039.m4132(textViewM3440, C0069.m5749(C0021.m1650(m7093(), 0, 29, 1928)), null, null, null);
                } else {
                    TextView textViewM34402 = C0034.m3440(dialogC0421p0M9114);
                    C0030.m2951(C0072.m6184());
                    C0039.m4132(textViewM34402, C0069.m5749(C0018.m1070(m7093(), 29, 28, 1795)), null, null, null);
                }
                break;
        }
    }
}
