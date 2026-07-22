package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0070;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class G1 implements FilenameFilter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f246short = {1847};
    public final /* synthetic */ String a;

    /* JADX INFO: renamed from: ۟۟ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m6931() {
        if (C0070.m5903() >= 0) {
            return f246short;
        }
        return null;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        StringBuilder sb = new StringBuilder();
        C0077.m7290(sb, C0036.m3698(this));
        C0077.m7290(sb, C0017.m936(m6931(), 0, 1, 1817));
        return C0019.m1242(str, C0068.m5536(sb));
    }

    public G1(String str) {
        this.a = str;
    }
}
