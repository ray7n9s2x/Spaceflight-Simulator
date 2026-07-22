package com.zfork.multiplatforms.android.bomb;

import com.joke.plugin.gson.internal.reflect.C0069;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class W4 extends ArrayList {
    public static final /* synthetic */ int c = 0;
    public byte[] a;
    public boolean b;

    public static int a(ByteBuffer byteBuffer) {
        byte bM5826 = C0069.m5826(byteBuffer);
        int i = bM5826 & 255;
        if ((bM5826 & 128) != 0) {
            return ((bM5826 & 127) << 8) | (C0069.m5826(byteBuffer) & 255);
        }
        return i;
    }
}
