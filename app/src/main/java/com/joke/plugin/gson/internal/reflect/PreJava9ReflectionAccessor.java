package com.joke.plugin.gson.internal.reflect;

import com.android.apksig.zip.C0035;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes3.dex */
final class PreJava9ReflectionAccessor extends ReflectionAccessor {
    @Override // com.joke.plugin.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        C0035.m3619(accessibleObject, true);
    }
}
