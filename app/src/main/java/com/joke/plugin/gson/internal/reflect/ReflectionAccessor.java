package com.joke.plugin.gson.internal.reflect;

import com.android.apksig.zip.C0032;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReflectionAccessor {
    private static final ReflectionAccessor instance;

    /* JADX INFO: renamed from: ۟ۡۥۦۤ, reason: not valid java name and contains not printable characters */
    public static ReflectionAccessor m5687() {
        if (C0078.m7450() > 0) {
            return instance;
        }
        return null;
    }

    public abstract void makeAccessible(AccessibleObject accessibleObject);

    public static ReflectionAccessor getInstance() {
        return m5687();
    }

    static {
        ReflectionAccessor unsafeReflectionAccessor;
        if (C0032.m3118() < 9) {
            unsafeReflectionAccessor = new PreJava9ReflectionAccessor();
        } else {
            unsafeReflectionAccessor = new UnsafeReflectionAccessor();
        }
        instance = unsafeReflectionAccessor;
    }
}
