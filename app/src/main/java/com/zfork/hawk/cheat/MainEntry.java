package com.zfork.hawk.cheat;

import com.android.apksig.util.C0031;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MainEntry {
    private static native Object hawkIoctl(int i, Object obj);

    /* JADX INFO: renamed from: ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m6900(int i, Object obj) {
        if (C0031.m3075() >= 0) {
            return hawkIoctl(i, obj);
        }
        return null;
    }

    public static void a(int i, Serializable serializable) {
        try {
            m6900(i, serializable);
        } catch (Throwable unused) {
        }
    }
}
