package com.zfork.multiplatforms.android.bomb;

import android.widget.SeekBar;
import android.widget.TextView;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.joke.plugin.gson.reflect.C0072;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0352e0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ DialogC0359f0 a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        TextView textViewM663 = C0016.m663(C0016.m628(this));
        if (textViewM663 != null) {
            C0019.m1180(textViewM663, C0078.m7464(C0072.m6201(seekBar)));
        }
    }

    public C0352e0(DialogC0359f0 dialogC0359f0) {
        this.a = dialogC0359f0;
    }
}
