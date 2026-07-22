package com.zfork.multiplatforms.android.bomb;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.StefMorojna.SpaceflightSimulator.R;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0351e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f315short = {1445, 1409, 1435, 1435, 1409, 1414, 1423, 1480, 1434, 1421, 1433, 1437, 1409, 1434, 1421, 1420, 1480, 1438, 1409, 1421, 1439, 1480, 1439, 1409, 1436, 1408, 1480, 1441, 1452, 1490, 1480};
    public final ScrollView a;
    public final Button b;
    public final Button c;
    public final Button d;
    public final Button e;
    public final Button f;
    public final Button g;
    public final Button h;
    public final Button i;
    public final CheckBox j;
    public final CheckBox k;
    public final CheckBox l;
    public final CheckBox m;
    public final CheckBox n;
    public final CheckBox o;
    public final CheckBox p;
    public final CheckBox q;
    public final CheckBox r;
    public final CheckBox s;
    public final CheckBox t;
    public final CheckBox u;
    public final AutoCompleteTextView v;
    public final EditText w;
    public final TextView x;
    public final TextView y;

    public C0351e(ScrollView scrollView, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, AutoCompleteTextView autoCompleteTextView, EditText editText, TextView textView, TextView textView2) {
        this.a = scrollView;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = button4;
        this.f = button5;
        this.g = button6;
        this.h = button7;
        this.i = button8;
        this.j = checkBox;
        this.k = checkBox2;
        this.l = checkBox3;
        this.m = checkBox4;
        this.n = checkBox5;
        this.o = checkBox6;
        this.p = checkBox7;
        this.q = checkBox8;
        this.r = checkBox9;
        this.s = checkBox10;
        this.t = checkBox11;
        this.u = checkBox12;
        this.v = autoCompleteTextView;
        this.w = editText;
        this.x = textView;
        this.y = textView2;
    }

    public static C0351e a(LayoutInflater layoutInflater) {
        View viewM3295 = C0033.m3295(layoutInflater, (2132715947 ^ 6028) ^ m7045(C0065.m4755()), null, false);
        int i = R.array.assume_strong_biometrics_models;
        Button button = (Button) C0017.m922(viewM3295, R.array.assume_strong_biometrics_models);
        if (button != null) {
            i = R.array.crypto_fingerprint_fallback_prefixes;
            Button button2 = (Button) C0017.m922(viewM3295, R.array.crypto_fingerprint_fallback_prefixes);
            if (button2 != null) {
                i = R.array.crypto_fingerprint_fallback_vendors;
                Button button3 = (Button) C0017.m922(viewM3295, R.array.crypto_fingerprint_fallback_vendors);
                if (button3 != null) {
                    i = R.array.delay_showing_prompt_models;
                    Button button4 = (Button) C0017.m922(viewM3295, R.array.delay_showing_prompt_models);
                    if (button4 != null) {
                        i = 2130903045;
                        Button button5 = (Button) C0017.m922(viewM3295, 2130903045);
                        if (button5 != null) {
                            i = 2130903046;
                            Button button6 = (Button) C0017.m922(viewM3295, 2130903046);
                            if (button6 != null) {
                                i = 2130903047;
                                Button button7 = (Button) C0017.m922(viewM3295, 2130903047);
                                if (button7 != null) {
                                    i = 2130903048;
                                    Button button8 = (Button) C0017.m922(viewM3295, 2130903048);
                                    if (button8 != null) {
                                        i = 2130903049;
                                        CheckBox checkBox = (CheckBox) C0017.m922(viewM3295, 2130903049);
                                        if (checkBox != null) {
                                            i = 2130903050;
                                            CheckBox checkBox2 = (CheckBox) C0017.m922(viewM3295, 2130903050);
                                            if (checkBox2 != null) {
                                                i = 2130903051;
                                                CheckBox checkBox3 = (CheckBox) C0017.m922(viewM3295, 2130903051);
                                                if (checkBox3 != null) {
                                                    i = 2130903052;
                                                    CheckBox checkBox4 = (CheckBox) C0017.m922(viewM3295, 2130903052);
                                                    if (checkBox4 != null) {
                                                        i = 2130903053;
                                                        CheckBox checkBox5 = (CheckBox) C0017.m922(viewM3295, 2130903053);
                                                        if (checkBox5 != null) {
                                                            i = 2130903054;
                                                            CheckBox checkBox6 = (CheckBox) C0017.m922(viewM3295, 2130903054);
                                                            if (checkBox6 != null) {
                                                                i = 2130903055;
                                                                CheckBox checkBox7 = (CheckBox) C0017.m922(viewM3295, 2130903055);
                                                                if (checkBox7 != null) {
                                                                    i = 2130903056;
                                                                    CheckBox checkBox8 = (CheckBox) C0017.m922(viewM3295, 2130903056);
                                                                    if (checkBox8 != null) {
                                                                        i = 2130903057;
                                                                        CheckBox checkBox9 = (CheckBox) C0017.m922(viewM3295, 2130903057);
                                                                        if (checkBox9 != null) {
                                                                            i = 2130903058;
                                                                            CheckBox checkBox10 = (CheckBox) C0017.m922(viewM3295, 2130903058);
                                                                            if (checkBox10 != null) {
                                                                                i = 2130903059;
                                                                                CheckBox checkBox11 = (CheckBox) C0017.m922(viewM3295, 2130903059);
                                                                                if (checkBox11 != null) {
                                                                                    i = 2130903060;
                                                                                    CheckBox checkBox12 = (CheckBox) C0017.m922(viewM3295, 2130903060);
                                                                                    if (checkBox12 != null) {
                                                                                        i = 2130903062;
                                                                                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) C0017.m922(viewM3295, 2130903062);
                                                                                        if (autoCompleteTextView != null) {
                                                                                            i = 2130903065;
                                                                                            EditText editText = (EditText) C0017.m922(viewM3295, 2130903065);
                                                                                            if (editText != null) {
                                                                                                i = 2130903073;
                                                                                                TextView textView = (TextView) C0017.m922(viewM3295, 2130903073);
                                                                                                if (textView != null) {
                                                                                                    i = 2130903074;
                                                                                                    TextView textView2 = (TextView) C0017.m922(viewM3295, 2130903074);
                                                                                                    if (textView2 != null) {
                                                                                                        return new C0351e((ScrollView) viewM3295, button, button2, button3, button4, button5, button6, button7, button8, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12, autoCompleteTextView, editText, textView, textView2);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(C0032.m3232(C0070.m5942(m7046(), 0, 31, 1512), C0035.m3565(C0018.m1003(viewM3295), i)));
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7045(Object obj) {
        if (C0030.m2940() > 0) {
            return C0032.m3236(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۦۧ, reason: contains not printable characters */
    public static short[] m7046() {
        if (C0068.m5678() >= 0) {
            return f315short;
        }
        return null;
    }
}
