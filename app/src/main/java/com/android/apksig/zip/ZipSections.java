package com.android.apksig.zip;

import com.android.apksig.internal.util.C0027;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ZipSections {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final ByteBuffer e;

    public long getZipCentralDirectoryOffset() {
        return C0072.m6164(this);
    }

    public int getZipCentralDirectoryRecordCount() {
        return C0077.m7169(this);
    }

    public long getZipCentralDirectorySizeBytes() {
        return C0027.m2421(this);
    }

    public ByteBuffer getZipEndOfCentralDirectory() {
        return C0068.m5680(this);
    }

    public long getZipEndOfCentralDirectoryOffset() {
        return C0066.m4861(this);
    }

    public ZipSections(long j, long j2, int i, long j3, ByteBuffer byteBuffer) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = byteBuffer;
    }
}
