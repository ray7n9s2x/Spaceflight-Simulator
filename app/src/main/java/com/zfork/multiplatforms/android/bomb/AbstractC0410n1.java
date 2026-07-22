package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0035;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import j$.util.Objects;
import org.conscrypt.C0111;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0410n1 extends O4 {
    public final C0398l1 b;
    public final InterfaceC0464w2 c;

    /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7094(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۡ۟, reason: contains not printable characters */
    public static int m7095(Object obj) {
        if (C0019.m1311() == 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    public AbstractC0410n1(C0398l1 c0398l1) {
        C0035.m3514();
        C0030.m2964();
        l5 l5VarM7459 = C0078.m7459();
        this.b = c0398l1;
        this.c = l5VarM7459;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0410n1) {
            return m7094(C0031.m2987(this), C0031.m2987((AbstractC0410n1) obj));
        }
        return false;
    }

    public int hashCode() {
        return m7095(new Object[]{C0031.m2987(this)});
    }

    public final String toString() {
        return C0111.m13128(C0031.m2987(this));
    }
}
