package com.zfork.multiplatforms.android.bomb;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.StefMorojna.SpaceflightSimulator.R;
import com.android.apksig.C0039;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0344d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f309short = {1241, 1277, 1255, 1255, 1277, 1274, 1267, 1204, 1254, 1265, 1253, 1249, 1277, 1254, 1265, 1264, 1204, 1250, 1277, 1265, 1251, 1204, 1251, 1277, 1248, 1276, 1204, 1245, 1232, 1198, 1204};
    public final ScrollView a;
    public final TextView b;
    public final EditText c;
    public final EditText d;
    public final Button e;
    public final Button f;
    public final Button g;
    public final Button h;

    public static C0344d a(LayoutInflater layoutInflater) {
        View viewM3295 = C0033.m3295(layoutInflater, R.attr.actionBarDivider, null, false);
        int i = 2130903061;
        TextView textView = (TextView) C0017.m922(viewM3295, 2130903061);
        if (textView != null) {
            i = 2130903063;
            EditText editText = (EditText) C0017.m922(viewM3295, 2130903063);
            if (editText != null) {
                i = 2130903064;
                EditText editText2 = (EditText) C0017.m922(viewM3295, 2130903064);
                if (editText2 != null) {
                    i = 2130903066;
                    Button button = (Button) C0017.m922(viewM3295, 2130903066);
                    if (button != null) {
                        i = 2130903067;
                        Button button2 = (Button) C0017.m922(viewM3295, 2130903067);
                        if (button2 != null) {
                            i = 2130903068;
                            Button button3 = (Button) C0017.m922(viewM3295, 2130903068);
                            if (button3 != null) {
                                i = 2130903071;
                                Button button4 = (Button) C0017.m922(viewM3295, 2130903071);
                                if (button4 != null) {
                                    return new C0344d((ScrollView) viewM3295, textView, editText, editText2, button, button2, button3, button4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(C0032.m3232(C0039.m4066(m7038(), 0, 31, 1172), C0035.m3565(C0018.m1003(viewM3295), i)));
    }

    /* JADX INFO: renamed from: ۧ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7038() {
        if (C0039.m4109() >= 0) {
            return f309short;
        }
        return null;
    }

    public C0344d(ScrollView scrollView, TextView textView, EditText editText, EditText editText2, Button button, Button button2, Button button3, Button button4) {
        this.a = scrollView;
        this.b = textView;
        this.c = editText;
        this.d = editText2;
        this.e = button;
        this.f = button2;
        this.g = button3;
        this.h = button4;
    }
}
