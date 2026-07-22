package com.joke.plugin.gson;

import com.android.apksig.C0037;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0033;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.util.C0067;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldAttributes {
    private final Field field;

    /* JADX INFO: renamed from: ۟ۢ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Field m4924(Object obj) {
        if (C0020.m1385() < 0) {
            return ((FieldAttributes) obj).field;
        }
        return null;
    }

    public Object get(Object obj) {
        return C0067.m5443(m4924(this), obj);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) C0037.m3791(m4924(this), cls);
    }

    public Collection<Annotation> getAnnotations() {
        return C0021.m1596(C0019.m1317(m4924(this)));
    }

    public Class<?> getDeclaredClass() {
        return C0111.m13067(m4924(this));
    }

    public Type getDeclaredType() {
        return C0020.m1431(m4924(this));
    }

    public Class<?> getDeclaringClass() {
        return C0067.m5433(m4924(this));
    }

    public String getName() {
        return C0033.m3333(m4924(this));
    }

    public boolean hasModifier(int i) {
        return (i & C0066.m4843(m4924(this))) != 0;
    }

    public boolean isSynthetic() {
        return C0024.m1960(m4924(this));
    }

    public FieldAttributes(Field field) {
        C0027.m2407(field);
        this.field = field;
    }
}
