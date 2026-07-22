package com.joke.plugin.gson.internal;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.reflect.C0072;
import java.lang.reflect.Type;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class Primitives {
    public static boolean isPrimitive(Type type) {
        return (type instanceof Class) && C0068.m5581((Class) type);
    }

    public static boolean isWrapperType(Type type) {
        return type == Integer.class || type == Float.class || type == Byte.class || type == Double.class || type == Long.class || type == Character.class || type == Boolean.class || type == Short.class || type == Void.class;
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        return cls == Integer.class ? C0072.m6191() : cls == Float.class ? C0068.m5567() : cls == Byte.class ? C0067.m5434() : cls == Double.class ? C0019.m1278() : cls == Long.class ? C0066.m4824() : cls == Character.class ? C0111.m13059() : cls == Boolean.class ? C0024.m2007() : cls == Short.class ? C0064.m4630() : cls == Void.class ? C0036.m3665() : cls;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        return cls == C0072.m6191() ? Integer.class : cls == C0068.m5567() ? Float.class : cls == C0067.m5434() ? Byte.class : cls == C0019.m1278() ? Double.class : cls == C0066.m4824() ? Long.class : cls == C0111.m13059() ? Character.class : cls == C0024.m2007() ? Boolean.class : cls == C0064.m4630() ? Short.class : cls == C0036.m3665() ? Void.class : cls;
    }

    private Primitives() {
    }
}
