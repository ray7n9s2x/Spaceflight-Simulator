package com.zfork.multiplatforms.android.bomb;

import com.android.apksig.C0039;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.zfork.entry.C0075;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: com.zfork.multiplatforms.android.bomb.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0378i implements InterfaceC0464w2, FileVisitor {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f332short = {414, 401, 413, 405};
    public final FileVisitResult a;
    public final FileVisitResult b;

    /* JADX INFO: renamed from: ۠ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m7074(Object obj, Object obj2) {
        if (C0066.m4827() > 0) {
            return Objects.requireNonNull(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7075() {
        if (C0035.m3569() < 0) {
            return f332short;
        }
        return null;
    }

    @Override // java.nio.file.PathMatcher
    public final boolean matches(Path path) {
        return C0024.m2030((C0329a5) this, path) != C0035.m3514();
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        m7074(str, C0075.m6791(m7075(), 0, 4, 496));
        return C0073.m6437(C0027.m2458(new File(file, str)));
    }

    public AbstractC0378i() {
        FileVisitResult fileVisitResultM2964 = C0030.m2964();
        FileVisitResult fileVisitResultM3514 = C0035.m3514();
        this.a = fileVisitResultM2964;
        this.b = fileVisitResultM3514;
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        C0036.m3663(obj);
        return C0030.m2964();
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return C0024.m2030((C0329a5) this, C0039.m4113(obj));
    }

    public final String toString() {
        return C0032.m3134(C0030.m2951(this));
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return C0024.m2030((C0329a5) this, C0039.m4113(obj));
    }

    @Override // java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        C0036.m3663(obj);
        return C0030.m2964();
    }
}
